package kz.aitu.model;

/** Metadata discovered before conversion begins. */
public record MediaMetadata(
        String fileName,
        String format,
        int bitrateKbps,
        int durationSeconds
) {
}
