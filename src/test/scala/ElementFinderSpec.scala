import java.io.File

import org.scalatest.FunSpec

class ElementFinderSpec extends FunSpec {

  val htmlFile = new File("Examples/sample-0-origin.html")
  val elementId = "make-everything-ok-button"
  val elementFinder = new ElementFinder(htmlFile, elementId)

  describe("findElementById") {
    it("Returns the element given the id") {
      assert(elementFinder.findElementById(elementId).id().equals(elementId))
    }
  }

  describe("findIn"){
    describe("When the diffFile is equivalent to the original file"){
      val diffFile = htmlFile

      it("Finds the element") {
        assert(elementFinder.findIn(diffFile).equals("html > body > div > div > div > div > div > div > a"))
      }
    }
  }
}
