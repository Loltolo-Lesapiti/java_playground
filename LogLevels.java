public class LogLevels {
    public static void main(String [] args){
        details();
    }
    public static String message(String longLine){
        //Create an array separed by : 
         String [] messageParts=longLine.split(":");
         //Take the last part or the second part and trim to remove white spaces. 
         String message=messageParts[1].trim();
         return message;
    }
    public static String logLevel(String message){
        //Split and get the first part alone. 
        String log=message.split(":")[0];
        //Replace these "[]" with ""
        String logText= log.replace("]","").replace("[","");
        //Trim to remove wgite splaces and change to lowercase. 
        return logText.trim().toLowerCase(); 
    }
    public static String reformat(String message){
        //This method utilizes the two methods above. 
        String logLineMessage= message(message)+" ("+logLevel(message)+")";
        return logLineMessage;
    }
    public static void details(){
        System.out.println(reformat("[INFO]: Operation completed"));
    }
    
}
