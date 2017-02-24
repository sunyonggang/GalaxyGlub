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
    // construct a seq[SourceCodeInfo], name is 'A', 'B', 'C' .. 'Z'
    var seq = Seq[SourceCodeInfo]()
    for (i <- Range(65, 91)) {
      val sourceCode1 = new SourceCodeInfo("xxx", i.toChar.toString, i)
      seq = seq :+ sourceCode1
    }
    var seq10 = Seq[SourceCodeInfo]()
    for (i <- Range(90, 80, -1)) {
      val sourceCode1 = new SourceCodeInfo("xxx", i.toChar.toString, i)
      seq10 = seq10 :+ sourceCode1
    }

    it("should countFileTypeNum return the Map[FileType, Int]") {
      val list = List("a.scala", "b.scala", "cc.scala", "def.py", "test.txt", "thesamfile")
      ds.countFileTypeNum(list) should contain theSameElementsAs Map("scala" -> 3, "py" -> 1, "txt" -> 1, EmptyFileType -> 1)
    }
    it("should avgLine return Double") {
      "%.2f".format(ds.avgLine(seq)) shouldBe "77.50"
    }
    it("should longestFile return SourceCodeInfo") {
      ds.longestFile(seq) shouldBe new SourceCodeInfo("xxx", "Z", 90)
    }
    it("should top10F return seq[SourceCodeInfo]") {
      ds.top10F(seq) should contain theSameElementsAs seq10
    }
    it("should totalLines return files.length sum") {
      ds.totalLines(seq) shouldBe 2015
    }
  }
}
