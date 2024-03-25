package com.pos.tool.services;

import com.pos.tool.data.BrandsRepository;
import com.pos.tool.data.ToolsRepository;
import com.pos.tool.domain.request.POSRequest;
import com.pos.tool.exceptions.POSCustomException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class CheckOutService {

    private final ToolsRepository toolsRepository;
    private final BrandsRepository brandsRepository;

    public CheckOutService(ToolsRepository toolsRepository, BrandsRepository brandsRepository){
        this.brandsRepository = brandsRepository;
        this.toolsRepository = toolsRepository;
    }

    public String checkout(final POSRequest posRequest) throws POSCustomException{

        if(toolsRepository.findByToolCode(posRequest.getToolCode()).isEmpty()){
            throw new POSCustomException("RESOURCE_NOT_FOUND");
        }

        return null;
    }
}
