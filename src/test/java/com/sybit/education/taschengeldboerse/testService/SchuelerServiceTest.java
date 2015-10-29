/*
 * Schuelerprojekt: Taschengeldboerse
 * Sybit GmbH - www.sybit.de -  Apache License, Version 2.0
 * https://github.com/Sybit-Education/taschengeldboerse
 */
package com.sybit.education.taschengeldboerse.testService;

import com.sybit.education.taschengeldboerse.domain.Schueler;
import com.sybit.education.taschengeldboerse.service.SchuelerService;
import com.sybit.education.taschengeldboerse.testutil.AbstractDatabaseTest;
import java.util.List;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author tsa
 */
public class SchuelerServiceTest extends AbstractDatabaseTest{
    
    @Autowired
    SchuelerService schuelerService;
    
    @Test
    public void testFindSchuelerById() {
        Schueler schueler = schuelerService.findById(1);
        
        assertEquals("Max", schueler.getVorname());
    }
    
    @Test
    public void testFindByName() {
        List<Schueler> schuelerListe = schuelerService.findByName("Mustermann");
        
        System.err.print(schuelerListe.size());
    }
    
    @Override
    public String getDataset() {
        return "database/testSchuelerService.xml";
    }
}
