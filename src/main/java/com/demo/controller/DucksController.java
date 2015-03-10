package com.demo.controller;

import com.demo.domain.Duck;
import com.wordnik.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static com.google.common.collect.ImmutableList.of;
import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
@RequestMapping("/ducks")
@Api(value = "/ducks", description = "this is a api to query all ducks.")
public class DucksController {

    @RequestMapping(method = GET)
    public List<Duck> list() {
        return of(new Duck("Billy", "RED"), new Duck("Ke, Xiang", "BLACK"));
    }

}
