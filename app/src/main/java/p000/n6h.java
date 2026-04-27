package p000;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class n6h {

    /* JADX INFO: renamed from: d */
    public static final String f63415d = "TrackGroupArray";

    /* JADX INFO: renamed from: e */
    public static final n6h f63416e = new n6h(new h6h[0]);

    /* JADX INFO: renamed from: f */
    public static final String f63417f = t0i.intToStringMaxRadix(0);

    /* JADX INFO: renamed from: a */
    public final int f63418a;

    /* JADX INFO: renamed from: b */
    public final kx7<h6h> f63419b;

    /* JADX INFO: renamed from: c */
    public int f63420c;

    public n6h(h6h... h6hVarArr) {
        this.f63419b = kx7.copyOf(h6hVarArr);
        this.f63418a = h6hVarArr.length;
        verifyCorrectness();
    }

    public static n6h fromBundle(Bundle bundle) {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(f63417f);
        return parcelableArrayList == null ? new n6h(new h6h[0]) : new n6h((h6h[]) og1.fromBundleList(new lz6() { // from class: l6h
            @Override // p000.lz6
            public final Object apply(Object obj) {
                return h6h.fromBundle((Bundle) obj);
            }
        }, parcelableArrayList).toArray(new h6h[0]));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Integer lambda$getTrackTypes$0(h6h h6hVar) {
        return Integer.valueOf(h6hVar.f42520c);
    }

    private void verifyCorrectness() {
        int i = 0;
        while (i < this.f63419b.size()) {
            int i2 = i + 1;
            for (int i3 = i2; i3 < this.f63419b.size(); i3++) {
                if (this.f63419b.get(i).equals(this.f63419b.get(i3))) {
                    xh9.m25145e("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i = i2;
        }
    }

    public boolean equals(@hib Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || n6h.class != obj.getClass()) {
            return false;
        }
        n6h n6hVar = (n6h) obj;
        return this.f63418a == n6hVar.f63418a && this.f63419b.equals(n6hVar.f63419b);
    }

    public h6h get(int i) {
        return this.f63419b.get(i);
    }

    public kx7<Integer> getTrackTypes() {
        return kx7.copyOf((Collection) eb9.transform(this.f63419b, new lz6() { // from class: j6h
            @Override // p000.lz6
            public final Object apply(Object obj) {
                return n6h.lambda$getTrackTypes$0((h6h) obj);
            }
        }));
    }

    public int hashCode() {
        if (this.f63420c == 0) {
            this.f63420c = this.f63419b.hashCode();
        }
        return this.f63420c;
    }

    public int indexOf(h6h h6hVar) {
        int iIndexOf = this.f63419b.indexOf(h6hVar);
        if (iIndexOf >= 0) {
            return iIndexOf;
        }
        return -1;
    }

    public boolean isEmpty() {
        return this.f63418a == 0;
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(f63417f, og1.toBundleArrayList(this.f63419b, new lz6() { // from class: k6h
            @Override // p000.lz6
            public final Object apply(Object obj) {
                return ((h6h) obj).toBundle();
            }
        }));
        return bundle;
    }

    public String toString() {
        return this.f63419b.toString();
    }
}
