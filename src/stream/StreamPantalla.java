
package stream;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

public class StreamPantalla extends javax.swing.JFrame {

    ArrayList<Persona> Sujetos =new ArrayList();
    ArrayList<Persona> orden =new ArrayList();
    
    
    public static DefaultTableModel modelo1; 
    protected static String columnas1[]={"No","NOMBRE","APELLIDO PATERNO","APELLIDO MATERNO"};
    
    int mul,mil=0;
    public String a1,a2,a3="";

    public StreamPantalla() throws FileNotFoundException, IOException  {
        
        initComponents();
        setLocationRelativeTo(null);
        ///////////
        File nombress = new File("src\\stream\\archivo.txt");
        /////////////////
        BufferedReader reader = new BufferedReader(new FileReader(nombress));
        String at;
        /////////////////////
        while((at=reader.readLine())!=null){            
            String[] newString = at.split("\\s+");  
            for(String ss: newString){ 
                                                  
                    mul++;

                    if(mul==1){
                        a1=ss;
                    }else if(mul==2&&mil==999){
                        Persona miper = new Persona(a1,ss," ");
                        //String todo lo demas
                        Sujetos.add(miper);   
                        mul=0;
                        
                    }else if(mul==2){
                        a2=ss;
                    }else if(mul==3){   
                        
                     Persona miper = new Persona(a1,a2,ss);
                     
                        Sujetos.add(miper);   
                        mul=0;
                        mil++; 
                    } 
            }
        }
        mostrarcuadros();
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Titulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla1 = new javax.swing.JTable();
        Exit = new javax.swing.JButton();
        ACTIVAR = new javax.swing.JButton();
        Cancelar = new javax.swing.JButton();
        buscanombre = new javax.swing.JTextField();
        bnombre = new javax.swing.JButton();
        bapellido1 = new javax.swing.JButton();
        bapellido2 = new javax.swing.JButton();
        tiempoTradicional = new javax.swing.JLabel();
        nombres = new javax.swing.JTextField();
        apellidos1 = new javax.swing.JTextField();
        apellidos2 = new javax.swing.JTextField();
        nombrecompleto = new javax.swing.JButton();
        ordenar = new javax.swing.JButton();
        Onombre = new javax.swing.JRadioButton();
        Oapellido1 = new javax.swing.JRadioButton();
        Oapellido2 = new javax.swing.JRadioButton();
        ButA_Z = new javax.swing.JRadioButton();
        ButZ_A = new javax.swing.JRadioButton();
        BuscarTitulo = new javax.swing.JLabel();
        BuscarStream = new javax.swing.JTextField();
        NombreStream = new javax.swing.JRadioButton();
        ApellidoStream = new javax.swing.JRadioButton();
        ApellidoStreamSegundo = new javax.swing.JRadioButton();
        TiempoStream = new javax.swing.JLabel();
        Pantallatiempo = new javax.swing.JTextField();
        FraseOrdenar = new javax.swing.JLabel();
        NombreBoton = new javax.swing.JRadioButton();
        AZApellido2 = new javax.swing.JRadioButton();
        AZApellido = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Titulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Titulo.setText("Listado Metodo Tradicional y Stream");
        jPanel1.add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, 410, 20));

        tabla1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tabla1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 500, 250));

        Exit.setBackground(new java.awt.Color(255, 51, 51));
        Exit.setText("Exit");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        jPanel1.add(Exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 10, -1, -1));

        ACTIVAR.setText("Reanudar");
        ACTIVAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ACTIVARActionPerformed(evt);
            }
        });
        jPanel1.add(ACTIVAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, -1, -1));

        Cancelar.setText("Cancelar");
        Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarActionPerformed(evt);
            }
        });
        jPanel1.add(Cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));
        jPanel1.add(buscanombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 490, 280, -1));

        bnombre.setText("Buscar Nombre");
        bnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnombreActionPerformed(evt);
            }
        });
        jPanel1.add(bnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 520, 130, -1));

        bapellido1.setText("BuscarApellido 1");
        bapellido1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bapellido1ActionPerformed(evt);
            }
        });
        jPanel1.add(bapellido1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 520, 130, -1));

        bapellido2.setText("Buscar Apellido 2");
        bapellido2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bapellido2ActionPerformed(evt);
            }
        });
        jPanel1.add(bapellido2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 520, 130, -1));

        tiempoTradicional.setText("Tiempo Tradicional");
        jPanel1.add(tiempoTradicional, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 60, -1, -1));
        jPanel1.add(nombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 140, -1));
        jPanel1.add(apellidos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 140, -1));
        jPanel1.add(apellidos2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 140, 30));

        nombrecompleto.setText("Buscar Persona");
        nombrecompleto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombrecompletoActionPerformed(evt);
            }
        });
        jPanel1.add(nombrecompleto, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        ordenar.setText("ORDENAR ALFABETICAMENTE");
        ordenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ordenarActionPerformed(evt);
            }
        });
        jPanel1.add(ordenar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 140, -1, -1));

        Onombre.setText("Nombre");
        jPanel1.add(Onombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 100, -1, -1));

        Oapellido1.setText("Apellido 1");
        jPanel1.add(Oapellido1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 100, -1, -1));

        Oapellido2.setText("Apellido 2");
        jPanel1.add(Oapellido2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 100, -1, -1));

        ButA_Z.setText("De A - Z");
        jPanel1.add(ButA_Z, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 180, -1, -1));

        ButZ_A.setText("De Z - A");
        ButZ_A.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButZ_AActionPerformed(evt);
            }
        });
        jPanel1.add(ButZ_A, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 180, -1, -1));

        BuscarTitulo.setText("Buscar:");
        jPanel1.add(BuscarTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 200, -1, -1));

        BuscarStream.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarStreamActionPerformed(evt);
            }
        });
        jPanel1.add(BuscarStream, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 190, 160, 30));

        NombreStream.setText("Nombre");
        NombreStream.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreStreamActionPerformed(evt);
            }
        });
        jPanel1.add(NombreStream, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 150, -1, -1));

        ApellidoStream.setText("Primer Apellido");
        ApellidoStream.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ApellidoStreamActionPerformed(evt);
            }
        });
        jPanel1.add(ApellidoStream, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 150, -1, -1));

        ApellidoStreamSegundo.setText("Segundo Apellido");
        ApellidoStreamSegundo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ApellidoStreamSegundoActionPerformed(evt);
            }
        });
        jPanel1.add(ApellidoStreamSegundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 150, -1, -1));

        TiempoStream.setText("Tiempo Steam:");
        jPanel1.add(TiempoStream, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 60, -1, -1));

        Pantallatiempo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jPanel1.add(Pantallatiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 90, 86, 41));

        FraseOrdenar.setText("Ordenar por:");
        jPanel1.add(FraseOrdenar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 510, 81, 20));

        NombreBoton.setText("A-Z Nombre");
        NombreBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreBotonActionPerformed(evt);
            }
        });
        jPanel1.add(NombreBoton, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 510, -1, -1));

        AZApellido2.setText("A-Z Segundo Apellido");
        AZApellido2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AZApellido2ActionPerformed(evt);
            }
        });
        jPanel1.add(AZApellido2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 510, -1, -1));

        AZApellido.setText("A-Z Segundo Apellido ");
        AZApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AZApellidoActionPerformed(evt);
            }
        });
        jPanel1.add(AZApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 510, -1, 20));

        jTable1.setModel(tabla);
        jScrollPane2.setViewportView(jTable1);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 230, 490, 260));

        jLabel1.setText("NOMBRE");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 50, 20));

        jLabel2.setText("APELLIDO PATERNO");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        jLabel3.setText("APELLIDO MATERNO");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 0, 1060, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        dispose();
    }//GEN-LAST:event_ExitActionPerformed

    private void ACTIVARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ACTIVARActionPerformed
        mostrarcuadros();
    }//GEN-LAST:event_ACTIVARActionPerformed

    private void CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarActionPerformed
        tabla1.setModel(new DefaultTableModel(null, columnas1));
        buscanombre.setText("");
    }//GEN-LAST:event_CancelarActionPerformed

    private void bnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnombreActionPerformed
        long startTime = System.currentTimeMillis();

        String busc=buscanombre.getText();
        modelo1 = new DefaultTableModel(null,columnas1);
        Persona miper = new Persona(busc,null,null);

        for (int i = 0; i < Sujetos.size(); i++) {
            int b=0;

            if(busc.equalsIgnoreCase(Sujetos.get(i).getNombre())){

                Object [] tupla = new Object[4];
                tupla[0] = (i+1);
                tupla[1] = Sujetos.get(i).getNombre();
                tupla[2] = Sujetos.get(i).getApellido1();
                tupla[3] = Sujetos.get(i).getApellido2();
                modelo1.addRow(tupla);
            }
            tabla1.setModel(modelo1);
        }
        long endTime = System.currentTimeMillis() - startTime;
        tiempoTradicional.setText(""+endTime+" milisegundos.");
    }//GEN-LAST:event_bnombreActionPerformed

    private void bapellido1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bapellido1ActionPerformed
        long startTime = System.currentTimeMillis();
        String busc=buscanombre.getText();
        modelo1 = new DefaultTableModel(null,columnas1);

        for (int i = 0; i < Sujetos.size(); i++) {
            int b=0;

            if(busc.equalsIgnoreCase(Sujetos.get(i).getApellido1())){

                Object [] tupla = new Object[4];
                tupla[0] = (i+1);
                tupla[1] = Sujetos.get(i).getNombre();
                tupla[2] = Sujetos.get(i).getApellido1();
                tupla[3] = Sujetos.get(i).getApellido2();
                modelo1.addRow(tupla);
            }
            tabla1.setModel(modelo1);
        }
        long endTime = System.currentTimeMillis() - startTime;
        tiempoTradicional.setText(""+endTime+" milisegundos.");
    }//GEN-LAST:event_bapellido1ActionPerformed

    private void bapellido2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bapellido2ActionPerformed
        long startTime = System.currentTimeMillis();
        String busc=buscanombre.getText();
        modelo1 = new DefaultTableModel(null,columnas1);

        for (int i = 0; i < Sujetos.size(); i++) {
            int b=0;

            if(busc.equalsIgnoreCase(Sujetos.get(i).getApellido2())){

                Object [] tupla = new Object[4];
                tupla[0] = (i+1);
                tupla[1] = Sujetos.get(i).getNombre();
                tupla[2] = Sujetos.get(i).getApellido1();
                tupla[3] = Sujetos.get(i).getApellido2();
                modelo1.addRow(tupla);
            }
            tabla1.setModel(modelo1);
        }
        long endTime = System.currentTimeMillis() - startTime;
        tiempoTradicional.setText(""+endTime+" milisegundos.");
    }//GEN-LAST:event_bapellido2ActionPerformed

    private void nombrecompletoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombrecompletoActionPerformed
        long startTime = System.currentTimeMillis();
        String busc=nombres.getText();
        String a1 = apellidos1.getText();
        String a2 = apellidos2.getText();

        modelo1 = new DefaultTableModel(null,columnas1);

        for (int i = 0; i < Sujetos.size(); i++) {
            int b=0;

            if(busc.equalsIgnoreCase(Sujetos.get(i).getNombre())){
                if(a1.equalsIgnoreCase(Sujetos.get(i).getApellido1())){
                    if(a2.equalsIgnoreCase(Sujetos.get(i).getApellido2())){

                        Object [] tupla = new Object[4];
                        tupla[0] = (i+1);
                        tupla[1] = Sujetos.get(i).getNombre();
                        tupla[2] = Sujetos.get(i).getApellido1();
                        tupla[3] = Sujetos.get(i).getApellido2();
                        modelo1.addRow(tupla);
                    }
                }
            }
            tabla1.setModel(modelo1);
        }
        long endTime = System.currentTimeMillis() - startTime;
        tiempoTradicional.setText(""+endTime+" milisegundos.");
    }//GEN-LAST:event_nombrecompletoActionPerformed

    private void ordenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ordenarActionPerformed
        if(Onombre.isSelected() && ButA_Z.isSelected()){
            Sujetos.sort((o1, o2) -> o1.getNombre().compareTo(o2.getNombre()));
            ordernarporalfabeto(Sujetos);
        }else if(Onombre.isSelected() && ButZ_A.isSelected()){
            Sujetos.sort((o1, o2) -> o2.getNombre().compareTo(o1.getNombre()));
            ordernarporalfabeto(Sujetos);
        }else if(Oapellido1.isSelected() && ButA_Z.isSelected()){
            Sujetos.sort((o1, o2) -> o1.getApellido1().compareTo(o2.getApellido1()));
            ordernarporalfabeto(Sujetos);
        }else if(Oapellido1.isSelected() && ButZ_A.isSelected()){
            Sujetos.sort((o1, o2) -> o2.getApellido1().compareTo(o1.getApellido1()));
            ordernarporalfabeto(Sujetos);
        }else if(Oapellido2.isSelected() && ButZ_A.isSelected()){
            Sujetos.sort((o1, o2) -> o2.getApellido2().compareTo(o1.getApellido2()));
            ordernarporalfabeto(Sujetos);
        }else if(Oapellido2.isSelected() && ButA_Z.isSelected()){
            Sujetos.sort((o1, o2) -> o1.getApellido2().compareTo(o2.getApellido2()));
            ordernarporalfabeto(Sujetos);
        }else{
            JOptionPane.showMessageDialog(null,"Seleciones Bien","ERROR",JOptionPane.ERROR_MESSAGE);
        }
        //Sujetos.stream().sorted( (o1, o2) -> o2.getNombre().compareTo(o1.getNombre())).collect(Collectors.toList());
    }//GEN-LAST:event_ordenarActionPerformed

    private void BuscarStreamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarStreamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BuscarStreamActionPerformed

    private void NombreStreamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreStreamActionPerformed
        // TODO add your handling code here:

        buscarNombre(documentos,BuscarStream.getText());
    }//GEN-LAST:event_NombreStreamActionPerformed

    private void ApellidoStreamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ApellidoStreamActionPerformed

        // TODO add your handling code here:
        buscarApellidoPa(documentos,BuscarStream.getText());
    }//GEN-LAST:event_ApellidoStreamActionPerformed

    private void ApellidoStreamSegundoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ApellidoStreamSegundoActionPerformed
        // TODO add your handling code here:
        buscarApellidoMa(documentos,BuscarStream.getText());
    }//GEN-LAST:event_ApellidoStreamSegundoActionPerformed

    private void NombreBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreBotonActionPerformed
        // TODO add your handling code here:
        ordenarNombre(documentos);
    }//GEN-LAST:event_NombreBotonActionPerformed

    private void AZApellido2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AZApellido2ActionPerformed
        // TODO add your handling code here:
        ordenaraApellidoP(documentos);
    }//GEN-LAST:event_AZApellido2ActionPerformed

    private void AZApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AZApellidoActionPerformed
        // TODO add your handling code here:
        ordenarApellidoM(documentos);
    }//GEN-LAST:event_AZApellidoActionPerformed

    private void ButZ_AActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButZ_AActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButZ_AActionPerformed

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
            java.util.logging.Logger.getLogger(StreamPantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StreamPantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StreamPantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StreamPantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new StreamPantalla().setVisible(true);
                } catch (IOException ex) {
                    java.util.logging.Logger.getLogger(StreamPantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                }  
            }
        });
    }

     public void mostrarcuadros(){
        long startTime = System.currentTimeMillis();
        modelo1 = new DefaultTableModel(null,columnas1); 
        
        for (int i = 0; i < Sujetos.size(); i++) {   
            Object [] tupla = new Object[4];
            tupla[0] = (i+1);
            tupla[1] = Sujetos.get(i).getNombre();
            tupla[2] = Sujetos.get(i).getApellido1();
            tupla[3] = Sujetos.get(i).getApellido2();       
            modelo1.addRow(tupla);  
        }
        tabla1.setModel(modelo1);
        
        long endTime = System.currentTimeMillis() - startTime;
        tiempoTradicional.setText(""+endTime+" milisegundos.");  
    }

        public void ordernarporalfabeto(ArrayList a){
        long startTime = System.currentTimeMillis();  
        modelo1 = new DefaultTableModel(null,columnas1); 
        
        for (int i = 0; i < Sujetos.size(); i++) {  
            Object [] tupla = new Object[4];
            tupla[0] = (i+1);
            tupla[1] = Sujetos.get(i).getNombre();
            tupla[2] = Sujetos.get(i).getApellido1();
            tupla[3] = Sujetos.get(i).getApellido2();       
            modelo1.addRow(tupla);  
        }
        tabla1.setModel(modelo1);
        
        long endTime = System.currentTimeMillis() - startTime;
        tiempoTradicional.setText(""+endTime+" milisegundos."); 
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton ACTIVAR;
    private javax.swing.JRadioButton AZApellido;
    private javax.swing.JRadioButton AZApellido2;
    private javax.swing.JRadioButton ApellidoStream;
    private javax.swing.JRadioButton ApellidoStreamSegundo;
    private javax.swing.JTextField BuscarStream;
    private javax.swing.JLabel BuscarTitulo;
    public static javax.swing.JRadioButton ButA_Z;
    public static javax.swing.JRadioButton ButZ_A;
    public static javax.swing.JButton Cancelar;
    public static javax.swing.JButton Exit;
    private javax.swing.JLabel FraseOrdenar;
    private javax.swing.JRadioButton NombreBoton;
    private javax.swing.JRadioButton NombreStream;
    public static javax.swing.JRadioButton Oapellido1;
    public static javax.swing.JRadioButton Oapellido2;
    public static javax.swing.JRadioButton Onombre;
    private javax.swing.JTextField Pantallatiempo;
    private javax.swing.JLabel TiempoStream;
    private javax.swing.JLabel Titulo;
    public static javax.swing.JTextField apellidos1;
    public static javax.swing.JTextField apellidos2;
    public static javax.swing.JButton bapellido1;
    public static javax.swing.JButton bapellido2;
    public static javax.swing.JButton bnombre;
    public static javax.swing.JTextField buscanombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    public static javax.swing.JButton nombrecompleto;
    public static javax.swing.JTextField nombres;
    public static javax.swing.JButton ordenar;
    public static javax.swing.JTable tabla1;
    public static javax.swing.JLabel tiempoTradicional;
    // End of variables declaration//GEN-END:variables

        ArrayList<Persona> documentos = new ArrayList();

    public void datos(ArrayList<Persona> archivo) {
        this.documentos = archivo;
        llenar(documentos);

    }
    
    public void buscarNombre (ArrayList<Persona> lista,String buscador){
        long tiempo=System.currentTimeMillis();
        
        ArrayList<Persona> buscarP;
        
        Stream<Persona> persona=lista.stream().filter(p -> {return p.getNombre().equalsIgnoreCase(buscador);
                } );
        buscarP=(ArrayList<Persona>) persona.collect(Collectors.toList());
        llenar(buscarP);
        long tiempo2=System.currentTimeMillis();
        long resta=tiempo2-tiempo;
        Pantallatiempo.setText(resta+"");
    }
    public void buscarApellidoPa(ArrayList<Persona> lista,String palabra){
        long tiempo=System.currentTimeMillis();
        ArrayList<Persona> BuscarP;
        Stream<Persona> persona=lista.stream().filter(p -> {return p.getApellido1().equalsIgnoreCase(palabra);
                } );
        BuscarP=(ArrayList<Persona>) persona.collect(Collectors.toList());
        llenar(BuscarP);
        long tiempo2=System.currentTimeMillis();
        long resta=tiempo2-tiempo;
        Pantallatiempo.setText(resta+"");
    }
    public void buscarApellidoMa(ArrayList<Persona> lista,String palabra){
        long tiempo=System.currentTimeMillis();
        ArrayList<Persona> BuscarP;
        Stream<Persona> persona=lista.stream().filter(p -> {return p.getApellido2().equalsIgnoreCase(palabra);
                } );
        BuscarP=(ArrayList<Persona>) persona.collect(Collectors.toList());
        llenar(BuscarP);
        long tiempo2=System.currentTimeMillis();
        long resta=tiempo2-tiempo;
        Pantallatiempo.setText(resta+"");
    }

    private void llenar(ArrayList<Persona> lista) {
        tabla.setRowCount(0);
        lista.stream().forEach(p1 -> {
            String[] persona1 = {p1.getNombre(), p1.getApellido1(), p1.getApellido2()};
        tabla.addRow(persona1);
        });
    }
     
    String[] modelo = {"Nombre", "Apellido Paterno", "Apellido Materno"};
    DefaultTableModel tabla = new DefaultTableModel(modelo, 0);
    
    
    private void ordenarNombre(ArrayList<Persona> ordenar ){
        long tiempo=System.currentTimeMillis();
        ArrayList<Persona> OrdenarP;
        Stream<Persona> persona=ordenar.stream().sorted((l1,l2) ->{return l1.getNombre().compareToIgnoreCase(l2.getNombre());
                });
        OrdenarP=(ArrayList<Persona>) persona.collect(Collectors.toList());
        llenar(OrdenarP);
        long tiempo2=System.currentTimeMillis();
        long resta=tiempo2-tiempo;
        Pantallatiempo.setText(resta+"");
    }
    private void ordenaraApellidoP(ArrayList<Persona> ordenar ){
         long tiempo=System.currentTimeMillis();
        ArrayList<Persona> OrdenarP;
        Stream<Persona> persona=ordenar.stream().sorted((l1,l2) ->{return l1.getApellido1().compareToIgnoreCase(l2.getApellido1());
                });
        OrdenarP=(ArrayList<Persona>) persona.collect(Collectors.toList());
        llenar(OrdenarP);
        long tiempo2=System.currentTimeMillis();
        long resta=tiempo2-tiempo;
        Pantallatiempo.setText(resta+"");
    }
    private void ordenarApellidoM(ArrayList<Persona> ordenar ){
        long tiempo=System.currentTimeMillis();
        ArrayList<Persona> OrdenarP;
        Stream<Persona> persona=ordenar.stream().sorted((l1,l2) ->{return l1.getApellido2().compareToIgnoreCase(l2.getApellido2());
                });
        OrdenarP=(ArrayList<Persona>) persona.collect(Collectors.toList());
        llenar(OrdenarP);
         long tiempo2=System.currentTimeMillis();
        long resta=tiempo2-tiempo;
        Pantallatiempo.setText(resta+"");
    }
}
