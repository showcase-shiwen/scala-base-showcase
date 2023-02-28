package com.lsw.scala.traits


trait TraitEquals {
  def isEquals(x: Any): Boolean

  def isNotEquals(x: Any): Boolean = !isEquals(x)
}
