
package electricity_bills_system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Project extends JFrame implements ActionListener{
    JMenuItem cliente,generar,material,factura_detalle,cliente_detalles, factura,cliente_modificar,salir;
    JMenuItem pago,Finanzas,clientes_grafico,calculo,buscar_proyecto; 
    String NIF,ID_USER;
    JMenuBar navegador;
    boolean visible=true;
    
    Project(String NIF, String ID_USER){
        this.NIF=NIF;
        this.ID_USER=ID_USER;
        setIconImage(new ImageIcon(getClass().getClassLoader().getResource("images/icono_app.png")).getImage());
        
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout()); 
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setMinimumSize(new Dimension(950, 650));
        Font menufont =new Font("Roboto", Font.PLAIN, 22);
        
        setContentPane(new BackgroundPanel("images/fondo_mosaico.png"));
        
        navegador=new JMenuBar();
        setJMenuBar(navegador);
        
        JMenu mn=new JMenu(">");
        mn.setFont(menufont);
        ImageIcon icon3= new ImageIcon(ClassLoader.getSystemResource("images/menu.png"));
        Image image3 = icon3.getImage().getScaledInstance(22, 22, Image.SCALE_DEFAULT);
        mn.setIcon(new ImageIcon(image3));
        navegador.add(mn);
        
        JMenu admin=new JMenu("Administración   ");
        admin.setFont(menufont);
        ImageIcon icon1= new ImageIcon(ClassLoader.getSystemResource("images/ADMIN.png"));
        Image image1 = icon1.getImage().getScaledInstance(22, 22, Image.SCALE_DEFAULT);
        admin.setIcon(new ImageIcon(image1));
        navegador.add(admin);
        
        cliente=new JMenuItem("Nuevo Cliente ");
        cliente.setFont(menufont);
        cliente.setMnemonic('D');
        cliente.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D, ActionEvent.CTRL_MASK));
        admin.add(cliente);
        cliente.addActionListener(this);
        
        cliente_detalles=new JMenuItem("Buscar Ficha de Clientes ");
        cliente_detalles.setFont(menufont);
        cliente_detalles.setMnemonic('F');
        cliente_detalles.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F, ActionEvent.CTRL_MASK));
        cliente_detalles.addActionListener(this);
        admin.add(cliente_detalles);
        
        cliente_modificar=new JMenuItem("Modificar Clientes ");
        cliente_modificar.setFont(menufont);
        cliente_modificar.setMnemonic('M');
        cliente_modificar.addActionListener(this);
        cliente_modificar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_M, ActionEvent.CTRL_MASK));
        admin.add(cliente_modificar);
        
        factura=new JMenuItem("Factura de Clientes ");
        factura.setFont(menufont);
        factura.setMnemonic('B');
        factura.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B, ActionEvent.CTRL_MASK));
        factura.addActionListener(this);
        admin.add(factura);
        
        JMenu info=new JMenu("Datos   ");
        info.setFont(menufont);;
        ImageIcon icon2= new ImageIcon(ClassLoader.getSystemResource("images/datos2.png"));
        Image image2 = icon2.getImage().getScaledInstance(22, 22, Image.SCALE_DEFAULT);
        info.setIcon(new ImageIcon(image2));
        navegador.add(info);
        
        Finanzas=new JMenuItem("Finanzas ");
        Finanzas.setFont(menufont);
        Finanzas.setMnemonic('I');
        Finanzas.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_I, ActionEvent.CTRL_MASK));
        Finanzas.addActionListener(this);
        info.add(Finanzas);
        
        clientes_grafico=new JMenuItem("Clientes ");
        clientes_grafico.setFont(menufont);
        clientes_grafico.setMnemonic('A');
        clientes_grafico.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, ActionEvent.CTRL_MASK));
        clientes_grafico.addActionListener(this);
        info.add(clientes_grafico);
        
        JMenu accion=new JMenu("Facturas   ");
        accion.setFont(menufont);
        ImageIcon icon4= new ImageIcon(ClassLoader.getSystemResource("images/facturas.png"));
        Image image4 = icon4.getImage().getScaledInstance(22, 22, Image.SCALE_DEFAULT);
        accion.setIcon(new ImageIcon(image4));
        navegador.add(accion);
        
        generar=new JMenuItem("Generar Factura ");
        generar.setFont(menufont);
        generar.setMnemonic('G');
        generar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_G, ActionEvent.CTRL_MASK));
        accion.add(generar);
        generar.addActionListener(this);
        
        pago=new JMenuItem("Pago Facturas ");
        pago.setFont(menufont);
        pago.setMnemonic('P');
        pago.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, ActionEvent.CTRL_MASK));
        pago.addActionListener(this);
        accion.add(pago);
        
        factura_detalle=new JMenuItem("Detalles Facturas ");
        factura_detalle.setFont(menufont);
        factura_detalle.setMnemonic('O');
        factura_detalle.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, ActionEvent.CTRL_MASK));
        accion.add(factura_detalle);
        factura_detalle.addActionListener(this);
        
        
        
        JMenu proyectos=new JMenu("Proyecto   ");
        proyectos.setFont(menufont);
        ImageIcon icon6= new ImageIcon(ClassLoader.getSystemResource("images/proyecto.png"));
        Image image6 = icon6.getImage().getScaledInstance(22, 22, Image.SCALE_DEFAULT);
        proyectos.setIcon(new ImageIcon(image6));
        navegador.add(proyectos);
        
        material=new JMenuItem("Parte de Material");
        material.setFont(menufont);
        material.setMnemonic('C');
        material.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, ActionEvent.CTRL_MASK));
        proyectos.add(material);
        material.addActionListener(this);
        
        calculo=new JMenuItem("Calcular Proyecto");
        calculo.setFont(menufont);
        calculo.setMnemonic('C');
        calculo.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, ActionEvent.CTRL_MASK));
        calculo.addActionListener(this);
        proyectos.add(calculo);
        
        buscar_proyecto=new JMenuItem("Buscar Proyecto");
        buscar_proyecto.setFont(menufont);
        buscar_proyecto.setMnemonic('L');
        buscar_proyecto.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, ActionEvent.CTRL_MASK));
        buscar_proyecto.addActionListener(this);
        proyectos.add(buscar_proyecto);
        
        salir=new JMenuItem("Salir   ");
        salir.setFont(menufont);
        salir.setMnemonic('S');
        ImageIcon icon7= new ImageIcon(ClassLoader.getSystemResource("images/salir.png"));
        Image image7 = icon7.getImage().getScaledInstance(22, 22, Image.SCALE_DEFAULT);
        salir.setIcon(new ImageIcon(image7));
        salir.addActionListener(this);
        navegador.add(salir);
        
        setVisible(true);
        triggerFinanzasButton();  

    }
    private Finance financeInstance = null;
    public void actionPerformed(ActionEvent ae){
     if(ae.getSource()==cliente){
     new newClient(NIF,ID_USER);
     }
     if(ae.getSource()==generar){
     new calculateBill("","",NIF,ID_USER);
     }
     if(ae.getSource()==material){
     new MaterialFrame("","",NIF,ID_USER,"",new String[0]);
     }
     if(ae.getSource()==factura_detalle){
     new BillSearch(NIF,ID_USER);
     }
     if(ae.getSource()==cliente_detalles){
     new ClientSearch(NIF,ID_USER);
     }
     if(ae.getSource()==factura){
     new calculateBill("","",NIF,ID_USER);
     }
     if(ae.getSource()==cliente_modificar){      
     new ClientUpdate(NIF, ID_USER); 
     }
     if(ae.getSource()==pago){      
     new PayBill(NIF, ID_USER); 
     }
     if(ae.getSource()==calculo){      
     new SaveProject(NIF, ID_USER); 
     }
     if(ae.getSource()==buscar_proyecto){      
     new ProjectSearch(NIF, ID_USER); 
     }
     if(ae.getSource()==clientes_grafico){      
     new GraphClient(NIF, ID_USER); 
     }
     if(ae.getSource()==Finanzas){  
   
        financeInstance = new Finance(NIF, ID_USER);
   
     }
     if(ae.getSource() == salir){
         int opcion = JOptionPane.showConfirmDialog(null, 
                "¿Seguro que desea salir de la aplicación?", 
                "Cerrar aplicación", 
                JOptionPane.YES_NO_OPTION, 
                JOptionPane.QUESTION_MESSAGE);

            if (opcion == JOptionPane.YES_OPTION) {
                try{
                    System.exit(0);
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        }
     
    }
    
    public void triggerFinanzasButton() {
    ActionEvent event = new ActionEvent(Finanzas, ActionEvent.ACTION_PERFORMED, "");
    ActionEvent event2 = new ActionEvent(clientes_grafico, ActionEvent.ACTION_PERFORMED, "");
    actionPerformed(event);
    actionPerformed(event2);
    }
     
    public static void main(String[] args){
        new Project("","");
    }
    
    
    
}
