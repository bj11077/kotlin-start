// 코틀린은 null참조를 안전하게해줌 널포인터안뜸

println("hi"=="hi");
println("hi"=="Hi");
println(null=="hi");
println("hi"==null);
println(null==null);

/**
true
false
false
false
true
equality.kts:5:9: warning: condition 'null=="hi"' is always 'false'
println(null=="hi");
^
equality.kts:6:9: warning: condition '"hi"==null' is always 'false'
println("hi"==null);
^
equality.kts:7:9: warning: condition 'null==null' is always 'true'
println(null==null);
^
 */