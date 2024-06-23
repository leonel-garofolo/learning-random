package com.cache.redis.app.spring;

import com.cache.redis.app.spring.model.Persona;
import com.cache.redis.app.spring.service.PersonaService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoSpringDataRedisApplication {

  public static void main(String[] args) {
    SpringApplication.run(DemoSpringDataRedisApplication.class, args);
  }

  @Bean
  public CommandLineRunner demo(PersonaService personaService) {
    return args -> {
      personaService.clear();
      // Crear y persistir una persona
      Persona persona = newPersona(1);
      personaService.guardarPersona(persona);
      persona = newPersona(2);
      personaService.guardarPersona(persona);
      persona = newPersona(3);
      personaService.guardarPersona(persona);
      persona = newPersona(4);
      personaService.guardarPersona(persona);

      // Recuperar una persona por ID
      Persona personaRecuperada = personaService.obtenerPersona(persona.getId());
      System.out.println("Persona Recuperada: " + personaRecuperada);

      System.out.println("Personas: " + personaService.findAll());
    };
  }

  private Persona newPersona(int id){
    Persona persona = new Persona();
    persona.setNombre("Juan" + id);
    persona.setEdad(30 + id);
    return persona;
  }
}
