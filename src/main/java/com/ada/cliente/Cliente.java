package com.ada.cliente;

import lombok.Getter;
import lombok.ToString;

import java.time.LocalDate;
import java.util.Objects;

@Getter
@ToString
//TODO: usar final em variaveis locais e parametros quando possível
public class Cliente implements Comparable<Cliente> {

    //TODO: usar atributos final
    private Identificador<String> identificador;
    private Classificacao classificacao;
    private String nome;
    private LocalDate dataCadastro;
    private boolean status;

    public Cliente(Identificador<String> identificador, Classificacao classificacao, String nome) {
        this.identificador = identificador;
        this.classificacao = classificacao;
        this.nome = nome;
        this.dataCadastro = LocalDate.now();
        this.status = true;
        this.validar();
    }

    public void alterarNome(String novoNome) {
        if (novoNome == null || novoNome.isBlank()) {
            throw new IllegalArgumentException("O nome não pode ser vazio");
        }
        this.nome = novoNome;
    }

    public void ativarDesativar() {
        this.status = !this.status;
    }

    public void validar() {
        if (this.nome == null || this.nome.isBlank()) {
            throw new IllegalArgumentException("O nome não pode ser vazio");
        }
        if (this.identificador == null) {
            throw new IllegalArgumentException("O identificador não pode ser nulo");
        }
        if (this.classificacao == null) {
            throw new IllegalArgumentException("A classificação não pode ser nula");
        }
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final Cliente cliente = (Cliente) o;
        return Objects.equals(this.identificador, cliente.identificador);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(identificador);
    }

    /*
    retorna 0  (iguais)
    retorna > 0 (maior)
    retorna < 0 (menor)
     */
    @Override
    public int compareTo(final Cliente cliente) {
        return
                this.identificador
                        .getValor().compareTo(
                                cliente.identificador.getValor()
                                             );
    }
}
