public class InteresCompuesto {
    public static void main(String[] args) {
        // Vamos a construir un simulador de interés compuesto usando un ciclo for. El
        // sistema tiene un capital inicial de $1,000,000 y una tasa de interés mensual
        // del 2%. Queremos simular cuánto dinero habrá mes a mes durante 6 meses.

        double capitalInicial = 1000000;
        double tasaMensual = 0.02;
        
        for (int i = 1; i <= 6; i++) {
            double interesMensual = capitalInicial * tasaMensual;
            capitalInicial += interesMensual;
            System.out.println(i + ": " + capitalInicial);
        }
    }
}
