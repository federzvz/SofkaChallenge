/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import Logica.Clases.Categoria;
import Logica.Clases.Pregunta;
import Logica.Fabrica;
import Logica.Interfaz.IControladorCategoria;
import Logica.Interfaz.IControladorJugador;
import Logica.Interfaz.IControladorPartida;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class Partida extends javax.swing.JInternalFrame {

    private IControladorCategoria ICCAT;
    private IControladorPartida ICPAR;
    private int ronda = 1;
    private int acumulado = 0;
    private int premio = 100;
    private int[] premiosPorRonda = new int[5];
    private Pregunta preguntaDeRonda = new Pregunta();
    private IControladorJugador ICJUG;
    private List<String> Jugadores;

    public Partida() {
        initComponents();
        this.ICCAT = Fabrica.getInstance().getIControladorCategoria();
        this.ICPAR = Fabrica.getInstance().getIControladorPartida();
        this.ICJUG = Fabrica.getInstance().getIControladorJugador();
        rellenarComboBoxJugadores();
        premiosPorRonda = establecerPremios();
        actualizarDatosDePartida();
        preguntaDeRonda = this.ICPAR.generarPregunta(this.ICCAT.crearCategoriasConPreguntas(), ronda);
        actualizarOpcionesDePreguntasCategoria(preguntaDeRonda);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelFondo = new javax.swing.JPanel();
        jPanelPreguntaCategoria = new javax.swing.JPanel();
        jLabelPregunta = new javax.swing.JLabel();
        jLabelCategoria = new javax.swing.JLabel();
        jPanelOpcionesPreguntas = new javax.swing.JPanel();
        jPanelOpcion1 = new javax.swing.JPanel();
        jLabelOpcPregunta1 = new javax.swing.JLabel();
        jPanelOpcion2 = new javax.swing.JPanel();
        jLabelOpcPregunta2 = new javax.swing.JLabel();
        jPanelOpcion3 = new javax.swing.JPanel();
        jLabelOpcPregunta3 = new javax.swing.JLabel();
        jPanelOpcion4 = new javax.swing.JPanel();
        jLabelOpcPregunta4 = new javax.swing.JLabel();
        jButtonResponder = new javax.swing.JButton();
        jButtonRetirarse = new javax.swing.JButton();
        jPanelRondas = new javax.swing.JPanel();
        jLabelRondaTitulo = new javax.swing.JLabel();
        jLabelNumero = new javax.swing.JLabel();
        jPanelPremios = new javax.swing.JPanel();
        jLabelPremioAcumuladoTitulo = new javax.swing.JLabel();
        jLabelPremioAcumuladoNum = new javax.swing.JLabel();
        jLabelPremioActualTitulo = new javax.swing.JLabel();
        jLabelPremioActualNum = new javax.swing.JLabel();
        jLabelJugadorTxt = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(0, 102, 153));
        setMaximumSize(new java.awt.Dimension(1024, 740));
        setMinimumSize(new java.awt.Dimension(1024, 740));
        setPreferredSize(new java.awt.Dimension(1024, 740));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelFondo.setBackground(new java.awt.Color(0, 64, 96));

        jPanelPreguntaCategoria.setBackground(new java.awt.Color(0, 64, 96));

        jLabelPregunta.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabelPregunta.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPregunta.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelPregunta.setText("PREGUNTA: ¿Puede que esa una pregunta de prueba? ");

        jLabelCategoria.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabelCategoria.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCategoria.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelCategoria.setText("CATEGORÍA: Prueba");

        javax.swing.GroupLayout jPanelPreguntaCategoriaLayout = new javax.swing.GroupLayout(jPanelPreguntaCategoria);
        jPanelPreguntaCategoria.setLayout(jPanelPreguntaCategoriaLayout);
        jPanelPreguntaCategoriaLayout.setHorizontalGroup(
            jPanelPreguntaCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPreguntaCategoriaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPreguntaCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelPregunta)
                    .addComponent(jLabelCategoria))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelPreguntaCategoriaLayout.setVerticalGroup(
            jPanelPreguntaCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPreguntaCategoriaLayout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jLabelPregunta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelCategoria)
                .addGap(12, 12, 12))
        );

        jPanelOpcionesPreguntas.setBackground(new java.awt.Color(0, 73, 110));
        jPanelOpcionesPreguntas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelOpcion1.setBackground(java.awt.Color.lightGray);
        jPanelOpcion1.setMaximumSize(new java.awt.Dimension(815, 70));
        jPanelOpcion1.setMinimumSize(new java.awt.Dimension(815, 70));
        jPanelOpcion1.setPreferredSize(new java.awt.Dimension(815, 70));
        jPanelOpcion1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanelOpcion1MousePressed(evt);
            }
        });

        jLabelOpcPregunta1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelOpcPregunta1.setText("Esta es la primera opcion de una respuesta de prueba");

        javax.swing.GroupLayout jPanelOpcion1Layout = new javax.swing.GroupLayout(jPanelOpcion1);
        jPanelOpcion1.setLayout(jPanelOpcion1Layout);
        jPanelOpcion1Layout.setHorizontalGroup(
            jPanelOpcion1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelOpcion1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelOpcPregunta1)
                .addContainerGap(509, Short.MAX_VALUE))
        );
        jPanelOpcion1Layout.setVerticalGroup(
            jPanelOpcion1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelOpcion1Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(jLabelOpcPregunta1)
                .addGap(26, 26, 26))
        );

        jPanelOpcionesPreguntas.add(jPanelOpcion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 750, -1));

        jPanelOpcion2.setBackground(java.awt.Color.lightGray);
        jPanelOpcion2.setMaximumSize(new java.awt.Dimension(815, 70));
        jPanelOpcion2.setMinimumSize(new java.awt.Dimension(815, 70));
        jPanelOpcion2.setPreferredSize(new java.awt.Dimension(815, 70));
        jPanelOpcion2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanelOpcion2MousePressed(evt);
            }
        });

        jLabelOpcPregunta2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelOpcPregunta2.setText("Esta es la segunda opcion de una respuesta de prueba");

        javax.swing.GroupLayout jPanelOpcion2Layout = new javax.swing.GroupLayout(jPanelOpcion2);
        jPanelOpcion2.setLayout(jPanelOpcion2Layout);
        jPanelOpcion2Layout.setHorizontalGroup(
            jPanelOpcion2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelOpcion2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelOpcPregunta2)
                .addContainerGap(503, Short.MAX_VALUE))
        );
        jPanelOpcion2Layout.setVerticalGroup(
            jPanelOpcion2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelOpcion2Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(jLabelOpcPregunta2)
                .addGap(26, 26, 26))
        );

        jPanelOpcionesPreguntas.add(jPanelOpcion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 118, 750, -1));

        jPanelOpcion3.setBackground(java.awt.Color.lightGray);
        jPanelOpcion3.setMaximumSize(new java.awt.Dimension(815, 70));
        jPanelOpcion3.setMinimumSize(new java.awt.Dimension(815, 70));
        jPanelOpcion3.setPreferredSize(new java.awt.Dimension(815, 70));
        jPanelOpcion3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanelOpcion3MousePressed(evt);
            }
        });

        jLabelOpcPregunta3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelOpcPregunta3.setText("Esta es la tercera opcion de una respuesta de prueba");

        javax.swing.GroupLayout jPanelOpcion3Layout = new javax.swing.GroupLayout(jPanelOpcion3);
        jPanelOpcion3.setLayout(jPanelOpcion3Layout);
        jPanelOpcion3Layout.setHorizontalGroup(
            jPanelOpcion3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelOpcion3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelOpcPregunta3)
                .addContainerGap(514, Short.MAX_VALUE))
        );
        jPanelOpcion3Layout.setVerticalGroup(
            jPanelOpcion3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelOpcion3Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(jLabelOpcPregunta3)
                .addGap(26, 26, 26))
        );

        jPanelOpcionesPreguntas.add(jPanelOpcion3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 206, 750, -1));

        jPanelOpcion4.setBackground(java.awt.Color.lightGray);
        jPanelOpcion4.setMaximumSize(new java.awt.Dimension(815, 70));
        jPanelOpcion4.setMinimumSize(new java.awt.Dimension(815, 70));
        jPanelOpcion4.setPreferredSize(new java.awt.Dimension(815, 70));
        jPanelOpcion4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanelOpcion4MousePressed(evt);
            }
        });

        jLabelOpcPregunta4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelOpcPregunta4.setText("Esta es la ultima opcion de una respuesta de prueba");

        javax.swing.GroupLayout jPanelOpcion4Layout = new javax.swing.GroupLayout(jPanelOpcion4);
        jPanelOpcion4.setLayout(jPanelOpcion4Layout);
        jPanelOpcion4Layout.setHorizontalGroup(
            jPanelOpcion4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelOpcion4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelOpcPregunta4)
                .addContainerGap(518, Short.MAX_VALUE))
        );
        jPanelOpcion4Layout.setVerticalGroup(
            jPanelOpcion4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelOpcion4Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(jLabelOpcPregunta4)
                .addGap(26, 26, 26))
        );

        jPanelOpcionesPreguntas.add(jPanelOpcion4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 294, 750, -1));

        jButtonResponder.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonResponder.setText("RESPONDER SELECCIONADA");
        jButtonResponder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonResponderActionPerformed(evt);
            }
        });

        jButtonRetirarse.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonRetirarse.setText("RETIRARSE");
        jButtonRetirarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRetirarseActionPerformed(evt);
            }
        });

        jPanelRondas.setBackground(new java.awt.Color(0, 64, 96));

        jLabelRondaTitulo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelRondaTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelRondaTitulo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelRondaTitulo.setText("RONDA: ");

        jLabelNumero.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelNumero.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNumero.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelNumero.setText("1");

        javax.swing.GroupLayout jPanelRondasLayout = new javax.swing.GroupLayout(jPanelRondas);
        jPanelRondas.setLayout(jPanelRondasLayout);
        jPanelRondasLayout.setHorizontalGroup(
            jPanelRondasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRondasLayout.createSequentialGroup()
                .addComponent(jLabelRondaTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelNumero)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanelRondasLayout.setVerticalGroup(
            jPanelRondasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelRondasLayout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(jPanelRondasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelRondaTitulo)
                    .addComponent(jLabelNumero))
                .addGap(16, 16, 16))
        );

        jPanelPremios.setBackground(new java.awt.Color(0, 64, 96));

        jLabelPremioAcumuladoTitulo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelPremioAcumuladoTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPremioAcumuladoTitulo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelPremioAcumuladoTitulo.setText("Premio acumulado: ");

        jLabelPremioAcumuladoNum.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelPremioAcumuladoNum.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPremioAcumuladoNum.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelPremioAcumuladoNum.setText("0");

        jLabelPremioActualTitulo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelPremioActualTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPremioActualTitulo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelPremioActualTitulo.setText("Premio actual: ");

        jLabelPremioActualNum.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelPremioActualNum.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPremioActualNum.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelPremioActualNum.setText("0");

        javax.swing.GroupLayout jPanelPremiosLayout = new javax.swing.GroupLayout(jPanelPremios);
        jPanelPremios.setLayout(jPanelPremiosLayout);
        jPanelPremiosLayout.setHorizontalGroup(
            jPanelPremiosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPremiosLayout.createSequentialGroup()
                .addGroup(jPanelPremiosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelPremiosLayout.createSequentialGroup()
                        .addComponent(jLabelPremioActualTitulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelPremioActualNum))
                    .addGroup(jPanelPremiosLayout.createSequentialGroup()
                        .addComponent(jLabelPremioAcumuladoTitulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelPremioAcumuladoNum)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelPremiosLayout.setVerticalGroup(
            jPanelPremiosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPremiosLayout.createSequentialGroup()
                .addGroup(jPanelPremiosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPremioAcumuladoTitulo)
                    .addComponent(jLabelPremioAcumuladoNum))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelPremiosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPremioActualTitulo)
                    .addComponent(jLabelPremioActualNum))
                .addContainerGap())
        );

        jLabelJugadorTxt.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelJugadorTxt.setForeground(new java.awt.Color(255, 255, 255));
        jLabelJugadorTxt.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelJugadorTxt.setText("Jugador: ");

        javax.swing.GroupLayout jPanelFondoLayout = new javax.swing.GroupLayout(jPanelFondo);
        jPanelFondo.setLayout(jPanelFondoLayout);
        jPanelFondoLayout.setHorizontalGroup(
            jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFondoLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelFondoLayout.createSequentialGroup()
                        .addComponent(jPanelPreguntaCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(337, Short.MAX_VALUE))
                    .addGroup(jPanelFondoLayout.createSequentialGroup()
                        .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanelRondas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelFondoLayout.createSequentialGroup()
                                .addComponent(jButtonRetirarse)
                                .addGap(18, 18, 18)
                                .addComponent(jLabelJugadorTxt)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 294, Short.MAX_VALUE)
                        .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonResponder, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanelPremios, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42))))
            .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelFondoLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanelOpcionesPreguntas, javax.swing.GroupLayout.PREFERRED_SIZE, 930, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanelFondoLayout.setVerticalGroup(
            jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFondoLayout.createSequentialGroup()
                .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelFondoLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jPanelPreguntaCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 427, Short.MAX_VALUE)
                        .addComponent(jPanelRondas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelFondoLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanelPremios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonResponder, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonRetirarse, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelJugadorTxt)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
            .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelFondoLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanelOpcionesPreguntas, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        getContentPane().add(jPanelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, 710));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonRetirarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRetirarseActionPerformed

    }//GEN-LAST:event_jButtonRetirarseActionPerformed

    private void jPanelOpcion1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelOpcion1MousePressed
        seleccionarOpcion(1);
    }//GEN-LAST:event_jPanelOpcion1MousePressed

    private void jPanelOpcion2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelOpcion2MousePressed
        seleccionarOpcion(2);
    }//GEN-LAST:event_jPanelOpcion2MousePressed

    private void jPanelOpcion3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelOpcion3MousePressed
        seleccionarOpcion(3);
    }//GEN-LAST:event_jPanelOpcion3MousePressed

    private void jPanelOpcion4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelOpcion4MousePressed
        seleccionarOpcion(4);
    }//GEN-LAST:event_jPanelOpcion4MousePressed

    private void jButtonResponderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonResponderActionPerformed
        //if (this.jTextFieldJugadorJugando.getText().equals("")) {
        // JOptionPane.showMessageDialog(this, "No está participando ningún jugador, debe seleccionar un jugador.");
        // } else {
        if (isOpcionSeleccionada() == true) {
            if (obtenerOpcionSeleccionada().equalsIgnoreCase(preguntaDeRonda.getRespuestaCorrecta())) {
                siguienteRonda();
                actualizarDatosDePartida();
                preguntaDeRonda = this.ICPAR.generarPregunta(this.ICCAT.crearCategoriasConPreguntas(), ronda);
                actualizarOpcionesDePreguntasCategoria(preguntaDeRonda);
                resetearColores();
            } else {
                JOptionPane.showMessageDialog(this, "Respuesta Incorrecta.");
                this.dispose();
            }
        } else {
            JOptionPane.showMessageDialog(this, "Debe seleccionar una opción.");
        }
        //}
    }//GEN-LAST:event_jButtonResponderActionPerformed

    public void mostrarPreguntas() {
        List<Categoria> test = this.ICCAT.crearCategoriasConPreguntas();
        for (int i = 0; i < test.size(); i++) {
            System.out.println("COMPLEJIDAD:" + test.get(i).getNivelDeComplejidad());
            System.out.println("CATEGORÍA:" + test.get(i).getNombre());
            List<Pregunta> test2 = new ArrayList<>();
            test2 = test.get(i).getPreguntas();
            for (int j = 0; j < test2.size(); j++) {
                System.out.println(test2.get(j).getPregunta());
                System.out.println(test2.get(j).getRespuestaCorrecta());
                List<String> test3incorrectas = new ArrayList<>();
                test3incorrectas = test2.get(j).getRespuestasIncorrectas();
                for (int h = 0; h < test3incorrectas.size(); h++) {
                    System.out.println(test3incorrectas.get(h));
                }
            }
        }
    }

    public void seleccionarOpcion(int opc) {
        Color opcSelectedColor = Color.PINK;
        Color opcSinSeleccionar = Color.LIGHT_GRAY;
        if (opc == 1) {
            this.jPanelOpcion1.setBackground(opcSelectedColor);
            this.jPanelOpcion2.setBackground(opcSinSeleccionar);
            this.jPanelOpcion3.setBackground(opcSinSeleccionar);
            this.jPanelOpcion4.setBackground(opcSinSeleccionar);
        } else if (opc == 2) {
            this.jPanelOpcion1.setBackground(opcSinSeleccionar);
            this.jPanelOpcion2.setBackground(opcSelectedColor);
            this.jPanelOpcion3.setBackground(opcSinSeleccionar);
            this.jPanelOpcion4.setBackground(opcSinSeleccionar);
        } else if (opc == 3) {
            this.jPanelOpcion1.setBackground(opcSinSeleccionar);
            this.jPanelOpcion2.setBackground(opcSinSeleccionar);
            this.jPanelOpcion3.setBackground(opcSelectedColor);
            this.jPanelOpcion4.setBackground(opcSinSeleccionar);
        } else if (opc == 4) {
            this.jPanelOpcion1.setBackground(opcSinSeleccionar);
            this.jPanelOpcion2.setBackground(opcSinSeleccionar);
            this.jPanelOpcion3.setBackground(opcSinSeleccionar);
            this.jPanelOpcion4.setBackground(opcSelectedColor);
        }
    }

    public boolean isOpcionSeleccionada() {
        if (this.jPanelOpcion1.getBackground() == Color.PINK || this.jPanelOpcion2.getBackground() == Color.PINK || this.jPanelOpcion3.getBackground() == Color.PINK || this.jPanelOpcion4.getBackground() == Color.PINK) {
            return true;
        } else {
            return false;
        }
    }

    public int[] establecerPremios() {
        int[] premios = new int[5];
        premios[0] = 100;
        premios[1] = 300;
        premios[2] = 500;
        premios[3] = 1000;
        premios[4] = 2000;
        return premios;
    }

    public void actualizarDatosDePartida() { //Actualiza la ronda y premios.
        this.jLabelPremioActualNum.setText(Integer.toString(this.premiosPorRonda[this.ronda - 1])); //Actualizo el premio actual
        this.jLabelNumero.setText(Integer.toString(this.ronda));
    }

    public void siguienteRonda() {
        this.ronda++;
        actualizarDatosDePartida();
    }

    public void actualizarOpcionesDePreguntasCategoria(Pregunta pregunta) {
        Random randomGenerator = new Random();
        int respuestaCorrectaIndex = randomGenerator.nextInt(4);
        this.jLabelPregunta.setText(pregunta.getPregunta());
        this.jLabelCategoria.setText(pregunta.getCategoria());
        if (respuestaCorrectaIndex == 0) {
            this.jLabelOpcPregunta1.setText(pregunta.getRespuestasIncorrectas().get(0));
            this.jLabelOpcPregunta2.setText(pregunta.getRespuestasIncorrectas().get(1));
            this.jLabelOpcPregunta3.setText(pregunta.getRespuestasIncorrectas().get(2));
            this.jLabelOpcPregunta4.setText(pregunta.getRespuestaCorrecta());
        } else if (respuestaCorrectaIndex == 1) {
            this.jLabelOpcPregunta4.setText(pregunta.getRespuestasIncorrectas().get(0));
            this.jLabelOpcPregunta3.setText(pregunta.getRespuestasIncorrectas().get(1));
            this.jLabelOpcPregunta1.setText(pregunta.getRespuestasIncorrectas().get(2));
            this.jLabelOpcPregunta2.setText(pregunta.getRespuestaCorrecta());
        } else if (respuestaCorrectaIndex == 2) {
            this.jLabelOpcPregunta2.setText(pregunta.getRespuestasIncorrectas().get(0));
            this.jLabelOpcPregunta1.setText(pregunta.getRespuestasIncorrectas().get(1));
            this.jLabelOpcPregunta4.setText(pregunta.getRespuestasIncorrectas().get(2));
            this.jLabelOpcPregunta3.setText(pregunta.getRespuestaCorrecta());
        } else if (respuestaCorrectaIndex == 3) {
            this.jLabelOpcPregunta4.setText(pregunta.getRespuestasIncorrectas().get(0));
            this.jLabelOpcPregunta3.setText(pregunta.getRespuestasIncorrectas().get(1));
            this.jLabelOpcPregunta1.setText(pregunta.getRespuestasIncorrectas().get(2));
            this.jLabelOpcPregunta2.setText(pregunta.getRespuestaCorrecta());
        }
    }

    public String obtenerOpcionSeleccionada() {
        if (this.jPanelOpcion1.getBackground() == Color.PINK) {
            return this.jLabelOpcPregunta1.getText();
        } else if (this.jPanelOpcion2.getBackground() == Color.PINK) {
            return this.jLabelOpcPregunta2.getText();
        } else if (this.jPanelOpcion3.getBackground() == Color.PINK) {
            return this.jLabelOpcPregunta3.getText();
        } else {
            return this.jLabelOpcPregunta4.getText();
        }
    }

    public void resetearColores() {
        this.jPanelOpcion1.setBackground(Color.LIGHT_GRAY);
        this.jPanelOpcion2.setBackground(Color.LIGHT_GRAY);
        this.jPanelOpcion3.setBackground(Color.LIGHT_GRAY);
        this.jPanelOpcion4.setBackground(Color.LIGHT_GRAY);
    }

    public void rellenarComboBoxJugadores() {
        this.Jugadores = this.ICJUG.obtenerNicknamesJugadores();
        for (int i = 0; i < this.Jugadores.size(); i++) {
            this.jComboBox1.addItem(this.Jugadores.get(i));
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonResponder;
    private javax.swing.JButton jButtonRetirarse;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabelCategoria;
    private javax.swing.JLabel jLabelJugadorTxt;
    private javax.swing.JLabel jLabelNumero;
    private javax.swing.JLabel jLabelOpcPregunta1;
    private javax.swing.JLabel jLabelOpcPregunta2;
    private javax.swing.JLabel jLabelOpcPregunta3;
    private javax.swing.JLabel jLabelOpcPregunta4;
    private javax.swing.JLabel jLabelPregunta;
    private javax.swing.JLabel jLabelPremioActualNum;
    private javax.swing.JLabel jLabelPremioActualTitulo;
    private javax.swing.JLabel jLabelPremioAcumuladoNum;
    private javax.swing.JLabel jLabelPremioAcumuladoTitulo;
    private javax.swing.JLabel jLabelRondaTitulo;
    private javax.swing.JPanel jPanelFondo;
    private javax.swing.JPanel jPanelOpcion1;
    private javax.swing.JPanel jPanelOpcion2;
    private javax.swing.JPanel jPanelOpcion3;
    private javax.swing.JPanel jPanelOpcion4;
    private javax.swing.JPanel jPanelOpcionesPreguntas;
    private javax.swing.JPanel jPanelPreguntaCategoria;
    private javax.swing.JPanel jPanelPremios;
    private javax.swing.JPanel jPanelRondas;
    // End of variables declaration//GEN-END:variables
}
