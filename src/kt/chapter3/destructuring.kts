fun getFullName() = Triple("John","Quincy","Adams")

println(getFullName())

val result = getFullName()

//val first = result.first
//
//val middle =result.second
//
//val last = result.third
//
//println("$first $middle $last")


// same
val (first,middle,last) = getFullName()
println("$first $middle $last")

// skip
//val (first,_,last) = getFullName()
//val (_,middle) = getFullName()
