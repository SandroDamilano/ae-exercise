import java.io.File

object Main extends App{
  val originalFile = new File(args(0))
  val diffFile = new File(args(1))
  var elementId = "make-everything-ok-button"

  if(!args(2).isEmpty){
    elementId = args(2)
  }

  val path = new ElementFinder(originalFile, elementId).findIn(diffFile)
  println(path)
}