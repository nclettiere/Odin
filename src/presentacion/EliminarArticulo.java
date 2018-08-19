package presentacion;

import java.awt.HeadlessException;
import java.awt.Rectangle;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import logica.Articulo;
import logica.Articulos;

public class EliminarArticulo extends javax.swing.JInternalFrame {
    private final Articulos articulos;
    
    public EliminarArticulo() {
        initComponents();
        articulos = Principal.articulos;
    }

    public int[] getSizes()  {
        Rectangle r = this.getBounds();
        int h = r.height;
        int w = r.width;
        int[] array = {w+15,h+60};
        return array;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tCodigo = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Eliminar Articulo", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));

        jLabel1.setText("Codigo");

        jButton1.setText("KILL");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 394, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(89, 89, 89)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(101, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 274, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(80, 80, 80)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(80, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            int codigo = Integer.parseInt(tCodigo.getText());
            Articulo a = articulos.devolverCodigo(codigo);
        
            if(articulos.eliminar(a)) {
                JOptionPane optionPane = new JOptionPane("Articulo: "+ codigo + " eliminado.", JOptionPane.INFORMATION_MESSAGE);
                JDialog dialog = optionPane.createDialog("Vamos progresando, karnal.");
                dialog.setAlwaysOnTop(true);
                dialog.setVisible(true);
                System.out.println(articulos.toString());
            }else {
                JOptionPane optionPane = new JOptionPane("Hubo un error o no se ha encontrado el articulo.\n Verifique el codigo.", JOptionPane.ERROR_MESSAGE);
                JDialog dialog = optionPane.createDialog("Hay veces que me sacas, sabes...?");
                dialog.setAlwaysOnTop(true);
                dialog.setVisible(true);
                System.out.println(articulos.toString());
            }
        }catch(HeadlessException | NumberFormatException | SecurityException e) {
            JOptionPane optionPane = new JOptionPane("Campo vacio o no numerico.\n Verifique el codigo.", JOptionPane.ERROR_MESSAGE);
            JDialog dialog = optionPane.createDialog("Dios, acaso no sirves para nada?");
            dialog.setAlwaysOnTop(true);
            dialog.setVisible(true);
            System.out.println(articulos.toString());
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField tCodigo;
    // End of variables declaration//GEN-END:variables
}
