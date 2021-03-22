/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author kedson dos Anjos
 */
public class Album {

    private int codigo;

    Map<Integer, List<Foto>> mapalbum = new HashMap<>();

    public Album() {
    }

    public void Adicionar_Album(int codigo, List<Foto> li) {
        if (li.isEmpty()) {
            System.out.println(" Falha Inserção de Album ");
        } else {
            mapalbum.put(codigo, li);
            System.out.println("Inserção de Album com sucesso");
        }

    }
    

    public void Adicionar_fotoAl(int codigo, Foto foto) {

        mapalbum.get(codigo).add(foto);
        System.out.println("Inserção de Foto com sucesso");
    }

    public void listarchaves() {
        System.out.println(mapalbum.keySet());
    }

    public boolean verfificar(int codigo) {
        return mapalbum.containsKey(codigo);
    }

    public void listarAlbum() {
        System.out.println(mapalbum.entrySet());
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

}
