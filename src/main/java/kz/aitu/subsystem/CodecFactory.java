package kz.aitu.subsystem;

/** Selects a decoder/encoder pair for a source and target format. */
public class CodecFactory {
    public CodecPair create(String sourceFormat, String targetFormat) {
        // TODO: validate supported formats and select compatible codecs.
        throw new UnsupportedOperationException("Implement codec selection");
    }

    public record CodecPair(String decoder, String encoder) {
    }
}
