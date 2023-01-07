package com.cloud.report.api.microreportapi;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoClientConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.fasterxml.jackson.databind.util.Converter;
import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;

@Configuration
@EnableMongoRepositories(basePackages = "com.cloud.report.api.microreportapi.repository")
public class MongoConfig extends AbstractMongoClientConfiguration {

    private static final String DB_CONNECTION_STRING_PRE = "mongodb+srv://root:1234@mycluster.xmjvkkr.mongodb.net/?retryWrites=true&w=majority";

    private static final String DB_CONNECTION_STRING_DEV = "mongodb://root:1234@localhost:27017/?retryWrites=true&w=majority";
	private static final String PACKAGE_MODEL = "com.cloud.report.api.microreportapi.model";
	private static final String DB_NAME = "spring_reports";

	private final List<Converter<?, ?>> converters = new ArrayList<>();

	@Override
	protected String getDatabaseName() {
		return DB_NAME;
	}

	@Override
	public MongoClient mongoClient() {
		final ConnectionString connectionString = new ConnectionString(DB_CONNECTION_STRING_DEV);
		final MongoClientSettings mongoClientSettings = MongoClientSettings.builder()
				.applyConnectionString(connectionString).build();
		return MongoClients.create(mongoClientSettings);
	}

	@Override
	public Collection<String> getMappingBasePackages() {
		return Collections.singleton(PACKAGE_MODEL);
	}
}