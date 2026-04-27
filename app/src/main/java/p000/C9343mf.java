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
import java.util.Objects;
import p000.nfa;

/* JADX INFO: renamed from: mf */
/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class C9343mf {

    /* JADX INFO: renamed from: g */
    public static final int f60831g = 0;

    /* JADX INFO: renamed from: h */
    public static final int f60832h = 1;

    /* JADX INFO: renamed from: i */
    public static final int f60833i = 2;

    /* JADX INFO: renamed from: j */
    public static final int f60834j = 3;

    /* JADX INFO: renamed from: k */
    public static final int f60835k = 4;

    /* JADX INFO: renamed from: l */
    public static final C9343mf f60836l = new C9343mf(null, new b[0], 0, -9223372036854775807L, 0);

    /* JADX INFO: renamed from: m */
    public static final b f60837m = new b(0).withAdCount(0);

    /* JADX INFO: renamed from: n */
    public static final String f60838n = t0i.intToStringMaxRadix(1);

    /* JADX INFO: renamed from: o */
    public static final String f60839o = t0i.intToStringMaxRadix(2);

    /* JADX INFO: renamed from: p */
    public static final String f60840p = t0i.intToStringMaxRadix(3);

    /* JADX INFO: renamed from: q */
    public static final String f60841q = t0i.intToStringMaxRadix(4);

    /* JADX INFO: renamed from: a */
    @hib
    public final Object f60842a;

    /* JADX INFO: renamed from: b */
    public final int f60843b;

    /* JADX INFO: renamed from: c */
    public final long f60844c;

    /* JADX INFO: renamed from: d */
    public final long f60845d;

    /* JADX INFO: renamed from: e */
    public final int f60846e;

    /* JADX INFO: renamed from: f */
    public final b[] f60847f;

    /* JADX INFO: renamed from: mf$b */
    public static final class b {

        /* JADX INFO: renamed from: l */
        public static final String f60848l = t0i.intToStringMaxRadix(0);

        /* JADX INFO: renamed from: m */
        public static final String f60849m = t0i.intToStringMaxRadix(1);

        /* JADX INFO: renamed from: n */
        public static final String f60850n = t0i.intToStringMaxRadix(2);

        /* JADX INFO: renamed from: o */
        public static final String f60851o = t0i.intToStringMaxRadix(3);

        /* JADX INFO: renamed from: p */
        public static final String f60852p = t0i.intToStringMaxRadix(4);

        /* JADX INFO: renamed from: q */
        public static final String f60853q = t0i.intToStringMaxRadix(5);

        /* JADX INFO: renamed from: r */
        public static final String f60854r = t0i.intToStringMaxRadix(6);

        /* JADX INFO: renamed from: s */
        public static final String f60855s = t0i.intToStringMaxRadix(7);

        /* JADX INFO: renamed from: t */
        @fdi
        public static final String f60856t = t0i.intToStringMaxRadix(8);

        /* JADX INFO: renamed from: u */
        public static final String f60857u = t0i.intToStringMaxRadix(9);

        /* JADX INFO: renamed from: v */
        public static final String f60858v = t0i.intToStringMaxRadix(10);

        /* JADX INFO: renamed from: a */
        public final long f60859a;

        /* JADX INFO: renamed from: b */
        public final int f60860b;

        /* JADX INFO: renamed from: c */
        public final int f60861c;

        /* JADX INFO: renamed from: d */
        @Deprecated
        public final Uri[] f60862d;

        /* JADX INFO: renamed from: e */
        public final nfa[] f60863e;

        /* JADX INFO: renamed from: f */
        public final int[] f60864f;

        /* JADX INFO: renamed from: g */
        public final long[] f60865g;

        /* JADX INFO: renamed from: h */
        public final String[] f60866h;

        /* JADX INFO: renamed from: i */
        public final long f60867i;

        /* JADX INFO: renamed from: j */
        public final boolean f60868j;

        /* JADX INFO: renamed from: k */
        public final boolean f60869k;

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

        public static b fromBundle(Bundle bundle) {
            long j = bundle.getLong(f60848l);
            int i = bundle.getInt(f60849m);
            int i2 = bundle.getInt(f60855s);
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(f60850n);
            ArrayList parcelableArrayList2 = bundle.getParcelableArrayList(f60856t);
            int[] intArray = bundle.getIntArray(f60851o);
            long[] longArray = bundle.getLongArray(f60852p);
            long j2 = bundle.getLong(f60853q);
            boolean z = bundle.getBoolean(f60854r);
            ArrayList<String> stringArrayList = bundle.getStringArrayList(f60857u);
            boolean z2 = bundle.getBoolean(f60858v);
            if (intArray == null) {
                intArray = new int[0];
            }
            nfa[] mediaItemsFromBundleArrays = getMediaItemsFromBundleArrays(parcelableArrayList2, parcelableArrayList);
            long[] jArr = longArray == null ? new long[0] : longArray;
            String[] strArr = new String[0];
            if (stringArrayList != null) {
                strArr = (String[]) stringArrayList.toArray(strArr);
            }
            return new b(j, i, i2, intArray, mediaItemsFromBundleArrays, jArr, j2, z, strArr, z2);
        }

        private ArrayList<Bundle> getMediaItemsArrayBundles() {
            ArrayList<Bundle> arrayList = new ArrayList<>();
            nfa[] nfaVarArr = this.f60863e;
            int length = nfaVarArr.length;
            for (int i = 0; i < length; i++) {
                nfa nfaVar = nfaVarArr[i];
                arrayList.add(nfaVar == null ? null : nfaVar.toBundleIncludeLocalConfiguration());
            }
            return arrayList;
        }

        private static nfa[] getMediaItemsFromBundleArrays(@hib ArrayList<Bundle> arrayList, @hib ArrayList<Uri> arrayList2) {
            int i = 0;
            if (arrayList != null) {
                nfa[] nfaVarArr = new nfa[arrayList.size()];
                while (i < arrayList.size()) {
                    Bundle bundle = arrayList.get(i);
                    nfaVarArr[i] = bundle == null ? null : nfa.fromBundle(bundle);
                    i++;
                }
                return nfaVarArr;
            }
            if (arrayList2 == null) {
                return new nfa[0];
            }
            nfa[] nfaVarArr2 = new nfa[arrayList2.size()];
            while (i < arrayList2.size()) {
                Uri uri = arrayList2.get(i);
                nfaVarArr2[i] = uri == null ? null : nfa.fromUri(uri);
                i++;
            }
            return nfaVarArr2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public b withIsPlaceholder(boolean z, boolean z2) {
            return new b(this.f60859a, this.f60860b, this.f60861c, this.f60864f, this.f60863e, this.f60865g, this.f60867i, z2, this.f60866h, z);
        }

        public b copy() {
            long j = this.f60859a;
            int i = this.f60860b;
            int i2 = this.f60861c;
            int[] iArr = this.f60864f;
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
            nfa[] nfaVarArr = this.f60863e;
            nfa[] nfaVarArr2 = (nfa[]) Arrays.copyOf(nfaVarArr, nfaVarArr.length);
            long[] jArr = this.f60865g;
            long[] jArrCopyOf = Arrays.copyOf(jArr, jArr.length);
            long j2 = this.f60867i;
            boolean z = this.f60868j;
            String[] strArr = this.f60866h;
            return new b(j, i, i2, iArrCopyOf, nfaVarArr2, jArrCopyOf, j2, z, (String[]) Arrays.copyOf(strArr, strArr.length), this.f60869k);
        }

        public boolean equals(@hib Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            return this.f60859a == bVar.f60859a && this.f60860b == bVar.f60860b && this.f60861c == bVar.f60861c && Arrays.equals(this.f60863e, bVar.f60863e) && Arrays.equals(this.f60864f, bVar.f60864f) && Arrays.equals(this.f60865g, bVar.f60865g) && this.f60867i == bVar.f60867i && this.f60868j == bVar.f60868j && Arrays.equals(this.f60866h, bVar.f60866h) && this.f60869k == bVar.f60869k;
        }

        public int getFirstAdIndexToPlay() {
            return getNextAdIndexToPlay(-1);
        }

        public int getIndexOfAdId(String str) {
            int i = 0;
            while (true) {
                String[] strArr = this.f60866h;
                if (i >= strArr.length) {
                    return -1;
                }
                if (Objects.equals(strArr[i], str)) {
                    return i;
                }
                i++;
            }
        }

        public int getNextAdIndexToPlay(@h78(from = -1) int i) {
            int i2;
            int i3 = i + 1;
            while (true) {
                int[] iArr = this.f60864f;
                if (i3 >= iArr.length || this.f60868j || (i2 = iArr[i3]) == 0 || i2 == 1) {
                    break;
                }
                i3++;
            }
            return i3;
        }

        public boolean hasUnplayedAds() {
            if (this.f60860b == -1) {
                return true;
            }
            for (int i = 0; i < this.f60860b; i++) {
                int i2 = this.f60864f[i];
                if (i2 == 0 || i2 == 1) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            int i = ((this.f60860b * 31) + this.f60861c) * 31;
            long j = this.f60859a;
            int iHashCode = (((((((i + ((int) (j ^ (j >>> 32)))) * 31) + Arrays.hashCode(this.f60863e)) * 31) + Arrays.hashCode(this.f60864f)) * 31) + Arrays.hashCode(this.f60865g)) * 31;
            long j2 = this.f60867i;
            return ((((((iHashCode + ((int) (j2 ^ (j2 >>> 32)))) * 31) + (this.f60868j ? 1 : 0)) * 31) + Arrays.hashCode(this.f60866h)) * 31) + (this.f60869k ? 1 : 0);
        }

        public boolean isLivePostrollPlaceholder(boolean z) {
            return this.f60868j == z && isLivePostrollPlaceholder();
        }

        public boolean shouldPlayAdGroup() {
            return this.f60860b == -1 || getFirstAdIndexToPlay() < this.f60860b;
        }

        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putLong(f60848l, this.f60859a);
            bundle.putInt(f60849m, this.f60860b);
            bundle.putInt(f60855s, this.f60861c);
            bundle.putParcelableArrayList(f60850n, new ArrayList<>(Arrays.asList(this.f60862d)));
            bundle.putParcelableArrayList(f60856t, getMediaItemsArrayBundles());
            bundle.putIntArray(f60851o, this.f60864f);
            bundle.putLongArray(f60852p, this.f60865g);
            bundle.putLong(f60853q, this.f60867i);
            bundle.putBoolean(f60854r, this.f60868j);
            bundle.putStringArrayList(f60857u, new ArrayList<>(Arrays.asList(this.f60866h)));
            bundle.putBoolean(f60858v, this.f60869k);
            return bundle;
        }

        @yx1
        public b withAdCount(int i) {
            int[] iArrCopyStatesWithSpaceForAdCount = copyStatesWithSpaceForAdCount(this.f60864f, i);
            long[] jArrCopyDurationsUsWithSpaceForAdCount = copyDurationsUsWithSpaceForAdCount(this.f60865g, i);
            return new b(this.f60859a, i, this.f60861c, iArrCopyStatesWithSpaceForAdCount, (nfa[]) Arrays.copyOf(this.f60863e, i), jArrCopyDurationsUsWithSpaceForAdCount, this.f60867i, this.f60868j, (String[]) Arrays.copyOf(this.f60866h, i), this.f60869k);
        }

        @yx1
        public b withAdDurationsUs(long[] jArr) {
            int length = jArr.length;
            nfa[] nfaVarArr = this.f60863e;
            if (length < nfaVarArr.length) {
                jArr = copyDurationsUsWithSpaceForAdCount(jArr, nfaVarArr.length);
            } else if (this.f60860b != -1 && jArr.length > nfaVarArr.length) {
                jArr = Arrays.copyOf(jArr, nfaVarArr.length);
            }
            return new b(this.f60859a, this.f60860b, this.f60861c, this.f60864f, this.f60863e, jArr, this.f60867i, this.f60868j, this.f60866h, this.f60869k);
        }

        @yx1
        public b withAdId(String str, @h78(from = 0) int i) {
            int[] iArrCopyStatesWithSpaceForAdCount = copyStatesWithSpaceForAdCount(this.f60864f, i + 1);
            long[] jArrCopyDurationsUsWithSpaceForAdCount = this.f60865g;
            if (jArrCopyDurationsUsWithSpaceForAdCount.length != iArrCopyStatesWithSpaceForAdCount.length) {
                jArrCopyDurationsUsWithSpaceForAdCount = copyDurationsUsWithSpaceForAdCount(jArrCopyDurationsUsWithSpaceForAdCount, iArrCopyStatesWithSpaceForAdCount.length);
            }
            long[] jArr = jArrCopyDurationsUsWithSpaceForAdCount;
            nfa[] nfaVarArr = this.f60863e;
            if (nfaVarArr.length != iArrCopyStatesWithSpaceForAdCount.length) {
                nfaVarArr = (nfa[]) Arrays.copyOf(nfaVarArr, iArrCopyStatesWithSpaceForAdCount.length);
            }
            nfa[] nfaVarArr2 = nfaVarArr;
            String[] strArr = this.f60866h;
            if (strArr.length != iArrCopyStatesWithSpaceForAdCount.length) {
                strArr = (String[]) Arrays.copyOf(strArr, iArrCopyStatesWithSpaceForAdCount.length);
            }
            String[] strArr2 = strArr;
            strArr2[i] = str;
            return new b(this.f60859a, this.f60860b, this.f60861c, iArrCopyStatesWithSpaceForAdCount, nfaVarArr2, jArr, this.f60867i, this.f60868j, strArr2, this.f60869k);
        }

        @yx1
        public b withAdMediaItem(nfa nfaVar, @h78(from = 0) int i) {
            int[] iArrCopyStatesWithSpaceForAdCount = copyStatesWithSpaceForAdCount(this.f60864f, i + 1);
            long[] jArrCopyDurationsUsWithSpaceForAdCount = this.f60865g;
            if (jArrCopyDurationsUsWithSpaceForAdCount.length != iArrCopyStatesWithSpaceForAdCount.length) {
                jArrCopyDurationsUsWithSpaceForAdCount = copyDurationsUsWithSpaceForAdCount(jArrCopyDurationsUsWithSpaceForAdCount, iArrCopyStatesWithSpaceForAdCount.length);
            }
            long[] jArr = jArrCopyDurationsUsWithSpaceForAdCount;
            nfa[] nfaVarArr = (nfa[]) Arrays.copyOf(this.f60863e, iArrCopyStatesWithSpaceForAdCount.length);
            nfaVarArr[i] = nfaVar;
            iArrCopyStatesWithSpaceForAdCount[i] = 1;
            String[] strArr = this.f60866h;
            if (strArr.length != iArrCopyStatesWithSpaceForAdCount.length) {
                strArr = (String[]) Arrays.copyOf(strArr, iArrCopyStatesWithSpaceForAdCount.length);
            }
            return new b(this.f60859a, this.f60860b, this.f60861c, iArrCopyStatesWithSpaceForAdCount, nfaVarArr, jArr, this.f60867i, this.f60868j, strArr, this.f60869k);
        }

        @yx1
        public b withAdState(int i, @h78(from = 0) int i2) {
            int i3 = this.f60860b;
            v80.checkArgument(i3 == -1 || i2 < i3);
            int[] iArrCopyStatesWithSpaceForAdCount = copyStatesWithSpaceForAdCount(this.f60864f, i2 + 1);
            int i4 = iArrCopyStatesWithSpaceForAdCount[i2];
            v80.checkArgument(i4 == 0 || i4 == 1 || i4 == i);
            long[] jArrCopyDurationsUsWithSpaceForAdCount = this.f60865g;
            if (jArrCopyDurationsUsWithSpaceForAdCount.length != iArrCopyStatesWithSpaceForAdCount.length) {
                jArrCopyDurationsUsWithSpaceForAdCount = copyDurationsUsWithSpaceForAdCount(jArrCopyDurationsUsWithSpaceForAdCount, iArrCopyStatesWithSpaceForAdCount.length);
            }
            long[] jArr = jArrCopyDurationsUsWithSpaceForAdCount;
            nfa[] nfaVarArr = this.f60863e;
            if (nfaVarArr.length != iArrCopyStatesWithSpaceForAdCount.length) {
                nfaVarArr = (nfa[]) Arrays.copyOf(nfaVarArr, iArrCopyStatesWithSpaceForAdCount.length);
            }
            nfa[] nfaVarArr2 = nfaVarArr;
            String[] strArr = this.f60866h;
            if (strArr.length != iArrCopyStatesWithSpaceForAdCount.length) {
                strArr = (String[]) Arrays.copyOf(strArr, iArrCopyStatesWithSpaceForAdCount.length);
            }
            String[] strArr2 = strArr;
            iArrCopyStatesWithSpaceForAdCount[i2] = i;
            return new b(this.f60859a, this.f60860b, this.f60861c, iArrCopyStatesWithSpaceForAdCount, nfaVarArr2, jArr, this.f60867i, this.f60868j, strArr2, this.f60869k);
        }

        @yx1
        @Deprecated
        public b withAdUri(Uri uri, @h78(from = 0) int i) {
            return withAdMediaItem(nfa.fromUri(uri), i);
        }

        @yx1
        public b withAllAdsReset() {
            if (this.f60860b == -1) {
                return this;
            }
            int[] iArr = this.f60864f;
            int length = iArr.length;
            int[] iArrCopyOf = Arrays.copyOf(iArr, length);
            for (int i = 0; i < length; i++) {
                int i2 = iArrCopyOf[i];
                if (i2 == 3 || i2 == 2 || i2 == 4) {
                    iArrCopyOf[i] = this.f60863e[i] == null ? 0 : 1;
                }
            }
            return new b(this.f60859a, length, this.f60861c, iArrCopyOf, this.f60863e, this.f60865g, this.f60867i, this.f60868j, this.f60866h, this.f60869k);
        }

        @yx1
        public b withAllAdsSkipped() {
            if (this.f60860b == -1) {
                return new b(this.f60859a, 0, this.f60861c, new int[0], new nfa[0], new long[0], this.f60867i, this.f60868j, this.f60866h, this.f60869k);
            }
            int[] iArr = this.f60864f;
            int length = iArr.length;
            int[] iArrCopyOf = Arrays.copyOf(iArr, length);
            for (int i = 0; i < length; i++) {
                int i2 = iArrCopyOf[i];
                if (i2 == 1 || i2 == 0) {
                    iArrCopyOf[i] = 2;
                }
            }
            return new b(this.f60859a, length, this.f60861c, iArrCopyOf, this.f60863e, this.f60865g, this.f60867i, this.f60868j, this.f60866h, this.f60869k);
        }

        @yx1
        public b withContentResumeOffsetUs(long j) {
            return new b(this.f60859a, this.f60860b, this.f60861c, this.f60864f, this.f60863e, this.f60865g, j, this.f60868j, this.f60866h, this.f60869k);
        }

        @yx1
        public b withIsServerSideInserted(boolean z) {
            return new b(this.f60859a, this.f60860b, this.f60861c, this.f60864f, this.f60863e, this.f60865g, this.f60867i, z, this.f60866h, this.f60869k);
        }

        public b withLastAdRemoved() {
            int[] iArr = this.f60864f;
            int length = iArr.length - 1;
            int[] iArrCopyOf = Arrays.copyOf(iArr, length);
            nfa[] nfaVarArr = (nfa[]) Arrays.copyOf(this.f60863e, length);
            long[] jArrCopyOf = this.f60865g;
            if (jArrCopyOf.length > length) {
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, length);
            }
            long[] jArr = jArrCopyOf;
            return new b(this.f60859a, length, this.f60861c, iArrCopyOf, nfaVarArr, jArr, t0i.sum(jArr), this.f60868j, (String[]) Arrays.copyOf(this.f60866h, length), this.f60869k);
        }

        public b withOriginalAdCount(int i) {
            return new b(this.f60859a, this.f60860b, i, this.f60864f, this.f60863e, this.f60865g, this.f60867i, this.f60868j, this.f60866h, this.f60869k);
        }

        @yx1
        public b withTimeUs(long j) {
            return new b(j, this.f60860b, this.f60861c, this.f60864f, this.f60863e, this.f60865g, this.f60867i, this.f60868j, this.f60866h, this.f60869k);
        }

        public b(long j) {
            this(j, -1, -1, new int[0], new nfa[0], new long[0], 0L, false, new String[0], false);
        }

        public boolean isLivePostrollPlaceholder() {
            return this.f60869k && this.f60859a == Long.MIN_VALUE && this.f60860b == -1;
        }

        private b(long j, int i, int i2, int[] iArr, nfa[] nfaVarArr, long[] jArr, long j2, boolean z, String[] strArr, boolean z2) {
            int i3 = 0;
            v80.checkArgument(iArr.length == nfaVarArr.length);
            this.f60859a = j;
            this.f60860b = i;
            this.f60861c = i2;
            this.f60864f = iArr;
            this.f60863e = nfaVarArr;
            this.f60865g = jArr;
            this.f60867i = j2;
            this.f60868j = z;
            this.f60862d = new Uri[nfaVarArr.length];
            while (true) {
                Uri[] uriArr = this.f60862d;
                if (i3 < uriArr.length) {
                    nfa nfaVar = nfaVarArr[i3];
                    uriArr[i3] = nfaVar == null ? null : ((nfa.C9856h) v80.checkNotNull(nfaVar.f64305b)).f64406a;
                    i3++;
                } else {
                    this.f60866h = strArr;
                    this.f60869k = z2;
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: mf$c */
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface c {
    }

    public C9343mf(Object obj, long... jArr) {
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

    public static C9343mf fromAdPlaybackState(Object obj, C9343mf c9343mf) {
        int i = c9343mf.f60843b - c9343mf.f60846e;
        b[] bVarArr = new b[i];
        for (int i2 = 0; i2 < i; i2++) {
            b bVar = c9343mf.f60847f[i2];
            long j = bVar.f60859a;
            int i3 = bVar.f60860b;
            int i4 = bVar.f60861c;
            int[] iArr = bVar.f60864f;
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
            nfa[] nfaVarArr = bVar.f60863e;
            nfa[] nfaVarArr2 = (nfa[]) Arrays.copyOf(nfaVarArr, nfaVarArr.length);
            long[] jArr = bVar.f60865g;
            bVarArr[i2] = new b(j, i3, i4, iArrCopyOf, nfaVarArr2, Arrays.copyOf(jArr, jArr.length), bVar.f60867i, bVar.f60868j, bVar.f60866h, bVar.f60869k);
        }
        return new C9343mf(obj, bVarArr, c9343mf.f60844c, c9343mf.f60845d, c9343mf.f60846e);
    }

    public static C9343mf fromBundle(Bundle bundle) {
        b[] bVarArr;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(f60838n);
        if (parcelableArrayList == null) {
            bVarArr = new b[0];
        } else {
            b[] bVarArr2 = new b[parcelableArrayList.size()];
            for (int i = 0; i < parcelableArrayList.size(); i++) {
                bVarArr2[i] = b.fromBundle((Bundle) parcelableArrayList.get(i));
            }
            bVarArr = bVarArr2;
        }
        String str = f60839o;
        C9343mf c9343mf = f60836l;
        return new C9343mf(null, bVarArr, bundle.getLong(str, c9343mf.f60844c), bundle.getLong(f60840p, c9343mf.f60845d), bundle.getInt(f60841q, c9343mf.f60846e));
    }

    private boolean isPositionBeforeAdGroup(long j, long j2, int i) {
        if (j == Long.MIN_VALUE) {
            return false;
        }
        b adGroup = getAdGroup(i);
        long j3 = adGroup.f60859a;
        return j3 == Long.MIN_VALUE ? j2 == -9223372036854775807L || adGroup.isLivePostrollPlaceholder() || j < j2 : j < j3;
    }

    @fdi
    /* JADX INFO: renamed from: a */
    public C9343mf m17283a(int i, boolean z, boolean z2) {
        int i2 = i - this.f60846e;
        b[] bVarArr = this.f60847f;
        b bVar = bVarArr[i2];
        if (bVar.f60869k == z && bVar.f60868j == z2) {
            return this;
        }
        b[] bVarArr2 = (b[]) t0i.nullSafeArrayCopy(bVarArr, bVarArr.length);
        bVarArr2[i2] = bVarArr2[i2].withIsPlaceholder(z, z2);
        return new C9343mf(this.f60842a, bVarArr2, this.f60844c, this.f60845d, this.f60846e);
    }

    @yx1
    public C9343mf copy() {
        int length = this.f60847f.length;
        b[] bVarArr = new b[length];
        for (int i = 0; i < length; i++) {
            bVarArr[i] = this.f60847f[i].copy();
        }
        return new C9343mf(this.f60842a, bVarArr, this.f60844c, this.f60845d, this.f60846e);
    }

    public boolean endsWithLivePostrollPlaceHolder() {
        int i = this.f60843b - 1;
        return i >= 0 && isLivePostrollPlaceholder(i);
    }

    public boolean equals(@hib Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C9343mf.class != obj.getClass()) {
            return false;
        }
        C9343mf c9343mf = (C9343mf) obj;
        return Objects.equals(this.f60842a, c9343mf.f60842a) && this.f60843b == c9343mf.f60843b && this.f60844c == c9343mf.f60844c && this.f60845d == c9343mf.f60845d && this.f60846e == c9343mf.f60846e && Arrays.equals(this.f60847f, c9343mf.f60847f);
    }

    public b getAdGroup(@h78(from = 0) int i) {
        int i2 = this.f60846e;
        return i < i2 ? f60837m : this.f60847f[i - i2];
    }

    public int getAdGroupIndexAfterPositionUs(long j, long j2) {
        if (j == Long.MIN_VALUE) {
            return -1;
        }
        if (j2 != -9223372036854775807L && j >= j2) {
            return -1;
        }
        int i = this.f60846e;
        while (i < this.f60843b && ((getAdGroup(i).f60859a != Long.MIN_VALUE && getAdGroup(i).f60859a <= j) || !getAdGroup(i).shouldPlayAdGroup())) {
            i++;
        }
        if (i >= this.f60843b) {
            return -1;
        }
        if (j2 == -9223372036854775807L || getAdGroup(i).f60859a <= j2) {
            return i;
        }
        return -1;
    }

    public int getAdGroupIndexForPositionUs(long j, long j2) {
        int i = this.f60843b - 1;
        int i2 = i - (isLivePostrollPlaceholder(i) ? 1 : 0);
        while (i2 >= 0 && isPositionBeforeAdGroup(j, j2, i2)) {
            i2--;
        }
        if (i2 < 0 || !getAdGroup(i2).hasUnplayedAds()) {
            return -1;
        }
        return i2;
    }

    public int getAdIndexOfAdId(int i, String str) {
        return getAdGroup(i).getIndexOfAdId(str);
    }

    public int hashCode() {
        int i = this.f60843b * 31;
        Object obj = this.f60842a;
        return ((((((((i + (obj == null ? 0 : obj.hashCode())) * 31) + ((int) this.f60844c)) * 31) + ((int) this.f60845d)) * 31) + this.f60846e) * 31) + Arrays.hashCode(this.f60847f);
    }

    public boolean isAdInErrorState(@h78(from = 0) int i, @h78(from = 0) int i2) {
        b adGroup;
        int i3;
        return i < this.f60843b && (i3 = (adGroup = getAdGroup(i)).f60860b) != -1 && i2 < i3 && adGroup.f60864f[i2] == 4;
    }

    public boolean isLivePostrollPlaceholder(int i) {
        return i == this.f60843b - 1 && getAdGroup(i).isLivePostrollPlaceholder();
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        for (b bVar : this.f60847f) {
            arrayList.add(bVar.toBundle());
        }
        if (!arrayList.isEmpty()) {
            bundle.putParcelableArrayList(f60838n, arrayList);
        }
        long j = this.f60844c;
        C9343mf c9343mf = f60836l;
        if (j != c9343mf.f60844c) {
            bundle.putLong(f60839o, j);
        }
        long j2 = this.f60845d;
        if (j2 != c9343mf.f60845d) {
            bundle.putLong(f60840p, j2);
        }
        int i = this.f60846e;
        if (i != c9343mf.f60846e) {
            bundle.putInt(f60841q, i);
        }
        return bundle;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AdPlaybackState(adsId=");
        sb.append(this.f60842a);
        sb.append(", adResumePositionUs=");
        sb.append(this.f60844c);
        sb.append(", adGroups=[");
        for (int i = 0; i < this.f60847f.length; i++) {
            sb.append("adGroup(timeUs=");
            sb.append(this.f60847f[i].f60859a);
            sb.append(", ads=[");
            for (int i2 = 0; i2 < this.f60847f[i].f60864f.length; i2++) {
                sb.append("ad(state=");
                int i3 = this.f60847f[i].f60864f[i2];
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
                sb.append(this.f60847f[i].f60865g[i2]);
                sb.append(')');
                if (i2 < this.f60847f[i].f60864f.length - 1) {
                    sb.append(", ");
                }
            }
            sb.append("])");
            if (i < this.f60847f.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("])");
        return sb.toString();
    }

    @yx1
    public C9343mf withAdCount(@h78(from = 0) int i, @h78(from = 1) int i2) {
        v80.checkArgument(i2 > 0);
        int i3 = i - this.f60846e;
        b[] bVarArr = this.f60847f;
        if (bVarArr[i3].f60860b == i2) {
            return this;
        }
        b[] bVarArr2 = (b[]) t0i.nullSafeArrayCopy(bVarArr, bVarArr.length);
        bVarArr2[i3] = this.f60847f[i3].withAdCount(i2);
        return new C9343mf(this.f60842a, bVarArr2, this.f60844c, this.f60845d, this.f60846e);
    }

    @yx1
    public C9343mf withAdDurationsUs(long[][] jArr) {
        int i = 0;
        v80.checkArgument(jArr.length == this.f60843b);
        b[] bVarArr = this.f60847f;
        b[] bVarArr2 = (b[]) t0i.nullSafeArrayCopy(bVarArr, bVarArr.length);
        while (true) {
            int i2 = this.f60843b;
            int i3 = this.f60846e;
            if (i >= i2 - i3) {
                return new C9343mf(this.f60842a, bVarArr2, this.f60844c, this.f60845d, i3);
            }
            bVarArr2[i] = bVarArr2[i].withAdDurationsUs(jArr[i3 + i]);
            i++;
        }
    }

    @yx1
    public C9343mf withAdGroupTimeUs(@h78(from = 0) int i, long j) {
        int i2 = i - this.f60846e;
        b[] bVarArr = this.f60847f;
        b[] bVarArr2 = (b[]) t0i.nullSafeArrayCopy(bVarArr, bVarArr.length);
        bVarArr2[i2] = this.f60847f[i2].withTimeUs(j);
        return new C9343mf(this.f60842a, bVarArr2, this.f60844c, this.f60845d, this.f60846e);
    }

    @yx1
    public C9343mf withAdId(@h78(from = 0) int i, @h78(from = 0) int i2, String str) {
        int i3 = i - this.f60846e;
        b[] bVarArr = this.f60847f;
        b[] bVarArr2 = (b[]) t0i.nullSafeArrayCopy(bVarArr, bVarArr.length);
        bVarArr2[i3] = bVarArr2[i3].withAdId(str, i2);
        return new C9343mf(this.f60842a, bVarArr2, this.f60844c, this.f60845d, this.f60846e);
    }

    @yx1
    public C9343mf withAdLoadError(@h78(from = 0) int i, @h78(from = 0) int i2) {
        int i3 = i - this.f60846e;
        b[] bVarArr = this.f60847f;
        b[] bVarArr2 = (b[]) t0i.nullSafeArrayCopy(bVarArr, bVarArr.length);
        bVarArr2[i3] = bVarArr2[i3].withAdState(4, i2);
        return new C9343mf(this.f60842a, bVarArr2, this.f60844c, this.f60845d, this.f60846e);
    }

    @yx1
    public C9343mf withAdResumePositionUs(long j) {
        return this.f60844c == j ? this : new C9343mf(this.f60842a, this.f60847f, j, this.f60845d, this.f60846e);
    }

    @yx1
    public C9343mf withAdsId(Object obj) {
        return new C9343mf(obj, this.f60847f, this.f60844c, this.f60845d, this.f60846e);
    }

    @yx1
    public C9343mf withAvailableAd(@h78(from = 0) int i, @h78(from = 0) int i2) {
        return withAvailableAdMediaItem(i, i2, nfa.fromUri(Uri.EMPTY));
    }

    @yx1
    public C9343mf withAvailableAdMediaItem(@h78(from = 0) int i, @h78(from = 0) int i2, nfa nfaVar) {
        nfa.C9856h c9856h;
        int i3 = i - this.f60846e;
        b[] bVarArr = this.f60847f;
        b[] bVarArr2 = (b[]) t0i.nullSafeArrayCopy(bVarArr, bVarArr.length);
        v80.checkState(bVarArr2[i3].f60868j || !((c9856h = nfaVar.f64305b) == null || c9856h.f64406a.equals(Uri.EMPTY)));
        bVarArr2[i3] = bVarArr2[i3].withAdMediaItem(nfaVar, i2);
        return new C9343mf(this.f60842a, bVarArr2, this.f60844c, this.f60845d, this.f60846e);
    }

    @yx1
    @Deprecated
    public C9343mf withAvailableAdUri(@h78(from = 0) int i, @h78(from = 0) int i2, Uri uri) {
        return withAvailableAdMediaItem(i, i2, nfa.fromUri(uri));
    }

    @yx1
    public C9343mf withContentDurationUs(long j) {
        return this.f60845d == j ? this : new C9343mf(this.f60842a, this.f60847f, this.f60844c, j, this.f60846e);
    }

    @yx1
    public C9343mf withContentResumeOffsetUs(@h78(from = 0) int i, long j) {
        int i2 = i - this.f60846e;
        b[] bVarArr = this.f60847f;
        if (bVarArr[i2].f60867i == j) {
            return this;
        }
        b[] bVarArr2 = (b[]) t0i.nullSafeArrayCopy(bVarArr, bVarArr.length);
        bVarArr2[i2] = bVarArr2[i2].withContentResumeOffsetUs(j);
        return new C9343mf(this.f60842a, bVarArr2, this.f60844c, this.f60845d, this.f60846e);
    }

    @yx1
    public C9343mf withIsServerSideInserted(@h78(from = 0) int i, boolean z) {
        int i2 = i - this.f60846e;
        b[] bVarArr = this.f60847f;
        if (bVarArr[i2].f60868j == z) {
            return this;
        }
        b[] bVarArr2 = (b[]) t0i.nullSafeArrayCopy(bVarArr, bVarArr.length);
        bVarArr2[i2] = bVarArr2[i2].withIsServerSideInserted(z);
        return new C9343mf(this.f60842a, bVarArr2, this.f60844c, this.f60845d, this.f60846e);
    }

    @yx1
    public C9343mf withLastAdRemoved(@h78(from = 0) int i) {
        int i2 = i - this.f60846e;
        b[] bVarArr = this.f60847f;
        b[] bVarArr2 = (b[]) t0i.nullSafeArrayCopy(bVarArr, bVarArr.length);
        bVarArr2[i2] = bVarArr2[i2].withLastAdRemoved();
        return new C9343mf(this.f60842a, bVarArr2, this.f60844c, this.f60845d, this.f60846e);
    }

    @Deprecated
    @p28(replacement = "this.withLivePostrollPlaceholderAppended(true)")
    public C9343mf withLivePostrollPlaceholderAppended() {
        return withLivePostrollPlaceholderAppended(true);
    }

    @yx1
    public C9343mf withNewAdGroup(@h78(from = 0) int i, long j) {
        int i2 = i - this.f60846e;
        b bVar = new b(j);
        b[] bVarArr = (b[]) t0i.nullSafeArrayAppend(this.f60847f, bVar);
        System.arraycopy(bVarArr, i2, bVarArr, i2 + 1, this.f60847f.length - i2);
        bVarArr[i2] = bVar;
        return new C9343mf(this.f60842a, bVarArr, this.f60844c, this.f60845d, this.f60846e);
    }

    @yx1
    public C9343mf withOriginalAdCount(@h78(from = 0) int i, int i2) {
        int i3 = i - this.f60846e;
        b[] bVarArr = this.f60847f;
        if (bVarArr[i3].f60861c == i2) {
            return this;
        }
        b[] bVarArr2 = (b[]) t0i.nullSafeArrayCopy(bVarArr, bVarArr.length);
        bVarArr2[i3] = bVarArr2[i3].withOriginalAdCount(i2);
        return new C9343mf(this.f60842a, bVarArr2, this.f60844c, this.f60845d, this.f60846e);
    }

    @yx1
    public C9343mf withPlayedAd(@h78(from = 0) int i, @h78(from = 0) int i2) {
        int i3 = i - this.f60846e;
        b[] bVarArr = this.f60847f;
        b[] bVarArr2 = (b[]) t0i.nullSafeArrayCopy(bVarArr, bVarArr.length);
        bVarArr2[i3] = bVarArr2[i3].withAdState(3, i2);
        return new C9343mf(this.f60842a, bVarArr2, this.f60844c, this.f60845d, this.f60846e);
    }

    @yx1
    public C9343mf withRemovedAdGroupCount(@h78(from = 0) int i) {
        int i2 = this.f60846e;
        if (i2 == i) {
            return this;
        }
        v80.checkArgument(i > i2);
        int i3 = this.f60843b - i;
        b[] bVarArr = new b[i3];
        System.arraycopy(this.f60847f, i - this.f60846e, bVarArr, 0, i3);
        return new C9343mf(this.f60842a, bVarArr, this.f60844c, this.f60845d, i);
    }

    @yx1
    public C9343mf withRemovedAdGroupCountBefore(long j) {
        int i = this.f60846e;
        while (i < this.f60843b) {
            long j2 = getAdGroup(i).f60859a;
            if (j <= j2 || j2 == Long.MIN_VALUE) {
                break;
            }
            i++;
        }
        return withRemovedAdGroupCount(i);
    }

    @yx1
    public C9343mf withResetAdGroup(@h78(from = 0) int i) {
        int i2 = i - this.f60846e;
        b[] bVarArr = this.f60847f;
        b[] bVarArr2 = (b[]) t0i.nullSafeArrayCopy(bVarArr, bVarArr.length);
        bVarArr2[i2] = bVarArr2[i2].withAllAdsReset();
        return new C9343mf(this.f60842a, bVarArr2, this.f60844c, this.f60845d, this.f60846e);
    }

    @yx1
    public C9343mf withSkippedAd(@h78(from = 0) int i, @h78(from = 0) int i2) {
        int i3 = i - this.f60846e;
        b[] bVarArr = this.f60847f;
        b[] bVarArr2 = (b[]) t0i.nullSafeArrayCopy(bVarArr, bVarArr.length);
        bVarArr2[i3] = bVarArr2[i3].withAdState(2, i2);
        return new C9343mf(this.f60842a, bVarArr2, this.f60844c, this.f60845d, this.f60846e);
    }

    @yx1
    public C9343mf withSkippedAdGroup(@h78(from = 0) int i) {
        int i2 = i - this.f60846e;
        b[] bVarArr = this.f60847f;
        b[] bVarArr2 = (b[]) t0i.nullSafeArrayCopy(bVarArr, bVarArr.length);
        bVarArr2[i2] = bVarArr2[i2].withAllAdsSkipped();
        return new C9343mf(this.f60842a, bVarArr2, this.f60844c, this.f60845d, this.f60846e);
    }

    public boolean isLivePostrollPlaceholder(int i, boolean z) {
        return i == this.f60843b - 1 && getAdGroup(i).isLivePostrollPlaceholder(z);
    }

    public C9343mf withLivePostrollPlaceholderAppended(boolean z) {
        return withNewAdGroup(this.f60843b, Long.MIN_VALUE).m17283a(this.f60843b, true, z);
    }

    private C9343mf(@hib Object obj, b[] bVarArr, long j, long j2, int i) {
        this.f60842a = obj;
        this.f60844c = j;
        this.f60845d = j2;
        this.f60843b = bVarArr.length + i;
        this.f60847f = bVarArr;
        this.f60846e = i;
    }

    public boolean endsWithLivePostrollPlaceHolder(boolean z) {
        int i = this.f60843b - 1;
        return i >= 0 && isLivePostrollPlaceholder(i, z);
    }

    @yx1
    public C9343mf withAdDurationsUs(@h78(from = 0) int i, long... jArr) {
        int i2 = i - this.f60846e;
        b[] bVarArr = this.f60847f;
        b[] bVarArr2 = (b[]) t0i.nullSafeArrayCopy(bVarArr, bVarArr.length);
        bVarArr2[i2] = bVarArr2[i2].withAdDurationsUs(jArr);
        return new C9343mf(this.f60842a, bVarArr2, this.f60844c, this.f60845d, this.f60846e);
    }
}
