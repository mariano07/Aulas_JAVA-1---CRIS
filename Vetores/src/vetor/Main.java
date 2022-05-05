package vetor;

public class Main {
	public static int[] testeVetor(int tamanho) {
		int i=0;
		int[] vetor = new int [tamanho];
		
		for(i=0;i<vetor.length;i++) {
			if(i % 2 == 0) {
				vetor[i] = 0;
			}else {
				vetor[i] = 1;
			}
		}
		for(int elemento : vetor) {
			System.out.println(elemento);
		}
		return vetor;
	}
	public static void main(String[] args) {
		testeVetor(2);
	}
}
