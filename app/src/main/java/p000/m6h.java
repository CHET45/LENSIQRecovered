package p000;

import android.os.Bundle;
import java.util.ArrayList;
import p000.gh1;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class m6h implements gh1 {

    /* JADX INFO: renamed from: d */
    public static final String f60030d = "TrackGroupArray";

    /* JADX INFO: renamed from: e */
    public static final m6h f60031e = new m6h(new g6h[0]);

    /* JADX INFO: renamed from: f */
    public static final String f60032f = x0i.intToStringMaxRadix(0);

    /* JADX INFO: renamed from: m */
    public static final gh1.InterfaceC6311a<m6h> f60033m = new gh1.InterfaceC6311a() { // from class: i6h
        @Override // p000.gh1.InterfaceC6311a
        public final gh1 fromBundle(Bundle bundle) {
            return m6h.lambda$static$0(bundle);
        }
    };

    /* JADX INFO: renamed from: a */
    public final int f60034a;

    /* JADX INFO: renamed from: b */
    public final kx7<g6h> f60035b;

    /* JADX INFO: renamed from: c */
    public int f60036c;

    public m6h(g6h... g6hVarArr) {
        this.f60035b = kx7.copyOf(g6hVarArr);
        this.f60034a = g6hVarArr.length;
        verifyCorrectness();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ m6h lambda$static$0(Bundle bundle) {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(f60032f);
        return parcelableArrayList == null ? new m6h(new g6h[0]) : new m6h((g6h[]) ih1.fromBundleList(g6h.f38904F, parcelableArrayList).toArray(new g6h[0]));
    }

    private void verifyCorrectness() {
        int i = 0;
        while (i < this.f60035b.size()) {
            int i2 = i + 1;
            for (int i3 = i2; i3 < this.f60035b.size(); i3++) {
                if (this.f60035b.get(i).equals(this.f60035b.get(i3))) {
                    yh9.m25916e("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i = i2;
        }
    }

    public boolean equals(@hib Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m6h.class != obj.getClass()) {
            return false;
        }
        m6h m6hVar = (m6h) obj;
        return this.f60034a == m6hVar.f60034a && this.f60035b.equals(m6hVar.f60035b);
    }

    public g6h get(int i) {
        return this.f60035b.get(i);
    }

    public int hashCode() {
        if (this.f60036c == 0) {
            this.f60036c = this.f60035b.hashCode();
        }
        return this.f60036c;
    }

    public int indexOf(g6h g6hVar) {
        int iIndexOf = this.f60035b.indexOf(g6hVar);
        if (iIndexOf >= 0) {
            return iIndexOf;
        }
        return -1;
    }

    public boolean isEmpty() {
        return this.f60034a == 0;
    }

    @Override // p000.gh1
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(f60032f, ih1.toBundleArrayList(this.f60035b));
        return bundle;
    }
}
