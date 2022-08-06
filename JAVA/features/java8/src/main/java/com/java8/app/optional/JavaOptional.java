package com.java8.app.optional;

import java.util.Optional;

import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;

public class JavaOptional {
  private static Logger LOGGER = LoggerFactory.getLogger(JavaOptional.class);

  public boolean preventNullPointExceptionWithOptional(){
    Optional<String> helloWork = returnOptional();
    if(helloWork.isPresent()){
      LOGGER.debug("Way to prevent a nullPointException");
      return isPandemicYear(Optional.of(2022));
    }
    LOGGER.debug("Good bye!!!");
    return true;
  }

  private Optional<String> returnOptional(){
    final String helloWorld = "Hello!!!";
    return Optional.of(helloWorld);
  }

  private boolean isPandemicYear(Optional<Integer> validateInt){
    if(validateInt.isPresent() && validateInt.get() >= 2022){
        LOGGER.debug("Pandemic no more!!!!");
        return false;
    }
    return true;
  }

}
