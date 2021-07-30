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
public class C_natural extends Cliente {

    private String DNI;
    private String apellidos;
    private String nombres;

    public C_natural(String DNI, String apellidos, String nombres,
            String codigo, String Direccion, String t_conexion,
            String t_montaje, float v_conexion, String op_tarifaria,
            float va_tarifa, float precio) {
        super(codigo, Direccion, t_conexion, v_conexion,
                op_tarifaria, va_tarifa, precio);
        this.DNI = DNI;
        this.apellidos = apellidos;
        this.nombres = nombres;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

}
