fun max(vararg numbers: Int):Int{
    var large = Int.MIN_VALUE
    for(number in numbers){
        large = if(number > large) number else large
    }
    return large
}
val values = intArrayOf(1,21,3)
println(max(1,5,2))
// 자바의 ...같은대 대신 배열로받음


// 이건좀
println(max(values[0],values[1],values[2]))

// 스프레드 연산자 *
println(max(*values))

// 리스트를 스프레드 연산자로 바로바꿀순없고 리스트를 배열로 바꿔서 스프레드를 사용하면됨
println(max(*listOf(1,4,18,12).toIntArray()))
