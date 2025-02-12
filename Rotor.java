public class Rotor {

    
    private String rotorValues;
    private char startChar;
    //converting the rotorValues to an array of chars
    char arr []= rotorValues.toCharArray();
        
    public Rotor(String v, char c){
        this.rotorValues = new String(v);
        this.startChar = c;
        
        while(!this.rotate());
            
    }
    
    public boolean rotate(){
        //TODO
        for(int i = 0;i<27;i++){
            //iterating through the chars in the rotor
            if(i == 26){
            //edge case for last char
                arr[26] = arr[0];
            }
            //rotating "clockwise"
            arr[i] = arr[i+1];
            //checking if the starting char is reached so the rotation stops
            if(arr[i] == startChar){
                return true;
            }
        }
        //returning false otherwise
        return false;
    }
    

    public int indexOf(char c){
        //TODO
        for(int i = 0; i<rotorValues.length();i++){
            //checks equality of chars
            if(c == arr[i]){
                //returns proper index
                return i;
            }
        }
        //char not found
        return -1;
    }

    public char charAt(int idx){
        //TODO
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
    