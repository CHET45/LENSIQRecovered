package p000;

import android.os.Bundle;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class e7h {

    /* JADX INFO: renamed from: c */
    public static final String f32077c = t0i.intToStringMaxRadix(0);

    /* JADX INFO: renamed from: d */
    public static final String f32078d = t0i.intToStringMaxRadix(1);

    /* JADX INFO: renamed from: a */
    public final h6h f32079a;

    /* JADX INFO: renamed from: b */
    public final kx7<Integer> f32080b;

    public e7h(h6h h6hVar, int i) {
        this(h6hVar, kx7.m15111of(Integer.valueOf(i)));
    }

    @ovh
    public static e7h fromBundle(Bundle bundle) {
        return new e7h(h6h.fromBundle((Bundle) v80.checkNotNull(bundle.getBundle(f32077c))), rd8.asList((int[]) v80.checkNotNull(bundle.getIntArray(f32078d))));
    }

    public boolean equals(@hib Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e7h.class != obj.getClass()) {
            return false;
        }
        e7h e7hVar = (e7h) obj;
        return this.f32079a.equals(e7hVar.f32079a) && this.f32080b.equals(e7hVar.f32080b);
    }

    public int getType() {
        return this.f32079a.f42520c;
    }

    public int hashCode() {
        return this.f32079a.hashCode() + (this.f32080b.hashCode() * 31);
    }

    @ovh
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putBundle(f32077c, this.f32079a.toBundle());
        bundle.putIntArray(f32078d, rd8.toArray(this.f32080b));
        return bundle;
    }

    public e7h(h6h h6hVar, List<Integer> list) {
        if (!list.isEmpty() && (((Integer) Collections.min(list)).intValue() < 0 || ((Integer) Collections.max(list)).intValue() >= h6hVar.f42518a)) {
            throw new IndexOutOfBoundsException();
        }
        this.f32079a = h6hVar;
        this.f32080b = kx7.copyOf((Collection) list);
    }
}
