package lesson1010re

/**
 * Created by sunyonggang on 17/2/21.
 */
class SourceCode (val path : Path, val name : String, private val lines : List[String]){
  def count : Int = lines.length
}

object SourceCode {
  def fromFile(path : Path) : SourceCode = {
    import scala.io._
    val source = Source.fromFile(path)
    val lines = source.getLines().toList
    new SourceCode(path, utils.FileUtil.getFileName(path), lines)
  }
}
