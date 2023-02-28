package com.lsw.scala

object DataType {
  //表示无值，和其他语言中void等同。用作不返回任何结果的方法的结果类型。Unit只有一个实例值，写成()。
  //  def main(args: Array[String]) : Unit= {
  def main(args: Array[String]) {
    var i: Int = 10
    var j = 11
    //代码换行不使用 ；   单行多语句分隔使用分号  " ；"
    print(i);
    print(j)
    val foo =
      """菜鸟教程
www.runoob.com
www.w3cschool.cc
www.runnoob.com
以上三个地址都能访问"""
    print(foo)
  }
}
