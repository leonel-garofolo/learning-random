package com.cache.redis.app.spring.repository;

import com.cache.redis.app.spring.model.Persona;
import org.springframework.data.repository.CrudRepository;

public interface PersonaRepository extends CrudRepository<Persona, String> {
    // Puedes agregar métodos personalizados según tus necesidades
}
