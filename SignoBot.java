package bot;

import java.util.Scanner;

public class SignoBot {
    final static Scanner scanner = new Scanner(System.in); 

    public static void main(String[] args) 
    {
        saludo();
        pedirNombre();
        preguntaSigno();
        fin();
    }

    static void saludo() 
    {
        System.out.println("####################################");
        System.out.println("Hola! Mi nombre es " + "Boty" + ".");
        System.out.println("Fui creado en 2024 :)");
        System.out.println("Dime tu nombre para continuar!");
    }

    static void pedirNombre() 
    {
        String name = scanner.nextLine();
        System.out.println("Hola " + name + "!");
    }

    static void preguntaSigno() 
    {
        System.out.println("Te propongo lo siguiente..");
        System.out.println("Que te parece si adivino tu signo del sodiaco?");
        System.out.println("Quieres probar? Responde : si/no");
        String rta = scanner.nextLine();
        if (rta.equals("si")){
            pedirFechaNac();
        }
    }

    public static void pedirFechaNac() {
        System.out.println("Ingrese su fecha de nacimiento (dd/mm/yyyy): ");
        String fechaNacimiento = scanner.nextLine();

        // Separar la fecha en día, mes y año
        String[] partesFecha = fechaNacimiento.split("/");
        int dia = Integer.parseInt(partesFecha[0]);
        int mes = Integer.parseInt(partesFecha[1]);

        // Determinar el signo del zodíaco
        String signo = calcularSigno(dia, mes);

        System.out.println("*********************************************");
        System.out.println("Tu signo del zodiaco es: " + signo);
        System.out.println("*********************************************");
    }

    static String calcularSigno(int dia, int mes) 
    {
        String[] signos = {"Capricornio", "Acuario", "Piscis", "Aries", "Tauro", "Geminis", 
                           "Cancer", "Leo", "Virgo", "Libra", "Escorpio", "Sagitario"};
        
        int[] limiteSuperiorMes = {20, 19, 20, 20, 21, 21, 22, 22, 22, 22, 21, 21};

        if (dia <= limiteSuperiorMes[mes - 1]) {
            return signos[mes - 1];
        } else {
            return signos[mes % 12];
        }
    }        
    
    
    static void fin() 
    { 
        System.out.println("Gracias, que tengas un buen dia!");
        System.out.println("####################################");
    }

}