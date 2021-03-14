public class myTV {
    int channel;
    int volumeLevel;
    boolean on;
    
    
    public myTV(){
        channel = 1;
        volumeLevel = 1;
        on = false;
    }
    
    public void turnOn(){
        on = true;
    }
    
    public void turnOff(){
        on = false;
    }
    
    public void setChannel(int newChannel){
        if (newChannel >= 1 && newChannel <= 120) {
            channel = newChannel;
        }
        else {
            System.out.println(" ----- Channel Not Found ----- ");
        }
    }
    
    public void setVolume(int newVolumeLevel){
        if (newVolumeLevel <=7 && newVolumeLevel >= 1) {
            volumeLevel = newVolumeLevel;
        }
        else {
            System.out.println(" Error Silakan Coba Lagi ");
        } 
    }
    
    public void channelUp(){
        if (channel >120) {
            System.out.println("channel not found");
        } else {
            channel++;
        }
    }
    
    public void channelDown(){
        if (channel <1) {
            System.out.println("channel not found");
        } else {
            channel--;
        }
    }

    public void volumeUp(){
        if (volumeLevel >7) {
            System.out.println("volume not found");
        } else {
            volumeLevel++;
        }
    }

    public void volumeDown(){
        if (volumeLevel <1) {
            System.out.println("volume not found");
        } else {
            volumeLevel--;
        }
    }

}
