/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author balta
 */
public class funcionario {
    private Integer id;
    private String nome;
    private Double salario;
    
    public funcionario(){
        
    }
    public funcionario(Integer id,String nome, Double salario){
        this.id=id;
        this.nome=nome;
        this.salario=salario;
    }

    public int getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
    public void aumentoDeSalario(double porcentagem){
        salario+=salario*porcentagem/100;
    }
    public String toString(){
        return id + ", " + nome + ", " + String.format("%.2f", salario);
    }
}
