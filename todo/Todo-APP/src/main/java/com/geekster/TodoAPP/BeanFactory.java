package com.geekster.TodoAPP;

import com.geekster.TodoAPP.entity.Todo;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class BeanFactory {

    @Bean
    public List<Todo> getAllTodos()
    {
        return new ArrayList<>();
    }
}
