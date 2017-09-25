package bootstrap.liftweb

import net.liftweb.http.{Html5Properties, LiftRules, Req}

/**
  * This class is boot class
  * @author Sumit
  */
class Boot {
  def boot: Unit = {

    //Where to find snippet
    LiftRules.addToPackages("com.sumit.learn.lift")

    // Use HTML5 for rendering
    LiftRules.htmlProperties.default.set((r: Req) =>
      new Html5Properties(r.userAgent))
  }
}
