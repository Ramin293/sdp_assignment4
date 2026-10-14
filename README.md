# Media Conversion Facade

A Java 17 learning project for the Facade pattern. The planned example is a simplified media conversion pipeline: a client will ask one `MediaConversionFacade` to convert a file, while the facade coordinates metadata reading, codec selection, bitrate conversion, and audio mixing.

## Current state

This first commit provides the Maven project structure and API placeholders. Methods marked `TODO` are intentionally left for the student to implement independently, in line with the assignment's academic integrity requirements.

## Build

```sh
mvn compile
```

## Planned implementation

1. Project scaffold and conversion flow outline.
2. Media metadata model and metadata reader.
3. Codec selection and validation.
4. Bitrate conversion step.
5. Audio mixing step and subsystem coordination.
6. Facade API and facade-only client demonstration.
7. Error handling, clean code annotations, and final documentation.

## Package structure

- `kz.aitu.facade` — simplified public API.
- `kz.aitu.subsystem` — independently usable conversion steps.
- `kz.aitu.model` — data passed between conversion steps.
