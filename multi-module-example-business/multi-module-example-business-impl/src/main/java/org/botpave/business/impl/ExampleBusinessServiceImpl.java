package org.botpave.business.impl;

import org.botpave.business.api.ExampleBusinessService;
import org.botpave.service.api.ExampleService;
import org.springframework.stereotype.Service;

@Service
public class ExampleBusinessServiceImpl implements ExampleBusinessService {

    private final ExampleService exampleService;

    public ExampleBusinessServiceImpl(ExampleService exampleService) {
        this.exampleService = exampleService;
    }

    @Override
    public String getExampleBusinessServiceMessage() {
        return String.format("Example Business Service Message 1 - %s", exampleService.getExampleServiceMessage());
    }
}
