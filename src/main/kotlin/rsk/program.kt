package rsk

fun main(args:Array<String>){
    var program= Program()
    // a variable to get the total of all numbers
    var total=0
    //program.fibonacci(8)

    //object:Process will create an anonymous class
//    program.fibonacci(8,object :Process{
//        override fun execute(value: Int) {
//            println(value)
////        }
//
//    })

    //n is used to create a lambda that is used to pass a function
    //program.fibonacci(8, {n ->println(n)})
    program.fibonacci(8,{it->total+=it})
    println(total)
}
interface Process {
    fun execute(value: Int)
}
class Program{
    fun fibonacci(limit:Int, action: (Int)->Unit){
        var prev=0
        var prevprev=0
        var current=1
        for (i:Int in 1..limit){
            action(current)
            var temp=current
            prevprev=prev
            prev=temp
            current=prev+prevprev
        }
    }
//    class Program{
//        fun fibonacci(limit:Int, action: Process){
//            var prev=0
//            var prevprev=0
//            var current=1
//            for (i:Int in 1..limit){
//                action.execute(current)
//                var temp=current
//                prevprev=prev
//                prev=temp
//                current=prev+prevprev
//            }
//        }
    fun fibonacci(limit:Int){
        var prev=0
        var prevprev=0
        var current=1
        for (i:Int in 1..limit){
            println(current)
            var temp=current
            prevprev=prev
            prev=temp
            current=prev+prevprev
        }
}}