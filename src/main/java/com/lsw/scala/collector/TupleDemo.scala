package com.lsw.scala.collector

/**
 * 元组的使用  取值 ._index
 * 元素最多可以有22个元素
 */
object TupleDemo {
  def main(args: Array[String]): Unit = {
    //简写
    var tuple1 = (1, 2, 3, "a", "hello", 1.1)
    //取 第一个值
    println(tuple1._1)
    //遍历
    tuple1.productIterator.foreach(println(_))
  }
}
