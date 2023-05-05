package com.dwisulfahnur.simplenotes.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dwisulfahnur.simplenotes.entity.Note;
import com.dwisulfahnur.simplenotes.service.NoteService;
import com.dwisulfahnur.simplenotes.utils.Response;

@RestController
@RequestMapping(value = "notes")
public class NoteController {
    @Autowired
    NoteService noteService;

    @PostMapping
    ResponseEntity<Response<Note>> create(@RequestBody @Validated Note note) {
        Response<Note> response = new Response<Note>();
        response.setMessage("Note created");
        response.setData(noteService.create(note));
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .contentType(MediaType.APPLICATION_JSON)
                .body(response);
    }

    @PutMapping("/{id}")
    ResponseEntity<Response<Note>> update(@PathVariable("id") UUID id, @RequestBody @Validated Note note) {
        Response<Note> response = new Response<Note>();
        response.setMessage("Note updated");
        response.setData(noteService.update(id, note));
        return ResponseEntity
                .status(HttpStatus.OK)
                .contentType(MediaType.APPLICATION_JSON)
                .body(response);
    }

    @GetMapping("/{id}")
    ResponseEntity<Response<Note>> getById(@PathVariable("id") UUID id) {
        Response<Note> response = new Response<Note>();
        response.setData(noteService.findById(id));
        return ResponseEntity
                .status(HttpStatus.OK)
                .contentType(MediaType.APPLICATION_JSON)
                .body(response);
    }

    @GetMapping
    ResponseEntity<Response<List<Note>>> findAll() {
        Response<List<Note>> response = new Response<List<Note>>();
        response.setMessage(null);
        response.setData(noteService.findAll());
        return ResponseEntity
                .status(HttpStatus.OK)
                .contentType(MediaType.APPLICATION_JSON)
                .body(response);
    }

    @DeleteMapping("/{id}")
    ResponseEntity<Response> deleteById(@PathVariable("id") UUID id) {
        Response response = new Response<>();
        response.setMessage("Note deleted");
        noteService.delete(id);
        // response.setData(null);
        return ResponseEntity.noContent().build();
    }
}
