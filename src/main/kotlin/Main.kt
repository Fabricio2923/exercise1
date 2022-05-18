import kotlin.math.*

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

    // suma
    println(1+1)
    // resta
    println(4-2)
    // division
    println(4/2)
    //modulos
    println(4%2)
    //multiplicacion
    println(2*1)
    //potencia
    println(2.0.pow(2))

    //Comparacion e igual operadores
    //Igual
    println(2==2)
    // Desigual
    println(2!=2)
    // mayor que
    println(2 > 2)
    // Menor que
    println(2<2)
    // mayor o igual que
    println(2>=2)
    //menos o igual que
    println(2<=2)

    var anyNumber: Int = 0
    // operadores de asignacion
    anyNumber += 10
    anyNumber -= 2
    anyNumber *= 2
    anyNumber /= 2
    anyNumber %= 2
    // incrementador y decrementador
    anyNumber ++
    anyNumber --
    println(anyNumber)

    var isTrue:Boolean=true
    var isFalse:Boolean=false
    // operadores booleanos logicos
    // AND
    println(isTrue && isFalse)
    // OR
    println(isTrue || isFalse)
    // NOT - Tipo invertir si es verdadero lo vuelve a falso
    println(!isTrue)
    helloWorld()
    var myNumber : Int = doubletheValue(2)
    println(myNumber)
    favoriteFoodPrompt("Fabricio", "Pizza")
}

fun helloWorld(){
    println("Hello World")
}

fun doubletheValue(numberValue: Int) : Int{
    return numberValue * 2
}

fun favoriteFoodPrompt(name: String, favoriteFood: String):Unit{
    println("$name's favorite food is $favoriteFood")
}