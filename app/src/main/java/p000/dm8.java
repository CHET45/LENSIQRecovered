package p000;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes7.dex */
public final class dm8 {

    /* JADX INFO: renamed from: a */
    public static final Logger f30046a = Logger.getLogger(dm8.class.getName());

    /* JADX INFO: renamed from: dm8$a */
    public static /* synthetic */ class C4862a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f30047a;

        static {
            int[] iArr = new int[JsonToken.values().length];
            f30047a = iArr;
            try {
                iArr[JsonToken.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f30047a[JsonToken.BEGIN_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f30047a[JsonToken.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f30047a[JsonToken.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f30047a[JsonToken.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f30047a[JsonToken.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    private dm8() {
    }

    public static Object parse(String str) throws IOException {
        JsonReader jsonReader = new JsonReader(new StringReader(str));
        try {
            return parseRecursive(jsonReader);
        } finally {
            try {
                jsonReader.close();
            } catch (IOException e) {
                f30046a.log(Level.WARNING, "Failed to close", (Throwable) e);
            }
        }
    }

    private static List<?> parseJsonArray(JsonReader jsonReader) throws IOException {
        jsonReader.beginArray();
        ArrayList arrayList = new ArrayList();
        while (jsonReader.hasNext()) {
            arrayList.add(parseRecursive(jsonReader));
        }
        v7d.checkState(jsonReader.peek() == JsonToken.END_ARRAY, "Bad token: " + jsonReader.getPath());
        jsonReader.endArray();
        return Collections.unmodifiableList(arrayList);
    }

    private static Void parseJsonNull(JsonReader jsonReader) throws IOException {
        jsonReader.nextNull();
        return null;
    }

    private static Map<String, ?> parseJsonObject(JsonReader jsonReader) throws IOException {
        jsonReader.beginObject();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        while (jsonReader.hasNext()) {
            linkedHashMap.put(jsonReader.nextName(), parseRecursive(jsonReader));
        }
        v7d.checkState(jsonReader.peek() == JsonToken.END_OBJECT, "Bad token: " + jsonReader.getPath());
        jsonReader.endObject();
        return Collections.unmodifiableMap(linkedHashMap);
    }

    private static Object parseRecursive(JsonReader jsonReader) throws IOException {
        v7d.checkState(jsonReader.hasNext(), "unexpected end of JSON");
        switch (C4862a.f30047a[jsonReader.peek().ordinal()]) {
            case 1:
                return parseJsonArray(jsonReader);
            case 2:
                return parseJsonObject(jsonReader);
            case 3:
                return jsonReader.nextString();
            case 4:
                return Double.valueOf(jsonReader.nextDouble());
            case 5:
                return Boolean.valueOf(jsonReader.nextBoolean());
            case 6:
                return parseJsonNull(jsonReader);
            default:
                throw new IllegalStateException("Bad token: " + jsonReader.getPath());
        }
    }
}
