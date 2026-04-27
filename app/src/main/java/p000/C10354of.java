package p000;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Arrays;
import p000.C10354of;
import p000.gh1;

/* JADX INFO: renamed from: of */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class C10354of implements gh1 {

    /* JADX INFO: renamed from: C */
    public static final int f67446C = 1;

    /* JADX INFO: renamed from: F */
    public static final int f67447F = 2;

    /* JADX INFO: renamed from: H */
    public static final int f67448H = 3;

    /* JADX INFO: renamed from: L */
    public static final int f67449L = 4;

    /* JADX INFO: renamed from: m */
    public static final int f67457m = 0;

    /* JADX INFO: renamed from: a */
    @hib
    public final Object f67458a;

    /* JADX INFO: renamed from: b */
    public final int f67459b;

    /* JADX INFO: renamed from: c */
    public final long f67460c;

    /* JADX INFO: renamed from: d */
    public final long f67461d;

    /* JADX INFO: renamed from: e */
    public final int f67462e;

    /* JADX INFO: renamed from: f */
    public final b[] f67463f;

    /* JADX INFO: renamed from: M */
    public static final C10354of f67450M = new C10354of(null, new b[0], 0, -9223372036854775807L, 0);

    /* JADX INFO: renamed from: N */
    public static final b f67452N = new b(0).withAdCount(0);

    /* JADX INFO: renamed from: Q */
    public static final String f67453Q = x0i.intToStringMaxRadix(1);

    /* JADX INFO: renamed from: X */
    public static final String f67454X = x0i.intToStringMaxRadix(2);

    /* JADX INFO: renamed from: Y */
    public static final String f67455Y = x0i.intToStringMaxRadix(3);

    /* JADX INFO: renamed from: Z */
    public static final String f67456Z = x0i.intToStringMaxRadix(4);

    /* JADX INFO: renamed from: M1 */
    public static final gh1.InterfaceC6311a<C10354of> f67451M1 = new gh1.InterfaceC6311a() { // from class: lf
        @Override // p000.gh1.InterfaceC6311a
        public final gh1 fromBundle(Bundle bundle) {
            return C10354of.fromBundle(bundle);
        }
    };

    /* JADX INFO: renamed from: of$b */
    public static final class b implements gh1 {

        /* JADX INFO: renamed from: F */
        public static final String f67464F = x0i.intToStringMaxRadix(0);

        /* JADX INFO: renamed from: H */
        public static final String f67465H = x0i.intToStringMaxRadix(1);

        /* JADX INFO: renamed from: L */
        public static final String f67466L = x0i.intToStringMaxRadix(2);

        /* JADX INFO: renamed from: M */
        public static final String f67467M = x0i.intToStringMaxRadix(3);

        /* JADX INFO: renamed from: N */
        public static final String f67468N = x0i.intToStringMaxRadix(4);

        /* JADX INFO: renamed from: Q */
        public static final String f67469Q = x0i.intToStringMaxRadix(5);

        /* JADX INFO: renamed from: X */
        public static final String f67470X = x0i.intToStringMaxRadix(6);

        /* JADX INFO: renamed from: Y */
        public static final String f67471Y = x0i.intToStringMaxRadix(7);

        /* JADX INFO: renamed from: Z */
        public static final gh1.InterfaceC6311a<b> f67472Z = new gh1.InterfaceC6311a() { // from class: nf
            @Override // p000.gh1.InterfaceC6311a
            public final gh1 fromBundle(Bundle bundle) {
                return C10354of.b.fromBundle(bundle);
            }
        };

        /* JADX INFO: renamed from: C */
        public final boolean f67473C;

        /* JADX INFO: renamed from: a */
        public final long f67474a;

        /* JADX INFO: renamed from: b */
        public final int f67475b;

        /* JADX INFO: renamed from: c */
        public final int f67476c;

        /* JADX INFO: renamed from: d */
        public final Uri[] f67477d;

        /* JADX INFO: renamed from: e */
        public final int[] f67478e;

        /* JADX INFO: renamed from: f */
        public final long[] f67479f;

        /* JADX INFO: renamed from: m */
        public final long f67480m;

        @yx1
        private static long[] copyDurationsUsWithSpaceForAdCount(long[] jArr, int i) {
            int length = jArr.length;
            int iMax = Math.max(i, length);
            long[] jArrCopyOf = Arrays.copyOf(jArr, iMax);
            Arrays.fill(jArrCopyOf, length, iMax, -9223372036854775807L);
            return jArrCopyOf;
        }

        @yx1
        private static int[] copyStatesWithSpaceForAdCount(int[] iArr, int i) {
            int length = iArr.length;
            int iMax = Math.max(i, length);
            int[] iArrCopyOf = Arrays.copyOf(iArr, iMax);
            Arrays.fill(iArrCopyOf, length, iMax, 0);
            return iArrCopyOf;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static b fromBundle(Bundle bundle) {
            long j = bundle.getLong(f67464F);
            int i = bundle.getInt(f67465H);
            int i2 = bundle.getInt(f67471Y);
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(f67466L);
            int[] intArray = bundle.getIntArray(f67467M);
            long[] longArray = bundle.getLongArray(f67468N);
            long j2 = bundle.getLong(f67469Q);
            boolean z = bundle.getBoolean(f67470X);
            if (intArray == null) {
                intArray = new int[0];
            }
            return new b(j, i, i2, intArray, parcelableArrayList == null ? new Uri[0] : (Uri[]) parcelableArrayList.toArray(new Uri[0]), longArray == null ? new long[0] : longArray, j2, z);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean isLivePostrollPlaceholder() {
            return this.f67473C && this.f67474a == Long.MIN_VALUE && this.f67475b == -1;
        }

        public boolean equals(@hib Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            return this.f67474a == bVar.f67474a && this.f67475b == bVar.f67475b && this.f67476c == bVar.f67476c && Arrays.equals(this.f67477d, bVar.f67477d) && Arrays.equals(this.f67478e, bVar.f67478e) && Arrays.equals(this.f67479f, bVar.f67479f) && this.f67480m == bVar.f67480m && this.f67473C == bVar.f67473C;
        }

        public int getFirstAdIndexToPlay() {
            return getNextAdIndexToPlay(-1);
        }

        public int getNextAdIndexToPlay(@h78(from = -1) int i) {
            int i2;
            int i3 = i + 1;
            while (true) {
                int[] iArr = this.f67478e;
                if (i3 >= iArr.length || this.f67473C || (i2 = iArr[i3]) == 0 || i2 == 1) {
                    break;
                }
                i3++;
            }
            return i3;
        }

        public boolean hasUnplayedAds() {
            if (this.f67475b == -1) {
                return true;
            }
            for (int i = 0; i < this.f67475b; i++) {
                int i2 = this.f67478e[i];
                if (i2 == 0 || i2 == 1) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            int i = ((this.f67475b * 31) + this.f67476c) * 31;
            long j = this.f67474a;
            int iHashCode = (((((((i + ((int) (j ^ (j >>> 32)))) * 31) + Arrays.hashCode(this.f67477d)) * 31) + Arrays.hashCode(this.f67478e)) * 31) + Arrays.hashCode(this.f67479f)) * 31;
            long j2 = this.f67480m;
            return ((iHashCode + ((int) (j2 ^ (j2 >>> 32)))) * 31) + (this.f67473C ? 1 : 0);
        }

        public boolean shouldPlayAdGroup() {
            return this.f67475b == -1 || getFirstAdIndexToPlay() < this.f67475b;
        }

        @Override // p000.gh1
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putLong(f67464F, this.f67474a);
            bundle.putInt(f67465H, this.f67475b);
            bundle.putInt(f67471Y, this.f67476c);
            bundle.putParcelableArrayList(f67466L, new ArrayList<>(Arrays.asList(this.f67477d)));
            bundle.putIntArray(f67467M, this.f67478e);
            bundle.putLongArray(f67468N, this.f67479f);
            bundle.putLong(f67469Q, this.f67480m);
            bundle.putBoolean(f67470X, this.f67473C);
            return bundle;
        }

        @yx1
        public b withAdCount(int i) {
            int[] iArrCopyStatesWithSpaceForAdCount = copyStatesWithSpaceForAdCount(this.f67478e, i);
            long[] jArrCopyDurationsUsWithSpaceForAdCount = copyDurationsUsWithSpaceForAdCount(this.f67479f, i);
            return new b(this.f67474a, i, this.f67476c, iArrCopyStatesWithSpaceForAdCount, (Uri[]) Arrays.copyOf(this.f67477d, i), jArrCopyDurationsUsWithSpaceForAdCount, this.f67480m, this.f67473C);
        }

        @yx1
        public b withAdDurationsUs(long[] jArr) {
            int length = jArr.length;
            Uri[] uriArr = this.f67477d;
            if (length < uriArr.length) {
                jArr = copyDurationsUsWithSpaceForAdCount(jArr, uriArr.length);
            } else if (this.f67475b != -1 && jArr.length > uriArr.length) {
                jArr = Arrays.copyOf(jArr, uriArr.length);
            }
            return new b(this.f67474a, this.f67475b, this.f67476c, this.f67478e, this.f67477d, jArr, this.f67480m, this.f67473C);
        }

        @yx1
        public b withAdState(int i, @h78(from = 0) int i2) {
            int i3 = this.f67475b;
            u80.checkArgument(i3 == -1 || i2 < i3);
            int[] iArrCopyStatesWithSpaceForAdCount = copyStatesWithSpaceForAdCount(this.f67478e, i2 + 1);
            int i4 = iArrCopyStatesWithSpaceForAdCount[i2];
            u80.checkArgument(i4 == 0 || i4 == 1 || i4 == i);
            long[] jArrCopyDurationsUsWithSpaceForAdCount = this.f67479f;
            if (jArrCopyDurationsUsWithSpaceForAdCount.length != iArrCopyStatesWithSpaceForAdCount.length) {
                jArrCopyDurationsUsWithSpaceForAdCount = copyDurationsUsWithSpaceForAdCount(jArrCopyDurationsUsWithSpaceForAdCount, iArrCopyStatesWithSpaceForAdCount.length);
            }
            long[] jArr = jArrCopyDurationsUsWithSpaceForAdCount;
            Uri[] uriArr = this.f67477d;
            if (uriArr.length != iArrCopyStatesWithSpaceForAdCount.length) {
                uriArr = (Uri[]) Arrays.copyOf(uriArr, iArrCopyStatesWithSpaceForAdCount.length);
            }
            Uri[] uriArr2 = uriArr;
            iArrCopyStatesWithSpaceForAdCount[i2] = i;
            return new b(this.f67474a, this.f67475b, this.f67476c, iArrCopyStatesWithSpaceForAdCount, uriArr2, jArr, this.f67480m, this.f67473C);
        }

        @yx1
        public b withAdUri(Uri uri, @h78(from = 0) int i) {
            int[] iArrCopyStatesWithSpaceForAdCount = copyStatesWithSpaceForAdCount(this.f67478e, i + 1);
            long[] jArrCopyDurationsUsWithSpaceForAdCount = this.f67479f;
            if (jArrCopyDurationsUsWithSpaceForAdCount.length != iArrCopyStatesWithSpaceForAdCount.length) {
                jArrCopyDurationsUsWithSpaceForAdCount = copyDurationsUsWithSpaceForAdCount(jArrCopyDurationsUsWithSpaceForAdCount, iArrCopyStatesWithSpaceForAdCount.length);
            }
            long[] jArr = jArrCopyDurationsUsWithSpaceForAdCount;
            Uri[] uriArr = (Uri[]) Arrays.copyOf(this.f67477d, iArrCopyStatesWithSpaceForAdCount.length);
            uriArr[i] = uri;
            iArrCopyStatesWithSpaceForAdCount[i] = 1;
            return new b(this.f67474a, this.f67475b, this.f67476c, iArrCopyStatesWithSpaceForAdCount, uriArr, jArr, this.f67480m, this.f67473C);
        }

        @yx1
        public b withAllAdsReset() {
            if (this.f67475b == -1) {
                return this;
            }
            int[] iArr = this.f67478e;
            int length = iArr.length;
            int[] iArrCopyOf = Arrays.copyOf(iArr, length);
            for (int i = 0; i < length; i++) {
                int i2 = iArrCopyOf[i];
                if (i2 == 3 || i2 == 2 || i2 == 4) {
                    iArrCopyOf[i] = this.f67477d[i] == null ? 0 : 1;
                }
            }
            return new b(this.f67474a, length, this.f67476c, iArrCopyOf, this.f67477d, this.f67479f, this.f67480m, this.f67473C);
        }

        @yx1
        public b withAllAdsSkipped() {
            if (this.f67475b == -1) {
                return new b(this.f67474a, 0, this.f67476c, new int[0], new Uri[0], new long[0], this.f67480m, this.f67473C);
            }
            int[] iArr = this.f67478e;
            int length = iArr.length;
            int[] iArrCopyOf = Arrays.copyOf(iArr, length);
            for (int i = 0; i < length; i++) {
                int i2 = iArrCopyOf[i];
                if (i2 == 1 || i2 == 0) {
                    iArrCopyOf[i] = 2;
                }
            }
            return new b(this.f67474a, length, this.f67476c, iArrCopyOf, this.f67477d, this.f67479f, this.f67480m, this.f67473C);
        }

        @yx1
        public b withContentResumeOffsetUs(long j) {
            return new b(this.f67474a, this.f67475b, this.f67476c, this.f67478e, this.f67477d, this.f67479f, j, this.f67473C);
        }

        @yx1
        public b withIsServerSideInserted(boolean z) {
            return new b(this.f67474a, this.f67475b, this.f67476c, this.f67478e, this.f67477d, this.f67479f, this.f67480m, z);
        }

        public b withLastAdRemoved() {
            int[] iArr = this.f67478e;
            int length = iArr.length - 1;
            int[] iArrCopyOf = Arrays.copyOf(iArr, length);
            Uri[] uriArr = (Uri[]) Arrays.copyOf(this.f67477d, length);
            long[] jArrCopyOf = this.f67479f;
            if (jArrCopyOf.length > length) {
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, length);
            }
            long[] jArr = jArrCopyOf;
            return new b(this.f67474a, length, this.f67476c, iArrCopyOf, uriArr, jArr, x0i.sum(jArr), this.f67473C);
        }

        public b withOriginalAdCount(int i) {
            return new b(this.f67474a, this.f67475b, i, this.f67478e, this.f67477d, this.f67479f, this.f67480m, this.f67473C);
        }

        @yx1
        public b withTimeUs(long j) {
            return new b(j, this.f67475b, this.f67476c, this.f67478e, this.f67477d, this.f67479f, this.f67480m, this.f67473C);
        }

        public b(long j) {
            this(j, -1, -1, new int[0], new Uri[0], new long[0], 0L, false);
        }

        private b(long j, int i, int i2, int[] iArr, Uri[] uriArr, long[] jArr, long j2, boolean z) {
            u80.checkArgument(iArr.length == uriArr.length);
            this.f67474a = j;
            this.f67475b = i;
            this.f67476c = i2;
            this.f67478e = iArr;
            this.f67477d = uriArr;
            this.f67479f = jArr;
            this.f67480m = j2;
            this.f67473C = z;
        }
    }

    /* JADX INFO: renamed from: of$c */
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface c {
    }

    public C10354of(Object obj, long... jArr) {
        this(obj, createEmptyAdGroups(jArr), 0L, -9223372036854775807L, 0);
    }

    private static b[] createEmptyAdGroups(long[] jArr) {
        int length = jArr.length;
        b[] bVarArr = new b[length];
        for (int i = 0; i < length; i++) {
            bVarArr[i] = new b(jArr[i]);
        }
        return bVarArr;
    }

    public static C10354of fromAdPlaybackState(Object obj, C10354of c10354of) {
        int i = c10354of.f67459b - c10354of.f67462e;
        b[] bVarArr = new b[i];
        for (int i2 = 0; i2 < i; i2++) {
            b bVar = c10354of.f67463f[i2];
            long j = bVar.f67474a;
            int i3 = bVar.f67475b;
            int i4 = bVar.f67476c;
            int[] iArr = bVar.f67478e;
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
            Uri[] uriArr = bVar.f67477d;
            Uri[] uriArr2 = (Uri[]) Arrays.copyOf(uriArr, uriArr.length);
            long[] jArr = bVar.f67479f;
            bVarArr[i2] = new b(j, i3, i4, iArrCopyOf, uriArr2, Arrays.copyOf(jArr, jArr.length), bVar.f67480m, bVar.f67473C);
        }
        return new C10354of(obj, bVarArr, c10354of.f67460c, c10354of.f67461d, c10354of.f67462e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static C10354of fromBundle(Bundle bundle) {
        b[] bVarArr;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(f67453Q);
        if (parcelableArrayList == null) {
            bVarArr = new b[0];
        } else {
            b[] bVarArr2 = new b[parcelableArrayList.size()];
            for (int i = 0; i < parcelableArrayList.size(); i++) {
                bVarArr2[i] = (b) b.f67472Z.fromBundle((Bundle) parcelableArrayList.get(i));
            }
            bVarArr = bVarArr2;
        }
        String str = f67454X;
        C10354of c10354of = f67450M;
        return new C10354of(null, bVarArr, bundle.getLong(str, c10354of.f67460c), bundle.getLong(f67455Y, c10354of.f67461d), bundle.getInt(f67456Z, c10354of.f67462e));
    }

    private boolean isPositionBeforeAdGroup(long j, long j2, int i) {
        if (j == Long.MIN_VALUE) {
            return false;
        }
        b adGroup = getAdGroup(i);
        long j3 = adGroup.f67474a;
        return j3 == Long.MIN_VALUE ? j2 == -9223372036854775807L || (adGroup.f67473C && adGroup.f67475b == -1) || j < j2 : j < j3;
    }

    public boolean endsWithLivePostrollPlaceHolder() {
        int i = this.f67459b - 1;
        return i >= 0 && isLivePostrollPlaceholder(i);
    }

    public boolean equals(@hib Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C10354of.class != obj.getClass()) {
            return false;
        }
        C10354of c10354of = (C10354of) obj;
        return x0i.areEqual(this.f67458a, c10354of.f67458a) && this.f67459b == c10354of.f67459b && this.f67460c == c10354of.f67460c && this.f67461d == c10354of.f67461d && this.f67462e == c10354of.f67462e && Arrays.equals(this.f67463f, c10354of.f67463f);
    }

    public b getAdGroup(@h78(from = 0) int i) {
        int i2 = this.f67462e;
        return i < i2 ? f67452N : this.f67463f[i - i2];
    }

    public int getAdGroupIndexAfterPositionUs(long j, long j2) {
        if (j == Long.MIN_VALUE) {
            return -1;
        }
        if (j2 != -9223372036854775807L && j >= j2) {
            return -1;
        }
        int i = this.f67462e;
        while (i < this.f67459b && ((getAdGroup(i).f67474a != Long.MIN_VALUE && getAdGroup(i).f67474a <= j) || !getAdGroup(i).shouldPlayAdGroup())) {
            i++;
        }
        if (i < this.f67459b) {
            return i;
        }
        return -1;
    }

    public int getAdGroupIndexForPositionUs(long j, long j2) {
        int i = this.f67459b - 1;
        int i2 = i - (isLivePostrollPlaceholder(i) ? 1 : 0);
        while (i2 >= 0 && isPositionBeforeAdGroup(j, j2, i2)) {
            i2--;
        }
        if (i2 < 0 || !getAdGroup(i2).hasUnplayedAds()) {
            return -1;
        }
        return i2;
    }

    public int hashCode() {
        int i = this.f67459b * 31;
        Object obj = this.f67458a;
        return ((((((((i + (obj == null ? 0 : obj.hashCode())) * 31) + ((int) this.f67460c)) * 31) + ((int) this.f67461d)) * 31) + this.f67462e) * 31) + Arrays.hashCode(this.f67463f);
    }

    public boolean isAdInErrorState(@h78(from = 0) int i, @h78(from = 0) int i2) {
        b adGroup;
        int i3;
        return i < this.f67459b && (i3 = (adGroup = getAdGroup(i)).f67475b) != -1 && i2 < i3 && adGroup.f67478e[i2] == 4;
    }

    public boolean isLivePostrollPlaceholder(int i) {
        return i == this.f67459b - 1 && getAdGroup(i).isLivePostrollPlaceholder();
    }

    @Override // p000.gh1
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        for (b bVar : this.f67463f) {
            arrayList.add(bVar.toBundle());
        }
        if (!arrayList.isEmpty()) {
            bundle.putParcelableArrayList(f67453Q, arrayList);
        }
        long j = this.f67460c;
        C10354of c10354of = f67450M;
        if (j != c10354of.f67460c) {
            bundle.putLong(f67454X, j);
        }
        long j2 = this.f67461d;
        if (j2 != c10354of.f67461d) {
            bundle.putLong(f67455Y, j2);
        }
        int i = this.f67462e;
        if (i != c10354of.f67462e) {
            bundle.putInt(f67456Z, i);
        }
        return bundle;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AdPlaybackState(adsId=");
        sb.append(this.f67458a);
        sb.append(", adResumePositionUs=");
        sb.append(this.f67460c);
        sb.append(", adGroups=[");
        for (int i = 0; i < this.f67463f.length; i++) {
            sb.append("adGroup(timeUs=");
            sb.append(this.f67463f[i].f67474a);
            sb.append(", ads=[");
            for (int i2 = 0; i2 < this.f67463f[i].f67478e.length; i2++) {
                sb.append("ad(state=");
                int i3 = this.f67463f[i].f67478e[i2];
                if (i3 == 0) {
                    sb.append('_');
                } else if (i3 == 1) {
                    sb.append('R');
                } else if (i3 == 2) {
                    sb.append(sjc.f82024n);
                } else if (i3 == 3) {
                    sb.append('P');
                } else if (i3 != 4) {
                    sb.append('?');
                } else {
                    sb.append('!');
                }
                sb.append(", durationUs=");
                sb.append(this.f67463f[i].f67479f[i2]);
                sb.append(')');
                if (i2 < this.f67463f[i].f67478e.length - 1) {
                    sb.append(", ");
                }
            }
            sb.append("])");
            if (i < this.f67463f.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("])");
        return sb.toString();
    }

    @yx1
    public C10354of withAdCount(@h78(from = 0) int i, @h78(from = 1) int i2) {
        u80.checkArgument(i2 > 0);
        int i3 = i - this.f67462e;
        b[] bVarArr = this.f67463f;
        if (bVarArr[i3].f67475b == i2) {
            return this;
        }
        b[] bVarArr2 = (b[]) x0i.nullSafeArrayCopy(bVarArr, bVarArr.length);
        bVarArr2[i3] = this.f67463f[i3].withAdCount(i2);
        return new C10354of(this.f67458a, bVarArr2, this.f67460c, this.f67461d, this.f67462e);
    }

    @yx1
    public C10354of withAdDurationsUs(long[][] jArr) {
        u80.checkState(this.f67462e == 0);
        b[] bVarArr = this.f67463f;
        b[] bVarArr2 = (b[]) x0i.nullSafeArrayCopy(bVarArr, bVarArr.length);
        for (int i = 0; i < this.f67459b; i++) {
            bVarArr2[i] = bVarArr2[i].withAdDurationsUs(jArr[i]);
        }
        return new C10354of(this.f67458a, bVarArr2, this.f67460c, this.f67461d, this.f67462e);
    }

    @yx1
    public C10354of withAdGroupTimeUs(@h78(from = 0) int i, long j) {
        int i2 = i - this.f67462e;
        b[] bVarArr = this.f67463f;
        b[] bVarArr2 = (b[]) x0i.nullSafeArrayCopy(bVarArr, bVarArr.length);
        bVarArr2[i2] = this.f67463f[i2].withTimeUs(j);
        return new C10354of(this.f67458a, bVarArr2, this.f67460c, this.f67461d, this.f67462e);
    }

    @yx1
    public C10354of withAdLoadError(@h78(from = 0) int i, @h78(from = 0) int i2) {
        int i3 = i - this.f67462e;
        b[] bVarArr = this.f67463f;
        b[] bVarArr2 = (b[]) x0i.nullSafeArrayCopy(bVarArr, bVarArr.length);
        bVarArr2[i3] = bVarArr2[i3].withAdState(4, i2);
        return new C10354of(this.f67458a, bVarArr2, this.f67460c, this.f67461d, this.f67462e);
    }

    @yx1
    public C10354of withAdResumePositionUs(long j) {
        return this.f67460c == j ? this : new C10354of(this.f67458a, this.f67463f, j, this.f67461d, this.f67462e);
    }

    @yx1
    public C10354of withAvailableAd(@h78(from = 0) int i, @h78(from = 0) int i2) {
        return withAvailableAdUri(i, i2, Uri.EMPTY);
    }

    @yx1
    public C10354of withAvailableAdUri(@h78(from = 0) int i, @h78(from = 0) int i2, Uri uri) {
        int i3 = i - this.f67462e;
        b[] bVarArr = this.f67463f;
        b[] bVarArr2 = (b[]) x0i.nullSafeArrayCopy(bVarArr, bVarArr.length);
        u80.checkState(!Uri.EMPTY.equals(uri) || bVarArr2[i3].f67473C);
        bVarArr2[i3] = bVarArr2[i3].withAdUri(uri, i2);
        return new C10354of(this.f67458a, bVarArr2, this.f67460c, this.f67461d, this.f67462e);
    }

    @yx1
    public C10354of withContentDurationUs(long j) {
        return this.f67461d == j ? this : new C10354of(this.f67458a, this.f67463f, this.f67460c, j, this.f67462e);
    }

    @yx1
    public C10354of withContentResumeOffsetUs(@h78(from = 0) int i, long j) {
        int i2 = i - this.f67462e;
        b[] bVarArr = this.f67463f;
        if (bVarArr[i2].f67480m == j) {
            return this;
        }
        b[] bVarArr2 = (b[]) x0i.nullSafeArrayCopy(bVarArr, bVarArr.length);
        bVarArr2[i2] = bVarArr2[i2].withContentResumeOffsetUs(j);
        return new C10354of(this.f67458a, bVarArr2, this.f67460c, this.f67461d, this.f67462e);
    }

    @yx1
    public C10354of withIsServerSideInserted(@h78(from = 0) int i, boolean z) {
        int i2 = i - this.f67462e;
        b[] bVarArr = this.f67463f;
        if (bVarArr[i2].f67473C == z) {
            return this;
        }
        b[] bVarArr2 = (b[]) x0i.nullSafeArrayCopy(bVarArr, bVarArr.length);
        bVarArr2[i2] = bVarArr2[i2].withIsServerSideInserted(z);
        return new C10354of(this.f67458a, bVarArr2, this.f67460c, this.f67461d, this.f67462e);
    }

    @yx1
    public C10354of withLastAdRemoved(@h78(from = 0) int i) {
        int i2 = i - this.f67462e;
        b[] bVarArr = this.f67463f;
        b[] bVarArr2 = (b[]) x0i.nullSafeArrayCopy(bVarArr, bVarArr.length);
        bVarArr2[i2] = bVarArr2[i2].withLastAdRemoved();
        return new C10354of(this.f67458a, bVarArr2, this.f67460c, this.f67461d, this.f67462e);
    }

    public C10354of withLivePostrollPlaceholderAppended() {
        return withNewAdGroup(this.f67459b, Long.MIN_VALUE).withIsServerSideInserted(this.f67459b, true);
    }

    @yx1
    public C10354of withNewAdGroup(@h78(from = 0) int i, long j) {
        int i2 = i - this.f67462e;
        b bVar = new b(j);
        b[] bVarArr = (b[]) x0i.nullSafeArrayAppend(this.f67463f, bVar);
        System.arraycopy(bVarArr, i2, bVarArr, i2 + 1, this.f67463f.length - i2);
        bVarArr[i2] = bVar;
        return new C10354of(this.f67458a, bVarArr, this.f67460c, this.f67461d, this.f67462e);
    }

    @yx1
    public C10354of withOriginalAdCount(@h78(from = 0) int i, int i2) {
        int i3 = i - this.f67462e;
        b[] bVarArr = this.f67463f;
        if (bVarArr[i3].f67476c == i2) {
            return this;
        }
        b[] bVarArr2 = (b[]) x0i.nullSafeArrayCopy(bVarArr, bVarArr.length);
        bVarArr2[i3] = bVarArr2[i3].withOriginalAdCount(i2);
        return new C10354of(this.f67458a, bVarArr2, this.f67460c, this.f67461d, this.f67462e);
    }

    @yx1
    public C10354of withPlayedAd(@h78(from = 0) int i, @h78(from = 0) int i2) {
        int i3 = i - this.f67462e;
        b[] bVarArr = this.f67463f;
        b[] bVarArr2 = (b[]) x0i.nullSafeArrayCopy(bVarArr, bVarArr.length);
        bVarArr2[i3] = bVarArr2[i3].withAdState(3, i2);
        return new C10354of(this.f67458a, bVarArr2, this.f67460c, this.f67461d, this.f67462e);
    }

    @yx1
    public C10354of withRemovedAdGroupCount(@h78(from = 0) int i) {
        int i2 = this.f67462e;
        if (i2 == i) {
            return this;
        }
        u80.checkArgument(i > i2);
        int i3 = this.f67459b - i;
        b[] bVarArr = new b[i3];
        System.arraycopy(this.f67463f, i - this.f67462e, bVarArr, 0, i3);
        return new C10354of(this.f67458a, bVarArr, this.f67460c, this.f67461d, i);
    }

    @yx1
    public C10354of withResetAdGroup(@h78(from = 0) int i) {
        int i2 = i - this.f67462e;
        b[] bVarArr = this.f67463f;
        b[] bVarArr2 = (b[]) x0i.nullSafeArrayCopy(bVarArr, bVarArr.length);
        bVarArr2[i2] = bVarArr2[i2].withAllAdsReset();
        return new C10354of(this.f67458a, bVarArr2, this.f67460c, this.f67461d, this.f67462e);
    }

    @yx1
    public C10354of withSkippedAd(@h78(from = 0) int i, @h78(from = 0) int i2) {
        int i3 = i - this.f67462e;
        b[] bVarArr = this.f67463f;
        b[] bVarArr2 = (b[]) x0i.nullSafeArrayCopy(bVarArr, bVarArr.length);
        bVarArr2[i3] = bVarArr2[i3].withAdState(2, i2);
        return new C10354of(this.f67458a, bVarArr2, this.f67460c, this.f67461d, this.f67462e);
    }

    @yx1
    public C10354of withSkippedAdGroup(@h78(from = 0) int i) {
        int i2 = i - this.f67462e;
        b[] bVarArr = this.f67463f;
        b[] bVarArr2 = (b[]) x0i.nullSafeArrayCopy(bVarArr, bVarArr.length);
        bVarArr2[i2] = bVarArr2[i2].withAllAdsSkipped();
        return new C10354of(this.f67458a, bVarArr2, this.f67460c, this.f67461d, this.f67462e);
    }

    private C10354of(@hib Object obj, b[] bVarArr, long j, long j2, int i) {
        this.f67458a = obj;
        this.f67460c = j;
        this.f67461d = j2;
        this.f67459b = bVarArr.length + i;
        this.f67463f = bVarArr;
        this.f67462e = i;
    }

    @yx1
    public C10354of withAdDurationsUs(@h78(from = 0) int i, long... jArr) {
        int i2 = i - this.f67462e;
        b[] bVarArr = this.f67463f;
        b[] bVarArr2 = (b[]) x0i.nullSafeArrayCopy(bVarArr, bVarArr.length);
        bVarArr2[i2] = bVarArr2[i2].withAdDurationsUs(jArr);
        return new C10354of(this.f67458a, bVarArr2, this.f67460c, this.f67461d, this.f67462e);
    }
}
