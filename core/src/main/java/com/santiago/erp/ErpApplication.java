package com.santiago.erp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ErpApplication {

    public static void main(String[] args) {
        System.setProperty("spring.profiles.active", "dev");
        SpringApplication.run(ErpApplication.class, args);
    }

    @Autowired
    ItemRepository itemRepository;

    @GetMapping("/items")
    public Iterable<ItemDO> items() {
        return itemRepository.findAll();
    }

}
