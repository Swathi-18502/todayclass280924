package com.neoteric.java.exportaccountsummery;

public class ExeclExportAccountSummery implements ExportAccountSummery {

    @Override
    public String export(AccountSummery accountSummery) {

        System.out.println("Export to excel is done");
        return "Date exported to excel is done";
    }

    public void test() {

    }
}
