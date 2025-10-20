public class main{
	public static void main(String[] args)
	}
}
public static Car[] getCarByBrend(Car[] cars, String brand) {
    int count = 0;
    for (Car car : cars) {
        if (car.getBrand().equalsIgnoreCase(brand)) {
            count++;
        }
    }

    Car[] result = new Car[count];
    int index = 0;
    for (Car car : cars) {
        if (car.getBrand().equalsIgnoreCase(brand)) {
            result[index++] = car;
        }
    }


    return result;
}
public static void main(String[] args) {
    Car[] cars = {
        new Car(1, "Toyota", "Camry", 2018, "Black", 20000, "AA1111AA"),
        new Car(2, "BMW", "X5", 2020, "White", 45000, "BB2222BB"),
        new Car(3, "Toyota", "Corolla", 2016, "Gray", 15000, "CC3333CC")
    };

    Car[] toyotas = getCarByBrend(cars, "Toyota");

    System.out.println("Машины марки Toyota:");
    for (Car car : toyotas) {
        System.out.println(car.getModel());
    }
}
public static Car[] getCarByBrendAndYearOperational(Car[] cars, String brand, int years) {
    int currentYear = java.time.Year.now().getValue();
    int count = 0;

    for (Car car : cars) {
        if (car.getBrand().equalsIgnoreCase(brand) && (currentYear - car.getYear()) > years) {
            count++;
        }
    }

    Car[] result = new Car[count];
    int index = 0;

    for (Car car : cars) {
        if (car.getBrand().equalsIgnoreCase(brand) && (currentYear - car.getYear()) > years) {
            result[index++] = car;
        }
    }

    return result;
}
