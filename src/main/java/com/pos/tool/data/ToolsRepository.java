package com.pos.tool.data;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ToolsRepository {

    private static final List<Tool> toolsRepo = List.of(
            new Tool("CHNS", "Chainsaw", "Stihl"),
            new Tool("LADW", "Ladder", "Werner"),
            new Tool("JAKD", "Jackhammer", "DeWalt"),
            new Tool("JAKR", "Jackhammer", "Ridgid")
    );

    public List<Tool> getAll(){
        return toolsRepo;
    }

    public Optional<Tool> findByToolCode(final String toolCode){
        return toolsRepo.stream().filter(e -> e.getToolCode().equals(toolCode)).findFirst();
    }
}
