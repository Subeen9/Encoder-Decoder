public class Decoder {
   private String secretMessage;
   private int offset;

    public String decode(int[]reciever){
       secretMessage = "" ;
       for(int values : reciever){
           secretMessage =secretMessage + (char) values;
       }
       return secretMessage;
    }
    public  String decode(int[] reciever, int offset){
        this.offset = offset;
        secretMessage = "";
        for(int values:reciever){
            secretMessage =secretMessage + (char)(values-offset);
        }
        return secretMessage;
    }
}