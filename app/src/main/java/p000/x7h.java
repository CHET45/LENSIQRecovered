package p000;

import android.os.Bundle;
import androidx.media3.common.C1213a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import p000.x7h;

/* JADX INFO: loaded from: classes3.dex */
public final class x7h {

    /* JADX INFO: renamed from: b */
    public static final x7h f97105b = new x7h(kx7.m15110of());

    /* JADX INFO: renamed from: c */
    public static final String f97106c = t0i.intToStringMaxRadix(0);

    /* JADX INFO: renamed from: a */
    public final kx7<C14971a> f97107a;

    /* JADX INFO: renamed from: x7h$a */
    public static final class C14971a {

        /* JADX INFO: renamed from: f */
        public static final String f97108f = t0i.intToStringMaxRadix(0);

        /* JADX INFO: renamed from: g */
        public static final String f97109g = t0i.intToStringMaxRadix(1);

        /* JADX INFO: renamed from: h */
        public static final String f97110h = t0i.intToStringMaxRadix(3);

        /* JADX INFO: renamed from: i */
        public static final String f97111i = t0i.intToStringMaxRadix(4);

        /* JADX INFO: renamed from: a */
        public final int f97112a;

        /* JADX INFO: renamed from: b */
        public final h6h f97113b;

        /* JADX INFO: renamed from: c */
        public final boolean f97114c;

        /* JADX INFO: renamed from: d */
        public final int[] f97115d;

        /* JADX INFO: renamed from: e */
        public final boolean[] f97116e;

        @ovh
        public C14971a(h6h h6hVar, boolean z, int[] iArr, boolean[] zArr) {
            int i = h6hVar.f42518a;
            this.f97112a = i;
            boolean z2 = false;
            v80.checkArgument(i == iArr.length && i == zArr.length);
            this.f97113b = h6hVar;
            if (z && i > 1) {
                z2 = true;
            }
            this.f97114c = z2;
            this.f97115d = (int[]) iArr.clone();
            this.f97116e = (boolean[]) zArr.clone();
        }

        @ovh
        public static C14971a fromBundle(Bundle bundle) {
            h6h h6hVarFromBundle = h6h.fromBundle((Bundle) v80.checkNotNull(bundle.getBundle(f97108f)));
            return new C14971a(h6hVarFromBundle, bundle.getBoolean(f97111i, false), (int[]) yya.firstNonNull(bundle.getIntArray(f97109g), new int[h6hVarFromBundle.f42518a]), (boolean[]) yya.firstNonNull(bundle.getBooleanArray(f97110h), new boolean[h6hVarFromBundle.f42518a]));
        }

        @ovh
        public C14971a copyWithId(String str) {
            return new C14971a(this.f97113b.copyWithId(str), this.f97114c, this.f97115d, this.f97116e);
        }

        public boolean equals(@hib Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C14971a.class != obj.getClass()) {
                return false;
            }
            C14971a c14971a = (C14971a) obj;
            return this.f97114c == c14971a.f97114c && this.f97113b.equals(c14971a.f97113b) && Arrays.equals(this.f97115d, c14971a.f97115d) && Arrays.equals(this.f97116e, c14971a.f97116e);
        }

        public h6h getMediaTrackGroup() {
            return this.f97113b;
        }

        public C1213a getTrackFormat(int i) {
            return this.f97113b.getFormat(i);
        }

        @ovh
        public int getTrackSupport(int i) {
            return this.f97115d[i];
        }

        public int getType() {
            return this.f97113b.f42520c;
        }

        public int hashCode() {
            return (((((this.f97113b.hashCode() * 31) + (this.f97114c ? 1 : 0)) * 31) + Arrays.hashCode(this.f97115d)) * 31) + Arrays.hashCode(this.f97116e);
        }

        public boolean isAdaptiveSupported() {
            return this.f97114c;
        }

        public boolean isSelected() {
            return hb1.contains(this.f97116e, true);
        }

        public boolean isSupported() {
            return isSupported(false);
        }

        public boolean isTrackSelected(int i) {
            return this.f97116e[i];
        }

        public boolean isTrackSupported(int i) {
            return isTrackSupported(i, false);
        }

        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putBundle(f97108f, this.f97113b.toBundle());
            bundle.putIntArray(f97109g, this.f97115d);
            bundle.putBooleanArray(f97110h, this.f97116e);
            bundle.putBoolean(f97111i, this.f97114c);
            return bundle;
        }

        public boolean isSupported(boolean z) {
            for (int i = 0; i < this.f97115d.length; i++) {
                if (isTrackSupported(i, z)) {
                    return true;
                }
            }
            return false;
        }

        public boolean isTrackSupported(int i, boolean z) {
            int i2 = this.f97115d[i];
            return i2 == 4 || (z && i2 == 3);
        }
    }

    @ovh
    public x7h(List<C14971a> list) {
        this.f97107a = kx7.copyOf((Collection) list);
    }

    @ovh
    public static x7h fromBundle(Bundle bundle) {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(f97106c);
        return new x7h(parcelableArrayList == null ? kx7.m15110of() : og1.fromBundleList(new lz6() { // from class: v7h
            @Override // p000.lz6
            public final Object apply(Object obj) {
                return x7h.C14971a.fromBundle((Bundle) obj);
            }
        }, parcelableArrayList));
    }

    public boolean containsType(int i) {
        for (int i2 = 0; i2 < this.f97107a.size(); i2++) {
            if (this.f97107a.get(i2).getType() == i) {
                return true;
            }
        }
        return false;
    }

    public boolean equals(@hib Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || x7h.class != obj.getClass()) {
            return false;
        }
        return this.f97107a.equals(((x7h) obj).f97107a);
    }

    public kx7<C14971a> getGroups() {
        return this.f97107a;
    }

    public int hashCode() {
        return this.f97107a.hashCode();
    }

    public boolean isEmpty() {
        return this.f97107a.isEmpty();
    }

    public boolean isTypeSelected(int i) {
        for (int i2 = 0; i2 < this.f97107a.size(); i2++) {
            C14971a c14971a = this.f97107a.get(i2);
            if (c14971a.isSelected() && c14971a.getType() == i) {
                return true;
            }
        }
        return false;
    }

    public boolean isTypeSupported(int i) {
        return isTypeSupported(i, false);
    }

    @ovh
    @Deprecated
    public boolean isTypeSupportedOrEmpty(int i) {
        return isTypeSupportedOrEmpty(i, false);
    }

    @ovh
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(f97106c, og1.toBundleArrayList(this.f97107a, new lz6() { // from class: u7h
            @Override // p000.lz6
            public final Object apply(Object obj) {
                return ((x7h.C14971a) obj).toBundle();
            }
        }));
        return bundle;
    }

    public boolean isTypeSupported(int i, boolean z) {
        for (int i2 = 0; i2 < this.f97107a.size(); i2++) {
            if (this.f97107a.get(i2).getType() == i && this.f97107a.get(i2).isSupported(z)) {
                return true;
            }
        }
        return false;
    }

    @ovh
    @Deprecated
    public boolean isTypeSupportedOrEmpty(int i, boolean z) {
        return !containsType(i) || isTypeSupported(i, z);
    }
}
