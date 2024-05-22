package com.ada;

import com.ada.banco.BancoService;
import com.ada.banco.ContaRepositorio;
import com.ada.banco.ContaRepositorioList;

public class Main {
    // TODO: usar variaveis final e parametros final, onde possível.
    public static void main(String[] args) {

        ContaRepositorio contaRepositorio = new ContaRepositorioList();
        BancoService controlador = new BancoService(contaRepositorio);

        Menu menu = new Menu(controlador);
        menu.criarMenu();

    }
}