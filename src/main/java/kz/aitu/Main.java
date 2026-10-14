package kz.aitu;

import kz.aitu.facade.MediaConversionFacade;

/** Demonstrates the client using only the facade API. */
public class Main {
    public static void main(String[] args) {
        MediaConversionFacade facade = new MediaConversionFacade();
        System.out.println(facade.convert("lecture.wav", "mp3"));
    }
}
