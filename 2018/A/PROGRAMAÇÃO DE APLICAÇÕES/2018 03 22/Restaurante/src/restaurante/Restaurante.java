/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurante;

import apoio.ConexaoBD;
import javax.swing.JOptionPane;
import telas.FrmPrincipal;

/**
 *
 * @author augusto.fritz
 */
public class Restaurante {

    public static void main(String[] args) {
        if (ConexaoBD.getInstance().getConnection() != null) {
            JOptionPane.showMessageDialog(null, "Abriu!");
            new FrmPrincipal().setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Deu problema!");
        }

    }
}
