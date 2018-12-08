import java.io.File

import org.scalatest.FunSpec

class ElementFinderSpec extends FunSpec {

  val originalFIle = new File("Examples/sample-0-origin.html")
  val elementId = "make-everything-ok-button"
  val elementFinder = new ElementFinder(originalFIle, elementId)

  describe("findIn"){
    describe("When the diffFile is equivalent to the original file"){
      val diffFile = originalFIle

      it("Finds the element") {
        assert(elementFinder.findIn(diffFile).equals("html > body > div > div > div > div > div > div > a"))
      }
    }

    describe("When the diffFile is the sample 1"){
      val diffFile = new File("Examples/sample-1-evil-gemini.html")

      it("Finds the element") {
        assert(elementFinder.findIn(diffFile).equals("html > body > div > div > div > div > div > div > a"))
      }
    }

    describe("When the diffFile is the sample 2"){
      val diffFile = new File("Examples/sample-2-container-and-clone.html")

      it("Finds the element") {
        assert(elementFinder.findIn(diffFile).equals("html > body > div > div > div > div > div > div > div > a"))
      }
    }

    describe("When the diffFile is the sample 3"){
      val diffFile = new File("Examples/sample-3-the-escape.html")

      it("Finds the element") {
        assert(elementFinder.findIn(diffFile).equals("html > body > div > div > div > div > div > div > a"))
      }
    }

    describe("When the diffFile is the sample 4"){
      val diffFile = new File("Examples/sample-4-the-mash.html")

      it("Finds the element") {
        assert(elementFinder.findIn(diffFile).equals("html > body > div > div > div > div > div > div > a"))
      }
    }
  }

  describe("findElementById") {
    it("Returns the element given the id") {
      assert(elementFinder.findElementById(elementId).id().equals(elementId))
    }
  }
}
