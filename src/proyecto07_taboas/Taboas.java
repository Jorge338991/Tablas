
package proyecto07_taboas;

import javax.swing.table.DefaultTableModel;

public class Taboas extends javax.swing.JFrame {
    
    DefaultTableModel modeloTaboa;

    public Taboas() {
        initComponents();
    }
    
    public Taboas(String titulo){
        
        initComponents();
        this.setTitle(titulo);
        //this.setVisible(true);
        encherTaboa();
        
    }
    
    public void encherTaboa(){
    
        //this.modeloTaboa = new DefaultTableModel();
        
        modeloTaboa = (DefaultTableModel)jTablePersonas.getModel();
        String[] persona1 = {"Ventura","Barreiro","50","Esta misma calle","venturita@ventura.com"};
        Integer []  numeros = {1,2,3,4,5,6};
        Integer []  numeros2 = {1,2,3,4,5};
        String[] persona2 = {"Ventura","Barreiro","50","Esta misma calle","venturita@ventura.com"};
        modeloTaboa.addRow(persona1);
        modeloTaboa.addRow(numeros);
        modeloTaboa.addRow(numeros2);
        modeloTaboa.addRow(persona2);
        modeloTaboa.insertRow(1, numeros);
        //modeloTaboa.setNumRows(4);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jToolBar1 = new javax.swing.JToolBar();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePersonas = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabelNombre = new javax.swing.JLabel();
        jLabelEdad = new javax.swing.JLabel();
        jButtonRellenar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuArchivo = new javax.swing.JMenu();
        jMenuItemNuevoProyecto = new javax.swing.JMenuItem();
        jMenuItemNuevoArchivo = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItemAbrir = new javax.swing.JMenuItem();
        jMenuItemGuardar = new javax.swing.JMenuItem();
        jMenuItemGuardarComo = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jMenuItemSalir = new javax.swing.JMenuItem();
        jMenuEdicion = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuVer = new javax.swing.JMenu();
        jMenuNavegar = new javax.swing.JMenu();
        jMenuOrigen = new javax.swing.JMenu();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);

        jTablePersonas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Apellidos", "Edad", "Dirección", "Email"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTablePersonas);

        jLabel1.setText("Nombre seleccionado: ");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Edad seleccionado: ");

        jButtonRellenar.setText("Rellenar Campos");
        jButtonRellenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRellenarActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Persona.png"))); // NOI18N

        jMenuArchivo.setMnemonic('A');
        jMenuArchivo.setText("Archivo");

        jMenuItemNuevoProyecto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto07_taboas/instagram.png"))); // NOI18N
        jMenuItemNuevoProyecto.setText("Nuevo Proyecto");
        jMenuArchivo.add(jMenuItemNuevoProyecto);

        jMenuItemNuevoArchivo.setText("Nuevo Archivo");
        jMenuItemNuevoArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemNuevoArchivoActionPerformed(evt);
            }
        });
        jMenuArchivo.add(jMenuItemNuevoArchivo);
        jMenuArchivo.add(jSeparator1);

        jMenuItemAbrir.setText("Arbir ...");
        jMenuArchivo.add(jMenuItemAbrir);

        jMenuItemGuardar.setText("Guardar");
        jMenuItemGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemGuardarActionPerformed(evt);
            }
        });
        jMenuArchivo.add(jMenuItemGuardar);

        jMenuItemGuardarComo.setText("Guardar Como ...");
        jMenuArchivo.add(jMenuItemGuardarComo);
        jMenuArchivo.add(jSeparator2);

        jMenu2.setText("Exportar");

        jMenuItem1.setText("A zip");
        jMenu2.add(jMenuItem1);

        jMenuArchivo.add(jMenu2);
        jMenuArchivo.add(jSeparator3);

        jMenuItemSalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_MASK));
        jMenuItemSalir.setText("Salir de NetBeans");
        jMenuItemSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSalirActionPerformed(evt);
            }
        });
        jMenuArchivo.add(jMenuItemSalir);

        jMenuBar1.add(jMenuArchivo);

        jMenuEdicion.setMnemonic('E');
        jMenuEdicion.setText("Edición");

        jMenuItem6.setText("Rehacer");
        jMenuEdicion.add(jMenuItem6);

        jMenuItem7.setText("Deshacer");
        jMenuEdicion.add(jMenuItem7);

        jMenuBar1.add(jMenuEdicion);

        jMenuVer.setMnemonic('v');
        jMenuVer.setText("Ver");
        jMenuBar1.add(jMenuVer);

        jMenuNavegar.setMnemonic('n');
        jMenuNavegar.setText("Navegar");
        jMenuBar1.add(jMenuNavegar);

        jMenuOrigen.setMnemonic('o');
        jMenuOrigen.setText("Origen");
        jMenuBar1.add(jMenuOrigen);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 605, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(jButtonRellenar)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabelNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabelEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonRellenar))
                .addGap(2, 2, 2)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemNuevoArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemNuevoArchivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemNuevoArchivoActionPerformed

    private void jMenuItemGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemGuardarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemGuardarActionPerformed

    private void jMenuItemSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItemSalirActionPerformed

    private void jButtonRellenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRellenarActionPerformed
        try{
        
        int filaSeleccionada = jTablePersonas.getSelectedRow();
        String nombre = String.valueOf(jTablePersonas.getValueAt(filaSeleccionada, 0));
        String edad = String.valueOf(jTablePersonas.getValueAt(filaSeleccionada, 2));
        jLabelNombre.setText(nombre);
        jLabelEdad.setText(edad);
        
        }catch(ArrayIndexOutOfBoundsException cosa ){
            System.out.println("Alarmaaaaaaaaaa");
        }
    }//GEN-LAST:event_jButtonRellenarActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Taboas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonRellenar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelEdad;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenuArchivo;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuEdicion;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItemAbrir;
    private javax.swing.JMenuItem jMenuItemGuardar;
    private javax.swing.JMenuItem jMenuItemGuardarComo;
    private javax.swing.JMenuItem jMenuItemNuevoArchivo;
    private javax.swing.JMenuItem jMenuItemNuevoProyecto;
    private javax.swing.JMenuItem jMenuItemSalir;
    private javax.swing.JMenu jMenuNavegar;
    private javax.swing.JMenu jMenuOrigen;
    private javax.swing.JMenu jMenuVer;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JTable jTablePersonas;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables
}
