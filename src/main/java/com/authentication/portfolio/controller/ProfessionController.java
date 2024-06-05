package com.authentication.portfolio.controller;

import org.springframework.web.bind.annotation.RestController;

import com.authentication.portfolio.model.Profession;
import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController()
@RequestMapping(value = "api/profession")
public class ProfessionController {

    @GetMapping()
    public Profession getInfo(@RequestParam(value = "language", defaultValue = "en") String language)
            throws StreamReadException, DatabindException, IOException {
        ObjectMapper mapper = new ObjectMapper();
        File file;
        file = ResourceUtils.getFile("classpath:api/" + language + "/profession.json");
        InputStream is = new FileInputStream(file);
        final Profession result = mapper.readValue(is, Profession.class);
        return result;
    }

}
