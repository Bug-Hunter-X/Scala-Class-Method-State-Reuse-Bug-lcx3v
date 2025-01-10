```scala
class MyClass(val x: Int) {
  def myMethod(y: Int): Int = {
    x + y
  }
}

object Main {
  def main(args: Array[String]): Unit = {
    val obj = new MyClass(5)
    val result = obj.myMethod(10) //this line is problematic
    println(result)
    val obj2 = new MyClass(15)
    val result2 = obj2.myMethod(10) //this line is problematic
    println(result2)
  }
}
```