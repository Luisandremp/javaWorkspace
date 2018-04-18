package exode;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class JeuDeWindowApplication {

    private JFrame frame;
    private JTextField textFieldScoreJ1;
    private JTextField textFieldDe1;
    private JTextField textFieldDe2;
    private JTextField textFieldScoreJ2;
    private JButton btnLancerJ1;
    private JLabel labelTourValue;
    private JButton btnLancerJ2;
    private JButton btnRestart;

    private JLabel lblJoueur1;
    private JLabel lblJoueur2;
    JCheckBox cbJ1, cbJ2;

    private Controler controler;

    public static void main(final String[] args) {

        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    JeuDeWindowApplication window = new JeuDeWindowApplication();
                    window.setVisible(true);

                    Controler controler = new Controler();

                    controler.setIhm(window);
                    window.setControler(controler);

                }
                catch (final Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public JeuDeWindowApplication() {
        initialize();
    }

    //------------------------------------
    // Methodes de mise à jour graphique
    //------------------------------------

    public void updateJ1(String nom, int score, boolean lancerVisible) {
        lblJoueur1.setText(nom);
        textFieldScoreJ1.setText("" + score);
        btnLancerJ1.setVisible(lancerVisible);
    }

    public void updateJ2(String nom, int score, boolean lancerVisible) {
        lblJoueur2.setText(nom);
        textFieldScoreJ2.setText("" + score);
        btnLancerJ2.setVisible(lancerVisible);
    }

    public void updateNbTour(int nbTour) {
        labelTourValue.setText(nbTour + "");
    }

    public void updateDes(int d1, int d2) {
        textFieldDe1.setText(d1 + "");
        textFieldDe2.setText(d2 + "");

    }

    public void updateRestart(boolean visible) {
        btnRestart.setVisible(visible);
    }

    /*******************
     * Methode public
     */

    public void setVisible(boolean visible) {
        frame.setVisible(visible);
    }

    /*******************
     * Methode private
     */

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 682, 403);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        lblJoueur1 = new JLabel("Joueur 1");
        lblJoueur1.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblJoueur1.setBounds(39, 45, 82, 18);
        frame.getContentPane().add(lblJoueur1);

        lblJoueur2 = new JLabel("Joueur 2");
        lblJoueur2.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblJoueur2.setBounds(500, 45, 108, 18);
        frame.getContentPane().add(lblJoueur2);

        final JLabel lblDe1 = new JLabel("DE 1");
        lblDe1.setBounds(235, 123, 46, 14);
        frame.getContentPane().add(lblDe1);

        final JLabel lblDe2 = new JLabel("DE 2");
        lblDe2.setBounds(315, 123, 46, 14);
        frame.getContentPane().add(lblDe2);

        final JLabel lblScoreJ1 = new JLabel("Score");
        lblScoreJ1.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblScoreJ1.setBounds(33, 93, 57, 23);
        frame.getContentPane().add(lblScoreJ1);

        textFieldScoreJ1 = new JTextField();
        textFieldScoreJ1.setEditable(false);
        textFieldScoreJ1.setHorizontalAlignment(SwingConstants.CENTER);
        textFieldScoreJ1.setBackground(Color.WHITE);
        textFieldScoreJ1.setText("0");
        textFieldScoreJ1.setBounds(86, 96, 35, 20);
        frame.getContentPane().add(textFieldScoreJ1);
        textFieldScoreJ1.setColumns(10);

        textFieldDe1 = new JTextField();
        textFieldDe1.setEditable(false);
        textFieldDe1.setText("1");
        textFieldDe1.setHorizontalAlignment(SwingConstants.CENTER);
        textFieldDe1.setColumns(10);
        textFieldDe1.setBackground(Color.WHITE);
        textFieldDe1.setBounds(211, 148, 70, 64);
        frame.getContentPane().add(textFieldDe1);

        textFieldDe2 = new JTextField();
        textFieldDe2.setEditable(false);
        textFieldDe2.setText("1");
        textFieldDe2.setHorizontalAlignment(SwingConstants.CENTER);
        textFieldDe2.setColumns(10);
        textFieldDe2.setBackground(Color.WHITE);
        textFieldDe2.setBounds(304, 148, 70, 64);
        frame.getContentPane().add(textFieldDe2);

        final JLabel labelScoreJ2 = new JLabel("Score : ");
        labelScoreJ2.setFont(new Font("Tahoma", Font.PLAIN, 14));
        labelScoreJ2.setBounds(479, 93, 57, 23);
        frame.getContentPane().add(labelScoreJ2);

        textFieldScoreJ2 = new JTextField();
        textFieldScoreJ2.setEditable(false);
        textFieldScoreJ2.setText("0");
        textFieldScoreJ2.setHorizontalAlignment(SwingConstants.CENTER);
        textFieldScoreJ2.setColumns(10);
        textFieldScoreJ2.setBackground(Color.WHITE);
        textFieldScoreJ2.setBounds(532, 96, 35, 20);
        frame.getContentPane().add(textFieldScoreJ2);

        final JLabel lblTour = new JLabel("Tour : ");
        lblTour.setFont(new Font("Tahoma", Font.PLAIN, 22));
        lblTour.setBounds(247, 36, 67, 27);
        frame.getContentPane().add(lblTour);

        labelTourValue = new JLabel("0");
        labelTourValue.setFont(new Font("Tahoma", Font.PLAIN, 22));
        labelTourValue.setBounds(324, 36, 37, 27);
        frame.getContentPane().add(labelTourValue);

        btnLancerJ1 = new JButton("Lancer");

        btnLancerJ1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent arg0) {
                controler.lancerJ1();
            }
        });

        btnLancerJ1.setBounds(33, 169, 89, 23);
        frame.getContentPane().add(btnLancerJ1);

        btnLancerJ2 = new JButton("Lancer");
        btnLancerJ2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controler.lancerJ2();
            }
        });
        btnLancerJ2.setBounds(479, 169, 89, 23);
        frame.getContentPane().add(btnLancerJ2);

        btnRestart = new JButton("Restart");
        btnRestart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controler.restart();
            }
        });
        btnRestart.setBounds(247, 293, 89, 23);
        frame.getContentPane().add(btnRestart);

        cbJ1 = new JCheckBox("Tricheur");
        cbJ1.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent arg0) {
                controler.setJ1Tricheur(cbJ1.isSelected());
            }
        });

        cbJ1.setBounds(24, 119, 97, 23);
        frame.getContentPane().add(cbJ1);

        cbJ2 = new JCheckBox("Tricheur");
        cbJ2.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                controler.setJ2Tricheur(cbJ2.isSelected());
            }
        });

        cbJ2.setBounds(470, 119, 97, 23);
        frame.getContentPane().add(cbJ2);

    }

    public void setControler(Controler controler) {
        this.controler = controler;
    }
}
