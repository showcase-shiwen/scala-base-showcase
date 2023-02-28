package com.lsw.scala.collector

object MapDemo {
  def main(args: Array[String]): Unit = {
    var map = Map[String, Int]("a" -> 1, "b" -> 2)
    map.foreach(ele => {
      println("key " + ele._1 + "value " + ele._2)
    })
    val option: Option[Int] = map.get("a")
    println(option)
    println(option.get)
    val option1: Option[Int] = map.get("aa")
    println(option1.isEmpty)

  }
}
