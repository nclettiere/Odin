package presentacion;

import java.awt.Toolkit;
import javax.swing.ImageIcon;
import logica.Articulos;

public class Principal extends javax.swing.JFrame {

    public static Articulos articulos = new Articulos();
    
    public Principal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        bAltaArticulo = new javax.swing.JMenuItem();
        bKill = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        bCantidad = new javax.swing.JMenuItem();
        bCaro = new javax.swing.JMenuItem();
        bListar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 527, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 347, Short.MAX_VALUE)
        );

        jMenu1.setText("Altas y bajas");

        bAltaArticulo.setText("Alta Articulo");
        bAltaArticulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAltaArticuloActionPerformed(evt);
            }
        });
        jMenu1.add(bAltaArticulo);

        bKill.setText("Eliminar Articulo");
        bKill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bKillActionPerformed(evt);
            }
        });
        jMenu1.add(bKill);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Listados y Consultas");

        bCantidad.setText("Cantidad");
        bCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCantidadActionPerformed(evt);
            }
        });
        jMenu2.add(bCantidad);

        bCaro.setText("Articulo mas caro");
        bCaro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCaroActionPerformed(evt);
            }
        });
        jMenu2.add(bCaro);

        bListar.setText("Listar");
        bListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bListarActionPerformed(evt);
            }
        });
        jMenu2.add(bListar);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCantidadActionPerformed
        CantidadArticulos cantidadArticulos = new CantidadArticulos();
        int width = cantidadArticulos.getSizes()[0];
        int height = cantidadArticulos.getSizes()[1];
        this.setSize(width, height);
        jDesktopPane1.add(cantidadArticulos);
        cantidadArticulos.setVisible(true); 
    }//GEN-LAST:event_bCantidadActionPerformed

    private void bAltaArticuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAltaArticuloActionPerformed
        NuevoArticulo nuevoArticulo = new NuevoArticulo();
        int width = nuevoArticulo.getSizes()[0];
        int height = nuevoArticulo.getSizes()[1];
        this.setSize(width, height);
        jDesktopPane1.add(nuevoArticulo);
        nuevoArticulo.setVisible(true); 
    }//GEN-LAST:event_bAltaArticuloActionPerformed

    private void bListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bListarActionPerformed
        ListarArticulos listarArticulos = new ListarArticulos();
        int width = listarArticulos.getSizes()[0];
        int height = listarArticulos.getSizes()[1];
        this.setSize(width, height);
        jDesktopPane1.add(listarArticulos);
        listarArticulos.setVisible(true); 
    }//GEN-LAST:event_bListarActionPerformed

    private void bCaroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCaroActionPerformed
        ArticuloMasCaro articulocaro = new ArticuloMasCaro();
        int width = articulocaro.getSizes()[0];
        int height = articulocaro.getSizes()[1];
        this.setSize(width, height);
        jDesktopPane1.add(articulocaro);
        articulocaro.setVisible(true); 
    }//GEN-LAST:event_bCaroActionPerformed

    private void bKillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bKillActionPerformed
        EliminarArticulo eliminarArticulo = new EliminarArticulo();
        int width = eliminarArticulo.getSizes()[0];
        int height = eliminarArticulo.getSizes()[1];
        this.setSize(width, height);
        jDesktopPane1.add(eliminarArticulo);
        eliminarArticulo.setVisible(true); 
    }//GEN-LAST:event_bKillActionPerformed


    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Principal principal = new Principal();
                principal.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Assets/if_Viking_Male_80909.png")));
                principal.setTitle("Odin - v1.0.0-stable");
                principal.setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem bAltaArticulo;
    private javax.swing.JMenuItem bCantidad;
    private javax.swing.JMenuItem bCaro;
    private javax.swing.JMenuItem bKill;
    private javax.swing.JMenuItem bListar;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
