package p000;

import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: kh */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class C8362kh {

    /* JADX INFO: renamed from: g */
    public static final long f54055g = -1;

    /* JADX INFO: renamed from: a */
    public final long f54056a;

    /* JADX INFO: renamed from: b */
    public final int f54057b;

    /* JADX INFO: renamed from: c */
    public final List<n3e> f54058c;

    /* JADX INFO: renamed from: d */
    public final List<k74> f54059d;

    /* JADX INFO: renamed from: e */
    public final List<k74> f54060e;

    /* JADX INFO: renamed from: f */
    public final List<k74> f54061f;

    public C8362kh(long j, int i, List<n3e> list, List<k74> list2, List<k74> list3, List<k74> list4) {
        this.f54056a = j;
        this.f54057b = i;
        this.f54058c = Collections.unmodifiableList(list);
        this.f54059d = Collections.unmodifiableList(list2);
        this.f54060e = Collections.unmodifiableList(list3);
        this.f54061f = Collections.unmodifiableList(list4);
    }
}
