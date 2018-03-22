
public class Aluno {
	private Turma turma;
	private String nome;
	private int matricula;
	private double notaMat;
	private double notaPor;
	private double notaCie;

	public Turma getTurma() {
		return turma;
	}

	public void setTurma(Turma turma) {
		this.turma = turma;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatmatricula(int mat) {
		this.matricula = mat;
	}

	public double getNotaMat() {
		return notaMat;
	}

	public boolean verifInterNota(double nota) {
		return nota <= 100;
	}

	public void setNotaMat(double notaMat) {
		if (this.verifInterNota(notaMat))
			this.notaMat = notaMat;
	}

	public double getNotaPor() {
		return notaPor;
	}

	public void setNotaPor(double notaPor) {
		if (this.verifInterNota(notaMat))
			this.notaPor = notaPor;
	}

	public double getNotaCie() {
		return notaCie;
	}

	public void setNotaCie(double notaCie) {
		if (this.verifInterNota(notaMat))
			this.notaCie = notaCie;
	}

	public Aluno(String nome, int mat, double notaMat, double notaPor, double notaCie) {
		super();
		this.nome = nome;
		this.matricula = mat;
		this.notaMat = notaMat;
		this.notaPor = notaPor;
		this.notaCie = notaCie;
	}

	public void insereTurma(Turma turma) {
		if (turma.verifMaxAlunos()) {
			turma.incAluno();
			this.setTurma(turma);
		} else
			System.out.printf("\n\nTurma cheia, aluno não matriculado.");
	}

	public void trocaTurma(Turma nova) {
		if (this.turma != null) {
			this.turma.decrAluno();
		}
		insereTurma(nova);
	}

	public double verifMedia() {
		return (this.getNotaCie() + this.getNotaMat() + this.getNotaPor()) / 3;
	}
	
	//public String imprimeAluno() {
//		return String.format("\n\nNome: %s - Matrícula: %d\n"
//				+ "", arg1)
//	}

}
