package FuramaResort.model;

public class Contract {
    private String idContract;
    private String idBooking;
    private double depositAmount;
    private double totalMoney;

    public Contract(String idContract, String idBooking, double depositAmount, double totalMoney) {
        this.idContract = idContract;
        this.idBooking = idBooking;
        this.depositAmount = depositAmount;
        this.totalMoney = totalMoney;
    }

    public String getIdContract() {
        return idContract;
    }

    public void setIdContract(String idContract) {
        this.idContract = idContract;
    }

    public String getIdBooking() {
        return idBooking;
    }

    public void setIdBooking(String idBooking) {
        this.idBooking = idBooking;
    }

    public double getDepositAmount() {
        return depositAmount;
    }

    public void setDepositAmount(double depositAmount) {
        this.depositAmount = depositAmount;
    }

    public double getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(double totalMoney) {
        this.totalMoney = totalMoney;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "idContract='" + idContract + '\'' +
                ", idBooking='" + idBooking + '\'' +
                ", depositAmount=" + depositAmount +
                ", totalMoney=" + totalMoney +
                '}';
    }
}
