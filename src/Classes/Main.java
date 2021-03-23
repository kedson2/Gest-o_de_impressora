/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author kedson dos Anjos
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Album al = new Album();
        String terminar = "T";
        Scanner t = new Scanner(System.in);
        Impressora ip = new Impressora();

        while (!"S".equals(terminar)) {
            try {
                System.out.println("*****Menu*****\nAA-----> Adicionar de Albun\nAF-----> Adicionar Fotografia a Álbum\n"
                        + "II-----> Inserir Impressora \nAI-----> Adicionar Albun na Fila de Impressão\n"
                        +"IP-----> Iprimir\nMI-----> Manutenção da Impressora\nLA-----> Listar Album\nS-----> Sair");
                terminar = t.next();
                List<Foto> addfoto = new ArrayList<>();
                switch (terminar) {

                    case "AA" -> {

                        System.out.println("Digite o  Codigo de Albun");
                        int c = t.nextInt();
                        String codi = c + "";
                        int codigoalbum = codi.length();
                        if (codigoalbum == 9) {
                            al.setCodigo(c);
                            System.err.println(" Deseja adicionar quantas fotos no album do codigo " + al.getCodigo());
                            int quantidade = t.nextInt();
                            for (int i = 0; i < quantidade; i++) {
                                Foto foto = new Foto();
                                int e=i+1;
                                System.out.println("Digite o Codigo da"+e+ "º Foto");
                                int p = (t.nextInt());
                                String cod = p + "";
                                int codigo = cod.length();
                                if (codigo == 9) {
                                    foto.setCodigofoto(p);
                                    System.out.println("Digite o Nome da "+e+ "º Foto");
                                    foto.setNomeficheiro(t.next());
                                    System.out.println("Digite a Altura da "+e+ "º Foto");
                                    foto.setAltura(t.nextDouble());
                                    System.out.println("Digite a largura da "+e+ "º Foto");
                                    foto.setLargura(t.nextDouble());
                                    addfoto.add(foto);

                                } else {
                                    System.out.println(" O Codigo da Foto deve ter 9 digito");

                                }
                            }
                            al.Adicionar_Album(al.getCodigo(), addfoto);
                        } else {
                            System.out.println(" O Codigo de Album deve ter 9 digito");
                        }

                    }
                    case "AF" -> {
                        al.listarchaves();
                        System.out.println(" Digite o codigo de Album que queres adicionar foto");
                        int d = t.nextInt();
                        if (al.verfificar(d) == true) {
                            Foto foto = new Foto();
                            System.out.println("Digite o Codigo da Foto");
                            int p = (t.nextInt());
                            String cod = p + "";
                            var codigo = cod.length();
                            if (codigo == 9) {
                                foto.setCodigofoto(p);
                                System.out.println("Digite o Nome da Foto");
                                foto.setNomeficheiro(t.next());
                                System.out.println("Digite a Altura da Foto");
                                foto.setAltura(t.nextDouble());
                                System.out.println("Digite a largura da Foto");
                                foto.setLargura(t.nextDouble());
                                addfoto.add(foto);

                                al.Adicionar_fotoAl(d, foto);
                            } else {
                                System.out.println("O Codigo da Foto deve ter 9 digito");
                            }
                        } else {
                            System.out.println("CHAVE NAO EXITE");
                        }

                    }
                    case "AI" -> {

                        al.listarchaves();
                        System.out.println(" Digite o codigo de Album que queres adicionar foto");
                        int d = t.nextInt();
                        if (al.verfificar(d) == true) {
                            ip.addImpresao(al.mapalbum.get(d));

                        } else {
                            System.out.println("CHAVE NAO EXITE");
                        }

                    }
                    case "II" -> {
                        System.out.println(" Digite Nome da Impressora");
                        ip.setNome_imp(t.next());
                        System.out.println(" Digite o número de Toner");
                        ip.setToner(t.nextInt());
                        System.out.println("Impressora Cadastrado com Sucesso");
                    }
                    case "IP" -> {
                        if (ip.getNome_imp() == null) {
                            System.err.println(" Adiciona Uma Impressoara");

                        } else {
                            if (ip.VerFilaImpres() == false) {
                                System.err.println(ip.getNome_imp());
                                ip.Impremir();
                            } else {
                                System.err.println("Fila vazia");
                            }
                        }

                    }
                    case "MI" -> {
                         if (ip.getNome_imp() == null) {
                            System.err.println(" Adiciona Uma Impressoara");

                        } else {
                        System.err.println(" Digitie a Quatidade de Toner ");
                        ip.EncherToner(t.nextInt());
                        } 
                    }
                     case "LA" -> {
                         al.listarAlbum();
                    }
                }
            } catch (Exception e) {
            }
        }

        System.err.println("");
    }

}
