package com.example.creation.builder;

/**
 * Created by chuliu on 2018/3/27.
 */
public class BuilderPatternMain {

    public static void main(String[] args) {

        LoanManager loanManager1 = new LoanManager(new HomeLoanBuilder());
        Loan homeLoan = loanManager1.buildLoan();
        System.out.println(homeLoan);
        System.out.println("--------------------------------------------------\n");

        LoanManager loanManager2 = new LoanManager(new CarLoanBuilder());
        Loan carLoan = loanManager2.buildLoan();
        System.out.println(carLoan);
        System.out.println("--------------------------------------------------\n");

        LoanManager loanManager3 = new LoanManager(new PersonalLoanBuilder());
        Loan personalLoan = loanManager3.buildLoan();
        System.out.println(personalLoan);
        System.out.println("--------------------------------------------------\n");
    }
}
