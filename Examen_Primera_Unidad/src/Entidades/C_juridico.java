/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author DIEGO HUAMANJULCA G
 */
public class C_juridico extends Cliente {

    private String RUC;
    private String R_social;
    private String nombre_representante;

    public C_juridico(String RUC, String R_social, String nombre_representante,
            String codigo, String Direccion, String t_conexion, String t_montaje,
            float v_conexion, String op_tarifaria, float va_tarifa, float precio)
    {
        super(codigo, Direccion, t_conexion, v_conexion, op_tarifaria,
                va_tarifa, precio);
        this.RUC = RUC;
        this.R_social = R_social;
        this.nombre_representante = nombre_representante;
    }

    public String getRUC() {
        return RUC;
    }

    public void setRUC(String RUC) {
        this.RUC = RUC;
    }

    public String getR_social() {
        return R_social;
    }

    public void setR_social(String R_social) {
        this.R_social = R_social;
    }

    public String getNombre_representante() {
        return nombre_representante;
    }

    public void setNombre_representante(String nombre_representante) {
        this.nombre_representante = nombre_representante;
    }

}