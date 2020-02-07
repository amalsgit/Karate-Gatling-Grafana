#Karate-To-Gatling-To-Grafana
This is a sample project showcasing how a simple API test can be written in Karate for functional automation which can then be re-used to do performance testing by passing tests into Gatling.

The results from gatling are then pushed to Influxdb with Graphite protocol which is then visualised in a Grafana dashboard.

Command to run Karate Tests: ```mvn clean test```

Command to run the Gatling performance tests: ```mvn clean test-compile gatling:test ```