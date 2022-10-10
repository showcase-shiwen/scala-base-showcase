package com.lsw.scala.func

object ShowFunc {
  def main(args: Array[String]): Unit = {
    //最大值
    println(max(10, 9))
    //最小值
    println(min(10, 9))
    //统计和
    println(sum(10, 9))
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
   * @param x
   * @param y
   * @return
   */
  def sum(x: Int, y: Int) =  x + y
}
