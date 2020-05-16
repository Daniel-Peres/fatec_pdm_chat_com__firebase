package br.com.fatec_pdm_chat_com__firebase;

import java.util.Date;

class Mensagem implements Comparable <Mensagem>{
    private String usuario;
    private Date date;
    private String texto;

    public int compareTo(Mensagem o){
        return this.date.compareTo(o.date);
    }

    public Mensagem(String usuario, Date date, String texto) {
        this.usuario = usuario;
        this.date = date;
        this.texto = texto;
    }

    public String getUsuario() {
        return usuario;
    }

    public Date getDate() {
        return date;
    }

    public String getTexto() {
        return texto;
    }
}
