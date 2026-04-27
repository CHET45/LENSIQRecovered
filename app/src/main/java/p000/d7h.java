package p000;

import android.os.Bundle;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import p000.gh1;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class d7h implements gh1 {

    /* JADX INFO: renamed from: c */
    public static final String f28717c = x0i.intToStringMaxRadix(0);

    /* JADX INFO: renamed from: d */
    public static final String f28718d = x0i.intToStringMaxRadix(1);

    /* JADX INFO: renamed from: e */
    public static final gh1.InterfaceC6311a<d7h> f28719e = new gh1.InterfaceC6311a() { // from class: c7h
        @Override // p000.gh1.InterfaceC6311a
        public final gh1 fromBundle(Bundle bundle) {
            return d7h.lambda$static$0(bundle);
        }
    };

    /* JADX INFO: renamed from: a */
    public final g6h f28720a;

    /* JADX INFO: renamed from: b */
    public final kx7<Integer> f28721b;

    public d7h(g6h g6hVar, int i) {
        this(g6hVar, kx7.m15111of(Integer.valueOf(i)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ d7h lambda$static$0(Bundle bundle) {
        return new d7h((g6h) g6h.f38904F.fromBundle((Bundle) u80.checkNotNull(bundle.getBundle(f28717c))), rd8.asList((int[]) u80.checkNotNull(bundle.getIntArray(f28718d))));
    }

    public boolean equals(@hib Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d7h.class != obj.getClass()) {
            return false;
        }
        d7h d7hVar = (d7h) obj;
        return this.f28720a.equals(d7hVar.f28720a) && this.f28721b.equals(d7hVar.f28721b);
    }

    public int getType() {
        return this.f28720a.f38909c;
    }

    public int hashCode() {
        return this.f28720a.hashCode() + (this.f28721b.hashCode() * 31);
    }

    @Override // p000.gh1
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putBundle(f28717c, this.f28720a.toBundle());
        bundle.putIntArray(f28718d, rd8.toArray(this.f28721b));
        return bundle;
    }

    public d7h(g6h g6hVar, List<Integer> list) {
        if (!list.isEmpty() && (((Integer) Collections.min(list)).intValue() < 0 || ((Integer) Collections.max(list)).intValue() >= g6hVar.f38907a)) {
            throw new IndexOutOfBoundsException();
        }
        this.f28720a = g6hVar;
        this.f28721b = kx7.copyOf((Collection) list);
    }
}
