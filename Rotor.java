public class Rotor {

    
    private String rotorValues;
    private char startChar;
    char arr []= rotorValues.toCharArray();
        
    public Rotor(String v, char c){
        this.rotorValues = new String(v);
        this.startChar = c;
        
        while(!this.rotate());
            
    }
    
    public boolean rotate(){
        //TODO
       
    }
    

    public int indexOf(char c){
        //TODO
        for(int i = 0; i<rotorValues.length();i++){
            if(c == arr[i]){
                return i;
            }
        }
        return -1;
    }

    public char charAt(int idx){
        //TODO
        for(int i = 0; i<rotorValues.length();i++){
            if(idx == i){
                return arr[i];
            }
        }
        return 0;
    }

}
    