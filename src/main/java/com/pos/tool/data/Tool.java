package com.pos.tool.data;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Tool{
    private String toolCode, toolType, brand;
}
