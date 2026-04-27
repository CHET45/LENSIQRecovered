package p000;

import android.util.JsonReader;
import android.util.JsonToken;
import com.google.auto.value.AutoValue;
import java.io.IOException;
import java.io.Reader;

/* JADX INFO: loaded from: classes4.dex */
@AutoValue
public abstract class oi9 {

    /* JADX INFO: renamed from: a */
    public static final String f67744a = "LogResponseInternal";

    /* JADX INFO: renamed from: a */
    public static oi9 m18715a(long j) {
        return new il0(j);
    }

    @efb
    public static oi9 fromJson(@efb Reader reader) throws IOException {
        JsonReader jsonReader = new JsonReader(reader);
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                if (jsonReader.nextName().equals("nextRequestWaitMillis")) {
                    return jsonReader.peek() == JsonToken.STRING ? m18715a(Long.parseLong(jsonReader.nextString())) : m18715a(jsonReader.nextLong());
                }
                jsonReader.skipValue();
            }
            throw new IOException("Response is missing nextRequestWaitMillis field.");
        } finally {
            jsonReader.close();
        }
    }

    public abstract long getNextRequestWaitMillis();
}
