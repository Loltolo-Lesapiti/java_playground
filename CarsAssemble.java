public class CarsAssemble {
    public static void main (String []args){
        CarsAssemble myYard= new CarsAssemble();
        System.out.println("Production rate per hour: "+ myYard.productionRatePerHour(1));
        System.out.println("Productions rate per minute: "+myYard.workingItemsPerMinute(1));
    }
    public double productionRatePerHour(int speed){
            if(speed<=4){
                return speed*221*1.0;
            }
            else if(speed >=5 && speed <=8){
                return speed*221*0.9;
            }
            else if (speed==9){
                return speed*221*0.8;
            }
            else if(speed==10){
                return speed *221*0.77;
            }
            else{
                return 0;
            }
    }
    public int workingItemsPerMinute(int speed){
        if(speed>0){
            return (int) Math.floor(productionRatePerHour(speed)/60);
        }else{
            return 0;
        }
        
    }
}
