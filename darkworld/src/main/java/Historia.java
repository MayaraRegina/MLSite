/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aluno
 */
public class Historia {

    /**
     * @return the sinopse
     */
    public String getSinopse() {
        return sinopse;
    }

    /**
     * @param sinopse the sinopse to set
     */
    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    /**
     * @return the faixaEtaria
     */
    public int getFaixaEtaria() {
        return faixaEtaria;
    }

    /**
     * @param faixaEtaria the faixaEtaria to set
     */
    public void setFaixaEtaria(int faixaEtaria) {
        this.faixaEtaria = faixaEtaria;
    }

    /**
     * @return the codHistoria
     */
    public int getCodHistoria() {
        return codHistoria;
    }

    /**
     * @param codHistoria the codHistoria to set
     */
    public void setCodHistoria(int codHistoria) {
        this.codHistoria = codHistoria;
    }
    
    private int codHistoria;
    private String sinopse;
    private int faixaEtaria;
    
    
}
