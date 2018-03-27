package com.example.structural.decorator;

/**
 * Created by chuliu on 2018/3/27.
 */
public class DecoratorPatternMain {

    public static void main(String[] args) {
		/*Saving account with no decoration*/
        Account basicSavingAccount = new SavingAccount();
        System.out.println(basicSavingAccount.getTotalBenefits());

		/*Saving account with senior citizen benefits decoration*//*
        Account seniorCitizenSavingAccount = new SavingAccount();
        seniorCitizenSavingAccount = new SeniorCitizen(seniorCitizenSavingAccount);
        System.out.println(seniorCitizenSavingAccount.getTotalBenefits());*/

		/*Saving account with privilege decoration*/
        Account privilegeCitizenSavingAccount = new SavingAccount();
        privilegeCitizenSavingAccount = new Privilege(privilegeCitizenSavingAccount);
        System.out.println(privilegeCitizenSavingAccount.getTotalBenefits());
    }
}
