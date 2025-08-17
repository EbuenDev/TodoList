package com.devian.todolist.backend;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.swing.text.html.Option;
import java.util.Optional;

@Repository
public interface TodoRepository extends JpaRepository<TodoModel, Long> {

}
