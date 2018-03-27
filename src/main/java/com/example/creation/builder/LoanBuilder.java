package com.example.creation.builder;

/**
 * Created by chuliu on 2018/3/27.
 */
public interface LoanBuilder {

    void loanApply();
    void loanApproval();
    void loanSanction();
    Loan loanDisburse();

}
