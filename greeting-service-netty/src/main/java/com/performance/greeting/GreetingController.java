// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
package com.performance.greeting;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @GetMapping("/hello")
    public String helloWorld() {
        return "Greetings from WebFlux";
    }
}
