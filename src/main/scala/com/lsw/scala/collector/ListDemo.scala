package com.lsw.scala.collector

object ListDemo {

  def main(arg: Array[String]): Unit = {
    val list = List[String]("aa bb", "cc dd", "ee ff")
    //过滤
    println("过滤")
    list.filter(ele => (ele.equals("aa bb"))).foreach(print)
    println("\n简单遍历")
    list.foreach(println(_))
    println("list map")
    val result: List[Array[String]] = list.map(ele => {
      ele.split(" ")
    })
    result.foreach(array => {
      array.foreach(println)
    })
    println("list flatMap ")
    val result1: List[String] = list.flatMap(ele => {
      ele.split(" ")
    })
    result1.foreach(println)

  }
}
