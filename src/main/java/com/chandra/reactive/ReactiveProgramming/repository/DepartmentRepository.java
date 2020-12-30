package com.chandra.reactive.ReactiveProgramming.repository;

import com.chandra.reactive.ReactiveProgramming.model.Department;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Mono;

public interface DepartmentRepository extends ReactiveCrudRepository<Department,Integer> {
    Mono<Department> findByUserId(Integer userId);
}
