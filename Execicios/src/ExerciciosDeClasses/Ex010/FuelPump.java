package ExerciciosDeClasses.Ex010;

public class FuelPump {
    private String fuelType;
    private double literValue;
    private double fuelAmount;

    public FuelPump (String tipoCombustivel, double literValue, double fuelAmount) {
        this.fuelType = tipoCombustivel;
        this.literValue = literValue;
        this.fuelAmount = fuelAmount;
    }

    public void supplyByValue (double value) {
        double liters = value / literValue;
        if (liters <= fuelAmount) {
            fuelAmount -= liters;
            System.out.printf("Abastecido: %.2f litros. Valor pago: R$ %.2f%n", liters, value);
        } else {
            System.out.println("Não há combustível suficiente na bomba!");
        }
    }

    public void supplyByLiter(double liters) {
        if (liters <= fuelAmount) {
            double valor = liters * literValue;
            fuelAmount -= liters;
            System.out.printf("Abastecido: %.2f litros. Valor pago: R$ %.2f%n", liters, valor);
        } else {
            System.out.println("Não há combustível suficiente na bomba!");
        }
    }

    public void changeValue (double newValue) {
        literValue = newValue;
        System.out.println("Novo valor do litro: R$ " + literValue);
    }

    public void changeFuel (String newFuel) {
        fuelType = newFuel;
        System.out.println("Novo tipo de combustível: " + fuelType);
    }

    public void changeFuelAmount (double newAmount) {
        fuelAmount = newAmount;
        System.out.println("Quantidade de combustível atualizada: " + fuelAmount + " litros.");
    }

    public void Status() {
        System.out.println("Tipo: " + fuelType + " | Valor por litro: R$ " + literValue + " | Quantidade disponível: " + fuelAmount + " litros");
    }
}