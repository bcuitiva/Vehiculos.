import java.util.*;
public class Main {
    public static void main(String[] args) {
        List <Vehiculos> lista = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        Vehiculos v1 = new Vehiculos();
        boolean val = true;

        System.out.println("Bienvenido a su lista de vehiculos");
        while(val){
            int op;
            System.out.println("\nQue desea hacer?");
            System.out.println("1. Ingresar un vehiculo\n2. Mostrar vehiculos\n3. Buscar un vehiculo por su placa\n4. Salir");
            op = sc.nextInt();
            switch(op){
                case 1:
                    v1.IngresoVehiculo();
                    lista.add(new Vehiculos(v1.getPlaca(), v1.getMarca(), v1.getCarroceria(), v1.getColor(), v1.getModelo()));
                    break;
                case 2:
                    for(Vehiculos vehiculo : lista){
                        System.out.println(vehiculo);
                    }
                    break;
                case 3:
                    String placa;
                    System.out.println("Ingrese la placa del vehiculo que desea buscar:");
                    placa = sc.next();
                    for (Vehiculos vehiculo : lista) {
                        System.out.println(placa.equals(v1.getPlaca()));
                        if (v1.getPlaca().equalsIgnoreCase(placa)) {
                            System.out.println(vehiculo);
                        }
                    }
                    break;
                case 4:
                    val = false;
                    break;
                default:
                    System.out.println("Ingrese una opcion correcta.");
            }
        }
    }
}