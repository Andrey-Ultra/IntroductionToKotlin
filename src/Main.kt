fun main(){
    var x = readLine()!!.toInt()
    var i = 0
    var x1 = 0
    var x2 = 1
    do{
        println(x2)
        var a = x2
        x2 = x2+x1
        x1 = a
        i++
    }
    while(i<x)
}




