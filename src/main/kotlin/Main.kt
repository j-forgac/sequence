package main.kotlin

val primeSequence = sequence {
    val primeNums = mutableListOf(1)
    var num = primeNums.last()+1
    while (true){
        if(primeNums.drop(1).none { num%it == 0}){
            primeNums.add(num)
            yield(num)
        }
        num++
    }
}

fun main() {
    println(primeSequence.take(100).toList())
    println(primeSequence.takeWhile { it<100 }.toList())
}