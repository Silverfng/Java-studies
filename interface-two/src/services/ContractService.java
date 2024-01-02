package services;

import entities.Contract;
import entities.Installment;

import java.time.LocalDate;

public class ContractService {

    private OnlinePaymentService onlinePaymentService;

    public ContractService(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }

    public void processContract(Contract contract, int months) {

        double basicQuouta = contract.getTotalValue() / months;

        for (int i=1; i <= months; i++) {
            LocalDate dueDate = contract.getDate().plusMonths(i);

            double interest = onlinePaymentService.interest(basicQuouta, i);
            double fee = onlinePaymentService.paymentFee(basicQuouta + interest);
            double quota = basicQuouta + interest + fee;

            contract.getInstalments().add(new Installment(dueDate, quota));

        }
    }
}
