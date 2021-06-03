import java.util.Scanner;
public class ClassNextLevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		//Notas do 1º Bimestre
		
		System.out.print("Digite a sua nota da 1ª prova: ");
		double ProvaN1 = sc.nextDouble();
		System.out.print("Digite a sua nota do Projeto do 1º Bimestre: ");
		double ProjetoN1 = sc.nextDouble();
		System.out.print("Digite a sua nota da Lista de Exercícios do 1º Bimestre: ");
		double ExercicioN1 = sc.nextDouble();
		System.out.print("Digite a sua nota dos projetos de software livre e conclusão de MOOCs do 1º Bimestre: ");
		double MoocN1 = sc.nextDouble();

		double MediaN1 = ((ProvaN1 * 3)+(ProjetoN1 * 3)+(ExercicioN1 * 2)+(MoocN1 * 3))/(3+3+2+3); 

		System.out.println("");
		System.out.println("Média do 1º Bimestre = " + MediaN1);

		//Notas do 2º Bimestre
		
		System.out.print("Digite a sua nota da 2ª prova: ");
		double ProvaN2 = sc.nextDouble();
		System.out.print("Digite a sua nota do Projeto do 2º Bimestre: ");
		double ProjetoN2 = sc.nextDouble();
		System.out.print("Digite a sua nota da Lista de Exercícios do 2º Bimestre: ");
		double ExercicioN2 = sc.nextDouble();
		System.out.print("Digite a sua nota dos projetos de software livre e conclusão de MOOCs do 2º Bimestre: ");
		double MoocN2 = sc.nextDouble();

		double MediaN2 = ((ProvaN2 * 3)+(ProjetoN2 * 3)+(ExercicioN2 * 2)+(MoocN2 * 3))/(3+3+2+3); 

		System.out.println("");
		System.out.println("Média do 1º Bimestre = " + MediaN2);

		//Notas do 3º Bimestre
		
		System.out.print("Digite a sua nota da 3ª prova: ");
		double ProvaN3 = sc.nextDouble();
		System.out.print("Digite a sua nota do Projeto do 3º Bimestre: ");
		double ProjetoN3 = sc.nextDouble();
		System.out.print("Digite a sua nota da Lista de Exercícios do 3º Bimestre: ");
		double ExercicioN3 = sc.nextDouble();
		System.out.print("Digite a sua nota dos projetos de software livre e conclusão de MOOCs do 3º Bimestre: ");
		double MoocN3 = sc.nextDouble();

		double MediaN3 = ((ProvaN3 * 3)+(ProjetoN3 * 3)+(ExercicioN3 * 2)+(MoocN3 * 3))/(3+3+2+3); 

		System.out.println("");
		System.out.println("Média do 1º Bimestre = " + MediaN3);
		

		// Cálculo da Média do Semestre
		
		double MediaSemestre = (MediaN1 + MediaN2 + MediaN3)/3;
		boolean Resultado = MediaSemestre >= 8;

		System.out.println("A média do Semestre é = " + MediaSemestre+" Aluno foi Aprovado? Resposta: "+Resultado);

		// Soma da nota final
		if (MediaSemestre<8) {
			double NotaFinal = 10 - MediaSemestre;
			System.out.println("Nota mínima na Prova final deverá ser = " + NotaFinal);
		}

		sc.close();
	}

}
