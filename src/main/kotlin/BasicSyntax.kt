fun main(){
    val sut: BasicSyntax = BasicSyntax()

    sut.sum(4,5)
    sut.minus(4,6)
    sut.formatText("gg","bb")
    sut.printSum(5,8)

    val a: Int = 5
    val b = 2
    val c: Int

    val createClass1 = CreateClass1(3,5)

    println(createClass1.a)
    println(createClass1.b)
    println(createClass1.c)


    // 백틱이 기본내장?!
    var 이게뭔문법이여 = 1
    val s1 = "이게뭔문법이여 is $이게뭔문법이여"

    이게뭔문법이여 = 2
    val s2 = "${s1.replace("is", "was")}, but now is $이게뭔문법이여"
    println(s2)

    val items = listOf("apple", "banana", "kiwifruit")
    for (index in items.indices) {
        println("item at $index is ${items[index]}")
    }


    // in 사용
    val x = 10
    val y = 9
    if (x in 1..y) {
        println("fits in range")
    }

    for (x in 1..5) {
        print(x)
    }

    val typeCheck = 15

    if(typeCheck is Int){
        println("true")
    }

    // 널체킹 ?문법
    var nullCheck: String? = "abc" // 'nullCheck' is nullable, origin
    nullCheck = null // now nullCheck is null
    print(nullCheck) // if this is java, it throws NPE but kotlin is not
    var nullNotCheck: String = "abc"
//    nullNotCheck = null 코틀린은 이게 안되네
//    print(nullNotCheck)

}

class BasicSyntax {

    fun sum(a: Int, b: Int){
        println(a+b)
    }

    fun minus(a: Int, b: Int) = println(a-b)

    fun formatText(a: String, b: String) = println("$a + $b 이게 됨?")

    fun printSum(a: Int, b: Int) = println("sum of $a and $b is ${a + b}")

}

// 생성자 복합선언
class CreateClass1 (var a: Int, var b: Int) {
    var c = a + b
}