package com.devian.todolist.backend;


import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TodoService {

    @Autowired
    private final TodoRepository repository;

    public List<TodoModel> getAllTodos() {return repository.findAll();}

    public TodoModel saveEmployee(TodoModel todoModel) {return repository.save(todoModel);}

    public TodoModel getTodoById(Long id) {return repository.findById(id).orElse(null);}

    public void deleteTodo(Long id) {repository.deleteById(id);}
}
