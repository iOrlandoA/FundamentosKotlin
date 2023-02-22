package com.example.fundamentoskotlin

import java.lang.Math.abs

fun main(){
    sayHello()
    newTopic("Argumentos")
    val a= 2
    val b = 3
    println("$a + $b = ${sum(a,b)}" )
    println("$a - $b = ${sub(a,b)}" )


    newTopic("Infix")
    //
    val c=-3
    println(c.enableAbs(false))
    println("$a + $c = ${sum(a ,c.enableAbs(true))}")

    //Sobrecarga
    newTopic("SobreCarga")
    showProduct("Soda", "10%")
    showProduct("Pan", )
    showProduct(name = "Caramelo", promo = "15%")
    showProduct(name="Jugo", validity = "15 de marzo")

}

private fun sayHello(): Unit { //Unit es void en Java
    println("Hola Kotlin")
}
//Funcion Sumar
fun sum(a: Int, b: Int): Int{
    return a + b
}


//Funcion restar comprimida
fun sub(a: Int, b: Int)= a - b


//Una clase personalizada
infix fun Int.enableAbs(enable: Boolean)= if(enable) abs(this) else this

//Sobrecargar
fun showProduct(name:String, promo: String="Sin promocion", validity: String="agotar existencias"){
    println("$name = $promo hasta $validity")
}