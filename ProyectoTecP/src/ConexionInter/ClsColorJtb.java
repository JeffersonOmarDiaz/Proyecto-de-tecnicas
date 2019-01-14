/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConexionInter;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author Omar
 */
public class ClsColorJtb extends JTable {

    @Override
    public Component prepareRenderer(TableCellRenderer renderer, int rowIndex, int columnIndex) {
        Component component = super.prepareRenderer(renderer, rowIndex, columnIndex);
        component.setBackground(Color.WHITE);
        component.setForeground(Color.BLACK);

        int unidades = Integer.parseInt(getValueAt(rowIndex, columnIndex).toString());

        if (unidades <= 0) {
            component.setBackground(Color.YELLOW);
            component.setForeground(Color.RED);
        }
        return component;
    }
}
