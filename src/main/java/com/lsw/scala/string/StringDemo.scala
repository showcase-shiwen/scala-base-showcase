package com.lsw.scala.string

/**
 * 字符串相关
 */
object StringDemo {
  def main(args: Array[String]): Unit = {
    var str1 = "abc"
    var str2: String = "def"
    println(str1.equals(str2))
    str1.split("b").foreach(println)
  }
}
