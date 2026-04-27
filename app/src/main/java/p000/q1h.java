package p000;

import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Objects;
import p000.C9343mf;
import p000.kx7;
import p000.nfa;
import p000.q1h;

/* JADX INFO: loaded from: classes3.dex */
public abstract class q1h {

    /* JADX INFO: renamed from: a */
    public static final q1h f72935a = new C11269a();

    /* JADX INFO: renamed from: b */
    public static final String f72936b = t0i.intToStringMaxRadix(0);

    /* JADX INFO: renamed from: c */
    public static final String f72937c = t0i.intToStringMaxRadix(1);

    /* JADX INFO: renamed from: d */
    public static final String f72938d = t0i.intToStringMaxRadix(2);

    /* JADX INFO: renamed from: q1h$a */
    public class C11269a extends q1h {
        @Override // p000.q1h
        public int getIndexOfPeriod(Object obj) {
            return -1;
        }

        @Override // p000.q1h
        public C11270b getPeriod(int i, C11270b c11270b, boolean z) {
            throw new IndexOutOfBoundsException();
        }

        @Override // p000.q1h
        public int getPeriodCount() {
            return 0;
        }

        @Override // p000.q1h
        public Object getUidOfPeriod(int i) {
            throw new IndexOutOfBoundsException();
        }

        @Override // p000.q1h
        public C11272d getWindow(int i, C11272d c11272d, long j) {
            throw new IndexOutOfBoundsException();
        }

        @Override // p000.q1h
        public int getWindowCount() {
            return 0;
        }
    }

    /* JADX INFO: renamed from: q1h$b */
    public static final class C11270b {

        /* JADX INFO: renamed from: h */
        public static final String f72939h = t0i.intToStringMaxRadix(0);

        /* JADX INFO: renamed from: i */
        public static final String f72940i = t0i.intToStringMaxRadix(1);

        /* JADX INFO: renamed from: j */
        public static final String f72941j = t0i.intToStringMaxRadix(2);

        /* JADX INFO: renamed from: k */
        public static final String f72942k = t0i.intToStringMaxRadix(3);

        /* JADX INFO: renamed from: l */
        public static final String f72943l = t0i.intToStringMaxRadix(4);

        /* JADX INFO: renamed from: a */
        @hib
        public Object f72944a;

        /* JADX INFO: renamed from: b */
        @hib
        public Object f72945b;

        /* JADX INFO: renamed from: c */
        public int f72946c;

        /* JADX INFO: renamed from: d */
        @ovh
        public long f72947d;

        /* JADX INFO: renamed from: e */
        @ovh
        public long f72948e;

        /* JADX INFO: renamed from: f */
        public boolean f72949f;

        /* JADX INFO: renamed from: g */
        @ovh
        public C9343mf f72950g = C9343mf.f60836l;

        @ovh
        public static C11270b fromBundle(Bundle bundle) {
            int i = bundle.getInt(f72939h, 0);
            long j = bundle.getLong(f72940i, -9223372036854775807L);
            long j2 = bundle.getLong(f72941j, 0L);
            boolean z = bundle.getBoolean(f72942k, false);
            Bundle bundle2 = bundle.getBundle(f72943l);
            C9343mf c9343mfFromBundle = bundle2 != null ? C9343mf.fromBundle(bundle2) : C9343mf.f60836l;
            C11270b c11270b = new C11270b();
            c11270b.set(null, null, i, j, j2, c9343mfFromBundle, z);
            return c11270b;
        }

        public boolean equals(@hib Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !C11270b.class.equals(obj.getClass())) {
                return false;
            }
            C11270b c11270b = (C11270b) obj;
            return Objects.equals(this.f72944a, c11270b.f72944a) && Objects.equals(this.f72945b, c11270b.f72945b) && this.f72946c == c11270b.f72946c && this.f72947d == c11270b.f72947d && this.f72948e == c11270b.f72948e && this.f72949f == c11270b.f72949f && Objects.equals(this.f72950g, c11270b.f72950g);
        }

        public int getAdCountInAdGroup(int i) {
            return this.f72950g.getAdGroup(i).f60860b;
        }

