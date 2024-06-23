package com.cache.redis.app.spring.service;

import com.cache.redis.app.spring.model.Persona;
import com.cache.redis.app.spring.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService {

  private final PersonaRepository personaRepository;

  @Autowired
  public PersonaService(PersonaRepository personaRepository) {
    this.personaRepository = personaRepository;
  }

  public void guardarPersona(Persona persona) {
    personaRepository.save(persona);
  }

  public Persona obtenerPersona(String id) {
    return personaRepository.findById(id).orElse(null);
  }

  public Iterable<Persona> findAll(){
    return personaRepository.findAll();
  }

  public void clear(){
    personaRepository.deleteAll();
  }
}
