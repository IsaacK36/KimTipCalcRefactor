public class TipCalculator {
    private int numPeople;
    private int tipPercent;
    private double totalBillBeforeTip;

    public TipCalculator(int numPeople, int tipPercent) {
        this.numPeople = numPeople;
        this.tipPercent = tipPercent;
        totalBillBeforeTip = 0.0;
    }

    public double getTotalBillBeforeTip() {
        return totalBillBeforeTip;
    }

    public int getTipPercent() {
        return tipPercent;
    }

    public double addMeal(double cost) {
        totalBillBeforeTip += cost;
    }

    public double tipAmount() {
        return totalBillBeforeTip * tipPercent / 100;
    }

    public double totalBill() {
        return totalBillBeforeTip + tipAmount();
    }

    public double perPersonCostBeforeTip() {
        return totalBillBeforeTip / numPeople;
    }

    public double perPersonTipAmount() {
        return tipAmount() / numPeople;
    }

    public double perPersonTotalCost() {
        return (totalBillBeforeTip + tipAmount()) / numPeople;
    }
}
