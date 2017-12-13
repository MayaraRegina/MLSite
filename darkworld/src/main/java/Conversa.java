
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aluno
 */
public class Conversa {

    /**
     * @return the codMensagem
     */
    public int getCodMensagem() {
        return codMensagem;
    }

    /**
     * @param codMensagem the codMensagem to set
     */
    public void setCodMensagem(int codMensagem) {
        this.codMensagem = codMensagem;
    }

    /**
     * @return the codUsuarioo
     */
    public int getCodUsuarioo() {
        return codUsuarioo;
    }

    /**
     * @param codUsuarioo the codUsuarioo to set
     */
    public void setCodUsuarioo(int codUsuarioo) {
        this.codUsuarioo = codUsuarioo;
    }

    /**
     * @return the codUsuariod
     */
    public int getCodUsuariod() {
        return codUsuariod;
    }

    /**
     * @param codUsuariod the codUsuariod to set
     */
    public void setCodUsuariod(int codUsuariod) {
        this.codUsuariod = codUsuariod;
    }

    /**
     * @return the texto
     */
    public String getTexto() {
        return texto;
    }

    /**
     * @param texto the texto to set
     */
    public void setTexto(String texto) {
        this.texto = texto;
    }

    /**
     * @return the dataHora
     */
    public Date getDataHora() {
        return dataHora;
    }

    /**
     * @param dataHora the dataHora to set
     */
    public void setDataHora(Date dataHora) {
        this.dataHora = dataHora;
    }
    
    private int codMensagem;
    private int codUsuarioo;
    private int codUsuariod;
    private String texto;
    private Date dataHora;
}
