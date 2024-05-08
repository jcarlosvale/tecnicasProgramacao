package com.ada.util;

import com.ada.conta.Conta;

public class FiltrarVIP implements Filtro {

    public static final int LIMITE = 500_000;

    @Override
    public boolean filtrar(final Conta conta) {
        return conta.consultarSaldo() > LIMITE;
    }
}
