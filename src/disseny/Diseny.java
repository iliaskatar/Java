/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package disseny;

//import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JCalendar;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/**
 *
 * @author iliass.//
 */
public class Diseny extends JFrame {

    public Diseny() {
        setVisible(true); // Finestra Visibla
        setSize(1200, 800); // Mida finestra
        setDefaultCloseOperation(EXIT_ON_CLOSE); // que es tenqui quan tanquem la finestra
        setTitle("Prova"); // Titol de la finestra
        this.setLayout(null); // Sense layaut per defecta
        setLocationRelativeTo(null); //null -> centre
        setMinimumSize(new Dimension(1200, 800)); // No es pot fer mes petita de
        this.getContentPane().setBackground(Color.BLACK); // fons negre

        iniciarComponents();
    }

    private void iniciarComponents() {
        crearPanells();
        omplirPanells();
        omplirPannell2();
        omplirPannell0();
    }

    private void omplirPanells() {
        JPanel jp = (JPanel) this.getContentPane().getComponent(1);

        JLabel jlClient = new JLabel("Client", SwingConstants.CENTER);// titol etiqueta
        jlClient.setLayout(null);
        jlClient.setBounds(0, 0, jp.getWidth(), 100);
        jlClient.setFont(new Font("Dyuthi", Font.PLAIN, 50));
        jp.add(jlClient);
        // etiqueta Dni
        JLabel jlDni = new JLabel("Dni:");
        jlDni.setBounds(40, 100, 30, 30);
        jp.add(jlDni);
        // text Dni
        JTextField jtfDni = new JTextField();
        jtfDni.setBounds(200, 100, 150, 30);
        jp.add(jtfDni);
        // etiqueta Nom
        JLabel jlNom = new JLabel("Nom:");
        jlNom.setBounds(40, 150, 40, 30);
        jp.add(jlNom);
        // text Nom
        JTextField jtfNom = new JTextField();
        jtfNom.setBounds(200, 150, 150, 30);
        jp.add(jtfNom);
        // etiqueta Cognom
        JLabel jlCognom = new JLabel("Cognoms:");
        jlCognom.setBounds(40, 200, 100, 30);
        jp.add(jlCognom);
        // text Cognom
        JTextField jtfCognoms = new JTextField();
        jtfCognoms.setBounds(200, 200, 150, 30);
        jp.add(jtfCognoms);
        // etiqueta Numero Persona
        JLabel jlNumPerson = new JLabel("Numero Personas:");
        jlNumPerson.setBounds(40, 250, 150, 30);
        jp.add(jlNumPerson);
        // text Numero Persona
        JTextField jtfNumPerson = new JTextField();
        jtfNumPerson.setBounds(200, 250, 30, 30);
        jp.add(jtfNumPerson);
        // etiqueta Numero Nits
        JLabel jlNumNits = new JLabel("Num. Nits:");
        jlNumNits.setBounds(40, 300, 150, 30);
        jp.add(jlNumNits);
        // text Numero nits
        JTextField jtfNumNits = new JTextField();
        jtfNumNits.setBounds(200, 300, 30, 30);
        jp.add(jtfNumNits);
        // etiqueta Data
        JLabel jlDataEntrada = new JLabel("Data de entrada:");
        jlDataEntrada.setBounds(40, 350, 150, 30); //(Pocicio, Pocico, Mida Llargada, Mida Alutura)
        jp.add(jlDataEntrada);

        JCalendar jcClients = new JCalendar();// Crear calendari
        jcClients.setSize(250, 250);// Mida Calendari
        jcClients.setLocation((jp.getWidth() / 2) - (jcClients.getWidth() / 2), 400); // Pocicio del calandari(() Pocicio on estara el calandari)
        jp.add(jcClients);

        JButton jbClient = new JButton("Reserva");
        jbClient.setSize(150, 30);
        jbClient.setLocation((jp.getWidth() / 2) - (jbClient.getWidth() / 2), 700);
        jp.add(jbClient);
    }

