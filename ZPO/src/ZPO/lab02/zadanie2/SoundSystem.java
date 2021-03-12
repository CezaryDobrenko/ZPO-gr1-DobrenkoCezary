package ZPO.lab02.zadanie2;

public class SoundSystem {
    Codec codec;
    int howManySpeakers;

    public SoundSystem(int howManySpeakers){
        this.howManySpeakers = howManySpeakers;
    }

    public void automaticlyChoseCodec(){
        if(howManySpeakers < 5)
            this.codec = new DolbyProLogic();
        else
            this.codec = new DolbyDigital();
    }

    public void changeCodec(Codec codec){
        this.codec = codec;
    }

    public void getCodecDetails(){
        this.codec.choisedCodec();
    }
}
