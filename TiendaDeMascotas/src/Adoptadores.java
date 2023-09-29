public class Adoptadores {
    String Nombre,NumeroContacto,CorreoPersona, FechaAdopcion;

    Adoptadores(String Nombre, String NumeroContacto, String CorreoPersona, String FechaAdopcion){
        this.Nombre = Nombre;
        this.NumeroContacto = NumeroContacto;
        this.CorreoPersona = CorreoPersona;
        this.FechaAdopcion = FechaAdopcion;
    }
    public String getNombre(){////////////////////////////////////Nombre////////////////////////////////////

        return Nombre;
    }
    public void setNombre(String Nombre){

        this.Nombre = Nombre;
    }
    public String getNumeroContacto(){////////////////////////NumeroContacto/////////////////////////
    return NumeroContacto;
    }
    
    public void setNumeroContacto(String NumeroContacto){
        this.NumeroContacto = NumeroContacto;
    }
    public String getCorreoPersona(){/////////////////CorreoPErsona///////////////////
        return CorreoPersona;
    }
    public void setCorreoPersona(String CorreoPersona){
        this.CorreoPersona = CorreoPersona;
    }
    public String getFechaAdopcion(){////////////////////FEcha ADopcion//////////////////////
        return FechaAdopcion;
    }
    public void setFechaAdopcion(String FechaAdopcion){
        this.FechaAdopcion = FechaAdopcion;
    }
}

