
public class main {

	public static void main(String[] args) {
		Escola escolaA = new Escola("E.E. Emmett Brown", "Rua Antiga, 84 - Bairro Novo", "31 3252-0000");
		Turma turmaA = new Turma("Matemática", "Manhã", "Primeiro", 0, 2, escolaA);
		Turma turmaB = new Turma("Português", "Manhã", "Primeiro", 0, 2, escolaA);
		Turma turmaC = new Turma("Ciências", "Manhã", "Primeiro", 0, 2, escolaA);
		Aluno alunoX = new Aluno("Antônio", 123, 90, 80, 75);
		Aluno alunoY = new Aluno("Eduardo", 456, 90, 20, 55);
		Aluno alunoW = new Aluno("Carla", 999, 90, 30, 75);
		Aluno alunoZ = new Aluno("Juliana", 888, 70, 80, 75);

		System.out.printf("Escola:\n" + "Nome: %s" + "\nEndereço: %s - Telefone: %s", escolaA.getNome(),
				escolaA.getEndereco(), escolaA.getTelefone());

		System.out.printf(turmaA.imprimeTurma());
		alunoX.insereTurma(turmaA);
		System.out.printf(turmaA.imprimeTurma());
		alunoY.insereTurma(turmaA);
		System.out.printf(turmaA.imprimeTurma());
		alunoZ.insereTurma(turmaA);
		System.out.printf(turmaB.imprimeTurma());
		alunoY.trocaTurma(turmaB);
		System.out.printf(turmaA.imprimeTurma());
		System.out.printf(turmaB.imprimeTurma());
		System.out.printf(
				"\n\nAluno: %s - Matrícula: %s - Turma: %s\n"
						+ "Nota Português: %f - Nota Matemática: %f - Nota Ciências: %f\n" + "Média das Notas: %f",
				alunoX.getNome(), alunoX.getMatricula(), alunoX.getTurma().getNome(), alunoX.getNotaPor(),
				alunoX.getNotaMat(), alunoX.getNotaCie(), alunoX.verifMedia());

	}

}
