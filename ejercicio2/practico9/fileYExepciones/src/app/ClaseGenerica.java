package app;

import java.util.ArrayList;
import java.util.Iterator;

public class ClaseGenerica<T> implements Iterable {
    private ArrayList<T> lista= new ArrayList<T>();

    public void mostrarArray() {
        for (int i = 0; i < lista.size(); i++) {
            lista.get(i);
        }
        
    }
    public void add(T objeto) {
        
    }
        
        
    @Override
    public Iterator<T> iterator() {
        // TODO Auto-generated method stub
        return lista.iterator();
    }

}