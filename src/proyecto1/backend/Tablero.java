package proyecto1.backend;

import java.awt.GridLayout;
import static java.lang.Integer.parseInt;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Tablero  {

    JButton[][] bMatriz;
    JPanel panel;
    JLabel texto;
    
    public Tablero(){
    
  
    }
    

    public int sizematriz() {

        int size = parseInt(JOptionPane.showInputDialog(null,
                "ingrese tamanyo",JOptionPane.QUESTION_MESSAGE));

        return size;
    }

    public JPanel getPanel() {

        int size = sizematriz();
        panel = new JPanel();
        bMatriz = new JButton[size][size];

        panel.setBounds(100, 100, 300, 300);
        int numrandom = (int) (Math.random() * 10);
        panel.setLayout(new GridLayout(size, size));

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                bMatriz[i][j] = new JButton(String.valueOf(numrandom));
                panel.add(bMatriz[i][j]);
            }

        }
        return this.panel;
    }

    public JLabel getTexto() {

        texto = new JLabel("Matriz");
        texto.setBounds(10, 10, 70, 70);

        return texto;
    }


}
