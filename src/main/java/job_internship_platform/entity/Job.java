package job_internship_platform.entity;

import java.util.ArrayList;
import java.util.List;

public class Job {
    private int id;
    private String title;
    private String company;

    public Job(int id, String title, String company){
        this.id = id;
        this.title = title;
        this.company = company;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getCompany() {
        return company;
    }

    public static List<Job> jobs = new ArrayList<>();
    
    static {
        jobs.add(new Job(1, "Software Engineer", "Google"));
        jobs.add(new Job(2, "Data Scientist", "Microsoft"));
        jobs.add(new Job(3, "Product Manager", "Facebook"));
        jobs.add(new Job(4, "Software Engineer", "Amazon"));
        jobs.add(new Job(5, "Data Scientist", "Netflix"));
    }
}
