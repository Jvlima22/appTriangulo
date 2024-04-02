package apptriangulo;

public class appTriangulo {

    public static void main(String[] args) {
        
        tipoTriangulo tri = new tipoTriangulo();
        int ret;
        tri.entrarDimensaoA();
        tri.entrarDimensaoB();
        tri.entrarDimensaoC();
        ret=tri.validarDimensoes(tri.a, tri.b, tri.c);
        if(ret==0){
            System.out.println("As dimensões informadas não são válidas."+tri.a+" - " +tri.b+" - " +tri.c);
        }
        else{
            ret=tri.identificaSeTriangulo(tri.a, tri.b, tri.c);
            if(ret==1){
                tri.descobrirTipoTriangulo(tri.a,tri.b,tri.c);
            }
        }
        
        
    }
    
}