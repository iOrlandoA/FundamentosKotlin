package com.example.fundamentoskotlin

const val separator= "====================="

fun main (){
    //print("Hola Kotlin")
    newTopic("Hola Kotlin")
    newTopic("Varibles y Constantes")
    //val a = 2
    val a = true
    println("a= $a")

    //Define la variable y luego le da valor
    var b: Int
    b = 5
    println("b= $b")

    // Habilitar el valor null y crear un objeto cualquiera
    var objNull: Any?
    objNull = null
    objNull = "Hi"

    println(objNull)


}
fun newTopic(topic: String){
    /*println()
    print("============================= ")
    print(topic)
    print(" =============================")*/

    print("\n $separator $topic $separator\n")

}