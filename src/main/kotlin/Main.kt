package com.ll
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println("== 명언 앱 ==")

    while(true) {
        print("명언) ")
        val input= readlnOrNull()!!.trim() //null을 return 할 일 없으니까 nullable 제외

        if(input=="종료"){
            break
        }
    }
}