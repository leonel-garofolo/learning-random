package com.verisure.digitalchannels.userinstallationmanager.test.bdd;

import io.cucumber.plugin.EventListener;
import io.cucumber.plugin.event.EventPublisher;
import io.cucumber.plugin.event.TestRunFinished;
import io.cucumber.plugin.event.TestRunStarted;
import java.util.Optional;
import org.mockserver.integration.ClientAndServer;
import org.mockserver.socket.PortFactory;

public class MockServerListener implements EventListener {

  private static ClientAndServer mockServer;

  public static ClientAndServer getMockServer() {
    return mockServer;
  }

  private static void setMockServer(ClientAndServer mockServer) {
    MockServerListener.mockServer = mockServer;
  }

  @Override
  public void setEventPublisher(EventPublisher eventPublisher) {
    eventPublisher.registerHandlerFor(TestRunStarted.class, this::handleTestRunStarted);
    eventPublisher.registerHandlerFor(TestRunFinished.class, this::handleTestRunFinished);
  }

  private void handleTestRunStarted(TestRunStarted event) {
    MockServerListener.setMockServer(
        ClientAndServer.startClientAndServer(PortFactory.findFreePort()));
  }

  private void handleTestRunFinished(TestRunFinished event) {
    Optional.ofNullable(mockServer).ifPresent(ClientAndServer::stop);
  }
}
