package DataStructures;

public class MyBinarySearchTree{

    BinaryNode root;// representa la entrada al arbol;

    public MyBinarySearchTree() {
        root = null;
    }

    public void cancel() {
        root = null;
    }//cancel

    public boolean isEmpty() {
        return root == null;
    }//isEmpty

    public int getSize() throws ExceptionTree {
        if (isEmpty()) {
            throw new ExceptionTree("El arbolBinarioDeBusqueda no existe");
        }//if
        return getSize(root);
    }//getSize

    public boolean exists(Object element) throws ExceptionTree {
        if (isEmpty()) {
            throw new ExceptionTree("El arbolBinarioDeBusqueda no existe");
        }//if
        return binarySearch(root, element);
    }//exists

    public void insert(Object element) throws ExceptionTree {
        root = insert(root, element);
    }//insert

    public void delete(Object element) throws ExceptionTree {
        if (isEmpty()) {
            throw new ExceptionTree("El arbolBinarioDeBusqueda no existe");
        }//if
        root = delete(root, element);
    }//delete

    public int nodeHeight(Object element) throws ExceptionTree {
        if (isEmpty()) {
            throw new ExceptionTree("El arbolBinarioDeBusqueda no existe");
        }//if
        BinaryNode aux = root;
        while (aux != null) {
            if (aux.element == element) {
                return treeHeight(aux);
            }//if
            if (compare(element, aux.element) < 0) {
                aux = aux.left;
            } else if (compare(element, aux.element) > 0) {
                aux = aux.right;
            }//if
        }//while
        return -1;//significa que no esta....
    }//nodeHeight

    public int treeHeight() throws ExceptionTree {
        if (isEmpty()) {
            throw new ExceptionTree("El arbolBinarioDeBusqueda no existe");
        }//if
        return treeHeight(root);
    }//treeHeight

    public Object min() throws ExceptionTree {
        if (isEmpty()) {
            throw new ExceptionTree("El arbolBinarioDeBusqueda no existe");
        }//if
        return min(root);
    }//min

    public Object max() throws ExceptionTree {
        if (isEmpty()) {
            throw new ExceptionTree("El arbolBinarioDeBusqueda no existe");
        }//if
        return max(root);
    }//max

    @Override
    public String toString() {
        if (isEmpty()) {
            throw new ExceptionTree("El arbol no existe ");
        }//if
        String result = "";
        //result += "PreOrden: " + preOrden(root) + "\n";
        //result += "inOrden: " + inOrden(root) + "\n";
        result += "" + postOrden(root);
        return result;
    }//toString

    //---------------------------------------------------------------
    //METODOS PRIVADOS QUE REQUIERO PARA EL MANEJO DE LA RECURSIVIDAD
    //---------------------------------------------------------------
    private BinaryNode insert(BinaryNode nodo, Object elemento) {
        if (nodo == null) {
            nodo = new BinaryNode(elemento);
        } else if (compare(elemento, nodo.element) < 0) {
            nodo.left = insert(nodo.left, elemento);
        } else if (compare(elemento, nodo.element) > 0) {
            nodo.right = insert(nodo.right, elemento);
        }//if
        return nodo;//el arbol modificado
    }//insert

    private int compare(Object elemento1, Object elemento2) {
        if (elemento1 instanceof Integer && elemento2 instanceof Integer) { //Solamente enteros
            if ((Integer) elemento1 < (Integer) elemento2) {
                return -1;
            }//if
            if ((Integer) elemento1 > (Integer) elemento2) {
                return 1;
            }//if
        }//instancia de entero
        if (elemento1 instanceof String && elemento2 instanceof String) {
            if (elemento1.toString().compareToIgnoreCase(elemento2.toString()) < 0) {
                return -1;
            }//if
            if (elemento1.toString().compareToIgnoreCase(elemento2.toString()) > 0) {
                return 1;
            }//if
        }//instancia de String
        return 0;//significa que el elemento1 == elemento2
    }//compare

    private BinaryNode delete(BinaryNode nodo, Object elemento) {
        if (nodo != null) {
            if (elemento.equals(nodo.element)) {//lo encontramos
                //caso1: es un nodo sin hijos
                if (nodo.left == null && nodo.right == null) {
                    return nodo = null;
                } //caso2: el nodo solo tiene un hijo, puede ser izq o der
                else if (nodo.left != null && nodo.right == null) {
                    return nodo = nodo.left;
                } else if (nodo.right != null && nodo.left == null) {
                    return nodo = nodo.right;
                } //caso 3 el ndo tiene 2 hijos
                else if (nodo.left != null && nodo.right != null) {
                    //se debe obterner el elemento mas
                    Object hijoMenorSubArbolDerecho = min(nodo.right);
                    //cambiamos el nodo raiz con el elemeto obtenido
                    nodo.element = hijoMenorSubArbolDerecho;
                    nodo.right = delete(nodo.right, hijoMenorSubArbolDerecho);
                }//if
            }//if
            if (compare(elemento, nodo.element) < 0) {
                nodo.left = delete(nodo.left, elemento);
            } else {
                nodo.right = delete(nodo.right, elemento);
            }//if
        }//if
        return nodo;
    }//delete

