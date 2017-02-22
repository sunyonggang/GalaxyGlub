package lesson1010re

import org.scalatest.{ShouldMatchers, FunSpec}

/**
 * Created by sunyonggang on 17/2/22.
 */
class CodebaseAnalyzerSpec extends FunSpec with ShouldMatchers {

  describe("DirectoryScannerSpec") {

    it("should scan return the Map[FileType, Int]") {
      val ds = new CodebaseAnalyzer with DirectoryScanner
      val count = ds.countFileNum("/Users/sunyonggang/myiso")
      count("iso") shouldEqual 4
      count("txt") shouldEqual 1
    }

  }
}
