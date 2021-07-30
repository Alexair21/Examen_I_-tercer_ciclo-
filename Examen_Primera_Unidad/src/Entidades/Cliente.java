package Entidades;

import javax.swing.JOptionPane;

public class Cliente {

    private String codigo;
    private String Direccion;
    private String t_conexion;
    private float v_conexion;
    private String op_tarifaria;
    private float va_tarifa;
    private float precio;

    public Cliente(String codigo, String Direccion, String t_conexion, float v_conexion, String op_tarifaria, float va_tarifa, float precio) {
        this.codigo = codigo;
        this.Direccion = Direccion;
        this.t_conexion = t_conexion;
        this.v_conexion = v_conexion;
        this.op_tarifaria = op_tarifaria;
        this.va_tarifa = va_tarifa;
        this.precio = precio;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getT_conexion() {
        return t_conexion;
    }

    public void setT_conexion(String t_conexion) {
        this.t_conexion = t_conexion;
    }

    public void setV_conexion(float v_conexion) {
        this.v_conexion = v_conexion;

    }

    public float getV_conexion() {
        return v_conexion;
    }

    public String getOp_tarifaria() {
        return op_tarifaria;
    }

    public void setOp_tarifaria(String op_tarifaria) {
        this.op_tarifaria = op_tarifaria;
    }

    public float getVa_tarifa() {
        return va_tarifa;
    }

    public void setVa_tarifa(float va_tarifa) {
        this.va_tarifa = va_tarifa;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

}