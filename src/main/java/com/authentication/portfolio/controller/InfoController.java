package com.authentication.portfolio.controller;

import org.springframework.web.bind.annotation.RestController;

import com.authentication.portfolio.model.Info;
import com.authentication.portfolio.utils.Utils;
import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import java.io.IOException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController()
@RequestMapping(value = "api/info")
public class InfoController {

    @GetMapping()
    public Info getInfo(@RequestParam(value = "language", defaultValue = "en") String language)
            throws StreamReadException, DatabindException, IOException {
        return Utils.readAndConvert("api/" + language + "/info.json", Info.class);
    }

}
