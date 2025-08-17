package com.devian.todolist.backend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/todo-list")
public class TodoController {

    @Autowired
    private final TodoService service;


    public TodoController(TodoService service) {
        this.service = service;
    }

    @GetMapping
    public List<TodoModel> getAllTodos() {return service.getAllTodos();}


    @GetMapping("/{id}")
    public ResponseEntity<TodoModel> getTodoById(@PathVariable Long id) {
        return ResponseEntity.ok(service.getTodoById(id));}
}
