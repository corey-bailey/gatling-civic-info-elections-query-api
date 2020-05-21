package civicinfo.objects

object Config{
val inputRampUsersPerSecFrom = Integer.getInteger("rampUsersPerSecFrom", 1).toDouble
val inputRampUsersPerSecTo = Integer.getInteger("rampUsersPerSecTo", 1).toDouble
val inputRampUsersPerSecDuration = Integer.getInteger("rampUsersPerSecDuration", 1).toDouble
val inputConstantUsersPerSec = Integer.getInteger("constantUsersPerSec", 1).toDouble
val inputConstantUsersPerSecDuration = Integer.getInteger("constantUsersPerSecDuration", 1).toDouble
val inputMaxDuration = Integer.getInteger("maxDuration", 1).toDouble
val inputRampUsersPerSec = Integer.getInteger("rampUsersPerSec", 1).toDouble
}