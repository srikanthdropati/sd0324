package com.pos.tool.data;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class BrandsRepository() {

    private final static List<Brand> brandsList = List.of(
        new Brand("Ladder", 1.99, true, true, false),
        new Brand("Chainsaw", 1.49, true, false, true),
        new Brand("Jackhammer", 2.99, true, false, false)
    );

    public List<Brand> getAll(){
        return brandsList;
    }

    public Optional<Brand> findByBrandName(final String brandName){
        return brandsList.stream().filter(br -> br.getBrandName().equals(brandName)).findFirst();
    }
}
