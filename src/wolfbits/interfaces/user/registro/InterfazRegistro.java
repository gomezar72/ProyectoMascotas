package wolfbits.interfaces.user.registro;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class InterfazRegistro extends JFrame implements ActionListener {

    private final String ACC_REGISTRAR = "MostrarDatCliente";
    private final String ACC_DAT_USER = "MostrarDatosUsuario";//acciones de los eventos
    private final String ACC_SALIR_APP = "salirDeApp";

    private int ANCHO = 1000;
    private int ALTO = 600;
    private String TITULO = "                                                                                       REGISTRO"; //titulo del frame

    private final String[] ListProvincia = {"Buenos Aires                 ", "CABA", "Santa Fe", "Cordoba", "Mendoza", "Salta", "Santiago del Estero", "Catamarca",
        "Chaco", "Chubut", "Corrientes", "Entre Ríos", "Formosa", "Jujuy", "La Pampa", "Misiones", "Neuquén", "Río Negro",
        "San Juan", "Santa Cruz", "Tierra del Fuego", "Tucumán"};

    private GridLayout layGrid;     //flow layout filas columnas
    private int filLayGrid = 3;
    private int colLayGrid = 6;

    //Paneles
    private JPanel pnlDatos;
    private JPanel pnlDireccion;//nombres de los Jpanel
    private JPanel pnlAcciones;

    //Bordes
    private BorderFactory bordePnlDatos;
    private BorderFactory bordePnlDireccion;//nombres de los Bordes 
    private BorderFactory bordePnlAcciones;

    private String tituloBordePnlDatos = "INGRESE SUS DATOS PERSONALES";
    private String tituloBordePnlVendedor = "INGRESE SUS DATOS DE DOMICILIO";//Titulo bordes
    private String tituloBordePnlAcciones = "CONFRIRMAR";

    private JLabel lblName;
    private JLabel lblSurname;
    private JLabel lblEmail; //labels Usuario
    private JLabel lblNickName;
    private JLabel lblPassword;
    private JLabel lblPhone;

    private JTextField txtName;
    private JTextField txtSurname;//txtField del Usuario
    private JTextField txtEmail;
    private JTextField txtNickName;
    private JTextField txtPassword;
    private JTextField txtPhone;

    private JLabel lblStreet;
    private JLabel lblNomenclature;//labels direccion
    private JLabel lblFloor;
    private JLabel lblCity;
    private JLabel lblProvince;
    private JLabel lbladditionalInformation;

    private JTextField txtStreet;
    private JTextField txtNomenclature;
    private JTextField txtFloor;//txtfield de direccion
    private JTextField txtCity;
    private JTextField txtProvince;
    private JTextField txtAddInfo;

    private String lblNameText = " Nombre: ";
    private String lblSurnameText = "Apellido: ";
    private String lblEmailText = "     E-Mail:";
    private String lblNickNameText = " Usuario: ";
    private String lblPasswordText = "Contraseña: ";
    private String lblPhoneText = "Telefono: ";
    private String lblStreetText = "Calle: ";
    private String lblNomenclatureText = "Altura/Nro: ";
    private String lblFloorText = "Departamento: ";
    private String lblCityText = "              Ciudad: ";
    private String lblProvinceText = "Provincia: ";
    private String lblAddInfoText = "Informacion Adicional: ";

    private JComboBox cbxProvince;//combo provincias

    private JCheckBox checkOng;//checkbox
    private JTextField txtPetCapacity;
    private JLabel lblOng;
    private JLabel lblCapacity;
    private JLabel lblQuantity;
    private String lblOngText = "Soy ONG";
    private String lblCapacityText = "                                  Puede albergar mascotas?";
    private String lblQuantityText = "                                   Cuantas mascotas puede albergar (en numeros)?";
    private JRadioButton radButtonSi;
    private JRadioButton radButtonNo;
    private ButtonGroup grupoBotones;
    private JButton btnDataUser;
    private JButton btnRegister;//nombre de los botones
    private JButton btnExit;
    private String btnDataUserText = "Confirmar";
    private String btnRegisterText = "Registrarse";
    private String btnExitText = "Salir";

    public InterfazRegistro() {
        this.inicializarVentana();
        this.inicializarComponentes();
        this.agregarComponentes();
        this.agregarAccionComponente();
    }

    public void Ver() {
        this.setVisible(true);
    }

    public void inicializarVentana() {

        layGrid = new GridLayout(filLayGrid, colLayGrid);//inic el gridlayout

        this.setTitle(TITULO);
        this.setSize(ANCHO, ALTO);
        this.setLocationRelativeTo(null);
        this.setLayout(layGrid);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setIconImage(new ImageIcon(getClass().getResource("../Registro/patita.png")).getImage());

    }

    public void inicializarComponentes() {

        pnlDatos = new JPanel();//inicializa los 3 paneles
        pnlDireccion = new JPanel();
        pnlAcciones = new JPanel();

        lblName = new JLabel();
        lblSurname = new JLabel(); //inic los labels usuario
        lblEmail = new JLabel();
        lblNickName = new JLabel();
        lblPassword = new JLabel();
        lblPhone = new JLabel();

        lblStreet = new JLabel();
        lblNomenclature = new JLabel(); //inic los labels direccion
        lblFloor = new JLabel();
        lblCity = new JLabel();
        lblProvince = new JLabel();
        lbladditionalInformation = new JLabel();

        cbxProvince = new JComboBox(); //inicializa el combobox

        //txt para usuario
        txtName = new JTextField(20);
        txtSurname = new JTextField(20);//inic los textfields usuario
        txtEmail = new JTextField(20);
        txtNickName = new JTextField(20);
        txtPassword = new JTextField(18);
        txtPhone = new JTextField(20);

        //txt para direccion
        txtStreet = new JTextField(30);
        txtNomenclature = new JTextField(6);
        txtFloor = new JTextField(5);//inic los textfields de direccion
        txtCity = new JTextField(25);
        txtProvince = new JTextField(10);
        txtAddInfo = new JTextField(60);
        //txtAddInfo.setBounds(10, 650, 120, 25);

        lblOng = new JLabel();
        lblCapacity = new JLabel();
        lblQuantity = new JLabel();
        txtPetCapacity = new JTextField(5);

        checkOng = new JCheckBox();
        radButtonSi = new JRadioButton("  SI  ");
        radButtonNo = new JRadioButton("  NO  ");
        grupoBotones = new ButtonGroup();
        btnDataUser = new JButton();
        btnRegister = new JButton();//inicios 3 botones
        btnExit = new JButton();

        this.pnlDatos.setBorder(bordePnlDatos.createTitledBorder(tituloBordePnlDatos));//crea 3 bordes con
        this.pnlDireccion.setBorder(bordePnlDireccion.createTitledBorder(tituloBordePnlVendedor));//sus titulos
        this.pnlAcciones.setBorder(bordePnlAcciones.createTitledBorder(tituloBordePnlAcciones));

        this.lblName.setText(this.lblNameText);
        this.lblName.setForeground(java.awt.Color.MAGENTA.darker().darker());
        this.lblName.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 25));
        this.lblSurname.setText(this.lblSurnameText);
        this.lblSurname.setForeground(java.awt.Color.MAGENTA.darker().darker());
        this.lblSurname.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 25));
        this.lblEmail.setText(this.lblEmailText);//titulos de los labels
        this.lblEmail.setForeground(java.awt.Color.MAGENTA.darker().darker());
        this.lblEmail.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 25));
        this.lblNickName.setText(this.lblNickNameText);
        this.lblNickName.setForeground(java.awt.Color.MAGENTA.darker().darker());
        this.lblNickName.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 25));
        this.lblPassword.setText(this.lblPasswordText);
        this.lblPassword.setForeground(java.awt.Color.MAGENTA.darker().darker());
        this.lblPassword.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 25));
        this.lblPhone.setText(this.lblPhoneText);
        this.lblPhone.setForeground(java.awt.Color.MAGENTA.darker().darker());
        this.lblPhone.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 25));
        this.lblStreet.setText(this.lblStreetText);
        this.lblStreet.setForeground(java.awt.Color.black.brighter());
        this.lblStreet.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 25));
        this.lblNomenclature.setText(this.lblNomenclatureText);
        this.lblNomenclature.setForeground(java.awt.Color.black.brighter());
        this.lblNomenclature.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 25));
        this.lblFloor.setText(this.lblFloorText);
        this.lblFloor.setForeground(java.awt.Color.black.brighter());
        this.lblFloor.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 25));
        this.lblCity.setText(this.lblCityText);
        this.lblCity.setForeground(java.awt.Color.black.brighter());
        this.lblCity.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 25));
        this.lblProvince.setText(this.lblProvinceText);
        this.lblProvince.setForeground(java.awt.Color.black.brighter());
        this.lblProvince.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 25));
        this.lbladditionalInformation.setText(this.lblAddInfoText);
        this.lbladditionalInformation.setForeground(java.awt.Color.black.brighter());
        this.lbladditionalInformation.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 25));

        for (String provincia : ListProvincia)//agrega las provincias al combobox
        {
            this.cbxProvince.addItem(provincia);
        }
        this.cbxProvince.setFont(new Font(Font.SANS_SERIF, Font.ITALIC, 18));

        this.btnDataUser.setText(this.btnDataUserText);
        this.btnDataUser.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 25));
        this.btnRegister.setText(this.btnRegisterText);
        this.btnRegister.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 25));
