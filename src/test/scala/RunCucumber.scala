import org.junit.runner.RunWith
import cucumber.api.junit.Cucumber
import cucumber.api.CucumberOptions

@RunWith(classOf[Cucumber])
@CucumberOptions(
  plugin = Array("pretty"),
  features=Array("features"),
  glue=Array("se.joelabs")
)
class RunCukesTest
