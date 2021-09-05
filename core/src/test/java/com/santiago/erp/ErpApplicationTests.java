package com.santiago.erp;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles("dev")
class ErpApplicationTests {

    @Autowired
    ItemRepository itemRepository;

    @Test
    void contextLoads() {
        ItemDO itemDO = new ItemDO();
        itemDO.setName("滑板鞋");
        itemDO.setBrand("VANS");
        itemDO.setDescription("经典款，黑色");
        itemDO.setTag("出差,旅行");
        itemDO.setCreateAt(System.currentTimeMillis());
        itemRepository.save(itemDO);
    }

}
