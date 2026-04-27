package p000;

import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import p000.gh1;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class g6h implements gh1 {

    /* JADX INFO: renamed from: f */
    public static final String f38905f = "TrackGroup";

    /* JADX INFO: renamed from: a */
    public final int f38907a;

    /* JADX INFO: renamed from: b */
    public final String f38908b;

    /* JADX INFO: renamed from: c */
    public final int f38909c;

    /* JADX INFO: renamed from: d */
    public final kq6[] f38910d;

    /* JADX INFO: renamed from: e */
    public int f38911e;

    /* JADX INFO: renamed from: m */
    public static final String f38906m = x0i.intToStringMaxRadix(0);

    /* JADX INFO: renamed from: C */
    public static final String f38903C = x0i.intToStringMaxRadix(1);

    /* JADX INFO: renamed from: F */
    public static final gh1.InterfaceC6311a<g6h> f38904F = new gh1.InterfaceC6311a() { // from class: e6h
        @Override // p000.gh1.InterfaceC6311a
        public final gh1 fromBundle(Bundle bundle) {
            return g6h.lambda$static$0(bundle);
        }
    };

    public g6h(kq6... kq6VarArr) {
        this("", kq6VarArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ g6h lambda$static$0(Bundle bundle) {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(f38906m);
        return new g6h(bundle.getString(f38903C, ""), (kq6[]) (parcelableArrayList == null ? kx7.m15110of() : ih1.fromBundleList(kq6.f54972X2, parcelableArrayList)).toArray(new kq6[0]));
    }

    private static void logErrorMessage(String str, @hib String str2, @hib String str3, int i) {
        yh9.m25916e("TrackGroup", "", new IllegalStateException("Different " + str + " combined in one TrackGroup: '" + str2 + "' (track 0) and '" + str3 + "' (track " + i + c0b.f15434d));
    }

    private static String normalizeLanguage(@hib String str) {
        return (str == null || str.equals("und")) ? "" : str;
    }

    private static int normalizeRoleFlags(int i) {
        return i | 16384;
    }

    private void verifyCorrectness() {
        String strNormalizeLanguage = normalizeLanguage(this.f38910d[0].f55002c);
        int iNormalizeRoleFlags = normalizeRoleFlags(this.f38910d[0].f55006e);
        int i = 1;
        while (true) {
            kq6[] kq6VarArr = this.f38910d;
            if (i >= kq6VarArr.length) {
                return;
            }
            if (!strNormalizeLanguage.equals(normalizeLanguage(kq6VarArr[i].f55002c))) {
                kq6[] kq6VarArr2 = this.f38910d;
                logErrorMessage("languages", kq6VarArr2[0].f55002c, kq6VarArr2[i].f55002c, i);
                return;
            } else {
                if (iNormalizeRoleFlags != normalizeRoleFlags(this.f38910d[i].f55006e)) {
                    logErrorMessage("role flags", Integer.toBinaryString(this.f38910d[0].f55006e), Integer.toBinaryString(this.f38910d[i].f55006e), i);
                    return;
                }
                i++;
            }
        }
    }

    @yx1
    public g6h copyWithId(String str) {
        return new g6h(str, this.f38910d);
    }

    public boolean equals(@hib Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g6h.class != obj.getClass()) {
            return false;
        }
        g6h g6hVar = (g6h) obj;
        return this.f38908b.equals(g6hVar.f38908b) && Arrays.equals(this.f38910d, g6hVar.f38910d);
    }

    public kq6 getFormat(int i) {
        return this.f38910d[i];
    }

    public int hashCode() {
        if (this.f38911e == 0) {
            this.f38911e = ((527 + this.f38908b.hashCode()) * 31) + Arrays.hashCode(this.f38910d);
        }
        return this.f38911e;
    }

    public int indexOf(kq6 kq6Var) {
        int i = 0;
        while (true) {
            kq6[] kq6VarArr = this.f38910d;
            if (i >= kq6VarArr.length) {
                return -1;
            }
            if (kq6Var == kq6VarArr[i]) {
                return i;
            }
            i++;
        }
    }

    @Override // p000.gh1
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(this.f38910d.length);
        for (kq6 kq6Var : this.f38910d) {
            arrayList.add(kq6Var.toBundle(true));
        }
        bundle.putParcelableArrayList(f38906m, arrayList);
        bundle.putString(f38903C, this.f38908b);
        return bundle;
    }

    public g6h(String str, kq6... kq6VarArr) {
        u80.checkArgument(kq6VarArr.length > 0);
        this.f38908b = str;
        this.f38910d = kq6VarArr;
        this.f38907a = kq6VarArr.length;
        int trackType = sva.getTrackType(kq6VarArr[0].f54989M);
        this.f38909c = trackType == -1 ? sva.getTrackType(kq6VarArr[0].f54988L) : trackType;
        verifyCorrectness();
    }
}
