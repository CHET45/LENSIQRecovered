package p000;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class vnc {

    /* JADX INFO: renamed from: a */
    @hib
    public final String f91792a;

    /* JADX INFO: renamed from: b */
    public final long f91793b;

    /* JADX INFO: renamed from: c */
    public final List<C8362kh> f91794c;

    /* JADX INFO: renamed from: d */
    public final List<a75> f91795d;

    /* JADX INFO: renamed from: e */
    @hib
    public final k74 f91796e;

    public vnc(@hib String str, long j, List<C8362kh> list) {
        this(str, j, list, Collections.emptyList(), null);
    }

    public int getAdaptationSetIndex(int i) {
        int size = this.f91794c.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.f91794c.get(i2).f54057b == i) {
                return i2;
            }
        }
        return -1;
    }

    public vnc(@hib String str, long j, List<C8362kh> list, List<a75> list2) {
        this(str, j, list, list2, null);
    }

    public vnc(@hib String str, long j, List<C8362kh> list, List<a75> list2, @hib k74 k74Var) {
        this.f91792a = str;
        this.f91793b = j;
        this.f91794c = Collections.unmodifiableList(list);
        this.f91795d = Collections.unmodifiableList(list2);
        this.f91796e = k74Var;
    }
}
