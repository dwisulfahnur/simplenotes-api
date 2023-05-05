package com.dwisulfahnur.simplenotes.service;

import java.util.List;
import java.util.UUID;

import com.dwisulfahnur.simplenotes.entity.Note;

public interface NoteService {
    List<Note> findAll();

    Note findById(UUID id);

    Note update(UUID id, Note note);

    Note create(Note note);

    void delete(UUID id);
}
