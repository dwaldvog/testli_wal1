public class SoftwareShop { 

    public OfficeProgramm holeApp(String zuHolendesProg) { 
        OfficeProgramm programm = null; 
        //Auswahl der benötigten Applikation 
        if (zuHolendesProg.equals("Word")) { 
            programm = new Word(); 
        } 
        else if (zuHolendesProg.equals("Powerpoint")) { 
            programm = new Powerpoint(); 
        } 
        else if (zuHolendesProg.equals("Excel")) { 
            programm = new Excel(); 
        } 
        else { 
            System.err.println("Ungültig!"); 
        } 

        //Weitere Verarbeitung 
        programm.einpacken(); 
        programm.etikettieren(); 

        return programm; 
    } 
} 			
Schnittstelle OfficeProgramm und die Impleme