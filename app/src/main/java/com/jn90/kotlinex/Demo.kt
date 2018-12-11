package com.jn90.kotlinex

var num = 2
val pi = 3.14

var edad: Int = 28
var nombre: String = "Dario"

var apellido: String? = null
var subApellido: String? = apellido?.substring(0, 1)
var subApellid2: String = apellido?.substring(0, 1) ?: "sin apellido"

lateinit var color: String

var subApellido3: String = apellido!!.substring(0, 1)
val id: String by lazy { "123" }

fun sumar(n1: Int, n2: Int): Int {
    return n1 + n2
}

fun sumar2(n1: Int, n2: Int = 0): Int = n1 + n2
var rta = sumar2(2, 5)
var rta2 = sumar2(3)
var rta3 = sumar2(n2 = 6, n1 = 9)

fun Int.mul(n: Int): Int = this * n
var rta4 = 4.mul(6)
//infix funciona como perador
infix fun Int.div(n: Int): Int = this / n
var rta5 =4 div 2

//CALLBACK
var sub:(n1:Int, n2:Int)->Int={n1,n2->  n1-n2}
var rta6=sub(7,6)
fun operar(n1:Int, n2:Int, callback:(ta:Int)->Unit){
    callback(n1+n2)
}
fun testOperar(){
    operar(1, 2, {rta-> println("resultado:$rta") })
    operar(2, 3){rta-> println("resultado: $rta")}
    operar(1, 7 ){ println("resultado $it")}
}

//CLASES

class Usuario(val nombre:String, var email:String)

val usr= Usuario ("Dario", "tefa@email.com")
val n=usr.nombre

fun testUsuario(){
    usr.email="otro@email.com"
}

open class Mascota(val edad:Int, val raza:String){
    var edadHumana:Int=0
    init{
        edadHumana = 7*edad
    }
}

class Conejo (val nombre:String, edad:Int):Mascota(edad, "Conejo"){
    constructor():this("",0)
    fun comer(comida:Int){

    }
    operator fun plus(conejo:Conejo):Conejo{
        return Conejo(conejo.nombre, this.edad)
    }
}

val a= Conejo("a", 9)
val b= Conejo("b", 2)
val c= a+b
