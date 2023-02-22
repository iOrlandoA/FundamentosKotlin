package com.example.fundamentoskotlin



fun main(){
    newTopic("Bucles")
    showPersons("angel","Marry", "Fany")
    showPersons("angel","Marry", "Sergio", "Alex", "Carla")

}
fun showPersons(p1: String, p2: String, p3: String){
    println(p1)
    println(p2)
    println(p3)
}
fun showPersons(vararg persons: String){ //Arreglo de argumentos

    //For
    newTopic("For")
    for(person in persons) println(person)

    //While
    newTopic("While")
    var index= 0
    while(index < persons.size){
        if (persons[index]=="Marry") println("Es Marry!") else
        println(persons[index])
        index++
    }

    // When
    newTopic("When")
    index =(0..persons.size-1).random()
    println(index)
    when (persons[index]){
        "Angel" -> println("Es Angel!")
        "Marry" -> {
            println ("Ir a otra pantalla")
            println(2+4)

        }
        else -> println(persons[index])
    }
}