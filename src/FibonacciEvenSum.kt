/**
 * Created by Gabriel on 16/07/2017.
 */
fun main(args: Array<String>) {
    var num1 = 0
    var num2 = 1
    var num3 = 0
    var sum = 0
    val maxValue = 10

    while (num3 < maxValue){
        num3 = num1 + num2
        num1 = num2
        num2 = num3
        if (num3 < maxValue){
            print("$num3, ")
            if(num3 % 2 == 0) sum += num3
        }
    }
    println()
    println("A soma dos valores pares de Fibonacci de 0 até $maxValue é: $sum")

}