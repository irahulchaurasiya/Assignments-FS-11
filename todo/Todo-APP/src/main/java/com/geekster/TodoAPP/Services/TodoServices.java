package com.geekster.TodoAPP.Services;

import com.geekster.TodoAPP.entity.Todo;
import com.geekster.TodoAPP.repository.TodoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;

@Service
public class TodoServices {

    @Autowired
    TodoRepo todoRepo;
    public List<Todo> getAllTodos()
    {
        return todoRepo.getMyTodos();
    }

    public List<Todo> getAllDoneTodos()
    {
        List<Todo> doneTodos = new ArrayList<>();
        for(Todo myTodo : todoRepo.getMyTodos())
        {
            if(myTodo.isTodoDoneStatus())
            {
                doneTodos.add(myTodo);
            }
        }
        return doneTodos;
    }

    public List<Todo> getAllUnDoneTodos()
    {
        List<Todo> unDoneTodos = new ArrayList<>();
        for(Todo myTodo : todoRepo.getMyTodos())
        {
            if(!myTodo.isTodoDoneStatus())
            {
                unDoneTodos.add(myTodo);
            }
        }
        return unDoneTodos;
    }

    public String addTodo(Todo myTodo)
    {
        todoRepo.add(myTodo);
        return "Todo added";
    }

    public String updateTodoStatus(Integer todoId, boolean status)
    {
        for(Todo myTodo : todoRepo.getMyTodos())
        {
            if(myTodo.getTodoId().equals(todoId))
            {
                myTodo.setTodoDoneStatus(status);
                return "todo updated for todo ID:" + todoId;
            }
        }

        return "todo not found todo ID: " + todoId;
    }

    public String deleteTodo(Integer todoId)
    {
        for(Todo myTodo : todoRepo.getMyTodos())
        {
            if(myTodo.getTodoId().equals(todoId))
            {
                todoRepo.delete(myTodo);
                return "todo removed for todo ID:" + todoId;
            }
        }
        return "todo :" + todoId + " not deleted as it doesn't exist" ;
    }
}
