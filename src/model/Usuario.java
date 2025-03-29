package model;

import java.util.Date;

public class Usuario {
    private int pkusuario;
    private String nome;
    private String email;
    private String senha;
    private Date dataNascimento;
    private boolean ativo;

    public Usuario() {};

    
    public Usuario(int pkusuario, String nome, String email, String senha, Date dataNascimento, boolean ativo) {
        this.pkusuario = pkusuario;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.dataNascimento = dataNascimento;
        this.ativo = ativo;
    }
    
    
}


