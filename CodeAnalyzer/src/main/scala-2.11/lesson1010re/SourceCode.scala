package lesson1010re

/**
 * Created by sunyonggang on 17/2/21.
 */
case class SourceCodeInfo (path : Path,name : String, count : Int)

trait SourceCodeAnalyzer {
  def processFile(path : Path) : SourceCodeInfo = {
    import scala.io._
    val source = Source.fromFile(path)
    val lines = source.getLines().toList
    new SourceCodeInfo(path, utils.FileUtil.getFileName(path), lines.length)
  }
}
