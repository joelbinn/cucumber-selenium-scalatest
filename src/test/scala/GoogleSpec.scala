import org.scalatest._
import org.scalatest.selenium._
import org.scalatest.concurrent.Eventually._

class BlogSpec extends FlatSpec with Matchers with HtmlUnit {

  val host = "http://google.com/"

  "The google home page" should "have the correct title" in {
    go to (host + "index.html")
    eventually {
      pageTitle should be("Google")
    }
  }

  "Search" should "work" in {
    go to (host + "index.html")
    eventually {
      pageTitle should be("Google")
    }
    println(s"q: ${textField("q").value}")
    textField("q").value = "Cheese!"
    println(s"q: ${textField("q").value}")
    submit()
    // Google's search is rendered dynamically with JavaScript.
    eventually {
      pageTitle should be("Cheese! - Sök på Google")
    }

  }
}
