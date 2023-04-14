fun createMemoFor(name:String): String{
    if(name == "Eve"){
        val memo = """Dear $name, a quick reminder about the
            |party we have scheduled next Tuesday at
            |the 'Low Ceremony Cafe' at Noon. | Please plan to...""".trimMargin()
        return memo
    }
    return ""
}
println(createMemoFor("Eve"))
/**
(|쓰면  들여쓰기없어짐)
Dear Eve, a quick reminder about the
party we have scheduled next Tuesday at
the 'Low Ceremony Cafe' at Noon. | Please plan to...
 */