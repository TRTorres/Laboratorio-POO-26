import java.util.Scanner;

public class clase2 {
    public static int suma() {
    	int num, num2,suma;
    	Scanner lectura = new Scanner(System.in);
    	System.out.print("Ingrese un numero =");
		num= lectura.nextInt();
		System.out.print("Ingrese otro numero =");
		num2= lectura.nextInt();
		suma = num + num2;
    	return suma;
    }
    
    public static int resta() {
    	int num, num2,resta;
    	Scanner lectura = new Scanner(System.in);
    	System.out.print("Ingrese un numero =");
		num= lectura.nextInt();
		System.out.print("Ingrese otro numero =");
		num2= lectura.nextInt();
		resta = num - num2;
    	return resta;
    }
    public static int multiplicacion() {
    	int num, num2,multi;
    	Scanner lectura = new Scanner(System.in);
    	System.out.print("Ingrese un numero =");
		num= lectura.nextInt();
		System.out.print("Ingrese otro numero =");
		num2= lectura.nextInt();
		multi = num * num2;
    	return multi;
    }
    public static int division() {
    	int num, num2,division;
    	Scanner lectura = new Scanner(System.in);
    	System.out.print("Ingrese un numero =");
		num= lectura.nextInt();
		System.out.print("Ingrese otro numero =");
		num2= lectura.nextInt();
		division = num / num2;
    	return division;
    }
    public static int modulo() {
    	int num, num2,modulo;
    	Scanner lectura = new Scanner(System.in);
    	System.out.print("Ingrese un numero =");
		num= lectura.nextInt();
		System.out.print("Ingrese otro numero =");
		num2= lectura.nextInt();
		modulo = num % num2;
    	return modulo;
    }
    public static void edad() {
    	/*ejercicio 3*/
		int edad;
		Scanner lectura = new Scanner(System.in);
		System.out.print("Ingrese su edad ");
		edad = lectura.nextInt();
		
		if(edad < 18)
		{
			System.out.print("Usted es menor de edad");
		}
		else if (edad > 65)
		{
			System.out.print("Usted esta jubilado/a");
		}
		else
		{
			System.out.print("Usted es mayor de edad");
		}
    }
    public static void numSecreto() {
    	int numRandom;
    	numRandom = 76;
    	Scanner lectura = new Scanner(System.in);
	    for (int i = 0; i == numRandom; i++) {
	    	System.out.print("Adivine el numero del 1 al 100" + "\n");
	    	i = lectura.nextInt();
	    	if(numRandom == i) {
	    		System.out.print("Acertaste el numero");
	    	}
	    	else if(numRandom < i) {
	    		System.out.print("Mas bajo" + "\n");
	    	}
	    	else {
	    		System.out.print("Mas alto" + "\n");
	    	}
    	}
    }

	public static void main(String[] args) {
		/*Ejercicio 2*/
		
		/*int suma = suma();
		int resta = resta();
		int multi = multiplicacion();
		int division = division();
		int modulo = modulo();
		System.out.print("La suma es "+ suma + "\n");
		System.out.print("La resta es "+ resta + "\n");
		System.out.print("La multiplicacion es " + multi + "\n");
		System.out.print("La division es " + division + "\n");
		System.out.print("El modulo es " + modulo + "\n");
		edad();*/
		numSecreto();
	}

}
