package com.authentication.portfolio.controller;

import org.springframework.web.bind.annotation.RestController;

import com.authentication.portfolio.model.Info;
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
@RequestMapping(value = "api/info")
public class InfoController {

    @GetMapping()
    public Info getInfo(@RequestParam(value = "language", defaultValue = "en") String language)
            throws StreamReadException, DatabindException, IOException {
        ObjectMapper mapper = new ObjectMapper();
        File file;
        file = ResourceUtils.getFile("classpath:api/" + language + "/info.json");
        InputStream is = new FileInputStream(file);
        final Info result = mapper.readValue(is, Info.class);
        return result;
    }

}
