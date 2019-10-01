fun main(){
	
	var aluno: Aluno = readAluno()
	showMedia(aluno)
}
private fun readAluno(): Aluno {
	println("Digite o nome do aluno: ")
	val nome = readLine()
	println("Digite o nome do aluno: ")
	val n1 = readNota()
	println("Digite o nome do aluno: ")
	val n2 = readNota()
	println("Digite o nome do aluno: ")
	val n3 = readNota()
	println("Digite o nome do aluno: ")
	val n4 = readNota()
	return Aluno(nome,n1,n2,n3,n4)
}
private fun showMedia(aluno: Aluno) {
	val media = (aluno.n1+aluno.n2+aluno.n3+aluno.n4)/4
	println("\nNome: "+aluno.nome)
	println("Média: $media")
}
private fun readNota(): Double {
	var nota = readLine()
	try{
		nota = nota!!.replace(",",".")
		val y = nota.toDouble()
	if(y > 10) {
			println("Nota maior que 10, valor = 10.")
			return 10.0
			}
		else if(y < 0.0) {
			println("Nota menor que 0, valor = 0.")
			return 0.0
			}
		else {
			return y
		}
	} catch (e: NumberFormatEception){
		println("Não foi digitado um número válido, valor = 0.")
		return 0.0
	}
}
data class Aluno(
	var nome: String?
	var n1: Double = 0.0,
	var n2: Double = 0.0,
	var n3: Double = 0.0,
	var n4: Double = 0.0
)
