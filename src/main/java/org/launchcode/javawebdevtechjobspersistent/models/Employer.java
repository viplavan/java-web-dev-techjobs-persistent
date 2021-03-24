package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Employer extends AbstractEntity {

    @NotNull(message = "Please specify a valid location")
    @Size(max = 50, message = "This location is too long. Try a shorter term.")
    private String location;

    @JoinColumn
    @OneToMany
    private List<Job> jobs= new ArrayList<>();

    public Employer(String location, List<Job> jobs) {
        this.location = location;
        this.jobs = jobs;
    }

    public Employer() {

    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<Job> getJobs() {
        return jobs;
    }

    public void setJobs(List<Job> jobs) {
        this.jobs = jobs;
    }
}
