package kz.aitu;

import kz.aitu.facade.MediaConversionFacade;

/** Client code that demonstrates the facade API. */
public final class Main {

    private Main() {
        // This class only contains the application entry point.
    }

    public static void main(String[] args) {
        MediaConversionFacade facade = new MediaConversionFacade();
        System.out.println(facade.convert("lecture.wav", "mp3"));
    }
}
