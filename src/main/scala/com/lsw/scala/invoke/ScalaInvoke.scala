package com.lsw.scala.invoke
import com.lsw.java.invoke.JavaApi;

object ScalaInvoke {
  def main(args:Array[String]): Unit ={

    var javaApi = new JavaApi()
    var result = javaApi.hello()
    println(result)
  }
}
