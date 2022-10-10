package com.lsw.scala.collector

import scala.collection.mutable

/**
 * 固定长度  Set 去重
 */
object SetDemo {

  def main(arg: Array[String]): Unit = {
    println("set 无序")
    val set=Set[Int](1,2,3,4,3,5)
    set.foreach(println(_))
    println("treeSet 有序")
    val treeSet=mutable.TreeSet(1,2,3,4,5)
    treeSet.foreach(println(_))
  }
}
