
package practica.pkg4;
import javax.swing.*;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.util.Random;


public class Tablero extends JFrame implements ActionListener{
    
    JLabel label[] = new JLabel[64];
    Color casillas, fondo, jugador, casilla2, jugador2;
    JButton movimiento;
    //JButton Volver;
    private int dadito, player, player2;
    FondoPanel pantalla = new FondoPanel(); 
    
    
    public Tablero() {
        super("Escaleras y Serpientes");
        this.setContentPane(pantalla);
        this.setSize(600,500);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane();
        objetos();
        this.getContentPane().setBackground(fondo);
        this.setVisible(true);
    }
    
    
    class FondoPanel extends JPanel{
        private Image imagen;
        
        public void paint(Graphics g){
            imagen = new ImageIcon(getClass().getResource("/pictures/Fondojuego.jpg")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            
            setOpaque(false);
            super.paint(g);
                    
        }
    }
    
    ///pictures/Fondojuego.jpg
    
    public void objetos(){
        casillas = new Color (255,255,0);
        casilla2 = new Color (255,0,0);
        fondo = new Color (0,255,255);
        jugador = new Color (0,255,0);
        jugador2 = new Color (0,0,255);
       
        for (int i = 0; i < label.length; i++) {
            label[i] = new JLabel("      "+(i+1)+"   ");
        }
        
        movimiento = new JButton("Dado");
       // Volver = new JButton("Volver");
        
        this.setLayout(null);
        
        label[0].setBounds(10, 10, 50, 50);
        label[1].setBounds(60, 10, 50, 50);
        label[2].setBounds(110, 10, 50, 50);
        label[3].setBounds(160, 10, 50, 50);
        label[4].setBounds(210, 10, 50, 50);
        label[5].setBounds(260, 10, 50, 50);
        label[6].setBounds(310, 10, 50, 50);
        label[7].setBounds(360, 10, 50, 50);
        
        //SEgunda fila
        label[8].setBounds(10, 60, 50, 50);
        label[9].setBounds(60, 60, 50, 50);
        label[10].setBounds(110, 60, 50, 50);
        label[11].setBounds(160, 60, 50, 50);
        label[12].setBounds(210, 60, 50, 50);
        label[13].setBounds(260, 60, 50, 50);
        label[14].setBounds(310, 60, 50, 50);
        label[15].setBounds(360, 60, 50, 50);
        
        //Tercerafila
        label[16].setBounds(10, 110, 50, 50);
        label[17].setBounds(60, 110, 50, 50);
        label[18].setBounds(110, 110, 50, 50);
        label[19].setBounds(160, 110, 50, 50);
        label[20].setBounds(210, 110, 50, 50);
        label[21].setBounds(260, 110, 50, 50);
        label[22].setBounds(310, 110, 50, 50);
        label[23].setBounds(360, 110, 50, 50);
        
        //cuartafila
        label[24].setBounds(10, 160, 50, 50);
        label[25].setBounds(60, 160, 50, 50);
        label[26].setBounds(110, 160, 50, 50);
        label[27].setBounds(160, 160, 50, 50);
        label[28].setBounds(210, 160, 50, 50);
        label[29].setBounds(260, 160, 50, 50);
        label[30].setBounds(310, 160, 50, 50);
        label[31].setBounds(360, 160, 50, 50);
        
        //quintafila
        label[32].setBounds(10, 210, 50, 50);
        label[33].setBounds(60, 210, 50, 50);
        label[34].setBounds(110, 210, 50, 50);
        label[35].setBounds(160, 210, 50, 50);
        label[36].setBounds(210, 210, 50, 50);
        label[37].setBounds(260, 210, 50, 50);
        label[38].setBounds(310, 210, 50, 50);
        label[39].setBounds(360, 210, 50, 50);
        
        //sextafila
        label[40].setBounds(10, 260, 50, 50);
        label[41].setBounds(60, 260, 50, 50);
        label[42].setBounds(110, 260, 50, 50);
        label[43].setBounds(160, 260, 50, 50);
        label[44].setBounds(210, 260, 50, 50);
        label[45].setBounds(260, 260, 50, 50);
        label[46].setBounds(310, 260, 50, 50);
        label[47].setBounds(360, 260, 50, 50);
        
        label[48].setBounds(10, 310, 50, 50);
        label[49].setBounds(60, 310, 50, 50);
        label[50].setBounds(110, 310, 50, 50);
        label[51].setBounds(160, 310, 50, 50);
        label[52].setBounds(210, 310, 50, 50);
        label[53].setBounds(260, 310, 50, 50);
        label[54].setBounds(310, 310, 50, 50);
        label[55].setBounds(360, 310, 50, 50);
        
        label[56].setBounds(10, 360, 50, 50);
        label[57].setBounds(60, 360, 50, 50);
        label[58].setBounds(110, 360, 50, 50);
        label[59].setBounds(160, 360, 50, 50);
        label[60].setBounds(210, 360, 50, 50);
        label[61].setBounds(260, 360, 50, 50);
        label[62].setBounds(310, 360, 50, 50);
        label[63].setBounds(360, 360, 50, 50);
        movimiento.setBounds(480,350,80,30);

        //Volver.setBounds(480,150,80,30);
        
        tab();
        label[0].setBackground(jugador);
       //label[1].setBackground(jugador2);

        for (int i = 0; i < label.length; i++) {
            this.add(label[i]);
        }

        this.add(movimiento);
        movimiento.addActionListener(this);
        
        //this.add(Volver);
        //Volver.addActionListener(this);

    }
        
