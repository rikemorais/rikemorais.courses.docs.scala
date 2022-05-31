object TestaCalculadora {
    
    def main(args: Array[String]): Unit = {
        val calc = new Calculadora()
        val resultado = calc.soma(10, 20)
        println(s"O resultado é $resultado")
    }
}