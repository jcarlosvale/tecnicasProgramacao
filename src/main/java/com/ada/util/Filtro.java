package com.ada.util;

import com.ada.conta.Conta;

//TODO: remover interface para usar o Predicate
@FunctionalInterface
public interface Filtro {

    boolean filtrar(Conta conta);

}
