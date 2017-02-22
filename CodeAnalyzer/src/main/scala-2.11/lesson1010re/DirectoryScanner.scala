package lesson1010re

import java.io.File

/**
 * Created by sunyonggang on 17/2/22.
 */
trait DirectoryScanner {
  def scan(path : Path) : Vector[Path] = {
    val file = new File(path)
    val files = file.listFiles()
    files.foldLeft(Vector[Path]()) { (acc, f) =>
      //      if (f.isFile) acc + 1 else acc + scan(f.getAbsolutePath)
      if (f.isFile) {
        acc :+ f.getAbsolutePath
      } else {
        acc ++ scan(f.getAbsolutePath)
      }

    }
  }
}

