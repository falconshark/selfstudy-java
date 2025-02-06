public class Loop {
    public static int loopNumber(int startNumber, int loopNumber){
        int result = 0; 
        for (int i = startNumber; i < loopNumber; i++){
            result = result + 1;
        }
        return result;
    }
}
