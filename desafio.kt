// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }

data class Usuario(val nome: String, val matricula: Int, val email: String)

data class ConteudoEducacional(val nome: String, val duracao: Int, val nivel: Nivel)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>, val nivel: Nivel) {

    val inscritos = mutableListOf<Usuario>()

    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
    }

    fun listarInscritos() {
        for (usuario in inscritos) {
            println("Nome: ${usuario.nome} - Matricula: ${usuario.matricula} - Email: ${usuario.email}")
        }
    }

    fun listarConteudos() {
        for (conteudo in conteudos) {
            println("${conteudo.nome} - ${conteudo.duracao} Horas - ${conteudo.nivel}")
        }
    }
}

fun main() {
    val discipliasKotlin1 = ConteudoEducacional("Dominando a linguagem de programação Kotlin", 10, Nivel.BASICO)
    val discipliasKotlin2 =
        ConteudoEducacional("Refinando sua técnica com desafios de código Kotlin", 5, Nivel.INTERMEDIARIO)
    val discipliasKotlin3 = ConteudoEducacional("Fortalecendo seu perfil profissional", 5, Nivel.AVANCADO)

    val listaDisciplinas = mutableListOf<ConteudoEducacional>()
    listaDisciplinas.add(discipliasKotlin1)
    listaDisciplinas.add(discipliasKotlin2)
    listaDisciplinas.add(discipliasKotlin3)

    val kotlinExperience = Formacao("Kotlin Experience", listaDisciplinas, Nivel.BASICO)

    kotlinExperience.matricular(Usuario("Lucas Borba", 123456, "lucas@borba.com.br"))

    println("Grade Curricular: ")
    kotlinExperience.listarConteudos()
    println("")
    println("Dados do aluno: ")
    kotlinExperience.listarInscritos()
    println("")

}