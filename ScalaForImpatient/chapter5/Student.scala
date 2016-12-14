/**
 * Created by sunyonggang on 16/12/14.
 */

import scala.reflect.BeanProperty
class Student {
  @BeanProperty var name : String = _
  @BeanProperty var id : Int = _
}
object Student {
  def main(args: Array[String]) {
    val s = new Student
    s.setName("syg")
    println(s.getName)
    s.setId(123)
    println(s.getId)
  }
}

/**
 * javap Student
public class Student {
  public static void main(java.lang.String[]);
  public java.lang.String name();
  public void name_$eq(java.lang.String);
  public void setName(java.lang.String);
  public int id();
  public void id_$eq(int);
  public void setId(int);
  public java.lang.String getName();
  public int getId();
  public Student();
}
 */
