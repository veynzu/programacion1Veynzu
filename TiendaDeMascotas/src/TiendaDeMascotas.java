public class TiendaDeMascotas {
    String Direccion, Correo, NumeroTelefonico;
    int NumeroDeEmpleados;

    TiendaDeMascotas(String Direccion, String Correo, String NumeroTelefonico, int NumeroDeEmpleados){
        this.Direccion = Direccion;
        this.Correo = Correo;
        this.NumeroDeEmpleados = NumeroDeEmpleados;
        this.NumeroTelefonico = NumeroTelefonico;
    }
    public String getDireccion(){/////////////////////////Direccion/////////////////

        return Direccion;
    }
    public void setDireccion(String Direccion){
        this.Direccion = Direccion;
    }
    public String getCorreo(){////////////////////////Correo////////////////////
        return Correo;
    }
    public void setCorreo(String Correo){
        this.Correo = Correo;
    }
    public String getNumeroTelefonico(){///////////////////Numero Telefonico////////////////
        return NumeroTelefonico;
    }
    public void setNumeroTelefonico(String NumeroTelefonico){
        this.NumeroTelefonico = NumeroTelefonico;
    }
    public int getNumeroDeEmpleados(){//////////////////////Numero De Empleados////////////

        return NumeroDeEmpleados;
    }
    public void setNumeroDeEmpleados(int NumeroDeEmpleados){
        this.NumeroDeEmpleados = NumeroDeEmpleados;
    }
}
