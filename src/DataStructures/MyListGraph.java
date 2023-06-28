package DataStructures;

import java.util.ArrayList;

public class MyListGraph {

    private ArrayList<Vertex> vertexes;

    public MyListGraph() {
        this.vertexes = new ArrayList<>();
    }

    public void reset() {
        this.vertexes = new ArrayList<>();
    }

    public boolean isEmpty() {
        return this.vertexes.size() == 0;
    }

    public int getSize() throws ExceptionGraph {
        return this.vertexes.size();
    }

    public boolean existVertex(Object element) throws ExceptionGraph {
        for (int i = 0; i < this.vertexes.size(); i++) {
            if (this.vertexes.get(i).element.equals(element)) {
                return true;
            }
        }
        return false;
    }

    public boolean existEdge(Object v1, Object v2) {
        if (this.isEmpty()) {//valido que la lista no este vacia
            throw new ExceptionGraph("El grafo esta vacio");
        }

        if (existVertex(v1) && existVertex(v2)) {
            if (this.vertexes.get(this.getPosicion(v1)).listEdge.exists(v2) && this.vertexes.get(this.getPosicion(v2)).listEdge.exists(v1)) {
                return true;
            }
        } else {
            if (!existVertex(v1)) {
                throw new ExceptionGraph("El vertice " + v1 + " no existe");
            } else {
                throw new ExceptionGraph("El vertice " + v2 + " no existe");
            }
        }

        return false;
    }

    
    public void addVertex(Object element) {
        this.vertexes.add(new Vertex(element));
    }

    
    public void addEdge(Object v1, Object v2) throws ExceptionGraph {

        if (this.isEmpty()) {//valido que la lista no este vacia
            throw new ExceptionGraph("El grafo esta vacio");
        }

        if (!existVertex(v1)) {// valido que el vertice exista
            throw new ExceptionGraph("No existe el vertice " + v1);
        }

        if (!existVertex(v2)) {// valido que el vertice exista
            throw new ExceptionGraph("No existe el vertice " + v2);
        }

        //aca lo que dice es deme la lista de vertices de esta clase, deme la posicion en la que se encuentra ese vertice,
        // deme la listaCircularDoblementeEnlazada de aristas y agregue al final el v2 (esto para que tengan la conexion) 
        this.vertexes.get(this.getPosicion(v1)).listEdge.addEnd(v2);
        this.vertexes.get(this.getPosicion(v2)).listEdge.addEnd(v1);//lo mismo con este (y asi seria un Grafo no dirigido)

    }

    
    public void addWeight(Object v1, Object v2, Object peso) throws ExceptionGraph {

        if (this.isEmpty()) {
            throw new ExceptionGraph("Grafo vacio");
        }

        if (!existEdge(v1, v2)) {
            throw new ExceptionGraph("No existe Arista");
        }

        this.vertexes.get(this.getPosicion(v1)).listWeight.addEnd(peso);
        this.vertexes.get(this.getPosicion(v2)).listWeight.addEnd(peso);
    }

    //metodo auxiliar solo para usarlo dentro de esta clase, no lo puedo instanciar fuera de esta clase
    private int getPosicion(Object element) throws ExceptionGraph {
        for (int i = 0; i < this.vertexes.size(); i++) {
            if (this.vertexes.get(i).element.equals(element)) {
                return i;
            }
        }
        return -1;//significa que el vertice no existe
    }

    public String toStringVertices() {
        String salida = "";
        for (int i = 0; i < this.vertexes.size(); i++) {
            salida += "El vertice en la posicion " + i + " es: " + this.vertexes.get(i).element + "\n";
        }
        return salida;
    }

    public String toStringAristas() {

        String s = "\n";
        for (Vertex v : this.vertexes) {
            s += v.element + " --------> ";
            for (int i = 0; i < v.listEdge.getSize(); i++) {
                if (i + 1 == v.listEdge.getSize()) {
                    s += v.listEdge.getByPosition(i) + "\n";
                } else {
                    s += v.listEdge.getByPosition(i) + ", ";
                } // if
            } // for
        } // for
        return s + "\n";

    }

    public String toStringPeso() {

        String s = "";
        for (Vertex v : this.vertexes) {
            s += v.element + " tiene los pesos: ";
            for (int i = 0; i < v.listWeight.getSize(); i++) {
                if (i + 1 == v.listWeight.getSize()) {
                    s += v.listWeight.getByPosition(i) + "\n";
                } else {
                    s += v.listWeight.getByPosition(i) + ", ";
                } // if
            } // for
        } // for
        return s;

    }

    //toString completo (CON TODOS A LA VEZ)
    public String toString() {//vertices, aristas y pesos (todo en uno mismo)

        String salida = "\nInformacion del grafo\n\n";

        for (int i = 0; i < this.vertexes.size(); i++) {
            salida += "El vertice en la posicion " + i + " es: " + this.vertexes.get(i).element + "\n";
            salida += "Sus Aristas son: " + vertexes.get(i).listEdge.toString() + "\n";
            salida += "Sus Pesos son: " + vertexes.get(i).listWeight.toString() + "\n\n";
        }

        return salida;
    }

    public class ExceptionGraph extends RuntimeException {

        public ExceptionGraph(String err) {
            super(err);
        }

    }//class

    class Vertex {

        public Object element; //elemento almacenado en el vertice
        public boolean visited;//se utiliza en los metodos de recorrido por el grafo 
        public MyCicularDoublyLinkedList listEdge; //llevo el control de las aristas existentes
        public MyCicularDoublyLinkedList listWeight; //llevo el control de los pesos existentes

        public Vertex(Object element) {
            this.element = element;
            this.visited = false;
            listEdge = new MyCicularDoublyLinkedList();
            listWeight = new MyCicularDoublyLinkedList();
        }

    }//class

}//class
