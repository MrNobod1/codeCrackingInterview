fun main() {
    println(prevMultOfThree_1(1244))
}

fun prevMultOfThree(n: Int): Int? {
    var stringN: String = n.toString()
    var pos: Int = stringN.length + 1
    try {
        while (--pos > 0) {
            var temp: Int = (stringN.substring(0, pos)).toInt()
            if (temp % 3 == 0) return temp
        }
    } catch (e: NumberFormatException) {
        
    }
    return null
}

fun prevMultOfThree_1(n: Int): Int? {
    var temp: Int = n * 10
    while (temp > 0)
        if (temp % 3 == 0) return temp else temp /= 10
    return null
}

