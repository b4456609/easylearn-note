package soselab.easylearn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import soselab.easylearn.model.Note;
import soselab.easylearn.service.NoteService;

@RestController
public class NoteController {

    @Autowired
    NoteService noteService;

    @RequestMapping(path = "/", method = RequestMethod.POST)
    public void addNote(Note note){
        noteService.addNote(note);
    }
}
