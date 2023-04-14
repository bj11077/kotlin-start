fun createMemoFor(name:String): String{
    if(name == "Eve"){
        val memo = """Dear $name, a quick reminder about the
            party we have scheduled next Tuesday at
            the 'Low Ceremony Cafe' at Moon. | Please plan to..."""
        return memo
    }
    return ""
}
println(createMemoFor("Eve"))
/**
(들여쓰기적용되버림)
Dear Eve, a quick reminder about the
    party we have scheduled next Tuesday at
    the 'Low Ceremony Cafe' at Moon. | Please plan to...
 */