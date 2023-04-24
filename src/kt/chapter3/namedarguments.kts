fun createPerson(name:String, age: Int = 1, height: Int, weight: Int){
    println("$name $age $height $weight")
}

// 가독성 안좋음
//createPerson("Jake",12,152,43)
createPerson(name = "Jake", age = 12, height = 152, weight = 43)
createPerson(name = "Jake", age = 12, 152, weight = 43)

createPerson(name = "Jake",  height = 152, weight = 43)
createPerson("Jake",  height = 152, weight = 43)


