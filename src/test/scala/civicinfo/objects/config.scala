package civicinfo.objects

object Config{
  val inputRampUsersPerSecFrom = Integer.getInteger("rampUsersPerSecFrom", 1)
  val inputRampUsersPerSecTo = Integer.getInteger("rampUsersPerSecTo", 1)
  val inputRampUsersPerSecDuration = Integer.getInteger("rampUsersPerSecDuration", 1)
  val inputConstantUsersPerSec = Integer.getInteger("constantUsersPerSec", 1).toDouble
  val inputConstantUsersPerSecDuration = Integer.getInteger("constantUsersPerSecDuration", 1).toDouble
  val inputMaxDuration = Integer.getInteger("maxDuration", 1)
  val inputRampUsersPerSec = Integer.getInteger("rampUsersPerSec", 1)
  val inputKey = System.getProperty("key")
  }