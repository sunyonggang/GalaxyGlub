package lesson1010re.utils

import lesson1010._

/**
 * Created by sunyonggang on 17/2/21.
 */
class FileUtil {

}

object FileUtil {
  def getExtraName(path : Path) : String = {
    val fn = getFileName(path)
    if (fn.contains(".")) {
      fn.split("\\.").last
    } else {
      EmptyFileType
    }
  }
  def getFileName(path : Path) : String = {
    path.split("/").last
  }
}
