package area;
import java.util. Scanner; 
public class rectangulo {
static Scanner entrada;
public static void main(String[] args) {
	entrada= new Scanner (System.in);
	int a,b,r,p,ra, cir,ar;
	System.out.println("Ingresa Altura");
	a=entrada.nextInt();
	System.out.println("Ingresa Base");
	b=entrada.nextInt();
	r=a*b;
	System.out.println("El area del rectangulo es: " + r);
	p=(2*a)+(2*b);
	{
	System.out.println("El perimetro del rectangulo es: " + p);

	System.out.println("Ingresa el radio del circulo");
	ra=entrada.nextInt();
	cir=(2*ra)*3;
	 ar=3*(ra*ra);
	System.out.println("La circunferencia del circulo es: " + cir);
	System.out.println("El area del circulo es: " + ar);
	
}

}}
