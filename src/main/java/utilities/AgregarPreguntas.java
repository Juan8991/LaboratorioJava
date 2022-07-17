package utilities;

import java.util.ArrayList;

import clases.Pregunta;

/**
 * Esta función guarda las preguntas en objetos de Tipo Pregunta, que a su vez se guardan 
 * en un solo ArrayList dependiendo su dificiltad llamado colecionDeTodasLasPreguntas. 
 * Entonces se guardan 4 objetos de tipo pregunta
 * (1 objeto de tipo Pregunta por cada Categoria). 
 * @returns la coleccion de preguntas. 
 */

public class AgregarPreguntas {
    

    public AgregarPreguntas() {
      // TODO document why this constructor is empty
    }

    public ArrayList<Pregunta> agregarTodasLasPreguntas(){
        ArrayList <Pregunta >colecciondePreguntasDificultad1= new ArrayList();
        ArrayList <Pregunta >colecciondePreguntasDificultad2= new ArrayList();
        ArrayList <Pregunta >colecciondePreguntasDificultad3= new ArrayList();
        ArrayList <Pregunta >colecciondePreguntasDificultad4= new ArrayList();
        ArrayList <Pregunta >colecciondePreguntasDificultad5= new ArrayList();
        ArrayList <Pregunta >colecionDeTodasLasPreguntas= new ArrayList();

    //Dificultad 1--------------------------
    colecciondePreguntasDificultad1.add(new Pregunta("Arte y literatura","¿Cuáles son las flores más famosas pintadas por Van Gogh?","Girasoles","Flor de loto","Margaritas","Rosas"));
    colecciondePreguntasDificultad1.add(new Pregunta("Historia","¿Quién fue el primer Presidente de Estados Unidos?","George Washington","Abraham Lincoln","Thomas Jefferson","Andrew Jackson"));
    colecciondePreguntasDificultad1.add(new Pregunta("Ciencia","¿Cómo se llama el proceso por el cual las plantas elaboran su alimento?","Fotosíntesis","Relación","Nutrición","Absorción"));
    colecciondePreguntasDificultad1.add(new Pregunta("Deporte","¿Cuánto dura un partido de fútbol?","90 minutos","120 minutos","45 minutos","110 minutos"));
    //Dificultad 2------------------------------------
    colecciondePreguntasDificultad2.add(new Pregunta("Arte y literatura","¿Quién escribió 'La Ilíada'?","Homero","Herótodo","Séneca","Marco Tulio Cicerón"));
    colecciondePreguntasDificultad2.add(new Pregunta("Historia","¿Cuál fue el primer metal que el hombre empleó?","Cobre","Oro","Plata","Bronce"));
    colecciondePreguntasDificultad2.add(new Pregunta("Ciencia","¿Cuál es la ciencia que estudia las estrellas?","Astrología","Fisica","Estrellato","Astronomia"));
    colecciondePreguntasDificultad2.add(new Pregunta("Deporte","¿Quién ganó el mundial de fútbol de 2010?","España","Brasil","Estados Unidos","Argentina"));
    //Dificultad 3----------------------------------
    colecciondePreguntasDificultad3.add(new Pregunta("Arte y literatura","¿Filosofo griego, autor de 'La República'?","Platón","Aristóteles","Democrates","Sócrates"));
    colecciondePreguntasDificultad3.add(new Pregunta("Historia","¿Cuál fue el primer metal que el hombre empleó?","Cobre","Oro","Plata","Bronce"));
    colecciondePreguntasDificultad3.add(new Pregunta("Ciencia","¿Cuál es el animal más grande que habita la Tierra?","La ballena azul","Las orcas","La girafa","El elefante"));
    colecciondePreguntasDificultad3.add(new Pregunta("Deporte","¿Qué revista concede el Balón de Oro?","France Football","Brasil Football","Europa sports","Argentina sports"));
    //Dificultad 4--------------------------
    colecciondePreguntasDificultad4.add(new Pregunta("Arte y literatura","¿¿Cuál de estas obras no es de William Shakespeare?","Alejandro Magno","Julio Cesar","El sueño de una noche de verano","Hamlet"));
    colecciondePreguntasDificultad4.add(new Pregunta("Historia","¿Que arte nació en la ciudad griega de Atenas en el año de 536 a.C?","El teatro","La comedia","La poesia","Todas las mencionadas"));
    colecciondePreguntasDificultad4.add(new Pregunta("Ciencia","¿Cómo se llama a la muerte de cada miembro de una especie?","Extinción","Exterminio","Matanza","Fulminación"));
    colecciondePreguntasDificultad4.add(new Pregunta("Deporte","¿A qué deporte pertenece el córner corto?","hockey sobre césped","Futbol","Críquet","Futbol Americano"));
    //Dificultad 5--------------------------
    colecciondePreguntasDificultad5.add(new Pregunta("Arte y literatura","¿Cuál de estas obras de teatro es obra de Federico García Lorca?","La casa de Bernarda Alba","Cinco horas con Mario","Tres sombreros de copa","La venganza de Don Mendo"));
    colecciondePreguntasDificultad5.add(new Pregunta("Historia","¿Cómo se llamaba el cañón alemán más famoso de la I Guerra Mundial ?","Gran Berta","Mackensen M-14","Luftwaffe","Enola Gay"));
    colecciondePreguntasDificultad5.add(new Pregunta("Ciencia","¿De qué sustancia están hechas las uñas?","Queratina","Calcio","Melanina","Mielina"));
    colecciondePreguntasDificultad5.add(new Pregunta("Deporte","¿Quién inventó el arte marcial llamado Jeet Kune Do?","Bruce Lee","Khabib Nurmagomedov","Jackie Chan","Bodhidharma"));

        colecionDeTodasLasPreguntas.addAll(colecciondePreguntasDificultad1);
        colecionDeTodasLasPreguntas.addAll(colecciondePreguntasDificultad2);
        colecionDeTodasLasPreguntas.addAll(colecciondePreguntasDificultad3);
        colecionDeTodasLasPreguntas.addAll(colecciondePreguntasDificultad4);
        colecionDeTodasLasPreguntas.addAll(colecciondePreguntasDificultad5);


        return colecionDeTodasLasPreguntas;
    }


}
