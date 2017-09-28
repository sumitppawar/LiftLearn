package com.sumit.learn.lift.snippet

import net.liftweb.util.{PassThru,ClearNodes}

import scala.util.Random

object ClearNodesSnippet {
  def boolean: Boolean = Random.nextBoolean()
  def render = if(boolean) PassThru else ClearNodes
}
