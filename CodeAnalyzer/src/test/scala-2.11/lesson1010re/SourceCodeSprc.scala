package lesson1010re

import org.scalatest.{ShouldMatchers, FunSpec}

/**
 * Created by sunyonggang on 17/2/22.
 */
class SourceCodeAnalyzerSprc extends FunSpec with ShouldMatchers {

  describe("SourceCodeSprc") {
    
    it("should fromFile") {
      val sca = new SourceCodeAnalyzer {}
      val sc = sca.processFile("/Users/sunyonggang/myiso/test/test.txt")
      sc.count shouldBe 3
      sc.name shouldBe "test.txt"
      sc.path shouldBe "/Users/sunyonggang/myiso/test/test.txt"
    }

  }
}
