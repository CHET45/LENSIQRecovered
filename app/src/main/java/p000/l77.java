package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p000.y3f;

/* JADX INFO: loaded from: classes7.dex */
@x98
public final class l77 {

    /* JADX INFO: renamed from: a */
    public static List<d42> f56684a;

    /* JADX INFO: renamed from: b */
    public static List<j3f> f56685b;

    /* JADX INFO: renamed from: c */
    public static List<y3f.AbstractC15412a> f56686c;

    /* JADX INFO: renamed from: d */
    public static boolean f56687d;

    /* JADX INFO: renamed from: e */
    public static boolean f56688e;

    private l77() {
    }

    /* JADX INFO: renamed from: a */
    public static synchronized List<d42> m15954a() {
        f56688e = true;
        return f56684a;
    }

    /* JADX INFO: renamed from: b */
    public static synchronized List<j3f> m15955b() {
        f56688e = true;
        return f56685b;
    }

    /* JADX INFO: renamed from: c */
    public static synchronized List<y3f.AbstractC15412a> m15956c() {
        f56688e = true;
        return f56686c;
    }

    /* JADX INFO: renamed from: d */
    public static synchronized void m15957d(List<d42> list, List<j3f> list2, List<y3f.AbstractC15412a> list3) {
        if (f56688e) {
            throw new IllegalStateException("Set cannot be called after any get call");
        }
        if (f56687d) {
            throw new IllegalStateException("Global interceptors and tracers are already set");
        }
        v7d.checkNotNull(list);
        v7d.checkNotNull(list2);
        v7d.checkNotNull(list3);
        f56684a = Collections.unmodifiableList(new ArrayList(list));
        f56685b = Collections.unmodifiableList(new ArrayList(list2));
        f56686c = Collections.unmodifiableList(new ArrayList(list3));
        f56687d = true;
    }
}
