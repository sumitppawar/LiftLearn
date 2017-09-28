package com.sumit.learn.lift.snippet

import scala.util.Random
import net.liftweb.util.Helpers._
import net.liftweb.util.PassThru
object PassThruSinppet {
    def boolean = Random.nextBoolean()

  def render = if(boolean)
    "*" #> "Replaced Content"
  else PassThru
}
