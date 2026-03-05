fun main() {

    var saldo = 0.0
    var opcao: Int

    do {
        println(" CAIXA ELETRÔNICO ")
        println("1 - Depositar")
        println("2 - Sacar")
        println("3 - Consultar saldo")
        println("4 - Sair")
        print("Escolha uma opção: ")

        opcao = readLine()?.toIntOrNull() ?: 0

        when (opcao) {

            1 -> {
                print("Digite o valor para depósito: ")
                val valor = readLine()?.toDoubleOrNull()

                if (valor != null && valor > 0) {
                    saldo += valor
                    println("Depósito realizado com sucesso!")
                } else {
                    println("Valor inválido.")
                }
            }

            2 -> {
                print("Digite o valor para saque: ")
                val valor = readLine()?.toDoubleOrNull()

                if (valor != null && valor > 0) {
                    if (valor <= saldo) {
                        saldo -= valor
                        println("Saque realizado com sucesso!")
                    } else {
                        println("Saldo insuficiente.")
                    }
                } else {
                    println("Valor inválido.")
                }
            }

            3 -> {
                println("Seu saldo atual é: R$ $saldo")
            }

            4 -> {
                println("Encerrando o sistema...")
            }

            else -> {
                println("Opção inválida. Tente novamente.")
            }
        }

    } while (opcao != 4)

}