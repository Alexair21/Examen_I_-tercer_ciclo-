/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloTablas;

import Entidades.*;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author DIEGO HUAMANJULCA G
 */
public class ModeloGeneral extends AbstractTableModel {

    private ArrayList<Cliente> clientes;
    private String[] columnas = {"Codigo", "Dirección",
        "Tipo de conexion", "Valor conexion",
        "Tipo de instalacion", "Valor de instalacion", "Precio por Kwh"};

    public ModeloGeneral(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    @Override
    public int getRowCount() {
        return clientes.size();
    }

    @Override
    public int getColumnCount() {
        return columnas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return clientes.get(rowIndex).getCodigo();
            case 1:
                return clientes.get(rowIndex).getDireccion();
            case 2:
                return clientes.get(rowIndex).getT_conexion();
            case 3:
                return clientes.get(rowIndex).getV_conexion();
            case 4:
                return clientes.get(rowIndex).getOp_tarifaria();
            case 5:
                return clientes.get(rowIndex).getVa_tarifa();
            case 6: 
                return clientes.get(rowIndex).getPrecio();

        }
        return null;
    }

    @Override
    public String getColumnName(int column) {
        return columnas[column];
    }

}

