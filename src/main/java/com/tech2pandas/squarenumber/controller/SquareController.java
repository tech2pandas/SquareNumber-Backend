package com.tech2pandas.squarenumber.controller;

import org.json.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SquareController {

    @GetMapping("/square/{input}")
    public String square(@PathVariable String input) {
        JSONObject jo = new JSONObject();
        try {
            Integer number= Integer.parseInt(input);
            jo.put("data", number * number);
            return jo.toString();
        } catch(NumberFormatException nfe) {
            jo.put("error", "Error while parsing input. Make sure the input is an integer");
            return jo.toString();
        }
    }
}
