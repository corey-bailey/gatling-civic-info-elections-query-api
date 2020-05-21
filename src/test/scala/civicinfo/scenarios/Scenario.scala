package civicinfo.scenarios
import civicinfo.objects

import scala.concurrent.duration._
import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class Elections extends Simulation {

val httpProtocol = http.baseUrl("https://www.googleapis.com/civicinfo/v2/")
val elections = scenario("Elections").exec
  {
   exec(
    randomSwitch(
        100.00 -> objects.elections.getElections,
        0.00 -> objects.elections.getVoterinfo
        )
    )
  }   
  setUp(elections.inject(rampUsersPerSec(objects.Config.inputRampUsersPerSecFrom) to objects.Config.inputRampUsersPerSecTo during (objects.Config.inputRampUsersPerSecDuration seconds), 
                        constantUsersPerSec(objects.Config.inputConstantUsersPerSec) during (objects.Config.inputConstantUsersPerSecDuration seconds)))
                        .protocols(httpProtocol).maxDuration(objects.Config.inputMaxDuration minutes)
}


