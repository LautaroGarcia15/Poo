public class Main {
    public static void main(String[] args) {
        Persona matias = new Persona();

        matias.darNombre("Matias Romero");

        System.out.println(matias.saludar()); // lo meto adentro del print porque retorna un string no un print

        System.out.println("Mi nombre es "+ matias.decirNombre()+" y tengo "+matias.decirEdad()+" anios ");

        for (int i=0; i<25; i++){
            matias.cumplirAnios();
        }

        System.out.println("Mi nombre es "+ matias.decirNombre()+" y tengo "+matias.decirEdad()+" anios ");

        matias.caminar();
    }
}