import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /**
         // Variables y tipos de datos
        int age = 18;
        byte edad = 15;
        short cuenta = -2;
        long numerosEnteros = 5;

        System.out.println(age);
        System.out.println(edad);
        System.out.println(cuenta);
        System.out.println(numerosEnteros);

        float decimales = 15.3f;
        double ultimosDecimales = 18.5;

        System.out.println(decimales);
        System.out.println(ultimosDecimales);

        boolean sonGeniales = true;
        boolean dicenVerdadoMentira = false;

        System.out.println(sonGeniales);
        System.out.println(dicenVerdadoMentira);

        char caracteres = 'a';
        System.out.println(caracteres);

        String hola = ("hola mundo");
        System.out.println(hola);

        // Tipos de datos primitivos
        String hola = "Carlos esta bien";
        System.out.println(hola);

        System.out.println(hola.length());

        String text = hola.replace("bien", "chevere");
        System.out.println(text);

        System.out.println(hola.endsWith("ien"));
        System.out.println(hola.startsWith("Car"));
        System.out.println(hola.contains("arl"));
        System.out.println(hola.indexOf("bien"));
        System.out.println(text.toUpperCase());
        System.out.println(text.toLowerCase());

        String espacios = " fuego avanzar ";
        System.out.println(espacios.trim());

        String comi = "\"Hola Mundo\" ";
        System.out.println(comi);

        String hast = "Hola \nworld";
        System.out.println(hast);

        String tabu = "Hello \ttabu";
        System.out.println(tabu);

        //Arrays
        int [] numeros = new int[5];

        numeros[0] = 5;
        numeros[4] = 8;
        numeros[2] = 3;
        Arrays.sort(numeros);
        System.out.println(Arrays.toString(numeros));

        */

        /*Actividad 1: Manipulador de Rutas de Sistema
        En esta actividad practicarás la concatenación, el uso de caracteres de escape (que acabas de aprender a poner con tu teclado) y métodos de búsqueda en String.
        1.Crea una variable String llamada directorio que contenga una ruta de Windows (ejemplo: C:\Proyectos\Java\Index.java). Recuerda usar la doble barra \\ para que Java no se confunda.
        2.Muestra en consola cuántos caracteres tiene esa ruta.
        3.Usa un método para transformar toda la ruta a MAYÚSCULAS.
        4.Crea una nueva variable llamada nuevaRuta que cambie la palabra "Java" por "Python" dentro de ese String.
        5.Imprime un booleano (true/false) que indique si la ruta original empieza con la letra "C".


        //1
        String directorio = "C:\\Usuario\\Pepe\\Desktop";
        //2
        System.out.println(directorio.length());
        //3
        System.out.println(directorio.toUpperCase());
        //4
        String nuevaRuta = "java";
        System.out.println(nuevaRuta.replace("java", "Phyton"));
        //5
        System.out.println(directorio.startsWith("C"));*/


        /*Actividad 2: Ranking de Puntajes (Arrays)
        Aquí aplicarás la estructura de Arrays y el método de ordenamiento que ya usaste en tu ejemplo.
        1.Declara un array de enteros llamado puntajes con espacio para 6 elementos.
        2.Asigna valores desordenados a cada posición (ejemplo: 85, 12, 45, 90, 3, 22).
        3.Utiliza la clase Arrays para ordenar los números de menor a mayor.
        4.Imprime el array completo usando Arrays.toString().
        5.Muestra por separado cuál fue el puntaje más bajo y cuál el más alto accediendo directamente a los índices del array (el primero y el último).

        //1
        int[] puntajes = new int[6];
        //2
        puntajes [3] = 85;
        puntajes [2] = 12;
        puntajes [0] = 45;
        puntajes [1] = 90;
        puntajes [5] = 3;
        puntajes [4] = 22;
        //3
        Arrays.sort(puntajes);
        //4
        System.out.println(Arrays.toString(puntajes));
        //5
        int bajo = puntajes[0];
        int alto = puntajes[5];
        System.out.println("El valor mas bajo es " + bajo + " y el puntaje mas alto fue " + alto);*/

        // multiples dimensiones
       /* int [][] numeros = {{1,2},{3,4}};

        System.out.println(Arrays.deepToString(numeros));

        int [][] dimensiones = new int [3][2];
        dimensiones [0][0] = 5 ;
        dimensiones [0][1] = 6;
        dimensiones [1][0] = 7;
        dimensiones [1][1] = 8;
        dimensiones [2][0] = 9;
        dimensiones [2][1] = 10;

        System.out.println(Arrays.deepToString(dimensiones));

        //constante
        final String saludo = "Epale gente";
        //chevere = saludo;
        System.out.println(saludo);

        //Comentarios

        //Operadores aritmeticos

        int a = 2+2;
        int b = 2-2;
        int c = 2*2;
        int d = 10 / 3;
        int m =  4 % 3;

        //Divisiones con decimales
        //float e = 10f / 3f;
        double e = 10.0 / 3.0;
        System.out.println(e);

        //incremento en el numero
        int x = 5;
        //++x;

        int y = ++x;
        System.out.println(x);*/

        /*Actividad 1: El Inventario de la Tienda (Matrices y Constantes)
        1.Declara una matriz de enteros llamada inventario con 2 filas y 3 columnas.
        2.Asigna un valor diferente a cada una de las 6 posiciones de la matriz utilizando los índices (ejemplo: [0][0], [0][1], etc.).
        3.Imprime la matriz completa en una sola línea de consola usando el método visto en tus apuntes para arreglos multidimensionales.
        4.Declara una constante de tipo entero llamada CAPACIDAD_MAXIMA con el valor 100.
        5.Imprime un mensaje que concatene un texto con el valor de esa constante.*/

        //1

        int [][] inventario = new int[3][2];

        //2
        inventario [0][0] = 2;
        inventario [0][1] = 3;
        inventario [1][0] = 4;
        inventario [1][1] = 5;
        inventario [2][0] = 6;
        inventario [2][1] = 7;

        //3
        System.out.println(Arrays.deepToString(inventario));

        //4
        final int CAPACIDAD_MAXIMA = 100;

        System.out.println("La capacidad maxima de personas permitidas en el ascensor es de " + CAPACIDAD_MAXIMA);

        /*Actividad 2: Calculadora de Gastos (Aritmética y Precisión)
        1.Declara una variable entera totalCuenta con el valor 500.
        2.Declara una variable entera amigos con el valor 3.
        3.Calcula la división y guárdala en una variable de tipo double llamada pagoIndividual. Importante: Asegúrate de que el resultado muestre los decimales correctamente (que no salga truncado).
        4.Usa el operador de módulo (%) para obtener el residuo de totalCuenta entre amigos e imprímelo con un mensaje descriptivo.
        5.Declara una variable x con el valor 10. Usa el operador de incremento de modo que, al asignarlo a una nueva variable y, el valor de x se incremente antes de la asignación. Imprime ambos valores.*/

        //1
        int totalCuenta = 500;
        //2
        int amigos = 3;
        //3
        double pagoIndividual = 500.0/3.0;
        System.out.println(pagoIndividual);
        //4
        int residuo = totalCuenta % amigos;
        System.out.println("Del dinero completo solo nos quedan " + residuo + " euros");
        //5
        int x = 10;
        int y = ++x;
        System.out.println(y);


    }
}