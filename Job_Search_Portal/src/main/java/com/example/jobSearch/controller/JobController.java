package com.example.jobSearch.controller;

import com.example.jobSearch.model.Job;
import com.example.jobSearch.model.Type;
import com.example.jobSearch.service.JobService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@Validated
@RequestMapping("jobs")
public class JobController {

    @Autowired
    JobService jobService;

    @GetMapping("/all")
    public List<Job> getAllJobs()
    {
        return jobService.getAllJobs();
    }

    @PostMapping("/add")
    public String addJobs(@RequestBody List<Job> jobList)
    {
        return jobService.addJobs(jobList);
    }

    @GetMapping("/{id}")
    public Object getJobById(@PathVariable Long id){
        return jobService.getJobById(id);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteJob(@PathVariable Long id){
        return jobService.deleteJob(id);
    }


    @GetMapping("/search/title")
    public List<Job> findByTitle(@RequestParam String title){
        return jobService.findByTitle(title);
    }

    @GetMapping("/search/desc")
    public List<Job> findByDescription(@RequestParam String description){
        return jobService.findByDescription(description);
    }

    @PutMapping("/update/{id}")
    public String updateById(@PathVariable Long id ,@Valid @RequestBody  Job job)
    {
        return jobService.updateById(id , job);
    }
}
