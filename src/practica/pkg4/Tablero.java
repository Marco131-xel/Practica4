
package practica.pkg4;
import javax.swing.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


public class Tablero extends JFrame implements ActionListener{
    
    //Variables 
    JLabel c0, c1, c2, c3, c4, c5, c6, c7, c8, c9, c10, c11, c12, c13, c14, c15, c16,c17, c18, c19, c20, c21, c22, c23, c24, c25,
    c26, c27, c28, c29, c30,c31, c32, c33, c34, c35, c36, c37, c38, c39, c40, c41, c42, c43, c44, c45, c46, c47, c48;
    Color casillas, fondo, jugador, casilla2;
    JButton movimiento;
    int dadito, player;
    
    
    public Tablero() {
        super("Escaleras y Serpientes");
        initComponents();
        this.setSize(600,400);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane();
        objetos();
        this.getContentPane().setBackground(fondo);
        this.setVisible(true);
    }
    
        public void objetos(){
        casillas = new Color (255,255,0);
        casilla2 = new Color (255,0,0);
        fondo = new Color (0,255,255);
        jugador = new Color (0,0,0);
        c0 = new JLabel("");
        c1 = new JLabel("");
        c2 = new JLabel("");
        c3 = new JLabel("");
        c4 = new JLabel("");
        c5 = new JLabel("");
        c6 = new JLabel("");
        c7 = new JLabel("");
        c8 = new JLabel("");
        c9 = new JLabel("");
        c10 = new JLabel("");
        c11 = new JLabel("");
        c12 = new JLabel("");
        c13 = new JLabel("");
        c14 = new JLabel("");
        c15 = new JLabel("");
        c16 = new JLabel("");
        c17 = new JLabel("");
        c18 = new JLabel("");
        c19 = new JLabel("");
        c20 = new JLabel("");
        c21 = new JLabel("");
        c22 = new JLabel("");
        c23 = new JLabel("");
        c24 = new JLabel("");
        c25 = new JLabel("");
        c26 = new JLabel("");
        c27 = new JLabel("");
        c28 = new JLabel("");
        c29 = new JLabel("");
        c30 = new JLabel("");
        c31 = new JLabel("");
        c32 = new JLabel("");
        c33 = new JLabel("");
        c34 = new JLabel("");
        c35 = new JLabel("");
        c36 = new JLabel("");
        c37 = new JLabel("");
        c38 = new JLabel("");
        c39 = new JLabel("");
        c40 = new JLabel("");
        c41 = new JLabel("");
        c42 = new JLabel("");
        c43 = new JLabel("");
        c44 = new JLabel("");
        c45 = new JLabel("");
        c46 = new JLabel("");
        c47 = new JLabel("");
        c48 = new JLabel("");
        
        movimiento = new JButton("Dado");
        
        this.setLayout(null);
        
        c1.setBounds(10, 10, 50, 50);
        c2.setBounds(60, 10, 50, 50);
        c3.setBounds(110, 10, 50, 50);
        c4.setBounds(160, 10, 50, 50);
        c5.setBounds(210, 10, 50, 50);
        c6.setBounds(260, 10, 50, 50);
        c7.setBounds(310, 10, 50, 50);
        c8.setBounds(360, 10, 50, 50);
        
        //SEgunda fila
        c9.setBounds(10, 60, 50, 50);
        c10.setBounds(60, 60, 50, 50);
        c11.setBounds(110, 60, 50, 50);
        c12.setBounds(160, 60, 50, 50);
        c13.setBounds(210, 60, 50, 50);
        c14.setBounds(260, 60, 50, 50);
        c15.setBounds(310, 60, 50, 50);
        c16.setBounds(360, 60, 50, 50);
        
        //Tercerafila
        c17.setBounds(10, 110, 50, 50);
        c18.setBounds(60, 110, 50, 50);
        c19.setBounds(110, 110, 50, 50);
        c20.setBounds(160, 110, 50, 50);
        c21.setBounds(210, 110, 50, 50);
        c22.setBounds(260, 110, 50, 50);
        c23.setBounds(310, 110, 50, 50);
        c24.setBounds(360, 110, 50, 50);
        
        //cuartafila
        c25.setBounds(10, 160, 50, 50);
        c26.setBounds(60, 160, 50, 50);
        c27.setBounds(110, 160, 50, 50);
        c28.setBounds(160, 160, 50, 50);
        c29.setBounds(210, 160, 50, 50);
        c30.setBounds(260, 160, 50, 50);
        c31.setBounds(310, 160, 50, 50);
        c32.setBounds(360, 160, 50, 50);
        
        //quintafila
        c33.setBounds(10, 210, 50, 50);
        c34.setBounds(60, 210, 50, 50);
        c35.setBounds(110, 210, 50, 50);
        c36.setBounds(160, 210, 50, 50);
        c37.setBounds(210, 210, 50, 50);
        c38.setBounds(260, 210, 50, 50);
        c39.setBounds(310, 210, 50, 50);
        c40.setBounds(360, 210, 50, 50);
        
        //sextafila
        c41.setBounds(10, 260, 50, 50);
        c42.setBounds(60, 260, 50, 50);
        c43.setBounds(110, 260, 50, 50);
        c44.setBounds(160, 260, 50, 50);
        c45.setBounds(210, 260, 50, 50);
        c46.setBounds(260, 260, 50, 50);
        c47.setBounds(310, 260, 50, 50);
        c48.setBounds(360, 260, 50, 50);

        movimiento.setBounds(430,300,80,30);
        
        tab();
        c1.setBackground(jugador);

        this.add(c0);
        this.add(c1);
        this.add(c2);
        this.add(c3);
        this.add(c4);
        this.add(c5);
        this.add(c6);
        this.add(c7);
        this.add(c8);
        this.add(c9);
        this.add(c10);
        this.add(c11);
        this.add(c12);
        this.add(c13);
        this.add(c14);
        this.add(c15);
        this.add(c16);
        this.add(c17);
        this.add(c18);
        this.add(c19);
        this.add(c20);
        this.add(c21);
        this.add(c22);
        this.add(c23);
        this.add(c24);
        this.add(c25);
        this.add(c26);
        this.add(c27);
        this.add(c28);
        this.add(c29);
        this.add(c30);
        this.add(c31);
        this.add(c32);
        this.add(c33);
        this.add(c34);
        this.add(c35);
        this.add(c36);
        this.add(c37);
        this.add(c38);
        this.add(c39);
        this.add(c40);
        this.add(c41);
        this.add(c42);
        this.add(c43);
        this.add(c44);
        this.add(c45);
        this.add(c46);
        this.add(c47);
        this.add(c48);

        this.add(movimiento);
        movimiento.addActionListener(this);
    }
        
