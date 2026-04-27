package p000;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class m1e implements l1e {

    /* JADX INFO: renamed from: a */
    public final Map<yfd, Object> f59644a = new HashMap(3);

    @Override // p000.l1e
    public <T> void clear(@efb yfd<T> yfdVar) {
        this.f59644a.remove(yfdVar);
    }

    @Override // p000.l1e
    public void clearAll() {
        this.f59644a.clear();
    }

    @Override // p000.l1e
    @hib
    public <T> T get(@efb yfd<T> yfdVar) {
        return (T) this.f59644a.get(yfdVar);
    }

    @Override // p000.l1e
    public <T> void set(@efb yfd<T> yfdVar, @hib T t) {
        if (t == null) {
            this.f59644a.remove(yfdVar);
        } else {
            this.f59644a.put(yfdVar, t);
        }
    }

    @Override // p000.l1e
    @efb
    public <T> T get(@efb yfd<T> yfdVar, @efb T t) {
        T t2 = (T) this.f59644a.get(yfdVar);
        return t2 != null ? t2 : t;
    }
}
