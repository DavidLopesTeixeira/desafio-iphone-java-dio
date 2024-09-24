package com.exercicio.iphone;

import com.exercicio.iphone.model.AparelhoTelefonico;
import com.exercicio.iphone.model.NavegadorInternet;
import com.exercicio.iphone.model.ReprodutorMusical;
import com.exercicio.iphone.service.AparelhoTelefonicoImpl;
import com.exercicio.iphone.service.NavegadorInternetImpl;
import com.exercicio.iphone.service.ReprodutorMusicalImpl;

public class iPhone {
    private ReprodutorMusical reprodutor;
    private AparelhoTelefonico telefone;
    private NavegadorInternet navegador;

    public iPhone() {
        this.reprodutor = new ReprodutorMusicalImpl();
        this.telefone = new AparelhoTelefonicoImpl();
        this.navegador = new NavegadorInternetImpl();
    }

    public void tocarMusica(String musica) {
        reprodutor.selecinarMusica(musica);
        reprodutor.tocar();
    }

    public void ligarPara(String numero) {
        telefone.ligar(numero);
    }

    public void exibirPaginaWeb(String url) {
        navegador.exibirPagina(url);
    }

    public static void main(String[] args) {
        iPhone meuIPhone = new iPhone();
        meuIPhone.tocarMusica("Slipknot - Custer...");
        meuIPhone.ligarPara("554431122223");
        meuIPhone.exibirPaginaWeb("www.dio.com.br");
    }
}
