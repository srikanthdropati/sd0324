package com.pos.tool.domain.response;

import lombok.Data;

@Data
public class POSExceptionResponse {

    private String errorMsg;
    private String requestedURI;
}
