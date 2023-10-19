package com.geekster.TodoAPP.controller;

import com.geekster.TodoAPP.Services.TodoServices;
import com.geekster.TodoAPP.entity.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TodoController {

    @Autowired
    TodoServices todoServices;


//    public TodoController() {
//
//    }

    @GetMapping("todos")
    public List<Todo> getAllTodos()
    {
        return todoServices.getAllTodos();
    }

    @GetMapping("todo/done")
    public List<Todo> getDoneTodos()
    {
        return todoServices.getAllDoneTodos();
    }

    @GetMapping("todo/undone")
    public List<Todo> getNotDoneTodos()
    {
        return todoServices.getAllUnDoneTodos();
    }

    @PostMapping("todo")
    public String addTodo(@RequestBody Todo todo)
    {
        return todoServices.addTodo(todo);
    }

    @PutMapping("todo/{todoId}/{status}")
    public String markTodo(@PathVariable Integer todoId,@PathVariable boolean status)
    {
        return todoServices.updateTodoStatus(todoId , status);
    }

    @DeleteMapping("todo")
    public String removeTodo(@RequestParam Integer todoId)
    {
        return todoServices.deleteTodo(todoId);
    }


}