        public long getAdDurationUs(int i, int i2) {
            C9343mf.b adGroup = this.f72950g.getAdGroup(i);
            if (adGroup.f60860b != -1) {
                return adGroup.f60865g[i2];
            }
            return -9223372036854775807L;
        }

        public int getAdGroupCount() {
            return this.f72950g.f60843b;
        }

        public int getAdGroupIndexAfterPositionUs(long j) {
            return this.f72950g.getAdGroupIndexAfterPositionUs(j, this.f72947d);
        }

        public int getAdGroupIndexForPositionUs(long j) {
            return this.f72950g.getAdGroupIndexForPositionUs(j, this.f72947d);
        }

        public long getAdGroupTimeUs(int i) {
            return this.f72950g.getAdGroup(i).f60859a;
        }

        public long getAdResumePositionUs() {
            return this.f72950g.f60844c;
        }

        @ovh
        public int getAdState(int i, int i2) {
            C9343mf.b adGroup = this.f72950g.getAdGroup(i);
            if (adGroup.f60860b != -1) {
                return adGroup.f60864f[i2];
            }
            return 0;
        }

        @hib
        public Object getAdsId() {
            return this.f72950g.f60842a;
        }

        @ovh
        public long getContentResumeOffsetUs(int i) {
            return this.f72950g.getAdGroup(i).f60867i;
        }

        public long getDurationMs() {
            return t0i.usToMs(this.f72947d);
        }

        public long getDurationUs() {
            return this.f72947d;
        }

        public int getFirstAdIndexToPlay(int i) {
            return this.f72950g.getAdGroup(i).getFirstAdIndexToPlay();
        }

        public int getNextAdIndexToPlay(int i, int i2) {
            return this.f72950g.getAdGroup(i).getNextAdIndexToPlay(i2);
        }

        public long getPositionInWindowMs() {
            return t0i.usToMs(this.f72948e);
        }

        public long getPositionInWindowUs() {
            return this.f72948e;
        }

        public int getRemovedAdGroupCount() {
            return this.f72950g.f60846e;
        }

        public boolean hasPlayedAdGroup(int i) {
            return !this.f72950g.getAdGroup(i).hasUnplayedAds();
        }

        public int hashCode() {
            Object obj = this.f72944a;
            int iHashCode = (217 + (obj == null ? 0 : obj.hashCode())) * 31;
            Object obj2 = this.f72945b;
            int iHashCode2 = (((iHashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.f72946c) * 31;
            long j = this.f72947d;
            int i = (iHashCode2 + ((int) (j ^ (j >>> 32)))) * 31;
            long j2 = this.f72948e;
            return ((((i + ((int) (j2 ^ (j2 >>> 32)))) * 31) + (this.f72949f ? 1 : 0)) * 31) + this.f72950g.hashCode();
        }

        @ovh
        public boolean isLivePostrollPlaceholder(int i) {
            return i == getAdGroupCount() - 1 && this.f72950g.isLivePostrollPlaceholder(i);
        }

        @ovh
        public boolean isServerSideInsertedAdGroup(int i) {
            return this.f72950g.getAdGroup(i).f60868j;
        }

        @op1
        @ovh
        public C11270b set(@hib Object obj, @hib Object obj2, int i, long j, long j2) {
            return set(obj, obj2, i, j, j2, C9343mf.f60836l, false);
        }

        @ovh
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            int i = this.f72946c;
            if (i != 0) {
                bundle.putInt(f72939h, i);
            }
            long j = this.f72947d;
            if (j != -9223372036854775807L) {
                bundle.putLong(f72940i, j);
            }
            long j2 = this.f72948e;
            if (j2 != 0) {
                bundle.putLong(f72941j, j2);
            }
            boolean z = this.f72949f;
            if (z) {
                bundle.putBoolean(f72942k, z);
            }
            if (!this.f72950g.equals(C9343mf.f60836l)) {
                bundle.putBundle(f72943l, this.f72950g.toBundle());
            }
            return bundle;
        }

        @op1
        @ovh
        public C11270b set(@hib Object obj, @hib Object obj2, int i, long j, long j2, C9343mf c9343mf, boolean z) {
            this.f72944a = obj;
            this.f72945b = obj2;
            this.f72946c = i;
            this.f72947d = j;
            this.f72948e = j2;
            this.f72950g = c9343mf;
            this.f72949f = z;
            return this;
        }
    }

