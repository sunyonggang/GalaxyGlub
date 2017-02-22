package lesson1010re

import java.io.File

import lesson1010re.utils.FileUtil

/**
 * Created by sunyonggang on 17/2/21.
 */
trait CodebaseAnalyzer {
  this: DirectoryScanner =>
  def countFileNum(path : Path) : Map[FileType, Int] = {
    val files = scan(path)
    files.groupBy(f => FileUtil.getExtraName(f)).mapValues(_.length)

//    files.foldLeft(Map[FileType, Int]()) { (acc, f) =>
////      if (f.isFile) acc + 1 else acc + scan(f.getAbsolutePath)
//      if (f.isFile) {
//        val postfix = utils.FileUtil.getExtraName(f.getAbsolutePath)
//        if (acc.contains(postfix)) {
//          acc.updated(postfix, acc(postfix) + 1)
//        } else {
//          acc + (postfix -> 1)
//        }
//      } else {
////        acc ++ scan(f.getAbsolutePath)
//      }
//
//    }
  }
  def analyzeFile(path: Path) : Int = ???
}

object CodebaseAnalyzer {

}
