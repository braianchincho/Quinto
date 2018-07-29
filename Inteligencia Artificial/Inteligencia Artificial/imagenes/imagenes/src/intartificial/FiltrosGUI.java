/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * FiltrosGUI.java
 *
 * Created on 05-feb-2013, 0:27:55
 */

package intartificial;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;


/**
 *
 * @author Ani Rufinetto
 */
public class FiltrosGUI extends javax.swing.JDialog {

    /** Creates new form FiltrosGUI */
    public FiltrosGUI(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Filtros");
        this.buttonGroup1.add(radioButtonGenerar);
        this.buttonGroup1.add(radioButtonIngresar);
        this.buttonGroup2.add(this.jCheckBox1);
        this.buttonGroup2.add(this.jCheckBox3);
        pintar();
          Font font=new Font("Century Gothic", Font.PLAIN, 11);
        this.tableImagen.getTableHeader().setFont(font);
        this.tableImagenFiltrada.getTableHeader().setFont(font);
        
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        radioButtonGenerar = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        comboVentana = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        comboColumnas = new javax.swing.JComboBox();
        comboFilas = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableImagen = new javax.swing.JTable();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        radioButtonIngresar = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableImagenFiltrada = new javax.swing.JTable();
        btnVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        radioButtonGenerar.setFont(new java.awt.Font("Century Gothic", 0, 11));
        radioButtonGenerar.setText("Generar Imagen");
        radioButtonGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioButtonGenerarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 11));
        jLabel2.setText("Seleccionar el tamaño de  la ventana:");

        comboVentana.setFont(new java.awt.Font("Century Gothic", 0, 11));
        comboVentana.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "3x1", "3x3", "3x5", "5x1", "5x3", "5x5", "7x1" }));
        comboVentana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboVentanaActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 11));
        jLabel7.setText("Seleccionar la columna desde donde comenzar:");

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 11));
        jLabel3.setText("Seleccionar la fila desde donde comenzar:");

        comboColumnas.setFont(new java.awt.Font("Century Gothic", 0, 11));
        comboColumnas.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11" }));
        comboColumnas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboColumnasActionPerformed(evt);
            }
        });

        comboFilas.setFont(new java.awt.Font("Century Gothic", 0, 11));
        comboFilas.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4", "5" }));
        comboFilas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboFilasActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 12));
        jLabel8.setText("Imagen");

        tableImagen.setFont(new java.awt.Font("Century Gothic", 0, 11));
        tableImagen.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tableImagen.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tableImagenKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tableImagen);

        jCheckBox1.setFont(new java.awt.Font("Century Gothic", 0, 11));
        jCheckBox1.setText("Filtro de la Media");

        jCheckBox3.setFont(new java.awt.Font("Century Gothic", 0, 11));
        jCheckBox3.setText("Filtro de la Mediana");

        jButton1.setFont(new java.awt.Font("Century Gothic", 0, 11));
        jButton1.setText("Aceptar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        radioButtonIngresar.setFont(new java.awt.Font("Century Gothic", 0, 11));
        radioButtonIngresar.setText("Ingresar Imagen");
        radioButtonIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioButtonIngresarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 14));
        jLabel4.setText("Resultados");

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 11));
        jLabel5.setText("Valor de Media:");

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 11));
        jLabel6.setText("Valor de Mediana:");

        jTextField2.setEditable(false);
        jTextField2.setFont(new java.awt.Font("Century Gothic", 0, 11));

        jTextField3.setEditable(false);
        jTextField3.setFont(new java.awt.Font("Century Gothic", 0, 11));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 0, 12));
        jLabel9.setText("Imagen Filtrada");

        tableImagenFiltrada.setFont(new java.awt.Font("Century Gothic", 0, 11));
        tableImagenFiltrada.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tableImagenFiltrada);

        btnVolver.setFont(new java.awt.Font("Century Gothic", 0, 11));
        btnVolver.setText("Reiniciar");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(comboVentana, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel3))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(comboFilas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(comboColumnas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 161, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(250, 250, 250)
                                .addComponent(jLabel8))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(75, 75, 75)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(radioButtonGenerar)
                                .addGap(44, 44, 44)
                                .addComponent(radioButtonIngresar)
                                .addGap(83, 83, 83))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(149, 149, 149)
                                    .addComponent(jLabel9))))
                        .addGap(620, 620, 620))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox1)
                            .addComponent(jCheckBox3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(224, 224, 224)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 200, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField3)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioButtonGenerar)
                    .addComponent(radioButtonIngresar))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(comboVentana, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(comboColumnas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboFilas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(25, 25, 25)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jCheckBox1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox3)
                    .addComponent(jButton1))
                .addGap(29, 29, 29)
                .addComponent(jLabel4)
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(btnVolver)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void radioButtonGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioButtonGenerarActionPerformed
        // TODO add your handling code here:
        jTextField2.setText("");
        jTextField3.setText("");
        generarNumeros();
    }//GEN-LAST:event_radioButtonGenerarActionPerformed

    private void comboVentanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboVentanaActionPerformed
        // TODO add your handling code here:

        tableImagen.clearSelection();
        tableImagenFiltrada.clearSelection();
        pintar();
}//GEN-LAST:event_comboVentanaActionPerformed

    private void comboColumnasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboColumnasActionPerformed
        // TODO add your handling code here:

        selectionColumn=Integer.parseInt(comboColumnas.getSelectedItem().toString());
        tableImagen.clearSelection();
        tableImagenFiltrada.clearSelection();
        pintar();
    }//GEN-LAST:event_comboColumnasActionPerformed

    private void comboFilasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboFilasActionPerformed
        // TODO add your handling code here:

        selectionRow=Integer.parseInt(comboFilas.getSelectedItem().toString());
        tableImagen.clearSelection();
        tableImagenFiltrada.clearSelection();
        pintar();
    }//GEN-LAST:event_comboFilasActionPerformed

    private void tableImagenKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tableImagenKeyReleased
        // TODO add your handling code here:
        for(int i=0;i<=tableImagen.getSelectedRow();i++) {
            for(int j=0;j<=tableImagen.getSelectedColumn();j++) {
                Object x=tableImagen.getValueAt(i,j);
                tableImagenFiltrada.setValueAt( x, i, j);
            }
        }
}//GEN-LAST:event_tableImagenKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here
        if(cargarPorcionImagen()) {
            calculos();
            crearTableResultados();
        }
}//GEN-LAST:event_jButton1ActionPerformed

    private void radioButtonIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioButtonIngresarActionPerformed
        // TODO add your handling code here:
        cleanTables();
}//GEN-LAST:event_radioButtonIngresarActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        // TODO add your handling code here:

        cleanTables();
        tableImagen.clearSelection();
        tableImagenFiltrada.clearSelection();
}//GEN-LAST:event_btnVolverActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVolver;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox comboColumnas;
    private javax.swing.JComboBox comboFilas;
    private javax.swing.JComboBox comboVentana;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JRadioButton radioButtonGenerar;
    private javax.swing.JRadioButton radioButtonIngresar;
    private javax.swing.JTable tableImagen;
    private javax.swing.JTable tableImagenFiltrada;
    // End of variables declaration//GEN-END:variables
