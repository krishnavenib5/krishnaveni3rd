package com.noesisinformatica.test;

public class App {

    public static void main( String[] args )
    {
        EmbeddedDataService embbDataService = new EmbeddedDataService();
        System.out.println( "Number of terms : " + embbDataService.getAllTerm().size());
        embbDataService.saveTerm("Term from app");
    }
}
