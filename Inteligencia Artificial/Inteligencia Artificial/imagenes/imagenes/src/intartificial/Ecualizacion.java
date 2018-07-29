/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Ecualizacion.java
 *
 * Created on 14-ago-2013, 22:33:29
 */

package intartificial;

import java.awt.Font;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.SwingConstants;
/**
 *
 * @author Ani Rufinetto
 */
public class Ecualizacion extends javax.swing.JDialog {
private ArrayList imagen;
private int cantidadTotal=0;
private int[] imagenEcualizada;
private float[] niveles;
private float[] frecuencias;
    /** Creates new form Ecualizacion */
    public Ecualizacion(java.awt.Frame parent, boolean modal, ArrayList ima,int n,String msj) {
        super(parent, modal);
       
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Ecualización");
        tableImagenFiltrada.setAutoResizeMode(tableImagenFiltrada.AUTO_RESIZE_ALL_COLUMNS);
        Font font=new Font("Century Gothic", Font.PLAIN, 11);
        this.tableImagenFiltrada.getTableHeader().setFont(font);
         jLabel5.setText(msj);
        imagen=ima;
        nivel=n;
        comboHasta.setSelectedIndex(nivel-6);
        k=nivel+1;
        jLabel4.setText(""+k);
        tableImagenFiltrada.setFillsViewportHeight(true);
        if(ima!=null)
        {
            cargar();
          
        }
        
        DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
tcr.setHorizontalAlignment(SwingConstants.CENTER);
tableImagenFiltrada.getColumnModel().getColumn(0).setCellRenderer(tcr);
tableImagenFiltrada.getColumnModel().getColumn(1).setCellRenderer(tcr);
tableImagenFiltrada.getColumnModel().getColumn(2).setCellRenderer(tcr);
tableImagenFiltrada.getColumnModel().getColumn(3).setCellRenderer(tcr);
tableImagenFiltrada.getColumnModel().getColumn(4).setCellRenderer(tcr);

    }

private void calcularTotal() {

    for(int i=0;i<17;i++){
        if(tableImagenFiltrada.getValueAt(i, 1)!=null){
           cantidadTotal = cantidadTotal+ Integer.parseInt(tableImagenFiltrada.getValueAt(i,1).toString());
                 }
        
    }
  //  tableImagenFiltrada.setValueAt(cantidadTotal, 0, 2);

}
private void cargar()  {
    
     for(int i=0;i<imagen.size();i++){
         NivelGris n=(NivelGris) imagen.get(i);
      tableImagenFiltrada.setValueAt(n.getFrecuencia(), i, 1);

    }
           
       
    }
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnVolver = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableImagenFiltrada = new javax.swing.JTable();
        btnVolver1 = new javax.swing.JButton();
        btnVolver2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        comboHasta = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btnVolver.setFont(new java.awt.Font("Century Gothic", 0, 11));
        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        tableImagenFiltrada.setFont(new java.awt.Font("Century Gothic", 0, 11));
        tableImagenFiltrada.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {new Integer(0), null, null, null, null},
                {new Integer(1), null, null, null, null},
                {new Integer(2), null, null, null, null},
                {new Integer(3), null, null, null, null},
                {new Integer(4), null, null, null, null},
                {new Integer(5), null, null, null, null},
                {new Integer(6), null, null, null, null},
                {new Integer(7), null, null, null, null},
                {new Integer(8), null, null, null, null},
                {new Integer(9), null, null, null, null},
                {new Integer(10), null, null, null, null},
                {new Integer(11), null, null, null, null},
                {new Integer(12), null, null, null, null},
                {new Integer(13), null, null, null, null},
                {new Integer(14), null, null, null, null},
                {new Integer(15), null, null, null, null},
                {new Integer(16), null, null, null, null}
            },
            new String [] {
                "Nivel", "Frecuencia", "Frecuencia Relativa", "Δg", "g'=gprevia+Δg"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Float.class, java.lang.Float.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableImagenFiltrada.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tableImagenFiltrada);
        tableImagenFiltrada.getColumnModel().getColumn(0).setResizable(false);
        tableImagenFiltrada.getColumnModel().getColumn(1).setResizable(false);
        tableImagenFiltrada.getColumnModel().getColumn(3).setResizable(false);
        tableImagenFiltrada.getColumnModel().getColumn(4).setResizable(false);

        btnVolver1.setFont(new java.awt.Font("Century Gothic", 0, 11));
        btnVolver1.setText("Calcular");
        btnVolver1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolver1ActionPerformed(evt);
            }
        });

        btnVolver2.setFont(new java.awt.Font("Century Gothic", 0, 11));
        btnVolver2.setText("Ver Gráfico");
        btnVolver2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolver2ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 11));
        jLabel2.setText("Niveles de grises de 0 a:");

        comboHasta.setFont(new java.awt.Font("Century Gothic", 0, 11));
        comboHasta.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16" }));
        comboHasta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboHastaActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 11));
        jLabel3.setText("Valor de K =");

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 11));
        jLabel4.setText("6");

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 11));
        jLabel5.setText("Ingrese las frecuencias absolutas");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(btnVolver1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnVolver2))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 553, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboHasta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboHasta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVolver1)
                    .addComponent(btnVolver2))
                .addGap(26, 26, 26)
                .addComponent(btnVolver)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

 private void cleanTable()
    {

     for(int i=1;i<6;i++)
      {
      for(int j=0;j<17;j++)
      {

        this.tableImagenFiltrada.setValueAt(null, j, i);

      }

      }}
    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        // TODO add your handling code here:
     // cleanTable();

       // imagen=null;
      //  jLabel5.setText("Ingrese las frecuencias absolutas");
        this.dispose();


    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnVolver1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolver1ActionPerformed
        // TODO add your handling code here:
       // cantidadTotal=0;
        imagen=new ArrayList<NivelGris>();
        niveles=new float[k];
        frecuencias=new float[k];
        calcularTotal();
        float y=0,z=0;
        imagenEcualizada=new int[k];
         for(int i=0;i<k;i++){
           Object ob= tableImagenFiltrada.getValueAt(i, 1);
        if(ob!=null){
            float x=(float)Integer.parseInt(ob.toString())/cantidadTotal;
          tableImagenFiltrada.setValueAt(x, i, 2);
          y=x*k;
          tableImagenFiltrada.setValueAt(y, i, 3);
          tableImagenFiltrada.setValueAt(z+=y, i, 4);
           //tableImagenFiltrada.setValueAt(Math.round(z), i, 5);
           if(x!=0 && z!=0)
           { frecuencias[i] = x;
             niveles[i]=z;
             NivelGris nivel=new NivelGris();
             nivel.setNivelGris(i);
             nivel.setFrecuencia(Integer.parseInt(ob.toString()));
           
             nivel.setgPrevia(z);
             imagen.add(nivel);
           imagenEcualizada[i]=Integer.parseInt(ob.toString());
                 }
             }
    }
    }//GEN-LAST:event_btnVolver1ActionPerformed
   private float[] crearVectorFloat(int[] y)
    {
       float[] x=new float[y.length];
        for(int i=0;i<y.length;i++)
        {
            x[i]=(float)y[i];
        }
       return x;
    }


    private void btnVolver2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolver2ActionPerformed
        // TODO add your handling code here:

     //   his=new Histograma();
       // int[] arrayEcualizado=his.calcularHistogramaEcualizado(imagen,imagenEcualizada);
       // int[] dd=his.calcularHistograma(arrayEcualizado,0, 6);

   //     if(imagenEcualizada!=null)
        {

          // GraficoHistogramaEcualizado gh=new GraficoHistogramaEcualizado(parent,true, crearVectorFloat(dd),"histogramaEcualizado.jpg");
            GraficoHistogramaEcualizado gh=new GraficoHistogramaEcualizado(parent,true,niveles,frecuencias,"histogramaEcualizado.jpg");
            gh.setVisible(true);

        }
      /*  else
        {
          System.out.println("Genere la imagen");
        }*/

    }//GEN-LAST:event_btnVolver2ActionPerformed

    private void comboHastaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboHastaActionPerformed
        // TODO add your handling code here:
        nivel=Integer.parseInt(comboHasta.getSelectedItem().toString());
        k=(nivel+1);
        jLabel4.setText(""+k);
}//GEN-LAST:event_comboHastaActionPerformed

    /**
    * @param args the command line arguments
    */
  
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVolver;
    private javax.swing.JButton btnVolver1;
    private javax.swing.JButton btnVolver2;
    private javax.swing.JComboBox comboHasta;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tableImagenFiltrada;
    // End of variables declaration//GEN-END:variables
private int nivel=6;
private int k=0;
private JFrame parent;
private float[] ecuali;
private Histograma his;
}
