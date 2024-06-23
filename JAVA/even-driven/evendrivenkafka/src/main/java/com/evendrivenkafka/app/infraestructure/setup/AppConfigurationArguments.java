package com.evendrivenkafka.app.infraestructure.setup;

import java.util.List;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.stereotype.Component;

/**
 * Providing parameter of OS context (String[])
 */
@Slf4j
@Component
public class AppConfigurationArguments {

  public AppConfigurationArguments(ApplicationArguments args) {
    log.info("AppConfigurationArguments....");
    boolean debug = args.containsOption("debug");
    List<String> files = args.getNonOptionArgs();
    if (debug) {
      log.info("files: {}", files);
    }
    // if run with "--debug logfile.txt" prints ["logfile.txt"]
  }

}