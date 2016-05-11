package br.com.gaiatosfc.model;
// Generated 22/04/2016 14:13:13 by Hibernate Tools 4.3.1


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Gols generated by hbm2java
 */
@Entity
@Table(name="gols"
    ,catalog="gaiatosfc"
)
public class Gols  implements java.io.Serializable {


     private int codG;
     private Jogadores jogadores;
     private Jogos jogos;
     private Date data;
     private String momentoGol;

    public Gols() {
    }

	
    public Gols(int codG) {
        this.codG = codG;
    }
    public Gols(int codG, Jogadores jogadores, Jogos jogos, Date data, String momentoGol) {
       this.codG = codG;
       this.jogadores = jogadores;
       this.jogos = jogos;
       this.data = data;
       this.momentoGol = momentoGol;
    }
   
    @Id 
    @GeneratedValue(strategy=IDENTITY)
    @Column(name="cod_g", unique=true, nullable=false)
    public int getCodG() {
        return this.codG;
    }
    
    public void setCodG(int codG) {
        this.codG = codG;
    }

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="cod_jogador")
    public Jogadores getJogadores() {
        return this.jogadores;
    }
    
    public void setJogadores(Jogadores jogadores) {
        this.jogadores = jogadores;
    }

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="cod_jogo")
    public Jogos getJogos() {
        return this.jogos;
    }
    
    public void setJogos(Jogos jogos) {
        this.jogos = jogos;
    }

    
    @Column(name="data", length=13)
    @Temporal(TemporalType.DATE)
    public Date getData() {
        return this.data;
    }
    
    public void setData(Date data) {
        this.data = data;
    }

    
    @Column(name="momento_gol", length=30)
    public String getMomentoGol() {
        return this.momentoGol;
    }
    
    public void setMomentoGol(String momentoGol) {
        this.momentoGol = momentoGol;
    }




}


