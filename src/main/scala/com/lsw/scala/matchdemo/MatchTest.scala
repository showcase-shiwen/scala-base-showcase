package com.lsw.scala.matchdemo

object MatchTest {

  def matchTest(x:Any): Unit ={
    x match {
      case 1=> println("number")
      case "str"=> println("String")
      //理解default
      case _=> println("any")
    }
  }
  def main(array:Array[String]):Unit={
    matchTest("str")
    matchTest(1)
    matchTest(2.3)
    matchTest(true)


  }

}
