package com.neoteric.java.exportaccountsummery;

public class PDFExportAccountSummery implements ExportAccountSummery{

    @Override
    public String export(AccountSummery accountSummery) {

        System.out.println("Erport to pdf is done");
        return "Data exported to PDF is done";
    }
}
