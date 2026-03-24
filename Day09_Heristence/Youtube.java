/* YOutube account and preuim account yt */

import java.util.*;
class Youtubebased {
     public void watchVideo(){
        System.out.println("Watching video on youtube");
     }
     public void likeVideo(){
        System.out.println("Liking the video");
     }

}
class Youtube1 extends Youtubebased{
    public void downloadVideo(){
        System.out.println("downloading video for offline viewing....");
    }
    public void adFreeExperience(){
        System.out.println("enjoying an add free experience...");
    }

}
public class Youtube{
    public static void main(String[] args) {
        Youtubebased ya=new Youtubebased();
        ya.watchVideo();;
        ya.likeVideo();

        Youtube1 pya=new Youtube1();
        pya.downloadVideo();
        pya.adFreeExperience();

    }
}