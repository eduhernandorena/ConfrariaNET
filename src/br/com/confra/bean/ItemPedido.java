package br.com.confra.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author eduhe
 */
@Entity
public class ItemPedido {
    @Id
    private Long id;
    @ManyToOne
    private Produto produto;
    @Column
    private double quantidade;
    @Column
    private double valor;
    @Column
    private double desconto;
    @Column
    private double total;

}
