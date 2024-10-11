package com.verisure.digitalchannels.userinstallationmanager.test.bdd;

import com.verisure.digitalchannels.notifier.sms.service.SmsService;
import com.verisure.digitalchannels.testing.bdd.RequestTestInformation;
import com.verisure.digitalchannels.userinstallationmanager.Application;
import com.verisure.digitalchannels.userinstallationmanager.client.adapter.MailClientImpl;
import com.verisure.digitalchannels.userinstallationmanager.ext.repository.AttemptGenericRepository;
import com.verisure.digitalchannels.userinstallationmanager.ext.repository.EmailReportingRepository;
import com.verisure.digitalchannels.userinstallationmanager.ext.repository.InstallationRepository;
import com.verisure.digitalchannels.userinstallationmanager.ext.repository.LanguagesRepository;
import com.verisure.digitalchannels.userinstallationmanager.ext.repository.UserApplicationRepository;
import com.verisure.digitalchannels.userinstallationmanager.ext.repository.UserInstallationRepository;
import com.verisure.digitalchannels.userinstallationmanager.ext.repository.UsersRepository;
import com.verisure.digitalchannels.userinstallationmanager.ext.repository.newsrv.BdeRepository;
import com.verisure.digitalchannels.userinstallationmanager.ext.repository.newsrv.ServicesAttributesRepository;
import com.verisure.digitalchannels.userinstallationmanager.ext.repository.newsrv.ServicesRepository;
import com.verisure.digitalchannels.userinstallationmanager.ext.repository.newsrv.UnprotectedHomeRepository;
import com.verisure.digitalchannels.userinstallationmanager.repository.ValidationEmailsRepository;
import io.cucumber.spring.CucumberContextConfiguration;
import org.mockito.Mockito;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Primary;
import org.springframework.security.oauth2.client.registration.InMemoryClientRegistrationRepository;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;

@CucumberContextConfiguration
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@EnableConfigurationProperties
@ActiveProfiles("test")
@ContextConfiguration(
    initializers = SpringBootContextInitializer.class,
    classes = {Application.class, CucumberSpringBootContext.TestConfig.class})
public class CucumberSpringBootContext {

  @TestConfiguration
  @Import(RequestTestInformation.class)
  public static class TestConfig {

    @Bean
    @Primary
    InMemoryClientRegistrationRepository mockInMemoryClientRegistrationRepository() {
      return Mockito.mock(InMemoryClientRegistrationRepository.class);
    }

    @Bean
    @Primary
    UsersRepository mockedUsersRepository() {
      return Mockito.mock(UsersRepository.class);
    }

    @Bean
    @Primary
    InstallationRepository mockedInstallationRepository() {
      return Mockito.mock(InstallationRepository.class);
    }

    @Bean
    @Primary
    LanguagesRepository mockedLanguagesRepository() {
      return Mockito.mock(LanguagesRepository.class);
    }

    @Bean
    @Primary
    ValidationEmailsRepository mockedValidationEmailsRepository() {
      return Mockito.mock(ValidationEmailsRepository.class);
    }

    @Bean
    @Primary
    AttemptGenericRepository mockedAttemptGenericRepository() {
      return Mockito.mock(AttemptGenericRepository.class);
    }

    @Bean
    @Primary
    EmailReportingRepository mockedEmailReportingRepository() {
      return Mockito.mock(EmailReportingRepository.class);
    }

    @Bean
    @Primary
    SmsService mockedSmsService() {
      return Mockito.mock(SmsService.class);
    }

    @Bean
    @Primary
    MailClientImpl mockedMailClientImpl() {
      return Mockito.mock(MailClientImpl.class);
    }

    @Bean
    @Primary
    UserApplicationRepository mockedUserApplicationRepository() {
      return Mockito.mock(UserApplicationRepository.class);
    }

    @Bean
    @Primary
    UserInstallationRepository mockedUserInstallationRepository() {
      return Mockito.mock(UserInstallationRepository.class);
    }

    @Bean
    @Primary
    ServicesRepository mockedServicesRepository() {
      return Mockito.mock(ServicesRepository.class);
    }

    @Bean
    @Primary
    UnprotectedHomeRepository mockedUnprotectedHomeRepository() {
      return Mockito.mock(UnprotectedHomeRepository.class);
    }

    @Bean
    @Primary
    BdeRepository mockedBdeRepository() {
      return Mockito.mock(BdeRepository.class);
    }

    @Bean
    @Primary
    ServicesAttributesRepository mockedServicesAttributesRepository() {
      return Mockito.mock(ServicesAttributesRepository.class);
    }
  }
}
