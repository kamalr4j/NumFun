import java.io.File;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.Media;
import javafx.embed.swing.JFXPanel;

// 
// Decompiled by Procyon v0.5.36
// 

class Sound
{
    final JFXPanel fxPanel;
    Media bgm;
    Media basic;
    MediaPlayer MPbm;
    MediaPlayer MPb;
    
    Sound() {
        this.fxPanel = new JFXPanel();
    }
    
    public void playM(final String s) {
        if (s.equals("intro")) {
            this.bgm = new Media(new File("Assets/intro.mp3").toURI().toString());
            (this.MPbm = new MediaPlayer(this.bgm)).play();
        }
        else if (s.equals("gameM")) {
            this.bgm = new Media(new File("Assets/gameM.mp3").toURI().toString());
            (this.MPbm = new MediaPlayer(this.bgm)).play();
        }
        else {
            this.MPbm.stop();
        }
    }
    
    public void playB(final String s) {
        if (s.equals("yes")) {
            this.basic = new Media(new File("Assets/yes.mp3").toURI().toString());
            (this.MPb = new MediaPlayer(this.basic)).play();
        }
        else if (s.equals("no")) {
            this.basic = new Media(new File("Assets/no.mp3").toURI().toString());
            (this.MPb = new MediaPlayer(this.basic)).play();
        }
        else if (s.equals("press")) {
            this.basic = new Media(new File("Assets/press.mp3").toURI().toString());
            (this.MPb = new MediaPlayer(this.basic)).play();
        }
        else if (s.equals("good job")) {
            this.basic = new Media(new File("Assets/good job.mp3").toURI().toString());
            (this.MPb = new MediaPlayer(this.basic)).play();
        }
        else if (s.equals("luck")) {
            this.basic = new Media(new File("Assets/luck.mp3").toURI().toString());
            (this.MPb = new MediaPlayer(this.basic)).play();
        }
        else {
            this.MPb.stop();
        }
    }
}
