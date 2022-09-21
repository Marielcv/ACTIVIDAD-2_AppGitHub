package com.example.miappandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        saludo()
        println("Hola Ingeniero Jonathan Docente de Programación IV")

        variableyConstantes()

    }

    fun saludo(){
        println("Hola Ingeniero desde la funcion saludo")
    }
    fun variableyConstantes(){
        // variables
        var myPrimeraVariable = "Hola Ingeniero Jonathan Docente de Programación IV"
        println(myPrimeraVariable)

        myPrimeraVariable = "Aqui cambiamos la variable"
        println(myPrimeraVariable)

        //constante
        val myPrimeraConstante = "Esto es una constante"
        println(myPrimeraConstante)
        //Una constante no puede ser modificada en su valor
        //myPrimeraConstante = "otro valor"

        val mySegundaConstante:String = myPrimeraVariable
        println(mySegundaConstante)

        val miNumero = 1
        val miDouble = 2.2

    }
    private fun variableyconstante(){}
    fun EjercicioVarVal(){
        println("Hola Ingeniero")
        val nombre:String = "Jonathan"
        //nombre="Jonath"

        var apellido:String ="Carball"
        apellido = "Carballo"

        var edad:Int= 21
        edad = 22

        var salario =1200
        salario = 1220

        var nombreCompleto =nombre +"" +apellido
        println(nombreCompleto)

        val añoNacimiento = 2000
        var añoActual = Calendar.getInstance().get(Calendar.YEAR)
        var Edad = añoActual-añoNacimiento
        println("Tu edad es: " + Edad)
        println("Tu edad es:  $Edad")

    }

    // TiposDeDatos

    {
        fun tiposDeDatos() {
            //Enteros(Byte,short,Int,Long)
            val myInt = 1
            val myInt2: Int = 3
            val myInt3: Int = +myInt2
            println(myInt3)

            // Decimales(Float,Double
            val myfloat = 1.7f
            val myfloat2: Float = 1.7f
            val myDouble = 1.3
            val myDouble2: Double = 1.4
            val myDouble3: Double = 5.0
            val mySumaDouble = myDouble + myDouble2 + myDouble3
            println(mySumaDouble)

            //boolean (bool)
            val myBoolean: Boolean = true
            val myBoolean2 = false
            val myBoolean3 = true
            println(myBoolean == myBoolean2)
            println(myBoolean && myBoolean3)

            fun TipoDeDatosDeducidosExplicitos() {
                // Tipos de datos
                var enteroExplicito: Int = 45
                println(enteroExplicito.javaClass)
                var enteroDeducido = 35
                println(enteroDeducido.javaClass)


                var dobleExplicito: Double = 45.45
                println(dobleExplicito.javaClass)
                var dobleDeducido = 35.0
                println(dobleDeducido.javaClass)


                var flotanteExplicito: Float = 45.45f
                println(flotanteExplicito.javaClass)
                var flotanteDeducido = 35.35f
                println(flotanteDeducido.javaClass)

                var largoExplicito: Long = 454545
                println(largoExplicito.javaClass)
                var largoDeducido = 353535L
                println(largoDeducido.javaClass)

                var textoExplicito: String = "45"
                println(textoExplicito.javaClass)
                var textoDeducido: String = "35"
                println(textoDeducido.javaClass)

                enteroExplicito = textoExplicito.toInt()
                println(enteroExplicito.javaClass)

                enteroDeducido = textoDeducido.toInt()
                println(enteroDeducido.javaclass)


            }


        }