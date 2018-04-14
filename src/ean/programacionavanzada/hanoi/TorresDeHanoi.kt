/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * Universidad EAN (Bogotá - Colombia)
 * Departamento de Sistemas
 * Faculta de Ingeniería
 *
 * Taller Torres de Hanoi
 * Fecha: 11 de abril de 2018
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */
package ean.programacionavanzada.hanoi

/**
 * Muestra los pasos a seguir para mover todos los discos desde
 * la torre de origen a la torre de destino pasando por la torre intermedia
 */
fun hanoi(numDiscos: Int, origen: String, destino: String, intermedio: String): Unit {
    if (numDiscos == 1){
        println("mover disco "+numDiscos+" desde "+origen+" a "+destino)
    }else{
        hanoi(numDiscos - 1,origen,intermedio,destino)
        println("mover disco "+numDiscos+" desde "+origen+" a "+destino)
        hanoi(numDiscos - 1, intermedio, destino,origen)
    }
}

/**
 * Programa principal
 */
fun main(args: Array<String>) {
    hanoi(4, "A", "C", "B")
}