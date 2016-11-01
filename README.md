# Building and Running Tests

Tests can be executed and run using:

    gradle build

Test results are displayed in html and can be viewed using any browser by opening the results file found in:

> PaysafeSDK/build/reports/tests/index.html

# Running Sample Code

Initialize sampleCode by running

    gradle jettyRun

Open Browser and navigate to:

http://localhost:8181/samples

Samples are displayed herein. Sample configuration is currently using properties defined in:

> samples/src/main/resources/config.properties

Modifying these settings will change settings in this environment.


