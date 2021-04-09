public class Main {
    public static void main(String[] args) {
      CarShop carShop = new CarShop();
      carShop.setCarType(CarType.CABRIO);

//       carShop.getCarType();

        System.out.println(carShop.getCarType().getDescription());
    }
}
