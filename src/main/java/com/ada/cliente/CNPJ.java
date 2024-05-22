package com.ada.cliente;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode
//TODO: usar final em variaveis locais e parametros quando possível
public class CNPJ implements Identificador<String> {

    //TODO: atributo final
    private String valor;

    public CNPJ(String valor) {
        this.valor = valor;
        this.validar();
    }

    @Override
    public String getValor() {
        return valor;
    }

    @Override
    public void validar() {
        if (this.valor == null || this.valor.length() != 14){
            throw new IllegalArgumentException("CNPJ inválido");
        }
    }
}
