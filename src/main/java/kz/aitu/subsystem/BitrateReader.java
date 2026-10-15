package kz.aitu.subsystem;

import kz.aitu.model.MediaMetadata;

/** Converts media data to a requested target bitrate. */
public final class BitrateReader {

    /** Converts the media described by metadata to the target bitrate. */
    public byte[] convert(MediaMetadata metadata, int targetBitrateKbps) {
        // TODO: simulate a meaningful bitrate conversion step.
        throw new UnsupportedOperationException("Implement bitrate conversion");
    }
}