        public void tab(){
        c0.setOpaque(true);
        c1.setOpaque(true);
        c2.setOpaque(true);
        c3.setOpaque(true);
        c4.setOpaque(true);
        c5.setOpaque(true);
        c6.setOpaque(true);
        c7.setOpaque(true);
        c8.setOpaque(true);
        c9.setOpaque(true);
        c10.setOpaque(true);
        c11.setOpaque(true);
        c12.setOpaque(true);
        c13.setOpaque(true);
        c14.setOpaque(true);
        c15.setOpaque(true);
        c16.setOpaque(true);
        c17.setOpaque(true);
        c18.setOpaque(true);
        c19.setOpaque(true);
        c20.setOpaque(true);
        c21.setOpaque(true);
        c22.setOpaque(true);
        c23.setOpaque(true);
        c24.setOpaque(true);
        c25.setOpaque(true);
        c26.setOpaque(true);
        c27.setOpaque(true);
        c28.setOpaque(true);
        c29.setOpaque(true);
        c30.setOpaque(true);
        c31.setOpaque(true);
        c32.setOpaque(true);
        c33.setOpaque(true);
        c34.setOpaque(true);
        c35.setOpaque(true);
        c36.setOpaque(true);
        c37.setOpaque(true);
        c38.setOpaque(true);
        c39.setOpaque(true);
        c40.setOpaque(true);
        c41.setOpaque(true);
        c42.setOpaque(true);
        c43.setOpaque(true);
        c44.setOpaque(true);
        c45.setOpaque(true);
        c46.setOpaque(true);
        c47.setOpaque(true);
        c48.setOpaque(true);
        
        c1.setBackground(casillas);
        c2.setBackground(casilla2);
        c3.setBackground(casillas);
        c4.setBackground(casilla2);
        c5.setBackground(casillas);
        c6.setBackground(casilla2);
        c7.setBackground(casillas);
        c8.setBackground(casilla2);
        
        //Segundafila
        c9.setBackground(casilla2);
        c10.setBackground(casillas);
        c11.setBackground(casilla2);
        c12.setBackground(casillas);
        c13.setBackground(casilla2);
        c14.setBackground(casillas);
        c15.setBackground(casilla2);
        c16.setBackground(casillas);
        
        //TerceraFila
        c17.setBackground(casillas);
        c18.setBackground(casilla2);
        c19.setBackground(casillas);
        c20.setBackground(casilla2);
        c21.setBackground(casillas);
        c22.setBackground(casilla2);
        c23.setBackground(casillas);
        c24.setBackground(casilla2);
        //Cuartafila
        c25.setBackground(casilla2);
        c26.setBackground(casillas);
        c27.setBackground(casilla2);
        c28.setBackground(casillas);
        c29.setBackground(casilla2);
        c30.setBackground(casillas);
        c31.setBackground(casilla2);
        c32.setBackground(casillas);
        
        //Quintafila
        c33.setBackground(casillas);
        c34.setBackground(casilla2);
        c35.setBackground(casillas);
        c36.setBackground(casilla2);
        c37.setBackground(casillas);
        c38.setBackground(casilla2);
        c39.setBackground(casillas);
        c40.setBackground(casilla2);
        
        //sextafila
        c41.setBackground(casilla2);
        c42.setBackground(casillas);
        c43.setBackground(casilla2);
        c44.setBackground(casillas);
        c45.setBackground(casilla2);
        c46.setBackground(casillas);
        c47.setBackground(casilla2);
        c48.setBackground(casillas);
        
    }
    
