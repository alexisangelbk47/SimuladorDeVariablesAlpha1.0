
package varalcondis;

/**
 *
 * @author Alexis
 */
import java.awt.FlowLayout;
import java.awt.LinearGradientPaint;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Principal extends javax.swing.JFrame implements ActionListener {
    //seleccion del metodo
    String met="";

    //auxiliar para generar los arreglos
    int E;
    int R;
    //arreglos
    double cantidad[]= new double[E];
    double resultado[]= new double[R];
    //crear arreglos de textfield y label
    public JTextField txtFArreglo[];
    public JLabel lblArreglo[]= new JLabel[E];
    public JLabel lblResultado[]= new JLabel[R];
    //variables generales para operar
    double media=0;
    double varianza=0;
    double desviacion=0;
    
    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        btnCantidad.addActionListener(this);
        
        /*
        int E = 5;
        JTextField txtFArreglo[]= new JTextField[E];
        for(int i=0; i<E; i++){
            txtFArreglo[i] = new JTextField(20);
            txtFArreglo[i].setBounds( 60 + (i*60),50, 80, 80);           
            pnlEntrada.add(txtFArreglo[i]);
            txtFArreglo[i].setVisible(true);
        }
        */
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        lblMetodo = new javax.swing.JLabel();
        lblEntrada = new javax.swing.JLabel();
        txtFCantidad = new javax.swing.JTextField();
        lblGenerar = new javax.swing.JLabel();
        txtFGenerar = new javax.swing.JTextField();
        btnCantidad = new javax.swing.JButton();
        btnCalcular = new javax.swing.JButton();
        btnAleatorios = new javax.swing.JButton();
        pnlEntrada = new javax.swing.JPanel();
        pnlResultado = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(758, 567));

        jComboBox1.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Geometrica", "Binomial", "Binomial Negativa", "Poisson", "Uniforme", "Exponencial", "Gamma", "Normal", "Logaritmica" }));

        lblMetodo.setText("selecciona un metodo: ");

        lblEntrada.setText("introduce el numero de variables a introducir: ");

        lblGenerar.setText("introduce el numero de variables a generar: ");

        btnCantidad.setText("abrir vacantes");
        btnCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCantidadActionPerformed(evt);
            }
        });

        btnCalcular.setText("calcular parametros iniciales");
        btnCalcular.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCalcularMouseClicked(evt);
            }
        });

        btnAleatorios.setText("calcular numeros aleatorios");
        btnAleatorios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAleatoriosMouseClicked(evt);
            }
        });

        pnlEntrada.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout pnlEntradaLayout = new javax.swing.GroupLayout(pnlEntrada);
        pnlEntrada.setLayout(pnlEntradaLayout);
        pnlEntradaLayout.setHorizontalGroup(
            pnlEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 606, Short.MAX_VALUE)
        );
        pnlEntradaLayout.setVerticalGroup(
            pnlEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 128, Short.MAX_VALUE)
        );

        pnlResultado.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout pnlResultadoLayout = new javax.swing.GroupLayout(pnlResultado);
        pnlResultado.setLayout(pnlResultadoLayout);
        pnlResultadoLayout.setHorizontalGroup(
            pnlResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 606, Short.MAX_VALUE)
        );
        pnlResultadoLayout.setVerticalGroup(
            pnlResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 128, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pnlEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblEntrada)
                                .addGap(10, 10, 10)
                                .addComponent(txtFCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnCantidad)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCalcular))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblMetodo)
                                .addGap(10, 10, 10)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblGenerar)
                                .addGap(7, 7, 7)
                                .addComponent(txtFGenerar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnAleatorios)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 5, Short.MAX_VALUE)))
                .addContainerGap(41, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMetodo)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEntrada)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtFCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnCantidad)
                        .addComponent(btnCalcular)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblGenerar)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtFGenerar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnAleatorios)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(88, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCantidadActionPerformed
        // TODO add your handling code here:
        borrarContenido();
        generarTextCantidad();
        generarLabelCantidad();
        
    }//GEN-LAST:event_btnCantidadActionPerformed

    private void btnCalcularMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCalcularMouseClicked
        //calcular variables escenciales para los metodos y almacenas variables utilizadas
        calcularMedia();
        calcularVarianza();
        calcularDesviacion();
        rellenarLabel();
    }//GEN-LAST:event_btnCalcularMouseClicked

    private void btnAleatoriosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAleatoriosMouseClicked
        // TODO add your handling code here:
        borrarResultados();
        met = jComboBox1.getSelectedItem().toString();
        generarLabelResultado();
        for (int i=0; i<R; i++){
            switch(met){
                case "Geometrica": lblResultado[i].setText(Double.toString(geometrica())); break;
                case "Binomial": lblResultado[i].setText(Double.toString(binomial())); break;
                case "Binomial Negativa": lblResultado[i].setText(Double.toString(binomialNegativa())); break;
                case "Uniforme": lblResultado[i].setText(Double.toString(uniforme())); break;
                case "Exponencial": lblResultado[i].setText(Double.toString(exponencial())); break;
                case "Poisson": lblResultado[i].setText(Double.toString(poisson())); break;
                case "Gamma": lblResultado[i].setText(Double.toString(Gamma())); break;
                case "Normal": lblResultado[i].setText(Double.toString(Normal())); break;
                case "Logaritmica": lblResultado[i].setText(Double.toString(Logaritmica())); break;
                
                
                
            }
        }
    }//GEN-LAST:event_btnAleatoriosMouseClicked

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }
    
    //metodos para generar los campos de texto
    public void generarTextCantidad(){
        //generar las vacantes para las variables a introducir
        E = Integer.parseInt(txtFCantidad.getText());
        txtFArreglo= new JTextField[E];
        System.out.println("ITM: " + txtFArreglo.length);
//spnlEntrada.getViewport().setLayout(new FlowLayout());
        System.out.println("E: " + E);
        for(int i=0; i<E; i++){
            System.out.println("i: " + i);
            txtFArreglo[i] = new JTextField(20);
            
            txtFArreglo[i].setBounds( 40 + (i*55),20, 40, 30);           
            pnlEntrada.add(txtFArreglo[i]);
            txtFArreglo[i].setVisible(true);
            
        }
        //pnlEntrada.add(pnlEntrada);
        System.out.println("COMPONENTES: " + pnlEntrada.getComponents().length);
        pnlEntrada.setVisible(true);
        pnlEntrada.updateUI();
    }
    public void generarLabelCantidad(){
        lblArreglo= new JLabel[E];
        System.out.println("ITM: " + lblArreglo.length);

        System.out.println("E: " + E);
        for(int i=0; i<E; i++){
            System.out.println("i: " + i);
            lblArreglo[i] = new JLabel("vacio");
            
            lblArreglo[i].setBounds( 40 + (i*55),50, 40, 20);           
            pnlEntrada.add(lblArreglo[i]);
            lblArreglo[i].setVisible(true);
            
        }
        System.out.println("COMPONENTES: " + pnlEntrada.getComponents().length);
        pnlEntrada.setVisible(true);
        pnlEntrada.updateUI();
    
    }
    public void rellenarLabel(){
        System.out.println("rellenando Label");
        for(int i=0; i<E; i++){
            System.out.println("i: " + i);
            lblArreglo[i].setText(txtFArreglo[i].getText());
            pnlEntrada.updateUI();
        }
    }
    public void generarLabelResultado(){
        
        R = Integer.parseInt(txtFGenerar.getText());
        lblResultado = new JLabel[R];
        System.out.println("ITM: " + lblResultado.length);

        System.out.println("R: " + R);
        for(int i=0; i<R; i++){
            System.out.println("i: " + i);
            lblResultado[i] = new JLabel("vacio");
            
            lblResultado[i].setBounds( 55 + (i*60),50, 40, 20);           
            pnlResultado.add(lblResultado[i]);
            lblResultado[i].setVisible(true);
            
        }
        System.out.println("COMPONENTES: " + pnlResultado.getComponents().length);
        pnlResultado.setVisible(true);
        pnlResultado.updateUI();
    
    }
    //borrar contenido de los paneles
    public void borrarContenido(){
        if(E>0){
            
                pnlEntrada.removeAll();
                E=0;
            
        }
    }
    public void borrarResultados(){
        if(R>0){
        pnlResultado.removeAll();
                R=0;
        }
    }
    //calculamos media, varianza y desviacion estandar
    public void calcularMedia(){
        double variableMedia=0;
        double sumatoria=0;
        System.out.println("calculando media");
        for (int i=0; i<E; i++){
            variableMedia = Double.parseDouble(txtFArreglo[i].getText());
            sumatoria = sumatoria + variableMedia;
            System.out.println("valor de la sumatoria: " + sumatoria);
        }
        media= sumatoria / E;
        System.out.println("Media: " + media);
    }
    public void calcularVarianza(){
        System.out.println("calculando varianza");
        double variableVarianza=0;
        double sumatoria=0;
        
        for (int i=0; i<E; i++){
            variableVarianza = Double.parseDouble(txtFArreglo[i].getText());
            sumatoria = sumatoria + Math.pow((variableVarianza- media),2);
            System.out.println("valor de la sumatoria: " + sumatoria);
        }
        varianza = sumatoria / E;
        System.out.println("Varianza: " + varianza);
    }
    public void calcularDesviacion(){
        System.out.println("calculando desviacion estandar");
        desviacion = Math.sqrt(varianza);
        System.out.println("Desviacion: " + desviacion);
    }
    //comienza la creacion de los metodos
    //metodos discretos
    public double geometrica(){
        double P = 1 / ( 1 + media);
        System.out.println("P: " + P);
        double Q = 1 - P;
        System.out.println("Q: " + Q);
        double Ri = Math.random();
        System.out.println("Ri: " + Ri);
        
        double Xi = Math.log(Ri)/ Math.log(Q);
        double resultado = Xi;
        System.out.println("resultado: " + resultado);
        return resultado;
    }
    public double binomial(){
        double P= (media - varianza) / media;
        double regresar;
        try{
        double N= (int)(Math.round(Math.pow(media, 2) / (media - varianza)));
        double Ri = Math.random();
        double Xi[]= new double[((int)(N))];
        double resultar=0;
        //Xi[0]= 0;
         for (int j = 0; j < R; j++) {
            int x = 0;
            for (int i = 0; i < N; i++) {
                if (Math.random() <= P) {
                    x++;
                }
            }
            Xi[j]=x;
        }
        regresar = resultar;
        }catch(NegativeArraySizeException err){
            JOptionPane.showMessageDialog(null,"Metodo no viable para los numeros ingresados");
            regresar=0;
        }
        return regresar;
    }
    public double binomialNegativa(){
        double P = media / varianza;
        double Q = 1 - P;
        double Xi = 0;
        double K = (Math.round(Math.pow(media, 2) / (varianza - media)));
        for(int i = 0;i<R;i++){
            double num = Math.random();
            for(int j = 1;j<K;j++){
                num = num * Math.random();
            }
            
        
        Xi= Math.log(num) / Math.log(Q);
        }
        return Xi;
    }
    public double poisson(){
        //hace falta terminarla
        double Xi= 0;
        double onda = Math.exp(-media);
        for (int i = 0; i < R; i++) {
            double num = Math.random();
            int var = 1;
            while (num > onda) {
                num = num * Math.random();
                var++;
            }
            Xi = var;
        }
        return Xi;
    }
    //metodos continuos
    public double uniforme(){
        double A = media - (Math.sqrt(3*varianza));
        double B = (2 * media) - A;
        double Ri = Math.random();
        double Xi = A + ((B - A)* Ri);
        return Xi;
    }
    public double exponencial(){
        double Ri = Math.random();
        double Xi = media * Math.log(Ri);
        return Xi;
    }
    
    
    public double Gamma(){
        double Xi = 0;
        double a = media/varianza;
        double k = Math.round((media*media)/varianza);
        for(int i=0;i<R;i++){
            double r = Math.random();
            for(int j = 1;j<k;j++){
                r = r * Math.random();
            }
            r = Math.log(r);
            r = Math.round((-1/a)*r);
            Xi=r;
        } 
        return Xi;
    }
    
    public double Normal(){
        double Xi = 0;
        for(int i = 0;i < R;i++){
            double r = 0;
            for(int j = 1;j<13;j++){
                r = r + Math.random();
            }
            r = r - 6;
            r = Math.round((r*desviacion)+media);
            Xi = r;
        }
        return Xi;
    }
    
    public double Logaritmica(){
        double Xi = 0;
        double va = Math.log((varianza/(media*media))+1);
        double My = Math.log(media)-(.5*va);
        for(int i = 0;i < R;i++){
            double r = 0;
            for(int j = 0;j < 12;j++){
               r = r + Math.random(); 
            }
            r = r - 6;
            r = (r * Math.sqrt(va)) + My;
            r = Math.round(Math.exp(r));
            Xi = r;
            System.out.print(r+"\t");
        }
        return Xi;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAleatorios;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnCantidad;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel lblEntrada;
    private javax.swing.JLabel lblGenerar;
    private javax.swing.JLabel lblMetodo;
    private javax.swing.JPanel pnlEntrada;
    private javax.swing.JPanel pnlResultado;
    private javax.swing.JTextField txtFCantidad;
    private javax.swing.JTextField txtFGenerar;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        if (btnCantidad.isSelected()){
            generarTextCantidad();
        }
    }
}
