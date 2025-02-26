Se utiliza un HashMap para almacenar las credenciales.
Se captura el usuario y la contraseña mediante Scanner.
Se verifica si el usuario existe en el Map y si la contraseña coincide.
Se muestra un mensaje dependiendo del resultado de la validación.

Mapa de credenciales: Se agregó un Map<String, String> para almacenar usuarios y contraseñas.
Carga de credenciales en el constructor: Se inicializa el Map con algunos usuarios de ejemplo.
Validación en validar(): Se compara la entrada del usuario con los valores del Map.
Mostrar mensaje: Se mantiene el JOptionPane para mostrar si la autenticación fue exitosa o fallida.

Agegando conceptos
**Java Swing es una librería de Java para crear aplicaciones gráficas GUI (Graphical User Interface)
o también conocidas como aplicaciones de escritorio. Podemos aplicar el patrón de diseño MVC (Modelo-Vista-Controlador).
Vista (Formulario con los componentes Visuales de nuestra aplicación), 
Modelo (Clases de Dominio del Problema de nuestra aplicación) y Controlador 
(con la Clase Java va a hacer nuestra funcionalidad de la aplicación) y vamos a intercomunicarlos.**
**El componente principal es JFrame que es un marco que podemos agregar todo tipo de componentes, 
dentro del mismo podemos agregar un JPanel (Panel) y dentro de este podemos agregar otros componentes, 
JButton, JTextFieldName, JPasswordField, etc.**
**
import javax.swing.*;

public class Forma extends JFrame{
    private JPanel panel1;

    public Forma(){
        inicializarForma();
    }

    private void inicializarForma(){
        setContentPane(panel1); //componente pane para agregar más elementos, para visualizar el formulario
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Método que cierra ventana cuando cerramos aplicación
        //se utiliza clase JFrame y la constante EXIT_ON_CLOSE
        //Indicar el tamaño de nuestra ventana, usamos el método setSize
        setSize(600, 400); //ancho 600px, alto 400px
        setLocationRelativeTo(null); //Centramos la ventana
    }

    public static void main(String[] args) {
        //creamos objeto
        Forma forma = new Forma();
        forma.setVisible(true);
    }
}
**
**
<!--Librería para agregar modo oscuro (dark) entre otros-->
<dependencies>
    <dependency>
        <groupId>com.formdev</groupId>
        <artifactId>flatlaf</artifactId>
        <version>3.0</version>
    </dependency>
</dependencies>
**
# Modo oscuro (Dracula)- Modo claro (Light)
**laf = Look and Feel (apariencia)
clase Flat y método setup para cambiar la apariencia
modo oscuro Ej: FlatDarculaLaf.setup();
modo claro Ej: FlatLightLaf.setup();**
**
public LoginForm(){
    inicializarForma();
    enviarBoton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            
        }
    });
}
**Se está sobrescribiendo el método actionPerformed, recibiendo el elemento que se
está ejecutando en este momento ActionEvent e. Lo importante es la llamada al método.**
**enviarBoton.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
    }
});
Expresión Lambda Ej: enviarBoton.addActionListener(e -> validar()); //método validar**

