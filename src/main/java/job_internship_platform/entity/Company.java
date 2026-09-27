package job_internship_platform.entity;

import java.util.ArrayList;
import java.util.List;

public class Company {
    private int id;
    private String name;
    private String website;
    private String location;
    private String industry;

    public Company(int id, String name, String website, String location, String industry) {
        this.id = id;
        this.name = name;
        this.website = website;
        this.location = location;
        this.industry = industry;
    }

    public static List<Company> companies = new ArrayList<>();
    static {
        companies.add(new Company(1, "Google", "https://www.google.com", "Mountain View", "Technology"));
        companies.add(new Company(2, "Microsoft", "https://www.microsoft.com", "Redmond", "Technology"));
        companies.add(new Company(3, "Facebook", "https://www.facebook.com", "Menlo Park", "Technology"));
        companies.add(new Company(4, "Amazon", "https://www.amazon.com", "Seattle", "Technology"));
        companies.add(new Company(5, "Netflix", "https://www.netflix.com", "Los Gatos", "Technology"));
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getWebsite() {
        return website;
    }

    public String getLocation() {
        return location;
    }

    public String getIndustry() {
        return industry;
    }

}
