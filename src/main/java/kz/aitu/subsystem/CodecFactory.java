package kz.aitu.subsystem;

/** Selects a decoder and encoder for the requested conversion. */
public final class CodecFactory {

    /** Creates a compatible codec pair for the source and target formats. */
    public CodecPair create(String sourceFormat, String targetFormat) {
        // TODO: validate supported formats and select compatible codecs.
        throw new UnsupportedOperationException("Implement codec selection");
    }

    /** Holds the codecs selected for one conversion. */
    public record CodecPair(String decoder, String encoder) {
    }
}
