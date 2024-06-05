package com.authentication.portfolio.controller;

import org.springframework.web.bind.annotation.RestController;

import com.authentication.portfolio.model.JobExperience;
import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.TypeFactory;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController()
@RequestMapping(value = "api/job-experience")
public class JobExperienceController {

    @GetMapping()
    public List<JobExperience> getAll(@RequestParam(value = "language", defaultValue = "en") String language)
            throws StreamReadException, DatabindException, IOException {
        ObjectMapper mapper = new ObjectMapper();
        File file;
        file = ResourceUtils.getFile("classpath:api/" + language + "/job_experience.json");
        InputStream is = new FileInputStream(file);
        final List<JobExperience> result = mapper.readValue(is,
                TypeFactory.defaultInstance().constructCollectionType(List.class, JobExperience.class));
        return result;
    }

}
