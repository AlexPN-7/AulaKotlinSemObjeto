package br.digital.com.aulakotlinsemobjeto
fun main() {
    println("Hello World!")
    println(meuNome("Alex", "Porto"))
    var lista = arrayListOf<String>()
    lista.add("primeiroItem")
    print(lista[0])
}
fun meuNome(nome: String, sobrenome: String) :String {
    return nome + sobrenome
}
