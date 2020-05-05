package com.example.laboratorio3.repository;

import com.example.laboratorio3.entity.JobHistory;
import org.hibernate.metamodel.model.convert.spi.JpaAttributeConverter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobHistoryRepository extends JpaRepository<JobHistory,Integer> {


}
