package p000;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.media3.common.C1213a;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class h6h {

    /* JADX INFO: renamed from: f */
    public static final String f42515f = "TrackGroup";

    /* JADX INFO: renamed from: g */
    public static final String f42516g = t0i.intToStringMaxRadix(0);

    /* JADX INFO: renamed from: h */
    public static final String f42517h = t0i.intToStringMaxRadix(1);

    /* JADX INFO: renamed from: a */
    @ovh
    public final int f42518a;

    /* JADX INFO: renamed from: b */
    @ovh
    public final String f42519b;

    /* JADX INFO: renamed from: c */
    @ovh
    public final int f42520c;

    /* JADX INFO: renamed from: d */
    public final C1213a[] f42521d;

    /* JADX INFO: renamed from: e */
    public int f42522e;

    @ovh
    public h6h(C1213a... c1213aArr) {
        this("", c1213aArr);
    }

    @ovh
    public static h6h fromBundle(Bundle bundle) {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(f42516g);
        return new h6h(bundle.getString(f42517h, ""), (C1213a[]) (parcelableArrayList == null ? kx7.m15110of() : og1.fromBundleList(new lz6() { // from class: f6h
            @Override // p000.lz6
            public final Object apply(Object obj) {
                return C1213a.fromBundle((Bundle) obj);
            }
        }, parcelableArrayList)).toArray(new C1213a[0]));
    }

    private static void logErrorMessage(String str, @hib String str2, @hib String str3, int i) {
        xh9.m25145e("TrackGroup", "", new IllegalStateException("Different " + str + " combined in one TrackGroup: '" + str2 + "' (track 0) and '" + str3 + "' (track " + i + c0b.f15434d));
    }

    private static String normalizeLanguage(@hib String str) {
        return (str == null || str.equals("und")) ? "" : str;
    }

    private static int normalizeRoleFlags(int i) {
        return i | 16384;
    }

    private void verifyCorrectness() {
        String strNormalizeLanguage = normalizeLanguage(this.f42521d[0].f8280d);
        int iNormalizeRoleFlags = normalizeRoleFlags(this.f42521d[0].f8282f);
        int i = 1;
        while (true) {
            C1213a[] c1213aArr = this.f42521d;
            if (i >= c1213aArr.length) {
                return;
            }
            if (!strNormalizeLanguage.equals(normalizeLanguage(c1213aArr[i].f8280d))) {
                C1213a[] c1213aArr2 = this.f42521d;
                logErrorMessage("languages", c1213aArr2[0].f8280d, c1213aArr2[i].f8280d, i);
                return;
            } else {
                if (iNormalizeRoleFlags != normalizeRoleFlags(this.f42521d[i].f8282f)) {
                    logErrorMessage("role flags", Integer.toBinaryString(this.f42521d[0].f8282f), Integer.toBinaryString(this.f42521d[i].f8282f), i);
                    return;
                }
                i++;
            }
        }
    }

    @ovh
    @yx1
    public h6h copyWithId(String str) {
        return new h6h(str, this.f42521d);
    }

    public boolean equals(@hib Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h6h.class != obj.getClass()) {
            return false;
        }
        h6h h6hVar = (h6h) obj;
        return this.f42519b.equals(h6hVar.f42519b) && Arrays.equals(this.f42521d, h6hVar.f42521d);
    }

    @ovh
    public C1213a getFormat(int i) {
        return this.f42521d[i];
    }

    public int hashCode() {
        if (this.f42522e == 0) {
            this.f42522e = ((527 + this.f42519b.hashCode()) * 31) + Arrays.hashCode(this.f42521d);
        }
        return this.f42522e;
    }

    @ovh
    public int indexOf(C1213a c1213a) {
        int i = 0;
        while (true) {
            C1213a[] c1213aArr = this.f42521d;
            if (i >= c1213aArr.length) {
                return -1;
            }
            if (c1213a == c1213aArr[i]) {
                return i;
            }
            i++;
        }
    }

    @ovh
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(this.f42521d.length);
        for (C1213a c1213a : this.f42521d) {
            arrayList.add(c1213a.toBundle());
        }
        bundle.putParcelableArrayList(f42516g, arrayList);
        bundle.putString(f42517h, this.f42519b);
        return bundle;
    }

    public String toString() {
        return this.f42519b + ": " + Arrays.toString(this.f42521d);
    }

    @ovh
    public h6h(String str, C1213a... c1213aArr) {
        v80.checkArgument(c1213aArr.length > 0);
        this.f42519b = str;
        this.f42521d = c1213aArr;
        this.f42518a = c1213aArr.length;
        int trackType = rva.getTrackType(c1213aArr[0].f8291o);
        this.f42520c = trackType == -1 ? rva.getTrackType(c1213aArr[0].f8290n) : trackType;
        verifyCorrectness();
    }
}
