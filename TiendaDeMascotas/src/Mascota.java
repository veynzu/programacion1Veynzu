public class Mascota {
    String Estado,Especie,Raza,Codigo;
    int edad;
    
    Mascota(String Codigo, int edad,String Estado, String Especie, String Raza){

        this.Codigo= Codigo;
        this.edad = edad;
        this.Estado = Estado;
        this.Especie = Especie;
        this.Raza = Raza;
    }
    public String getRaza(){////////////////////////RAZA//////////////////

        return Raza;
    }
    public void setRaza(String Raza){

        this.Raza = Raza;
    }
    public String getEstado(){//////////////////////Estado(adoptado o a la venta)////////////

    return Estado; 
    }
    public void setEstado(String Estado){

        this.Estado = Estado;

    }
    public String getEspecie(){////////////////////Especie//////////////////////////////

        return Especie;
    }
    public void setEspecie(String Especie){

        this.Especie = Especie;
    }
    public String getCodigo(){///////////////////////Codigo////////////////////////
        return Codigo;

    }
    public void setCodigo(String Codigo){

        this.Codigo = Codigo;
    }
    public int getedad(){/////////////////////////////edad///////////////

        return edad;
    }
    public void setedad(int edad){

        this.edad = edad;
    }
}
