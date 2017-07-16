/**
 * Created by Gabriel on 15/07/2017.
 */
fun main(args: Array<String>) {
    var numeral = 0
    var soma = 0

    while (numeral < 1000){
        if (numeral % 3 == 0) soma += numeral
        else if (numeral % 5 == 0) soma += numeral
        numeral++
    }

    println(soma)
}