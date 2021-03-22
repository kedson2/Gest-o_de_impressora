/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author kedson dos Anjos
 */
public class Foto {

    private int codigofoto;
    private double largura, altura;
    private String nomeficheiro;

    public Foto() {
    }

    public int getCodigofoto() {
        return codigofoto;
    }

    public void setCodigofoto(int codigofoto) {

        this.codigofoto = codigofoto;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getNomeficheiro() {
        return nomeficheiro;
    }

    public void setNomeficheiro(String nomeficheiro) {
        this.nomeficheiro = nomeficheiro;
    }

    @Override
    public String toString() {
        return "Foto{" + "codigofoto=" + codigofoto +
                ", largura=" + largura + " pixel, "
                + "altura=" + altura + " pixel,"
                + " nomeficheiro=" + nomeficheiro + '}';
    }

}
