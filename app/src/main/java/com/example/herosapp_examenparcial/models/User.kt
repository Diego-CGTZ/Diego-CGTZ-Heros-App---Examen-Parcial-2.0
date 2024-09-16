package com.example.herosapp_examenparcial.models

data class User(val name:String,val email:String,val password: String){
    val computedName :String get() = "Hola, $name"
    companion object{
        val users = listOf(
            User("Diego","diego@gmail.com","12345")
        )
    }
}