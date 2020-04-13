package com.demo.tasklist.Controller;

import com.demo.tasklist.Model.OneTask;
import com.demo.tasklist.Repository.TaskListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/tasks")
public class HomeController {

    @Autowired
    private TaskListRepository repository;
    @PostMapping()
    public void SetNewTask(@Valid @RequestBody OneTask oneTask){
        repository.save(oneTask);
    }

    @GetMapping()
    public List<OneTask> GetAllTasks()
    {
        return repository.findAll();
    }




}
