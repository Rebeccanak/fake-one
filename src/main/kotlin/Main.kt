fun main(){
    printlnName("Becky")
    printlnName("John")

    var x=getmodulus(45,59)
    println(x)
}
fun printlnName(Name:String){
    println("Hello $Name")
}
fun getmodulus(num1:Int, num2:Int): Int{
    var modulus = num1%num2
    return modulus
}
fun addition(num1:Int, num2:Int, num3:Int, num4:Int): Int{
    var addition = num1+num2+num3+num4
    return addition

    }
