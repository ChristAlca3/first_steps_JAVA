public class TestMes {

// SWITCH es una solución para los ifs encadenados.



//¿si necesitamos hacer varias pruebas? Un ejemplo, tenemos una variable de mes, necesitamos probar su número e imprimir su mes correspondiente. Entonces, ¿vamos a hacer 12 ifs? Para estos casos, existe el switch, de cambio

//El break interrumpirá la ejecución del caso que lo contiene, de modo que los demás no se ejecutarán y, si no se aceptan condiciones, se ejecutará el código default

//Para estos casos, existe el switch, de cambio

    public static void main (String[] args) {

        int mes = 13;

        switch (mes) {
            case 1:
                System.out.println ("El mes es enero");
                break;
            case 2:
                System.out.println ("El mes es febrero");
                break;
            case 3:
                System.out.println ("El mes es marzo");
                break;
            case 4:
                System.out.println ("El mes es abril");
                break;
            case 5:
                System.out.println ("El mes es mayo");
                break;
            case 6:
                System.out.println ("El mes es junio");
                break;
            case 7:
                System.out.println ("El mes es julio");
                break;
            case 8:
                System.out.println ("El mes es agosto");
                break;
            case 9:
                System.out.println ("El mes es septiembre");
                break;
            case 10:
                System.out.println ("El mes es octubre");
                break;
            case 11:
                System.out.println ("El mes es noviembre");
                break;
            case 12:
                System.out.println ("El mes es diciembre");
                break;
            default:
                System.out.println ("Mes inválido");
                break;
        }
    }
}
