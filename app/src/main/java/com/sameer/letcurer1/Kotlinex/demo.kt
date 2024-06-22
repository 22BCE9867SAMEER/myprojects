package com.sameer.letcurer1.Kotlinex

fun main(){
    var mystudent:Student = Student("shaik",35,"guntur")
   println(mystudent.name)
    var employee:Employee =Employee("abdul" ,40,"chennai")
    println(employee.name)
    employee.name = "anasari"
    println(employee.name)
}