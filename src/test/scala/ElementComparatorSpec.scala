import org.scalatest.FunSpec
import org.jsoup.nodes.Element

class ElementComparatorSpec extends FunSpec {

  describe("similarityLevel"){
    it("Returns the level of similarity of two given elements"){
      val referenceElement = new Element("a")
      val comparedElement = new Element("a")
      val elementComparator = new ElementComparator()

      assert(elementComparator.similarityLevel(referenceElement, comparedElement).equals(2))
    }
  }

}
