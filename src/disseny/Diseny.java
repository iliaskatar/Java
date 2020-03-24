/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package disseny;

//import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDateChooser;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.ScrollPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.net.http.WebSocket;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author iliass.//
 */
public class Diseny extends JFrame {

    private final ImageIcon ok = new ImageIcon("imatges/tick.png"), nok = new ImageIcon("imatges/creu.png");
    private JLabel jlClient = new JLabel("Client", SwingConstants.CENTER);// titol etiqueta
    private JLabel jlDni = new JLabel("Dni:");// text dni
    private JTextField jtfDni = new JTextField();// escriure el dni
    private JLabel tickDni = new JLabel();// tick o creu dni
    private JLabel jlNom = new JLabel("Nom:");
    private JTextField jtfNom = new JTextField();
    private JLabel tickNom = new JLabel();
    private JLabel jlCognom = new JLabel("Cognoms:");
    private JTextField jtfCognoms = new JTextField();
    private JLabel tickcognom = new JLabel();
    private JLabel jlNumPerson = new JLabel("Numero Personas:");
    private JTextField jtfNumPerson = new JTextField();
    private JLabel tickNumPersones = new JLabel();
    private JLabel jlNumNits = new JLabel("Num. Nits:");
    private JTextField jtfNumNits = new JTextField();
    private JLabel tickNumNits = new JLabel();
    private JCalendar jcClients = new JCalendar();// Crear calendari
    private JLabel nom = new JLabel("Nom Hotel:");
    private JButton jbClient = new JButton("Reserva");
    private JButton buto = new JButton("Guardar!");
    private JTextField jtnom = new JTextField();
    private DefaultTableModel taula1 = new DefaultTableModel();
    

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
        imatges();
        funcionar();
        
    }

    private void omplirPanells() {
        JPanel jp = (JPanel) this.getContentPane().getComponent(1);

        jlClient.setLayout(null);
        jlClient.setBounds(0, 0, jp.getWidth(), 100);
        jlClient.setFont(new Font("Dyuthi", Font.PLAIN, 50));
        jp.add(jlClient);

        // etiqueta Dni
        jlDni.setBounds(40, 100, 30, 30);
        jp.add(jlDni);
        // text Dni

        jtfDni.setBounds(200, 100, 150, 30);
        jp.add(jtfDni);
        //afagit tick 

        tickDni.setBounds(360, 100, 30, 30);
        jp.add(tickDni);

        // etiqueta Nom
        jlNom.setBounds(40, 150, 40, 30);
        jp.add(jlNom);
        // text Nom

        jtfNom.setBounds(200, 150, 150, 30);
        jp.add(jtfNom);
        //afagit tick 

        tickNom.setBounds(360, 150, 30, 30);
        jp.add(tickNom);

        // etiqueta Cognom
        jlCognom.setBounds(40, 200, 100, 30);
        jp.add(jlCognom);
        // text Cognom

        jtfCognoms.setBounds(200, 200, 150, 30);
        jp.add(jtfCognoms);
        //afagit tick 

        tickcognom.setBounds(360, 200, 30, 30);
        jp.add(tickcognom);
        // etiqueta Numero Persona

        jlNumPerson.setBounds(40, 250, 150, 30);
        jp.add(jlNumPerson);
        // text Numero Persona

        jtfNumPerson.setBounds(200, 250, 30, 30);
        jp.add(jtfNumPerson);
        //afagit tick 

        tickNumPersones.setBounds(360, 250, 30, 30);
        jp.add(tickNumPersones);
        // etiqueta Numero Nits

        jlNumNits.setBounds(40, 300, 150, 30);
        jp.add(jlNumNits);
        // text Numero nits
        jtfNumNits.setBounds(200, 300, 30, 30);
        jp.add(jtfNumNits);
        //afagit tick 
        tickNumNits.setBounds(360, 300, 30, 30);
        jp.add(tickNumNits);
        // etiqueta Data
        JLabel jlDataEntrada = new JLabel("Data de entrada:");
        jlDataEntrada.setBounds(40, 350, 150, 30); //(Pocicio, Pocico, Mida Llargada, Mida Alutura)
        jp.add(jlDataEntrada);

        jcClients.setSize(250, 250);// Mida Calendari
        jcClients.setLocation((jp.getWidth() / 2) - (jcClients.getWidth() / 2), 400); // Pocicio del calandari(() Pocicio on estara el calandari)
        jp.add(jcClients);

        jbClient.setEnabled(false);
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

    private void omplirPannell2() {
        JPanel jp2 = (JPanel) this.getContentPane().getComponent(2);

        JLabel jlClient = new JLabel("Back", SwingConstants.CENTER);// titol etiqueta
        jlClient.setLayout(null);
        jlClient.setBounds(0, 0, jp2.getWidth(), 100);
        jlClient.setFont(new Font("Dyuthi", Font.PLAIN, 50));
        jp2.add(jlClient);

        nom.setBounds(60, 100, 100, 30);
        jp2.add(nom);

        jtnom.setBounds(200, 100, 150, 30);
        jp2.add(jtnom);

        //crear boto guardar        
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

    private void omplirPannell0() {
        JPanel jp0 = (JPanel) this.getContentPane().getComponent(0);

        JLabel jlClient = new JLabel("Gestio", SwingConstants.CENTER);// titol etiqueta
        jlClient.setLayout(null);
        jlClient.setBounds(0, 0, jp0.getWidth(), 100);
        jlClient.setFont(new Font("Dyuthi", Font.PLAIN, 50));
        jp0.add(jlClient);

        JLabel res = new JLabel("Reserves Pendents");
        res.setBounds(60, 100, 200, 30);
        jp0.add(res);

        taula1.addColumn("Reserva");
        taula1.addColumn("Dia");
        taula1.addColumn("Persona");
        taula1.addColumn("Habitacio");
        JTable taula = new JTable(taula1);
        taula.setBounds(40, 150, 325, 200);
        jp0.add(taula);
        JScrollPane taulascroll = new JScrollPane(taula, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        taulascroll.setBounds(40, 150, 325, 200);
        jp0.add(taulascroll);

        JLabel resCon = new JLabel("Reserves Confirmades");
        resCon.setBounds(60, 350, 150, 40);
        jp0.add(resCon);

        JDateChooser select = new JDateChooser();
        select.setBounds(225, 350, 150, 30);
        jp0.add(select);

        DefaultTableModel taula2 = new DefaultTableModel();
        taula2.addColumn("Nom");
        taula2.addColumn("Date in");
        taula2.addColumn("Date out");
        taula2.addColumn("Habitacio");
        JTable taulados = new JTable(taula2);
        taulados.setBounds(40, 400, 325, 200);
        jp0.add(taulados);
        JScrollPane taulascrollsegona = new JScrollPane(taulados, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        taulascrollsegona.setBounds(40, 400, 325, 200);
        jp0.add(taulascrollsegona);

    }

    private void imatges() {

        KeyListener clau = new KeyListener() {
            ImageIcon okred = new ImageIcon(ok.getImage().getScaledInstance(tickDni.getWidth(), tickDni.getHeight(), Image.SCALE_SMOOTH));
            ImageIcon nokred = new ImageIcon(nok.getImage().getScaledInstance(tickDni.getWidth(), tickDni.getHeight(), Image.SCALE_SMOOTH));

            @Override
            public void keyTyped(KeyEvent ke) {

            }

            @Override
            public void keyPressed(KeyEvent ke) {

            }

            @Override
            public void keyReleased(KeyEvent ke) {
                if (ke.getComponent().equals(jtfDni)) {
                    tickDni.setVisible(true);
                    if (jtfDni.getText().matches("^\\d{8}(?![POUpou])[A-Za-z]$")) {
                        tickDni.setIcon(okred);
                    } else {
                        tickDni.setIcon(nokred);
                    }
                } else if (ke.getComponent().equals(jtfNom)) {
                    tickNom.setVisible(true);
                    if (!jtfNom.getText().matches(".*\\d+.*")) {
                        tickNom.setIcon(okred);
                    } else {
                        tickNom.setIcon(nokred);
                    }
                } else if (ke.getComponent().equals(jtfCognoms)) {
                    tickcognom.setVisible(true);
                    if (!jtfCognoms.getText().matches(".*\\d+.*")) {
                        tickcognom.setIcon(okred);
                    } else {
                        tickcognom.setIcon(nokred);
                    }
                } else if (ke.getComponent().equals(jtfNumPerson)) {
                    tickNumPersones.setVisible(true);
                    if (jtfNumPerson.getText().matches("\\d+")) {
                        tickNumPersones.setIcon(okred);
                    } else {
                        tickNumPersones.setIcon(nokred);
                    }
                } else if (ke.getComponent().equals(jtfNumNits)) {
                    tickNumNits.setVisible(true);
                    if (jtfNumNits.getText().matches("\\d+")) {
                        tickNumNits.setIcon(okred);
                    } else {
                        tickNumNits.setIcon(nokred);
                    }
                }

                if (tickDni.getIcon().equals(okred) && tickNom.getIcon().equals(okred) && tickcognom.getIcon().equals(okred) && tickNumPersones.getIcon().equals(okred) && tickNumNits.getIcon().equals(okred)) {
                    jbClient.setEnabled(true);
                } else {
                    jbClient.setEnabled(false);
                }
            }
        };
        jtfDni.addKeyListener(clau);
        jtfNom.addKeyListener(clau);
        jtfCognoms.addKeyListener(clau);
        jtfNumPerson.addKeyListener(clau);
        jtfNumNits.addKeyListener(clau);

        ActionListener nomHotel = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                setTitle(jtnom.getText());
                jtnom.setText(null);
            }
        };
        buto.addActionListener(nomHotel);
        ActionListener guarda = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                Object[] llista = {jtfDni.getText(), jcClients.getDayChooser().getDay(), jtfNumNits};
                taula1.addRow(llista);
                tickDni.setVisible(false);
                tickNom.setVisible(false);
                tickcognom.setVisible(false);
                tickNumPersones.setVisible(false);
                tickNumNits.setVisible(false);
                jtfDni.setText(null);
                jtfNom.setText(null);
                jtfCognoms.setText(null);
                jtfNumPerson.setText(null);
                jtfNumNits.setText(null);

            }
        };
        jbClient.addActionListener(guarda);
    }

    private void funcionar() {
        System.out.println(this.getContentPane().getWidth());
        System.out.println(this.getContentPane().getHeight());
        for (Component panell1 : this.getContentPane().getComponents()) {
            System.out.println(panell1.getWidth() + " - " + panell1.getHeight());
        }
        this.setSize(this.getContentPane().getWidth() + 1, this.getContentPane().getHeight() + 1);
        this.setSize(this.getContentPane().getWidth() - 1, this.getContentPane().getHeight() - 1);
    }

}
