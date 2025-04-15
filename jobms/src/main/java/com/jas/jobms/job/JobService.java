package com.jas.jobms.job;

import com.jas.jobms.job.dto.JobDto;

import java.util.List;

public interface JobService {
    List<JobDto> findAll();
    JobDto getJobById(Long id);
    boolean deleteJobById(Long id);
    boolean updateJob(Long id, Job updatedJob);
    void addJob(Job job);
}
