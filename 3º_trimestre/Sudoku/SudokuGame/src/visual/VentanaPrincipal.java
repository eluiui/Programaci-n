/*
 * VentanaPrincipal.java
 *
 * 
 */
package visual;

import javax.swing.ImageIcon;
import sudoku.Cronometro;
import sudoku.Sudoku;
import sudoku.SudokuDB;

/**
 *
 * @author a22jesusbm
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    boolean completo = false;
    int con = 0;
    SudokuDB sudokudb = new SudokuDB();
    Sudoku sudo = new Sudoku();
    Cronometro cronometro = new Cronometro();
    ImageIcon imageIcon = new ImageIcon("Z:\\1º DAM\\Programacion\\3º_trimestre\\Sudoku\\SudokuGame\\src\\images\\sudoku.gif");

    public VentanaPrincipal() {
        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sudoku10 = new javax.swing.JPanel();
        error11 = new javax.swing.JLabel();
        empezar7 = new javax.swing.JButton();
        nombre7 = new javax.swing.JTextField();
        nombe7 = new javax.swing.JLabel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        sudoku3 = new javax.swing.JPanel();
        pantallainicio = new javax.swing.JButton();
        rankinglabel = new javax.swing.JLabel();
        ranking = new javax.swing.JLabel();
        sudoku2 = new javax.swing.JPanel();
        t16 = new javax.swing.JTextField();
        t17 = new javax.swing.JTextField();
        t26 = new javax.swing.JTextField();
        t23 = new javax.swing.JTextField();
        t27 = new javax.swing.JTextField();
        t21 = new javax.swing.JTextField();
        t20 = new javax.swing.JTextField();
        t28 = new javax.swing.JTextField();
        t60 = new javax.swing.JTextField();
        t25 = new javax.swing.JTextField();
        t66 = new javax.swing.JTextField();
        t34 = new javax.swing.JTextField();
        t61 = new javax.swing.JTextField();
        t62 = new javax.swing.JTextField();
        t78 = new javax.swing.JTextField();
        t71 = new javax.swing.JTextField();
        t70 = new javax.swing.JTextField();
        t72 = new javax.swing.JTextField();
        t76 = new javax.swing.JTextField();
        t73 = new javax.swing.JTextField();
        t88 = new javax.swing.JTextField();
        t77 = new javax.swing.JTextField();
        t80 = new javax.swing.JTextField();
        t86 = new javax.swing.JTextField();
        t24 = new javax.swing.JTextField();
        t82 = new javax.swing.JTextField();
        t22 = new javax.swing.JTextField();
        t85 = new javax.swing.JTextField();
        t31 = new javax.swing.JTextField();
        t84 = new javax.swing.JTextField();
        t32 = new javax.swing.JTextField();
        t87 = new javax.swing.JTextField();
        t35 = new javax.swing.JTextField();
        t83 = new javax.swing.JTextField();
        t38 = new javax.swing.JTextField();
        error = new javax.swing.JLabel();
        t37 = new javax.swing.JTextField();
        t30 = new javax.swing.JTextField();
        t36 = new javax.swing.JTextField();
        t41 = new javax.swing.JTextField();
        t81 = new javax.swing.JTextField();
        t00 = new javax.swing.JTextField();
        t33 = new javax.swing.JTextField();
        t01 = new javax.swing.JTextField();
        t55 = new javax.swing.JTextField();
        t02 = new javax.swing.JTextField();
        t40 = new javax.swing.JTextField();
        t65 = new javax.swing.JTextField();
        t03 = new javax.swing.JTextField();
        t44 = new javax.swing.JTextField();
        t74 = new javax.swing.JTextField();
        t04 = new javax.swing.JTextField();
        t47 = new javax.swing.JTextField();
        labeltimer = new javax.swing.JLabel();
        t43 = new javax.swing.JTextField();
        t75 = new javax.swing.JTextField();
        t48 = new javax.swing.JTextField();
        t15 = new javax.swing.JTextField();
        t45 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        t42 = new javax.swing.JTextField();
        t46 = new javax.swing.JTextField();
        t51 = new javax.swing.JTextField();
        t57 = new javax.swing.JTextField();
        t05 = new javax.swing.JTextField();
        t06 = new javax.swing.JTextField();
        t07 = new javax.swing.JTextField();
        t08 = new javax.swing.JTextField();
        t10 = new javax.swing.JTextField();
        t18 = new javax.swing.JTextField();
        t11 = new javax.swing.JTextField();
        t12 = new javax.swing.JTextField();
        t56 = new javax.swing.JTextField();
        t13 = new javax.swing.JTextField();
        t52 = new javax.swing.JTextField();
        t14 = new javax.swing.JTextField();
        t58 = new javax.swing.JTextField();
        t53 = new javax.swing.JTextField();
        t54 = new javax.swing.JTextField();
        t50 = new javax.swing.JTextField();
        t63 = new javax.swing.JTextField();
        t68 = new javax.swing.JTextField();
        t67 = new javax.swing.JTextField();
        t64 = new javax.swing.JTextField();
        pausa = new javax.swing.JButton();
        reglas = new javax.swing.JButton();
        finalizar = new javax.swing.JButton();
        completar = new javax.swing.JButton();
        sudoku1 = new javax.swing.JPanel();
        empezar = new javax.swing.JButton();
        nombre = new javax.swing.JTextField();
        nombe9 = new javax.swing.JLabel();
        escogerlabe = new javax.swing.JLabel();
        escoger = new javax.swing.JComboBox<>();
        ranked = new javax.swing.JButton();
        reglaspanel = new javax.swing.JPanel();
        javax.swing.JButton pantallasudoku = new javax.swing.JButton();
        image = new javax.swing.JLabel();
        reglaslabel = new javax.swing.JLabel();
        tituloreglas = new javax.swing.JLabel();

        sudoku10.setBackground(new java.awt.Color(150, 14, 14));

        empezar7.setText("Empezar");
        empezar7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empezar7ActionPerformed(evt);
            }
        });

        nombre7.setPreferredSize(new java.awt.Dimension(138, 44));
        nombre7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombre7ActionPerformed(evt);
            }
        });

        nombe7.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        nombe7.setText("Insertar Nombre");

        javax.swing.GroupLayout sudoku10Layout = new javax.swing.GroupLayout(sudoku10);
        sudoku10.setLayout(sudoku10Layout);
        sudoku10Layout.setHorizontalGroup(
            sudoku10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sudoku10Layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addComponent(error11, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sudoku10Layout.createSequentialGroup()
                .addGap(0, 58, Short.MAX_VALUE)
                .addGroup(sudoku10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(nombe7, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombre7, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(76, 76, 76))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sudoku10Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(empezar7, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(125, 125, 125))
        );
        sudoku10Layout.setVerticalGroup(
            sudoku10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sudoku10Layout.createSequentialGroup()
                .addGap(147, 147, 147)
                .addComponent(nombe7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(nombre7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96)
                .addComponent(empezar7, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(error11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 498, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sudoku");
        setBackground(new java.awt.Color(200, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        sudoku3.setVisible(false);
        sudoku3.setBackground(new java.awt.Color(150, 14, 14));

        pantallainicio.setBackground(new java.awt.Color(15, 200, 15));
        pantallainicio.setText("Volver a la pantalla inicial");
        pantallainicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pantallainicioActionPerformed(evt);
            }
        });

        rankinglabel.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        rankinglabel.setText("Ranking");

        ranking.setBackground(new java.awt.Color(250, 50, 50));
        ranking.setOpaque(true);

        javax.swing.GroupLayout sudoku3Layout = new javax.swing.GroupLayout(sudoku3);
        sudoku3.setLayout(sudoku3Layout);
        sudoku3Layout.setHorizontalGroup(
            sudoku3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sudoku3Layout.createSequentialGroup()
                .addGroup(sudoku3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(sudoku3Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(ranking, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(sudoku3Layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(pantallainicio, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(sudoku3Layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(rankinglabel, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        sudoku3Layout.setVerticalGroup(
            sudoku3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sudoku3Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(rankinglabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ranking, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(28, 28, 28)
                .addComponent(pantallainicio, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        sudoku2.setVisible(false);
        sudoku2.setBackground(new java.awt.Color(150, 14, 14));
        sudoku2.setMaximumSize(new java.awt.Dimension(100, 100));
        sudoku2.setPreferredSize(new java.awt.Dimension(423, 590));

        t16.setBackground(new java.awt.Color(204, 204, 255));
        t16.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t16KeyReleased(evt);
            }
        });

        t17.setBackground(new java.awt.Color(204, 204, 255));
        t17.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t17KeyReleased(evt);
            }
        });

        t26.setBackground(new java.awt.Color(204, 204, 255));

        t23.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t23KeyReleased(evt);
            }
        });

        t27.setBackground(new java.awt.Color(204, 204, 255));
        t27.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t27KeyReleased(evt);
            }
        });

        t21.setBackground(new java.awt.Color(204, 204, 255));

        t20.setBackground(new java.awt.Color(204, 204, 255));
        t20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t20ActionPerformed(evt);
            }
        });
        t20.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t20KeyReleased(evt);
            }
        });

        t28.setBackground(new java.awt.Color(204, 204, 255));
        t28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t28ActionPerformed(evt);
            }
        });
        t28.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t28KeyReleased(evt);
            }
        });

        t60.setBackground(new java.awt.Color(204, 204, 255));
        t60.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t60KeyReleased(evt);
            }
        });

        t25.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t25KeyReleased(evt);
            }
        });

        t66.setBackground(new java.awt.Color(204, 204, 255));

        t34.setBackground(new java.awt.Color(204, 204, 255));
        t34.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t34KeyReleased(evt);
            }
        });

        t61.setBackground(new java.awt.Color(204, 204, 255));
        t61.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t61KeyReleased(evt);
            }
        });

        t62.setBackground(new java.awt.Color(204, 204, 255));

        t78.setBackground(new java.awt.Color(204, 204, 255));
        t78.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t78KeyReleased(evt);
            }
        });

        t71.setBackground(new java.awt.Color(204, 204, 255));
        t71.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t71KeyReleased(evt);
            }
        });

        t70.setBackground(new java.awt.Color(204, 204, 255));

        t72.setBackground(new java.awt.Color(204, 204, 255));
        t72.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t72KeyReleased(evt);
            }
        });

        t76.setBackground(new java.awt.Color(204, 204, 255));
        t76.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t76KeyReleased(evt);
            }
        });

        t73.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t73KeyReleased(evt);
            }
        });

        t88.setBackground(new java.awt.Color(204, 204, 255));
        t88.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t88KeyReleased(evt);
            }
        });

        t77.setBackground(new java.awt.Color(204, 204, 255));
        t77.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t77KeyReleased(evt);
            }
        });

        t80.setBackground(new java.awt.Color(204, 204, 255));
        t80.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t80KeyReleased(evt);
            }
        });

        t86.setBackground(new java.awt.Color(204, 204, 255));
        t86.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t86KeyReleased(evt);
            }
        });

        t24.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t24KeyReleased(evt);
            }
        });

        t82.setBackground(new java.awt.Color(204, 204, 255));

        t22.setBackground(new java.awt.Color(204, 204, 255));

        t85.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t85KeyReleased(evt);
            }
        });

        t31.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t31KeyReleased(evt);
            }
        });

        t84.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t84KeyReleased(evt);
            }
        });

        t32.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t32KeyReleased(evt);
            }
        });

        t87.setBackground(new java.awt.Color(204, 204, 255));

        t35.setBackground(new java.awt.Color(204, 204, 255));
        t35.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t35KeyReleased(evt);
            }
        });

        t38.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t38KeyReleased(evt);
            }
        });

        t30.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t30KeyReleased(evt);
            }
        });

        t81.setBackground(new java.awt.Color(204, 204, 255));

        t00.setBackground(new java.awt.Color(204, 204, 255));
        t00.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t00KeyReleased(evt);
            }
        });

        t33.setBackground(new java.awt.Color(204, 204, 255));
        t33.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t33KeyReleased(evt);
            }
        });

        t01.setBackground(new java.awt.Color(204, 204, 255));
        t01.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t01KeyReleased(evt);
            }
        });

        t55.setBackground(new java.awt.Color(204, 204, 255));
        t55.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t55KeyReleased(evt);
            }
        });

        t02.setBackground(new java.awt.Color(204, 204, 255));
        t02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t02ActionPerformed(evt);
            }
        });
        t02.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t02KeyReleased(evt);
            }
        });

        t40.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t40KeyReleased(evt);
            }
        });

        t65.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t65KeyReleased(evt);
            }
        });

        t03.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t03KeyReleased(evt);
            }
        });

        t44.setBackground(new java.awt.Color(204, 204, 255));
        t44.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t44KeyReleased(evt);
            }
        });

        t74.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t74KeyReleased(evt);
            }
        });

        t04.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t04KeyReleased(evt);
            }
        });

        labeltimer.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        labeltimer.setText("TIMER");

        t43.setBackground(new java.awt.Color(204, 204, 255));
        t43.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t43KeyReleased(evt);
            }
        });

        t75.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t75KeyReleased(evt);
            }
        });

        t48.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t48KeyReleased(evt);
            }
        });

        t15.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t15KeyReleased(evt);
            }
        });

        t45.setBackground(new java.awt.Color(204, 204, 255));
        t45.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t45KeyReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel2.setText("SUDOKU");

        t57.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t57KeyReleased(evt);
            }
        });

        t05.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t05KeyReleased(evt);
            }
        });

        t06.setBackground(new java.awt.Color(204, 204, 255));

        t07.setBackground(new java.awt.Color(204, 204, 255));

        t08.setBackground(new java.awt.Color(204, 204, 255));
        t08.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t08KeyReleased(evt);
            }
        });

        t10.setBackground(new java.awt.Color(204, 204, 255));
        t10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t10ActionPerformed(evt);
            }
        });
        t10.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t10KeyReleased(evt);
            }
        });

        t18.setBackground(new java.awt.Color(204, 204, 255));

        t11.setBackground(new java.awt.Color(204, 204, 255));
        t11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t11ActionPerformed(evt);
            }
        });
        t11.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t11KeyReleased(evt);
            }
        });

        t12.setBackground(new java.awt.Color(204, 204, 255));
        t12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t12ActionPerformed(evt);
            }
        });
        t12.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t12KeyReleased(evt);
            }
        });

        t56.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t56KeyReleased(evt);
            }
        });

        t13.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t13KeyReleased(evt);
            }
        });

        t14.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t14KeyReleased(evt);
            }
        });

        t58.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t58KeyReleased(evt);
            }
        });

        t53.setBackground(new java.awt.Color(204, 204, 255));

        t54.setBackground(new java.awt.Color(204, 204, 255));
        t54.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t54KeyReleased(evt);
            }
        });

        t50.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t50KeyReleased(evt);
            }
        });

        t63.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t63KeyReleased(evt);
            }
        });

        t68.setBackground(new java.awt.Color(204, 204, 255));
        t68.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t68KeyReleased(evt);
            }
        });

        t67.setBackground(new java.awt.Color(204, 204, 255));

        pausa.setBackground(new java.awt.Color(250, 0, 250));
        pausa.setText("Pausa");
        pausa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pausaActionPerformed(evt);
            }
        });

        reglas.setBackground(new java.awt.Color(250, 250, 0));
        reglas.setText("Reglas");
        reglas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reglasActionPerformed(evt);
            }
        });

        finalizar.setBackground(new java.awt.Color(255, 102, 0));
        finalizar.setText("Finalizar");
        finalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finalizarActionPerformed(evt);
            }
        });

        completar.setBackground(new java.awt.Color(255, 255, 255));
        completar.setText("Completar");
        completar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                completarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout sudoku2Layout = new javax.swing.GroupLayout(sudoku2);
        sudoku2.setLayout(sudoku2Layout);
        sudoku2Layout.setHorizontalGroup(
            sudoku2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sudoku2Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(sudoku2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(sudoku2Layout.createSequentialGroup()
                        .addComponent(t10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(t11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(t12, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(t13, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(t14, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(t15, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(t16, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(t17, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(t18, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(sudoku2Layout.createSequentialGroup()
                        .addComponent(t20, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(t21, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(t22, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(t23, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(t24, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(t25, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(t26, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(t27, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(t28, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(sudoku2Layout.createSequentialGroup()
                        .addComponent(t30, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(t31, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(t32, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(t33, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(t34, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(t35, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(t36, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(t37, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(t38, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(sudoku2Layout.createSequentialGroup()
                        .addComponent(t40, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(t41, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(t42, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(t43, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(t44, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(t45, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(t46, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(t47, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(t48, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(sudoku2Layout.createSequentialGroup()
                        .addComponent(t50, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(t51, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(t52, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(t53, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(t54, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(t55, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(t56, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(t57, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(t58, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(sudoku2Layout.createSequentialGroup()
                        .addComponent(t60, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(t61, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(t62, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(t63, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(t64, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(t65, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(t66, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(t67, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(t68, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(sudoku2Layout.createSequentialGroup()
                        .addComponent(t70, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(t71, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(t72, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(t73, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(t74, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(t75, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(t76, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(t77, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(t78, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(sudoku2Layout.createSequentialGroup()
                        .addComponent(t00, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(t01, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(t02, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(t03, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(t04, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(t05, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(t06, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(t07, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(t08, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(sudoku2Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labeltimer))
                    .addGroup(sudoku2Layout.createSequentialGroup()
                        .addGroup(sudoku2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(error, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(sudoku2Layout.createSequentialGroup()
                                .addComponent(t80, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(t81, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(t82, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(t83, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(t84, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(t85, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(t86, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(t87, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(t88, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(64, Short.MAX_VALUE))
            .addGroup(sudoku2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(completar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pausa, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(finalizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(reglas, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );
        sudoku2Layout.setVerticalGroup(
            sudoku2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sudoku2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(sudoku2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labeltimer, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(sudoku2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(sudoku2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(t01, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(t00, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(t02, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t03, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t04, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t05, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t06, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(sudoku2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(t07, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(t08, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20)
                .addGroup(sudoku2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(t10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t12, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t13, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t14, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(sudoku2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(t16, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(t15, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(t17, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t18, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(sudoku2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(t20, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t21, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t22, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t23, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t24, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t25, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t26, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t27, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t28, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(sudoku2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(t30, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t31, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t32, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(sudoku2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(t34, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(t33, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(t35, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t36, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t37, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t38, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(sudoku2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(t40, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t41, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t42, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t43, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t44, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t45, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t46, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t47, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t48, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(sudoku2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(t50, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t51, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t52, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t53, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t54, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(sudoku2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(t56, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(t55, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(t57, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t58, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(sudoku2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(t60, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t61, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t62, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t63, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(sudoku2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(t64, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(t65, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(t66, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t67, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t68, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(sudoku2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(t70, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t71, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t72, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t73, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t74, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(sudoku2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(t76, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(t75, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(t77, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t78, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(sudoku2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(t80, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t81, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t82, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t83, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t84, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t85, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t86, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t87, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t88, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(error, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(sudoku2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(finalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(sudoku2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(pausa, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(completar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(reglas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        sudoku1.setBackground(new java.awt.Color(150, 14, 14));
        sudoku1.setPreferredSize(new java.awt.Dimension(423, 590));

        empezar.setBackground(new java.awt.Color(150, 250, 150));
        empezar.setText("Empezar");
        empezar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        empezar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empezarActionPerformed(evt);
            }
        });

        nombre.setBackground(new java.awt.Color(250, 150, 150));
        nombre.setPreferredSize(new java.awt.Dimension(138, 44));
        nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreActionPerformed(evt);
            }
        });

        nombe9.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        nombe9.setText("Insertar Nombre");

        escogerlabe.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        escogerlabe.setText("Escoger jugador");

        escoger.setBackground(new java.awt.Color(100, 200, 50));
        escoger.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        escoger.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        escoger.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                escogerActionPerformed(evt);
            }
        });

        ranked.setBackground(new java.awt.Color(102, 153, 255));
        ranked.setText("Ranking");
        ranked.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rankedActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout sudoku1Layout = new javax.swing.GroupLayout(sudoku1);
        sudoku1.setLayout(sudoku1Layout);
        sudoku1Layout.setHorizontalGroup(
            sudoku1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sudoku1Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(sudoku1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(sudoku1Layout.createSequentialGroup()
                        .addGroup(sudoku1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(nombe9, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                            .addGroup(sudoku1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(escoger, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(escogerlabe, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(nombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(77, Short.MAX_VALUE))
                    .addGroup(sudoku1Layout.createSequentialGroup()
                        .addGroup(sudoku1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(empezar, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                            .addComponent(ranked, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(140, 140, 140))))
        );
        sudoku1Layout.setVerticalGroup(
            sudoku1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sudoku1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(nombe9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(escogerlabe, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(escoger, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(empezar, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ranked, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );

        reglaspanel.setVisible(false);
        reglaspanel.setBackground(new java.awt.Color(150, 14, 14));

        pantallasudoku.setBackground(new java.awt.Color(255, 0, 255));
        pantallasudoku.setText("Volver al sudoku");
        pantallasudoku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pantallasudokuActionPerformed(evt);
            }
        });

        image.setOpaque(true);

        reglaslabel.setBackground(new java.awt.Color(250, 100, 100));
        reglaslabel.setOpaque(true);

        tituloreglas.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        tituloreglas.setText("Reglas");

        javax.swing.GroupLayout reglaspanelLayout = new javax.swing.GroupLayout(reglaspanel);
        reglaspanel.setLayout(reglaspanelLayout);
        reglaspanelLayout.setHorizontalGroup(
            reglaspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(reglaspanelLayout.createSequentialGroup()
                .addGroup(reglaspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(reglaspanelLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(image, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(reglaspanelLayout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(pantallasudoku, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(reglaspanelLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(reglaslabel, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(reglaspanelLayout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(tituloreglas)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        reglaspanelLayout.setVerticalGroup(
            reglaspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, reglaspanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tituloreglas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(reglaslabel, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(image, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pantallasudoku, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(sudoku1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sudoku2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sudoku3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(reglaspanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sudoku2, javax.swing.GroupLayout.DEFAULT_SIZE, 610, Short.MAX_VALUE)
            .addComponent(sudoku1, javax.swing.GroupLayout.DEFAULT_SIZE, 610, Short.MAX_VALUE)
            .addComponent(sudoku3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(reglaspanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void empezar7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empezar7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_empezar7ActionPerformed

    private void nombre7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombre7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombre7ActionPerformed

    private void t68KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t68KeyReleased
        // TODO add your handling code here:

        if (sudo.comprobarvalor((t68.getText()))) {
            if (sudo.fila(Integer.valueOf(t68.getText()), 6)) {
                error.setText("el numero " + t68.getText() + " ya esta en la fila");
                t68.setText("");
            } else {
                if (sudo.columna(Integer.valueOf(t68.getText()), 8)) {
                    error.setText("el numero " + t68.getText() + " ya esta en la columna");
                    t68.setText("");
                } else {

                    if (sudo.caja(Integer.valueOf(t68.getText()), 6, 8)) {
                        error.setText("el numero " + t68.getText() + " ya esta en la caja");
                        t68.setText("");
                    } else {
                        sudo.matriz[6][8] = Integer.valueOf(t68.getText());
                        error.setText("");
                        con++;
                    }
                }
            }
        } else {
            t68.setText("");
        }
        if (con == 0) {
            sudo.matriz[6][8] = 0;
        }
    }//GEN-LAST:event_t68KeyReleased

    private void t63KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t63KeyReleased
        // TODO add your handling code here:

        if (sudo.comprobarvalor((t63.getText()))) {
            if (sudo.fila(Integer.valueOf(t63.getText()), 6)) {
                error.setText("el numero " + t63.getText() + " ya esta en la fila");
                t63.setText("");
            } else {
                if (sudo.columna(Integer.valueOf(t63.getText()), 3)) {
                    error.setText("el numero " + t63.getText() + " ya esta en la columna");
                    t63.setText("");
                } else {

                    if (sudo.caja(Integer.valueOf(t63.getText()), 6, 3)) {
                        error.setText("el numero " + t63.getText() + " ya esta en la caja");
                        t63.setText("");
                    } else {
                        sudo.matriz[6][3] = Integer.valueOf(t63.getText());
                        error.setText("");
                        con++;
                    }
                }
            }
        } else {
            t63.setText("");
        }
        if (con == 0) {
            sudo.matriz[6][3] = 0;
        }
    }//GEN-LAST:event_t63KeyReleased

    private void t50KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t50KeyReleased
        // TODO add your handling code here:

        if (sudo.comprobarvalor((t50.getText()))) {
            if (sudo.fila(Integer.valueOf(t50.getText()), 5)) {
                error.setText("el numero " + t50.getText() + " ya esta en la fila");
                t50.setText("");
            } else {
                if (sudo.columna(Integer.valueOf(t50.getText()), 0)) {
                    error.setText("el numero " + t50.getText() + " ya esta en la columna");
                    t50.setText("");
                } else {

                    if (sudo.caja(Integer.valueOf(t50.getText()), 5, 0)) {
                        error.setText("el numero " + t50.getText() + " ya esta en la caja");
                        t50.setText("");
                    } else {
                        sudo.matriz[5][0] = Integer.valueOf(t50.getText());
                        error.setText("");
                        con++;
                    }
                }
            }
        } else {
            t50.setText("");
        }
        if (con == 0) {
            sudo.matriz[5][0] = 0;
        }
    }//GEN-LAST:event_t50KeyReleased

    private void t54KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t54KeyReleased
        // TODO add your handling code here:

        if (sudo.comprobarvalor((t54.getText()))) {
            if (sudo.fila(Integer.valueOf(t54.getText()), 5)) {
                error.setText("el numero " + t54.getText() + " ya esta en la fila");
                t54.setText("");
            } else {
                if (sudo.columna(Integer.valueOf(t54.getText()), 4)) {
                    error.setText("el numero " + t54.getText() + " ya esta en la columna");
                    t54.setText("");
                } else {

                    if (sudo.caja(Integer.valueOf(t54.getText()), 5, 4)) {
                        error.setText("el numero " + t54.getText() + " ya esta en la caja");
                        t54.setText("");
                    } else {
                        sudo.matriz[5][4] = Integer.valueOf(t54.getText());
                        error.setText("");
                        con++;
                    }
                }
            }
        } else {
            t54.setText("");
        }
        if (con == 0) {
            sudo.matriz[5][4] = 0;
        }
    }//GEN-LAST:event_t54KeyReleased

    private void t58KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t58KeyReleased
        // TODO add your handling code here:

        if (sudo.comprobarvalor((t58.getText()))) {
            if (sudo.fila(Integer.valueOf(t58.getText()), 5)) {
                error.setText("el numero " + t58.getText() + " ya esta en la fila");
                t58.setText("");
            } else {
                if (sudo.columna(Integer.valueOf(t58.getText()), 8)) {
                    error.setText("el numero " + t58.getText() + " ya esta en la columna");
                    t58.setText("");
                } else {

                    if (sudo.caja(Integer.valueOf(t58.getText()), 5, 8)) {
                        error.setText("el numero " + t58.getText() + " ya esta en la caja");
                        t58.setText("");
                    } else {
                        sudo.matriz[5][8] = Integer.valueOf(t58.getText());
                        error.setText("");
                        con++;
                    }
                }
            }
        } else {
            t58.setText("");
        }
        if (con == 0) {
            sudo.matriz[5][8] = 0;
        }
    }//GEN-LAST:event_t58KeyReleased

    private void t14KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t14KeyReleased
        // TODO add your handling code here:

        if (sudo.comprobarvalor((t14.getText()))) {
            if (sudo.fila(Integer.valueOf(t14.getText()), 1)) {
                error.setText("el numero " + t14.getText() + " ya esta en la fila");
                t14.setText("");
            } else {
                if (sudo.columna(Integer.valueOf(t14.getText()), 4)) {
                    error.setText("el numero " + t14.getText() + " ya esta en la columna");
                    t14.setText("");
                } else {

                    if (sudo.caja(Integer.valueOf(t14.getText()), 1, 4)) {
                        error.setText("el numero " + t14.getText() + " ya esta en la caja");
                        t14.setText("");
                    } else {
                        sudo.matriz[1][4] = Integer.valueOf(t14.getText());
                        error.setText("");
                        con++;
                    }
                }
            }
        } else {
            t14.setText("");
        }
        if (con == 0) {
            sudo.matriz[1][4] = 0;
        }
    }//GEN-LAST:event_t14KeyReleased

    private void t13KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t13KeyReleased
        // TODO add your handling code here:

        if (sudo.comprobarvalor((t13.getText()))) {
            if (sudo.fila(Integer.valueOf(t13.getText()), 1)) {
                error.setText("el numero " + t13.getText() + " ya esta en la fila");
                t13.setText("");

            } else {
                if (sudo.columna(Integer.valueOf(t13.getText()), 3)) {
                    error.setText("el numero " + t13.getText() + " ya esta en la columna");
                    t13.setText("");

                } else {

                    if (sudo.caja(Integer.valueOf(t13.getText()), 1, 3)) {
                        error.setText("el numero " + t13.getText() + " ya esta en la caja");
                        t13.setText("");

                    } else {
                        sudo.matriz[1][3] = Integer.valueOf(t13.getText());
                        error.setText("");
                        con++;
                    }
                }
            }
        } else {
            t13.setText("");
        }
        if (con == 0) {
            sudo.matriz[1][3] = 0;
        }
    }//GEN-LAST:event_t13KeyReleased

    private void t56KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t56KeyReleased
        // TODO add your handling code here:

        if (sudo.comprobarvalor((t56.getText()))) {
            if (sudo.fila(Integer.valueOf(t56.getText()), 5)) {
                error.setText("el numero " + t56.getText() + " ya esta en la fila");
                t56.setText("");
            } else {
                if (sudo.columna(Integer.valueOf(t56.getText()), 6)) {
                    error.setText("el numero " + t56.getText() + " ya esta en la columna");
                    t56.setText("");
                } else {

                    if (sudo.caja(Integer.valueOf(t56.getText()), 5, 6)) {
                        error.setText("el numero " + t56.getText() + " ya esta en la caja");
                        t56.setText("");
                    } else {
                        sudo.matriz[5][6] = Integer.valueOf(t56.getText());
                        error.setText("");
                        con++;
                    }
                }
            }
        } else {
            t56.setText("");
        }
        if (con == 0) {
            sudo.matriz[5][6] = 0;
        }
    }//GEN-LAST:event_t56KeyReleased

    private void t12KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t12KeyReleased
        // TODO add your handling code here:

        if (sudo.comprobarvalor((t12.getText()))) {
            if (sudo.fila(Integer.valueOf(t12.getText()), 1)) {
                error.setText("el numero " + t12.getText() + " ya esta en la fila");
                t12.setText("");
            } else {
                if (sudo.columna(Integer.valueOf(t12.getText()), 2)) {
                    error.setText("el numero " + t12.getText() + " ya esta en la columna");
                    t12.setText("");
                } else {

                    if (sudo.caja(Integer.valueOf(t12.getText()), 1, 2)) {
                        error.setText("el numero " + t12.getText() + " ya esta en la caja");
                        t12.setText("");
                    } else {
                        sudo.matriz[1][2] = Integer.valueOf(t12.getText());
                        error.setText("");
                        con++;
                    }
                }
            }
        } else {
            t12.setText("");
        }
        if (con == 0) {
            sudo.matriz[1][2] = 0;
        }
    }//GEN-LAST:event_t12KeyReleased

    private void t11KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t11KeyReleased
        // TODO add your handling code here:

        if (sudo.comprobarvalor((t11.getText()))) {
            if (sudo.fila(Integer.valueOf(t11.getText()), 1)) {
                error.setText("el numero " + t11.getText() + " ya esta en la fila");
                t11.setText("");
            } else {
                if (sudo.columna(Integer.valueOf(t11.getText()), 1)) {
                    error.setText("el numero " + t11.getText() + " ya esta en la columna");
                    t11.setText("");
                } else {

                    if (sudo.caja(Integer.valueOf(t11.getText()), 1, 1)) {
                        error.setText("el numero " + t11.getText() + " ya esta en la caja");
                        t11.setText("");
                    } else {
                        sudo.matriz[1][1] = Integer.valueOf(t11.getText());
                        error.setText("");
                        con++;
                    }
                }
            }
        } else {
            t11.setText("");
        }
        if (con == 0) {
            sudo.matriz[1][1] = 0;
        }
    }//GEN-LAST:event_t11KeyReleased

    private void t11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t11ActionPerformed

    private void t10KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t10KeyReleased
        // TODO add your handling code here:

        if (sudo.comprobarvalor((t10.getText()))) {
            if (sudo.fila(Integer.valueOf(t10.getText()), 1)) {
                error.setText("el numero " + t10.getText() + " ya esta en la fila");
                t10.setText("");
            } else {
                if (sudo.columna(Integer.valueOf(t10.getText()), 0)) {
                    error.setText("el numero " + t10.getText() + " ya esta en la columna");
                    t10.setText("");
                } else {

                    if (sudo.caja(Integer.valueOf(t10.getText()), 1, 0)) {
                        error.setText("el numero " + t10.getText() + " ya esta en la caja");
                        t10.setText("");
                    } else {
                        sudo.matriz[1][0] = Integer.valueOf(t10.getText());
                        error.setText("");
                        con++;
                    }
                }
            }
        } else {
            t10.setText("");
        }
        if (con == 0) {
            sudo.matriz[1][0] = 0;
        }
    }//GEN-LAST:event_t10KeyReleased

    private void t10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t10ActionPerformed

    private void t08KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t08KeyReleased
        // TODO add your handling code here:

        if (sudo.comprobarvalor((t08.getText()))) {
            if (sudo.fila(Integer.valueOf(t08.getText()), 0)) {
                error.setText("el numero " + t08.getText() + " ya esta en la fila");
                t08.setText("");
            } else {
                if (sudo.columna(Integer.valueOf(t08.getText()), 8)) {
                    error.setText("el numero " + t08.getText() + " ya esta en la columna");
                    t08.setText("");
                } else {

                    if (sudo.caja(Integer.valueOf(t08.getText()), 0, 8)) {
                        error.setText("el numero " + t08.getText() + " ya esta en la caja");
                        t08.setText("");
                    } else {
                        sudo.matriz[0][8] = Integer.valueOf(t08.getText());
                        error.setText("");
                        con++;
                    }
                }
            }
        } else {
            t08.setText("");
        }
        if (con == 0) {
            sudo.matriz[0][8] = 0;
        }
    }//GEN-LAST:event_t08KeyReleased

    private void t05KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t05KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_t05KeyReleased

    private void t57KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t57KeyReleased
        // TODO add your handling code here:

        if (sudo.comprobarvalor((t57.getText()))) {
            if (sudo.fila(Integer.valueOf(t57.getText()), 5)) {
                error.setText("el numero " + t57.getText() + " ya esta en la fila");
                t57.setText("");
            } else {
                if (sudo.columna(Integer.valueOf(t57.getText()), 7)) {
                    error.setText("el numero " + t57.getText() + " ya esta en la columna");
                    t57.setText("");
                } else {

                    if (sudo.caja(Integer.valueOf(t57.getText()), 5, 7)) {
                        error.setText("el numero " + t57.getText() + " ya esta en la caja");
                        t57.setText("");
                    } else {
                        sudo.matriz[5][7] = Integer.valueOf(t57.getText());
                        error.setText("");
                        con++;
                    }
                }
            }
        } else {
            t57.setText("");
        }
        if (con == 0) {
            sudo.matriz[5][7] = 0;
        }
    }//GEN-LAST:event_t57KeyReleased

    private void t45KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t45KeyReleased
        // TODO add your handling code here:

        if (sudo.comprobarvalor((t45.getText()))) {
            if (sudo.fila(Integer.valueOf(t45.getText()), 4)) {
                error.setText("el numero " + t45.getText() + " ya esta en la fila");
                t45.setText("");
            } else {
                if (sudo.columna(Integer.valueOf(t45.getText()), 5)) {
                    error.setText("el numero " + t45.getText() + " ya esta en la columna");
                    t45.setText("");
                } else {

                    if (sudo.caja(Integer.valueOf(t45.getText()), 4, 5)) {
                        error.setText("el numero " + t45.getText() + " ya esta en la caja");
                        t45.setText("");
                    } else {
                        sudo.matriz[4][5] = Integer.valueOf(t45.getText());
                        error.setText("");
                        con++;
                    }
                }
            }
        } else {
            t45.setText("");
        }
        if (con == 0) {
            sudo.matriz[4][5] = 0;
        }
    }//GEN-LAST:event_t45KeyReleased

    private void t15KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t15KeyReleased
        // TODO add your handling code here:

        if (sudo.comprobarvalor((t15.getText()))) {
            if (sudo.fila(Integer.valueOf(t15.getText()), 1)) {
                error.setText("el numero " + t15.getText() + " ya esta en la fila");
                t15.setText("");
            } else {
                if (sudo.columna(Integer.valueOf(t15.getText()), 5)) {
                    error.setText("el numero " + t15.getText() + " ya esta en la columna");
                    t15.setText("");
                } else {

                    if (sudo.caja(Integer.valueOf(t15.getText()), 1, 5)) {
                        error.setText("el numero " + t15.getText() + " ya esta en la caja");
                        t15.setText("");
                    } else {
                        sudo.matriz[1][5] = Integer.valueOf(t15.getText());
                        error.setText("");
                        con++;
                    }
                }
            }
        } else {
            t15.setText("");
        }
        if (con == 0) {
            sudo.matriz[1][5] = 0;
        }
    }//GEN-LAST:event_t15KeyReleased

    private void t48KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t48KeyReleased
        // TODO add your handling code here:

        if (sudo.comprobarvalor((t48.getText()))) {
            if (sudo.fila(Integer.valueOf(t48.getText()), 4)) {
                error.setText("el numero " + t48.getText() + " ya esta en la fila");
                t48.setText("");
            } else {
                if (sudo.columna(Integer.valueOf(t48.getText()), 8)) {
                    error.setText("el numero " + t48.getText() + " ya esta en la columna");
                    t48.setText("");
                } else {

                    if (sudo.caja(Integer.valueOf(t48.getText()), 4, 8)) {
                        error.setText("el numero " + t48.getText() + " ya esta en la caja");
                        t48.setText("");
                    } else {
                        sudo.matriz[4][8] = Integer.valueOf(t48.getText());
                        error.setText("");
                        con++;
                    }
                }
            }
        } else {
            t48.setText("");
        }
        if (con == 0) {
            sudo.matriz[4][8] = 0;
        }
    }//GEN-LAST:event_t48KeyReleased

    private void t75KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t75KeyReleased
        // TODO add your handling code here:

        if (sudo.comprobarvalor((t75.getText()))) {
            if (sudo.fila(Integer.valueOf(t75.getText()), 7)) {
                error.setText("el numero " + t75.getText() + " ya esta en la fila");
                t75.setText("");
            } else {
                if (sudo.columna(Integer.valueOf(t75.getText()), 5)) {
                    error.setText("el numero " + t75.getText() + " ya esta en la columna");
                    t75.setText("");
                } else {

                    if (sudo.caja(Integer.valueOf(t75.getText()), 7, 5)) {
                        error.setText("el numero " + t75.getText() + " ya esta en la caja");
                        t75.setText("");
                    } else {
                        sudo.matriz[7][5] = Integer.valueOf(t75.getText());
                        error.setText("");
                        con++;
                    }
                }
            }
        } else {
            t75.setText("");
        }
        if (con == 0) {
            sudo.matriz[7][5] = 0;
        }
    }//GEN-LAST:event_t75KeyReleased

    private void t43KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t43KeyReleased
        // TODO add your handling code here:

        if (sudo.comprobarvalor((t43.getText()))) {
            if (sudo.fila(Integer.valueOf(t43.getText()), 4)) {
                error.setText("el numero " + t43.getText() + " ya esta en la fila");
                t43.setText("");
            } else {
                if (sudo.columna(Integer.valueOf(t43.getText()), 3)) {
                    error.setText("el numero " + t43.getText() + " ya esta en la columna");
                    t43.setText("");
                } else {

                    if (sudo.caja(Integer.valueOf(t43.getText()), 4, 3)) {
                        error.setText("el numero " + t43.getText() + " ya esta en la caja");
                        t43.setText("");
                    } else {
                        sudo.matriz[4][3] = Integer.valueOf(t43.getText());
                        error.setText("");
                        con++;
                    }
                }
            }
        } else {
            t43.setText("");
        }
        if (con == 0) {
            sudo.matriz[4][3] = 0;
        }
    }//GEN-LAST:event_t43KeyReleased

    private void t04KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t04KeyReleased
        // TODO add your handling code here:

        if (sudo.comprobarvalor((t04.getText()))) {
            if (sudo.fila(Integer.valueOf(t04.getText()), 0)) {
                error.setText("el numero " + t04.getText() + " ya esta en la fila");
                t04.setText("");
            } else {
                if (sudo.columna(Integer.valueOf(t04.getText()), 4)) {
                    error.setText("el numero " + t04.getText() + " ya esta en la columna");
                    t04.setText("");
                } else {

                    if (sudo.caja(Integer.valueOf(t04.getText()), 0, 4)) {
                        error.setText("el numero " + t04.getText() + " ya esta en la caja");
                        t04.setText("");
                    } else {
                        sudo.matriz[0][4] = Integer.valueOf(t04.getText());
                        error.setText("");
                        con++;
                    }
                }
            }
        } else {
            t04.setText("");
        }
        if (con == 0) {
            sudo.matriz[0][4] = 0;
        }
    }//GEN-LAST:event_t04KeyReleased

    private void t74KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t74KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_t74KeyReleased

    private void t44KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t44KeyReleased
        // TODO add your handling code here:

        if (sudo.comprobarvalor((t44.getText()))) {
            if (sudo.fila(Integer.valueOf(t44.getText()), 4)) {
                error.setText("el numero " + t44.getText() + " ya esta en la fila");
                t44.setText("");
            } else {
                if (sudo.columna(Integer.valueOf(t44.getText()), 4)) {
                    error.setText("el numero " + t34.getText() + " ya esta en la columna");
                    t44.setText("");
                } else {

                    if (sudo.caja(Integer.valueOf(t44.getText()), 4, 4)) {
                        error.setText("el numero " + t44.getText() + " ya esta en la caja");
                        t44.setText("");
                    } else {
                        sudo.matriz[4][4] = Integer.valueOf(t44.getText());
                        error.setText("");
                        con++;
                    }
                }
            }
        } else {
            t44.setText("");
        }
        if (con == 0) {
            sudo.matriz[4][4] = 0;
        }
    }//GEN-LAST:event_t44KeyReleased

    private void t03KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t03KeyReleased
        // TODO add your handling code here:

        if (sudo.comprobarvalor((t03.getText()))) {
            if (sudo.fila(Integer.valueOf(t03.getText()), 0)) {
                error.setText("el numero " + t03.getText() + " ya esta en la fila");
                t03.setText("");
            } else {
                if (sudo.columna(Integer.valueOf(t03.getText()), 3)) {
                    error.setText("el numero " + t03.getText() + " ya esta en la columna");
                    t03.setText("");
                } else {

                    if (sudo.caja(Integer.valueOf(t03.getText()), 0, 3)) {
                        error.setText("el numero " + t03.getText() + " ya esta en la caja");
                        t03.setText("");
                    } else {
                        sudo.matriz[0][3] = Integer.valueOf(t03.getText());
                        error.setText("");
                        con++;
                    }
                }
            }
        } else {
            t03.setText("");
        }
        if (con == 0) {
            sudo.matriz[0][3] = 0;
        }
    }//GEN-LAST:event_t03KeyReleased

    private void t65KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t65KeyReleased
        // TODO add your handling code here:

        if (sudo.comprobarvalor((t65.getText()))) {
            if (sudo.fila(Integer.valueOf(t65.getText()), 6)) {
                error.setText("el numero " + t65.getText() + " ya esta en la fila");
                t65.setText("");
            } else {
                if (sudo.columna(Integer.valueOf(t65.getText()), 5)) {
                    error.setText("el numero " + t65.getText() + " ya esta en la columna");
                    t65.setText("");
                } else {
                    if (sudo.caja(Integer.valueOf(t65.getText()), 6, 5)) {
                        error.setText("el numero " + t65.getText() + " ya esta en la caja");
                        t65.setText("");
                    } else {
                        sudo.matriz[6][5] = Integer.valueOf(t65.getText());
                        error.setText("");
                        con++;
                    }
                }
            }
        } else {
            t65.setText("");
        }
        if (con == 0) {
            sudo.matriz[6][5] = 0;
        }
    }//GEN-LAST:event_t65KeyReleased

    private void t40KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t40KeyReleased
        // TODO add your handling code here:

        if (sudo.comprobarvalor((t40.getText()))) {
            if (sudo.fila(Integer.valueOf(t40.getText()), 4)) {
                error.setText("el numero " + t40.getText() + " ya esta en la fila");
                t40.setText("");
            } else {
                if (sudo.columna(Integer.valueOf(t40.getText()), 0)) {
                    error.setText("el numero " + t40.getText() + " ya esta en la columna");
                    t40.setText("");
                } else {

                    if (sudo.caja(Integer.valueOf(t40.getText()), 4, 0)) {
                        error.setText("el numero " + t40.getText() + " ya esta en la caja");
                        t40.setText("");
                    } else {
                        sudo.matriz[4][0] = Integer.valueOf(t40.getText());
                        error.setText("");
                        con++;
                    }
                }
            }
        } else {
            t40.setText("");
        }
        if (con == 0) {
            sudo.matriz[4][0] = 0;
        }
    }//GEN-LAST:event_t40KeyReleased

    private void t02KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t02KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_t02KeyReleased

    private void t02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t02ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t02ActionPerformed

    private void t55KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t55KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_t55KeyReleased

    private void t01KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t01KeyReleased
        // TODO add your handling code here:

        if (sudo.comprobarvalor((t01.getText()))) {
            if (sudo.fila(Integer.valueOf(t01.getText()), 0)) {
                error.setText("el numero " + t01.getText() + " ya esta en la fila");
                t01.setText("");

            } else {
                if (sudo.columna(Integer.valueOf(t01.getText()), 1)) {
                    error.setText("el numero " + t01.getText() + " ya esta en la columna");
                    t01.setText("");
                } else {

                    if (sudo.caja(Integer.valueOf(t01.getText()), 0, 1)) {
                        error.setText("el numero " + t01.getText() + " ya esta en la caja");
                        t01.setText("");
                    } else {
                        sudo.matriz[0][1] = Integer.valueOf(t01.getText());
                        error.setText("");
                        con++;
                    }
                }
            }
        } else {
            t01.setText("");
        }
        if (con == 0) {
            sudo.matriz[0][1] = 0;
        }
    }//GEN-LAST:event_t01KeyReleased

    private void t33KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t33KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_t33KeyReleased

    private void t00KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t00KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_t00KeyReleased

    private void t30KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t30KeyReleased
        // TODO add your handling code here:

        if (sudo.comprobarvalor((t30.getText()))) {
            if (sudo.fila(Integer.valueOf(t30.getText()), 3)) {
                error.setText("el numero " + t30.getText() + " ya esta en la fila");
                t30.setText("");
            } else {
                if (sudo.columna(Integer.valueOf(t30.getText()), 0)) {
                    error.setText("el numero " + t30.getText() + " ya esta en la columna");
                    t30.setText("");
                } else {

                    if (sudo.caja(Integer.valueOf(t30.getText()), 3, 0)) {
                        error.setText("el numero " + t30.getText() + " ya esta en la caja");
                        t30.setText("");
                    } else {
                        sudo.matriz[3][0] = Integer.valueOf(t30.getText());
                        error.setText("");
                        con++;
                    }
                }
            }
        } else {
            t30.setText("");
        }
        if (con == 0) {
            sudo.matriz[3][0] = 0;
        }
    }//GEN-LAST:event_t30KeyReleased

    private void t38KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t38KeyReleased
        // TODO add your handling code here:

        if (sudo.comprobarvalor((t38.getText()))) {
            if (sudo.fila(Integer.valueOf(t38.getText()), 3)) {
                error.setText("el numero " + t38.getText() + " ya esta en la fila");
                t38.setText("");
            } else {
                if (sudo.columna(Integer.valueOf(t38.getText()), 8)) {
                    error.setText("el numero " + t38.getText() + " ya esta en la columna");
                    t38.setText("");
                } else {

                    if (sudo.caja(Integer.valueOf(t38.getText()), 3, 8)) {
                        error.setText("el numero " + t38.getText() + " ya esta en la caja");
                        t38.setText("");
                    } else {
                        sudo.matriz[3][8] = Integer.valueOf(t38.getText());
                        error.setText("");
                        con++;
                    }
                }
            }
        } else {
            t38.setText("");
        }
        if (con == 0) {
            sudo.matriz[3][8] = 0;
        }
    }//GEN-LAST:event_t38KeyReleased

    private void t35KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t35KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_t35KeyReleased

    private void t32KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t32KeyReleased
        // TODO add your handling code here:

        if (sudo.comprobarvalor((t32.getText()))) {
            if (sudo.fila(Integer.valueOf(t32.getText()), 3)) {
                error.setText("el numero " + t32.getText() + " ya esta en la fila");
                t32.setText("");
            } else {
                if (sudo.columna(Integer.valueOf(t32.getText()), 2)) {
                    error.setText("el numero " + t32.getText() + " ya esta en la columna");
                    t32.setText("");
                } else {

                    if (sudo.caja(Integer.valueOf(t32.getText()), 3, 2)) {
                        error.setText("el numero " + t32.getText() + " ya esta en la caja");
                        t32.setText("");
                    } else {
                        sudo.matriz[3][2] = Integer.valueOf(t32.getText());
                        error.setText("");
                        con++;
                    }
                }
            }
        } else {
            t32.setText("");
        }
        if (con == 0) {
            sudo.matriz[3][2] = 0;
        }
    }//GEN-LAST:event_t32KeyReleased

    private void t84KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t84KeyReleased
        // TODO add your handling code here:

        if (sudo.comprobarvalor((t84.getText()))) {
            if (sudo.fila(Integer.valueOf(t84.getText()), 8)) {
                error.setText("el numero " + t84.getText() + " ya esta en la fila");
                t84.setText("");
            } else {
                if (sudo.columna(Integer.valueOf(t84.getText()), 4)) {
                    error.setText("el numero " + t84.getText() + " ya esta en la columna");
                    t84.setText("");
                } else {

                    if (sudo.caja(Integer.valueOf(t84.getText()), 8, 4)) {
                        error.setText("el numero " + t84.getText() + " ya esta en la caja");
                        t84.setText("");
                    } else {
                        sudo.matriz[8][4] = Integer.valueOf(t84.getText());
                        error.setText("");
                        con++;
                    }
                }
            }
        } else {
            t84.setText("");
        }
        if (con == 0) {
            sudo.matriz[8][4] = 0;
        }
    }//GEN-LAST:event_t84KeyReleased

    private void t31KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t31KeyReleased
        // TODO add your handling code here:

        if (sudo.comprobarvalor((t31.getText()))) {
            if (sudo.fila(Integer.valueOf(t31.getText()), 3)) {
                error.setText("el numero " + t31.getText() + " ya esta en la fila");
                t31.setText("");
            } else {
                if (sudo.columna(Integer.valueOf(t31.getText()), 1)) {
                    error.setText("el numero " + t31.getText() + " ya esta en la columna");
                    t31.setText("");
                } else {

                    if (sudo.caja(Integer.valueOf(t31.getText()), 3, 1)) {
                        error.setText("el numero " + t31.getText() + " ya esta en la caja");
                        t31.setText("");
                    } else {
                        sudo.matriz[3][1] = Integer.valueOf(t31.getText());
                        error.setText("");
                        con++;
                    }
                }
            }
        } else {
            t31.setText("");
        }
        if (con == 0) {
            sudo.matriz[3][1] = 0;
        }
    }//GEN-LAST:event_t31KeyReleased

    private void t85KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t85KeyReleased
        // TODO add your handling code here:

        if (sudo.comprobarvalor((t85.getText()))) {
            if (sudo.fila(Integer.valueOf(t85.getText()), 8)) {
                error.setText("el numero " + t85.getText() + " ya esta en la fila");
                t85.setText("");
            } else {
                if (sudo.columna(Integer.valueOf(t85.getText()), 5)) {
                    error.setText("el numero " + t85.getText() + " ya esta en la columna");
                    t85.setText("");
                } else {

                    if (sudo.caja(Integer.valueOf(t85.getText()), 8, 5)) {
                        error.setText("el numero " + t85.getText() + " ya esta en la caja");
                        t85.setText("");
                    } else {
                        sudo.matriz[8][5] = Integer.valueOf(t85.getText());
                        error.setText("");
                        con++;
                    }
                }
            }
        } else {
            t85.setText("");
        }
        if (con == 0) {
            sudo.matriz[8][5] = 0;
        }
    }//GEN-LAST:event_t85KeyReleased

    private void t24KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t24KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_t24KeyReleased

    private void t86KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t86KeyReleased

        if (sudo.comprobarvalor((t86.getText()))) {
            if (sudo.fila(Integer.valueOf(t86.getText()), 8)) {
                error.setText("el numero " + t86.getText() + " ya esta en la fila");
                t86.setText("");
            } else {
                if (sudo.columna(Integer.valueOf(t86.getText()), 6)) {
                    error.setText("el numero " + t86.getText() + " ya esta en la columna");
                    t86.setText("");
                } else {

                    if (sudo.caja(Integer.valueOf(t86.getText()), 8, 6)) {
                        error.setText("el numero " + t86.getText() + " ya esta en la caja");
                        t86.setText("");
                    } else {
                        sudo.matriz[8][6] = Integer.valueOf(t86.getText());
                        error.setText("");
                        con++;
                    }
                }
            }
        } else {
            t86.setText("");
        }
        if (con == 0) {
            sudo.matriz[8][6] = 0;
        }
    }//GEN-LAST:event_t86KeyReleased

    private void t80KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t80KeyReleased

        if (sudo.comprobarvalor((t80.getText()))) {
            if (sudo.fila(Integer.valueOf(t80.getText()), 8)) {
                error.setText("el numero " + t80.getText() + " ya esta en la fila");
                t80.setText("");
            } else {
                if (sudo.columna(Integer.valueOf(t80.getText()), 0)) {
                    error.setText("el numero " + t80.getText() + " ya esta en la columna");
                    t80.setText("");
                } else {

                    if (sudo.caja(Integer.valueOf(t80.getText()), 8, 0)) {
                        error.setText("el numero " + t80.getText() + " ya esta en la caja");
                        t80.setText("");
                    } else {
                        sudo.matriz[8][0] = Integer.valueOf(t80.getText());
                        error.setText("");
                        con++;
                    }
                }
            }
        } else {
            t80.setText("");
        }
        if (con == 0) {
            sudo.matriz[8][0] = 0;
        }
    }//GEN-LAST:event_t80KeyReleased

    private void t77KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t77KeyReleased

        if (sudo.comprobarvalor((t77.getText()))) {
            if (sudo.fila(Integer.valueOf(t77.getText()), 7)) {
                error.setText("el numero " + t77.getText() + " ya esta en la fila");
                t77.setText("");
            } else {
                if (sudo.columna(Integer.valueOf(t77.getText()), 7)) {
                    error.setText("el numero " + t77.getText() + " ya esta en la columna");
                    t77.setText("");
                } else {

                    if (sudo.caja(Integer.valueOf(t77.getText()), 7, 7)) {
                        error.setText("el numero " + t77.getText() + " ya esta en la caja");
                        t77.setText("");
                    } else {
                        sudo.matriz[7][7] = Integer.valueOf(t77.getText());
                        error.setText("");
                        con++;
                    }
                }
            }
        } else {
            t77.setText("");
        }
        if (con == 0) {
            sudo.matriz[7][7] = 0;
        }
    }//GEN-LAST:event_t77KeyReleased

    private void t88KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t88KeyReleased

        if (sudo.comprobarvalor((t88.getText()))) {
            if (sudo.fila(Integer.valueOf(t88.getText()), 8)) {
                error.setText("el numero " + t88.getText() + " ya esta en la fila");
                t88.setText("");
            } else {
                if (sudo.columna(Integer.valueOf(t88.getText()), 8)) {
                    error.setText("el numero " + t88.getText() + " ya esta en la columna");
                    t88.setText("");
                } else {

                    if (sudo.caja(Integer.valueOf(t88.getText()), 8, 8)) {
                        error.setText("el numero " + t88.getText() + " ya esta en la caja");
                        t88.setText("");
                    } else {
                        sudo.matriz[8][8] = Integer.valueOf(t88.getText());
                        error.setText("");
                        con++;
                    }
                }
            }
        } else {
            t88.setText("");
        }
        if (con == 0) {
            sudo.matriz[8][8] = 0;
        }
    }//GEN-LAST:event_t88KeyReleased

    private void t73KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t73KeyReleased

        if (sudo.comprobarvalor((t73.getText()))) {
            if (sudo.fila(Integer.valueOf(t73.getText()), 7)) {
                error.setText("el numero " + t73.getText() + " ya esta en la fila");
                t73.setText("");
            } else {
                if (sudo.columna(Integer.valueOf(t73.getText()), 3)) {
                    error.setText("el numero " + t73.getText() + " ya esta en la columna");
                    t73.setText("");
                } else {

                    if (sudo.caja(Integer.valueOf(t73.getText()), 7, 3)) {
                        error.setText("el numero " + t73.getText() + " ya esta en la caja");
                        t73.setText("");
                    } else {
                        sudo.matriz[7][3] = Integer.valueOf(t73.getText());
                        error.setText("");
                        con++;
                    }
                }
            }
        } else {
            t73.setText("");
        }
        if (con == 0) {
            sudo.matriz[7][3] = 0;
        }
    }//GEN-LAST:event_t73KeyReleased

    private void t76KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t76KeyReleased

        if (sudo.comprobarvalor((t76.getText()))) {
            if (sudo.fila(Integer.valueOf(t76.getText()), 7)) {
                error.setText("el numero " + t76.getText() + " ya esta en la fila");
                t76.setText("");
            } else {
                if (sudo.columna(Integer.valueOf(t76.getText()), 6)) {
                    error.setText("el numero " + t76.getText() + " ya esta en la columna");
                    t76.setText("");
                } else {

                    if (sudo.caja(Integer.valueOf(t76.getText()), 7, 6)) {
                        error.setText("el numero " + t76.getText() + " ya esta en la caja");
                        t76.setText("");
                    } else {
                        sudo.matriz[7][6] = Integer.valueOf(t76.getText());
                        error.setText("");
                        con++;
                    }
                }
            }
        } else {
            t76.setText("");
        }
        if (con == 0) {
            sudo.matriz[7][6] = 0;
        }
    }//GEN-LAST:event_t76KeyReleased

    private void t72KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t72KeyReleased

        if (sudo.comprobarvalor((t72.getText()))) {
            if (sudo.fila(Integer.valueOf(t72.getText()), 7)) {
                error.setText("el numero " + t72.getText() + " ya esta en la fila");
                t72.setText("");
            } else {
                if (sudo.columna(Integer.valueOf(t72.getText()), 2)) {
                    error.setText("el numero " + t72.getText() + " ya esta en la columna");
                    t72.setText("");
                } else {

                    if (sudo.caja(Integer.valueOf(t72.getText()), 7, 2)) {
                        error.setText("el numero " + t72.getText() + " ya esta en la caja");
                        t72.setText("");
                    } else {
                        sudo.matriz[7][2] = Integer.valueOf(t72.getText());
                        error.setText("");
                        con++;
                    }
                }
            }
        } else {
            t72.setText("");
        }
        if (con == 0) {
            sudo.matriz[7][2] = 0;
        }
    }//GEN-LAST:event_t72KeyReleased

    private void t71KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t71KeyReleased

        if (sudo.comprobarvalor((t71.getText()))) {
            if (sudo.fila(Integer.valueOf(t71.getText()), 7)) {
                error.setText("el numero " + t71.getText() + " ya esta en la fila");
                t71.setText("");
            } else {
                if (sudo.columna(Integer.valueOf(t71.getText()), 1)) {
                    error.setText("el numero " + t71.getText() + " ya esta en la columna");
                    t71.setText("");
                } else {

                    if (sudo.caja(Integer.valueOf(t71.getText()), 7, 1)) {
                        error.setText("el numero " + t71.getText() + " ya esta en la caja");
                        t71.setText("");
                    } else {
                        sudo.matriz[7][1] = Integer.valueOf(t71.getText());
                        error.setText("");
                        con++;
                    }
                }
            }
        } else {
            t71.setText("");
        }
        if (con == 0) {
            sudo.matriz[7][1] = 0;
        }
    }//GEN-LAST:event_t71KeyReleased

    private void t78KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t78KeyReleased

        if (sudo.comprobarvalor((t78.getText()))) {
            if (sudo.fila(Integer.valueOf(t78.getText()), 7)) {
                error.setText("el numero " + t78.getText() + " ya esta en la fila");
                t78.setText("");
            } else {
                if (sudo.columna(Integer.valueOf(t78.getText()), 8)) {
                    error.setText("el numero " + t78.getText() + " ya esta en la columna");
                    t78.setText("");
                } else {

                    if (sudo.caja(Integer.valueOf(t78.getText()), 7, 8)) {
                        error.setText("el numero " + t78.getText() + " ya esta en la caja");
                        t78.setText("");
                    } else {
                        sudo.matriz[7][8] = Integer.valueOf(t78.getText());
                        error.setText("");
                        con++;
                    }
                }
            }
        } else {
            t78.setText("");
        }
        if (con == 0) {
            sudo.matriz[7][8] = 0;
        }
    }//GEN-LAST:event_t78KeyReleased

    private void t61KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t61KeyReleased

        if (sudo.comprobarvalor((t61.getText()))) {
            if (sudo.fila(Integer.valueOf(t61.getText()), 6)) {
                error.setText("el numero " + t61.getText() + " ya esta en la fila");
                t61.setText("");
            } else {
                if (sudo.columna(Integer.valueOf(t61.getText()), 1)) {
                    error.setText("el numero " + t61.getText() + " ya esta en la columna");
                    t61.setText("");
                } else {

                    if (sudo.caja(Integer.valueOf(t61.getText()), 6, 1)) {
                        error.setText("el numero " + t61.getText() + " ya esta en la caja");
                        t61.setText("");
                    } else {
                        sudo.matriz[6][1] = Integer.valueOf(t61.getText());
                        error.setText("");
                        con++;
                    }
                }
            }
        } else {
            t61.setText("");
        }
        if (con == 0) {
            sudo.matriz[6][1] = 0;
        }
    }//GEN-LAST:event_t61KeyReleased

    private void t34KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t34KeyReleased

        if (sudo.comprobarvalor((t34.getText()))) {
            if (sudo.fila(Integer.valueOf(t34.getText()), 3)) {
                error.setText("el numero " + t34.getText() + " ya esta en la fila");
                t34.setText("");
            } else {
                if (sudo.columna(Integer.valueOf(t34.getText()), 4)) {
                    error.setText("el numero " + t34.getText() + " ya esta en la columna");
                    t34.setText("");
                } else {

                    if (sudo.caja(Integer.valueOf(t34.getText()), 3, 4)) {
                        error.setText("el numero " + t34.getText() + " ya esta en la caja");
                        t34.setText("");
                    } else {
                        sudo.matriz[3][4] = Integer.valueOf(t34.getText());
                        error.setText("");
                        con++;
                    }
                }
            }
        } else {
            t34.setText("");
        }
        if (con == 0) {
            sudo.matriz[3][4] = 0;
        }
    }//GEN-LAST:event_t34KeyReleased

    private void t25KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t25KeyReleased

        if (sudo.comprobarvalor((t25.getText()))) {
            if (sudo.fila(Integer.valueOf(t25.getText()), 2)) {
                error.setText("el numero " + t25.getText() + " ya esta en la fila");
                t25.setText("");
            } else {
                if (sudo.columna(Integer.valueOf(t25.getText()), 5)) {
                    error.setText("el numero " + t25.getText() + " ya esta en la columna");
                    t25.setText("");
                } else {

                    if (sudo.caja(Integer.valueOf(t25.getText()), 2, 5)) {
                        error.setText("el numero " + t25.getText() + " ya esta en la caja");
                        t25.setText("");
                    } else {
                        sudo.matriz[2][5] = Integer.valueOf(t25.getText());
                        error.setText("");
                        con++;
                    }
                }
            }
        } else {
            t25.setText("");
        }
        if (con == 0) {
            sudo.matriz[2][5] = 0;
        }
    }//GEN-LAST:event_t25KeyReleased

    private void t60KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t60KeyReleased

        if (sudo.comprobarvalor((t60.getText()))) {
            if (sudo.fila(Integer.valueOf(t60.getText()), 6)) {
                error.setText("el numero " + t60.getText() + " ya esta en la fila");
                t60.setText("");
            } else {
                if (sudo.columna(Integer.valueOf(t60.getText()), 0)) {
                    error.setText("el numero " + t60.getText() + " ya esta en la columna");
                    t60.setText("");
                } else {

                    if (sudo.caja(Integer.valueOf(t60.getText()), 6, 0)) {
                        error.setText("el numero " + t60.getText() + " ya esta en la caja");
                        t60.setText("");
                    } else {
                        sudo.matriz[6][0] = Integer.valueOf(t60.getText());
                        error.setText("");
                        con++;
                    }
                }
            }
        } else {
            t60.setText("");
        }
        if (con == 0) {
            sudo.matriz[6][0] = 0;
        }
    }//GEN-LAST:event_t60KeyReleased

    private void t28KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t28KeyReleased

        if (sudo.comprobarvalor((t28.getText()))) {
            if (sudo.fila(Integer.valueOf(t28.getText()), 2)) {
                error.setText("el numero " + t28.getText() + " ya esta en la fila");
                t28.setText("");
            } else {
                if (sudo.columna(Integer.valueOf(t28.getText()), 8)) {
                    error.setText("el numero " + t28.getText() + " ya esta en la columna");
                    t28.setText("");
                } else {

                    if (sudo.caja(Integer.valueOf(t28.getText()), 2, 8)) {
                        error.setText("el numero " + t28.getText() + " ya esta en la caja");
                        t28.setText("");
                    } else {
                        sudo.matriz[2][8] = Integer.valueOf(t28.getText());
                        error.setText("");
                        con++;
                    }
                }
            }
        } else {
            t28.setText("");
        }
        if (con == 0) {
            sudo.matriz[2][8] = 0;
        }
    }//GEN-LAST:event_t28KeyReleased

    private void t28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t28ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t28ActionPerformed

    private void t20KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t20KeyReleased

        if (sudo.comprobarvalor((t20.getText()))) {
            if (sudo.fila(Integer.valueOf(t20.getText()), 2)) {
                error.setText("el numero " + t20.getText() + " ya esta en la fila");
                t20.setText("");
                t20.setBackground(new java.awt.Color(250, 0, 0));
            } else {
                if (sudo.columna(Integer.valueOf(t20.getText()), 0)) {
                    error.setText("el numero " + t20.getText() + " ya esta en la columna");
                    t20.setText("");
                    t20.setBackground(new java.awt.Color(250, 0, 0));
                } else {

                    if (sudo.caja(Integer.valueOf(t20.getText()), 2, 0)) {
                        error.setText("el numero " + t20.getText() + " ya esta en la caja");
                        t20.setText("");
                        t20.setBackground(new java.awt.Color(250, 0, 0));
                    } else {
                        sudo.matriz[1][1] = Integer.valueOf(t20.getText());
                        error.setText("");
                        con++;
                    }
                }
            }
        } else {
            t20.setText("");
            t20.setBackground(new java.awt.Color(204, 204, 255));
        }
        if (con == 0) {
            sudo.matriz[2][0] = 0;
        }
    }//GEN-LAST:event_t20KeyReleased

    private void t20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t20ActionPerformed

    private void t27KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t27KeyReleased

        if (sudo.comprobarvalor((t27.getText()))) {
            if (sudo.fila(Integer.valueOf(t27.getText()), 2)) {
                error.setText("el numero " + t27.getText() + " ya esta en la fila");
                t27.setText("");
            } else {
                if (sudo.columna(Integer.valueOf(t27.getText()), 7)) {
                    error.setText("el numero " + t27.getText() + " ya esta en la columna");
                    t27.setText("");
                } else {

                    if (sudo.caja(Integer.valueOf(t27.getText()), 2, 7)) {
                        error.setText("el numero " + t27.getText() + " ya esta en la caja");
                        t27.setText("");
                    } else {
                        sudo.matriz[2][7] = Integer.valueOf(t27.getText());
                        error.setText("");
                        con++;
                    }
                }
            }
        } else {
            t27.setText("");
        }
        if (con == 0) {
            sudo.matriz[2][7] = 0;
        }
    }//GEN-LAST:event_t27KeyReleased

    private void t23KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t23KeyReleased

        if (sudo.comprobarvalor((t23.getText()))) {
            if (sudo.fila(Integer.valueOf(t23.getText()), 2)) {
                error.setText("el numero " + t23.getText() + " ya esta en la fila");
                t23.setText("");
                t23.setBackground(new java.awt.Color(250, 0, 0));
            } else {
                if (sudo.columna(Integer.valueOf(t23.getText()), 3)) {
                    error.setText("el numero " + t23.getText() + " ya esta en la columna");
                    t23.setText("");
                    t23.setBackground(new java.awt.Color(250, 0, 0));
                } else {

                    if (sudo.caja(Integer.valueOf(t23.getText()), 2, 3)) {
                        error.setText("el numero " + t23.getText() + " ya esta en la caja");
                        t23.setText("");
                        t23.setBackground(new java.awt.Color(250, 0, 0));
                    } else {
                        sudo.matriz[2][3] = Integer.valueOf(t23.getText());
                        error.setText("");
                        con++;
                    }
                }
            }
        } else {
            t23.setText("");
            t23.setBackground(new java.awt.Color(204, 204, 255));
        }
        if (con == 0) {
            sudo.matriz[2][3] = 0;
        }
    }//GEN-LAST:event_t23KeyReleased

    private void t17KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t17KeyReleased

        if (sudo.comprobarvalor((t17.getText()))) {
            if (sudo.fila(Integer.valueOf(t17.getText()), 2)) {
                error.setText("el numero " + t17.getText() + " ya esta en la fila");
                t17.setText("");
            } else {
                if (sudo.columna(Integer.valueOf(t17.getText()), 7)) {
                    error.setText("el numero " + t17.getText() + " ya esta en la columna");
                    t17.setText("");
                } else {

                    if (sudo.caja(Integer.valueOf(t17.getText()), 2, 7)) {
                        error.setText("el numero " + t17.getText() + " ya esta en la caja");
                        t17.setText("");
                    } else {
                        sudo.matriz[1][7] = Integer.valueOf(t17.getText());
                        error.setText("");
                        con++;
                    }
                }
            }
        } else {
            t17.setText("");
        }
        if (con == 0) {
            sudo.matriz[2][7] = 0;
        }
    }//GEN-LAST:event_t17KeyReleased

    private void t16KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t16KeyReleased

        if (sudo.comprobarvalor((t16.getText()))) {
            if (sudo.fila(Integer.valueOf(t16.getText()), 1)) {
                error.setText("el numero " + t16.getText() + " ya esta en la fila");
                t16.setText("");
            } else {
                if (sudo.columna(Integer.valueOf(t16.getText()), 6)) {
                    error.setText("el numero " + t16.getText() + " ya esta en la columna");
                    t16.setText("");
                } else {

                    if (sudo.caja(Integer.valueOf(t16.getText()), 1, 6)) {
                        error.setText("el numero " + t16.getText() + " ya esta en la caja");
                        t16.setText("");
                    } else {
                        sudo.matriz[1][6] = Integer.valueOf(t16.getText());
                        error.setText("");
                        con++;
                    }
                }
            }
        } else {
            t16.setText("");
        }
        if (con == 0) {
            sudo.matriz[1][6] = 0;
        }
    }//GEN-LAST:event_t16KeyReleased

    private void pantallainicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pantallainicioActionPerformed
        sudoku1.setVisible(true);
        sudoku3.setVisible(false);
        nombre.setText("");
        cronometro.reiniciarCronometro();
        SudokuDB.mostarJugadores();
    }//GEN-LAST:event_pantallainicioActionPerformed

    private void pausaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pausaActionPerformed
        // TODO add your handling code here:
        if (cronometro.cronometroactivo == true) {
            cronometro.pararCronometro();
        } else if (cronometro.cronometroactivo == false) {
            cronometro.iniciarCronometropause();
        }
    }//GEN-LAST:event_pausaActionPerformed

    private void empezarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empezarActionPerformed
        // TODO add your handling code here:
        if (nombre.getText() != null) {
            sudokudb.add();
            mostrarPanel();
            iniciar();
            cronometro.iniciarCronometro();
        } else {
            iniciar();
        }


    }//GEN-LAST:event_empezarActionPerformed

    private void nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreActionPerformed

    private void escogerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_escogerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_escogerActionPerformed

    private void reglasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reglasActionPerformed
        // TODO add your handling code here:
        cronometro.pararCronometro();
        reglaspanel.setVisible(true);
        sudoku2.setVisible(false);
    }//GEN-LAST:event_reglasActionPerformed

    private void rankedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rankedActionPerformed
        // TODO add your handling code here:
        sudoku1.setVisible(false);
        sudoku3.setVisible(true);
    }//GEN-LAST:event_rankedActionPerformed

    private void finalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finalizarActionPerformed
        if (completo == false) {
            end();
        }


    }//GEN-LAST:event_finalizarActionPerformed

    private void t12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t12ActionPerformed

    private void completarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_completarActionPerformed
        // TODO add your handling code here:
        completar();
    }//GEN-LAST:event_completarActionPerformed

    private void pantallasudokuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pantallasudokuActionPerformed
        // TODO add your handling code here:
        sudoku2.setVisible(true);
        reglaspanel.setVisible(false);
        cronometro.iniciarCronometropause();

    }//GEN-LAST:event_pantallasudokuActionPerformed
    public void mostrarPanel() {
        sudoku2.setVisible(true);
        sudoku1.setVisible(false);

    }

    public void completar() {
        if (completo == false) {
            t01.setText("7");
            t03.setText("3");
            t04.setText("6");
            t08.setText("2");
            t10.setText("2");
            t11.setText("6");
            t12.setText("8");
            t13.setText("1");
            t14.setText("4");
            t15.setText("5");
            t16.setText("9");
            t17.setText("3");
            t20.setText("3");
            t23.setText("7");
            t25.setText("2");
            t27.setText("8");
            t28.setText("6");
            t30.setText("7");
            t31.setText("9");
            t32.setText("1");
            t34.setText("5");
            t38.setText("8");
            t40.setText("6");
            t43.setText("9");
            t44.setText("7");
            t45.setText("3");
            t48.setText("5");
            t50.setText("4");
            t54.setText("8");
            t56.setText("7");
            t57.setText("6");
            t58.setText("9");
            t60.setText("8");
            t61.setText("1");
            t63.setText("6");
            t65.setText("9");
            t68.setText("4");
            t71.setText("2");
            t72.setText("6");
            t73.setText("5");
            t75.setText("4");
            t76.setText("8");
            t77.setText("7");
            t78.setText("3");
            t80.setText("5");
            t84.setText("2");
            t85.setText("7");
            t86.setText("6");
            t88.setText("1");
            completo = true;
        } else if (completo == true) {
            t01.setText("");
            t03.setText("");
            t04.setText("");
            t08.setText("");
            t10.setText("");
            t11.setText("");
            t12.setText("");
            t13.setText("");
            t14.setText("");
            t15.setText("");
            t16.setText("");
            t17.setText("");
            t20.setText("");
            t23.setText("");
            t25.setText("");
            t27.setText("");
            t28.setText("");
            t30.setText("");
            t31.setText("");
            t32.setText("");
            t34.setText("");
            t38.setText("");
            t40.setText("");
            t43.setText("");
            t44.setText("");
            t45.setText("");
            t48.setText("");
            t50.setText("");
            t54.setText("");
            t56.setText("");
            t57.setText("");
            t58.setText("");
            t60.setText("");
            t61.setText("");
            t63.setText("");
            t65.setText("");
            t68.setText("");
            t71.setText("");
            t72.setText("");
            t73.setText("");
            t75.setText("");
            t76.setText("");
            t77.setText("");
            t78.setText("");
            t80.setText("");
            t84.setText("");
            t85.setText("");
            t86.setText("");
            t88.setText("");
            completo = false;
        }
    }

    public boolean comprobarpanel() {
        boolean resultado;
        if (t01.getText().equalsIgnoreCase("7")
                && t03.getText().equalsIgnoreCase("3")
                && t04.getText().equalsIgnoreCase("6")
                && t08.getText().equalsIgnoreCase("2")
                && t10.getText().equalsIgnoreCase("2")
                && t11.getText().equalsIgnoreCase("6")
                && t12.getText().equalsIgnoreCase("8")
                && t13.getText().equalsIgnoreCase("1")
                && t14.getText().equalsIgnoreCase("4")
                && t15.getText().equalsIgnoreCase("5")
                && t16.getText().equalsIgnoreCase("9")
                && t17.getText().equalsIgnoreCase("3")
                && t20.getText().equalsIgnoreCase("3")
                && t23.getText().equalsIgnoreCase("7")
                && t25.getText().equalsIgnoreCase("2")
                && t27.getText().equalsIgnoreCase("8")
                && t28.getText().equalsIgnoreCase("6")
                && t30.getText().equalsIgnoreCase("7")
                && t31.getText().equalsIgnoreCase("9")
                && t32.getText().equalsIgnoreCase("1")
                && t34.getText().equalsIgnoreCase("5")
                && t38.getText().equalsIgnoreCase("8")
                && t40.getText().equalsIgnoreCase("6")
                && t43.getText().equalsIgnoreCase("9")
                && t44.getText().equalsIgnoreCase("7")
                && t45.getText().equalsIgnoreCase("3")
                && t48.getText().equalsIgnoreCase("5")
                && t50.getText().equalsIgnoreCase("4")
                && t54.getText().equalsIgnoreCase("8")
                && t56.getText().equalsIgnoreCase("7")
                && t57.getText().equalsIgnoreCase("6")
                && t58.getText().equalsIgnoreCase("9")
                && t60.getText().equalsIgnoreCase("8")
                && t61.getText().equalsIgnoreCase("1")
                && t63.getText().equalsIgnoreCase("6")
                && t65.getText().equalsIgnoreCase("9")
                && t68.getText().equalsIgnoreCase("4")
                && t71.getText().equalsIgnoreCase("2")
                && t72.getText().equalsIgnoreCase("6")
                && t73.getText().equalsIgnoreCase("5")
                && t75.getText().equalsIgnoreCase("4")
                && t76.getText().equalsIgnoreCase("8")
                && t77.getText().equalsIgnoreCase("7")
                && t78.getText().equalsIgnoreCase("3")
                && t80.getText().equalsIgnoreCase("5")
                && t84.getText().equalsIgnoreCase("2")
                && t85.getText().equalsIgnoreCase("7")
                && t86.getText().equalsIgnoreCase("6")
                && t88.getText().equalsIgnoreCase("1")) {
            t01.setText("");
            t03.setText("");
            t04.setText("");
            t08.setText("");
            t10.setText("");
            t11.setText("");
            t12.setText("");
            t13.setText("");
            t14.setText("");
            t15.setText("");
            t16.setText("");
            t17.setText("");
            t20.setText("");
            t23.setText("");
            t25.setText("");
            t27.setText("");
            t28.setText("");
            t30.setText("");
            t31.setText("");
            t32.setText("");
            t34.setText("");
            t38.setText("");
            t40.setText("");
            t43.setText("");
            t44.setText("");
            t45.setText("");
            t48.setText("");
            t50.setText("");
            t54.setText("");
            t56.setText("");
            t57.setText("");
            t58.setText("");
            t60.setText("");
            t61.setText("");
            t63.setText("");
            t65.setText("");
            t68.setText("");
            t71.setText("");
            t72.setText("");
            t73.setText("");
            t75.setText("");
            t76.setText("");
            t77.setText("");
            t78.setText("");
            t80.setText("");
            t84.setText("");
            t85.setText("");
            t86.setText("");
            t88.setText("");
            resultado = true;
        } else {
            resultado = false;
        }
        return resultado;
    }

    public void end() {
        if (comprobarpanel() == true) {
            sudoku2.setVisible(false);
        }
        sudoku3.setVisible(true);
    }

    private void iniciar() {

        cronometro.run();
        sudo.juego();
        t00.setText(String.valueOf(sudo.matriz[0][0]));
        t00.setEditable(false);
        t02.setText(String.valueOf(sudo.matriz[0][2]));
        t02.setEditable(false);
        t74.setText(String.valueOf(sudo.matriz[7][4]));
        t74.setEditable(false);
        t33.setText(String.valueOf(sudo.matriz[3][3]));
        t33.setEditable(false);
        t55.setText(String.valueOf(sudo.matriz[5][5]));
        t55.setEditable(false);
        t05.setText(String.valueOf(sudo.matriz[0][5]));
        t05.setEditable(false);
        t06.setText(String.valueOf(sudo.matriz[0][6]));
        t06.setEditable(false);
        t07.setText(String.valueOf(sudo.matriz[0][7]));
        t07.setEditable(false);
        t18.setText(String.valueOf(sudo.matriz[1][8]));
        t18.setEditable(false);
        t21.setText(String.valueOf(sudo.matriz[2][1]));
        t21.setEditable(false);
        t22.setText(String.valueOf(sudo.matriz[2][2]));
        t22.setEditable(false);
        t24.setText(String.valueOf(sudo.matriz[2][4]));
        t24.setEditable(false);
        t26.setText(String.valueOf(sudo.matriz[2][6]));
        t26.setEditable(false);
        t35.setText(String.valueOf(sudo.matriz[3][5]));
        t35.setEditable(false);
        t36.setText(String.valueOf(sudo.matriz[3][6]));
        t36.setEditable(false);
        t37.setText(String.valueOf(sudo.matriz[3][7]));
        t37.setEditable(false);
        t41.setText(String.valueOf(sudo.matriz[4][1]));
        t41.setEditable(false);
        t42.setText(String.valueOf(sudo.matriz[4][2]));
        t42.setEditable(false);
        t46.setText(String.valueOf(sudo.matriz[4][6]));
        t46.setEditable(false);
        t47.setText(String.valueOf(sudo.matriz[4][7]));
        t47.setEditable(false);
        t51.setText(String.valueOf(sudo.matriz[5][1]));
        t51.setEditable(false);
        t52.setText(String.valueOf(sudo.matriz[5][2]));
        t52.setEditable(false);
        t53.setText(String.valueOf(sudo.matriz[5][3]));
        t53.setEditable(false);
        t62.setText(String.valueOf(sudo.matriz[6][2]));
        t62.setEditable(false);
        t64.setText(String.valueOf(sudo.matriz[6][4]));
        t64.setEditable(false);
        t66.setText(String.valueOf(sudo.matriz[6][6]));
        t66.setEditable(false);
        t67.setText(String.valueOf(sudo.matriz[6][7]));
        t67.setEditable(false);
        t70.setText(String.valueOf(sudo.matriz[7][0]));
        t70.setEditable(false);
        t81.setText(String.valueOf(sudo.matriz[8][1]));
        t81.setEditable(false);
        t82.setText(String.valueOf(sudo.matriz[8][2]));
        t82.setEditable(false);
        t83.setText(String.valueOf(sudo.matriz[8][3]));
        t83.setEditable(false);
        t87.setText(String.valueOf(sudo.matriz[8][7]));
        t87.setEditable(false);
        image.setIcon(imageIcon);
        imageIcon.setImageObserver(image);
    }

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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new VentanaPrincipal().setVisible(true);

            }
        });

        SudokuDB.conectar();
        SudokuDB.mostarJugadores();

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton completar;
    private javax.swing.JButton empezar;
    private javax.swing.JButton empezar7;
    private javax.swing.JLabel error;
    private javax.swing.JLabel error11;
    public static javax.swing.JComboBox<String> escoger;
    private javax.swing.JLabel escogerlabe;
    private javax.swing.JButton finalizar;
    public static javax.swing.JLabel image;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel2;
    public static javax.swing.JLabel labeltimer;
    private javax.swing.JLabel nombe7;
    private javax.swing.JLabel nombe9;
    public static javax.swing.JTextField nombre;
    private javax.swing.JTextField nombre7;
    private javax.swing.JButton pantallainicio;
    private javax.swing.JButton pausa;
    private javax.swing.JButton ranked;
    public static javax.swing.JLabel ranking;
    private javax.swing.JLabel rankinglabel;
    private javax.swing.JButton reglas;
    private javax.swing.JLabel reglaslabel;
    private javax.swing.JPanel reglaspanel;
    private javax.swing.JPanel sudoku1;
    private javax.swing.JPanel sudoku10;
    private javax.swing.JPanel sudoku2;
    private javax.swing.JPanel sudoku3;
    private javax.swing.JTextField t00;
    private javax.swing.JTextField t01;
    private javax.swing.JTextField t02;
    private javax.swing.JTextField t03;
    private javax.swing.JTextField t04;
    private javax.swing.JTextField t05;
    private javax.swing.JTextField t06;
    private javax.swing.JTextField t07;
    private javax.swing.JTextField t08;
    private javax.swing.JTextField t10;
    private javax.swing.JTextField t11;
    private javax.swing.JTextField t12;
    private javax.swing.JTextField t13;
    private javax.swing.JTextField t14;
    private javax.swing.JTextField t15;
    private javax.swing.JTextField t16;
    private javax.swing.JTextField t17;
    private javax.swing.JTextField t18;
    private javax.swing.JTextField t20;
    private javax.swing.JTextField t21;
    private javax.swing.JTextField t22;
    private javax.swing.JTextField t23;
    private javax.swing.JTextField t24;
    private javax.swing.JTextField t25;
    private javax.swing.JTextField t26;
    private javax.swing.JTextField t27;
    private javax.swing.JTextField t28;
    private javax.swing.JTextField t30;
    private javax.swing.JTextField t31;
    private javax.swing.JTextField t32;
    private javax.swing.JTextField t33;
    private javax.swing.JTextField t34;
    private javax.swing.JTextField t35;
    private javax.swing.JTextField t36;
    private javax.swing.JTextField t37;
    private javax.swing.JTextField t38;
    private javax.swing.JTextField t40;
    private javax.swing.JTextField t41;
    private javax.swing.JTextField t42;
    private javax.swing.JTextField t43;
    private javax.swing.JTextField t44;
    private javax.swing.JTextField t45;
    private javax.swing.JTextField t46;
    private javax.swing.JTextField t47;
    private javax.swing.JTextField t48;
    private javax.swing.JTextField t50;
    private javax.swing.JTextField t51;
    private javax.swing.JTextField t52;
    private javax.swing.JTextField t53;
    private javax.swing.JTextField t54;
    private javax.swing.JTextField t55;
    private javax.swing.JTextField t56;
    private javax.swing.JTextField t57;
    private javax.swing.JTextField t58;
    private javax.swing.JTextField t60;
    private javax.swing.JTextField t61;
    private javax.swing.JTextField t62;
    private javax.swing.JTextField t63;
    private javax.swing.JTextField t64;
    private javax.swing.JTextField t65;
    private javax.swing.JTextField t66;
    private javax.swing.JTextField t67;
    private javax.swing.JTextField t68;
    private javax.swing.JTextField t70;
    private javax.swing.JTextField t71;
    private javax.swing.JTextField t72;
    private javax.swing.JTextField t73;
    private javax.swing.JTextField t74;
    private javax.swing.JTextField t75;
    private javax.swing.JTextField t76;
    private javax.swing.JTextField t77;
    private javax.swing.JTextField t78;
    private javax.swing.JTextField t80;
    private javax.swing.JTextField t81;
    private javax.swing.JTextField t82;
    private javax.swing.JTextField t83;
    private javax.swing.JTextField t84;
    private javax.swing.JTextField t85;
    private javax.swing.JTextField t86;
    private javax.swing.JTextField t87;
    private javax.swing.JTextField t88;
    private javax.swing.JLabel tituloreglas;
    // End of variables declaration//GEN-END:variables
}
