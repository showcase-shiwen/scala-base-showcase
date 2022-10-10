package com.lsw.scala.collector

import scala.collection.mutable.ArrayBuffer

/**
 * 可变数组使用
 */
object ArrayBufferDemo {
  def main(args: Array[String]): Unit = {
    //可变数组
    var array: ArrayBuffer[Int] = scala.collection.mutable.ArrayBuffer[Int](1, 2, 3)
    //头部增加
    array.+=:(0)
    array.foreach(print)
    println()
    // .+= 末尾添加元素
    array.+=(4)
    array.foreach(print)
    println()
    //添加多元素
    array.+=(5, 6, 7)
    array.foreach(print)
    println()
  }
}
