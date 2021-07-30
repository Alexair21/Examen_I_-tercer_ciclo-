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
public class Modelonatural extends AbstractTableModel{
    private ArrayList<C_natural> naturales;
    private String[] columnas = {"Codigo", "DNI",
        "Apellidos", "Nombres"};

     public Modelonatural(ArrayList<C_natural> naturales) {
        this.naturales = naturales;
    }
    
    @Override
    public int getRowCount() {
        return naturales.size();
    }

    @Override
    public int getColumnCount() {
        return columnas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
         switch (columnIndex) {
            case 0:
                return naturales.get(rowIndex).getCodigo();
            case 1:
                return naturales.get(rowIndex).getDNI();
            case 2:
                return naturales.get(rowIndex).getApellidos();
            case 3:
                return naturales.get(rowIndex).getNombres();
                
        }
        return null;
    }
    
    @Override
    public String getColumnName(int column) {
       return columnas[column];
    }
    
}