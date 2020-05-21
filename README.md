Template for Gatling Performance Test 
=========================

Gatling Performance test template using the gatling-maven-plugin.

To test it out, simply execute the following command:

    $mvn gatling:test -Dgatling.simulationClass=civicinfo.scenarios.Elections -DrampUsersPerSecFrom=1 -DrampUsersPerSecTo=10 -DrampUsersPerSecDuration=10 -DconstantUsersPerSec=10 -DconstantUsersPerSecDuration=30 -DmaxDuration=2 -Dkey="YOUR-API-KEY"
