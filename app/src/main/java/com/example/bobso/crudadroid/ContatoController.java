package com.example.bobso.crudadroid;

import android.content.Context;

import java.util.List;

public class ContatoController {

    public ContatoController(Context context){
        //Integração com Banco de Dados
    }

    public boolean create(Contato contato){
        return true;
    }

    public int totalDeContatos(){
        return 0;
    }

    public List<Contato> listarContatos(){
        return null;
    }

    public Contato buscarPeloID(int ContatoID){
        return null;
    }

    public boolean update (Contato contato){
        return true;
    }

    public boolean delete (int contatoID){
        return true;
    }
}
