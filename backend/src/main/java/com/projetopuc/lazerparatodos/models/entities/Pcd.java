package com.projetopuc.lazerparatodos.models.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "pcd_table")
public class Pcd {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    @Column(name="nome", nullable = false)
    String nome;
    @OneToMany
    @JoinColumn(name = "favoritos_id")
    List<Proprietario> favoritos;
    @OneToMany
    @JoinColumn(name = "deficiencias_id")
    @Column(name="deficiencias", nullable = false)
    List<Deficiencia> deficiencias;

    @OneToOne
    @JoinColumn(name = "endereco_id")
    Endereco endereco;

    @OneToOne
    @JoinColumn(name = "usuarios_id")
    Usuario usuario;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Proprietario> getFavoritos() {
        return favoritos;
    }

    public void setFavoritos(List<Proprietario> favoritos) {
        this.favoritos = favoritos;
    }

    public List<Deficiencia> getDeficiencias() {
        return deficiencias;
    }

    public void setDeficiencias(List<Deficiencia> deficiencias) {
        this.deficiencias = deficiencias;
    }


    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
