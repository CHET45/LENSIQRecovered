package p000;

import com.google.auto.value.AutoValue;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
@AutoValue
public abstract class ej7 {
    public static ej7 create(String str, List<String> list) {
        return new al0(str, list);
    }

    public abstract List<String> getUsedDates();

    public abstract String getUserAgent();
}
