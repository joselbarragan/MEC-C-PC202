import java.util.ArrayList;
class Farmacia{
    static ArrayList<String> listNomb;
    static ArrayList<Farmacia> listFmc;
    String nombre;
    String direccion;
    String telefono ;
    ArrayList<Cita> citas;

    public Farmacia(String nombre, String direccion, String telefono){
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono= telefono;
    }
    
    public static void gestionFarmacias(){
        if (listNomb == null){
            listNomb = new ArrayList<String>();
        } 
        String nombreFmc = Lectura.nextString("Nombre farmacia: ");
        String nombreCorto = nombreFmc.toLowerCase().replace(" ","");
        if (listNomb.contains(nombreCorto)){
            System.out.println("Farmacia ya existe!!");
            crud(nombreFmc);
        }else{
            System.out.println("farmacia nueva!");
            listNomb.add(nombreCorto);
            nuevaFarmacia(nombreCorto);
        } 
    }
    
    public static void crud(String drogueria){
        int sel = Lectura.nextInt("\n1. Consultar 2. Modificar 3. Borrar\n"
        + " ==> ");
        switch(sel){
            case 1: break;
            case 2: break;
            case 3: break;
        }
    }
    public static void nuevaFarmacia(String nombre){
        String dir = Lectura.nextString("\nDireccion: ");
        String tel = Lectura.nextString("\nTelefono: ");
        Farmacia objfarmacia; 
        objfarmacia = new Farmacia(nombre,dir,tel);
        
        listFmc.add(objfarmacia);
    }
    
}