# Assignment 4 - Facade Pattern

- **Name:** Ramin Smagulov
- **Topic:** Media Conversion Facade
- **Repository URL:** https://github.com/Ramin293/sdp_assignment4
- **Base commit:** `b3e43a784834bf18636151eed7c941c2106b2b07`

The project demonstrates the Facade pattern through a simplified media conversion pipeline. The client will request a conversion through `MediaConversionFacade`; the facade will coordinate the subsystem classes in the required order.

| Facade role | Class | Responsibility |
| --- | --- | --- |
| Facade | `MediaConversionFacade` | Exposes the small conversion API to the client. |
| Subsystem | `MetadataReader` | Reads source media properties. |
| Subsystem | `CodecFactory` | Selects codecs for source and target formats. |
| Subsystem | `BitrateReader` | Converts data to the requested bitrate. |
| Subsystem | `AudioMixer` | Produces the converted output. |
| Client | `Main` | Demonstrates the facade API without using subsystem classes. |
| Data model | `MediaMetadata` | Carries media properties between subsystem steps. |

## Build and run

From the `assignment4/sdp_assignment4` folder, using JDK 17 and Maven:

```text
mvn compile
java -cp target/classes kz.aitu.Main
```

The source currently contains `TODO` placeholders. The conversion demonstration will run after the subsystem and facade steps are implemented.

## Report structure

The report will follow the same order used in the earlier assignment reports:

1. Introduction — selected subsystem and reason for using a facade.
2. UML — class roles and collaboration diagram.
3. Clean Code — principles with short code excerpts.
4. Verification — build and demonstration results.
5. Conclusion — details hidden by the facade and direct subsystem access that remains possible.
6. Repository link.

The report file is kept locally and excluded from Git.

