package TemperatureConverter;
public class TemperatureConverter extends  javax.swing.JFrame
{
    private javax.swing.JButton button1;
    private javax.swing.JButton button2;
    private javax.swing.JButton button3;
    private javax.swing.JCheckBox checkbox1;
    private javax.swing.JComboBox<String> combobox1;
    private javax.swing.JComboBox<String> combobox2;
    private javax.swing.JLabel label1;
    private javax.swing.JPanel panel1;
    private javax.swing.JSpinner spinner1;
    private javax.swing.JTextField textfield1;
    private javax.swing.JTextField textfield2;

    public TemperatureConverter()
    {
        initComponents();
    }

    private void initComponents()
    {
        checkbox1 = new javax.swing.JCheckBox();
        spinner1 = new javax.swing.JSpinner();
        panel1 = new javax.swing.JPanel();
        label1 = new javax.swing.JLabel();
        combobox1 = new javax.swing.JComboBox<>();
        combobox2 = new javax.swing.JComboBox<>();
        textfield1 = new javax.swing.JTextField();
        textfield2 = new javax.swing.JTextField();
        button1 = new javax.swing.JButton();
        button2 = new javax.swing.JButton();
        button3 = new javax.swing.JButton();

        checkbox1.setText("checkbox1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Temperature Converter");

        panel1.setBackground(new java.awt.Color(51,51,51));

        label1.setBackground(new java.awt.Color(255,255,255));
        label1.setFont(new java.awt.Font("Seqoe UI",1,24));;
        label1.setForeground(new java.awt.Color(255,255,255));
        label1.setText("Temperature Converter");

        javax.swing.GroupLayout panel1layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1layout);
        panel1layout.setHorizontalGroup(
            panel1layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1layout.createSequentialGroup()
                .addGap(142,142,142)
                .addComponent(label1)
                .addContainerGap(161,Short.MAX_VALUE))
        );
        panel1layout.setVerticalGroup(
            panel1layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1layout.createSequentialGroup()
                .addGap(19,19,19)
                .addComponent(label1)
                .addContainerGap(23,Short.MAX_VALUE))
        );

        combobox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"Celsius","Fahrenheit"}));
        combobox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"Celsius","Fahrenheit"}));

        textfield2.setEditable(false);

        button1.setFont(new java.awt.Font("Segoe UI",3,14));
        button1.setText("Convert");
        button1.addActionListener(new java.awt.event.ActionListener(){
            public void actionPerformed(java.awt.event.ActionEvent evt){
                button1ActionPerformerd(evt);
            }
        });

        button2.setFont(new java.awt.Font("Segoe UI",3,14));
        button2.setText("Clear");
        button2.addActionListener(new java.awt.event.ActionListener(){
            public void actionPerformed(java.awt.event.ActionEvent evt){
                button2ActionPerformerd(evt);
            }
        });
        
        button3.setFont(new java.awt.Font("Segoe UI",3,14));
        button3.setText("Exit");
        button3.addActionListener(new java.awt.event.ActionListener(){
            public void actionPerformed(java.awt.event.ActionEvent evt){
                button3ActionPerformerd(evt);
            }
        });


        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50,50,50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING,false)
                    .addComponent(combobox2,0,javax.swing.GroupLayout.DEFAULT_SIZE,Short.MAX_VALUE)
                    .addComponent(combobox1,0,116,Short.MAX_VALUE))
                .addGap(133, 133, 133)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textfield1,javax.swing.GroupLayout.PREFERRED_SIZE,97,javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textfield2,javax.swing.GroupLayout.PREFERRED_SIZE,97,javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,Short.MAX_VALUE)
                .addComponent(button1)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(button3)
                    .addComponent(button2))
                .addGap(29,29,29))
            .addComponent(panel1,javax.swing.GroupLayout.DEFAULT_SIZE,javax.swing.GroupLayout.DEFAULT_SIZE,Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel1,javax.swing.GroupLayout.PREFERRED_SIZE,javax.swing.GroupLayout.DEFAULT_SIZE,javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combobox1,javax.swing.GroupLayout.PREFERRED_SIZE,34,javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textfield1,javax.swing.GroupLayout.PREFERRED_SIZE,javax.swing.GroupLayout.DEFAULT_SIZE,javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3,3,3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button1)
                    .addComponent(button2))
                .addGap(18,18,18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combobox2,javax.swing.GroupLayout.PREFERRED_SIZE,33,javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textfield2,javax.swing.GroupLayout.PREFERRED_SIZE,javax.swing.GroupLayout.DEFAULT_SIZE,javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,javax.swing.GroupLayout.DEFAULT_SIZE,Short.MAX_VALUE)
                .addComponent(button3)
                .addGap(37,37,37))
        );
        pack();
    }

    private void button3ActionPerformerd(java.awt.event.ActionEvent evt){
        System.exit(0);
    }

    private void button2ActionPerformerd(java.awt.event.ActionEvent evt){
        textfield1.setText("");
        textfield2.setText("");
    }

    private void button1ActionPerformerd(java.awt.event.ActionEvent evt){
        String val1 = (String)combobox1.getSelectedItem();
        String val2 = (String)combobox2.getSelectedItem();

        if (val1.equals("Celsius") && val2.equals("Fahrenheit")){
            double cel = Double.parseDouble(textfield1.getText());
            double fah = (double)(((9.0/5.0)* cel) + 32);

            textfield2.setText(String.valueOf(fah));
        }
        else if (val1.equals("Celsius") && val2.equals("Celsius")){
            double c = Double.parseDouble(textfield1.getText());
            textfield2.setText(String.valueOf(c));
        }
        else if (val1.equals("Fahrenheit") && val2.equals("Celsius")){
            double f = Double.parseDouble(textfield1.getText());
            double c = (double)((f-32)*(5.0/9.0));
            textfield2.setText(String.valueOf(Math.round(c)));
        }
        else if (val1.equals("Fahrenheit") && val2.equals("Fahrenheit")){
            double f  = Double.parseDouble(textfield1.getText());
            textfield2.setText(String.valueOf(Math.round(f)));
        }
    }


    public static void main(String args[])
    {
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info:javax.swing.UIManager.getInstalledLookAndFeels()){
                if ("Nimbus".equals(info.getName())){
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        }   catch (ClassNotFoundException ex){
            java.util.logging.Logger.getLogger(TemperatureConverter.class.getName()).log(java.util.logging.Level.SEVERE,null,ex);
        }   catch (InstantiationException ex){
            java.util.logging.Logger.getLogger(TemperatureConverter.class.getName()).log(java.util.logging.Level.SEVERE,null,ex);
        }   catch (IllegalAccessException ex){
            java.util.logging.Logger.getLogger(TemperatureConverter.class.getName()).log(java.util.logging.Level.SEVERE,null,ex);
        }   catch (javax.swing.UnsupportedLookAndFeelException ex){
            java.util.logging.Logger.getLogger(TemperatureConverter.class.getName()).log(java.util.logging.Level.SEVERE,null,ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable(){
            public void run(){
                new TemperatureConverter().setVisible(true);
            }
        });
    }
}
