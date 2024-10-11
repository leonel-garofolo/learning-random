package com.verisure.digitalchannels.userinstallationmanager.test.bdd;

import java.time.ZoneOffset;
import java.util.Optional;
import java.util.TimeZone;
import org.springframework.boot.test.util.TestPropertyValues;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.lang.NonNull;

public class SpringBootContextInitializer
    implements ApplicationContextInitializer<ConfigurableApplicationContext> {

  @Override
  public void initialize(@NonNull ConfigurableApplicationContext applicationContext) {
    System.setProperty("jasypt.encryptor.password", "test");
    Optional.of(MockServerListener.getMockServer())
        .ifPresent(
            ms ->
                TestPropertyValues.of("mockServerPort=" + ms.getPort())
                    .applyTo(applicationContext));
    TimeZone.setDefault(TimeZone.getTimeZone(ZoneOffset.UTC));
  }
}
