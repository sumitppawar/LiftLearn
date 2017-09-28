package bootstrap.liftweb

import com.sumit.learn.lift.CustomLiftRules
import net.liftweb.http.{Html5Properties, LiftRules, Req}
import net.liftweb.sitemap.Loc.Hidden
import net.liftweb.sitemap.{Menu, SiteMap}
/**
  * This class is boot class
  * @author Sumit
  */
class Boot {
  def boot: Unit = {

    CustomLiftRules.init
    //Where to find snippet
    LiftRules.addToPackages("com.sumit.learn.lift")

    // Build SiteMap
    def sitemap(): SiteMap = SiteMap(
      Menu.i("Home") / "index",
      Menu.i("404") / "404" >> Hidden
    )

    // Use HTML5 for rendering
    LiftRules.htmlProperties.default.set((r: Req) =>
      new Html5Properties(r.userAgent))
  }
}
