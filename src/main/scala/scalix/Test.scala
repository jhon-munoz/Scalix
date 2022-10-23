package scalix

import scalix.MovieObjects.FullName
import scalix.Scalix.*

object Test {
  def main(args: Array[String]) = {
    val actor1: FullName = FullName("Jason", "Momoa")
    val actor2: FullName = FullName("Amber", "Heard")

    val actorId = findActorId(actor1.name, actor1.surname)
    println(s"Actor ${actor1.name} ${actor1.surname} with id: ${actorId.get}")

    val actorMovies = findActorMovies(actorId.get) // id:117642
    println(s"Movies for actor ${actor1.name} ${actor1.surname} with id: ${actorMovies}")

    val movieDirector = findMovieDirector(297802) // id : 297802
    println(s"Movie director: ${movieDirector.get}")

    val collaborations = collaboration(actor1, actor2)
    println(s"Collaboration: ${collaborations}")

  }
}