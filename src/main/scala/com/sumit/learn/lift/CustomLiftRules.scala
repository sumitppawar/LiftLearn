package com.sumit.learn.lift

import net.liftweb.http._
import net.liftweb.util.NamedPF

object CustomLiftRules {

  def init : Unit = {
    LiftRules.uriNotFound.prepend(NamedPF("404handler") {
      case (r, f) => NotFoundAsTemplate(ParsePath(
        List("404"),
        "html",
        true,
        false
      ))
    })

  }
}
