package com.exercicio.iphone.service;

import com.exercicio.iphone.model.ReprodutorMusical;

public class ReprodutorMusicalImpl  implements ReprodutorMusical {

    @Override
    public void tocar() {
        System.out.println("Música Tocando...");
    }

    @Override
    public void pausar() {
        System.out.println("Musica foi pausada");

    }

    @Override
    public void selecinarMusica(String musica) {
        System.out.println("Selecionando a musica: " + musica);

    }
}
