package case_study.furama_resort_management_app.model;

public class ContractInformation {
    private int ContractNumber;
    private int ContractId;
    private double advanceDepositAmount;
    private double totalMoney;
    public ContractInformation(){

    }

    public ContractInformation(int contractNumber, int contractId, double advanceDepositAmount, double totalMoney) {
        ContractNumber = contractNumber;
        ContractId = contractId;
        this.advanceDepositAmount = advanceDepositAmount;
        this.totalMoney = totalMoney;
    }

    public int getContractNumber() {
        return ContractNumber;
    }

    public void setContractNumber(int contractNumber) {
        ContractNumber = contractNumber;
    }

    public int getContractId() {
        return ContractId;
    }

    public void setContractId(int contractId) {
        ContractId = contractId;
    }

    public double getAdvanceDepositAmount() {
        return advanceDepositAmount;
    }

    public void setAdvanceDepositAmount(double advanceDepositAmount) {
        this.advanceDepositAmount = advanceDepositAmount;
    }

    public double getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(double totalMoney) {
        this.totalMoney = totalMoney;
    }

    @Override
    public String toString() {
        return "ContractInformation{" +
                "ContractNumber=" + ContractNumber +
                ", ContractId=" + ContractId +
                ", advanceDepositAmount=" + advanceDepositAmount +
                ", totalMoney=" + totalMoney +
                '}';
    }
}
