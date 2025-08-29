package com.example.todolist.controller;

import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.example.todolist.model.Task;
import com.example.todolist.repository.TaskRepository;

@RestController
@RequestMapping("/api/tasks")
@CrossOrigin(origins = "*")
public class TaskController {

    private final TaskRepository repo;

    public TaskController(TaskRepository repo) {
        this.repo = repo;
    }

    @GetMapping
    public List<Task> getAllTasks() {
        return repo.findAll();
    }

    @PostMapping
    public Task createTask(@RequestBody Task task) {
        return repo.save(task);
    }

    @PutMapping("/{id}")
    public Task updateTask(@PathVariable Long id, @RequestBody Task updated) {
        return repo.findById(id).map(task -> {
            task.setTaskDesc(updated.getTaskDesc());
            task.setPriority(updated.getPriority());
            task.setMarkThisTask(updated.isMarkThisTask());
            return repo.save(task);
        }).orElseThrow();
    }

    @DeleteMapping("/{id}")
    public void deleteTask(@PathVariable Long id) {
        repo.deleteById(id);
    }

    @GetMapping("/priority/{level}")
    public List<Task> getTasksByPriority(@PathVariable String level) {
        return repo.findByPriority(level.toUpperCase());
    }
}