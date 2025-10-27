public class App {
    public static void main(String[] args) throws Exception {

        View view = new View();

        while (true) {
            view.showMenu();
            int option = view.inputOption(4);

            switch (option) {
                case 1:
                    System.out.println("Metodo Seleccion ");
                    view.showOrder();
                    int orden = view.inputOption(2);
                    boolean ordenOpt = pasos == 1;
                    view.showPasosMenu();
                    int pasos = view.inputOption(2);
                    // boolean pasosOpt == pasos == 1;
                    MetodoSeleccion mS = new MetodoSeleccion();
                    MetodoSeleccion.sortAscendente(numeros, ordenOpt, pasos == 1);

                    break;
                case 2:
                    System.out.println("Metodo Insercion ");
                    break;
                case 3:
                    System.out.println("Metodo Burbuja");
                    break;
                case 4:
                    System.out.println("¡Adios!");
                    System.exit(0);
                    break;
                default:
                    break;
            }
        }
    }
}
