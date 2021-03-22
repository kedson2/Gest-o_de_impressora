/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

public class Impressora {

    private String nome_imp;
    private  int toner = 0;
    private String localizacao;
    private int larguraMax;
    private int alturaMax;

    private final Fila fila = new Fila(10000);

    public Impressora() {

    }

    public void EncherToner(int quant) {
        toner = quant;
    }

    public boolean VerFilaImpres() {
        return fila.size() == 0;
    }

    public void addImpresao(Object values) {
        fila.enqueue(values);
        System.out.println("Adicionado Album com Sucesso");
    }

    public void Impremir() {
        if (toner > fila.size()) {
            for (int c = 0; c < fila.size(); c++) {
                fila.Imprim();
                fila.dequeue();
            }
        } else {
            System.out.println("Tonner nessecita de manutençaõ");
        }
    }

    public String getNome_imp() {
        return nome_imp;
    }

    public void setNome_imp(String nome_imp) {
        this.nome_imp = nome_imp;
    }

    public int getToner() {
        return toner;
    }

    public void setToner(int toner) {
        this.toner = toner;
    }

    

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public int getLarguraMax() {
        return larguraMax;
    }

    public void setLarguraMax(int larguraMax) {
        this.larguraMax = larguraMax;
    }

    public int getAlturaMax() {
        return alturaMax;
    }

    public void setAlturaMax(int alturaMax) {
        this.alturaMax = alturaMax;
    }

}
