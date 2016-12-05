scala> 3.
%              &              *              +              -              /              >
>=             >>             >>>            ^              asInstanceOf   isInstanceOf   toByte
toChar         toDouble       toFloat        toInt          toLong         toShort        toString
unary_+        unary_-        unary_~        |

scala> 3.3.toDouble
res0: Double = 3.3

scala> 3.toDouble
res1: Double = 3.0

scala> sqrt(2)
<console>:8: error: not found: value sqrt
              sqrt(2)
              ^

scala> import math._
import math._

scala> sqrt(2)
res3: Double = 1.4142135623730951

scala> pow(res)
<console>:11: error: not enough arguments for method pow: (x: Double, y: Double)Double.
Unspecified value parameter y.
              pow(res)
                 ^

scala> pow(res, 2)
<console>:11: error: not found: value res
              pow(res, 2)
                  ^

scala> pow(res3, 2)
res6: Double = 2.0000000000000004

scala> res6 = 4.0
<console>:12: error: reassignment to val
       res6 = 4.0
            ^

scala> "crazy" * 5
res7: String = crazycrazycrazycrazycrazy

scala> 10 max 2
res8: Int = 10

scala> 10.max(2)
res9: Int = 10

scala> val a = 2;
a: Int = 2

scala> val c = pow(a, 1024)
c: Double = Infinity

scala> BigInt(pow(a, 1024))
<console>:12: error: overloaded method value apply with alternatives:
  (x: java.math.BigInteger)scala.math.BigInt <and>
  (x: String)scala.math.BigInt <and>
  (x: Array[Byte])scala.math.BigInt <and>
  (l: Long)scala.math.BigInt <and>
  (i: Int)scala.math.BigInt
 cannot be applied to (Double)
              BigInt(pow(a, 1024))
              ^

scala> BigInt(pow(a, 1024).toInt)
res11: scala.math.BigInt = 2147483647

scala> BigInt(pow(a, 1023).toInt)
res12: scala.math.BigInt = 2147483647

scala> val a : BigInt = 2;
a: scala.math.BigInt = 2

scala> a.<<(1024)
res13: scala.math.BigInt = 359538626972463181545861038157804946723595395788461314546860162315465351611001926265416954644815072042240227759742786715317579537628833244985694861278948248755535786849730970552604439202492188238906165904170011537676301364684925762947826221081654474326701021369172596479894491876959432609670712659248448274432

scala> pow(2, 1024)
res14: Double = Infinity

scala> 2 pow 1024
<console>:11: error: value pow is not a member of Int
              2 pow 1024
                ^

scala> a pow 1024
res16: scala.math.BigInt = 179769313486231590772930519078902473361797697894230657273430081157732675805500963132708477322407536021120113879871393357658789768814416622492847430639474124377767893424865485276302219601246094119453082952085005768838150682342462881473913110540827237163350510684586298239947245938479716304835356329624224137216

scala> a.pow(1024)
res17: scala.math.BigInt = 179769313486231590772930519078902473361797697894230657273430081157732675805500963132708477322407536021120113879871393357658789768814416622492847430639474124377767893424865485276302219601246094119453082952085005768838150682342462881473913110540827237163350510684586298239947245938479716304835356329624224137216

scala> a.<<(1023)
res18: scala.math.BigInt = 179769313486231590772930519078902473361797697894230657273430081157732675805500963132708477322407536021120113879871393357658789768814416622492847430639474124377767893424865485276302219601246094119453082952085005768838150682342462881473913110540827237163350510684586298239947245938479716304835356329624224137216

scala> import BigInt
     | ;
<console>:2: error: '.' expected but ';' found.
       ;
       ^

scala> import BigInt._
import BigInt._

scala> probablePrime
probablePrime

scala> import scala.util.Random
import scala.util.Random

scala> probablePrime
probablePrime

scala> probablePrime(1000, Random)
res19: scala.math.BigInt = 7676784902955062049210007569886823534906581659978283732812230528429622352785177229419800915205782929723420809699564785887957905708731182501430837447648393743760230128728067354892668250296608457216159013532740749624123825456680207147262171334874358278829289054957460971881603404362088539905724872134993

scala> probablePrime(2, Random)
res20: scala.math.BigInt = 3

