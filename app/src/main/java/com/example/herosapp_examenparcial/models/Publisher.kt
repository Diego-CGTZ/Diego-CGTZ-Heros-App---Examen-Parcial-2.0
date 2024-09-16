package com.example.herosapp_examenparcial.models

data class Publisher(val id : Int, val name:String, val image :String, val background :String){
    companion object{
        val categories = mutableListOf<Publisher>(
            Publisher(1,"DC","https://upload.wikimedia.org/wikipedia/commons/thumb/3/3d/DC_Comics_logo.svg/800px-DC_Comics_logo.svg.png","https://i.pinimg.com/564x/47/e5/d4/47e5d498df5949cda76b5ad14f4a6fa3.jpg"),
            Publisher(2,"MARVEL","https://1000marcas.net/wp-content/uploads/2021/07/Marvel-Comics-logo.png","https://i.pinimg.com/564x/8f/c7/90/8fc790362e27dedce05e9f3469171b2f.jpg")
        )
    }
}
