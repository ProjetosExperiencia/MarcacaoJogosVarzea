package com.sporticiasapp.sporticiasapp.models;

import javax.persistence.*;

@Entity
public class Marcacao {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String Jogo;
    private String horario;
    private String Campo;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getJogo() {
        return Jogo;
    }

    public void setJogo(String jogo) {
        Jogo = jogo;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getCampo() {
        return Campo;
    }

    public void setCampo(String campo) {
        Campo = campo;
    }
}
