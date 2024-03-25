package com.pos.tool.controllers;

import com.pos.tool.domain.request.POSRequest;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class POSToolController {

    /**
     * This is the main operation. Restful endpoint.
     *
     * @param posRequest - Request Object to accept service invocation input
     * @return response object
     */
    @PostMapping(value = "/checkout", consumes = "application/json")
    public String checkout(@Valid @RequestBody POSRequest posRequest){


        return null;
    }
}
