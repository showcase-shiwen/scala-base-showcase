package com.lsw.scala.func

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
    ((x:Int)=>{
      println(s"\n匿名函数$x")
    })(1)
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
    x.foreach((ele:Int)=>{print(ele)})
    x.foreach(print)
    x.foreach(print(_))
  }
}
