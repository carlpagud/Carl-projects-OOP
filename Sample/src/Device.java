public class Device {
    private String brand;
    private int ageInYears;
    private double basePrice;
    private int daysInInventory;
    private static int deviceCount = 0;

    public Device(String brand, int ageInYears, double basePrice, int daysInInventory) {
        this.brand = brand;
        this.ageInYears = ageInYears;
        this.basePrice = basePrice;
        this.daysInInventory = daysInInventory;
        deviceCount++;
    }

    public String getBrand() {
        return brand;
    }

    public int getAgeInYears() {
        return ageInYears;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public int getDaysInInventory() {
        return daysInInventory;
    }

    public static int getDeviceCount() {
        return deviceCount;
    }

    public String getSupportLevel () {
        return "Standard Support";
    }

    public boolean isMoreExpensiveThan (Device other) {
        if (other == null) {
            return false;
        }

        return basePrice > other.basePrice;
    }
}