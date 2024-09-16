package com.example.herosapp_examenparcial.models

data class Universe(val id: Int, val name:String, val desc:String, val image:String, val logo:String, val universeid:Int){
    companion object{
        val sups = listOf(
            Universe(1,"Superman","Es muy fuerte","https://i.pinimg.com/564x/db/06/11/db0611d358ff007b2bb7151b1abb1814.jpg", "https://i.pinimg.com/564x/48/1a/3c/481a3c8f0e929e66081e5a19bbcfdfd2.jpg",1),
            Universe(2,"Batman","Es muy inteligente", "https://i.pinimg.com/564x/2e/c0/a4/2ec0a417dca17238da780daa2cd34312.jpg", "https://i.pinimg.com/564x/dd/4d/94/dd4d9411ad45e852664428b87ea288aa.jpg",1),
            Universe(3,"Gatubela","Es muy sigilosa", "https://i.pinimg.com/564x/c9/62/55/c962555659fc39c3dc050b65de23498f.jpg", "https://i.pinimg.com/564x/99/4b/e6/994be65c6a59f48911f515354231bd25.jpg",1),
            Universe(4,"Flash","El hombre mas rapido", "https://i.pinimg.com/564x/90/44/47/9044474125acc7cfc9a154e9c3774251.jpg", "https://i.pinimg.com/736x/a8/bc/a6/a8bca6fe2966bef0853e7a2c09809327.jpg",1),
            Universe(5,"Mujer Maravilla","Es muy fuerte", "https://i.pinimg.com/564x/f9/3d/85/f93d852f5b485b848e7d8cdd901cc39a.jpg","https://i.pinimg.com/736x/a0/66/5d/a0665d81a30804b54568aedb81c5d744.jpg",1),
            Universe(6,"Aquaman","El rey del oceano", "https://i.pinimg.com/564x/a1/c7/16/a1c716e4dadcf3219e7394d155d2fb0d.jpg","https://i.pinimg.com/564x/3b/d6/14/3bd614cfdd4de43f72fce642d1d33c39.jpg",1),
            Universe(7,"Cyborg","Mitad humano mitad maquina", "https://i.pinimg.com/564x/e2/0a/94/e20a944ef070e54800935e4fba051512.jpg","https://i.pinimg.com/564x/ea/90/d5/ea90d5dd396d0cd3168c7097b92ab641.jpg",1),
            Universe(8,"Linterna Verde","Posee un anillo muy poderoso", "https://i.pinimg.com/564x/94/69/bf/9469bf2d76a27b9175484ab1216e8a67.jpg","https://i.pinimg.com/564x/af/95/f5/af95f56e7aa0ee46fa3e8d612acaab55.jpg",1),
            Universe(9,"Shazam","Posee poderes ancestrales", "https://i.pinimg.com/564x/b0/2e/86/b02e8654df954be9a018df09780e4ea4.jpg","https://i.pinimg.com/564x/7c/7b/b1/7c7bb18b3412158d89f2fe737a042b19.jpg",1),
            Universe(10,"DeadShot","No falla un tiro", "https://i.pinimg.com/564x/1f/51/0d/1f510dcd511361bb494d51eb16cfd5bf.jpg", "https://i.pinimg.com/564x/87/34/8e/87348ea985d315a275c09c3657042278.jpg",1)
        )
    }
}
