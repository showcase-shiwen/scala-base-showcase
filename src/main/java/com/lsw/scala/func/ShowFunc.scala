package com.lsw.scala.func

import java.util.Date

object ShowFunc {


  def main(args: Array[String]): Unit = {
    //最大值
    println(max(10, 9))
    //最小值
    println(min(10, 9))
    //统计和
    println(sum(10, 9))
    //统计差
    println(absDiff(10, 9))
    //统计差
    println(func1(10, 9))
    println(func1())
    //可变参数
    func2(1, 2, 3)

    //匿名函数 =>
    ((x: Int) => {
      println(s"\n匿名函数$x")
    }) (1)

    //偏应用函数
    func3(new Date(), "func3 abc")
    func4("func4 abc")

    //高阶函数

    //函数的参数 是函数
    func5((x:Int,y:Int) => {x+y}, "abc")
    //函数的返回是函数
   println( func6()("lisi","110"))
  }

  /**
   *
   * 没有 return 将方法体最最后执行块当结果返回 自动判断返回类型
   *
   * @param x
   * @param y
   * @return
   */
  def max(x: Int, y: Int) = {
    if (x > y) {
      x
    } else {
      y
    }
  }

  /**
   * 使用 return 要返回具体类型
   *
   * @param x
   * @param y
   * @return
   */
  def min(x: Int, y: Int): Int = {
    if (x < y) {
      return x
    } else {
      return y
    }
  }

  /**
   * 方法体一体逻辑可以 省略{}
   *
   * @param x
   * @param y
   * @return
   */
  def sum(x: Int, y: Int) = x + y

  /**
   * 如果方法体与方法名中的 " = " 省略 返回空Unit
   *
   * @param x
   * @param y
   */
  def absDiff(x: Int, y: Int) {
    var diff = 0
    if (x > y) {
      diff = x - y
    } else {
      diff = y - x
    }
  }

  /**
   * 默认值参数
   *
   * @param x
   * @param y
   */
  def func1(x: Int = 10, y: Int = 2): Int = {
    x + y
  }

  /**
   * 可变参数
   *
   * @param x
   * @param y
   */
  def func2(x: Int*) {
    for (ele <- x) {
      println(ele)
    }
    x.foreach((ele: Int) => {
      print(ele)
    })
    x.foreach(print)
    x.foreach(print(_))
  }

  //偏应用函数
  def func3(date: Date, log: String): Unit = {
    println(s"time $date $log")
  }

  //偏应用函数 当函数参数过多时 重复操作时使用  _ 传需要传的
  def func4 = func3(new Date(), _: String)

  /**
   * 函数的参数 是函数
   *
   * @param x
   * @param y
   */
  def func5(x: (Int,Int) => Int, y: String): Unit = {
    var str: Int = x(10,20)
    println(str, y)
  }

  /**
   * 函数的返回是函数
   * @param x
   * @param y
   */
  def func6(): (String,String)=>String = {
    def a(name:String,phone:String): String ={
      return s"$name is phone number  $phone"
    }
    return a
  }
}
