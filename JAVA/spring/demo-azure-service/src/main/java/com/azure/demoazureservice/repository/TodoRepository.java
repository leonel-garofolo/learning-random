package com.azure.demoazureservice.repository;

import com.azure.demoazureservice.model.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Long> {
}