    private Object min(BinaryNode nodo) {
        if (nodo.left != null) {
            return min(nodo.left);
        } else {
            return nodo.element;
        }//if
    }//min

    private Object max(BinaryNode nodo) {
        if (nodo.right != null) {
            return max(nodo.right);
        } else {
            return nodo.element;
        }//if
    }//max

    private boolean binarySearch(BinaryNode nodo, Object elemento) {
        if (nodo == null) {
            return false;//el elemento no existe
        } else if (elemento.equals(nodo.element)) {
            return true;//lo encontro
        } else if (compare(elemento, nodo.element) < 0) {
            return binarySearch(nodo.left, elemento);
        } else {
            return binarySearch(nodo.right, elemento);
        }//if
    }//binarySearch

    private int getSize(BinaryNode nodo) {
        if (nodo == null) {
            return 0;
        } else {
            return 1 + getSize(nodo.left) + getSize(nodo.right);
        }//if
    }//getSize

    private int treeHeight(BinaryNode nodo) {
        if (nodo == null) {
            return 0;
        } else {
            return 1 + Math.max(treeHeight(nodo.left), treeHeight(nodo.right));
        }//if
    }//alturaArbol

    private String preOrden(BinaryNode nodo) {
        String result = "";
        if (nodo != null) {
            result = nodo.element + " ";
            result += preOrden(nodo.left);
            result += preOrden(nodo.right);
        }//if
        return result;
    }//preOrden

    private String postOrden(BinaryNode nodo) {
        String result = "";
        if (nodo != null) {
            result = postOrden(nodo.left);
            result += postOrden(nodo.right);
            result += nodo.element + " ";
        }//if
        return result;
    }//postOrden

    private String inOrden(BinaryNode nodo) {
        String result = "";
        if (nodo != null) {
            result = inOrden(nodo.left);
            result += nodo.element + " ";
            result += inOrden(nodo.right);
        }//if
        return result;
    }//inOrden

    class BinaryNode {

        Object element;
        BinaryNode left;
        BinaryNode right;

        public BinaryNode(Object element) {
            this.element = element;
            this.left = this.right = null;
        }

    }//class

    class ExceptionTree extends RuntimeException {

        public ExceptionTree(String err) {
        }

    }//class

//    public interface Tree {
//
//        //elimina todo el Arbol
//        public void cancel();
//
//        //true si el arbol esta vacio
//        public boolean isEmpty();
//
//        //Los métodos internos son para la recursividad
//        //devuelve el numero de nodos que tiene el arbol
//        //private int getSize(NodoBinario) Se encarga de la recursividad
//        public int getSize() throws ExceptionTree;
//
//        //true si el elemento indicado forma parte del Arbol
//        //private boolean binarySearch(NodoBinario,Object elemento)
//        public boolean exists(Object element) throws ExceptionTree;
//
//        //inserta el elemento en el arbol
//        //private NodoBinario insertar(NodoBinario nodo,Onject elemento)
//        public void insert(Object element) throws ExceptionTree;
//
//        //suprime el elemento indicado del arbol. Este proceso aplica a 3 casos
//        //1. El nodo a suprimir no tiene hijos
//        //2. EL nodo a suprimir solo tiene un hijo
//        //3. El nodo a suprimir tiene 2 hijos
//        //private NodoBinario delete(NodoBinario nodo raiz,Object elemento)
//        public void delete(Object element) throws ExceptionTree;
//
//        //devuelve el numero de ancestros para aun nodo dado
//        //profundidad de un nodo
//        //private int nodeHeight(NodoBinario nodo seria raiz, Object elemento)
//        public int nodeHeight(Object element) throws ExceptionTree;
//
//        //devuelve la altura maxima(profundidad maxima)
//        //de la raiz a una hoa del arbol
//        //metodo interno:
//        //private int treeHeight(NodoBinario nodo recibe la raiz)
//        public int treeHeight() throws ExceptionTree;
//
//        //devuelve el valor minimo contenido en el arbol
//        //metodo interno
//        //private int min(NodoBinario nodo)
//        public Object min() throws ExceptionTree;
//
//        //devuelve el valor maximo contenido en el arbol
//        //metodo interno:
//        //private int max(NodoBinario nodo)
//        public Object max() throws ExceptionTree;
//
//        //muestra todos los elementos existentes en el arbol de las siguientes maneras
//        //preOrden: recorre el arbol de la forma: raiz-izq-der
//        //inOrden: recorre el arbol de la forma: izq-raiz-der
//        //postOrden: recorre el arbol de la forma: izq-der-nodo
//        //private String preOrden(NodoBinario nodo)
//        //private String inOrden(NodoBinario nodo)
//        //private String postOrden(NodoBinario nodo)
//    }//interface

}//class
