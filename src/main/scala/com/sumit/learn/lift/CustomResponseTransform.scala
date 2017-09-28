package com.sumit.learn.lift
import net.liftweb.common.Box
import net.liftweb.http._
import net.liftweb.http.js.JsCmds.RedirectTo
object CustomResponseTransform {
  def init(): Unit = {
    LiftRules.responseTransformers.append({
      case CustomisedResponse(res) => res
      case res => res
    })
  }
}

private object CustomisedResponse {
  def unapply(arg:LiftResponse ): Option[LiftResponse] =  {
    definedResponse.find(_ == arg.toResponse.code).flatMap(toResponse)
  }

  def toResponse(status : Int): Box[LiftResponse] =
    for {
      session <- S.session
      req <- S.request
      template = Templates(status.toString::Nil)
      response <- session.processTemplate(template, req, req.path, status)
    } yield response


  val definedResponse = 403 :: Nil
}