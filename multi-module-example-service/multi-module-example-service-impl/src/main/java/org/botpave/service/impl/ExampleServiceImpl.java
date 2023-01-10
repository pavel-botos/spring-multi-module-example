package org.botpave.service.impl;

import org.botpave.service.api.ExampleService;
import org.springframework.stereotype.Service;

@Service
public class ExampleServiceImpl implements ExampleService {
    @Override
    public String getExampleServiceMessage() {
        return "ExampleService message 1";
    }
}
