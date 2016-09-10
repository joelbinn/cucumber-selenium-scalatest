package se.joelabs.pages

import org.scalatest.selenium.{HtmlUnit, Page}

class GoogleHomePage extends Page with HtmlUnit {
  val url = "http://google.com/"

  def title = pageTitle

  def open(): Unit = {
    go to this
  }

  def search(query:String): Unit = {
    val tf = textField("q")
    println(s"q: ${textField("q").value}")
    textField("q").value = query
    println(s"q: ${textField("q").value}")
    submit()
  }
}
