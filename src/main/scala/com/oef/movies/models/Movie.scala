package com.oef.movies.models

case class MovieRegistration(imdbId: String, availableSeats: Int, screenId: String)

object RegistrationResult extends Enumeration {
  val RegitrationSuccessful, AlreadyExists = Value
}

case class MovieIdentification(imdbId: String, screenId: String) {
  override def toString: String = s"imdbId=$imdbId, screenId=$screenId"
}

object ReservationResult extends Enumeration {
  val ReservationSuccessful, NoSeatsLeft, NoSuchMovie = Value
}

case class MovieInformation(imdbId: String, screenId: String, movieTitle: String, availableSeats: Int, reservedSeats: Int)
