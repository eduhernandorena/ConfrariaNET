package br.com.confra.bean;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author eduhe
 */
@Entity
public class Pedido {

    @Id
    private Long id;
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDate data;
    @ManyToOne
    private Cliente cliente;
    @Column
    private String endereco;
    @Enumerated(EnumType.STRING)
    private TipoPedido tipo;
    @OneToMany(fetch = FetchType.LAZY)
    private List<ItemPedido> itens = new ArrayList<>();

    public Pedido() {
    }


    enum TipoPedido{
        ENTREGA, MESA, BALCAO;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public TipoPedido getTipo() {
        return tipo;
    }

    public void setTipo(TipoPedido tipo) {
        this.tipo = tipo;
    }

    public List<ItemPedido> getItens() {
        return itens;
    }

    public void setItens(List<ItemPedido> itens) {
        this.itens = itens;
    }
}
