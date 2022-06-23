/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aulaudemylista;

import entidades.funcionario;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author balta
 */
public class AulaUdemyLista {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    List <funcionario> func = new ArrayList<>();
    
        System.out.print("Quantos funcionarios serao cadastrados? ");
        int n =sc.nextInt();
        
        for(int i = 0; i<n;i++){
            System.out.println();
            System.out.println("Funcionario #" + i + ": ");
            
            
            System.out.print("Id: ");
            int id = sc.nextInt();
            while(hasId(func,id)){
                System.out.println("Id existente, informe um id valido: ");
                id=sc.nextInt();
            }
            
            
            sc.nextLine();
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Salario: ");
            double salario = sc.nextDouble();
            func.add(new funcionario(id, nome, salario));
        }
        System.out.println();
        System.out.println("Informe o id do funcionario que deseja corrigir o salario: ");
        int id = sc.nextInt();
        funcionario emp = func.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        if (emp==null){
            System.out.println("Funcionario nao existe!");
        }
        else{
            System.out.println("Informe o valor percentual de correcao do salario: ");
            double porcentagem = sc.nextDouble();
            emp.aumentoDeSalario(porcentagem);
        }
        System.out.println();
        System.out.println("Lista de funcionarios: ");
        for(funcionario obj : func){
            System.out.println(obj);
        }
    
    }

    private static boolean hasId(List<funcionario> func, int id) {
       funcionario emp = func.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
    }

    
    
}
