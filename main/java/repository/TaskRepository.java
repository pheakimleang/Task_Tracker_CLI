package main.java.repository;

import main.java.model.Task;

import java.io.IOException;
import java.util.Set;
public interface TaskRepository {
    void saveTask(Set<Task> tasks) throws IOException;
    Set<Task> getTasks() throws IOException;
}
