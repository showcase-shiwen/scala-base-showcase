package com.lsw.scala.collector

/**
 * 数组使用
 */
object ArrayDemo {
  def main(args: Array[String]): Unit = {
    println("array")
    //定义数组并初始化
    var array = Array[String]("a", "b", "c")
    var array1 = Array[String]("d", "e")
    var array3 = Array.concat(array,array1)
    array3.foreach(print)
    println()
    array.foreach(println(_))
    //定义长度为3 的数组 默认值0
    println("intArray")
    var intArray=new Array[Int](3)
    intArray.foreach(println)
    intArray(0)=1
    intArray(1)=2
    intArray(2)=3
    intArray.foreach(println)

    //生成并填充数组
    Array.fill(5)("abc").foreach(print)

  }
}
