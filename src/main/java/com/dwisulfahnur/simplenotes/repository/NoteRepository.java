package com.dwisulfahnur.simplenotes.repository;

import com.dwisulfahnur.simplenotes.entity.Note;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

public interface NoteRepository extends JpaRepository<Note, UUID> {

}
