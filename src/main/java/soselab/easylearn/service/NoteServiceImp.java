package soselab.easylearn.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import soselab.easylearn.model.Note;
import soselab.easylearn.repository.NoteRepository;

@Service
public class NoteServiceImp implements NoteService{
    @Autowired
    private NoteRepository noteRepository;

    @Override
    public void addNote(Note note) {
        noteRepository.save(note);
    }
}
