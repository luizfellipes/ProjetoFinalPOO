package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Video[] video = new Video[3];

        video[0] = new Video("Aula 1 de POO");
        video[1] = new Video("Aula 12 de Java");
        video[2] = new Video("Aula 10 de HTML5");


        Gafanhoto[] gafanhoto = new Gafanhoto[2];

        gafanhoto[0] = new Gafanhoto("Jubileu", 22, "M", "juba");
        gafanhoto[1] = new Gafanhoto("Creuza", 12, "F", "creuzita");


        Visualizacao[] visualizacao = new Visualizacao[5];

        visualizacao[0] = new Visualizacao(gafanhoto[0], video[1]);
        visualizacao[0].avaliar();
        visualizacao[1] = new Visualizacao(gafanhoto[0], video[1]);
        visualizacao[0].avaliar(87.0f);
        visualizacao[2] = new Visualizacao(gafanhoto[0], video[1]);
        visualizacao[0].avaliar(8);
        System.out.println(visualizacao[0]);


    }
}