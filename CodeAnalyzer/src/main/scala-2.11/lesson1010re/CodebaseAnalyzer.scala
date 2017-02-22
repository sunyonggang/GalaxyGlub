package lesson1010re

import java.io.File

import lesson1010re.utils.FileUtil

/**
 * Created by sunyonggang on 17/2/21.
 */
trait CodebaseAnalyzer {
  this: DirectoryScanner =>
  def countFileNum(path : Path) : Map[FileType, Int] = {
    countNum(scan(path))
  }
  def countNum(seq : Seq[Path]) : Map[FileType, Int] = {
    seq.groupBy(f => FileUtil.getExtraName(f)).mapValues(_.length)
  }
  def analyzeFile(path: Path) : SourceCodeInfo = {
    val source = new SourceCodeAnalyzer {}
    source.processFile(path)
  }
}

object CodebaseAnalyzer {

}
