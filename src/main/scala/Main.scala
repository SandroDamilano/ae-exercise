import java.io.File

object Main extends App{
  val originalFile = new File(args(0))
  val diffFile = new File(args(1))
  val elementId = "make-everything-ok-button"
  val path = new ElementFinder(originalFile, elementId).findIn(diffFile)
  println(path)
}