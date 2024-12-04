public class Lasagna{
    public static void main (String [] args){
        Lasagna dish= new Lasagna();
        dish.details();
    }
    public int expectedMinutesInOven(){
        return 40;
    }
    public int remainingMinutesInOven(int minutes){
        return (expectedMinutesInOven()-minutes);
    }
    public int preparationTimeInMinutes(int layers){
        return layers * 2;
    }
    public int totalTimeInMinutes(int layers, int minutes){
        return preparationTimeInMinutes(layers) + minutes;
    }
    public void details(){
        System.out.println("The expected time in the oven is : "+ expectedMinutesInOven() + " minutes");
        System.out.println("The preparation time is : "+ preparationTimeInMinutes(6) + " minutes");
        System.out.println("The remaining time in the oven is : "+ remainingMinutesInOven(20)+ " minutes");
        System.out.println("The total preparation time is : "+totalTimeInMinutes(6,20)+" minutes");
    }
}
 

