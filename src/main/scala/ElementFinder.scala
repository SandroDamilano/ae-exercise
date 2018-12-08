import java.io.File

import org.jsoup.Jsoup
import org.jsoup.nodes.Element

class ElementFinder(originalFile: File, elementId: String) {

  def findIn(diffFile: File): String = {
    val element = this.findElementById(elementId)
    new ElementPathCreator().pathTo(element)
  }

  def findElementById(id: String): Element = {
    findElement("#" + id)
  }

  def findElement(query: String): Element = {
    Jsoup.parse(originalFile, "utf8", originalFile.getAbsolutePath)
      .select(query)
      .first()
  }

}
