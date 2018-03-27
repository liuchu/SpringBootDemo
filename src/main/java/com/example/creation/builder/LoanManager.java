package com.example.creation.builder;

/**
 * Created by chuliu on 2018/3/27.
 */
public class LoanManager {

    private LoanBuilder loanBuilder;

    public LoanManager(LoanBuilder loanBuilder){
        super();
        this.loanBuilder = loanBuilder;
    }

    public Loan buildLoan(){
        this.loanBuilder.loanApply();
        this.loanBuilder.loanApproval();
        this.loanBuilder.loanSanction();
        return this.loanBuilder.loanDisburse();
    }

}