    /* JADX INFO: renamed from: q1h$c */
    @ovh
    public static final class C11271c extends q1h {

        /* JADX INFO: renamed from: e */
        public final kx7<C11272d> f72951e;

        /* JADX INFO: renamed from: f */
        public final kx7<C11270b> f72952f;

        /* JADX INFO: renamed from: g */
        public final int[] f72953g;

        /* JADX INFO: renamed from: h */
        public final int[] f72954h;

        public C11271c(kx7<C11272d> kx7Var, kx7<C11270b> kx7Var2, int[] iArr) {
            v80.checkArgument(kx7Var.size() == iArr.length);
            this.f72951e = kx7Var;
            this.f72952f = kx7Var2;
            this.f72953g = iArr;
            this.f72954h = new int[iArr.length];
            for (int i = 0; i < iArr.length; i++) {
                this.f72954h[iArr[i]] = i;
            }
        }

        @Override // p000.q1h
        public int getFirstWindowIndex(boolean z) {
            if (isEmpty()) {
                return -1;
            }
            if (z) {
                return this.f72953g[0];
            }
            return 0;
        }

        @Override // p000.q1h
        public int getIndexOfPeriod(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // p000.q1h
        public int getLastWindowIndex(boolean z) {
            if (isEmpty()) {
                return -1;
            }
            return z ? this.f72953g[getWindowCount() - 1] : getWindowCount() - 1;
        }

        @Override // p000.q1h
        public int getNextWindowIndex(int i, int i2, boolean z) {
            if (i2 == 1) {
                return i;
            }
            if (i != getLastWindowIndex(z)) {
                return z ? this.f72953g[this.f72954h[i] + 1] : i + 1;
            }
            if (i2 == 2) {
                return getFirstWindowIndex(z);
            }
            return -1;
        }

        @Override // p000.q1h
        public C11270b getPeriod(int i, C11270b c11270b, boolean z) {
            C11270b c11270b2 = this.f72952f.get(i);
            c11270b.set(c11270b2.f72944a, c11270b2.f72945b, c11270b2.f72946c, c11270b2.f72947d, c11270b2.f72948e, c11270b2.f72950g, c11270b2.f72949f);
            return c11270b;
        }

        @Override // p000.q1h
        public int getPeriodCount() {
            return this.f72952f.size();
        }

        @Override // p000.q1h
        public int getPreviousWindowIndex(int i, int i2, boolean z) {
            if (i2 == 1) {
                return i;
            }
            if (i != getFirstWindowIndex(z)) {
                return z ? this.f72953g[this.f72954h[i] - 1] : i - 1;
            }
            if (i2 == 2) {
                return getLastWindowIndex(z);
            }
            return -1;
        }

        @Override // p000.q1h
        public Object getUidOfPeriod(int i) {
            throw new UnsupportedOperationException();
        }

        @Override // p000.q1h
        public C11272d getWindow(int i, C11272d c11272d, long j) {
            C11272d c11272d2 = this.f72951e.get(i);
            c11272d.set(c11272d2.f72971a, c11272d2.f72973c, c11272d2.f72974d, c11272d2.f72975e, c11272d2.f72976f, c11272d2.f72977g, c11272d2.f72978h, c11272d2.f72979i, c11272d2.f72980j, c11272d2.f72982l, c11272d2.f72983m, c11272d2.f72984n, c11272d2.f72985o, c11272d2.f72986p);
            c11272d.f72981k = c11272d2.f72981k;
            return c11272d;
        }

        @Override // p000.q1h
        public int getWindowCount() {
            return this.f72951e.size();
        }
    }

    /* JADX INFO: renamed from: q1h$d */
    public static final class C11272d {

        /* JADX INFO: renamed from: b */
        @hib
        @ovh
        @Deprecated
        public Object f72972b;

