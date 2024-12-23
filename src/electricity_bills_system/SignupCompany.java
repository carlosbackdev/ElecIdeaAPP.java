
package electricity_bills_system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class SignupCompany extends JFrame implements ActionListener {
    RoundedButton volver,crear;
    Choice tipousu,empresa_nombre;
    JTextField cajon_nombre,cajon_nif,cajon_direccion,cajon_postal,cajon_ciudad,cajon_mail;
    JTextField cajon_tlf,cajon_iban;
    SignupCompany(){
        super("Registro");
        setContentPane(new BackgroundPanel("images/login.jpg"));
        setLayout(new BorderLayout());
        Font fuente=new Font("Roboto", Font.PLAIN, 24);

        JPanel panel = new JPanel(new GridBagLayout());
        panel.setOpaque(false);
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(15, 0, 25, 0);
        gbc.ipadx = 90;

        JLabel head = new JLabel("          REGISTRAR EMPRESA");
        head.setForeground(Color.WHITE);
        head.setFont(fuente);
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        panel.add(head, gbc);

        JLabel tipo_usuario = new JLabel("Nombre");
        gbc.anchor = GridBagConstraints.WEST;
        tipo_usuario.setForeground(Color.WHITE);
        tipo_usuario.setFont(fuente);
        gbc.gridy = 1;        
        gbc.gridwidth = 1;
        gbc.gridx = 0;
        panel.add(tipo_usuario, gbc);

        cajon_nombre = new JTextField();
        cajon_nombre.setFont(new Font("Roboto", Font.PLAIN, 17));
        cajon_nombre.setHorizontalAlignment(JTextField.CENTER);
        gbc.gridx = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL; 
        gbc.weightx = 0; 
        panel.add(cajon_nombre, gbc);

        JLabel nombreusu = new JLabel("NIF");
        gbc.anchor = GridBagConstraints.WEST;
        nombreusu.setForeground(Color.WHITE);
        nombreusu.setFont(fuente);
        gbc.gridy = 2;
        gbc.gridx = 0;
        panel.add(nombreusu, gbc);

        cajon_nif = new JTextField();
        cajon_nif.setFont(new Font("Roboto", Font.PLAIN, 17));
        cajon_nif.setHorizontalAlignment(JTextField.CENTER);
        gbc.gridx = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL; 
        gbc.weightx = 0; 
        panel.add(cajon_nif, gbc);
        
        JLabel nombrecompleto = new JLabel("Dirección");
        nombrecompleto.setForeground(Color.WHITE);
        nombrecompleto.setFont(fuente);
        gbc.gridy = 3;
        gbc.gridx = 0;
        panel.add(nombrecompleto, gbc);

        cajon_direccion = new JTextField();
        cajon_direccion.setFont(new Font("Roboto", Font.PLAIN, 17));
        cajon_direccion.setHorizontalAlignment(JTextField.CENTER);
        gbc.gridx = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL; 
        gbc.weightx = 0; 
        panel.add(cajon_direccion, gbc);
        
        JLabel contraseña = new JLabel("Postal");
        contraseña.setForeground(Color.WHITE);
        contraseña.setFont(fuente);
        gbc.gridy = 4;
        gbc.gridx = 0;
        panel.add(contraseña, gbc);

        cajon_postal = new JTextField();
        cajon_postal.setFont(new Font("Roboto", Font.PLAIN, 17));
        cajon_postal.setHorizontalAlignment(JTextField.CENTER);
        gbc.gridx = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL; 
        gbc.weightx = 0; 
        panel.add(cajon_postal, gbc);
        
        JLabel empresa = new JLabel("Ciudad");
        empresa.setForeground(Color.WHITE);
        empresa.setFont(fuente);
        gbc.gridy = 5;
        gbc.gridx = 0;
        panel.add(empresa, gbc);

        cajon_ciudad = new JTextField();
        cajon_ciudad.setFont(new Font("Roboto", Font.PLAIN, 17));
        cajon_ciudad.setHorizontalAlignment(JTextField.CENTER);
        gbc.gridx = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL; 
        gbc.weightx = 0; 
        panel.add(cajon_ciudad, gbc); 
        
        JLabel empresacod = new JLabel("Email");
        empresacod.setForeground(Color.WHITE);
        empresacod.setFont(fuente);
        gbc.gridy = 6;
        gbc.gridx = 0;
        panel.add(empresacod, gbc);

        cajon_mail = new JTextField();
        cajon_mail.setFont(new Font("Roboto", Font.PLAIN, 17));
        cajon_mail.setHorizontalAlignment(JTextField.CENTER);
        gbc.gridx = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL; 
        gbc.weightx = 0; 
        panel.add(cajon_mail, gbc);        
        
        JLabel inf = new JLabel("Telefono");
        gbc.anchor = GridBagConstraints.CENTER;
        inf.setForeground(Color.WHITE);
        inf.setFont(fuente);
        gbc.gridy = 7;
        gbc.gridwidth = 2;
        gbc.gridx = 0;
        panel.add(inf, gbc);
        
        cajon_tlf = new JTextField();
        cajon_tlf.setFont(new Font("Roboto", Font.PLAIN, 17));
        cajon_tlf.setHorizontalAlignment(JTextField.CENTER);
        gbc.gridx = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL; 
        gbc.weightx = 0; 
        panel.add(cajon_tlf, gbc);
        
        JLabel iban = new JLabel("IBAN");
        gbc.anchor = GridBagConstraints.CENTER;
        iban.setForeground(Color.WHITE);
        iban.setFont(fuente);
        gbc.gridy = 8;
        gbc.gridwidth = 2;
        gbc.gridx = 0;
        panel.add(iban, gbc);
        
        cajon_iban = new JTextField();
        cajon_iban.setFont(new Font("Roboto", Font.PLAIN, 17));
        cajon_iban.setHorizontalAlignment(JTextField.CENTER);
        gbc.gridx = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL; 
        gbc.weightx = 0; 
        panel.add(cajon_iban, gbc);
        
        JLabel margen = new JLabel();
        gbc.gridy = 9;
        gbc.gridwidth = 2;
        gbc.gridx = 0;
        panel.add(margen, gbc);
        
        
        JPanel panelBotones = new JPanel(new BorderLayout());
        panelBotones.setOpaque(false); 
        gbc.gridx = 0;
        gbc.gridy = 10; 
        gbc.gridwidth = 2; 
        gbc.fill = GridBagConstraints.NONE; 
        gbc.anchor = GridBagConstraints.CENTER; 
        panel.add(panelBotones, gbc);
        
        
        
        crear  = new RoundedButton("   Registrar   ");
        crear.setBackground(new Color(222, 239, 255));
        crear.setForeground(Color.BLACK);
        crear.setFont(new Font("Roboto", Font.PLAIN, 18)); 
        crear.addActionListener(this);
        panelBotones.add(crear);
        panelBotones.add(crear, BorderLayout.WEST);

        volver = new RoundedButton("     Volver     ");
        volver.setBackground(new Color(222, 239, 255));
        volver.setForeground(Color.BLACK);
        volver.setFont(new Font("Roboto", Font.PLAIN, 18)); 
        volver.addActionListener(this);
        panelBotones.add(volver);
        panelBotones.add(volver, BorderLayout.EAST);
        
        

        add(panel, BorderLayout.PAGE_START);
        
        setSize(1150, 860);
        setLocationRelativeTo(null);
        setVisible(true);
        
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == crear){
            String NAME=cajon_nombre.getText();
            String NIF=cajon_nif.getText();            
            String ADDRESS=cajon_direccion.getText();
            String POSTAL= cajon_postal.getText();
            String CITY=cajon_ciudad.getText();
            String EMAIL=cajon_mail.getText();
            String PHONE=cajon_tlf.getText();
            String IBAN=cajon_iban.getText();
            String[] COMPANY= {NAME,NIF,ADDRESS,POSTAL,CITY,EMAIL,PHONE,IBAN};
            boolean NIF_VALIDO=false;
            boolean correo=false;
            int contador=0;
            if(NIF.length()==9){
            NIF_VALIDO=NifLogaritmo.validarNIF(NIF);
            }
            for(int i=0;i<8;i++){
                if(!COMPANY[i].isBlank() && COMPANY[i].length()>2){
                contador++;
                }else if(COMPANY[i].isBlank()){
                JOptionPane.showMessageDialog(null," Rellena todos los datos");
                break;
                }else if(COMPANY[i].length()<3){                
                JOptionPane.showMessageDialog(null,COMPANY[i]+" es demasiado corto como campo");
                break;
                }
                if(POSTAL.length()!=5){
                JOptionPane.showMessageDialog(null,"Código postal incorrecto");
                break;
                }
                if(PHONE.length()<9){
                JOptionPane.showMessageDialog(null,"Numero de telefono incorrecto");
                break;
                }                
            }
            if(!NIF_VALIDO){
            JOptionPane.showMessageDialog(null,"NIF no valido");
            }
            
            for(int i=0;i<EMAIL.length();i++){
            char a=EMAIL.charAt(i);
                if(a == '@'){
                    correo=true;
                    break;
                }
            }
            for(int i=0;i<EMAIL.length();i++){
            char a=EMAIL.charAt(i);
                if(a == '.'){
                    correo=true;
                    break;
                }else{
                correo=false;
                }
            }
            
            
            if(!correo){            
                JOptionPane.showMessageDialog(null,"Email inválido");                
            }
            boolean noenviar=true;
            if(contador==8 && NIF_VALIDO && correo){
                String codigo=PasswordGenerate.generarContrasena(14); //se debe pasar al email
                String CODE=contraseña.encryptPassword(codigo);//se gurda encriptado
                try{
                    Connect c= new Connect();
                    String query="insert into company values('"+NAME+"','"+NIF+"','"+ADDRESS+"','"+POSTAL+"','"+CITY+"','"+EMAIL+"','"+PHONE+"','"+IBAN+"','','"+CODE+"')";
                    c.s.executeUpdate(query);
                    
                    
                } catch(Exception e){
                    e.printStackTrace();
                    noenviar=false;
                    
                }
                if(noenviar){
                JOptionPane.showMessageDialog(null, "Eviando mail con el codigo de acesso para usuario. Espere...!"); 
                String toEmail = EMAIL;  
                String subject = "Registro de empresa completado";
                String body = "Empresa registrada con exito, para registrar usaurios de empresa se deberá ingresar el siguiente codigo, por favor guardelo:"+codigo;
                String attachmentPath = "src/images/logo_oscuro.png";
                String email_servidor="carlosbackdev@gmail.com"; //cambiar vuando cambie de servidor
                EmailSender.sendEmailWithAttachment(toEmail, subject, body, attachmentPath,email_servidor);
                
                JOptionPane.showMessageDialog(null,"Empresa resgistrada con exito");
                setVisible(noenviar);
                }else{
                JOptionPane.showMessageDialog(null,"Datos no validos");
                }
                    
                    
                new Login();
                setVisible(false);
            }
            
           
            
        }else if(ae.getSource() == volver){
                setVisible(false);
                new Login();
        }       
        
    }
    
     public static void main(String[] args){
        new SignupCompany ();
        
    }

}
    
