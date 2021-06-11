package com.launchacademy.springeditanddelete.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {
  @GetMapping(value = {"/contractors", "/additional-path"})
  public String forward() {
    return "forward:/";
  }
}