        /* JADX INFO: renamed from: d */
        @hib
        public Object f72974d;

        /* JADX INFO: renamed from: e */
        public long f72975e;

        /* JADX INFO: renamed from: f */
        public long f72976f;

        /* JADX INFO: renamed from: g */
        public long f72977g;

        /* JADX INFO: renamed from: h */
        public boolean f72978h;

        /* JADX INFO: renamed from: i */
        public boolean f72979i;

        /* JADX INFO: renamed from: j */
        @hib
        public nfa.C9855g f72980j;

        /* JADX INFO: renamed from: k */
        public boolean f72981k;

        /* JADX INFO: renamed from: l */
        @ovh
        public long f72982l;

        /* JADX INFO: renamed from: m */
        @ovh
        public long f72983m;

        /* JADX INFO: renamed from: n */
        public int f72984n;

        /* JADX INFO: renamed from: o */
        public int f72985o;

        /* JADX INFO: renamed from: p */
        @ovh
        public long f72986p;

        /* JADX INFO: renamed from: q */
        public static final Object f72961q = new Object();

        /* JADX INFO: renamed from: r */
        public static final Object f72962r = new Object();

        /* JADX INFO: renamed from: s */
        public static final nfa f72963s = new nfa.C9851c().setMediaId("androidx.media3.common.Timeline").setUri(Uri.EMPTY).build();

        /* JADX INFO: renamed from: t */
        public static final String f72964t = t0i.intToStringMaxRadix(1);

        /* JADX INFO: renamed from: u */
        public static final String f72965u = t0i.intToStringMaxRadix(2);

        /* JADX INFO: renamed from: v */
        public static final String f72966v = t0i.intToStringMaxRadix(3);

        /* JADX INFO: renamed from: w */
        public static final String f72967w = t0i.intToStringMaxRadix(4);

        /* JADX INFO: renamed from: x */
        public static final String f72968x = t0i.intToStringMaxRadix(5);

        /* JADX INFO: renamed from: y */
        public static final String f72969y = t0i.intToStringMaxRadix(6);

        /* JADX INFO: renamed from: z */
        public static final String f72970z = t0i.intToStringMaxRadix(7);

        /* JADX INFO: renamed from: A */
        public static final String f72955A = t0i.intToStringMaxRadix(8);

        /* JADX INFO: renamed from: B */
        public static final String f72956B = t0i.intToStringMaxRadix(9);

        /* JADX INFO: renamed from: C */
        public static final String f72957C = t0i.intToStringMaxRadix(10);

        /* JADX INFO: renamed from: D */
        public static final String f72958D = t0i.intToStringMaxRadix(11);

        /* JADX INFO: renamed from: E */
        public static final String f72959E = t0i.intToStringMaxRadix(12);

        /* JADX INFO: renamed from: F */
        public static final String f72960F = t0i.intToStringMaxRadix(13);

        /* JADX INFO: renamed from: a */
        public Object f72971a = f72961q;

        /* JADX INFO: renamed from: c */
        public nfa f72973c = f72963s;

        @ovh
        public static C11272d fromBundle(Bundle bundle) {
            Bundle bundle2 = bundle.getBundle(f72964t);
            nfa nfaVarFromBundle = bundle2 != null ? nfa.fromBundle(bundle2) : nfa.f64297j;
            long j = bundle.getLong(f72965u, -9223372036854775807L);
            long j2 = bundle.getLong(f72966v, -9223372036854775807L);
            long j3 = bundle.getLong(f72967w, -9223372036854775807L);
            boolean z = bundle.getBoolean(f72968x, false);
            boolean z2 = bundle.getBoolean(f72969y, false);
            Bundle bundle3 = bundle.getBundle(f72970z);
            nfa.C9855g c9855gFromBundle = bundle3 != null ? nfa.C9855g.fromBundle(bundle3) : null;
            boolean z3 = bundle.getBoolean(f72955A, false);
            long j4 = bundle.getLong(f72956B, 0L);
            long j5 = bundle.getLong(f72957C, -9223372036854775807L);
            int i = bundle.getInt(f72958D, 0);
            int i2 = bundle.getInt(f72959E, 0);
            long j6 = bundle.getLong(f72960F, 0L);
            C11272d c11272d = new C11272d();
            c11272d.set(f72962r, nfaVarFromBundle, null, j, j2, j3, z, z2, c9855gFromBundle, j4, j5, i, i2, j6);
            c11272d.f72981k = z3;
            return c11272d;
        }

