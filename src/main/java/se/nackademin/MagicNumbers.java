package se.nackademin;

public class MagicNumbers {

    private String name;
    private int income;
    private String location;
    private int age;
    private int height;

    public int calculateA() {
        int spacecount = 1; //skulle också kunna vara 0, med en spacecount++ mellan rad 18 och 19
        for(int i = 0; i < name.length(); i++){
            if(name.charAt(i) == ' '){
                spacecount++;
            }
        } 
        spacecount = spacecount + age; 
        while(spacecount >= 10){
            spacecount = spacecount - 7;
        }
        return spacecount;
    }

    public int calculateB() {
        int charcount = location.length();
        charcount = charcount + income; 
        while(charcount >= 10){
            charcount = charcount - 7;
        }
        
        return charcount;
    }

    public int calculateC() {
        int numberC = this.calculateA() + this.calculateB();
        numberC = numberC - height;
        while(numberC < 0){
            numberC = numberC + 10;
        }
        
        return numberC;
    }

    public int calculateD() {
        int numberD = this.calculateA();
        if( numberD > 5){
            numberD = numberD + this.calculateB();
        } else numberD = numberD + this.calculateC();
        numberD = numberD - income;
        while(numberD < 0){
            numberD = numberD + 10;
        }
        return numberD;
    }

    public int calculateE() {
        //TODO: calculate E
        double numberE;
        numberE = Math.sqrt((age * income * income * height));
        
        Long numblong;
        int numbanswer;
        numblong = Math.round(numberE);
        numbanswer = numblong.intValue();
        
        while(numbanswer >= 10){
            numbanswer = numbanswer / 2;
            numberE = Math.round(numberE);
        }
        
        
        return numbanswer;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIncome(int income) {
        this.income = income;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
