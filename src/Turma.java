
public class Turma {
	private String nome;

	public Turma(String nome, String turno, String periodo, int qntAlunos, int maxAlunos, Escola escola) {
		super();
		this.nome = nome;
		this.turno = turno;
		this.periodo = periodo;
		this.qntAlunos = qntAlunos;
		this.maxAlunos = maxAlunos;
		this.escola = escola;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	private String turno;
	private String periodo;
	private int qntAlunos;
	private int maxAlunos;
	private Escola escola;

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	public String getPeriodo() {
		return periodo;
	}

	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}

	public int getQntAlunos() {
		return qntAlunos;
	}

	public void setQntAlunos(int qntAlunos) {
		this.qntAlunos = qntAlunos;
	}

	public void incAluno() {
		this.qntAlunos++;
	}

	public void decrAluno() {
		if (qntAlunos > 0)
			this.qntAlunos--;
	}

	public int getMaxAlunos() {
		return maxAlunos;
	}

	public Escola getEscola() {
		return escola;
	}

	public void setEscola(Escola escola) {
		this.escola = escola;
	}

	public void setMaxAlunos(int maxAlunos) {
		this.maxAlunos = maxAlunos;
	}

	public boolean verifMaxAlunos() {
		return this.qntAlunos < this.getMaxAlunos();

	}

	public String imprimeTurma() {
		return String.format(
				"\n\nTurma: %s - Turno: %s - Período: %s\n"
						+ "Alunos matriculados: %d - Máximo de Alunos Permitidos: %d\n" + "Escola: %s",
				getNome(), getTurno(), getPeriodo(), getQntAlunos(), getMaxAlunos(), getEscola().getNome());
	}

}
