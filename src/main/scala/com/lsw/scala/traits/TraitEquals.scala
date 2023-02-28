package com.lsw.scala.`trait`


trait TraitEquals {
  def isEquals(x: Any): Boolean

  def isNotEquals(x: Any): Boolean = !isEquals(x)
}