    public void tab(){
               for (int i = 0; i < label.length; i++) {
            label[i].setOpaque(true);
        }
        
        
         //primerafila
        label[0].setBackground(casillas);
        label[1].setBackground(casilla2);
        label[2].setBackground(casillas);
        label[3].setBackground(casilla2);
        label[4].setBackground(casillas);
        label[5].setBackground(casilla2);
        label[6].setBackground(casillas);
        label[7].setBackground(casilla2);
        
        //Segundafila
        label[8].setBackground(casilla2);
        label[9].setBackground(casillas);
        label[10].setBackground(casilla2);
        label[11].setBackground(casillas);
        label[12].setBackground(casilla2);
        label[13].setBackground(casillas);
        label[14].setBackground(casilla2);
        label[15].setBackground(casillas);
        
        //tercerafila
        label[16].setBackground(casillas);
        label[17].setBackground(casilla2);
        label[18].setBackground(casillas);
        label[19].setBackground(casilla2);
        label[20].setBackground(casillas);
        label[21].setBackground(casilla2);
        label[22].setBackground(casillas);
        label[23].setBackground(casilla2);
        
        
        //Cuartafila
        label[24].setBackground(casilla2);
        label[25].setBackground(casillas);
        label[26].setBackground(casilla2);
        label[27].setBackground(casillas);
        label[28].setBackground(casilla2);
        label[29].setBackground(casillas);
        label[30].setBackground(casilla2);
        label[31].setBackground(casillas);
        
        //Quintafila
        label[32].setBackground(casillas);
        label[33].setBackground(casilla2);
        label[34].setBackground(casillas);
        label[35].setBackground(casilla2);
        label[36].setBackground(casillas);
        label[37].setBackground(casilla2);
        label[38].setBackground(casillas);
        label[39].setBackground(casilla2);
        
        //sextafila
        label[40].setBackground(casilla2);
        label[41].setBackground(casillas);
        label[42].setBackground(casilla2);
        label[43].setBackground(casillas);
        label[44].setBackground(casilla2);
        label[45].setBackground(casillas);
        label[46].setBackground(casilla2);
        label[47].setBackground(casillas);
        
          //septimafila
        label[48].setBackground(casillas);
        label[49].setBackground(casilla2);
        label[50].setBackground(casillas);
        label[51].setBackground(casilla2);
        label[52].setBackground(casillas);
        label[53].setBackground(casilla2);
        label[54].setBackground(casillas);
        label[55].setBackground(casilla2);
        
        
          //Octavafila
        label[56].setBackground(casilla2);
        label[57].setBackground(casillas);
        label[58].setBackground(casilla2);
        label[59].setBackground(casillas);
        label[60].setBackground(casilla2);
        label[61].setBackground(casillas);
        label[62].setBackground(casilla2);
        label[63].setBackground(casillas);
    }
    
    
    private JLabel[] j1 = new JLabel [64];
    private JLabel[] j2 = new JLabel [64];
    
