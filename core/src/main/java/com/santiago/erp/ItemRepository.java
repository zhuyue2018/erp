package com.santiago.erp;

import org.springframework.data.repository.CrudRepository;

public interface ItemRepository extends CrudRepository<ItemDO, Integer> {
    @Override
    <S extends ItemDO> S save(S s);
}
