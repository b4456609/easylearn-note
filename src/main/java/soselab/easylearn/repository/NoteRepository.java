package soselab.easylearn.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import soselab.easylearn.model.Note;

public interface NoteRepository extends MongoRepository<Note, String> {
}
