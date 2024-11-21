package com.neoteric.java.exportaccountsummery;

public class PolymorphismWithInterfaceTest {


    public static void main(String[]args){

        ExportAccountSummery pdfExportAccountSummery = new PDFExportAccountSummery();
        pdfExportAccountSummery.export(new AccountSummery());

        ExportAccountSummery exportAccountSummery = new ExeclExportAccountSummery();
        exportAccountSummery.export(new AccountSummery());
    }
}
