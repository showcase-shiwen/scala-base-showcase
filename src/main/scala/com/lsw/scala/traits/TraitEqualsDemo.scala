package com.lsw.scala.traits

class TraitClassDemo(x1:Int, y1:Int) extends TraitEquals {
  var x:Int=x1
  var y:Int=y1
  override def isEquals(obj: Any):Boolean={
    obj.isInstanceOf[TraitClassDemo]&&obj.asInstanceOf[TraitClassDemo].x==this.x
  }
}
object TraitEqualsDemo {
  def main(array: Array[String]):Unit={
    var obj1:TraitClassDemo = new TraitClassDemo(0,3);
    var obj2:TraitClassDemo = new TraitClassDemo(0,3);
    println(obj1.isEquals(obj2))
  }
}
