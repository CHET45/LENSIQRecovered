package p000;

import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Pair;
import java.util.ArrayList;
import p000.C10354of;
import p000.aga;
import p000.gh1;
import p000.kx7;
import p000.t1h;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public abstract class t1h implements gh1 {

    /* JADX INFO: renamed from: a */
    public static final t1h f83385a = new C12848a();

    /* JADX INFO: renamed from: b */
    public static final String f83386b = x0i.intToStringMaxRadix(0);

    /* JADX INFO: renamed from: c */
    public static final String f83387c = x0i.intToStringMaxRadix(1);

    /* JADX INFO: renamed from: d */
    public static final String f83388d = x0i.intToStringMaxRadix(2);

    /* JADX INFO: renamed from: e */
    public static final gh1.InterfaceC6311a<t1h> f83389e = new gh1.InterfaceC6311a() { // from class: n1h
        @Override // p000.gh1.InterfaceC6311a
        public final gh1 fromBundle(Bundle bundle) {
            return t1h.fromBundle(bundle);
        }
    };

    /* JADX INFO: renamed from: t1h$a */
    public class C12848a extends t1h {
        @Override // p000.t1h
        public int getIndexOfPeriod(Object obj) {
            return -1;
        }

        @Override // p000.t1h
        public C12849b getPeriod(int i, C12849b c12849b, boolean z) {
            throw new IndexOutOfBoundsException();
        }

        @Override // p000.t1h
        public int getPeriodCount() {
            return 0;
        }

        @Override // p000.t1h
        public Object getUidOfPeriod(int i) {
            throw new IndexOutOfBoundsException();
        }

        @Override // p000.t1h
        public C12851d getWindow(int i, C12851d c12851d, long j) {
            throw new IndexOutOfBoundsException();
        }

        @Override // p000.t1h
        public int getWindowCount() {
            return 0;
        }
    }

    /* JADX INFO: renamed from: t1h$b */
    public static final class C12849b implements gh1 {

        /* JADX INFO: renamed from: C */
        public static final String f83390C = x0i.intToStringMaxRadix(0);

        /* JADX INFO: renamed from: F */
        public static final String f83391F = x0i.intToStringMaxRadix(1);

        /* JADX INFO: renamed from: H */
        public static final String f83392H = x0i.intToStringMaxRadix(2);

        /* JADX INFO: renamed from: L */
        public static final String f83393L = x0i.intToStringMaxRadix(3);

        /* JADX INFO: renamed from: M */
        public static final String f83394M = x0i.intToStringMaxRadix(4);

        /* JADX INFO: renamed from: N */
        public static final gh1.InterfaceC6311a<C12849b> f83395N = new gh1.InterfaceC6311a() { // from class: r1h
            @Override // p000.gh1.InterfaceC6311a
            public final gh1 fromBundle(Bundle bundle) {
                return t1h.C12849b.fromBundle(bundle);
            }
        };

        /* JADX INFO: renamed from: a */
        @hib
        public Object f83396a;

        /* JADX INFO: renamed from: b */
        @hib
        public Object f83397b;

        /* JADX INFO: renamed from: c */
        public int f83398c;

        /* JADX INFO: renamed from: d */
        public long f83399d;

        /* JADX INFO: renamed from: e */
        public long f83400e;

        /* JADX INFO: renamed from: f */
        public boolean f83401f;

        /* JADX INFO: renamed from: m */
        public C10354of f83402m = C10354of.f67450M;

        /* JADX INFO: Access modifiers changed from: private */
        public static C12849b fromBundle(Bundle bundle) {
            int i = bundle.getInt(f83390C, 0);
            long j = bundle.getLong(f83391F, -9223372036854775807L);
            long j2 = bundle.getLong(f83392H, 0L);
            boolean z = bundle.getBoolean(f83393L, false);
            Bundle bundle2 = bundle.getBundle(f83394M);
            C10354of c10354of = bundle2 != null ? (C10354of) C10354of.f67451M1.fromBundle(bundle2) : C10354of.f67450M;
            C12849b c12849b = new C12849b();
            c12849b.set(null, null, i, j, j2, c10354of, z);
            return c12849b;
        }

        public boolean equals(@hib Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !C12849b.class.equals(obj.getClass())) {
                return false;
            }
            C12849b c12849b = (C12849b) obj;
            return x0i.areEqual(this.f83396a, c12849b.f83396a) && x0i.areEqual(this.f83397b, c12849b.f83397b) && this.f83398c == c12849b.f83398c && this.f83399d == c12849b.f83399d && this.f83400e == c12849b.f83400e && this.f83401f == c12849b.f83401f && x0i.areEqual(this.f83402m, c12849b.f83402m);
        }

        public int getAdCountInAdGroup(int i) {
            return this.f83402m.getAdGroup(i).f67475b;
        }

        public long getAdDurationUs(int i, int i2) {
            C10354of.b adGroup = this.f83402m.getAdGroup(i);
            if (adGroup.f67475b != -1) {
                return adGroup.f67479f[i2];
            }
            return -9223372036854775807L;
        }

        public int getAdGroupCount() {
            return this.f83402m.f67459b;
        }

        public int getAdGroupIndexAfterPositionUs(long j) {
            return this.f83402m.getAdGroupIndexAfterPositionUs(j, this.f83399d);
        }

        public int getAdGroupIndexForPositionUs(long j) {
            return this.f83402m.getAdGroupIndexForPositionUs(j, this.f83399d);
        }

        public long getAdGroupTimeUs(int i) {
            return this.f83402m.getAdGroup(i).f67474a;
        }

        public long getAdResumePositionUs() {
            return this.f83402m.f67460c;
        }

        public int getAdState(int i, int i2) {
            C10354of.b adGroup = this.f83402m.getAdGroup(i);
            if (adGroup.f67475b != -1) {
                return adGroup.f67478e[i2];
            }
            return 0;
        }

        @hib
        public Object getAdsId() {
            return this.f83402m.f67458a;
        }

        public long getContentResumeOffsetUs(int i) {
            return this.f83402m.getAdGroup(i).f67480m;
        }

        public long getDurationMs() {
            return x0i.usToMs(this.f83399d);
        }

        public long getDurationUs() {
            return this.f83399d;
        }

        public int getFirstAdIndexToPlay(int i) {
            return this.f83402m.getAdGroup(i).getFirstAdIndexToPlay();
        }

        public int getNextAdIndexToPlay(int i, int i2) {
            return this.f83402m.getAdGroup(i).getNextAdIndexToPlay(i2);
        }

        public long getPositionInWindowMs() {
            return x0i.usToMs(this.f83400e);
        }

        public long getPositionInWindowUs() {
            return this.f83400e;
        }

        public int getRemovedAdGroupCount() {
            return this.f83402m.f67462e;
        }

        public boolean hasPlayedAdGroup(int i) {
            return !this.f83402m.getAdGroup(i).hasUnplayedAds();
        }

        public int hashCode() {
            Object obj = this.f83396a;
            int iHashCode = (217 + (obj == null ? 0 : obj.hashCode())) * 31;
            Object obj2 = this.f83397b;
            int iHashCode2 = (((iHashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.f83398c) * 31;
            long j = this.f83399d;
            int i = (iHashCode2 + ((int) (j ^ (j >>> 32)))) * 31;
            long j2 = this.f83400e;
            return ((((i + ((int) (j2 ^ (j2 >>> 32)))) * 31) + (this.f83401f ? 1 : 0)) * 31) + this.f83402m.hashCode();
        }

        public boolean isLivePostrollPlaceholder(int i) {
            return i == getAdGroupCount() - 1 && this.f83402m.isLivePostrollPlaceholder(i);
        }

        public boolean isServerSideInsertedAdGroup(int i) {
            return this.f83402m.getAdGroup(i).f67473C;
        }

        @op1
        public C12849b set(@hib Object obj, @hib Object obj2, int i, long j, long j2) {
            return set(obj, obj2, i, j, j2, C10354of.f67450M, false);
        }

        @Override // p000.gh1
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            int i = this.f83398c;
            if (i != 0) {
                bundle.putInt(f83390C, i);
            }
            long j = this.f83399d;
            if (j != -9223372036854775807L) {
                bundle.putLong(f83391F, j);
            }
            long j2 = this.f83400e;
            if (j2 != 0) {
                bundle.putLong(f83392H, j2);
            }
            boolean z = this.f83401f;
            if (z) {
                bundle.putBoolean(f83393L, z);
            }
            if (!this.f83402m.equals(C10354of.f67450M)) {
                bundle.putBundle(f83394M, this.f83402m.toBundle());
            }
            return bundle;
        }

        @op1
        public C12849b set(@hib Object obj, @hib Object obj2, int i, long j, long j2, C10354of c10354of, boolean z) {
            this.f83396a = obj;
            this.f83397b = obj2;
            this.f83398c = i;
            this.f83399d = j;
            this.f83400e = j2;
            this.f83402m = c10354of;
            this.f83401f = z;
            return this;
        }
    }

    /* JADX INFO: renamed from: t1h$c */
    public static final class C12850c extends t1h {

        /* JADX INFO: renamed from: C */
        public final int[] f83403C;

        /* JADX INFO: renamed from: F */
        public final int[] f83404F;

        /* JADX INFO: renamed from: f */
        public final kx7<C12851d> f83405f;

        /* JADX INFO: renamed from: m */
        public final kx7<C12849b> f83406m;

        public C12850c(kx7<C12851d> kx7Var, kx7<C12849b> kx7Var2, int[] iArr) {
            u80.checkArgument(kx7Var.size() == iArr.length);
            this.f83405f = kx7Var;
            this.f83406m = kx7Var2;
            this.f83403C = iArr;
            this.f83404F = new int[iArr.length];
            for (int i = 0; i < iArr.length; i++) {
                this.f83404F[iArr[i]] = i;
            }
        }

        @Override // p000.t1h
        public int getFirstWindowIndex(boolean z) {
            if (isEmpty()) {
                return -1;
            }
            if (z) {
                return this.f83403C[0];
            }
            return 0;
        }

        @Override // p000.t1h
        public int getIndexOfPeriod(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // p000.t1h
        public int getLastWindowIndex(boolean z) {
            if (isEmpty()) {
                return -1;
            }
            return z ? this.f83403C[getWindowCount() - 1] : getWindowCount() - 1;
        }

        @Override // p000.t1h
        public int getNextWindowIndex(int i, int i2, boolean z) {
            if (i2 == 1) {
                return i;
            }
            if (i != getLastWindowIndex(z)) {
                return z ? this.f83403C[this.f83404F[i] + 1] : i + 1;
            }
            if (i2 == 2) {
                return getFirstWindowIndex(z);
            }
            return -1;
        }

        @Override // p000.t1h
        public C12849b getPeriod(int i, C12849b c12849b, boolean z) {
            C12849b c12849b2 = this.f83406m.get(i);
            c12849b.set(c12849b2.f83396a, c12849b2.f83397b, c12849b2.f83398c, c12849b2.f83399d, c12849b2.f83400e, c12849b2.f83402m, c12849b2.f83401f);
            return c12849b;
        }

        @Override // p000.t1h
        public int getPeriodCount() {
            return this.f83406m.size();
        }

        @Override // p000.t1h
        public int getPreviousWindowIndex(int i, int i2, boolean z) {
            if (i2 == 1) {
                return i;
            }
            if (i != getFirstWindowIndex(z)) {
                return z ? this.f83403C[this.f83404F[i] - 1] : i - 1;
            }
            if (i2 == 2) {
                return getLastWindowIndex(z);
            }
            return -1;
        }

        @Override // p000.t1h
        public Object getUidOfPeriod(int i) {
            throw new UnsupportedOperationException();
        }

        @Override // p000.t1h
        public C12851d getWindow(int i, C12851d c12851d, long j) {
            C12851d c12851d2 = this.f83405f.get(i);
            c12851d.set(c12851d2.f83434a, c12851d2.f83436c, c12851d2.f83437d, c12851d2.f83438e, c12851d2.f83439f, c12851d2.f83440m, c12851d2.f83424C, c12851d2.f83425F, c12851d2.f83427L, c12851d2.f83429N, c12851d2.f83430Q, c12851d2.f83431X, c12851d2.f83432Y, c12851d2.f83433Z);
            c12851d.f83428M = c12851d2.f83428M;
            return c12851d;
        }

        @Override // p000.t1h
        public int getWindowCount() {
            return this.f83405f.size();
        }
    }

    /* JADX INFO: renamed from: t1h$d */
    public static final class C12851d implements gh1 {

        /* JADX INFO: renamed from: M1 */
        public static final Object f83407M1 = new Object();

        /* JADX INFO: renamed from: V1 */
        public static final Object f83408V1 = new Object();

        /* JADX INFO: renamed from: Z1 */
        public static final aga f83409Z1 = new aga.C0235c().setMediaId("com.google.android.exoplayer2.Timeline").setUri(Uri.EMPTY).build();

        /* JADX INFO: renamed from: a2 */
        public static final String f83410a2 = x0i.intToStringMaxRadix(1);

        /* JADX INFO: renamed from: b2 */
        public static final String f83411b2 = x0i.intToStringMaxRadix(2);

        /* JADX INFO: renamed from: c2 */
        public static final String f83412c2 = x0i.intToStringMaxRadix(3);

        /* JADX INFO: renamed from: d2 */
        public static final String f83413d2 = x0i.intToStringMaxRadix(4);

        /* JADX INFO: renamed from: e2 */
        public static final String f83414e2 = x0i.intToStringMaxRadix(5);

        /* JADX INFO: renamed from: f2 */
        public static final String f83415f2 = x0i.intToStringMaxRadix(6);

        /* JADX INFO: renamed from: g2 */
        public static final String f83416g2 = x0i.intToStringMaxRadix(7);

        /* JADX INFO: renamed from: h2 */
        public static final String f83417h2 = x0i.intToStringMaxRadix(8);

        /* JADX INFO: renamed from: i2 */
        public static final String f83418i2 = x0i.intToStringMaxRadix(9);

        /* JADX INFO: renamed from: j2 */
        public static final String f83419j2 = x0i.intToStringMaxRadix(10);

        /* JADX INFO: renamed from: k2 */
        public static final String f83420k2 = x0i.intToStringMaxRadix(11);

        /* JADX INFO: renamed from: l2 */
        public static final String f83421l2 = x0i.intToStringMaxRadix(12);

        /* JADX INFO: renamed from: m2 */
        public static final String f83422m2 = x0i.intToStringMaxRadix(13);

        /* JADX INFO: renamed from: n2 */
        public static final gh1.InterfaceC6311a<C12851d> f83423n2 = new gh1.InterfaceC6311a() { // from class: s1h
            @Override // p000.gh1.InterfaceC6311a
            public final gh1 fromBundle(Bundle bundle) {
                return t1h.C12851d.fromBundle(bundle);
            }
        };

        /* JADX INFO: renamed from: C */
        public boolean f83424C;

        /* JADX INFO: renamed from: F */
        public boolean f83425F;

        /* JADX INFO: renamed from: H */
        @Deprecated
        public boolean f83426H;

        /* JADX INFO: renamed from: L */
        @hib
        public aga.C0239g f83427L;

        /* JADX INFO: renamed from: M */
        public boolean f83428M;

        /* JADX INFO: renamed from: N */
        public long f83429N;

        /* JADX INFO: renamed from: Q */
        public long f83430Q;

        /* JADX INFO: renamed from: X */
        public int f83431X;

        /* JADX INFO: renamed from: Y */
        public int f83432Y;

        /* JADX INFO: renamed from: Z */
        public long f83433Z;

        /* JADX INFO: renamed from: b */
        @hib
        @Deprecated
        public Object f83435b;

        /* JADX INFO: renamed from: d */
        @hib
        public Object f83437d;

        /* JADX INFO: renamed from: e */
        public long f83438e;

        /* JADX INFO: renamed from: f */
        public long f83439f;

        /* JADX INFO: renamed from: m */
        public long f83440m;

        /* JADX INFO: renamed from: a */
        public Object f83434a = f83407M1;

        /* JADX INFO: renamed from: c */
        public aga f83436c = f83409Z1;

        /* JADX INFO: Access modifiers changed from: private */
        public static C12851d fromBundle(Bundle bundle) {
            Bundle bundle2 = bundle.getBundle(f83410a2);
            aga agaVar = bundle2 != null ? (aga) aga.f1443Z.fromBundle(bundle2) : aga.f1436H;
            long j = bundle.getLong(f83411b2, -9223372036854775807L);
            long j2 = bundle.getLong(f83412c2, -9223372036854775807L);
            long j3 = bundle.getLong(f83413d2, -9223372036854775807L);
            boolean z = bundle.getBoolean(f83414e2, false);
            boolean z2 = bundle.getBoolean(f83415f2, false);
            Bundle bundle3 = bundle.getBundle(f83416g2);
            aga.C0239g c0239g = bundle3 != null ? (aga.C0239g) aga.C0239g.f1521M.fromBundle(bundle3) : null;
            boolean z3 = bundle.getBoolean(f83417h2, false);
            long j4 = bundle.getLong(f83418i2, 0L);
            long j5 = bundle.getLong(f83419j2, -9223372036854775807L);
            int i = bundle.getInt(f83420k2, 0);
            int i2 = bundle.getInt(f83421l2, 0);
            long j6 = bundle.getLong(f83422m2, 0L);
            C12851d c12851d = new C12851d();
            c12851d.set(f83408V1, agaVar, null, j, j2, j3, z, z2, c0239g, j4, j5, i, i2, j6);
            c12851d.f83428M = z3;
            return c12851d;
        }

        public boolean equals(@hib Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !C12851d.class.equals(obj.getClass())) {
                return false;
            }
            C12851d c12851d = (C12851d) obj;
            return x0i.areEqual(this.f83434a, c12851d.f83434a) && x0i.areEqual(this.f83436c, c12851d.f83436c) && x0i.areEqual(this.f83437d, c12851d.f83437d) && x0i.areEqual(this.f83427L, c12851d.f83427L) && this.f83438e == c12851d.f83438e && this.f83439f == c12851d.f83439f && this.f83440m == c12851d.f83440m && this.f83424C == c12851d.f83424C && this.f83425F == c12851d.f83425F && this.f83428M == c12851d.f83428M && this.f83429N == c12851d.f83429N && this.f83430Q == c12851d.f83430Q && this.f83431X == c12851d.f83431X && this.f83432Y == c12851d.f83432Y && this.f83433Z == c12851d.f83433Z;
        }

        public long getCurrentUnixTimeMs() {
            return x0i.getNowUnixTimeMs(this.f83440m);
        }

        public long getDefaultPositionMs() {
            return x0i.usToMs(this.f83429N);
        }

        public long getDefaultPositionUs() {
            return this.f83429N;
        }

        public long getDurationMs() {
            return x0i.usToMs(this.f83430Q);
        }

        public long getDurationUs() {
            return this.f83430Q;
        }

        public long getPositionInFirstPeriodMs() {
            return x0i.usToMs(this.f83433Z);
        }

        public long getPositionInFirstPeriodUs() {
            return this.f83433Z;
        }

        public int hashCode() {
            int iHashCode = (((217 + this.f83434a.hashCode()) * 31) + this.f83436c.hashCode()) * 31;
            Object obj = this.f83437d;
            int iHashCode2 = (iHashCode + (obj == null ? 0 : obj.hashCode())) * 31;
            aga.C0239g c0239g = this.f83427L;
            int iHashCode3 = (iHashCode2 + (c0239g != null ? c0239g.hashCode() : 0)) * 31;
            long j = this.f83438e;
            int i = (iHashCode3 + ((int) (j ^ (j >>> 32)))) * 31;
            long j2 = this.f83439f;
            int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
            long j3 = this.f83440m;
            int i3 = (((((((i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (this.f83424C ? 1 : 0)) * 31) + (this.f83425F ? 1 : 0)) * 31) + (this.f83428M ? 1 : 0)) * 31;
            long j4 = this.f83429N;
            int i4 = (i3 + ((int) (j4 ^ (j4 >>> 32)))) * 31;
            long j5 = this.f83430Q;
            int i5 = (((((i4 + ((int) (j5 ^ (j5 >>> 32)))) * 31) + this.f83431X) * 31) + this.f83432Y) * 31;
            long j6 = this.f83433Z;
            return i5 + ((int) (j6 ^ (j6 >>> 32)));
        }

        public boolean isLive() {
            u80.checkState(this.f83426H == (this.f83427L != null));
            return this.f83427L != null;
        }

        @op1
        public C12851d set(Object obj, @hib aga agaVar, @hib Object obj2, long j, long j2, long j3, boolean z, boolean z2, @hib aga.C0239g c0239g, long j4, long j5, int i, int i2, long j6) {
            aga.C0240h c0240h;
            this.f83434a = obj;
            this.f83436c = agaVar != null ? agaVar : f83409Z1;
            this.f83435b = (agaVar == null || (c0240h = agaVar.f1446b) == null) ? null : c0240h.f1543F;
            this.f83437d = obj2;
            this.f83438e = j;
            this.f83439f = j2;
            this.f83440m = j3;
            this.f83424C = z;
            this.f83425F = z2;
            this.f83426H = c0239g != null;
            this.f83427L = c0239g;
            this.f83429N = j4;
            this.f83430Q = j5;
            this.f83431X = i;
            this.f83432Y = i2;
            this.f83433Z = j6;
            this.f83428M = false;
            return this;
        }

        @Override // p000.gh1
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            if (!aga.f1436H.equals(this.f83436c)) {
                bundle.putBundle(f83410a2, this.f83436c.toBundle());
            }
            long j = this.f83438e;
            if (j != -9223372036854775807L) {
                bundle.putLong(f83411b2, j);
            }
            long j2 = this.f83439f;
            if (j2 != -9223372036854775807L) {
                bundle.putLong(f83412c2, j2);
            }
            long j3 = this.f83440m;
            if (j3 != -9223372036854775807L) {
                bundle.putLong(f83413d2, j3);
            }
            boolean z = this.f83424C;
            if (z) {
                bundle.putBoolean(f83414e2, z);
            }
            boolean z2 = this.f83425F;
            if (z2) {
                bundle.putBoolean(f83415f2, z2);
            }
            aga.C0239g c0239g = this.f83427L;
            if (c0239g != null) {
                bundle.putBundle(f83416g2, c0239g.toBundle());
            }
            boolean z3 = this.f83428M;
            if (z3) {
                bundle.putBoolean(f83417h2, z3);
            }
            long j4 = this.f83429N;
            if (j4 != 0) {
                bundle.putLong(f83418i2, j4);
            }
            long j5 = this.f83430Q;
            if (j5 != -9223372036854775807L) {
                bundle.putLong(f83419j2, j5);
            }
            int i = this.f83431X;
            if (i != 0) {
                bundle.putInt(f83420k2, i);
            }
            int i2 = this.f83432Y;
            if (i2 != 0) {
                bundle.putInt(f83421l2, i2);
            }
            long j6 = this.f83433Z;
            if (j6 != 0) {
                bundle.putLong(f83422m2, j6);
            }
            return bundle;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static t1h fromBundle(Bundle bundle) {
        kx7 kx7VarFromBundleListRetriever = fromBundleListRetriever(C12851d.f83423n2, fh1.getBinder(bundle, f83386b));
        kx7 kx7VarFromBundleListRetriever2 = fromBundleListRetriever(C12849b.f83395N, fh1.getBinder(bundle, f83387c));
        int[] intArray = bundle.getIntArray(f83388d);
        if (intArray == null) {
            intArray = generateUnshuffledIndices(kx7VarFromBundleListRetriever.size());
        }
        return new C12850c(kx7VarFromBundleListRetriever, kx7VarFromBundleListRetriever2, intArray);
    }

    private static <T extends gh1> kx7<T> fromBundleListRetriever(gh1.InterfaceC6311a<T> interfaceC6311a, @hib IBinder iBinder) {
        if (iBinder == null) {
            return kx7.m15110of();
        }
        kx7.C8541a c8541a = new kx7.C8541a();
        kx7<Bundle> list = wg1.getList(iBinder);
        for (int i = 0; i < list.size(); i++) {
            c8541a.add(interfaceC6311a.fromBundle(list.get(i)));
        }
        return c8541a.build();
    }

    private static int[] generateUnshuffledIndices(int i) {
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            iArr[i2] = i2;
        }
        return iArr;
    }

    public boolean equals(@hib Object obj) {
        int lastWindowIndex;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t1h)) {
            return false;
        }
        t1h t1hVar = (t1h) obj;
        if (t1hVar.getWindowCount() != getWindowCount() || t1hVar.getPeriodCount() != getPeriodCount()) {
            return false;
        }
        C12851d c12851d = new C12851d();
        C12849b c12849b = new C12849b();
        C12851d c12851d2 = new C12851d();
        C12849b c12849b2 = new C12849b();
        for (int i = 0; i < getWindowCount(); i++) {
            if (!getWindow(i, c12851d).equals(t1hVar.getWindow(i, c12851d2))) {
                return false;
            }
        }
        for (int i2 = 0; i2 < getPeriodCount(); i2++) {
            if (!getPeriod(i2, c12849b, true).equals(t1hVar.getPeriod(i2, c12849b2, true))) {
                return false;
            }
        }
        int firstWindowIndex = getFirstWindowIndex(true);
        if (firstWindowIndex != t1hVar.getFirstWindowIndex(true) || (lastWindowIndex = getLastWindowIndex(true)) != t1hVar.getLastWindowIndex(true)) {
            return false;
        }
        while (firstWindowIndex != lastWindowIndex) {
            int nextWindowIndex = getNextWindowIndex(firstWindowIndex, 0, true);
            if (nextWindowIndex != t1hVar.getNextWindowIndex(firstWindowIndex, 0, true)) {
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

    public final int getNextPeriodIndex(int i, C12849b c12849b, C12851d c12851d, int i2, boolean z) {
        int i3 = getPeriod(i, c12849b).f83398c;
        if (getWindow(i3, c12851d).f83432Y != i) {
            return i + 1;
        }
        int nextWindowIndex = getNextWindowIndex(i3, i2, z);
        if (nextWindowIndex == -1) {
            return -1;
        }
        return getWindow(nextWindowIndex, c12851d).f83431X;
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

    public final C12849b getPeriod(int i, C12849b c12849b) {
        return getPeriod(i, c12849b, false);
    }

    public abstract C12849b getPeriod(int i, C12849b c12849b, boolean z);

    public C12849b getPeriodByUid(Object obj, C12849b c12849b) {
        return getPeriod(getIndexOfPeriod(obj), c12849b, true);
    }

    public abstract int getPeriodCount();

    @Deprecated
    @p28(replacement = "this.getPeriodPositionUs(window, period, windowIndex, windowPositionUs)")
    public final Pair<Object, Long> getPeriodPosition(C12851d c12851d, C12849b c12849b, int i, long j) {
        return getPeriodPositionUs(c12851d, c12849b, i, j);
    }

    public final Pair<Object, Long> getPeriodPositionUs(C12851d c12851d, C12849b c12849b, int i, long j) {
        return (Pair) u80.checkNotNull(getPeriodPositionUs(c12851d, c12849b, i, j, 0L));
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

    public final C12851d getWindow(int i, C12851d c12851d) {
        return getWindow(i, c12851d, 0L);
    }

    public abstract C12851d getWindow(int i, C12851d c12851d, long j);

    public abstract int getWindowCount();

    public int hashCode() {
        C12851d c12851d = new C12851d();
        C12849b c12849b = new C12849b();
        int windowCount = 217 + getWindowCount();
        for (int i = 0; i < getWindowCount(); i++) {
            windowCount = (windowCount * 31) + getWindow(i, c12851d).hashCode();
        }
        int periodCount = (windowCount * 31) + getPeriodCount();
        for (int i2 = 0; i2 < getPeriodCount(); i2++) {
            periodCount = (periodCount * 31) + getPeriod(i2, c12849b, true).hashCode();
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

    public final boolean isLastPeriod(int i, C12849b c12849b, C12851d c12851d, int i2, boolean z) {
        return getNextPeriodIndex(i, c12849b, c12851d, i2, z) == -1;
    }

    @Override // p000.gh1
    public final Bundle toBundle() {
        ArrayList arrayList = new ArrayList();
        int windowCount = getWindowCount();
        C12851d c12851d = new C12851d();
        for (int i = 0; i < windowCount; i++) {
            arrayList.add(getWindow(i, c12851d, 0L).toBundle());
        }
        ArrayList arrayList2 = new ArrayList();
        int periodCount = getPeriodCount();
        C12849b c12849b = new C12849b();
        for (int i2 = 0; i2 < periodCount; i2++) {
            arrayList2.add(getPeriod(i2, c12849b, false).toBundle());
        }
        int[] iArr = new int[windowCount];
        if (windowCount > 0) {
            iArr[0] = getFirstWindowIndex(true);
        }
        for (int i3 = 1; i3 < windowCount; i3++) {
            iArr[i3] = getNextWindowIndex(iArr[i3 - 1], 0, true);
        }
        Bundle bundle = new Bundle();
        fh1.putBinder(bundle, f83386b, new wg1(arrayList));
        fh1.putBinder(bundle, f83387c, new wg1(arrayList2));
        bundle.putIntArray(f83388d, iArr);
        return bundle;
    }

    public final Bundle toBundleWithOneWindowOnly(int i) {
        C12851d window = getWindow(i, new C12851d(), 0L);
        ArrayList arrayList = new ArrayList();
        C12849b c12849b = new C12849b();
        int i2 = window.f83431X;
        while (true) {
            int i3 = window.f83432Y;
            if (i2 > i3) {
                window.f83432Y = i3 - window.f83431X;
                window.f83431X = 0;
                Bundle bundle = window.toBundle();
                Bundle bundle2 = new Bundle();
                fh1.putBinder(bundle2, f83386b, new wg1(kx7.m15111of(bundle)));
                fh1.putBinder(bundle2, f83387c, new wg1(arrayList));
                bundle2.putIntArray(f83388d, new int[]{0});
                return bundle2;
            }
            getPeriod(i2, c12849b, false);
            c12849b.f83398c = 0;
            arrayList.add(c12849b.toBundle());
            i2++;
        }
    }

    @hib
    @Deprecated
    @p28(replacement = "this.getPeriodPositionUs(window, period, windowIndex, windowPositionUs, defaultPositionProjectionUs)")
    public final Pair<Object, Long> getPeriodPosition(C12851d c12851d, C12849b c12849b, int i, long j, long j2) {
        return getPeriodPositionUs(c12851d, c12849b, i, j, j2);
    }

    @hib
    public final Pair<Object, Long> getPeriodPositionUs(C12851d c12851d, C12849b c12849b, int i, long j, long j2) {
        u80.checkIndex(i, 0, getWindowCount());
        getWindow(i, c12851d, j2);
        if (j == -9223372036854775807L) {
            j = c12851d.getDefaultPositionUs();
            if (j == -9223372036854775807L) {
                return null;
            }
        }
        int i2 = c12851d.f83431X;
        getPeriod(i2, c12849b);
        while (i2 < c12851d.f83432Y && c12849b.f83400e != j) {
            int i3 = i2 + 1;
            if (getPeriod(i3, c12849b).f83400e > j) {
                break;
            }
            i2 = i3;
        }
        getPeriod(i2, c12849b, true);
        long jMin = j - c12849b.f83400e;
        long j3 = c12849b.f83399d;
        if (j3 != -9223372036854775807L) {
            jMin = Math.min(jMin, j3 - 1);
        }
        return Pair.create(u80.checkNotNull(c12849b.f83397b), Long.valueOf(Math.max(0L, jMin)));
    }
}
