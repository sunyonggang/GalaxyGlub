package lesson1010re

import java.io.File

/**
 * Created by sunyonggang on 17/2/22.
 */
object MainApp extends App {
  if (args.length < 1) {
    println("usage: CodeAnalyzer FilePath")
  } else {
    val path : Path = args(0)
    val file = new File(path)
    val analyzer = new CodebaseAnalyzer with DirectoryScanner with SourceCodeAnalyzer
    if (file.isFile) {
      val source = analyzer.processFile(file.getAbsolutePath)
      println("path: " + source.path + " name: " + source.name + " count: " + source.count)
    } else {
      analyzer.countFileNum(file.getAbsolutePath).foreach{
        case (fileType, count) => println(s"$fileType $count")
      }
    }
  }
}
