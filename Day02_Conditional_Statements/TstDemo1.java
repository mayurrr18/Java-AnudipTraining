/* multiple heristence is not  support on with classes to avoid ambiguity cause by diamond problem
java support multiple 
 */
interface Camera {
     void takePhoto();
     }
interface MusicPlayer{
    void playMusic();
}
   

class SmartPhone implements Camera,MusicPlayer{
    public void takePhoto(){
        System.out.println("Captured the photo");

    }
    public void playMusic(){
        System.out.println("music is playing on smartphone");
    }    
    }

public class TstDemo1 {
    public static void main(String[] args) {
        SmartPhone sp=new SmartPhone();
        sp.takePhoto();
        sp.playMusic();
    }    
}


 