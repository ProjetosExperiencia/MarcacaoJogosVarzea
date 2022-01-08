package com.sporticiasapp.sporticiasapp.security;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;

public class DetailsUSer implements UserDetails {

    private String nome;
    private String loggin;
    private String senha;
    private boolean ativo;
    private Collection<GrantedAuthority> permissoes = new ArrayList<> ();

    public DetailsUSer ( String nome, String loggin, String senha, boolean ativo ) {
        this.nome = nome;
        this.loggin = loggin;
        this.senha = senha;
        this.ativo = ativo;
    }


    @Override
    public Collection<? extends GrantedAuthority> getAuthorities () {
        return null;
    }

    @Override
    public String getPassword () {
        return null;
    }

    @Override
    public String getUsername () {
        return null;
    }

    @Override
    public boolean isAccountNonExpired () {
        return false;
    }

    @Override
    public boolean isAccountNonLocked () {
        return false;
    }

    @Override
    public boolean isCredentialsNonExpired () {
        return false;
    }

    @Override
    public boolean isEnabled () {
        return false;
    }
}
