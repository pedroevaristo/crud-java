package org.example;

public class Object {
    private Integer numero_da_conta;
    private String agencia;
    private String nome_do_cliente;
    private Double saldo_da_conta;

    public Object(Integer numero_da_conta, String agencia, String nome_do_cliente, Double saldo_da_conta) {
        this.numero_da_conta = numero_da_conta;
        this.agencia = agencia;
        this.nome_do_cliente = nome_do_cliente;
        this.saldo_da_conta = saldo_da_conta;
    }

    public Integer getNumero_da_conta() {
        return numero_da_conta;
    }

    public String getAgencia() {
        return agencia;
    }

    public String getNome_do_cliente() {
        return nome_do_cliente;
    }

    public Double getSaldo_da_conta() {
        return saldo_da_conta;
    }
}
