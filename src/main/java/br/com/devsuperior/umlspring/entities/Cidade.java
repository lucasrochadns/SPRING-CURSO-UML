package br.com.devsuperior.umlspring.entities;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name="tb_cidade")
public class Cidade implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @ManyToOne
    @JoinColumn(name= "estado_id")
    private Estado estado;

    public Cidade(Long id, String name, Estado estado) {
        this.id = id;
        this.name = name;
        this.estado = estado;
    }
    public Cidade(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
}
