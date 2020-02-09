import java.util.Arrays;

public class Terna<T> {


    private T[] array;
    private T elemento1;
    private T elemento2;
    private T elemento3;




    public T getElemento(int posicion)throws  ArrayIndexOutOfBoundsException{
        T t;
        if(posicion<3&&posicion>=0){
            t=array[posicion];
        }else{
            throw new ArrayIndexOutOfBoundsException();
        }
        return t;
    }


    public Terna(T uno, T dos, T tres) {

        array= (T[]) Arrays.copyOf(new Object[3], 3);
        this.array[0]=uno;
        elemento1=uno;
        this.array[1]=dos;
        elemento2=dos;
        this.array[2]=tres;
        elemento3=tres;

    }
    public Terna(){
        Object[] obj=new Object[3];
        array= (T[])obj;
        elemento1=this.array[0]=null;
        elemento2=this.array[1]=null;
        elemento3=this.array[2]=null;
    }

    @Override
    public String toString() {

        return "Terna: "+elemento1+", "+elemento2+", "+elemento3+".";
    }
}
