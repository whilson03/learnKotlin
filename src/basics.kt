fun main(args: Array<String>) {
    var name = "wilson"
    println(name)

    for (i in 1..100) {
        print(" $i  ")
    }
    println()

    for (j in 12 downTo 0) {
        if (j % 2 == 0) {
            println("$j is an even number ")
        } else {
            println("$j is an odd number")
        }
    }


}