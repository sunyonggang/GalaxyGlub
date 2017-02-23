package lesson1010re

import org.scalatest.{ShouldMatchers, FunSpec}

/**
 * Created by sunyonggang on 17/2/22.
 */
class DirectoryScannerSpec extends FunSpec with ShouldMatchers {

  describe("DirectoryScannerSpec") {

    it("should scan directory recursively and return all file path") {
      val ds = new DirectoryScanner {}
      val files = ds.scan("/Users/sunyonggang/myiso")
      val seq = Seq[Path]("/Users/sunyonggang/myiso/CentOS-6.7-x86_64-bin-DVD1.iso", "/Users/sunyonggang/myiso/ubuntu-14.04.1-desktop-amd64.iso", "/Users/sunyonggang/myiso/CentOS-7-x86_64-DVD-1503-01.iso", "/Users/sunyonggang/myiso/ubuntu-16.04-desktop-amd64.iso", "/Users/sunyonggang/myiso/test/test.txt", "/Users/sunyonggang/myiso/.DS_Store")
      for (file <- files) {
        seq.contains(file) shouldBe true
      }
    }
  }
}