private int[] porcionImagen;
private Filtro filtro=new Filtro();
private int selectionColumn=0;
private int selectionRow=0;


    private void generarNumeros()
    {
      for(int i=0;i<12;i++)
      {
      for(int j=0;j<6;j++)
      {
        int numero=(int) (Math.random() * 60);
        tableImagen.setValueAt(numero, j, i);
        tableImagenFiltrada.setValueAt(numero, j, i);
      }

      }

    }

      private void pintar()
    {

      String ventanaSeleccionada=(String)comboVentana.getSelectedItem();
      int column=Integer.parseInt(ventanaSeleccionada.substring(0,1));
      int row=Integer.parseInt(ventanaSeleccionada.substring(2,3));
      //int z=0;
      if((column+selectionColumn)<=12 && (row+selectionRow)<=6)
      {

               //tableImagen.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
               tableImagen.setColumnSelectionAllowed(true);
               tableImagen.setRowSelectionAllowed(true);
               tableImagen.setRowSelectionInterval(selectionRow, row+selectionRow-1);
               tableImagen.setColumnSelectionInterval(selectionColumn, column+selectionColumn-1);
               tableImagenFiltrada.setColumnSelectionAllowed(true);
               tableImagenFiltrada.setRowSelectionAllowed(true);
               tableImagenFiltrada.setRowSelectionInterval(selectionRow, row+selectionRow-1);
               tableImagenFiltrada.setColumnSelectionInterval(selectionColumn, column+selectionColumn-1);

        }

    }

 private void cleanTables()
    { jTextField2.setText("");
     jTextField3.setText("");
    
     for(int i=0;i<12;i++)
      {
      for(int j=0;j<6;j++)
      {

        tableImagen.setValueAt(null, j, i);
        tableImagenFiltrada.setValueAt(null, j, i);
      }

      }}


