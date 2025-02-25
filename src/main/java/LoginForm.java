import com.formdev.flatlaf.FlatDarculaLaf;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

public class LoginForm extends JFrame{
    private JPanel panelPrincipal;
    private JTextField usuarioTexto;
    private JPasswordField passwordTexto;
    private JButton enviarBoton;

    private final Map<String, String> credenciales;

    public LoginForm(){
        //Inicializar credenciales
        credenciales = new HashMap<>();
        credenciales.put("César", "Walker");
        credenciales.put("Leandro", "machine");
        credenciales.put("Dana", "bailar");

        inicializarForma();
        enviarBoton.addActionListener(e -> validar());
    }

    private void inicializarForma(){
        setContentPane(panelPrincipal);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(700, 500);
        setLocationRelativeTo(null);
    }

    private void validar(){
        var usuario = this.usuarioTexto.getText();
        var password = new String(this.passwordTexto.getPassword());

        //Verificar credenciales
        if (credenciales.containsKey(usuario) && credenciales.get(usuario).equals(password)){
            mostrarMensaje("Datos correctos, Bienvenido " + usuario + "!");
        } else {
            mostrarMensaje("Usuario o contraseña incorrectos");
        }
    }

    private void mostrarMensaje(String mensaje){
        JOptionPane.showMessageDialog(this, mensaje);
    }

    public static void main(String[] args) {
        FlatDarculaLaf.setup();
        LoginForm loginForm = new LoginForm();
        loginForm.setVisible(true);
    }

}
