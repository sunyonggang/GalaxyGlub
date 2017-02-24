package lesson1010re

import java.io.File

import lesson1010re.utils.FileUtil

/**
 * Created by sunyonggang on 17/2/21.
 */

case class CodebaseInfo(fileTypeNums : Map[FileType, Int], totalLineCount : Int, avgLineCount : Double,
                         longestFileInfo : SourceCodeInfo,
                         top10Files : Seq[SourceCodeInfo])

trait CodebaseAnalyzer {
  this: DirectoryScanner with SourceCodeAnalyzer =>
  def countFileNum(path : Path) : CodebaseInfo = {
    val files = scan(path)
    val sourceCodeInfo = files.map(processFile)
    CodebaseInfo(countFileTypeNum(files), totalLines(sourceCodeInfo), avgLine(sourceCodeInfo), longestFile(sourceCodeInfo), top10F(sourceCodeInfo))
  }
  private[lesson1010re] def countFileTypeNum(seq : Seq[Path]) : Map[FileType, Int] = {
    seq.groupBy(f => FileUtil.getExtraName(f)).mapValues(_.length)
  }
  private[lesson1010re] def avgLine(sci : Seq[SourceCodeInfo]) : Double = {
    sci.map(_.count).sum.toDouble / sci.length
  }
  private[lesson1010re] def longestFile(sci : Seq[SourceCodeInfo]) : SourceCodeInfo = {
    sci.sortBy(_.count).last
  }
  private[lesson1010re] def top10F(sci : Seq[SourceCodeInfo]) : Seq[SourceCodeInfo] = {
    sci.sortBy(_.count).reverse.take(10)
  }
  private[lesson1010re] def totalLines(sci : Seq[SourceCodeInfo]) : Int = {
    sci.map(_.count).sum
  }
}

