
package wolfbits;


public class Login {
    private User user;
    private String password;
    private double codigoSeguridad;
    // listas de preguntar para recuperar la pass
    
    public Login(User user, String password){
        
        this.user = user;
        this.password = password;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public void validateUser(User user, String password){
        boolean datosIncorrectos = true; //ES UNA VARIABLE TEMPORAL. CON LA IMPLEMENTACION DE LA INTERFAZ GRAFICA, YA NO SERA NECESARIA.
        if (this.getUser().equals(this.user) && this.getPassword().equals(this.password)){
            
            datosIncorrectos = false;
            //PERMITE LA VISIBILIDAD DE LA VENTANA CORRESPONDIENTE
        }
        else{
            datosIncorrectos = true;
            System.out.println("Usuario o Contraseña incorrectos. Ingrese los datos nuevamente.");
        }
    }

    
}
