package com.verisure.digitalchannels.authapi.test.bdd;

import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

/**
 * Runner class for acceptance and regression tests with Failsafe Plugin.
 *
 * @see <a
 *     href="http://maven.apache.org/surefire/maven-failsafe-plugin/examples/inclusion-exclusion.html"</a>
 */
@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("bdd")
@SuppressWarnings("java:S2187")
public class CucumberIT {}
