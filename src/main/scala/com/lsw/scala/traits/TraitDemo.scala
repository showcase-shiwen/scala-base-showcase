package com.lsw.scala.traits

trait Listen {
  def Listen(name: String): Unit = {
    println(s"$name in Listen")
  }
}

trait Read {
  def Read(name: String): Unit = {
    println(s"$name in Read")
  }
}

trait Eat {
  def Eat(name: String)
}

class Child() extends Listen with Read with Eat {
  override def Eat(name: String): Unit = {
    println(s"$name is eating ")
  }

}

/**
 * trait 类似 java 抽象类
 * 单继承用 extends 多继承用 with
 */
object TraitDemo {
  def main(args: Array[String]): Unit = {
    var child: Child = new Child()
    child.Read("小王")
    child.Listen("小红")
    child.Eat("小李")
  }
}