    private void crearPanells() {
        int amplada = this.getContentPane().getWidth() / 3; //Obtenir amplada de la finestra
        int llargade = this.getContentPane().getHeight(); //Obtenir llergade de la finetra
        for (int i = 0; i < 3; i++) {
            JPanel jpanell = new JPanel();
            jpanell.setLayout(null);
            jpanell.setForeground(Color.WHITE);
            jpanell.setBounds(amplada * i, 0, amplada - 2, llargade); //Posició i mida
            this.getContentPane().add(jpanell);
        }
    }
    private void omplirPannell2(){
        JPanel jp2 = (JPanel) this.getContentPane().getComponent(2);
        
        JLabel jlClient = new JLabel("Back", SwingConstants.CENTER);// titol etiqueta
        jlClient.setLayout(null);
        jlClient.setBounds(0, 0, jp2.getWidth(), 100);
        jlClient.setFont(new Font("Dyuthi", Font.PLAIN, 50));
        jp2.add(jlClient);
        
        
        JLabel nom = new JLabel("Nom Hotel:");
        nom.setBounds(60, 100, 100, 30);
        jp2.add(nom);
        
        JTextField jtnom = new JTextField();
        jtnom.setBounds(200, 100, 150, 30);
        jp2.add(jtnom);
        
        //crear boto guardar        
        JButton buto = new JButton("Guardar!");
        buto.setSize(150, 30);
        buto.setLocation((jp2.getWidth() / 2) - (buto.getWidth() / 2), 150);
        jp2.add(buto);
        
        JLabel Registre = new JLabel("Registre nova habitacio");
        Registre.setBounds(60, 100, 200, 200);
        jp2.add(Registre);
        
        JLabel num = new JLabel("nun.");
        num.setBounds(60, 100, 90, 250);
        jp2.add(num);
        
        JTextField jtnum = new JTextField();
        jtnum.setBounds(100, 210, 40, 20);
        jp2.add(jtnum);
        
        JLabel persones = new JLabel("per.");
        persones.setBounds(150, 100, 100, 250);
        jp2.add(persones);
        
        JTextField jtper = new JTextField();
        jtper.setBounds(200, 210, 40, 20);
        jp2.add(jtper);
        
        JButton buton = new JButton("Guardar!");
        buton.setSize(150, 30);
        buton.setLocation((jp2.getWidth() / 2) - (buton.getWidth() / 2), 260);
        jp2.add(buton);
        
        JLabel reserva = new JLabel("consolta reserva");
        reserva.setBounds(60, 100, 200, 300);
        jp2.add(reserva);
        
         JLabel nomCli = new JLabel("Nom client:");
        nomCli.setBounds(60, 100, 90, 450);
        jp2.add(nomCli);
        
        JTextField jtnomCli = new JTextField();
        jtnomCli.setBounds(150, 320, 100, 20);
        jp2.add(jtnomCli);
        
        JTextField jtaa = new JTextField();
        jtaa.setBounds(60, 400, 150, 100);
        jp2.add(jtaa);
        
        JTextField jtbb = new JTextField();
        jtbb.setBounds(150, 400, 200, 100);
        jp2.add(jtbb);
        
        JButton botoElimi = new JButton("Eliminar");
        botoElimi.setSize(150, 30);
        botoElimi.setLocation((jp2.getWidth() / 2) - (botoElimi.getWidth() / 2), 700);
        jp2.add(botoElimi);
        
        
    }
    
    private void omplirPannell0(){
         JPanel jp0 = (JPanel) this.getContentPane().getComponent(0);

        JLabel jlClient = new JLabel("Gestio", SwingConstants.CENTER);// titol etiqueta
        jlClient.setLayout(null);
        jlClient.setBounds(0, 0, jp0.getWidth(), 100);
        jlClient.setFont(new Font("Dyuthi", Font.PLAIN, 50));
        jp0.add(jlClient);
        
        JLabel res = new JLabel("Reserves Pendents");
        res.setBounds(60, 100, 200, 30);
        jp0.add(res);
    }
    

}
