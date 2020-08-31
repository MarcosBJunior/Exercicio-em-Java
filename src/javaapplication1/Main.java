/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author junior
 */
public class Main {
   
  public static void main(String[] args) {
    //Dados do Cliente 
      
    Cliente nome = new Cliente ();
    Cliente cidade = new Cliente ();
    Cliente email = new Cliente ();
      
      
//dados prenchidos cliente 

nome.nomeCliente = "Marcos";
cidade.cidadeCliente = "São Paulo";
email.emailCliente = "marcosborgesjr624@gmail.com";


//Saida de dados cliente 


System.out.println("Dados do cliente: ");
System.out.println("Nome: " + nome.nomeCliente);
System.out.println("Cidade:" + cidade.cidadeCliente);
System.out.println("Email:" + email.emailCliente);


//Dados Curso


Curso nomeCurso = new Curso();
Curso duracaoCurso = new Curso();
Curso areaCurso =  new Curso();

//Dados prenchidos curso


nomeCurso.nomeCurso = "Análise e desenvolvimento de sistemas ";
duracaoCurso.duracaoCurso = "2 anos";
areaCurso.areaCurso = "Técnologia";


//saida de dados curso 
System.out.println("Dados do curso: ");
System.out.println("Nome do Curso " + nomeCurso.nomeCurso);
System.out.println("Duração do curso: " + duracaoCurso.duracaoCurso);
System.out.println("Area do curso: " + areaCurso.areaCurso);


  }

}
