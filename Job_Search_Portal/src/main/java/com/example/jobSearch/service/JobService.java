package com.example.jobSearch.service;

import com.example.jobSearch.model.Job;
import com.example.jobSearch.model.Type;
import com.example.jobSearch.repository.IJobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class JobService {

    @Autowired
    IJobRepo jobRepo;

    public List<Job> getAllJobs() {
        return (List<Job>) jobRepo.findAll();
    }

    public String addJobs(List<Job> jobList) {
        jobRepo.saveAll(jobList);
        return jobList.size() + " Jobs Added!!!";
    }

    public Object getJobById(Long id) {
        Job job = jobRepo.findById(id).orElse(null);

        if(job == null)
        {
            return "Job with " + id + " not found!!!";
        }
        return job;
    }

    public String deleteJob(Long id) {
        jobRepo.deleteById(id);
        return "Job with id " + id + " deleted!!!";
    }

    public List<Job> findByTitle(String title) {
        return jobRepo.findByTitle(title);
    }

    public List<Job> findByDescription(String description) {
        return jobRepo.findByDescription(description);
    }

    public String updateById(Long id, Job job) {
        Job existingJob = jobRepo.findById(id).orElse(null);
        if (existingJob != null)
        {
            existingJob.setTitle(job.getTitle());
            existingJob.setDescription(job.getDescription());
            existingJob.setLocation(job.getLocation());
            existingJob.setSalary(job.getSalary());
            existingJob.setCompanyEmail(job.getCompanyEmail());
            existingJob.setCompanyName(job.getCompanyName());
            existingJob.setEmployerName(job.getEmployerName());
            existingJob.setJobType(job.getJobType());
            existingJob.setAppliedDate(job.getAppliedDate());
            jobRepo.save(existingJob);
            return "Job updated with ID: " + existingJob.getId();
        }
        return "Job with ID: " + id + " not found!!!";
    }


}