    private int posj1 = 0;
    private int posj2 = 0;

    private int turno = 0;
    
    
    public void actionPerformed(ActionEvent ae) {
        if (turno == 0) {
            JOptionPane.showMessageDialog(null, "Turno Jugador 1");
            
            int espacios  = (int)(((Math.random())*60)/10)+1;
            
            posj1+=espacios;
            int postablero = posj1+1;
            JOptionPane.showMessageDialog(null, "Jugador 1 has sacado un '"+ espacios +"' te mueves a la posición '"+postablero+"' ");
            
            for (int i = 0; i < 64; i++) {
                
                if (posj1 == 4) {
                    JOptionPane.showMessageDialog(null, "Pisaste una escalera, avanza hasta la casilla 10");
                    posj1= 9;
                }
                if (posj1 == 9) {
                    JOptionPane.showMessageDialog(null, "Pisaste una escalera, avanza 4 espacios");
                    posj1= 13;
                }
                if (posj1 == 30) {
                    JOptionPane.showMessageDialog(null, "Pisaste una serpiente, retrocede 10 espacios");
                    posj1= 20;
                }
                if (posj1 == 54) {
                    JOptionPane.showMessageDialog(null, "Acabas de perder un turno");
                    posj1= 53;
                }
                if (posj1 == 60) {
                    JOptionPane.showMessageDialog(null, "Pisaste una serpiente, retrocede 8 espacios");
                    posj1= 52;
                }
                        
                    //Pintar tablero
                for (int j = 0; j < posj1; j++) { 
                    tab();
                    label[posj1].setBackground(jugador);  
                    label[posj2].setBackground(jugador2);
                 
                }
            }
            if (posj1 >=63) {
                JOptionPane.showMessageDialog(null, "El Jugador 1 es el Ganador");
                }

            
            turno =1;
              
            
 
        } else if (turno == 1) {
            JOptionPane.showMessageDialog(null, "Turno Jugador 2");

            int espacios  = (int)(((Math.random())*60)/10)+1;

            posj2+=espacios;
            int postablero = posj2+1;
            JOptionPane.showMessageDialog(null, "Jugador 2 has sacado un '"+ espacios +"' te mueves a la posición '"+postablero+"' ");

            for (int i = 0; i < 64; i++) {

                if (posj2 == 4) {
                    JOptionPane.showMessageDialog(null, "Pisaste una escalera, avanza hasta la casilla 10");
                    posj2= 9;
                }
                if (posj2 == 9) {
                    JOptionPane.showMessageDialog(null, "Pisaste una escalera, avanza 4 espacios");
                    posj2= 13;
                }
                if (posj2 == 30) {
                    JOptionPane.showMessageDialog(null, "Pisaste una serpiente, retrocede 10 espacios");
                    posj2= 21;
                }
                if (posj2 == 54) {
                    JOptionPane.showMessageDialog(null, "Acabas de perder un turno");
                    posj2= 53;
                }
                if (posj2 == 60) {
                    JOptionPane.showMessageDialog(null, "Pisaste una serpiente, retrocede 8 espacios");
                    posj2= 52;


                }

                //Pintar Tablero
                for (int j = 0; j < posj2; j++) {  
                    tab();
                    label[posj1].setBackground(jugador);  
                    label[posj2].setBackground(jugador2); 
                    
                }
      
            }
            if (posj2 >=63) {
                JOptionPane.showMessageDialog(null, "El Jugador 2 es el Ganador");
                }
            
            turno =0;
      
        }

      
    }

    
    //Lo de Swing   
    //Lo se Swing
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(528, Short.MAX_VALUE)
                .addComponent(Volver3)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(448, Short.MAX_VALUE)
                .addComponent(Volver3)
                .addGap(22, 22, 22))
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
