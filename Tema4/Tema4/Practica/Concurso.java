package Tema4.Practica;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Concurso {
    private static ArrayList<Pregunta> preguntas = new ArrayList<>();
    private static ArrayList<Regalo> regalos = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    private static Desafio[][] cuadriculaPreguntas = new Desafio[5][5];
    private static int[][] cuadricula = new int[5][5];
    private static Concursante concursante;
    public static void main(String[] args) {
        crearCuadricula();
        crearRegalos();
        crearConcursante();
        menu();
    }
    public static void introducirDatosCuadricula(){
        for (int i = 0; i < cuadriculaPreguntas.length; i++) {
            for (int j = 0; j < cuadriculaPreguntas[i].length; j++) {
                cuadriculaPreguntas[i][j] = new Desafio(preguntas.get(i), regalos.get(i));
            }
        }
    }
    public static void crearRegalos(){
        regalos.add(new Regalo("Vale de compra"));
        regalos.add(new Regalo("Smartphone"));
        regalos.add(new Regalo("Tarjeta de regalo"));
        regalos.add(new Regalo("Viaje todo incluido"));
        regalos.add(new Regalo("Ordenador portátil"));
        regalos.add(new Regalo("Televisor 4K"));
        regalos.add(new Regalo("Tablet"));
        regalos.add(new Regalo("Cámara digital"));
        regalos.add(new Regalo("Bono de spa"));
        regalos.add(new Regalo("Par de entradas VIP para un evento"));
        regalos.add(new Regalo("Consola de videojuegos"));
        regalos.add(new Regalo("Par de entradas para un concierto"));
        regalos.add(new Regalo("Bicicleta"));
        regalos.add(new Regalo("Set de cocina gourmet"));
        regalos.add(new Regalo("Dron"));
        regalos.add(new Regalo("Auriculares inalámbricos"));
        regalos.add(new Regalo("Libro electrónico"));
        regalos.add(new Regalo("Kit de herramientas"));
        regalos.add(new Regalo("Sesión de masajes"));
        regalos.add(new Regalo("Sistema de sonido envolvente"));
        regalos.add(new Regalo("Suscripción a servicio de streaming"));
        regalos.add(new Regalo("Cheque regalo para cena en restaurante"));
        regalos.add(new Regalo("Kit de fitness"));
        regalos.add(new Regalo("Caja de vinos selectos"));
        regalos.add(new Regalo("Entrada a parque de atracciones"));
    }
    public static Concursante crearConcursante(){
        System.out.print("Porfavor introduce tu nombre:");
        String nombre = scanner.next();
        concursante = new Concursante(nombre);
        return concursante;
    }
    public static void menu(){
        int opcion;
        do {
            System.out.print("Opciones preguntas:\n" +
                    "1. Abiertas\n" +
                    "2. Multiple\n" +
                    "3. Verdadero o falso\n" +
                    "Elige una opción: ");
            opcion = scanner.nextInt();
        } while (opcion > 3 && opcion < 1);
        System.out.println(" ");
        switch (opcion){
            case 1:
                System.out.println("Has elegido preguntas abiertas");
                crearPreguntasAbiertas();
                break;
            case 2:
                System.out.println("Has elegido preguntas multiples");
                crearPreguntasMultiples();
                break;
            case 3:
                System.out.println("Has elegido preguntas de verdadero o falso");
                crearPreguntasVerdaderoFalso();
                break;
        }
        introducirDatosCuadricula();
        int numPregunta;
        while (true){
            printMatrix();
            System.out.print("Elige un número para responder la pregunta:");
            numPregunta = scanner.nextInt();
            System.out.println(Arrays.deepToString(cuadriculaPreguntas));
            switch (opcion){
                case 1,3:
                    System.out.print("Porfavor conteste a la pregunta:  ");
                    String respuesta = scanner.next();
                    preguntas.get(numPregunta - 1).comprobarRespuesta(respuesta);
                    break;
                case 2:
                    System.out.print("Porfavor conteste a la pregunta:  ");
                    respuesta = scanner.next();
                    if (preguntas.get(numPregunta - 1).comprobarRespuesta(respuesta)) {
                    System.out.println("¡Enhorabuena! Has ganado.");
                    concursante.setPremio(regalos.get(numPregunta - 1));
                } else {
                    System.out.println("Lo siento, respuesta incorrecta.");
                }
                    break;
            }
        }
    }
    public static void crearPreguntasAbiertas(){
        preguntas.add(new Abierta("¿Cuál es el nombre del personaje principal en la serie 'Breaking Bad'?", "Walter White"));
        preguntas.add(new Abierta("¿Quién es el director de la película 'Inception'?", "Christopher Nolan"));
        preguntas.add(new Abierta("¿Qué actor interpretó a Spider-Man en la trilogía dirigida por Sam Raimi?", "Tobey Maguire"));
        preguntas.add(new Abierta("¿Cuál es el nombre de la fortaleza voladora en 'Star Wars' utilizada por la Alianza Rebelde?", "Halcón Milenario"));
        preguntas.add(new Abierta("¿Cuál es el nombre del protagonista en la serie 'The Walking Dead'?", "Rick Grimes"));
        preguntas.add(new Abierta("¿Qué actriz interpreta a Katniss Everdeen en la saga 'The Hunger Games'?", "Jennifer Lawrence"));
        preguntas.add(new Abierta("¿Quién escribió la serie de libros 'Game of Thrones'?", "George R. R. Martin"));
        preguntas.add(new Abierta("¿Cuál es el nombre del androide interpretado por Arnold Schwarzenegger en la película 'The Terminator'?", "T-800"));
        preguntas.add(new Abierta("¿Cuál es el nombre del actor que interpreta a James Bond en 'Skyfall'?", "Daniel Craig"));
        preguntas.add(new Abierta("¿Qué famoso director de cine dirigió la trilogía de 'El Padrino'?", "Francis Ford Coppola"));
        preguntas.add(new Abierta("¿Quién escribió la novela 'Moby Dick'?", "Herman Melville"));
        preguntas.add(new Abierta("¿Cuál es el nombre del personaje principal en la serie 'The Office'?", "Michael Scott"));
        preguntas.add(new Abierta("¿Qué instrumento tocaba Jimi Hendrix?", "Guitarra eléctrica"));
        preguntas.add(new Abierta("¿En qué país se encuentra la Torre Eiffel?", "Francia"));
        preguntas.add(new Abierta("¿Qué científico propuso la teoría de la relatividad?", "Albert Einstein"));
        preguntas.add(new Abierta("¿Cuál es el río más largo del mundo?", "El río Amazonas"));
        preguntas.add(new Abierta("¿Cuál es el metal más abundante en la corteza terrestre?", "Aluminio"));
        preguntas.add(new Abierta("¿Quién pintó la Mona Lisa?", "Leonardo da Vinci"));
        preguntas.add(new Abierta("¿En qué año se produjo la Revolución Francesa?", "1789"));
        preguntas.add(new Abierta("¿Cuál es la capital de Australia?", "Canberra"));
        preguntas.add(new Abierta("¿Cuál es el nombre del protagonista en la serie 'The Simpsons'?", "Homero Simpson"));
        preguntas.add(new Abierta("¿Quién fue el primer presidente de los Estados Unidos?", "George Washington"));
        preguntas.add(new Abierta("¿En qué año llegó el hombre a la Luna por primera vez?", "1969"));
        preguntas.add(new Abierta("¿Qué elemento químico tiene el símbolo 'Fe'?", "Hierro"));
        preguntas.add(new Abierta("¿Cuál es la montaña más alta del mundo?", "El Monte Everest"));

    }
    public static void crearPreguntasVerdaderoFalso(){
        preguntas.add(new VerdaderoFalso("Breaking Bad se desarrolla en Albuquerque, Nuevo México", true));
        preguntas.add(new VerdaderoFalso("El personaje principal de Friends es Joey Tribbiani", false));
        preguntas.add(new VerdaderoFalso("The Office es una adaptación de una serie británica del mismo nombre", true));
        preguntas.add(new VerdaderoFalso("Game of Thrones está basada en una serie de libros escrita por George R. R. Martin", true));
        preguntas.add(new VerdaderoFalso("La trilogía The Lord of the Rings fue dirigida por Steven Spielberg", false));
        preguntas.add(new VerdaderoFalso("La película Titanic está ambientada durante la Primera Guerra Mundial", false));
        preguntas.add(new VerdaderoFalso("Stranger Things está ambientada en los años 80", true));
        preguntas.add(new VerdaderoFalso("El personaje principal de Breaking Bad se llama Walter White", true));
        preguntas.add(new VerdaderoFalso("La película Jurassic Park es una adaptación de una novela de Michael Crichton", true));
        preguntas.add(new VerdaderoFalso("The Walking Dead se desarrolla en un mundo post-apocalíptico invadido por zombies", true));
        preguntas.add(new VerdaderoFalso("El personaje de Harry Potter es interpretado por Daniel Radcliffe en todas las películas de la saga", true));
        preguntas.add(new VerdaderoFalso("The Simpsons es la serie de televisión más larga de la historia", true));
        preguntas.add(new VerdaderoFalso("The Big Bang Theory se centra en un grupo de científicos que trabajan en un laboratorio", false));
        preguntas.add(new VerdaderoFalso("El actor Hugh Laurie interpreta a un doctor en la serie House", true));
        preguntas.add(new VerdaderoFalso("La La Land ganó el premio a la Mejor Película en los Premios Oscar de 2017", false));
        preguntas.add(new VerdaderoFalso("Breaking Bad cuenta la historia de un profesor de química que se convierte en fabricante de drogas", true));
        preguntas.add(new VerdaderoFalso("Friends es una serie de televisión británica", false));
        preguntas.add(new VerdaderoFalso("El personaje de Darth Vader aparece en todas las películas de Star Wars", true));
        preguntas.add(new VerdaderoFalso("The Crown es una serie que narra la vida de la Reina Isabel II de Inglaterra", true));
        preguntas.add(new VerdaderoFalso("El actor Johnny Depp interpreta a Jack Sparrow en la saga de Pirates of the Caribbean", true));
        preguntas.add(new VerdaderoFalso("The Matrix fue dirigida por los hermanos Wachowski", true));
        preguntas.add(new VerdaderoFalso("La película Forrest Gump está basada en una novela de Stephen King", false));
        preguntas.add(new VerdaderoFalso("Grey's Anatomy es una serie médica que se desarrolla en un hospital ficticio de Seattle", true));
        preguntas.add(new VerdaderoFalso("El personaje de Sherlock Holmes es interpretado por Benedict Cumberbatch en la serie Sherlock", true));
        preguntas.add(new VerdaderoFalso("Toy Story es la primera película animada realizada completamente por computadora", true));
    }
    public static void crearPreguntasMultiples(){
        ArrayList<String> opciones1 = new ArrayList<>();
        opciones1.add("Chris Hemsworth");
        opciones1.add("Robert Downey Jr.");
        opciones1.add("Chris Evans");
        preguntas.add(new Multiple("¿Quién interpretó a Iron Man en las películas de Marvel?", opciones1, 'b'));
        ArrayList<String> opciones2 = new ArrayList<>();
        opciones2.add("Draco Malfoy");
        opciones2.add("Ron Weasley");
        opciones2.add("Harry Potter");
        preguntas.add(new Multiple("¿Cuál es el nombre del protagonista de la saga de libros y películas 'Harry Potter'?", opciones2, 'c'));
        ArrayList<String> opciones3 = new ArrayList<>();
        opciones3.add("El Hobbit");
        opciones3.add("El Señor de los Anillos");
        opciones3.add("Narnia");
        preguntas.add(new Multiple("¿Qué saga literaria fue escrita por J.R.R. Tolkien?", opciones3, 'b'));
        ArrayList<String> opciones4 = new ArrayList<>();
        opciones4.add("Scarlett Johansson");
        opciones4.add("Jennifer Lawrence");
        opciones4.add("Natalie Portman");
        preguntas.add(new Multiple("¿Quién interpretó a Black Widow en las películas de Marvel?", opciones4, 'a'));
        ArrayList<String> opciones5 = new ArrayList<>();
        opciones5.add("Neo");
        opciones5.add("Morpheus");
        opciones5.add("Trinity");
        preguntas.add(new Multiple("¿Cuál es el nombre del personaje principal de 'The Matrix'?", opciones5, 'a'));
        ArrayList<String> opciones6 = new ArrayList<>();
        opciones6.add("Voldemort");
        opciones6.add("Albus Dumbledore");
        opciones6.add("Severus Snape");
        preguntas.add(new Multiple("¿Quién es el principal antagonista en la saga de 'Harry Potter'?", opciones6, 'a'));
        ArrayList<String> opciones7 = new ArrayList<>();
        opciones7.add("Tony Stark");
        opciones7.add("Steve Rogers");
        opciones7.add("Bruce Banner");
        preguntas.add(new Multiple("¿Cuál es el nombre real de Iron Man en las películas de Marvel?", opciones7, 'a'));
        ArrayList<String> opciones8 = new ArrayList<>();
        opciones8.add("Heath Ledger");
        opciones8.add("Joaquin Phoenix");
        opciones8.add("Jack Nicholson");
        preguntas.add(new Multiple("¿Quién interpretó al Joker en la película 'The Dark Knight'?", opciones8, 'a'));
        ArrayList<String> opciones9 = new ArrayList<>();
        opciones9.add("Gandalf");
        opciones9.add("Saruman");
        opciones9.add("Radagast");
        preguntas.add(new Multiple("¿Quién es el mago gris en la saga de 'El Señor de los Anillos'?", opciones9, 'a'));
        ArrayList<String> opciones10 = new ArrayList<>();
        opciones10.add("Christopher Nolan");
        opciones10.add("James Cameron");
        opciones10.add("Steven Spielberg");
        preguntas.add(new Multiple("¿Quién dirigió la trilogía 'The Dark Knight'?", opciones10, 'a'));
        ArrayList<String> opciones11 = new ArrayList<>();
        opciones11.add("Jack Sparrow");
        opciones11.add("Davy Jones");
        opciones11.add("Barbanegra");
        preguntas.add(new Multiple("¿Cuál es el nombre del capitán pirata en la saga 'Pirates of the Caribbean'?", opciones11, 'a'));
        ArrayList<String> opciones12 = new ArrayList<>();
        opciones12.add("Tom Hiddleston");
        opciones12.add("Chris Hemsworth");
        opciones12.add("Chris Evans");
        preguntas.add(new Multiple("¿Quién interpreta a Loki en las películas de Marvel?", opciones12, 'a'));
        ArrayList<String> opciones13 = new ArrayList<>();
        opciones13.add("Hogwarts");
        opciones13.add("Beauxbatons");
        opciones13.add("Durmstrang");
        preguntas.add(new Multiple("¿En qué escuela de magia estudia Harry Potter?", opciones13, 'a'));
        ArrayList<String> opciones14 = new ArrayList<>();
        opciones14.add("Luke Skywalker");
        opciones14.add("Leia Organa");
        opciones14.add("Han Solo");
        preguntas.add(new Multiple("¿Quién es el protagonista principal de la trilogía original de 'Star Wars'?", opciones14, 'a'));
        ArrayList<String> opciones15 = new ArrayList<>();
        opciones15.add("Tom Cruise");
        opciones15.add("Brad Pitt");
        opciones15.add("Leonardo DiCaprio");
        preguntas.add(new Multiple("¿Quién interpretó al personaje principal en la película 'Fight Club'?", opciones15, 'b'));
        ArrayList<String> opciones16 = new ArrayList<>();
        opciones16.add("Emma Watson");
        opciones16.add("Rupert Grint");
        opciones16.add("Tom Felton");
        preguntas.add(new Multiple("¿Quién interpretó a Hermione Granger en las películas de 'Harry Potter'?", opciones16, 'a'));
        ArrayList<String> opciones17 = new ArrayList<>();
        opciones17.add("La Tierra Media");
        opciones17.add("Westeros");
        opciones17.add("Hogwarts");
        preguntas.add(new Multiple("¿En qué mundo ficticio se desarrolla la saga de 'El Señor de los Anillos'?", opciones17, 'a'));
        ArrayList<String> opciones18 = new ArrayList<>();
        opciones18.add("Vin Diesel");
        opciones18.add("Dwayne Johnson");
        opciones18.add("Jason Statham");
        preguntas.add(new Multiple("¿Quién interpreta a Dominic Toretto en la saga 'Fast and Furious'?", opciones18, 'a'));
        ArrayList<String> opciones19 = new ArrayList<>();
        opciones19.add("David Fincher");
        opciones19.add("Quentin Tarantino");
        opciones19.add("Martin Scorsese");
        preguntas.add(new Multiple("¿Quién dirigió la película 'Pulp Fiction'?", opciones19, 'b'));
        ArrayList<String> opciones20 = new ArrayList<>();
        opciones20.add("Elon Musk");
        opciones20.add("Mark Zuckerberg");
        opciones20.add("Jeff Bezos");
        preguntas.add(new Multiple("¿Quién fundó la empresa SpaceX?", opciones20, 'a'));
        ArrayList<String> opciones21 = new ArrayList<>();
        opciones21.add("Vincent van Gogh");
        opciones21.add("Pablo Picasso");
        opciones21.add("Leonardo da Vinci");
        preguntas.add(new Multiple("¿Quién pintó 'La noche estrellada'?", opciones21, 'a'));
        ArrayList<String> opciones22 = new ArrayList<>();
        opciones22.add("Netflix");
        opciones22.add("Hulu");
        opciones22.add("Amazon Prime Video");
        preguntas.add(new Multiple("¿Cuál de estas plataformas de streaming fue fundada primero?", opciones22, 'c'));
        ArrayList<String> opciones23 = new ArrayList<>();
        opciones23.add("Meryl Streep");
        opciones23.add("Julia Roberts");
        opciones23.add("Kate Winslet");
        preguntas.add(new Multiple("¿Quién ganó un Oscar por su papel en 'The Iron Lady'?", opciones23, 'a'));
        ArrayList<String> opciones24 = new ArrayList<>();
        opciones24.add("Taylor Swift");
        opciones24.add("Ariana Grande");
        opciones24.add("Beyoncé");
        preguntas.add(new Multiple("¿Quién interpretó a Catwoman en 'The Dark Knight Rises'?", opciones24, 'c'));
        ArrayList<String> opciones25 = new ArrayList<>();
        opciones25.add("Jaws");
        opciones25.add("Alien");
        opciones25.add("Predator");
        preguntas.add(new Multiple("¿Cuál es el título original de la película 'Tiburón'?", opciones25, 'a'));
    }
    public static void printMatrix() {
        for (int i = 0; i < cuadricula.length; i++) {
            for (int j = 0; j < cuadricula[i].length; j++) {
                System.out.print(cuadricula[i][j] + "\t");
            }
            System.out.println();
        }
    }
    public static void crearCuadricula(){
        int num = 1;
        for (int i = 0; i < cuadricula.length; i++) {
            for (int j = 0; j < cuadricula[i].length; j++) {
                cuadricula[i][j] = num;
                num++;
            }
        }
    }
}