public class Rotor {

    private String rotorValues;
    private char startChar;
    private char[] arr;

    public Rotor(String v, char c){
        this.rotorValues = new String(v);
        this.startChar = c;
        //turning the rotorValue into a char array
        arr = rotorValues.toCharArray();
        //while the desired start char isn't at the front, keep rotating
        while(!this.rotate()){
            rotate();
        }
    }
    public boolean rotate(){
        return false;
    }
    
    public int indexOf(char c){//Good
        for(int i = 0; i<arr.length;i++){
            //checks equality of chars
            if(c == arr[i]){
                //returns proper index
                return i;
            }
        }
        //char not found
        return -1;
    }

    public char charAt(int idx){//Good
        for(int i = 0; i<rotorValues.length();i++){
            //checks equality of index
            if(idx == i){
                //returns proper char
                return arr[i];
            }
        }
        //index is invalid
        return 0;
    }

}
    