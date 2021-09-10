package com.iav;

public class Main {

    public static void main(String[] args) {

//        Account account = new Account();
//        Account jimsAccount = new Account("09876545", 200, "Jim", "jim@mail.com", "(087) 123-456");
//
//        account.setNumber("123456789");
//        account.setBalance(100);
//        account.setCustomerName("Ingo Peters");
//        account.setEmail("ingo.peters@iav.de");
//        account.setPhoneNumber("0123423423324");
//        account.deposit(200);
//        account.withdraw(400);
//        account.withdraw(250);
//
//        System.out.println(jimsAccount.getCustomerName());

        VipCustomer jim = new VipCustomer("Jim", 7, "jim@mail.com");

        System.out.println(jim.getName());
        System.out.println(jim.getCreditLimit());
        System.out.println(jim.getEmailAddress());
    }
}
