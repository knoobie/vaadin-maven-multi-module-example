# Vaadin Multi Module Example

## Dependencies & Requirements

* Vaadin `14.2.x`
* Spring Boot `2.3.x.RELEASE`
* Java 8 (not tested with 11 and above)

## How to develop

* `mvn clean install` - build everything
* `cd demo-service` - move to the vaadin application
* `mvn spring-boot:run` - start vaadin application

## How to create production application

* `mvn -Pproduction clean install` - build everything including vaadin as production app
* `cp demo-service/target/demo-service-1.0.0-SNAPSHOT-exec.jar ${YOUR_DESTINATION}` - copy the executable jar
* `./demo-service-1.0.0-SNAPSHOT-exec.jar` - execute it
