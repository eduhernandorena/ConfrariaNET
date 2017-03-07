package br.com.confra.bean;

import javax.persistence.*;
import java.util.List;

/**
 *
 * @author eduhe
 */
@Entity
public class Conta {
    @Id
    private Long id;
    @OneToOne
    private Cliente cliente;
    @Column
    private double limite;
    @Column
    private double saldo;
    @OneToMany
    private List<Pedido> pedAbertos;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public List<Pedido> getPedAbertos() {
        return pedAbertos;
    }

    public void setPedAbertos(List<Pedido> pedAbertos) {
        this.pedAbertos = pedAbertos;
    }
}
