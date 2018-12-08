import java.io.File

import org.scalatest.FunSpec

class ElementPathCreatorSpec extends FunSpec {

  it("returns the XML path to the given element") {
    val htmlFile = new File("Examples/sample-0-origin.html")
    val elementId = "make-everything-ok-button"
    val element = new ElementFinder(htmlFile, elementId).findElementById(elementId)
    val elementPathCreator = new ElementPathCreator

    assert(elementPathCreator.pathTo(element).equals("html > body > div > div > div > div > div > div > a"))
  }

}
