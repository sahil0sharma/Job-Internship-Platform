package job_internship_platform.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import job_internship_platform.entity.Job;
import job_internship_platform.service.JobService;

@RestController
public class JobController {

    JobService jobService = new JobService();

    @GetMapping("/jobs")
    public List<Job> getAllJobs() {
        return jobService.getAllJobs();
    }
}
