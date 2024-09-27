package exercicio;

public interface Formas {
	
	double perimetroQuadri(double base1,double altura1,double base2,double altura2);
	
	default double calcularPerimetro1(double base1,double altura1,double base2,double altura2) {
		double i;
		i = base1 + base2 + altura1 + altura2 ;
		return i;
	}
	
	double perimetroRetan(double base,double altura);
	
	default double calcularPerimetro2(double base,double altura) {
		double i;
		i = (base+altura)*2;
		return i;
	}
	
	double perimetroQuadra(double lado);
	
	default double calcularPerimetro3(double lado) {
		double i;
		i = lado*4;
		return i;
	}
	
	double perimetroCircu(double raio);
	
	default double calcularPerimetro4(double raio) {
		double i;
		i = 2*3.14*raio;
		return i;
	}
}