        public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == movimiento){
            dadito = (int)(((Math.random())*60)/10)+1;
            JOptionPane.showMessageDialog(null,dadito);
            player = player + dadito;
            switch(player){
                case 0:
                    tab();
                    c1.setBackground(jugador);
                break;
                case 1:
                    tab();
                    c2.setBackground(jugador);
                break;
                case 2:
                    tab();
                    c3.setBackground(jugador);
                break;
                case 3:
                    tab();
                    c4.setBackground(jugador);
                break;
                case 4:
                    tab();
                    c5.setBackground(jugador);
                break;
                case 5:
                    tab();
                    c6.setBackground(jugador);
                break;
                case 6:
                    tab();
                    c7.setBackground(jugador);
                break;
                case 7:
                    tab();
                    c8.setBackground(jugador);
                break;
                case 8:
                    tab();
                    c9.setBackground(jugador);
                break;
                case 9:
                    tab();
                    c10.setBackground(jugador);
                break;
                case 10:
                    tab();
                    c11.setBackground(jugador);
                break;
                
                //Segund parte
                case 11:
                    tab();
                    c12.setBackground(jugador);
                break;
                case 12:
                    tab();
                    c13.setBackground(jugador);
                break;
                case 13:
                    tab();
                    c14.setBackground(jugador);
                break;
                case 14:
                    tab();
                    c15.setBackground(jugador);
                break;
                case 15:
                    tab();
                    c16.setBackground(jugador);
                break;
                case 16:
                    tab();
                    c17.setBackground(jugador);
                break;
                case 17:
                    tab();
                    c18.setBackground(jugador);
                break;
                case 18:
                    tab();
                    c19.setBackground(jugador);
                break;
                case 19:
                    tab();
                    c20.setBackground(jugador);
                break;
                case 20:
                    tab();
                    c21.setBackground(jugador);
                break;
                
                //Tercera parte
                case 21:
                    tab();
                    c22.setBackground(jugador);
                break;
                case 22:
                    tab();
                    c23.setBackground(jugador);
                break;
                case 23:
                    tab();
                    c24.setBackground(jugador);
                break;
                case 24:
                    tab();
                    c25.setBackground(jugador);
                break;
                case 25:
                    tab();
                    c26.setBackground(jugador);
                break;
                case 26:
                    tab();
                    c27.setBackground(jugador);
                break;
                case 27:
                    tab();
                    c28.setBackground(jugador);
                break;
                case 28:
                    tab();
                    c29.setBackground(jugador);
                break;
                case 29:
                    tab();
                    c30.setBackground(jugador);
                break;
                case 30:
                    tab();
                    c31.setBackground(jugador);
                break;
                
                //Cuarta parte
                case 31:
                    tab();
                    c32.setBackground(jugador);
                break;
                case 32:
                    tab();
                    c33.setBackground(jugador);
                break;
                case 33:
                    tab();
                    c34.setBackground(jugador);
                break;
                case 34:
                    tab();
                    c35.setBackground(jugador);
                break;
                case 35:
                    tab();
                    c36.setBackground(jugador);
                break;
                case 36:
                    tab();
                    c37.setBackground(jugador);
                break;
                case 37:
                    tab();
                    c38.setBackground(jugador);
                break;
                case 38:
                    tab();
                    c39.setBackground(jugador);
                break;
                case 39:
                    tab();
                    c40.setBackground(jugador);
                break;
                case 40:
                    tab();
                    c41.setBackground(jugador);
                break;
                
                //Quinta parte
                case 41:
                    tab();
                    c42.setBackground(jugador);
                break;
                case 42:
                    tab();
                    c43.setBackground(jugador);
                break;
                case 43:
                    tab();
                    c44.setBackground(jugador);
                break;
                case 44:
                    tab();
                    c45.setBackground(jugador);
                break;
                case 45:
                    tab();
                    c46.setBackground(jugador);
                break;
                case 46:
                    tab();
                    c47.setBackground(jugador);
                break;
                case 47:
                    tab();
                    c48.setBackground(jugador);
                break;
            }
        }
      
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Volver3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Volver3.setText("Volver");
        Volver3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Volver3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Volver3)
                .addGap(0, 402, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 326, Short.MAX_VALUE)
                .addComponent(Volver3))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Volver3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Volver3ActionPerformed
        this.setVisible(false);
        new Menu().setVisible(true);
    }//GEN-LAST:event_Volver3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Tablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tablero().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Volver3;
    // End of variables declaration//GEN-END:variables
}
