package com.noesisinformatica.test;

import junit.framework.TestCase;

public class AppTest extends TestCase {
    EmbeddedDataService embeddeddataService = null;
    @Override
    public void setUp() throws Exception {
        super.setUp();
	EmbeddeddataService = new embeddedDataService();
    }

    public void testApp(){
	int embbtermInDataService = embeddeddataService.getAllTerm().size();
        System.out.println( "Number of terms : " + embbtermInDataService);
        assert embbtermInDataService > 0;
    }

    public void testSaveTerm() throws Exception {
        int embbtermInDataService = embeddeddataService.getAllTerm().size();
        embeddeddataService.saveTerm("Term from app");
        assert embeddeddataService.getAllTerm().size() > embbtermInDataService;
    }

    public void testGetTerm() throws Exception {
        String testTerm = "Second test term";
        embeddeddataService.saveTerm(testTerm);
        long embbId = embeddeddataService.getLastUsedId();
        assertEquals(testTerm, embeddeddataService.getTermForId(embbId));
    }
}
