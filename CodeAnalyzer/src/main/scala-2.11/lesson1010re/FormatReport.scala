package lesson1010re

/**
 * Created by sunyonggang on 17/2/23.
 */
trait FormatReport {
  def format (si : SourceCodeInfo) : String = {
    "name: " + si.name + " " + "lines: " + si.count
  }

  def format (cbi : CodebaseInfo) : String = {
    cbi.fileTypeNums.map{
      case (fileType, count) => fileType + " " + count
    }.mkString("\n")
  }
}
