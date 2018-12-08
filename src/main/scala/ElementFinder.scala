import java.io.File
import scala.collection.JavaConverters._

import org.jsoup.Jsoup
import org.jsoup.nodes.Element

class ElementFinder(originalFile: File, elementId: String) {

  def findIn(diffFile: File): String = {
    val element = this.findElement(diffFile)
    new ElementPathCreator().pathTo(element)
  }

  def findElementById(id: String): Element = {
    Jsoup.parse(originalFile, "utf8", originalFile.getAbsolutePath)
      .select("#" + id)
      .first()
  }

  def findElement(diffFile: File): Element = {
    val originalElement = findElementById(elementId)
    val allElements = Jsoup.parse(diffFile, "utf8", diffFile.getAbsolutePath).getAllElements
    allElements.asScala.maxBy(element =>
      new ElementComparator().similarityLevel(originalElement, element)
    )
  }

}
