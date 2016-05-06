package br.com.gaiatosfc.model;
// Generated 22/04/2016 14:13:13 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Campeonatos generated by hbm2java
 */
@Entity
@Table(name="campeonatos"
    ,schema="public"
)
public class Campeonatos  implements java.io.Serializable {


     private int codC;
     private String nomeCamp;
     private Set jogoses = new HashSet(0);

    public Campeonatos() {
    }

	
    public Campeonatos(int codC, String nomeCamp) {
        this.codC = codC;
        this.nomeCamp = nomeCamp;
    }
    public Campeonatos(int codC, String nomeCamp, Set jogoses) {
       this.codC = codC;
       this.nomeCamp = nomeCamp;
       this.jogoses = jogoses;
    }
   
     @Id 

    
    @Column(name="cod_c", unique=true, nullable=false)
    public int getCodC() {
        return this.codC;
    }
    
    public void setCodC(int codC) {
        this.codC = codC;
    }

    
    @Column(name="nome_camp", nullable=false)
    public String getNomeCamp() {
        return this.nomeCamp;
    }
    
    public void setNomeCamp(String nomeCamp) {
        this.nomeCamp = nomeCamp;
    }

    @OneToMany(fetch=FetchType.LAZY, mappedBy="campeonatos")
    public Set<Jogos> getJogoses() {
        return this.jogoses;
    }
    
    public void setJogoses(Set jogoses) {
        this.jogoses = jogoses;
    }




}


