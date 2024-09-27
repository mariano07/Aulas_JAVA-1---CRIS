package exercicio;

public abstract class Calculos implements Formas {

	@Override
	public double perimetroQuadri(double base1, double altura1,double base2,double altura2) {
		double i;
		i = base1 + base2 + altura1 + altura2 ;
		return i;
	}
	
	@Override
	public double perimetroRetan(double base,double altura) {
		double i;
		i = (base+altura)*2 ;
		return i;
	}
	
	@Override
	public double perimetroQuadra(double lado) {
		double i;
		i = lado*4 ;
		return i;
	}
	
	@Override
	public double perimetroCircu(double raio) {
		double i;
		i = 2*3.14*raio ;
		return i;
	}
}
