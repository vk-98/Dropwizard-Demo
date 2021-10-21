package com.flipkart.application;

import com.flipkart.controllers.DemoApis;
import io.dropwizard.Application;
import io.dropwizard.Configuration;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class App extends Application<Configuration>
{
    private static final Logger logger = LoggerFactory.getLogger(App.class);

    @Override
    public void initialize(Bootstrap<Configuration> b) {
    }

    public void run(Configuration configuration, Environment environment) throws Exception {
        logger.info("Registering REST resources");
        environment.jersey().register(new DemoApis());
    }
    public static void main(String[] args) throws Exception {
        new App().run(args);
    }
}
