package com.lsw.scala;

object Variable {

  def test():Unit={
    println("test")
  }
  def main(args: Array[String]): Unit = {
    //调用函数
    test()

    //定义变量 强声明
    var str1: String = "hello"
    //定义常量
    val SIZE: Int = 10
    println(str1)
    println(SIZE)
    //定义变量 自动类型声明 必须指定值
    var name = "zhangsan"
    var age = 10
    //    一经初始化类型
    //    var temp =name
    //    name=age
    //    age=temp
    println("name is", name, " age", age)

    //循环使用 包含末尾
    for (i <- 1 to(10, 3)) {
      println("包含末尾" + i)
    }
    //循环使用 不包含末尾 步长
    for (i <- 1 until(10, 3)) {
      println("不包含末尾" + i)
    }
    for (i <- 1 until 10; j <- 1 until 10) {
      if (j <= i) {
//        print(j + "*" + i + "=" + (i * j) + "\t")
        print(s"$j*$j="+(i * j)+"\t")
        //        print(i+"*"+j+"="+(i*j)+"\t")
      }
      if (i == j) {
        println()
      }
    }
    //将结果返回一个 数组
    var result = for (i <- 1 to 10 if(i%2==0)) yield i
      println(result)

    var i = 10
    if (i == 10) {
      println("equals")
    }

    while(i>0){
      println(s"do while $i")
      i-=1
    }

  }
}
