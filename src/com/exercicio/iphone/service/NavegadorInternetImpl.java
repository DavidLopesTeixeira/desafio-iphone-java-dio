package com.exercicio.iphone.service;

import com.exercicio.iphone.model.NavegadorInternet;

public class NavegadorInternetImpl implements NavegadorInternet {
    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada");

    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada");
    }
}
