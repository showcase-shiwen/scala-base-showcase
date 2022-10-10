package com.lsw.scala.collector

import scala.collection.mutable.ListBuffer

/**
 * 可变集合
 */
object ListBufferDemo {

  def main(arg: Array[String]): Unit = {
    var listBuffer: ListBuffer[String] = ListBuffer[String]("a", "b", "c")
    listBuffer.foreach(println(_))
  }
}
