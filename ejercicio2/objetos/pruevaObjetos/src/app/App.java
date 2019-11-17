package app;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello Java");
        Cliente cliente1= new Cliente();
        cliente1.setNombre("Ian");
        cliente1.setApellido("Garcia");
        cliente1.setId(1);
        System.out.println("El nombre del cliente es "+cliente1.getNombre()+" y su apellido es "+cliente1.getApellido()+" con ID: "+cliente1.getid());
    }
}