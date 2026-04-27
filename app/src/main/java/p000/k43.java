package p000;

import android.util.Base64;
import android.util.JsonReader;
import com.arthenica.ffmpegkit.MediaInformation;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p000.z33;

/* JADX INFO: loaded from: classes5.dex */
public class k43 {

    /* JADX INFO: renamed from: a */
    public static final zf3 f52559a = new mk8().configureWith(xi0.f97910b).ignoreNullValues(true).build();

    /* JADX INFO: renamed from: k43$a */
    public interface InterfaceC8191a<T> {
        T parse(@efb JsonReader jsonReader) throws IOException;
    }

    @efb
    private static z33.AbstractC15965f.a parseApp(@efb JsonReader jsonReader) throws IOException {
        z33.AbstractC15965f.a.AbstractC16566a abstractC16566aBuilder = z33.AbstractC15965f.a.builder();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "identifier":
                    abstractC16566aBuilder.setIdentifier(jsonReader.nextString());
                    break;
                case "developmentPlatform":
                    abstractC16566aBuilder.setDevelopmentPlatform(jsonReader.nextString());
                    break;
                case "developmentPlatformVersion":
                    abstractC16566aBuilder.setDevelopmentPlatformVersion(jsonReader.nextString());
                    break;
                case "version":
                    abstractC16566aBuilder.setVersion(jsonReader.nextString());
                    break;
                case "installationUuid":
                    abstractC16566aBuilder.setInstallationUuid(jsonReader.nextString());
                    break;
                case "displayVersion":
                    abstractC16566aBuilder.setDisplayVersion(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return abstractC16566aBuilder.build();
    }

    @efb
    private static z33.AbstractC15960a parseAppExitInfo(@efb JsonReader jsonReader) throws IOException {
        z33.AbstractC15960a.b bVarBuilder = z33.AbstractC15960a.builder();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "buildIdMappingForArch":
                    bVarBuilder.setBuildIdMappingForArch(parseArray(jsonReader, new InterfaceC8191a() { // from class: c43
                        @Override // p000.k43.InterfaceC8191a
                        public final Object parse(JsonReader jsonReader2) {
                            return k43.parseBuildIdMappingForArch(jsonReader2);
                        }
                    }));
                    break;
                case "pid":
                    bVarBuilder.setPid(jsonReader.nextInt());
                    break;
                case "pss":
                    bVarBuilder.setPss(jsonReader.nextLong());
                    break;
                case "rss":
                    bVarBuilder.setRss(jsonReader.nextLong());
                    break;
                case "timestamp":
                    bVarBuilder.setTimestamp(jsonReader.nextLong());
                    break;
                case "processName":
                    bVarBuilder.setProcessName(jsonReader.nextString());
                    break;
                case "reasonCode":
                    bVarBuilder.setReasonCode(jsonReader.nextInt());
                    break;
                case "traceFile":
                    bVarBuilder.setTraceFile(jsonReader.nextString());
                    break;
                case "importance":
                    bVarBuilder.setImportance(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return bVarBuilder.build();
    }

    @efb
    private static <T> List<T> parseArray(@efb JsonReader jsonReader, @efb InterfaceC8191a<T> interfaceC8191a) throws IOException {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(interfaceC8191a.parse(jsonReader));
        }
        jsonReader.endArray();
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @efb
    public static z33.AbstractC15960a.a parseBuildIdMappingForArch(@efb JsonReader jsonReader) throws IOException {
        z33.AbstractC15960a.a.AbstractC16565a abstractC16565aBuilder = z33.AbstractC15960a.a.builder();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "libraryName":
                    abstractC16565aBuilder.setLibraryName(jsonReader.nextString());
                    break;
                case "arch":
                    abstractC16565aBuilder.setArch(jsonReader.nextString());
                    break;
                case "buildId":
                    abstractC16565aBuilder.setBuildId(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return abstractC16565aBuilder.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @efb
    public static z33.AbstractC15963d parseCustomAttribute(@efb JsonReader jsonReader) throws IOException {
        z33.AbstractC15963d.a aVarBuilder = z33.AbstractC15963d.builder();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            if (strNextName.equals("key")) {
                aVarBuilder.setKey(jsonReader.nextString());
            } else if (strNextName.equals("value")) {
                aVarBuilder.setValue(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return aVarBuilder.build();
    }

    @efb
    private static z33.AbstractC15965f.c parseDevice(@efb JsonReader jsonReader) throws IOException {
        z33.AbstractC15965f.c.a aVarBuilder = z33.AbstractC15965f.c.builder();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "simulator":
                    aVarBuilder.setSimulator(jsonReader.nextBoolean());
                    break;
                case "manufacturer":
                    aVarBuilder.setManufacturer(jsonReader.nextString());
                    break;
                case "ram":
                    aVarBuilder.setRam(jsonReader.nextLong());
                    break;
                case "arch":
                    aVarBuilder.setArch(jsonReader.nextInt());
                    break;
                case "diskSpace":
                    aVarBuilder.setDiskSpace(jsonReader.nextLong());
                    break;
                case "cores":
                    aVarBuilder.setCores(jsonReader.nextInt());
                    break;
                case "model":
                    aVarBuilder.setModel(jsonReader.nextString());
                    break;
                case "state":
                    aVarBuilder.setState(jsonReader.nextInt());
                    break;
                case "modelClass":
                    aVarBuilder.setModelClass(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return aVarBuilder.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @efb
    public static z33.AbstractC15965f.d parseEvent(@efb JsonReader jsonReader) throws IOException {
        z33.AbstractC15965f.d.b bVarBuilder = z33.AbstractC15965f.d.builder();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "device":
                    bVarBuilder.setDevice(parseEventDevice(jsonReader));
                    break;
                case "rollouts":
                    bVarBuilder.setRollouts(parseEventRolloutsState(jsonReader));
                    break;
                case "app":
                    bVarBuilder.setApp(parseEventApp(jsonReader));
                    break;
                case "log":
                    bVarBuilder.setLog(parseEventLog(jsonReader));
                    break;
                case "type":
                    bVarBuilder.setType(jsonReader.nextString());
                    break;
                case "timestamp":
                    bVarBuilder.setTimestamp(jsonReader.nextLong());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return bVarBuilder.build();
    }

    @efb
    private static z33.AbstractC15965f.d.a parseEventApp(@efb JsonReader jsonReader) throws IOException {
        z33.AbstractC15965f.d.a.AbstractC16568a abstractC16568aBuilder = z33.AbstractC15965f.d.a.builder();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "appProcessDetails":
                    abstractC16568aBuilder.setAppProcessDetails(parseArray(jsonReader, new InterfaceC8191a() { // from class: e43
                        @Override // p000.k43.InterfaceC8191a
                        public final Object parse(JsonReader jsonReader2) {
                            return k43.parseProcessDetails(jsonReader2);
                        }
                    }));
                    break;
                case "background":
                    abstractC16568aBuilder.setBackground(Boolean.valueOf(jsonReader.nextBoolean()));
                    break;
                case "execution":
                    abstractC16568aBuilder.setExecution(parseEventExecution(jsonReader));
                    break;
                case "internalKeys":
                    abstractC16568aBuilder.setInternalKeys(parseArray(jsonReader, new InterfaceC8191a() { // from class: d43
                        @Override // p000.k43.InterfaceC8191a
                        public final Object parse(JsonReader jsonReader2) {
                            return k43.parseCustomAttribute(jsonReader2);
                        }
                    }));
                    break;
                case "customAttributes":
                    abstractC16568aBuilder.setCustomAttributes(parseArray(jsonReader, new InterfaceC8191a() { // from class: d43
                        @Override // p000.k43.InterfaceC8191a
                        public final Object parse(JsonReader jsonReader2) {
                            return k43.parseCustomAttribute(jsonReader2);
                        }
                    }));
                    break;
                case "uiOrientation":
                    abstractC16568aBuilder.setUiOrientation(jsonReader.nextInt());
                    break;
                case "currentProcessDetails":
                    abstractC16568aBuilder.setCurrentProcessDetails(parseProcessDetails(jsonReader));
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return abstractC16568aBuilder.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @efb
    public static z33.AbstractC15965f.d.a.b.AbstractC16569a parseEventBinaryImage(@efb JsonReader jsonReader) throws IOException {
        z33.AbstractC15965f.d.a.b.AbstractC16569a.AbstractC16570a abstractC16570aBuilder = z33.AbstractC15965f.d.a.b.AbstractC16569a.builder();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "name":
                    abstractC16570aBuilder.setName(jsonReader.nextString());
                    break;
                case "size":
                    abstractC16570aBuilder.setSize(jsonReader.nextLong());
                    break;
                case "uuid":
                    abstractC16570aBuilder.setUuidFromUtf8Bytes(Base64.decode(jsonReader.nextString(), 2));
                    break;
                case "baseAddress":
                    abstractC16570aBuilder.setBaseAddress(jsonReader.nextLong());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return abstractC16570aBuilder.build();
    }

    @efb
    private static z33.AbstractC15965f.d.c parseEventDevice(@efb JsonReader jsonReader) throws IOException {
        z33.AbstractC15965f.d.c.a aVarBuilder = z33.AbstractC15965f.d.c.builder();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "batteryLevel":
                    aVarBuilder.setBatteryLevel(Double.valueOf(jsonReader.nextDouble()));
                    break;
                case "batteryVelocity":
                    aVarBuilder.setBatteryVelocity(jsonReader.nextInt());
                    break;
                case "orientation":
                    aVarBuilder.setOrientation(jsonReader.nextInt());
                    break;
                case "diskUsed":
                    aVarBuilder.setDiskUsed(jsonReader.nextLong());
                    break;
                case "ramUsed":
                    aVarBuilder.setRamUsed(jsonReader.nextLong());
                    break;
                case "proximityOn":
                    aVarBuilder.setProximityOn(jsonReader.nextBoolean());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return aVarBuilder.build();
    }

    @efb
    private static z33.AbstractC15965f.d.a.b parseEventExecution(@efb JsonReader jsonReader) throws IOException {
        z33.AbstractC15965f.d.a.b.AbstractC16571b abstractC16571bBuilder = z33.AbstractC15965f.d.a.b.builder();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "appExitInfo":
                    abstractC16571bBuilder.setAppExitInfo(parseAppExitInfo(jsonReader));
                    break;
                case "threads":
                    abstractC16571bBuilder.setThreads(parseArray(jsonReader, new InterfaceC8191a() { // from class: g43
                        @Override // p000.k43.InterfaceC8191a
                        public final Object parse(JsonReader jsonReader2) {
                            return k43.parseEventThread(jsonReader2);
                        }
                    }));
                    break;
                case "signal":
                    abstractC16571bBuilder.setSignal(parseEventSignal(jsonReader));
                    break;
                case "binaries":
                    abstractC16571bBuilder.setBinaries(parseArray(jsonReader, new InterfaceC8191a() { // from class: h43
                        @Override // p000.k43.InterfaceC8191a
                        public final Object parse(JsonReader jsonReader2) {
                            return k43.parseEventBinaryImage(jsonReader2);
                        }
                    }));
                    break;
                case "exception":
                    abstractC16571bBuilder.setException(parseEventExecutionException(jsonReader));
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return abstractC16571bBuilder.build();
    }

    @efb
    private static z33.AbstractC15965f.d.a.b.c parseEventExecutionException(@efb JsonReader jsonReader) throws IOException {
        z33.AbstractC15965f.d.a.b.c.AbstractC16572a abstractC16572aBuilder = z33.AbstractC15965f.d.a.b.c.builder();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "frames":
                    abstractC16572aBuilder.setFrames(parseArray(jsonReader, new b43()));
                    break;
                case "reason":
                    abstractC16572aBuilder.setReason(jsonReader.nextString());
                    break;
                case "type":
                    abstractC16572aBuilder.setType(jsonReader.nextString());
                    break;
                case "causedBy":
                    abstractC16572aBuilder.setCausedBy(parseEventExecutionException(jsonReader));
                    break;
                case "overflowCount":
                    abstractC16572aBuilder.setOverflowCount(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return abstractC16572aBuilder.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @efb
    public static z33.AbstractC15965f.d.a.b.e.AbstractC16576b parseEventFrame(@efb JsonReader jsonReader) throws IOException {
        z33.AbstractC15965f.d.a.b.e.AbstractC16576b.AbstractC16577a abstractC16577aBuilder = z33.AbstractC15965f.d.a.b.e.AbstractC16576b.builder();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "offset":
                    abstractC16577aBuilder.setOffset(jsonReader.nextLong());
                    break;
                case "symbol":
                    abstractC16577aBuilder.setSymbol(jsonReader.nextString());
                    break;
                case "pc":
                    abstractC16577aBuilder.setPc(jsonReader.nextLong());
                    break;
                case "file":
                    abstractC16577aBuilder.setFile(jsonReader.nextString());
                    break;
                case "importance":
                    abstractC16577aBuilder.setImportance(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return abstractC16577aBuilder.build();
    }

    @efb
    private static z33.AbstractC15965f.d.AbstractC16579d parseEventLog(@efb JsonReader jsonReader) throws IOException {
        z33.AbstractC15965f.d.AbstractC16579d.a aVarBuilder = z33.AbstractC15965f.d.AbstractC16579d.builder();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            if (jsonReader.nextName().equals("content")) {
                aVarBuilder.setContent(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return aVarBuilder.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @efb
    public static z33.AbstractC15965f.d.e parseEventRolloutsAssignment(@efb JsonReader jsonReader) throws IOException {
        z33.AbstractC15965f.d.e.a aVarBuilder = z33.AbstractC15965f.d.e.builder();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "parameterKey":
                    aVarBuilder.setParameterKey(jsonReader.nextString());
                    break;
                case "templateVersion":
                    aVarBuilder.setTemplateVersion(jsonReader.nextLong());
                    break;
                case "rolloutVariant":
                    aVarBuilder.setRolloutVariant(parseRolloutAssignmentRolloutVariant(jsonReader));
                    break;
                case "parameterValue":
                    aVarBuilder.setParameterValue(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return aVarBuilder.build();
    }

    @efb
    private static z33.AbstractC15965f.d.f parseEventRolloutsState(@efb JsonReader jsonReader) throws IOException {
        z33.AbstractC15965f.d.f.a aVarBuilder = z33.AbstractC15965f.d.f.builder();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            if (strNextName.equals("assignments")) {
                aVarBuilder.setRolloutAssignments(parseArray(jsonReader, new InterfaceC8191a() { // from class: j43
                    @Override // p000.k43.InterfaceC8191a
                    public final Object parse(JsonReader jsonReader2) {
                        return k43.parseEventRolloutsAssignment(jsonReader2);
                    }
                }));
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return aVarBuilder.build();
    }

    @efb
    private static z33.AbstractC15965f.d.a.b.AbstractC16573d parseEventSignal(@efb JsonReader jsonReader) throws IOException {
        z33.AbstractC15965f.d.a.b.AbstractC16573d.AbstractC16574a abstractC16574aBuilder = z33.AbstractC15965f.d.a.b.AbstractC16573d.builder();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "address":
                    abstractC16574aBuilder.setAddress(jsonReader.nextLong());
                    break;
                case "code":
                    abstractC16574aBuilder.setCode(jsonReader.nextString());
                    break;
                case "name":
                    abstractC16574aBuilder.setName(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return abstractC16574aBuilder.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @efb
    public static z33.AbstractC15965f.d.a.b.e parseEventThread(@efb JsonReader jsonReader) throws IOException {
        z33.AbstractC15965f.d.a.b.e.AbstractC16575a abstractC16575aBuilder = z33.AbstractC15965f.d.a.b.e.builder();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "frames":
                    abstractC16575aBuilder.setFrames(parseArray(jsonReader, new b43()));
                    break;
                case "name":
                    abstractC16575aBuilder.setName(jsonReader.nextString());
                    break;
                case "importance":
                    abstractC16575aBuilder.setImportance(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return abstractC16575aBuilder.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @efb
    public static z33.AbstractC15964e.b parseFile(@efb JsonReader jsonReader) throws IOException {
        z33.AbstractC15964e.b.a aVarBuilder = z33.AbstractC15964e.b.builder();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            if (strNextName.equals(MediaInformation.KEY_FILENAME)) {
                aVarBuilder.setFilename(jsonReader.nextString());
            } else if (strNextName.equals("contents")) {
                aVarBuilder.setContents(Base64.decode(jsonReader.nextString(), 2));
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return aVarBuilder.build();
    }

    @efb
    private static z33.AbstractC15964e parseNdkPayload(@efb JsonReader jsonReader) throws IOException {
        z33.AbstractC15964e.a aVarBuilder = z33.AbstractC15964e.builder();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            if (strNextName.equals("files")) {
                aVarBuilder.setFiles(parseArray(jsonReader, new InterfaceC8191a() { // from class: i43
                    @Override // p000.k43.InterfaceC8191a
                    public final Object parse(JsonReader jsonReader2) {
                        return k43.parseFile(jsonReader2);
                    }
                }));
            } else if (strNextName.equals("orgId")) {
                aVarBuilder.setOrgId(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return aVarBuilder.build();
    }

    @efb
    private static z33.AbstractC15965f.e parseOs(@efb JsonReader jsonReader) throws IOException {
        z33.AbstractC15965f.e.a aVarBuilder = z33.AbstractC15965f.e.builder();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "buildVersion":
                    aVarBuilder.setBuildVersion(jsonReader.nextString());
                    break;
                case "jailbroken":
                    aVarBuilder.setJailbroken(jsonReader.nextBoolean());
                    break;
                case "version":
                    aVarBuilder.setVersion(jsonReader.nextString());
                    break;
                case "platform":
                    aVarBuilder.setPlatform(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return aVarBuilder.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @efb
    public static z33.AbstractC15965f.d.a.c parseProcessDetails(@efb JsonReader jsonReader) throws IOException {
        z33.AbstractC15965f.d.a.c.AbstractC16578a abstractC16578aBuilder = z33.AbstractC15965f.d.a.c.builder();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "pid":
                    abstractC16578aBuilder.setPid(jsonReader.nextInt());
                    break;
                case "processName":
                    abstractC16578aBuilder.setProcessName(jsonReader.nextString());
                    break;
                case "defaultProcess":
                    abstractC16578aBuilder.setDefaultProcess(jsonReader.nextBoolean());
                    break;
                case "importance":
                    abstractC16578aBuilder.setImportance(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return abstractC16578aBuilder.build();
    }

    @efb
    private static z33 parseReport(@efb JsonReader jsonReader) throws IOException {
        z33.AbstractC15962c abstractC15962cBuilder = z33.builder();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "ndkPayload":
                    abstractC15962cBuilder.setNdkPayload(parseNdkPayload(jsonReader));
                    break;
                case "sdkVersion":
                    abstractC15962cBuilder.setSdkVersion(jsonReader.nextString());
                    break;
                case "appQualitySessionId":
                    abstractC15962cBuilder.setAppQualitySessionId(jsonReader.nextString());
                    break;
                case "appExitInfo":
                    abstractC15962cBuilder.setAppExitInfo(parseAppExitInfo(jsonReader));
                    break;
                case "buildVersion":
                    abstractC15962cBuilder.setBuildVersion(jsonReader.nextString());
                    break;
                case "firebaseAuthenticationToken":
                    abstractC15962cBuilder.setFirebaseAuthenticationToken(jsonReader.nextString());
                    break;
                case "gmpAppId":
                    abstractC15962cBuilder.setGmpAppId(jsonReader.nextString());
                    break;
                case "installationUuid":
                    abstractC15962cBuilder.setInstallationUuid(jsonReader.nextString());
                    break;
                case "firebaseInstallationId":
                    abstractC15962cBuilder.setFirebaseInstallationId(jsonReader.nextString());
                    break;
                case "platform":
                    abstractC15962cBuilder.setPlatform(jsonReader.nextInt());
                    break;
                case "displayVersion":
                    abstractC15962cBuilder.setDisplayVersion(jsonReader.nextString());
                    break;
                case "session":
                    abstractC15962cBuilder.setSession(parseSession(jsonReader));
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return abstractC15962cBuilder.build();
    }

    @efb
    private static z33.AbstractC15965f.d.e.b parseRolloutAssignmentRolloutVariant(@efb JsonReader jsonReader) throws IOException {
        z33.AbstractC15965f.d.e.b.a aVarBuilder = z33.AbstractC15965f.d.e.b.builder();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            if (strNextName.equals(nae.f63812b)) {
                aVarBuilder.setVariantId(jsonReader.nextString());
            } else if (strNextName.equals(nae.f63811a)) {
                aVarBuilder.setRolloutId(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return aVarBuilder.build();
    }

    @efb
    private static z33.AbstractC15965f parseSession(@efb JsonReader jsonReader) throws IOException {
        z33.AbstractC15965f.b bVarBuilder = z33.AbstractC15965f.builder();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "startedAt":
                    bVarBuilder.setStartedAt(jsonReader.nextLong());
                    break;
                case "appQualitySessionId":
                    bVarBuilder.setAppQualitySessionId(jsonReader.nextString());
                    break;
                case "identifier":
                    bVarBuilder.setIdentifierFromUtf8Bytes(Base64.decode(jsonReader.nextString(), 2));
                    break;
                case "endedAt":
                    bVarBuilder.setEndedAt(Long.valueOf(jsonReader.nextLong()));
                    break;
                case "device":
                    bVarBuilder.setDevice(parseDevice(jsonReader));
                    break;
                case "events":
                    bVarBuilder.setEvents(parseArray(jsonReader, new InterfaceC8191a() { // from class: f43
                        @Override // p000.k43.InterfaceC8191a
                        public final Object parse(JsonReader jsonReader2) {
                            return k43.parseEvent(jsonReader2);
                        }
                    }));
                    break;
                case "os":
                    bVarBuilder.setOs(parseOs(jsonReader));
                    break;
                case "app":
                    bVarBuilder.setApp(parseApp(jsonReader));
                    break;
                case "user":
                    bVarBuilder.setUser(parseUser(jsonReader));
                    break;
                case "generator":
                    bVarBuilder.setGenerator(jsonReader.nextString());
                    break;
                case "crashed":
                    bVarBuilder.setCrashed(jsonReader.nextBoolean());
                    break;
                case "generatorType":
                    bVarBuilder.setGeneratorType(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return bVarBuilder.build();
    }

    @efb
    private static z33.AbstractC15965f.f parseUser(@efb JsonReader jsonReader) throws IOException {
        z33.AbstractC15965f.f.a aVarBuilder = z33.AbstractC15965f.f.builder();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            if (jsonReader.nextName().equals("identifier")) {
                aVarBuilder.setIdentifier(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return aVarBuilder.build();
    }

    @efb
    public z33.AbstractC15960a applicationExitInfoFromJson(@efb String str) throws IOException {
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            try {
                z33.AbstractC15960a appExitInfo = parseAppExitInfo(jsonReader);
                jsonReader.close();
                return appExitInfo;
            } finally {
            }
        } catch (IllegalStateException e) {
            throw new IOException(e);
        }
    }

    @efb
    public String applicationExitInfoToJson(@efb z33.AbstractC15960a abstractC15960a) {
        return f52559a.encode(abstractC15960a);
    }

    @efb
    public z33.AbstractC15965f.d eventFromJson(@efb String str) throws IOException {
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            try {
                z33.AbstractC15965f.d event = parseEvent(jsonReader);
                jsonReader.close();
                return event;
            } finally {
            }
        } catch (IllegalStateException e) {
            throw new IOException(e);
        }
    }

    @efb
    public String eventToJson(@efb z33.AbstractC15965f.d dVar) {
        return f52559a.encode(dVar);
    }

    @efb
    public z33 reportFromJson(@efb String str) throws IOException {
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            try {
                z33 report = parseReport(jsonReader);
                jsonReader.close();
                return report;
            } finally {
            }
        } catch (IllegalStateException e) {
            throw new IOException(e);
        }
    }

    @efb
    public String reportToJson(@efb z33 z33Var) {
        return f52559a.encode(z33Var);
    }
}
