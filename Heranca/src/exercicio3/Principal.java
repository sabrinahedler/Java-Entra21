package exercicio3;

public class Principal {

	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("marcia", 18);
		Aluno a2 = new Aluno ("fernando", 20);
		
		AlunoFurb a3 = new AlunoFurb("luis", 19, 'e', "medicina", "asad");
		AlunoFurb a4 = new AlunoFurb("paulo", 30, 'v', "educacao fisica", "aaaw");
		
		AlunoEtevi a5 = new AlunoEtevi("ricardo", 23, 3);
		AlunoEtevi a6 = new AlunoEtevi("julia", 21, 1);

		System.out.println(a1.toString());
		System.out.println(a2.toString());
		
		System.out.println(" ");
		
		a3.trancarCurso();
		System.out.println(a3.toString());
		System.out.println(a4.toString());
		
		System.out.println(" ");
		
		System.out.println(a5.toString());
		System.out.println(a6.toString());
		
	}

}
