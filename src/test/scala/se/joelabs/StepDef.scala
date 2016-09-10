package se.joelabs

import cucumber.api.scala.{EN, ScalaDsl}
import org.scalatest._
import org.scalatest.concurrent.Eventually._
import se.joelabs.pages.GoogleHomePage


class StepDef extends ScalaDsl with EN with Matchers {
  val googleHomePage = new GoogleHomePage()
  When("""^I open the google home page$""") { () =>
    googleHomePage.open()
  }

  When("""^I search for: (.*$)""") { (query: String) =>
    googleHomePage.search(query)
  }

  Then("""^the title is: (.*)""") { (title: String) =>
    eventually {
      googleHomePage.title should be(title)
    }
  }
}
