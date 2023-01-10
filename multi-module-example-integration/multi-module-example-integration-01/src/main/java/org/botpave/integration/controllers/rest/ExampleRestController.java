package org.botpave.integration.controllers.rest;

import org.botpave.business.api.ExampleBusinessService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/")
public class ExampleRestController {

    private final ExampleBusinessService exampleBusinessService;

    public ExampleRestController(ExampleBusinessService exampleBusinessService) {
        this.exampleBusinessService = exampleBusinessService;
    }

    @GetMapping
    public ResponseEntity<String> getMessage() {
        return ResponseEntity.ok(exampleBusinessService.getExampleBusinessServiceMessage());
    }
}
