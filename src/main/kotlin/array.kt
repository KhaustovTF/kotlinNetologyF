fun main() {
//    val number = mutableListOf<Int>(1,2,3,4,5)
//    val number2 = mutableListOf<Int>(3,4,5,6,7)
//
//    val numberF = mutableListOf<Int>()
//
//    for (i in number.indices) {
//        if (number[i] in number2){
//            numberF.add(number[i])
//        }
//    }
//
//    println(numberF)
// ////////////////////////////////////////////////////////////////////////////////////////
//
//    var text = readlnOrNull()
//    val symbol = readlnOrNull()
//    var count = 0
//
//    if (text != null) {
//        for (i in text) {
//            if (symbol == i.toString()){
//                count++
//            }
//        }
//    }
//
//    println(count)
    ////////////////////////////////////////////////////////////////////////////////////////

//    var mass1 = readln().split(" ").map(String::toInt).toMutableList()
//
//    println(mass1)
//
//    fun main() {
//
//        var mass1 = readln().split(" ").map(String::toInt).toMutableList()
//        println(mass1)
////        [1,2,3,4,5,6]
//        for (i in mass1) {
//            if (i % 2 != 0) {
//                for (e in mass1.indices) {
//                    if (mass1[e] % 2 == 0) {
//                        mass1[e] += i
//
//                    }
//                }
//                break
//            }
//        }
//        println(mass1)
//
//    }



// ///////////////////////////////////////////////////////////////////////////////////////////////////////////////

    val length = readln().toInt()

    val aray: MutableList<String> = MutableList(length) { readln() }

    var isSame = true
    for (i in aray) {
        if (aray[0]!= i ) {
            isSame = false
        }
    }


    println(isSame)







//    for (i in mass1) {
//        if (i.toInt() % 2 != 0) {
//           for (e in mass1)
//            break
//        }
//    }
}
