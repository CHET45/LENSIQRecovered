package p000;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes5.dex */
public final class xr5 {

    /* JADX INFO: renamed from: b */
    public static final Pattern f99025b = Pattern.compile("[~*/\\[\\]]");

    /* JADX INFO: renamed from: c */
    public static final xr5 f99026c = new xr5(wr5.f95193b);

    /* JADX INFO: renamed from: a */
    public final wr5 f99027a;

    private xr5(List<String> list) {
        this.f99027a = wr5.fromSegments(list);
    }

    /* JADX INFO: renamed from: a */
    public static xr5 m25422a(@efb String str) {
        x7d.checkNotNull(str, "Provided field path must not be null.");
        x7d.checkArgument(!f99025b.matcher(str).find(), "Use FieldPath.of() for field names containing '~*/[]'.", new Object[0]);
        try {
            return m25423of(str.split("\\.", -1));
        } catch (IllegalArgumentException unused) {
            throw new IllegalArgumentException("Invalid field path (" + str + "). Paths must not be empty, begin with '.', end with '.', or contain '..'");
        }
    }

    @efb
    public static xr5 documentId() {
        return f99026c;
    }

    @efb
    /* JADX INFO: renamed from: of */
    public static xr5 m25423of(String... strArr) {
        x7d.checkArgument(strArr.length > 0, "Invalid field path. Provided path must not be empty.", new Object[0]);
        int i = 0;
        while (i < strArr.length) {
            String str = strArr[i];
            boolean z = (str == null || str.isEmpty()) ? false : true;
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid field name at argument ");
            i++;
            sb.append(i);
            sb.append(". Field names must not be null or empty.");
            x7d.checkArgument(z, sb.toString(), new Object[0]);
        }
        return new xr5((List<String>) Arrays.asList(strArr));
    }

    /* JADX INFO: renamed from: b */
    public wr5 m25424b() {
        return this.f99027a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || xr5.class != obj.getClass()) {
            return false;
        }
        return this.f99027a.equals(((xr5) obj).f99027a);
    }

    public int hashCode() {
        return this.f99027a.hashCode();
    }

    public String toString() {
        return this.f99027a.toString();
    }

    private xr5(wr5 wr5Var) {
        this.f99027a = wr5Var;
    }
}
