
    import javax.swing.*;
    import java.awt.*;
    import java.awt.event.*;
    import java.util.Random;

     class Main extends JFrame {
        String[] pieces = {"Камень", "Ножницы", "Бумага"};
        Random random = new Random();
        JButton btnK = new JButton(pieces[0]);
        JButton btnN = new JButton(pieces[1]);
        JButton btnB = new JButton(pieces[2]);
        JLabel lbl = new JLabel("нажать кнопку");

        Main() {
            setTitle("FinalLessonApp");
            setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            setSize(300, 300);
            setResizable(false);
            JPanel p1 = new JPanel(new GridLayout(1, 3));
            p1.setSize(300, 100);
            JPanel p2 = new JPanel();
            p2.setSize(300, 200);
            p2.setBackground(new Color(165, 165, 165));
            p1.add(btnK);
            p1.add(btnN);
            p1.add(btnB);
            lbl.setForeground(new Color(255, 255, 255));
            add(p1);

            JPanel bp = new JPanel();
            bp.setLayout(new GridLayout());
            bp.setBackground(new Color(78, 77, 77));
            bp.add(lbl, CENTER_ALIGNMENT);
            setLayout(new BorderLayout());
            add(bp, BorderLayout.CENTER);

            btnK.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String cpu = pieces[random.nextInt(3)];
                    String player = pieces[0];
                    checkWin(player, cpu);
                    btnB.repaint();
                    btnK.repaint();
                    btnN.repaint();
                }
            });

            btnN.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String cpu = pieces[random.nextInt(3)];
                    String player = pieces[1];
                    checkWin(player, cpu);
                    btnB.repaint();
                    btnK.repaint();
                    btnN.repaint();
                }
            });

            btnB.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String cpu = pieces[random.nextInt(3)];
                    String player = pieces[2];
                    checkWin(player, cpu);
                    btnB.repaint();
                    btnK.repaint();
                    btnN.repaint();
                }
            });

            setLocationRelativeTo(null);
            setVisible(true);
        }

        void checkWin(String player, String cpu) {
            if (player.equals(cpu)){
                lbl.setText(player + " VS " + cpu + ". Ничья!");
                int a = JOptionPane.showConfirmDialog(null, "Ничья! Сыграем ещё?", "Result", JOptionPane.YES_NO_OPTION);
                if (a == JOptionPane.NO_OPTION) System.exit(0);
            }

            if (player.equals(pieces[0])) {
                if (cpu.equals(pieces[1])) {
                    lbl.setText(player + " VS " + cpu + ". Вы выграли!");
                    int a = JOptionPane.showConfirmDialog(null, "Вы выграли! Сыграем ещё?", "Result", JOptionPane.YES_NO_OPTION);
                    if (a == JOptionPane.NO_OPTION) System.exit(0);
                }
                if (cpu.equals(pieces[2])) {
                    lbl.setText(player + " VS " + cpu + ". Вы проиграли!");
                    int a = JOptionPane.showConfirmDialog(null, "Вы проиграли! Сыграем ещё?", "Result", JOptionPane.YES_NO_OPTION);
                    if (a == JOptionPane.NO_OPTION) System.exit(0);
                }
            }

            if (player.equals(pieces[1])) {
                if (cpu.equals(pieces[0])) {
                    lbl.setText(player + " VS " + cpu + ". Вы проиграли!");
                    int a = JOptionPane.showConfirmDialog(null, "Вы проиграли! Сыграем ешё?", "Result", JOptionPane.YES_NO_OPTION);
                    if (a == JOptionPane.NO_OPTION) System.exit(0);
                }
                if (cpu.equals(pieces[2])) {
                    lbl.setText(player + " VS " + cpu + ". Вы выграли!");
                    int a = JOptionPane.showConfirmDialog(null, "Вы выграли! Сыграем ещё?", "Result", JOptionPane.YES_NO_OPTION);
                    if (a == JOptionPane.NO_OPTION) System.exit(0);
                }
            }

            if (player.equals(pieces[2])) {
                if (cpu.equals(pieces[0])) {
                    lbl.setText(player + " VS " + cpu + ". Вы выграли!");
                    int a = JOptionPane.showConfirmDialog(null, "Вы выграли! Сыграем ещё?", "Result", JOptionPane.YES_NO_OPTION);
                    if (a == JOptionPane.NO_OPTION) System.exit(0);
                }
                if (cpu.equals(pieces[1])) {
                    lbl.setText(player + " VS " + cpu + ". Вы проиграли!");
                    int a = JOptionPane.showConfirmDialog(null, "Вы проиграли! Сыграем ещё?", "Result", JOptionPane.YES_NO_OPTION);
                    if (a == JOptionPane.NO_OPTION) {
                        System.exit (0);
                    }
                }
            }
        }

        public static void main(String[] args) {
            new Main();
        }
    }





