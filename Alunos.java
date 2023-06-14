package TPC02;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import java.util.Collections;
import java.util.List;


import java.util.Scanner;




public class Alunos {

    private String nome;
    private int[] notas;


    public Alunos() {
        this.nome = null;
        this.notas = null;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int[] getNotas() {
        return notas;
    }

    public void setNotas(int[] notas) {
        this.notas = notas;
    }

    @Override
    public String toString() {
        return "Alunos{" + "nome=" + nome + ", notas=" + Arrays.toString(notas) + '}';
    }
   
 
    public void listar() throws IOException {
        File fich = new File("notas.csv");
   
           if(fich.exists() )
               System.out.println(" Esse ficheiro existe");
        
       BufferedReader br=new BufferedReader(new FileReader(fich));
        try (Scanner ler = new Scanner(br)) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] coluna = linha.split(";");
                double notas = Double.parseDouble(coluna[1]);
           }
        
         }catch(Exception e){
    
}
    }
    public double calcularMedia(String fich)throws NumberFormatException {
        double soma = 0;
        int contador = 0;
        

        try (BufferedReader br = new BufferedReader(new FileReader(fich))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] coluna = linha.split(";");
                double notas = Double.parseDouble(coluna[1]);
                soma +=notas;
                contador++;
            }
        } catch (IOException e) {
            System.err.println("Erro ao ler o ficheiro: " + e.getMessage());
            System.exit(1);
        }

        if (contador == 0) {
            return 0;
        } else {
            return soma / contador;
        
        }
    }

  
   public void ordenarNota()throws NumberFormatException{
       
        String fich = "notas.csv"; 
        List<Double> notas = new ArrayList<>(); 
        
        
        try (BufferedReader br = new BufferedReader(new FileReader(fich))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] coluna= linha.split(",");
                double nota = Double.parseDouble(coluna[1]); // a notas está na segunda coluna do CSV
                notas.add(nota);
            }
        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo: " + e.getMessage());
            System.exit(1);
        }
     
        Collections.sort(notas, Collections.reverseOrder());
 
        System.out.println("Notas ordenadas de maior para menor:");
        for (double nota : notas) {
            System.out.println(nota);
        }
       
   }
    public static void main(String[] args) throws IOException {
       // File fich=new File("notas.csv");
        Alunos aluno=new Alunos();
        aluno.listar();
        aluno.ordenarNota();
    }
   
}


