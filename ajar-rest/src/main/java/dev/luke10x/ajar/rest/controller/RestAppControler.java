package dev.luke10x.ajar.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.luke10x.ajar.shared.Api;

@RestController
public class RestAppControler {
  @GetMapping("/fs")
  
  public String getss() {
    var api = new Api();  
    return "Spring calls shared library: " + api.getMagicPhrase();
  }
}
