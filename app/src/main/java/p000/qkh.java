package p000;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class qkh implements xdg {

    /* JADX INFO: renamed from: a */
    public final hkh f74776a;

    /* JADX INFO: renamed from: b */
    public final long[] f74777b;

    /* JADX INFO: renamed from: c */
    public final Map<String, pkh> f74778c;

    /* JADX INFO: renamed from: d */
    public final Map<String, kkh> f74779d;

    /* JADX INFO: renamed from: e */
    public final Map<String, String> f74780e;

    public qkh(hkh hkhVar, Map<String, pkh> map, Map<String, kkh> map2, Map<String, String> map3) {
        this.f74776a = hkhVar;
        this.f74779d = map2;
        this.f74780e = map3;
        this.f74778c = map != null ? Collections.unmodifiableMap(map) : Collections.emptyMap();
        this.f74777b = hkhVar.getEventTimesUs();
    }

    @fdi
    /* JADX INFO: renamed from: a */
    public Map<String, pkh> m20419a() {
        return this.f74778c;
    }

    @fdi
    /* JADX INFO: renamed from: b */
    public hkh m20420b() {
        return this.f74776a;
    }

    @Override // p000.xdg
    public List<o93> getCues(long j) {
        return this.f74776a.getCues(j, this.f74778c, this.f74779d, this.f74780e);
    }

    @Override // p000.xdg
    public long getEventTime(int i) {
        return this.f74777b[i];
    }

    @Override // p000.xdg
    public int getEventTimeCount() {
        return this.f74777b.length;
    }

    @Override // p000.xdg
    public int getNextEventTimeIndex(long j) {
        int iBinarySearchCeil = x0i.binarySearchCeil(this.f74777b, j, false, false);
        if (iBinarySearchCeil < this.f74777b.length) {
            return iBinarySearchCeil;
        }
        return -1;
    }
}