        public boolean equals(@hib Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !C11272d.class.equals(obj.getClass())) {
                return false;
            }
            C11272d c11272d = (C11272d) obj;
            return Objects.equals(this.f72971a, c11272d.f72971a) && Objects.equals(this.f72973c, c11272d.f72973c) && Objects.equals(this.f72974d, c11272d.f72974d) && Objects.equals(this.f72980j, c11272d.f72980j) && this.f72975e == c11272d.f72975e && this.f72976f == c11272d.f72976f && this.f72977g == c11272d.f72977g && this.f72978h == c11272d.f72978h && this.f72979i == c11272d.f72979i && this.f72981k == c11272d.f72981k && this.f72982l == c11272d.f72982l && this.f72983m == c11272d.f72983m && this.f72984n == c11272d.f72984n && this.f72985o == c11272d.f72985o && this.f72986p == c11272d.f72986p;
        }

        public long getCurrentUnixTimeMs() {
            return t0i.getNowUnixTimeMs(this.f72977g);
        }

        public long getDefaultPositionMs() {
            return t0i.usToMs(this.f72982l);
        }

        public long getDefaultPositionUs() {
            return this.f72982l;
        }

        public long getDurationMs() {
            return t0i.usToMs(this.f72983m);
        }

        public long getDurationUs() {
            return this.f72983m;
        }

        public long getPositionInFirstPeriodMs() {
            return t0i.usToMs(this.f72986p);
        }

        public long getPositionInFirstPeriodUs() {
            return this.f72986p;
        }

        public int hashCode() {
            int iHashCode = (((217 + this.f72971a.hashCode()) * 31) + this.f72973c.hashCode()) * 31;
            Object obj = this.f72974d;
            int iHashCode2 = (iHashCode + (obj == null ? 0 : obj.hashCode())) * 31;
            nfa.C9855g c9855g = this.f72980j;
            int iHashCode3 = (iHashCode2 + (c9855g != null ? c9855g.hashCode() : 0)) * 31;
            long j = this.f72975e;
            int i = (iHashCode3 + ((int) (j ^ (j >>> 32)))) * 31;
            long j2 = this.f72976f;
            int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
            long j3 = this.f72977g;
            int i3 = (((((((i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (this.f72978h ? 1 : 0)) * 31) + (this.f72979i ? 1 : 0)) * 31) + (this.f72981k ? 1 : 0)) * 31;
            long j4 = this.f72982l;
            int i4 = (i3 + ((int) (j4 ^ (j4 >>> 32)))) * 31;
            long j5 = this.f72983m;
            int i5 = (((((i4 + ((int) (j5 ^ (j5 >>> 32)))) * 31) + this.f72984n) * 31) + this.f72985o) * 31;
            long j6 = this.f72986p;
            return i5 + ((int) (j6 ^ (j6 >>> 32)));
        }

        public boolean isLive() {
            return this.f72980j != null;
        }

        @op1
        @ovh
        public C11272d set(Object obj, @hib nfa nfaVar, @hib Object obj2, long j, long j2, long j3, boolean z, boolean z2, @hib nfa.C9855g c9855g, long j4, long j5, int i, int i2, long j6) {
            nfa.C9856h c9856h;
            this.f72971a = obj;
            this.f72973c = nfaVar != null ? nfaVar : f72963s;
            this.f72972b = (nfaVar == null || (c9856h = nfaVar.f64305b) == null) ? null : c9856h.f64414i;
            this.f72974d = obj2;
            this.f72975e = j;
            this.f72976f = j2;
            this.f72977g = j3;
            this.f72978h = z;
            this.f72979i = z2;
            this.f72980j = c9855g;
            this.f72982l = j4;
            this.f72983m = j5;
            this.f72984n = i;
            this.f72985o = i2;
            this.f72986p = j6;
            this.f72981k = false;
            return this;
        }

        @ovh
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            if (!nfa.f64297j.equals(this.f72973c)) {
                bundle.putBundle(f72964t, this.f72973c.toBundle());
            }
            long j = this.f72975e;
            if (j != -9223372036854775807L) {
                bundle.putLong(f72965u, j);
            }
            long j2 = this.f72976f;
            if (j2 != -9223372036854775807L) {
                bundle.putLong(f72966v, j2);
            }
            long j3 = this.f72977g;
            if (j3 != -9223372036854775807L) {
                bundle.putLong(f72967w, j3);
            }
            boolean z = this.f72978h;
            if (z) {
                bundle.putBoolean(f72968x, z);
            }
            boolean z2 = this.f72979i;
            if (z2) {
                bundle.putBoolean(f72969y, z2);
            }
            nfa.C9855g c9855g = this.f72980j;
            if (c9855g != null) {
                bundle.putBundle(f72970z, c9855g.toBundle());
            }
            boolean z3 = this.f72981k;
            if (z3) {
                bundle.putBoolean(f72955A, z3);
            }
            long j4 = this.f72982l;
            if (j4 != 0) {
                bundle.putLong(f72956B, j4);
            }
            long j5 = this.f72983m;
            if (j5 != -9223372036854775807L) {
                bundle.putLong(f72957C, j5);
            }
            int i = this.f72984n;
            if (i != 0) {
                bundle.putInt(f72958D, i);
            }
            int i2 = this.f72985o;
            if (i2 != 0) {
                bundle.putInt(f72959E, i2);
            }
            long j6 = this.f72986p;
            if (j6 != 0) {
                bundle.putLong(f72960F, j6);
            }
            return bundle;
        }
    }

