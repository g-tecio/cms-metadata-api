package com.cwgx.metadata.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cwgx.metadata.models.Language;

@RestController
public class LanguageResource {

    @RequestMapping(path = "/languages", method = RequestMethod.GET)
    public List<Language> listLambdaLanguages() {
        return Arrays.asList(new Language("node"), new Language("java"), new Language("python"));
    }

}