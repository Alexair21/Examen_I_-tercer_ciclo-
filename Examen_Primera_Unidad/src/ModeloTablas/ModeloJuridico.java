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
public class ModeloJuridico extends AbstractTableModel {

    private ArrayList<C_juridico> juridicos;
    private String[] columnas = {"Codigo", "Ruc",
        "Nombre Representante", "Razón Social"};

    public ModeloJuridico(ArrayList<C_juridico> juridicos) {
        this.juridicos = juridicos;
    }

    @Override
    public int getRowCount() {
        return juridicos.size();
    }

    @Override
    public int getColumnCount() {
        return columnas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return juridicos.get(rowIndex).getCodigo();
            case 1:
                return juridicos.get(rowIndex).getRUC();
            case 2:
                return juridicos.get(rowIndex).getNombre_representante();
            case 3:
                return juridicos.get(rowIndex).getR_social();
                
        }
        return null;
    }

    @Override
    public String getColumnName(int column) {
       return columnas[column];
    }
    
}