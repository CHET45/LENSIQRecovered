package p000;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class tsh extends RuntimeException {
    private static final long serialVersionUID = -7466929953374883507L;

    /* JADX INFO: renamed from: a */
    public final List<String> f85766a;

    public tsh(final psa message) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
        this.f85766a = null;
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

    public be8 asInvalidProtocolBufferException() {
        return new be8(getMessage());
    }

    public List<String> getMissingFields() {
        return Collections.unmodifiableList(this.f85766a);
    }

    public tsh(final List<String> missingFields) {
        super(buildDescription(missingFields));
        this.f85766a = missingFields;
    }
}