scala> probablePrime(1, Random)
java.lang.ArithmeticException: bitLength < 2
	at java.math.BigInteger.probablePrime(BigInteger.java:686)
	at scala.math.BigInt$.probablePrime(BigInt.scala:98)
	at .<init>(<console>:15)
	at .<clinit>(<console>)
	at .<init>(<console>:7)
	at .<clinit>(<console>)
	at $print(<console>)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:497)
	at scala.tools.nsc.interpreter.IMain$ReadEvalPrint.call(IMain.scala:734)
	at scala.tools.nsc.interpreter.IMain$Request.loadAndRun(IMain.scala:983)
	at scala.tools.nsc.interpreter.IMain.loadAndRunReq$1(IMain.scala:573)
	at scala.tools.nsc.interpreter.IMain.interpret(IMain.scala:604)
	at scala.tools.nsc.interpreter.IMain.interpret(IMain.scala:568)
	at scala.tools.nsc.interpreter.ILoop.reallyInterpret$1(ILoop.scala:760)
	at scala.tools.nsc.interpreter.ILoop.interpretStartingWith(ILoop.scala:805)
	at scala.tools.nsc.interpreter.ILoop.command(ILoop.scala:717)
	at scala.tools.nsc.interpreter.ILoop.processLine$1(ILoop.scala:581)
	at scala.tools.nsc.interpreter.ILoop.innerLoop$1(ILoop.scala:588)
	at scala.tools.nsc.interpreter.ILoop.loop(ILoop.scala:591)
	at scala.tools.nsc.interpreter.ILoop$$anonfun$process$1.apply$mcZ$sp(ILoop.scala:882)
	at scala.tools.nsc.interpreter.ILoop$$anonfun$process$1.apply(ILoop.scala:837)
	at scala.tools.nsc.interpreter.ILoop$$anonfun$process$1.apply(ILoop.scala:837)
	at scala.tools.nsc.util.ScalaClassLoader$.savingContextLoader(ScalaClassLoader.scala:135)
	at scala.tools.nsc.interpreter.ILoop.process(ILoop.scala:837)
	at scala.tools.nsc.MainGenericRunner.runTarget$1(MainGenericRunner.scala:83)
	at scala.tools.nsc.MainGenericRunner.process(MainGenericRunner.scala:96)
	at scala.tools.nsc.MainGenericRunner$.main(MainGenericRunner.scala:105)
	at scala.tools.nsc.MainGenericRunner.main(MainGenericRunner.scala)


scala> probablePrime(3, Random)
res22: scala.math.BigInt = 5

scala> val a : BigInt = 123456789;
a: scala.math.BigInt = 123456789

scala> BigInt.
MaxLong                 MinLong                 apply                   asInstanceOf
int2bigInt              isInstanceOf            javaBigInteger2bigInt   long2bigInt
probablePrime           toString

scala> BigInt.toString(16)
<console>:15: error: too many arguments for method toString: ()String
              BigInt.toString(16)
                             ^

scala> a.toString(16)
res24: String = 75bcd15

scala> a.toString(36)
res25: String = 21i3v9

scala> "hello".
+                     asInstanceOf          charAt                chars                 codePointAt
codePointBefore       codePointCount        codePoints            compareTo             compareToIgnoreCase
concat                contains              contentEquals         endsWith              equalsIgnoreCase
getBytes              getChars              indexOf               intern                isEmpty
isInstanceOf          lastIndexOf           length                matches               offsetByCodePoints
regionMatches         replace               replaceAll            replaceFirst          split
startsWith            subSequence           substring             toCharArray           toLowerCase
toString              toUpperCase           trim

scala> "hello".in
indexOf   intern

scala> "hello".indexOf(0)
res26: Int = -1

scala> "hello".indexOf(1)
res27: Int = -1

scala> "hello".indexOf('h')
res28: Int = 0

scala> "hello".indexOf('o')
res29: Int = 4

scala> "hello".chatAt(0)
<console>:15: error: value chatAt is not a member of String
              "hello".chatAt(0)
                      ^

scala> "hello".chatAt(1)
<console>:15: error: value chatAt is not a member of String
              "hello".chatAt(1)
                      ^

scala> "hello".head(0)
<console>:15: error: Char does not take parameters
              "hello".head(0)
                          ^

scala> "hello".head
res33: Char = h

scala> "hello".tail
res34: String = ello

scala> "hello".last
res35: Char = o

scala> "hello".take(1)
res36: String = h

scala> "hello".take(2)
res37: String = he

scala> "hello".takeRight(2)
res38: String = lo

scala> "hello".drop(0)
res39: String = hello

scala> "hello".drop(1)
res40: String = ello

scala> "hello".drop(4)
res41: String = o

scala> "hello".drop(5)
res42: String = ""

scala> "hello".dropRight(5)
res43: String = ""

scala> "hello".dropRight(0)
res44: String = hello

scala> "hello".dropRight(1)
res45: String = hell

scala> "hello".sub
subSequence   substring

scala> "hello".substring(0,1)
res46: String = h

scala> "hello".substring(0,2)
res47: String = he

scala> "hello".substring(1,2)
res48: String = e
