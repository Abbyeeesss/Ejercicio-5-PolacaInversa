import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InterfazGUI {
    private JPanel PolacaInv;
    private JTextField OperacionTxt;
    private JTextArea ResultTxt;
    private JButton calcularButton;

    public PilaOperaciones polInv = new PilaOperaciones();

    public InterfazGUI() {
        calcularButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String input = OperacionTxt.getText();
                try{
                    polInv.calcularPolacaInversa(input, ResultTxt);
                }catch (Exception ex){
                    JOptionPane.showMessageDialog(null, "Ingrese una operacion valida");
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Polaca Inversa");
        frame.setContentPane(new InterfazGUI().PolacaInv);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
