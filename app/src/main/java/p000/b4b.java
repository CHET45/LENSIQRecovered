package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class b4b extends Exception {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: a */
    public final List<Throwable> f12676a;

    public b4b(List<Throwable> list) {
        this.f12676a = new ArrayList(list);
    }

    public static void assertEmpty(List<Throwable> list) throws Exception {
        if (list.isEmpty()) {
            return;
        }
        if (list.size() != 1) {
            throw new c4b(list);
        }
        throw czg.rethrowAsException(list.get(0));
    }

    public List<Throwable> getFailures() {
        return Collections.unmodifiableList(this.f12676a);
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        StringBuilder sb = new StringBuilder(String.format("There were %d errors:", Integer.valueOf(this.f12676a.size())));
        for (Throwable th : this.f12676a) {
            sb.append(String.format("\n  %s(%s)", th.getClass().getName(), th.getMessage()));
        }
        return sb.toString();
    }
}