private void crearTableResultados()
    {

      String ventanaSeleccionada=(String)comboVentana.getSelectedItem();
      int column=Integer.parseInt(ventanaSeleccionada.substring(0,1));
      int row=Integer.parseInt(ventanaSeleccionada.substring(2,3));
      int rowStart=Integer.parseInt(comboFilas.getSelectedItem().toString());
      int columnStart=Integer.parseInt(comboColumnas.getSelectedItem().toString());


      for (int i = columnStart; i < column+columnStart; i++)
          {

          if(i==((column-1)/2)+columnStart)
           for(int j=rowStart;j<row+rowStart;j++)
           {
               if(j==((row-1)/2)+rowStart)
               {
               tableImagenFiltrada.setValueAt(porcionImagen[(porcionImagen.length-1)/2], j, i);
               tableImagenFiltrada.changeSelection(j, i, false, false);
              // The following code is for paint the current cell (the cell that must be replaced)
               tableImagenFiltrada.setColumnSelectionAllowed(true);
               tableImagenFiltrada.setRowSelectionAllowed(true);
               tableImagenFiltrada.changeSelection(j, i, false, false);
            
               }

           }

        }

    }


    private void calculos()
    {

       if(jCheckBox1.isSelected()) {
            int media=filtro.calcularMedia(porcionImagen);
            porcionImagen[(porcionImagen.length-1)/2]=media;
            jTextField2.setText(""+media);

          //  porcionImagen[(porcionImagen.length-1)/2]=media;
           /* for(int i=0;i<porcionImagen.length;i++) {
                if(i==0) {
                   // jTextField2.setText(""+porcionImagen[i]);} else {
                   // jTextField2.setText(jTextField2.getText() + "-" + porcionImagen[i]);
                    }*/
           // }
        }
        if(jCheckBox3.isSelected()) {
            int mediana=filtro.calcularMediana(porcionImagen);
            porcionImagen[(porcionImagen.length-1)/2]=mediana;
            jTextField3.setText(""+mediana);
           /* porcionImagen[(porcionImagen.length-1)/2]=mediana;
            for(int i=0;i<porcionImagen.length;i++) {
                if(i==0) {
                   // jTextField3.setText(""+porcionImagen[i]);} else {
                  //  jTextField3.setText(jTextField3.getText() + "-" + porcionImagen[i]);
                    }*/
            }

    }

    private boolean cargarPorcionImagen()
    {

      String ventanaSeleccionada=(String)comboVentana.getSelectedItem();
      int column=Integer.parseInt(ventanaSeleccionada.substring(0,1));
      int row=Integer.parseInt(ventanaSeleccionada.substring(2,3));
      int z=0;
      String columnSelected=(String)comboColumnas.getSelectedItem();
      int columnFrom=Integer.parseInt(columnSelected);
      String rowSelected=(String)comboFilas.getSelectedItem();
      int rowFrom=Integer.parseInt(rowSelected);
      porcionImagen= new int[row*column];
      if((column+columnFrom)<=12)
      {
          for (int i = rowFrom; i < row+rowFrom; i++)
          {
           for(int j=columnFrom;j<column+columnFrom;j++)
           {
               try{
               int currentValue=Integer.parseInt(tableImagen.getValueAt(i, j).toString());
               porcionImagen[z]=currentValue;
             
              z++;
            
               }
               catch(Exception e){return false;}

           }


          }

        }
 else
      {System.out.println("Ingreseotracombinacion");return false;}
        return true;


    }



}
