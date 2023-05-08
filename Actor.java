class Actor {
    private String personaje, categoria, nombre;
    Actor( String personaje, String categoria, String nombre) {
        setPersonaje(personaje);
        setCategoria(categoria);
        setVestimenta(nombre);
    }

     public void setPersonaje(String c) { personaje=c;}
     public void setCategoria(String c) { personaje=n;}
     public void setnombre(String c) { personaje=v;}


    public String getPersonaje() {return personaje;}
    public String getcategoria() {return categoria;}
    public String getnombre(){return nombre;}
    public void mostrarActor(){
        System.out.println("\npersonaje"+getPersonaje()+"\ncategoria"+getcategoria()+"\nnombre"+getnombre ()+);
    }
    public class main Actor(){
        static Scanner entrada = new Scanner(system.in);
        public static void main(String[]) args) {

    
            String personaje, categoria, vestimenta;
            System.out.println("ingresar personaje para actuar: " ) ;
            personaje = entrada.nextLine();
            System.out.println("ingresar categoria [protagonico, principal, secundario");
            categoria = entrada.nextLine();
            System.out.println("ingresa el nombre del actor (formal, semi-formal, infornal]: " ) ;
            nombre = entrada.nextLine();
            actor e = new actor(personaje,categoria,nombre);
            e.mostrarActor();
            
        }
    }
 }