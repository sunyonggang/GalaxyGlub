package lesson1010re

import lesson1010re.utils.FileUtil
import org.scalatest.{ShouldMatchers, FunSpec}

/**
 * Created by sunyonggang on 17/2/22.
 */
class CodebaseAnalyzerSpec extends FunSpec with ShouldMatchers {

  describe("DirectoryScannerSpec") {
    val ds = new CodebaseAnalyzer with DirectoryScanner with SourceCodeAnalyzer {
      override def scan(path : Path) : Vector[Path] = List("a.scala", "b.scala", "cc.scala", "def.py", "test.txt", "thesamfile").toVector
    }
    it("should countFileNum return the Map[FileType, Int]") {
      ds.countFileNum("jdfksjdkjf") should contain theSameElementsAs Map("scala" -> 3, "py" -> 1, "txt" -> 1, EmptyFileType -> 1)
    }
    it("should countNum return the Map[FileType, Int]") {
      ds.countNum(ds.scan("dddddd")) should contain theSameElementsAs Map("scala" -> 3, "py" -> 1, "txt" -> 1, EmptyFileType -> 1)
    }
  }
}
