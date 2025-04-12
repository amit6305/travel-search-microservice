package com.skyscanner;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class HoenScannerApplication extends Application<HoenScannerConfiguration> {

    public static void main(String[] args) throws Exception {
        new HoenScannerApplication().run(args);
    }

    @Override
    public void initialize(Bootstrap<HoenScannerConfiguration> bootstrap) {
    }

    @Override
    public void run(HoenScannerConfiguration configuration, Environment environment) {
    }
}