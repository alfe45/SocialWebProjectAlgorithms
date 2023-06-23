package DataStructures;

public class MyListGraph {

    private Vertex[] vertexes; //arreglo de vertices
    private int count;
    private MyLinkedStack stack;//para el recorrido dfs
    private MyLinkedQueue queue;//para el recorrido bfs

    public MyListGraph(int n) {
        if (n <= 0) {
            System.exit(0);
        }//if
        count = 0;
        vertexes = new Vertex[n];//el numero maximo de vertices
        stack = new MyLinkedStack();
        queue = new MyLinkedQueue();
    }

    public void cancel() {
        for (int i = 0; i < count; i++) {
            vertexes[i] = null;
        }//for
        count = 0;//preparamos contador para el sgte vertice q se agregue
    }//cancel

    public boolean isEmpty() throws ExceptionGraph {
        return count == 0;
    }//isEmpty

    public int getSize() throws ExceptionGraph {
        if (isEmpty()) {
            throw new ExceptionGraph("el grafo no existe");
        }//if
        return count;
    }//getSize

    public boolean existVertex(Object elemento) throws ExceptionGraph {
        if (isEmpty()) {
            throw new ExceptionGraph("el grafo no existe");
        }//if
        for (int i = 0; i < count; i++) {
            if (vertexes[i].element.equals(elemento)) {
                return true;//encontro el elemento
            }//if
        }//for
        return false;//no encontro elemento
    }//existVertex

    public boolean existEdge(Object v1, Object v2) throws ExceptionGraph {
        if (isEmpty()) {
            throw new ExceptionGraph("no existe grafo en el cual buscar");
        }//if
        if (vertexes[getPosition(v1)].listEdge.exists(v2)) {
            return true;
        }//if
        return false;
    }//existEdge

    public void addVertex(Object elemento) throws ExceptionGraph {
        if (count >= vertexes.length) {
            throw new ExceptionGraph("el grafo esta lleno");
        }//if
        vertexes[count++] = new Vertex(elemento);
    }//addVertex

    public void addEdge(Object v1, Object v2) throws ExceptionGraph {
        if (!existVertex(v1) || !existVertex(v2)) {
            throw new ExceptionGraph("alguno o ninguno de los vetices existe");
        }//if
        vertexes[getPosition(v1)].listEdge.addEnd(v2);
        vertexes[getPosition(v2)].listEdge.addEnd(v1);
    }//addEdge

    public void addWeight(Object v1, Object v2, Object weight) throws ExceptionGraph {
        if (!existVertex(v1) || !existVertex(v2)) {
            throw new ExceptionGraph("alguno o ninguno de los vetices existe");
        }//if
        vertexes[getPosition(v1)].listEdge.addEnd(v2);
        vertexes[getPosition(v2)].listEdge.addEnd(v1);
        vertexes[getPosition(v1)].listWeight.addEnd(weight);
        vertexes[getPosition(v2)].listWeight.addEnd(weight);
    }//addWeight

    public String dfs() throws ExceptionGraph {
        String info = " ";
        vertexes[0].visited = true;
        info = showVextex(0) + " ";
        stack.push(0);

        while (!stack.isEmpty()) {
            int v = VerticeAdyacenteNoVisitado(Integer.parseInt(stack.top().toString()));
            if (v == -1) //if,
            {
                stack.pop();
            } else { // if
                vertexes[v].visited = true;
                info += showVextex(v) + " ";
                stack.push(v);
            }//else
        }//while
        for (int j = 0; j < count; j++) // reset flags
        {
            vertexes[j].visited = false;
        }

        resetVisited();
        return info;
    }//dfs

    public String bfs() throws ExceptionGraph {
        String info = " ";
        vertexes[0].visited = true;
        info = showVextex(0) + " ";
        queue.insert(0);
        int v2;
        while (!queue.isEmpty()) {
            int v1 = Integer.parseInt(queue.delete().toString());

            while ((v2 = VerticeAdyacenteNoVisitado(v1)) != -1) {
                vertexes[v2].visited = true;
                info += showVextex(v2) + " ";
                queue.insert(v2);
            } //while
        } //while
        for (int j = 0; j < count; j++) {
            vertexes[j].visited = false;
        }

        resetVisited();
        return info;
    }//bfs

    public Object getElement(int position) {
        for (int i = 0; i < count; i++) {
            if (i == position) {
                return vertexes[i].element;
            }//if
        }//for
        return -1;//significa que el vertice no existe
    }//getElement

    public String toString() {

        String salida = "";

        for (int i = 0; i < count; i++) {
            salida += "El soldado en la posición " + i + " es " + vertexes[i].element + " y está enlazado con el soldado " + vertexes[i].listEdge.toString();
            if (i < count - 1) {
                salida += "\n";
            }
        }//

        return salida;
    }//fin to String

    //Metodos privados auxiliares
    private void resetVisited() {
        for (int i = 0; i < count; i++) {
            vertexes[i].visited = false;
        }//for
    }//resetVisited

    private int getPosition(Object element) {
        for (int i = 0; i < count; i++) {
            if (vertexes[i].element.equals(element)) {
                return i;
            }//if
        }//for
        return -1;//significa que el vertice no existe
    }//getPosition

    private int VerticeAdyacenteNoVisitado(int v) throws ExceptionGraph {
        for (int j = 0; j < count; j++) {
            if (vertexes[j].listEdge.exists(showVextex(v)) && vertexes[j].visited == false) {
                return j;//retorna el indice
            }//if
        }//for
        return -1;
    }//VerticeAdyacenteNoVisitado

    private Object showVextex(int position) throws ExceptionGraph {
        if (position < 0 || position == count) {
            throw new ExceptionGraph("No existe el vertice en el grafo");
        }//if
        return vertexes[position].element.toString();
    }//showVextex

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
