package com.lambda.app;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class FirstLambdaHandlerJavaTest {

  @Mock
  Context context;
  @Mock
  LambdaLogger loggerMock;

  @BeforeEach
  public void setup() {
    MockitoAnnotations.initMocks(this);
  }

  @Test
  public void handleRequest() {
    Mockito.when(context.getLogger()).thenReturn(loggerMock);
    FirstLambdaHandlerJava test = new FirstLambdaHandlerJava();
    var request = new IntegerRecord(10, 10, "Hello");
    test.handleRequest(request, context);
  }
}