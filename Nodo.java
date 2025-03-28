public class Nodo {
    String Nombre;
    String Condicion;
    char Prioridad;
    Nodo izquierda, derecha;


    public Nodo(String Nombre, String Condicion, char Prioridad){
        this.Nombre = Nombre;
        this.Condicion = Condicion;
        this.Prioridad = Prioridad;
        this.izquierda = null;
        this.derecha = null;
    }

}
