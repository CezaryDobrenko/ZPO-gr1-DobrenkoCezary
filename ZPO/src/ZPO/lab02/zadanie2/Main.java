package ZPO.lab02.zadanie2;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        DolbyDigital dd = new DolbyDigital();
        DolbyProLogic dpl = new DolbyProLogic();

        SoundSystem ss = new SoundSystem(10);
        ss.automaticlyChoseCodec();
        ss.getCodecDetails();
        ss.changeCodec(dpl);
        ss.getCodecDetails();

    }

}
