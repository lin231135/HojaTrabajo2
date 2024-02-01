import java.util.Vector;

public class Stack<T> implements CalculadoraInterface {
    
    private Vector<T> elementos;

    public Stack() {
        elementos = new Vector<T>();
    }

    public void push(T elemento) {
        elementos.add(elemento);
    }

    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("La pila está vacía");
        }
        return elementos.remove(elementos.size() - 1);
    }

    public boolean isEmpty() {
        return elementos.isEmpty();
    }

    public int size(){
        return elementos.size();
    }

    @Override
    public int calcular(String expresion) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'calcular'");
    }
}