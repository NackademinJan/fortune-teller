/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.nackademin;

/**
 *
 * @author testautomatisering
 */
public class Translator {
    Translator() {  
    }
    
    public String adjTranslate(int index) {
        String reply = null;
        switch(index){
            case 0: reply = "stor"; 
                    break;
            case 1: reply = "liten"; 
                    break;
            case 2: reply = "stark"; 
                    break;
            case 3: reply = "svag"; 
                    break;
            case 4: reply = "mjuk"; 
                    break;
            case 5: reply = "hård"; 
                    break;
            case 6: reply = "snabb"; 
                    break;
            case 7: reply = "vacker"; 
                    break;
            case 8: reply = "ljus"; 
                    break;
            case 9: reply = "mörk"; 
                    break;
        }
        return reply;
    }
    public String subTranslate(int index) {
        String reply = null;
        switch(index){
            case 0: reply = "en lönehöjning"; 
                    break;
            case 1: reply = "en lönesänkning"; 
                    break;
            case 2: reply = "en fotboja"; 
                    break;
            case 3: reply = "en katt"; 
                    break;
            case 4: reply = "en hund"; 
                    break;
            case 5: reply = "ett hus"; 
                    break;
            case 6: reply = "ett barn"; 
                    break;
            case 7: reply = "ett elstängsel"; 
                    break;
            case 8: reply = "en dator"; 
                    break;
            case 9: reply = "ett golv"; 
                    break;
        }
        return reply;
    }

    public String verTranslate(int index) {
        String reply = null;
        switch(index){
            case 0: reply = "springa"; 
                    break;
            case 1: reply = "ljuga"; 
                    break;
            case 2: reply = "flyga"; 
                    break;
            case 3: reply = "se"; 
                    break;
            case 4: reply = "vara"; 
                    break;
            case 5: reply = "äta"; 
                    break;
            case 6: reply = "mäta"; 
                    break;
            case 7: reply = "gå"; 
                    break;
            case 8: reply = "röra"; 
                    break;
            case 9: reply = "resa"; 
                    break;
        }
        return reply;
    }
    
    
    String translate(MagicNumbers magicNumbers) {
        String translation;
        translation = "Din framtid är " + adjTranslate(magicNumbers.calculateA()) + ". Du borde sluta " + verTranslate(magicNumbers.calculateB()) + ". Vi ser att du snart kommer att skaffa " + subTranslate(magicNumbers.calculateC()) + ". Snart kommer du vilja " + verTranslate(magicNumbers.calculateD()) + ", men då är det viktigt att du är " + adjTranslate(magicNumbers.calculateE()) + ".";
        
        return translation; 
    }
    
}
