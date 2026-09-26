package job_internship_platform.service;

import java.util.List;
import job_internship_platform.entity.Job;
import org.springframework.stereotype.Service;

@Service
public class JobService {
    public List<Job> getAllJobs() {
        return Job.jobs;
    }
}
