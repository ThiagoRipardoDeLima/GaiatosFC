package br.com.gaiatosfc.model;
// Generated 22/04/2016 14:13:13 by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Fale generated by hbm2java
 */
@Entity
@Table(name="fale"
    ,catalog="gaiatosfc"
)
public class Fale  implements java.io.Serializable {


     private int codF;
     private String nomeTorcedor;
     private String email;
     private String conteudo;

    public Fale() {
    }

	
    public Fale(int codF, String nomeTorcedor, String email) {
        this.codF = codF;
        this.nomeTorcedor = nomeTorcedor;
        this.email = email;
    }
    public Fale(int codF, String nomeTorcedor, String email, String conteudo) {
       this.codF = codF;
       this.nomeTorcedor = nomeTorcedor;
       this.email = email;
       this.conteudo = conteudo;
    }
   
    @Id 
    @GeneratedValue(strategy=IDENTITY)
    @Column(name="cod_f", unique=true, nullable=false)
    public int getCodF() {
        return this.codF;
    }
    
    public void setCodF(int codF) {
        this.codF = codF;
    }

    
    @Column(name="nome_torcedor", nullable=false, length=40)
    public String getNomeTorcedor() {
        return this.nomeTorcedor;
    }
    
    public void setNomeTorcedor(String nomeTorcedor) {
        this.nomeTorcedor = nomeTorcedor;
    }

    
    @Column(name="email", nullable=false, length=150)
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }

    
    @Column(name="conteudo")
    public String getConteudo() {
        return this.conteudo;
    }
    
    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }




}


