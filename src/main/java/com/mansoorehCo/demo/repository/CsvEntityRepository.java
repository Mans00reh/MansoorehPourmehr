package com.mansoorehCo.demo.repository;

import com.mansoorehCo.demo.entity.CsvEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CsvEntityRepository extends CrudRepository<CsvEntity, Long> {
    CsvEntity findByCode(Long code);
}
