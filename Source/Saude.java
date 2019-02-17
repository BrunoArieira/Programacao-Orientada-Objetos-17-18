import java.util.*;
import java.lang.*;
import java.time.LocalDate;
import java.time.Period;
import java.io.*;

/**
 * Actividade Economica Saude
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Saude extends ActividadeEconomica implements Serializable
{
    private double valorDeducao;
    private String descricao;
    
    public Saude(){
        super();
        this.valorDeducao = 0.0;
        this.descricao = " ";
    }
    
    public Saude(boolean deducao,int codigo, double valorDeducao, String descricao){
        super(deducao,codigo);
        this.valorDeducao = valorDeducao;
        this.descricao = descricao;
    }
    
    public Saude(Saude s){
        super(s);
        this.valorDeducao = s.getValorDeducao();
        this.descricao = s.getDescricao();
    }
    
    // metodos getters
    
    public double getValorDeducao(){
        return this.valorDeducao;
    }
    
    public String getDescricao(){
        return this.descricao;
    }
    
    // metodos setters
    
    public void setValorDeducao(double valor){
        this.valorDeducao = valor;
    }
    
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    
    // metodo toString
    
    public String toString(){
        StringBuilder sb =  new StringBuilder();
        sb.append(super.toString());
        sb.append("\n");
        sb.append("Valor da deducao: ").append(this.valorDeducao).append("\n");
        sb.append("Descrição do Serviço: ").append(this.descricao);
        return sb.toString();
    }
    
    // metodo clone
    
    public Saude clone(){
        return new Saude(this);
    }
}
