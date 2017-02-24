package lesson1010re

import java.io.File

/**
 * Created by sunyonggang on 17/2/22.
 */
object MainApp extends App with FormatReport{
  if (args.length < 1) {
    println("usage: CodeAnalyzer FilePath")
  } else {
    val path : Path = args(0)
    val file = new File(path)
    val analyzer = new CodebaseAnalyzer with DirectoryScanner with SourceCodeAnalyzer
    val rs = if (file.isFile) {
      format(analyzer.processFile(file.getAbsolutePath))
    } else {
      format(analyzer.countFileNum(file.getAbsolutePath))
    }
    println(rs)
  }
}
