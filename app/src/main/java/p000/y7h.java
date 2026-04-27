package p000;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import p000.gh1;
import p000.y7h;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class y7h implements gh1 {

    /* JADX INFO: renamed from: b */
    public static final y7h f100701b = new y7h(kx7.m15110of());

    /* JADX INFO: renamed from: c */
    public static final String f100702c = x0i.intToStringMaxRadix(0);

    /* JADX INFO: renamed from: d */
    public static final gh1.InterfaceC6311a<y7h> f100703d = new gh1.InterfaceC6311a() { // from class: t7h
        @Override // p000.gh1.InterfaceC6311a
        public final gh1 fromBundle(Bundle bundle) {
            return y7h.lambda$static$0(bundle);
        }
    };

    /* JADX INFO: renamed from: a */
    public final kx7<C15542a> f100704a;

    /* JADX INFO: renamed from: y7h$a */
    public static final class C15542a implements gh1 {

        /* JADX INFO: renamed from: a */
        public final int f100710a;

        /* JADX INFO: renamed from: b */
        public final g6h f100711b;

        /* JADX INFO: renamed from: c */
        public final boolean f100712c;

        /* JADX INFO: renamed from: d */
        public final int[] f100713d;

        /* JADX INFO: renamed from: e */
        public final boolean[] f100714e;

        /* JADX INFO: renamed from: f */
        public static final String f100708f = x0i.intToStringMaxRadix(0);

        /* JADX INFO: renamed from: m */
        public static final String f100709m = x0i.intToStringMaxRadix(1);

        /* JADX INFO: renamed from: C */
        public static final String f100705C = x0i.intToStringMaxRadix(3);

        /* JADX INFO: renamed from: F */
        public static final String f100706F = x0i.intToStringMaxRadix(4);

        /* JADX INFO: renamed from: H */
        public static final gh1.InterfaceC6311a<C15542a> f100707H = new gh1.InterfaceC6311a() { // from class: w7h
            @Override // p000.gh1.InterfaceC6311a
            public final gh1 fromBundle(Bundle bundle) {
                return y7h.C15542a.lambda$static$0(bundle);
            }
        };

        public C15542a(g6h g6hVar, boolean z, int[] iArr, boolean[] zArr) {
            int i = g6hVar.f38907a;
            this.f100710a = i;
            boolean z2 = false;
            u80.checkArgument(i == iArr.length && i == zArr.length);
            this.f100711b = g6hVar;
            if (z && i > 1) {
                z2 = true;
            }
            this.f100712c = z2;
            this.f100713d = (int[]) iArr.clone();
            this.f100714e = (boolean[]) zArr.clone();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ C15542a lambda$static$0(Bundle bundle) {
            g6h g6hVar = (g6h) g6h.f38904F.fromBundle((Bundle) u80.checkNotNull(bundle.getBundle(f100708f)));
            return new C15542a(g6hVar, bundle.getBoolean(f100706F, false), (int[]) yya.firstNonNull(bundle.getIntArray(f100709m), new int[g6hVar.f38907a]), (boolean[]) yya.firstNonNull(bundle.getBooleanArray(f100705C), new boolean[g6hVar.f38907a]));
        }

        public C15542a copyWithId(String str) {
            return new C15542a(this.f100711b.copyWithId(str), this.f100712c, this.f100713d, this.f100714e);
        }

        public boolean equals(@hib Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C15542a.class != obj.getClass()) {
                return false;
            }
            C15542a c15542a = (C15542a) obj;
            return this.f100712c == c15542a.f100712c && this.f100711b.equals(c15542a.f100711b) && Arrays.equals(this.f100713d, c15542a.f100713d) && Arrays.equals(this.f100714e, c15542a.f100714e);
        }

        public g6h getMediaTrackGroup() {
            return this.f100711b;
        }

        public kq6 getTrackFormat(int i) {
            return this.f100711b.getFormat(i);
        }

        public int getTrackSupport(int i) {
            return this.f100713d[i];
        }

        public int getType() {
            return this.f100711b.f38909c;
        }

        public int hashCode() {
            return (((((this.f100711b.hashCode() * 31) + (this.f100712c ? 1 : 0)) * 31) + Arrays.hashCode(this.f100713d)) * 31) + Arrays.hashCode(this.f100714e);
        }

        public boolean isAdaptiveSupported() {
            return this.f100712c;
        }

        public boolean isSelected() {
            return hb1.contains(this.f100714e, true);
        }

        public boolean isSupported() {
            return isSupported(false);
        }

        public boolean isTrackSelected(int i) {
            return this.f100714e[i];
        }

        public boolean isTrackSupported(int i) {
            return isTrackSupported(i, false);
        }

        @Override // p000.gh1
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putBundle(f100708f, this.f100711b.toBundle());
            bundle.putIntArray(f100709m, this.f100713d);
            bundle.putBooleanArray(f100705C, this.f100714e);
            bundle.putBoolean(f100706F, this.f100712c);
            return bundle;
        }

        public boolean isSupported(boolean z) {
            for (int i = 0; i < this.f100713d.length; i++) {
                if (isTrackSupported(i, z)) {
                    return true;
                }
            }
            return false;
        }

        public boolean isTrackSupported(int i, boolean z) {
            int i2 = this.f100713d[i];
            return i2 == 4 || (z && i2 == 3);
        }
    }

    public y7h(List<C15542a> list) {
        this.f100704a = kx7.copyOf((Collection) list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ y7h lambda$static$0(Bundle bundle) {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(f100702c);
        return new y7h(parcelableArrayList == null ? kx7.m15110of() : ih1.fromBundleList(C15542a.f100707H, parcelableArrayList));
    }

    public boolean containsType(int i) {
        for (int i2 = 0; i2 < this.f100704a.size(); i2++) {
            if (this.f100704a.get(i2).getType() == i) {
                return true;
            }
        }
        return false;
    }

    public boolean equals(@hib Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || y7h.class != obj.getClass()) {
            return false;
        }
        return this.f100704a.equals(((y7h) obj).f100704a);
    }

    public kx7<C15542a> getGroups() {
        return this.f100704a;
    }

    public int hashCode() {
        return this.f100704a.hashCode();
    }

    public boolean isEmpty() {
        return this.f100704a.isEmpty();
    }

    public boolean isTypeSelected(int i) {
        for (int i2 = 0; i2 < this.f100704a.size(); i2++) {
            C15542a c15542a = this.f100704a.get(i2);
            if (c15542a.isSelected() && c15542a.getType() == i) {
                return true;
            }
        }
        return false;
    }

    public boolean isTypeSupported(int i) {
        return isTypeSupported(i, false);
    }

    @Deprecated
    public boolean isTypeSupportedOrEmpty(int i) {
        return isTypeSupportedOrEmpty(i, false);
    }

    @Override // p000.gh1
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(f100702c, ih1.toBundleArrayList(this.f100704a));
        return bundle;
    }

    public boolean isTypeSupported(int i, boolean z) {
        for (int i2 = 0; i2 < this.f100704a.size(); i2++) {
            if (this.f100704a.get(i2).getType() == i && this.f100704a.get(i2).isSupported(z)) {
                return true;
            }
        }
        return false;
    }

    @Deprecated
    public boolean isTypeSupportedOrEmpty(int i, boolean z) {
        return !containsType(i) || isTypeSupported(i, z);
    }
}
