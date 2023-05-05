package com.dwisulfahnur.simplenotes.implement;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dwisulfahnur.simplenotes.entity.Note;
import com.dwisulfahnur.simplenotes.repository.NoteRepository;
import com.dwisulfahnur.simplenotes.service.NoteService;

@Service
public class NoteServiceImpl implements NoteService {

    @Autowired
    NoteRepository noteRepository;

    @Override
    public List<Note> findAll() {
        return noteRepository.findAll();
    }

    @Override
    public Note findById(UUID id) {
        return noteRepository.getReferenceById(id);
    }

    @Override
    public Note update(UUID id, Note note) {
        note.getId();
        return noteRepository.save(note);
    }

    @Override
    public Note create(Note note) {
        return noteRepository.save(note);
    }

    @Override
    public void delete(UUID id) {
        noteRepository.deleteById(id);
    }
}
