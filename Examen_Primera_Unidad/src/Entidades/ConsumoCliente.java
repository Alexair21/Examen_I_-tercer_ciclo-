/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.io.Serializable;

/**
 *
 * @author DIEGO HUAMANJULCA G
 */
public class ConsumoCliente implements Serializable{
    private String codigo;
    private float medida;
    private String periodo;
    private float monto_pago;

    public ConsumoCliente(String codigo, float medida, String periodo, float monto_pago) {
        this.codigo = codigo;
        this.medida = medida;
        this.periodo = periodo;
        this.monto_pago = monto_pago;
    }

    public float getMonto_pago() {
        return monto_pago;
    }

    public void setMonto_pago(float monto_pago) {
        this.monto_pago = monto_pago;
    }


    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public float getMedida() {
        return medida;
    }

    public void setMedida(float consumo) {
        this.medida = consumo;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

}
