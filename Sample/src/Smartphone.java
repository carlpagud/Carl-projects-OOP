public class Smartphone extends Device {
    private String color;
    private boolean isCarrierLocked;

    public Smartphone(String brand, int ageInYears, double basePrice, int daysInInventory, String color, boolean isCarrierLocked) {
        super(brand, ageInYears, basePrice, daysInInventory);
        this.color = color;
        this.isCarrierLocked = isCarrierLocked;
    }

    public double calculateDiscountedPrice() {
        double price = getBasePrice();

        if (isCarrierLocked) {
            price *= 0.80;
        }
        if (getDaysInInventory() > 45) {
            price *= 0.90;
        }
        return price;
    }

    public boolean isCarrierLocked() {
        return isCarrierLocked;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String getSupportLevel() {
        if (getAgeInYears() >= 7) return "Legacy Support";
        else return "Standard Support";
    }
}