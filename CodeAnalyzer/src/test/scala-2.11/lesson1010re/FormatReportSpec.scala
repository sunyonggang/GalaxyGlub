package lesson1010re

import org.scalatest.{ShouldMatchers, FunSpec}

/**
 * Created by sunyonggang on 17/2/23.
 */
class FormatReportSpec extends FunSpec with ShouldMatchers{

  describe("FormatReportSpec") {
    val fr = new FormatReport {}
    val sci = new SourceCodeInfo("path", "name", 100)
    val ds = new CodebaseAnalyzer with DirectoryScanner with SourceCodeAnalyzer
    it("should format SouceCodeInfo") {
      fr.format(new SourceCodeInfo("path", "test.txt", 3)) shouldBe "name: test.txt lines: 3"
    }

    it("should format CodebaseInfo") {
      val cbi = CodebaseInfo(Map("iso" -> 4, "txt" -> 1, EmptyFileType -> 23), 1942, 72.04, sci, Seq(sci))
      fr.format(cbi) shouldBe
        """
          |iso 4
          |txt 1
          |Empty File Type 23
        """.trim.stripMargin

    }

  }
}
