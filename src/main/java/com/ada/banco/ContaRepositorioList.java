package com.ada.banco;

import com.ada.conta.Conta;
import com.ada.util.Filtro;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//TODO: usar final em variaveis locais e parametros quando possível
public class ContaRepositorioList implements ContaRepositorio {

    //TODO: usar atributo final
    List<Conta> contas = new ArrayList<>();

    @Override
    public void salvar(Conta conta) {
        this.contas.add(conta);
    }

    @Override
    public void atualizar(Conta conta) {

        for (int i = 0; i < contas.size(); i++) {
            if (contas.get(i).getNumero().equals(conta.getNumero())) {
                contas.set(i, conta);
            }
        }

    }

    @Override
    public Conta buscarPorNumero(String numero) {
        for (Conta conta : contas) {
            if (conta.getNumero().equals(numero)) {
                return conta;
            }
        }
        return null;
    }

    @Override
    public List<Conta> bucarPorCliente(String identificador) {
        List<Conta> contasCliente = new ArrayList<>();

        for (Conta conta : contas) {
            if (conta.getCliente().getIdentificador().getValor().equals(identificador)) {
                contasCliente.add(conta);
            }
        }

        return contasCliente;
    }

    @Override
    public List<Conta> buscarTodas() {
        return contas;
    }

    @Override
    public List<Conta> buscarTodas(final Filtro filtro) {
        return contas.stream()
                .filter(filtro::filtrar)
                .collect(Collectors.toList());
    }
}
