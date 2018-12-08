import org.jsoup.nodes.Element
import scala.collection.JavaConverters._

class ElementComparator() {

  def similarityLevel(referenceElement: Element, comparedElement: Element): Int = {
    var similarityLevel = 0
    similarityLevel += this.compare(referenceElement.tag().getName, comparedElement.tag().getName)
    similarityLevel += this.compare(referenceElement.`val`(), comparedElement.`val`())
    similarityLevel += this.compareClasses(referenceElement, comparedElement)
    similarityLevel += this.compareAttributes(referenceElement, comparedElement)

    similarityLevel
  }

  def compare(attribute1: String, attribute2: String): Int ={
    if (attribute1.equals(attribute2)) {
      1
    } else {
      0
    }
  }

  def compareClasses(referenceElement: Element, comparedElement: Element): Int = {
    referenceElement.classNames().asScala.intersect(comparedElement.classNames().asScala).size
  }

  def compareAttributes(referenceElement: Element, comparedElement: Element): Int = {
    referenceElement.attributes().asScala.toSet.intersect(comparedElement.attributes().asScala.toSet).size
  }

}