    @ovh
    public q1h() {
    }

    @ovh
    public static q1h fromBundle(Bundle bundle) {
        kx7 kx7VarFromBundleListRetriever = fromBundleListRetriever(new lz6() { // from class: o1h
            @Override // p000.lz6
            public final Object apply(Object obj) {
                return q1h.C11272d.fromBundle((Bundle) obj);
            }
        }, bundle.getBinder(f72936b));
        kx7 kx7VarFromBundleListRetriever2 = fromBundleListRetriever(new lz6() { // from class: p1h
            @Override // p000.lz6
            public final Object apply(Object obj) {
                return q1h.C11270b.fromBundle((Bundle) obj);
            }
        }, bundle.getBinder(f72937c));
        int[] intArray = bundle.getIntArray(f72938d);
        if (intArray == null) {
            intArray = generateUnshuffledIndices(kx7VarFromBundleListRetriever.size());
        }
        return new C11271c(kx7VarFromBundleListRetriever, kx7VarFromBundleListRetriever2, intArray);
    }

    private static <T> kx7<T> fromBundleListRetriever(lz6<Bundle, T> lz6Var, @hib IBinder iBinder) {
        return iBinder == null ? kx7.m15110of() : og1.fromBundleList(lz6Var, xg1.getList(iBinder));
    }

    private static int[] generateUnshuffledIndices(int i) {
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            iArr[i2] = i2;
        }
        return iArr;
    }

    @ovh
    public final q1h copyWithSingleWindow(int i) {
        if (getWindowCount() == 1) {
            return this;
        }
        C11272d window = getWindow(i, new C11272d(), 0L);
        kx7.C8541a c8541aBuilder = kx7.builder();
        int i2 = window.f72984n;
        while (true) {
            int i3 = window.f72985o;
            if (i2 > i3) {
                window.f72985o = i3 - window.f72984n;
                window.f72984n = 0;
                return new C11271c(kx7.m15111of(window), c8541aBuilder.build(), new int[]{0});
            }
            C11270b period = getPeriod(i2, new C11270b(), true);
            period.f72946c = 0;
            c8541aBuilder.add(period);
            i2++;
        }
    }

