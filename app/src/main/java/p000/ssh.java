package p000;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class ssh extends RuntimeException {
    private static final long serialVersionUID = -7466929953374883507L;

    /* JADX INFO: renamed from: a */
    public final List<String> f82799a;

    public ssh(final qsa message) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
        this.f82799a = null;
    }

    private static String buildDescription(final List<String> missingFields) {
        StringBuilder sb = new StringBuilder("Message missing required fields: ");
        boolean z = true;
        for (String str : missingFields) {
            if (z) {
                z = false;
            } else {
                sb.append(", ");
            }
            sb.append(str);
        }
        return sb.toString();
    }

    public ce8 asInvalidProtocolBufferException() {
        return new ce8(getMessage());
    }

    public List<String> getMissingFields() {
        return Collections.unmodifiableList(this.f82799a);
    }

    public ssh(final List<String> missingFields) {
        super(buildDescription(missingFields));
        this.f82799a = missingFields;
    }
}
