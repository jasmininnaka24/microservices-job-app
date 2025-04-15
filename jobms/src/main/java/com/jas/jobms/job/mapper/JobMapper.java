package com.jas.jobms.job.mapper;

import com.jas.jobms.job.Job;
import com.jas.jobms.job.dto.JobDto;
import com.jas.jobms.job.external.Company;
import com.jas.jobms.job.external.Review;

import java.util.List;

public class JobMapper {
    public static JobDto mapToJobWithCompanyDTO(Job job, Company company, List<Review> reviews){
    JobDto jobDto = new JobDto();
    jobDto.setId(job.getId());
    jobDto.setTitle(job.getTitle());
    jobDto.setDescription(job.getDescription());
    jobDto.setMinSalary(job.getMinSalary());
    jobDto.setMaxSalary(job.getMaxSalary());
    jobDto.setLocation(job.getLocation());
    jobDto.setCompany(company);
    jobDto.setReviews(reviews);

    return jobDto;
    }
}
