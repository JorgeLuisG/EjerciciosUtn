package app;



public class MenuTurnos{
    private int turno=MenuJugadores.getCantidadDeJugadores();
    private Jugador[] jugadores= MenuJugadores.getJugadores();
    private MenuCategorias[] menues=new MenuCategorias[turno];
    private void crearMenuesTurnos() {
        for (int i = 0; i < jugadores.length; i++) {
            MenuCategorias menuCategorias=new MenuCategorias( jugadores[i]);
            menues[i]=menuCategorias;
        }
    }
    public void administrarJugadores(){
        crearMenuesTurnos();
        while (!categoriasCompletadas()) {
            for (int i = 0; i < menues.length; i++) {
                System.out.println("Turno "+jugadores[i].getNombre());
                menues[i].mostrarCategorias();
            }
        }
    }
    private boolean categoriasCompletadas (){
        boolean desicion= false;
        int[] mat=menues[menues.length-1].getCategorias();
        for (int i = 0; i < mat.length; i++) {
            if(mat[i]!=0){
                desicion=false;
                break;
            }else{
                desicion=true;
            }
        }
        return desicion;
    }
    
}