import org.jsoup.nodes.Element
import scala.collection.JavaConverters._

class ElementPathCreator {

  def pathTo(element: Element): String = {
    val parents = element.parents().asScala.reverse
    parents.map(element => element.nodeName())
      .reduceLeft((path, parent) => s"$path > $parent")
      .concat(" > " + element.nodeName())
  }

}
