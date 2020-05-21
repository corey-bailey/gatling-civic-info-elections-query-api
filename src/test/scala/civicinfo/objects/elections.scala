package civicinfo.objects
import scala.concurrent.duration._
import io.gatling.core.Predef._
import io.gatling.http.Predef._

object elections extends Simulation
{
  val api_key = System.getProperty("key")
  
  val getElections =  exec(_.set("api_key", api_key))
      .exec(
          http("getElections")
          .get("elections?key=${api_key}")
          .header("Accept","*/*")
          .check(status.in(200))
        )

  val getVoterinfo = exec(_.set("api_key", api_key))
      .exec(
          http("getElections")
          .get("voterinfo?address=SOME_STRING_VALUE&electionId=0&officialOnly=false&returnAllAvailableData=false&key=${api_key}")
          .header("Accept","*/*")
          .check(status.in(200))
        )
}
