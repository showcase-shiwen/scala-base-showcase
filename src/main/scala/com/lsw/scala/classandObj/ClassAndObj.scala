package com.lsw.scala.classandObj

class Person(xName: String, xAge: Int) {
  var name = xName
  var age = xAge
  var gender = "男"

  /**
   * 重写构造
   *
   * @param xName
   * @param xAge
   * @param xGender
   */
  def this(xName: String, xAge: Int, xGender: String) {
    this(xName, xAge)
    gender = xGender
  }

  def hello(): Unit = {
    println(name+ " am "+ age)
  }
}

/**
 * object 全局生效
 * unit 无返回值
 */
object ClassAndObj {
  def main(args: Array[String]): Unit = {
    val p: Person = new Person("zhangsan", 18)
    println(p)
    println(p.name)
    println(p.age)
    p.hello()
    val p1 = new Person("zhangsannv", 18, "女")
    p1.hello()

  }
}