//        ImageIcon registrar = new ImageIcon("registro2.png");
//        this.btnRegister.setIcon(new ImageIcon(registrar.getImage().getScaledInstance(30,10,Image.SCALE_SMOOTH)));
        this.btnExit.setText(this.btnExitText);
        this.btnExit.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 25));
        this.pnlDatos.setBackground(java.awt.Color.lightGray);
        this.pnlDireccion.setBackground(java.awt.Color.lightGray);
        this.pnlAcciones.setBackground(java.awt.Color.lightGray);
        this.txtName.setOpaque(true);
        this.txtName.setEditable(true);
        this.txtName.setSize(10, 18);
        this.txtName.setBackground(Color.white);
        this.txtName.setForeground(Color.black);
        this.txtName.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 20));
        this.txtSurname.setOpaque(true);
        this.txtSurname.setEditable(true);
        this.txtSurname.setSize(10, 20);
        this.txtSurname.setBackground(Color.white);
        this.txtSurname.setForeground(Color.black);
        this.txtSurname.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 20));
        this.txtEmail.setOpaque(true);
        this.txtEmail.setEditable(true);
        this.txtEmail.setSize(12, 20);
        this.txtEmail.setBackground(Color.white);
        this.txtEmail.setForeground(Color.black);
        this.txtEmail.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 20));
        this.txtNickName.setOpaque(true);
        this.txtNickName.setEditable(true);
        this.txtNickName.setSize(10, 20);
        this.txtNickName.setBackground(Color.white);
        this.txtNickName.setForeground(Color.black);
        this.txtNickName.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 20));
        this.txtPhone.setOpaque(true);
        this.txtPhone.setEditable(true);
        this.txtPhone.setSize(10, 20);
        this.txtPhone.setBackground(Color.white);
        this.txtPhone.setForeground(Color.black);
        this.txtPhone.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 20));
        this.txtPassword.setOpaque(true);
        this.txtPassword.setEditable(true);
        this.txtPassword.setSize(10, 20);
        this.txtPassword.setBackground(Color.white);
        this.txtPassword.setForeground(Color.black);
        this.txtPassword.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 20));
        this.txtStreet.setOpaque(true);
        this.txtStreet.setEditable(true);
        this.txtStreet.setSize(10, 18);
        this.txtStreet.setBackground(Color.white);
        this.txtStreet.setForeground(Color.black);
        this.txtStreet.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 20));
        this.txtNomenclature.setOpaque(true);
        this.txtNomenclature.setEditable(true);
        this.txtNomenclature.setSize(10, 18);
        this.txtNomenclature.setBackground(Color.white);
        this.txtNomenclature.setForeground(Color.black);
        this.txtNomenclature.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 20));
        this.txtFloor.setOpaque(true);
        this.txtFloor.setEditable(true);
        this.txtFloor.setSize(10, 18);
        this.txtFloor.setBackground(Color.white);
        this.txtFloor.setForeground(Color.black);
        this.txtFloor.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 20));
        this.txtCity.setOpaque(true);
        this.txtCity.setEditable(true);
        this.txtCity.setSize(10, 18);
        this.txtCity.setBackground(Color.white);
        this.txtCity.setForeground(Color.black);
        this.txtCity.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 20));
        this.txtAddInfo.setOpaque(true);
        this.txtAddInfo.setEditable(true);
        this.txtAddInfo.setSize(10, 18);
        this.txtAddInfo.setBackground(Color.white);
        this.txtAddInfo.setForeground(Color.black);
        this.txtAddInfo.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 20));
        this.txtPetCapacity.setOpaque(true);
        this.txtPetCapacity.setEditable(true);
        this.txtPetCapacity.setSize(10, 18);
        this.txtPetCapacity.setBackground(Color.white);
        this.txtPetCapacity.setForeground(Color.black);
        this.txtPetCapacity.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 20));
        this.lblOng.setText(this.lblOngText);
        this.lblOng.setForeground(java.awt.Color.BLUE.darker());
        this.lblOng.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 25));
        this.lblCapacity.setText(this.lblCapacityText);
        this.lblCapacity.setForeground(java.awt.Color.BLUE.darker());
        this.lblCapacity.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 25));
        this.lblQuantity.setText(this.lblQuantityText);
        this.lblQuantity.setForeground(java.awt.Color.BLUE.darker());
        this.lblQuantity.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 25));
        this.radButtonSi.setFont(new Font("Copper Black", Font.BOLD, 15));
        this.radButtonNo.setFont(new Font("Copper Black", Font.BOLD, 15));

    }

    public void agregarComponentes() {

        this.add(this.pnlDatos);//agrega el panel 1 al frame
        this.add(this.pnlDireccion);//agrega el panel 2 al frame
        this.add(this.pnlAcciones);//agrega el panel 3 al frame

        this.pnlDatos.add(this.lblName);//agrega los labels y los textfield
        this.pnlDatos.add(this.txtName);// a los paneles
        this.pnlDatos.add(this.lblSurname);
        this.pnlDatos.add(this.txtSurname);
        this.pnlDatos.add(this.lblEmail);
        this.pnlDatos.add(this.txtEmail);
        this.pnlDatos.add(this.lblPhone);
        this.pnlDatos.add(this.txtPhone);
        this.pnlDatos.add(this.lblNickName);
        this.pnlDatos.add(this.txtNickName);
        this.pnlDatos.add(this.lblPassword);
        this.pnlDatos.add(this.txtPassword);

        this.pnlDireccion.add(this.lblStreet);
        this.pnlDireccion.add(this.txtStreet);
        this.pnlDireccion.add(this.lblNomenclature);
        this.pnlDireccion.add(this.txtNomenclature);
        this.pnlDireccion.add(this.lblFloor);
        this.pnlDireccion.add(this.txtFloor);
        this.pnlDireccion.add(this.lblCity);
        this.pnlDireccion.add(this.txtCity);
        this.pnlDireccion.add(this.lblProvince);
        this.pnlDireccion.add(this.cbxProvince);
        //this.pnlDireccion.add(this.lbladditionalInformation);
        //this.pnlDireccion.add(this.txtAddInfo);

        this.pnlAcciones.add(this.lblOng);
        this.pnlAcciones.add(this.checkOng);
        this.pnlAcciones.add(this.lblCapacity);
        this.grupoBotones.add(this.radButtonSi);
        this.grupoBotones.add(this.radButtonNo);
        this.pnlAcciones.add(this.radButtonSi);
        this.pnlAcciones.add(this.radButtonNo);
        this.pnlAcciones.add(this.lblQuantity);
        this.pnlAcciones.add(this.txtPetCapacity);
        this.pnlAcciones.add(this.btnDataUser);
        this.pnlAcciones.add(this.btnRegister);
        this.pnlAcciones.add(this.btnExit);

    }

    public void agregarAccionComponente() {
        this.btnDataUser.addActionListener(this);
        this.btnRegister.addActionListener(this);//agrega los listeners
        this.btnExit.addActionListener(this);
        this.checkOng.addActionListener(this);
        this.radButtonNo.addActionListener(this);
        this.radButtonSi.addActionListener(this);

        this.btnDataUser.setActionCommand(ACC_DAT_USER);
        this.btnRegister.setActionCommand(ACC_REGISTRAR); //acciones de los botones
        this.btnExit.setActionCommand(ACC_SALIR_APP);
    }

    public void confirmarDatos() {
        String name = this.txtName.getText();
        String surname = this.txtSurname.getText(); // muestra los datos cliente
        String mail = this.txtEmail.getText();
        String pass = this.txtPassword.getText();
        String nick = this.txtNickName.getText();
        String phone = this.txtPhone.getText();
        String street = this.txtStreet.getText();
        String number = this.txtNomenclature.getText();
        String floor = this.txtFloor.getText();//muestra los datos del vendedor
        String city = this.txtCity.getText();
        String province = (String) this.cbxProvince.getSelectedItem();
        String info = this.txtAddInfo.getText();

        JOptionPane.showMessageDialog(null, "Nombre: " + name + "\nApellido: " + surname + "\nE-mail: " + mail + "\nPassword: " + pass + "\nNickName: " + nick + "\nTelefono: " + phone + "Calle: " + street + "\n Numero: " + number + "\n Piso: " + floor + "\n Ciudad: " + city + "\n Provincia: " + province + "\nInfo Adicional:" + info, "CONFIRMACION DE DATOS", JOptionPane.INFORMATION_MESSAGE);

    }

    public void Registrarse() {

        JOptionPane.showMessageDialog(null, "Gracias por registrarse", "REGISTRO COMPLETO", JOptionPane.INFORMATION_MESSAGE); //new Icon ("src:imagenes\logo") 
    }

    public void cerrarApp() {
        this.setVisible(false);
        this.dispose();
        System.exit(0);
    }

    public void controlAction(ActionEvent e) {
        String comando = e.getActionCommand();
        if (comando.equals(ACC_DAT_USER)) {
            this.confirmarDatos();
        } else if (comando.equals(ACC_REGISTRAR))//control de los eventos
        {
            this.Registrarse();
        } else if (comando.equals(ACC_SALIR_APP)) {
            this.cerrarApp();
        }
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        this.controlAction(ae);
    }
}
