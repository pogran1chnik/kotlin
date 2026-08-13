package org.example.app

abstract class ForumUser(
    val username: String,
    val userId: Int,
){
    fun readForum(){
        println("$username читает форум")
    }
    fun writeMessage(text: String){
        println("$username пишет сообщение: \"$text\"")
    }
    abstract fun getRole(): String
}

class RegularUser(username: String, userId: Int): ForumUser(username, userId){

    override fun getRole(): String = "Обычный пользователь"
}
class Admin(username: String, userId: Int): ForumUser(username,userId){
    override fun getRole(): String = "Администратор"
    fun deleteMessage(messageId: Int){
        println("$username удаляет сообщение с ID $messageId")
    }
    fun deleteUser(userId: Int){
        println("$username удаляет пользователя с ID $userId")
    }
}

fun main() {

    val regularUser = RegularUser("Dima", 1)
    val admin = Admin("Ivan", 2)
    println("Обычный пользователь")
    regularUser.readForum()
    regularUser.writeMessage("Привет всем!")
    println("Роль: ${regularUser.getRole()}")



    println("Администратор")
    admin.readForum()
    admin.writeMessage("Правила форума обновлены")
    admin.deleteMessage(5)
    admin.deleteUser(12)
    println("Роль: ${admin.getRole()}")
}