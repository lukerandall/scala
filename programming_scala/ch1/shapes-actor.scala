package shapes {
  import scala.actors._
  import scala.actors.Actor._

  object ShapeDrawingActor extends Actor {
    def act() {
      loop {
        receive {
          case s: Shape => s.draw()
          case "exit"   => println("exiting..."); exit
          case x: Any   => println("Error: Unknown message! " + x)
        }
      }
    }
  }
}

// vim: set ts=4 sw=4 et:
