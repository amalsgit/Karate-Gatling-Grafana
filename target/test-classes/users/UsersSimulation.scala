package users

import com.intuit.karate.gatling.PreDef._
import io.gatling.core.Predef._
import scala.concurrent.duration._

class UsersSimulation extends Simulation {

//  val protocol = karateProtocol(
//    "/users" -> Nil,
//    "/users/id" -> Nil
//  )

  val GetUsers = scenario(scenarioName = "Get users").exec(karateFeature(name = "classpath:users/users.feature"))

  setUp(
    GetUsers.inject(rampUsers(10) during (5 seconds))
  )
}