package parqueadero.presentacion;

import java.awt.Color;
import java.util.Calendar;
import java.util.List;
import mvcf.AModel;
import mvcf.AView;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import parqueadero.negocio.GestorClientes;
import parqueadero.negocio.GestorVigilante;
import parqueadero.negocio.ReporteIngreso;
import parqueadero.utils.Utilidades;

/**
 *
 * @author Usuario
 */
public class GUIAdministrador extends javax.swing.JFrame implements AView {
    /**
     * Creates new form GUIAdministrador
     */
    public GUIAdministrador() {
        this.initComponents();
        super.setSize(700, 600);
        super.setLocationRelativeTo(null);
        btnGroup1.add(rbFemenino);
        btnGroup1.add(rbMasculino);
        rbFemenino.setSelected(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        btnGroup1 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel7 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        lblIdent = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblApellido = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        lblUser = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtPass = new javax.swing.JPasswordField();
        jPanel4 = new javax.swing.JPanel();
        lblGeneroU = new javax.swing.JLabel();
        rbFemenino = new javax.swing.JRadioButton();
        rbMasculino = new javax.swing.JRadioButton();
        jPanel9 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        fechaNac = new com.toedter.calendar.JCalendar();
        jPanel6 = new javax.swing.JPanel();
        btnCrearVigi = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        pnlBotonGenerarReporte = new javax.swing.JPanel();
        btnGenerarReporte = new javax.swing.JButton();
        pnlPrincipalReporte = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Administrador");
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        jPanel7.setMinimumSize(new java.awt.Dimension(20, 7));
        jPanel7.setPreferredSize(new java.awt.Dimension(600, 600));
        jPanel7.setLayout(new java.awt.GridBagLayout());

        jPanel1.setPreferredSize(new java.awt.Dimension(600, 50));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        lblIdent.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblIdent.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblIdent.setText("Identificación:");
        lblIdent.setToolTipText("");
        lblIdent.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblIdent.setPreferredSize(new java.awt.Dimension(110, 50));
        jPanel1.add(lblIdent, new java.awt.GridBagConstraints());

        txtId.setText(" ");
        txtId.setPreferredSize(new java.awt.Dimension(200, 50));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
        jPanel1.add(txtId, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 5, 0);
        jPanel7.add(jPanel1, gridBagConstraints);

        jPanel3.setPreferredSize(new java.awt.Dimension(600, 50));
        jPanel3.setLayout(new java.awt.GridBagLayout());

        lblNombre.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombre.setText("Nombre:");
        lblNombre.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblNombre.setPreferredSize(new java.awt.Dimension(110, 50));
        lblNombre.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel3.add(lblNombre, new java.awt.GridBagConstraints());

        txtNombre.setPreferredSize(new java.awt.Dimension(150, 50));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        jPanel3.add(txtNombre, gridBagConstraints);

        lblApellido.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblApellido.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblApellido.setText("Apellido:");
        lblApellido.setPreferredSize(new java.awt.Dimension(110, 50));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 5);
        jPanel3.add(lblApellido, gridBagConstraints);

        txtApellido.setMinimumSize(new java.awt.Dimension(50, 30));
        txtApellido.setPreferredSize(new java.awt.Dimension(150, 50));
        jPanel3.add(txtApellido, new java.awt.GridBagConstraints());

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 5, 0);
        jPanel7.add(jPanel3, gridBagConstraints);

        jPanel5.setPreferredSize(new java.awt.Dimension(600, 50));
        jPanel5.setLayout(new java.awt.GridBagLayout());

        lblUser.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUser.setText("User:");
        lblUser.setPreferredSize(new java.awt.Dimension(110, 50));
        jPanel5.add(lblUser, new java.awt.GridBagConstraints());

