package Day_5;

public class second_word_uppercase {
    public String second_dword_uppercase(String input1){
        String strArray[] = input1.split(" ");
        String stt="LESS";
        if(strArray.length==1) {return stt;}
        return strArray[1].toUpperCase();
    }
}
