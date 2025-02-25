package com.ada.conta;

import com.ada.cliente.Identificador;

//TODO: usar final em variaveis locais e parametros quando possível
public class NumeroConta implements Identificador<String> {

    //TODO: usar atributos final
    private static int numeroIncremental = 0;
    private String numero;

    public NumeroConta(String numero) {
        this.numero = numero;
        this.validar();
    }

    public NumeroConta() {
        numeroIncremental++;
        this.numero = String.format("%06d", numeroIncremental);
        this.validar();
    }

    @Override
    public String getValor() {
        return numero;
    }

    @Override
    public void validar() {
        if (numero == null || numero.length() != 6){
            throw new IllegalArgumentException("O numero da conta deve ter 6 caracteres");
        }
    }
}