        txtUser.setMinimumSize(new java.awt.Dimension(50, 30));
        txtUser.setPreferredSize(new java.awt.Dimension(150, 50));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        jPanel5.add(txtUser, gridBagConstraints);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Clave Acceso:");
        jLabel13.setPreferredSize(new java.awt.Dimension(110, 50));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 5);
        jPanel5.add(jLabel13, gridBagConstraints);

        txtPass.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txtPass.setMinimumSize(new java.awt.Dimension(50, 30));
        txtPass.setPreferredSize(new java.awt.Dimension(150, 50));
        jPanel5.add(txtPass, new java.awt.GridBagConstraints());

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 5, 0);
        jPanel7.add(jPanel5, gridBagConstraints);

        jPanel4.setPreferredSize(new java.awt.Dimension(600, 50));
        jPanel4.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 10, 10));

        lblGeneroU.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblGeneroU.setText("Género:");
        jPanel4.add(lblGeneroU);

        rbFemenino.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rbFemenino.setText("Femenino");
        jPanel4.add(rbFemenino);

        rbMasculino.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rbMasculino.setText("Masculino");
        rbMasculino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbMasculinoActionPerformed(evt);
            }
        });
        jPanel4.add(rbMasculino);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 5, 0);
        jPanel7.add(jPanel4, gridBagConstraints);

        jPanel9.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 25, 5));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Fecha de Nacimiento:");
        jLabel11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel9.add(jLabel11);

        fechaNac.setMinimumSize(new java.awt.Dimension(20, 7));
        fechaNac.setPreferredSize(new java.awt.Dimension(253, 150));
        jPanel9.add(fechaNac);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        jPanel7.add(jPanel9, gridBagConstraints);

        btnCrearVigi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnCrearVigi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/vigilante.png"))); // NOI18N
        btnCrearVigi.setText("Crear Vigilante");
        btnCrearVigi.setPreferredSize(new java.awt.Dimension(200, 50));
        btnCrearVigi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearVigiActionPerformed(evt);
            }
        });
        jPanel6.add(btnCrearVigi);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        jPanel7.add(jPanel6, gridBagConstraints);

        jTabbedPane1.addTab("Gestión Vigilante", jPanel7);

        jPanel2.setLayout(new java.awt.BorderLayout());

        btnGenerarReporte.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnGenerarReporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/reporte .png"))); // NOI18N
        btnGenerarReporte.setText("Generar Reporte");
        btnGenerarReporte.setPreferredSize(new java.awt.Dimension(200, 40));
        btnGenerarReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarReporteActionPerformed(evt);
            }
        });
        pnlBotonGenerarReporte.add(btnGenerarReporte);

        jPanel2.add(pnlBotonGenerarReporte, java.awt.BorderLayout.NORTH);

        pnlPrincipalReporte.setLayout(new javax.swing.BoxLayout(pnlPrincipalReporte, javax.swing.BoxLayout.LINE_AXIS));
        jPanel2.add(pnlPrincipalReporte, java.awt.BorderLayout.CENTER);

        jTabbedPane1.addTab("Reporte Horas Congestión", jPanel2);

        getContentPane().add(jTabbedPane1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearVigiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearVigiActionPerformed
        // TODO add your handling code here:
        String numeroid = txtId.getText().trim();
        String nombre = txtNombre.getText().trim().toUpperCase();
        String apellido = txtApellido.getText().trim().toUpperCase();
        String rol = "ADMINISTRATIVO";
        String user = txtUser.getText().trim();
        String pass = txtPass.getText().trim();
        String genero;
        if (rbFemenino.isSelected()) {
            genero = "FEMENINO";
        }
        else if (rbMasculino.isSelected()) {
            genero = "MASCULINO";
        }
        else
        {
            Utilidades.mensajeError("No ha seleccionado el Genero", "Gestión Vegilante");
            return;
        }

        String fechaNaci = this.fechaNac.getCalendar().get(Calendar.DAY_OF_MONTH) + "-";
        fechaNaci += this.fechaNac.getCalendar().get(Calendar.MONTH) + "-";
        fechaNaci += this.fechaNac.getCalendar().get(Calendar.YEAR) + "";
        GestorVigilante gestor = new GestorVigilante();
        GestorClientes gestorCli = new GestorClientes();
        String info;

        info = String.format("%s,%s,%s,%s,%s,%s", numeroid, nombre, apellido, genero, fechaNaci, rol);
        String respuesta = gestorCli.IngresarClienteCentral(info);
        if(!respuesta.equals("OK")){
            Utilidades.mensajeError("Errror al intentar crear el vigilante", "Gestión Vegilante");
            return;
        }
        info = String.format("%s,%s,%s", numeroid, user, pass);

        respuesta = gestor.insertarUsuario(info);
        if(!respuesta.equals("OK")){
            Utilidades.mensajeError("Error al intentar crear el vigilante", "Gestión Vigilante");
            return;
        }

        Utilidades.mensajeExito("Se registro un nuevo Vigilante en la central", "Gestión Vegilante");
    }//GEN-LAST:event_btnCrearVigiActionPerformed

    private void rbMasculinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbMasculinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbMasculinoActionPerformed

    private void btnGenerarReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarReporteActionPerformed

        GestorVigilante gestor = new GestorVigilante();
        List<ReporteIngreso> reportes = gestor.generarReporteHorasIngreso();
        if (reportes != null) {
            DefaultCategoryDataset dataSet = new DefaultCategoryDataset();
            for (ReporteIngreso ingreso : reportes) {
                dataSet.setValue(Double.parseDouble(ingreso.getCantidad()), "Hora de ingreso", ingreso.getFechaIngreso());
            }
            JFreeChart jchart = ChartFactory.createBarChart("Reporte de Ingresos Por Hora", "", "Cantidad de ingresos", dataSet, PlotOrientation.VERTICAL, true, true, false);

            CategoryPlot plot = jchart.getCategoryPlot();
            plot.setRangeGridlinePaint(Color.BLACK);
            
            ChartPanel panel = new ChartPanel(jchart);
            this.add(panel);

            pnlPrincipalReporte.removeAll();
            pnlPrincipalReporte.add(panel);
            pnlPrincipalReporte.updateUI();
        } else {
            Utilidades.mensajeError("No se pudo generar el Reporte", "Generación del reporte");
        }
    }//GEN-LAST:event_btnGenerarReporteActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrearVigi;
    private javax.swing.JButton btnGenerarReporte;
    private javax.swing.ButtonGroup btnGroup1;
    private com.toedter.calendar.JCalendar fechaNac;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblGeneroU;
    private javax.swing.JLabel lblIdent;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblUser;
    private javax.swing.JPanel pnlBotonGenerarReporte;
    private javax.swing.JPanel pnlPrincipalReporte;
    private javax.swing.JRadioButton rbFemenino;
    private javax.swing.JRadioButton rbMasculino;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actualizar(AModel arg0) {
    }
}
