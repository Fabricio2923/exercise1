//fun main(){
//    println("Hello")
//}

//fun main(args: Array<String>){
//    println(args.contentToString())
//}

// datos generales que hay
// boolean (size 1bit) representa false/true
// byte (size 8bit) -127 to 128
// char (size 16bit) caracter "a" to "z" "/n"
// double (size 64bit)
// float (size 32bit)
// int (size 32bit) num enteros
// long (size 64bit)
// short (size 16bit) none
fun main(){
    // val es un tipo de variable que NO SE PUEDE MODIFICAR
    // val palabra reservada
    val  dayOfBirth : Int = 20
    val monthOfBirth : Int = 1
    println("My birthday is  $dayOfBirth/$monthOfBirth")
    // ó
    //println("My birthday is: " + dayOfBirth + "/" + monthOfBirth)

    // para variables que se puede ser alteradas
    var name: String = "Fabricio"
    var lastname: String = "Jaramillo"
    //uppercase sirve para que se ponga en mayus
    //lowercase sirve para que se ponga en minuscula
    println("My name is:  ${name.uppercase()}  ${lastname.lowercase()}")
    println("My name is: " + name + "-" + lastname)
    name = "Antonio"
    println("My name is $name $lastname")
}
