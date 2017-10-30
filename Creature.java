public class Creature {
    int energy, fullness, happiness;
    String name;
    public Creature(String name){
        energy = 15;
        happiness = 15;
        fullness = 15;
        this.name = name;
    }
    public void eat(){
        if(fullness>=12){
            System.out.println("woops" + this.name + " is already full");
        }else {
            fullness += 8;
        }
    }
    public void sleep(){
        if(energy>=12){
            System.out.println("woops" + this.name + " has slept already");
        }else {
            fullness -= 6;
            happiness -= 6;
            energy +=8;
        }
    }
    public void play(){
        if(happiness>=15){
            System.out.println("woops" + this.name + " played already");
        }else {
            fullness -=6;
            happiness +=8;
            energy -= 6;
            System.out.println("that was fun!");
        }
    }
    public String getName(){
        return this.name;
    }
    public String checkStatus(){
        String status = "";
        if(happiness<=6){
            status+="Oh, " + this.getName() + "is feeling sad\n";
        }
        if(energy<=6){
            status+="Hum, " + this.getName() + " is really tired\n";
        }
        if(fullness<=6){
            status+="Woops, "+this.getName()+" is very hungry\n";
        }
        return status;
    }
    }