    public boolean equals(@hib Object obj) {
        int lastWindowIndex;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q1h)) {
            return false;
        }
        q1h q1hVar = (q1h) obj;
        if (q1hVar.getWindowCount() != getWindowCount() || q1hVar.getPeriodCount() != getPeriodCount()) {
            return false;
        }
        C11272d c11272d = new C11272d();
        C11270b c11270b = new C11270b();
        C11272d c11272d2 = new C11272d();
        C11270b c11270b2 = new C11270b();
        for (int i = 0; i < getWindowCount(); i++) {
            if (!getWindow(i, c11272d).equals(q1hVar.getWindow(i, c11272d2))) {
                return false;
            }
        }
        for (int i2 = 0; i2 < getPeriodCount(); i2++) {
            if (!getPeriod(i2, c11270b, true).equals(q1hVar.getPeriod(i2, c11270b2, true))) {
                return false;
            }
        }
        int firstWindowIndex = getFirstWindowIndex(true);
        if (firstWindowIndex != q1hVar.getFirstWindowIndex(true) || (lastWindowIndex = getLastWindowIndex(true)) != q1hVar.getLastWindowIndex(true)) {
            return false;
        }
        while (firstWindowIndex != lastWindowIndex) {
            int nextWindowIndex = getNextWindowIndex(firstWindowIndex, 0, true);
            if (nextWindowIndex != q1hVar.getNextWindowIndex(firstWindowIndex, 0, true)) {
                return false;
            }
            firstWindowIndex = nextWindowIndex;
        }
        return true;
    }

    public int getFirstWindowIndex(boolean z) {
        return isEmpty() ? -1 : 0;
    }

    public abstract int getIndexOfPeriod(Object obj);

    public int getLastWindowIndex(boolean z) {
        if (isEmpty()) {
            return -1;
        }
        return getWindowCount() - 1;
    }

    public final int getNextPeriodIndex(int i, C11270b c11270b, C11272d c11272d, int i2, boolean z) {
        int i3 = getPeriod(i, c11270b).f72946c;
        if (getWindow(i3, c11272d).f72985o != i) {
            return i + 1;
        }
        int nextWindowIndex = getNextWindowIndex(i3, i2, z);
        if (nextWindowIndex == -1) {
            return -1;
        }
        return getWindow(nextWindowIndex, c11272d).f72984n;
    }

    public int getNextWindowIndex(int i, int i2, boolean z) {
        if (i2 == 0) {
            if (i == getLastWindowIndex(z)) {
                return -1;
            }
            return i + 1;
        }
        if (i2 == 1) {
            return i;
        }
        if (i2 == 2) {
            return i == getLastWindowIndex(z) ? getFirstWindowIndex(z) : i + 1;
        }
        throw new IllegalStateException();
    }

    public final C11270b getPeriod(int i, C11270b c11270b) {
        return getPeriod(i, c11270b, false);
    }

    public abstract C11270b getPeriod(int i, C11270b c11270b, boolean z);

    public C11270b getPeriodByUid(Object obj, C11270b c11270b) {
        return getPeriod(getIndexOfPeriod(obj), c11270b, true);
    }

    public abstract int getPeriodCount();

    @ovh
    @Deprecated
    @p28(replacement = "this.getPeriodPositionUs(window, period, windowIndex, windowPositionUs)")
    public final Pair<Object, Long> getPeriodPosition(C11272d c11272d, C11270b c11270b, int i, long j) {
        return getPeriodPositionUs(c11272d, c11270b, i, j);
    }

    public final Pair<Object, Long> getPeriodPositionUs(C11272d c11272d, C11270b c11270b, int i, long j) {
        return (Pair) v80.checkNotNull(getPeriodPositionUs(c11272d, c11270b, i, j, 0L));
    }

    public int getPreviousWindowIndex(int i, int i2, boolean z) {
        if (i2 == 0) {
            if (i == getFirstWindowIndex(z)) {
                return -1;
            }
            return i - 1;
        }
        if (i2 == 1) {
            return i;
        }
        if (i2 == 2) {
            return i == getFirstWindowIndex(z) ? getLastWindowIndex(z) : i - 1;
        }
        throw new IllegalStateException();
    }

    public abstract Object getUidOfPeriod(int i);

    public final C11272d getWindow(int i, C11272d c11272d) {
        return getWindow(i, c11272d, 0L);
    }

    public abstract C11272d getWindow(int i, C11272d c11272d, long j);

    public abstract int getWindowCount();

    public int hashCode() {
        C11272d c11272d = new C11272d();
        C11270b c11270b = new C11270b();
        int windowCount = 217 + getWindowCount();
        for (int i = 0; i < getWindowCount(); i++) {
            windowCount = (windowCount * 31) + getWindow(i, c11272d).hashCode();
        }
        int periodCount = (windowCount * 31) + getPeriodCount();
        for (int i2 = 0; i2 < getPeriodCount(); i2++) {
            periodCount = (periodCount * 31) + getPeriod(i2, c11270b, true).hashCode();
        }
        int firstWindowIndex = getFirstWindowIndex(true);
        while (firstWindowIndex != -1) {
            periodCount = (periodCount * 31) + firstWindowIndex;
            firstWindowIndex = getNextWindowIndex(firstWindowIndex, 0, true);
        }
        return periodCount;
    }

    public final boolean isEmpty() {
        return getWindowCount() == 0;
    }

    public final boolean isLastPeriod(int i, C11270b c11270b, C11272d c11272d, int i2, boolean z) {
        return getNextPeriodIndex(i, c11270b, c11272d, i2, z) == -1;
    }

    @ovh
    public final Bundle toBundle() {
        ArrayList arrayList = new ArrayList();
        int windowCount = getWindowCount();
        C11272d c11272d = new C11272d();
        for (int i = 0; i < windowCount; i++) {
            arrayList.add(getWindow(i, c11272d, 0L).toBundle());
        }
        ArrayList arrayList2 = new ArrayList();
        int periodCount = getPeriodCount();
        C11270b c11270b = new C11270b();
        for (int i2 = 0; i2 < periodCount; i2++) {
            arrayList2.add(getPeriod(i2, c11270b, false).toBundle());
        }
        int[] iArr = new int[windowCount];
        if (windowCount > 0) {
            iArr[0] = getFirstWindowIndex(true);
        }
        for (int i3 = 1; i3 < windowCount; i3++) {
            iArr[i3] = getNextWindowIndex(iArr[i3 - 1], 0, true);
        }
        Bundle bundle = new Bundle();
        bundle.putBinder(f72936b, new xg1(arrayList));
        bundle.putBinder(f72937c, new xg1(arrayList2));
        bundle.putIntArray(f72938d, iArr);
        return bundle;
    }

    @hib
    @Deprecated
    @p28(replacement = "this.getPeriodPositionUs(window, period, windowIndex, windowPositionUs, defaultPositionProjectionUs)")
    @ovh
    public final Pair<Object, Long> getPeriodPosition(C11272d c11272d, C11270b c11270b, int i, long j, long j2) {
        return getPeriodPositionUs(c11272d, c11270b, i, j, j2);
    }

    @hib
    public final Pair<Object, Long> getPeriodPositionUs(C11272d c11272d, C11270b c11270b, int i, long j, long j2) {
        v80.checkIndex(i, 0, getWindowCount());
        getWindow(i, c11272d, j2);
        if (j == -9223372036854775807L) {
            j = c11272d.getDefaultPositionUs();
            if (j == -9223372036854775807L) {
                return null;
            }
        }
        int i2 = c11272d.f72984n;
        getPeriod(i2, c11270b);
        while (i2 < c11272d.f72985o && c11270b.f72948e != j) {
            int i3 = i2 + 1;
            if (getPeriod(i3, c11270b).f72948e > j) {
                break;
            }
            i2 = i3;
        }
        getPeriod(i2, c11270b, true);
        long jMin = j - c11270b.f72948e;
        long j3 = c11270b.f72947d;
        if (j3 != -9223372036854775807L) {
            jMin = Math.min(jMin, j3 - 1);
        }
        return Pair.create(v80.checkNotNull(c11270b.f72945b), Long.valueOf(Math.max(0L, jMin)));
    }
}
