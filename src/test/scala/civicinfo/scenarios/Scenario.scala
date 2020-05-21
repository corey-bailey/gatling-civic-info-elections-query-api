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
        100.00 -> objects.elections.getElections
        )
    )
  }
  setUp(elections.inject(rampUsersPerSec(1) to 2 during (3 seconds), constantUsersPerSec(1) during (5 seconds))).protocols(httpProtocol).maxDuration(1 minutes)
}


