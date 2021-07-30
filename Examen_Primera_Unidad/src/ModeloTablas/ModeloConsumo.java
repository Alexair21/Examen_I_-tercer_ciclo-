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
public class ModeloConsumo extends AbstractTableModel{
    private ArrayList<ConsumoCliente> consumos;
    private String[] columnas = {"Codigo", "Consumo","Mes", "Monto a pagar"};
    
    public ModeloConsumo(ArrayList<ConsumoCliente> consumos) {
        this.consumos =consumos;
    }
    
    @Override
    public int getRowCount() {
        return consumos.size();
    }

    @Override
    public int getColumnCount() {
        return columnas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return consumos.get(rowIndex).getCodigo();
            case 1:
                return consumos.get(rowIndex).getMedida();
            case 2:
                return consumos.get(rowIndex).getPeriodo();
            case 3:
                return consumos.get(rowIndex).getMonto_pago();
        }
        return null;
    }
    
    @Override
    public String getColumnName(int column) {
        return columnas[column];
    }
    
}
