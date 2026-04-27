package p000;

import android.content.Context;
import android.graphics.Point;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.RandomAccess;
import java.util.Set;
import p000.C11477qh;
import p000.f24;
import p000.gh1;
import p000.j7h;
import p000.kx7;
import p000.p1e;
import p000.pf5;
import p000.st9;
import p000.vna;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class f24 extends st9 implements p1e.InterfaceC10758f {

    /* JADX INFO: renamed from: k */
    public static final String f34733k = "DefaultTrackSelector";

    /* JADX INFO: renamed from: l */
    public static final String f34734l = "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.";

    /* JADX INFO: renamed from: m */
    public static final int f34735m = 0;

    /* JADX INFO: renamed from: n */
    public static final int f34736n = 1;

    /* JADX INFO: renamed from: o */
    public static final int f34737o = 2;

    /* JADX INFO: renamed from: p */
    public static final float f34738p = 0.98f;

    /* JADX INFO: renamed from: q */
    public static final s7c<Integer> f34739q = s7c.from(new Comparator() { // from class: x04
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return f24.lambda$static$0((Integer) obj, (Integer) obj2);
        }
    });

    /* JADX INFO: renamed from: r */
    public static final s7c<Integer> f34740r = s7c.from(new Comparator() { // from class: z04
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return f24.lambda$static$1((Integer) obj, (Integer) obj2);
        }
    });

    /* JADX INFO: renamed from: d */
    public final Object f34741d;

    /* JADX INFO: renamed from: e */
    @hib
    public final Context f34742e;

    /* JADX INFO: renamed from: f */
    public final pf5.InterfaceC10941b f34743f;

    /* JADX INFO: renamed from: g */
    public final boolean f34744g;

    /* JADX INFO: renamed from: h */
    @xc7("lock")
    public C5550e f34745h;

    /* JADX INFO: renamed from: i */
    @xc7("lock")
    @hib
    public C5546a f34746i;

    /* JADX INFO: renamed from: j */
    @xc7("lock")
    public yc0 f34747j;

    /* JADX INFO: renamed from: f24$a */
    @c5e(32)
    public static class C5546a {

        /* JADX INFO: renamed from: a */
        public final Spatializer f34748a;

        /* JADX INFO: renamed from: b */
        public final boolean f34749b;

        /* JADX INFO: renamed from: c */
        @hib
        public Handler f34750c;

        /* JADX INFO: renamed from: d */
        @hib
        public Spatializer$OnSpatializerStateChangedListener f34751d;

        /* JADX INFO: renamed from: f24$a$a */
        public class a implements Spatializer$OnSpatializerStateChangedListener {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ f24 f34752a;

            public a(f24 f24Var) {
                this.f34752a = f24Var;
            }

            public void onSpatializerAvailableChanged(Spatializer spatializer, boolean z) {
                this.f34752a.maybeInvalidateForAudioChannelCountConstraints();
            }

            public void onSpatializerEnabledChanged(Spatializer spatializer, boolean z) {
                this.f34752a.maybeInvalidateForAudioChannelCountConstraints();
            }
        }

        private C5546a(Spatializer spatializer) {
            this.f34748a = spatializer;
            this.f34749b = spatializer.getImmersiveAudioLevel() != 0;
        }

        @hib
        public static C5546a tryCreateInstance(Context context) {
            AudioManager audioManager = (AudioManager) context.getSystemService("audio");
            if (audioManager == null) {
                return null;
            }
            return new C5546a(audioManager.getSpatializer());
        }

        public boolean canBeSpatialized(yc0 yc0Var, kq6 kq6Var) {
            AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(x0i.getAudioTrackChannelConfig(("audio/eac3-joc".equals(kq6Var.f54989M) && kq6Var.f55007e2 == 16) ? 12 : kq6Var.f55007e2));
            int i = kq6Var.f55009f2;
            if (i != -1) {
                channelMask.setSampleRate(i);
            }
            return this.f34748a.canBeSpatialized(yc0Var.getAudioAttributesV21().f101076a, channelMask.build());
        }

        public void ensureInitialized(f24 f24Var, Looper looper) {
            if (this.f34751d == null && this.f34750c == null) {
                this.f34751d = new a(f24Var);
                Handler handler = new Handler(looper);
                this.f34750c = handler;
                Spatializer spatializer = this.f34748a;
                Objects.requireNonNull(handler);
                spatializer.addOnSpatializerStateChangedListener(new gp2(handler), this.f34751d);
            }
        }

        public boolean isAvailable() {
            return this.f34748a.isAvailable();
        }

        public boolean isEnabled() {
            return this.f34748a.isEnabled();
        }

        public boolean isSpatializationSupported() {
            return this.f34749b;
        }

        public void release() {
            Spatializer$OnSpatializerStateChangedListener spatializer$OnSpatializerStateChangedListener = this.f34751d;
            if (spatializer$OnSpatializerStateChangedListener == null || this.f34750c == null) {
                return;
            }
            this.f34748a.removeOnSpatializerStateChangedListener(spatializer$OnSpatializerStateChangedListener);
            ((Handler) x0i.castNonNull(this.f34750c)).removeCallbacksAndMessages(null);
            this.f34750c = null;
            this.f34751d = null;
        }
    }

    /* JADX INFO: renamed from: f24$c */
    public static final class C5548c extends AbstractC5554i<C5548c> implements Comparable<C5548c> {

        /* JADX INFO: renamed from: C */
        public final C5550e f34754C;

        /* JADX INFO: renamed from: F */
        public final boolean f34755F;

        /* JADX INFO: renamed from: H */
        public final int f34756H;

        /* JADX INFO: renamed from: L */
        public final int f34757L;

        /* JADX INFO: renamed from: M */
        public final int f34758M;

        /* JADX INFO: renamed from: M1 */
        public final int f34759M1;

        /* JADX INFO: renamed from: N */
        public final boolean f34760N;

        /* JADX INFO: renamed from: Q */
        public final int f34761Q;

        /* JADX INFO: renamed from: V1 */
        public final int f34762V1;

        /* JADX INFO: renamed from: X */
        public final int f34763X;

        /* JADX INFO: renamed from: Y */
        public final boolean f34764Y;

        /* JADX INFO: renamed from: Z */
        public final int f34765Z;

        /* JADX INFO: renamed from: Z1 */
        public final int f34766Z1;

        /* JADX INFO: renamed from: a2 */
        public final boolean f34767a2;

        /* JADX INFO: renamed from: b2 */
        public final boolean f34768b2;

        /* JADX INFO: renamed from: e */
        public final int f34769e;

        /* JADX INFO: renamed from: f */
        public final boolean f34770f;

        /* JADX INFO: renamed from: m */
        @hib
        public final String f34771m;

        public C5548c(int i, g6h g6hVar, int i2, C5550e c5550e, int i3, boolean z, l8d<kq6> l8dVar) {
            int i4;
            int iM10429q;
            int iM10429q2;
            super(i, g6hVar, i2);
            this.f34754C = c5550e;
            this.f34771m = f24.m10431s(this.f34848d.f55002c);
            this.f34755F = f24.m10430r(i3, false);
            int i5 = 0;
            while (true) {
                i4 = Integer.MAX_VALUE;
                if (i5 >= c5550e.f49756Q.size()) {
                    iM10429q = 0;
                    i5 = Integer.MAX_VALUE;
                    break;
                } else {
                    iM10429q = f24.m10429q(this.f34848d, c5550e.f49756Q.get(i5), false);
                    if (iM10429q > 0) {
                        break;
                    } else {
                        i5++;
                    }
                }
            }
            this.f34757L = i5;
            this.f34756H = iM10429q;
            this.f34758M = f24.getRoleFlagMatchScore(this.f34848d.f55006e, c5550e.f49758X);
            kq6 kq6Var = this.f34848d;
            int i6 = kq6Var.f55006e;
            this.f34760N = i6 == 0 || (i6 & 1) != 0;
            this.f34764Y = (kq6Var.f55004d & 1) != 0;
            int i7 = kq6Var.f55007e2;
            this.f34765Z = i7;
            this.f34759M1 = kq6Var.f55009f2;
            int i8 = kq6Var.f54985C;
            this.f34762V1 = i8;
            this.f34770f = (i8 == -1 || i8 <= c5550e.f49760Z) && (i7 == -1 || i7 <= c5550e.f49759Y) && l8dVar.apply(kq6Var);
            String[] systemLanguageCodes = x0i.getSystemLanguageCodes();
            int i9 = 0;
            while (true) {
                if (i9 >= systemLanguageCodes.length) {
                    iM10429q2 = 0;
                    i9 = Integer.MAX_VALUE;
                    break;
                } else {
                    iM10429q2 = f24.m10429q(this.f34848d, systemLanguageCodes[i9], false);
                    if (iM10429q2 > 0) {
                        break;
                    } else {
                        i9++;
                    }
                }
            }
            this.f34761Q = i9;
            this.f34763X = iM10429q2;
            int i10 = 0;
            while (true) {
                if (i10 < c5550e.f49754M1.size()) {
                    String str = this.f34848d.f54989M;
                    if (str != null && str.equals(c5550e.f49754M1.get(i10))) {
                        i4 = i10;
                        break;
                    }
                    i10++;
                } else {
                    break;
                }
            }
            this.f34766Z1 = i4;
            this.f34767a2 = p1e.getDecoderSupport(i3) == 128;
            this.f34768b2 = p1e.getHardwareAccelerationSupport(i3) == 64;
            this.f34769e = evaluateSelectionEligibility(i3, z);
        }

        public static int compareSelections(List<C5548c> list, List<C5548c> list2) {
            return ((C5548c) Collections.max(list)).compareTo((C5548c) Collections.max(list2));
        }

        public static kx7<C5548c> createForTrackGroup(int i, g6h g6hVar, C5550e c5550e, int[] iArr, boolean z, l8d<kq6> l8dVar) {
            kx7.C8541a c8541aBuilder = kx7.builder();
            for (int i2 = 0; i2 < g6hVar.f38907a; i2++) {
                c8541aBuilder.add(new C5548c(i, g6hVar, i2, c5550e, iArr[i2], z, l8dVar));
            }
            return c8541aBuilder.build();
        }

        private int evaluateSelectionEligibility(int i, boolean z) {
            if (!f24.m10430r(i, this.f34754C.f34805U2)) {
                return 0;
            }
            if (!this.f34770f && !this.f34754C.f34799O2) {
                return 0;
            }
            if (f24.m10430r(i, false) && this.f34770f && this.f34848d.f54985C != -1) {
                C5550e c5550e = this.f34754C;
                if (!c5550e.f49769d2 && !c5550e.f49767c2 && (c5550e.f34807W2 || !z)) {
                    return 2;
                }
            }
            return 1;
        }

        @Override // p000.f24.AbstractC5554i
        public int getSelectionEligibility() {
            return this.f34769e;
        }

        @Override // java.lang.Comparable
        public int compareTo(C5548c c5548c) {
            s7c s7cVarReverse = (this.f34770f && this.f34755F) ? f24.f34739q : f24.f34739q.reverse();
            bd2 bd2VarCompare = bd2.start().compareFalseFirst(this.f34755F, c5548c.f34755F).compare(Integer.valueOf(this.f34757L), Integer.valueOf(c5548c.f34757L), s7c.natural().reverse()).compare(this.f34756H, c5548c.f34756H).compare(this.f34758M, c5548c.f34758M).compareFalseFirst(this.f34764Y, c5548c.f34764Y).compareFalseFirst(this.f34760N, c5548c.f34760N).compare(Integer.valueOf(this.f34761Q), Integer.valueOf(c5548c.f34761Q), s7c.natural().reverse()).compare(this.f34763X, c5548c.f34763X).compareFalseFirst(this.f34770f, c5548c.f34770f).compare(Integer.valueOf(this.f34766Z1), Integer.valueOf(c5548c.f34766Z1), s7c.natural().reverse()).compare(Integer.valueOf(this.f34762V1), Integer.valueOf(c5548c.f34762V1), this.f34754C.f49767c2 ? f24.f34739q.reverse() : f24.f34740r).compareFalseFirst(this.f34767a2, c5548c.f34767a2).compareFalseFirst(this.f34768b2, c5548c.f34768b2).compare(Integer.valueOf(this.f34765Z), Integer.valueOf(c5548c.f34765Z), s7cVarReverse).compare(Integer.valueOf(this.f34759M1), Integer.valueOf(c5548c.f34759M1), s7cVarReverse);
            Integer numValueOf = Integer.valueOf(this.f34762V1);
            Integer numValueOf2 = Integer.valueOf(c5548c.f34762V1);
            if (!x0i.areEqual(this.f34771m, c5548c.f34771m)) {
                s7cVarReverse = f24.f34740r;
            }
            return bd2VarCompare.compare(numValueOf, numValueOf2, s7cVarReverse).result();
        }

        @Override // p000.f24.AbstractC5554i
        public boolean isCompatibleForAdaptationWith(C5548c c5548c) {
            int i;
            String str;
            int i2;
            C5550e c5550e = this.f34754C;
            if ((c5550e.f34802R2 || ((i2 = this.f34848d.f55007e2) != -1 && i2 == c5548c.f34848d.f55007e2)) && (c5550e.f34800P2 || ((str = this.f34848d.f54989M) != null && TextUtils.equals(str, c5548c.f34848d.f54989M)))) {
                C5550e c5550e2 = this.f34754C;
                if ((c5550e2.f34801Q2 || ((i = this.f34848d.f55009f2) != -1 && i == c5548c.f34848d.f55009f2)) && (c5550e2.f34803S2 || (this.f34767a2 == c5548c.f34767a2 && this.f34768b2 == c5548c.f34768b2))) {
                    return true;
                }
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: f24$d */
    public static final class C5549d implements Comparable<C5549d> {

        /* JADX INFO: renamed from: a */
        public final boolean f34772a;

        /* JADX INFO: renamed from: b */
        public final boolean f34773b;

        public C5549d(kq6 kq6Var, int i) {
            this.f34772a = (kq6Var.f55004d & 1) != 0;
            this.f34773b = f24.m10430r(i, false);
        }

        @Override // java.lang.Comparable
        public int compareTo(C5549d c5549d) {
            return bd2.start().compareFalseFirst(this.f34773b, c5549d.f34773b).compareFalseFirst(this.f34772a, c5549d.f34772a).result();
        }
    }

    /* JADX INFO: renamed from: f24$e */
    public static final class C5550e extends j7h implements gh1 {

        /* JADX INFO: renamed from: a3 */
        public static final C5550e f34774a3;

        /* JADX INFO: renamed from: b3 */
        @Deprecated
        public static final C5550e f34775b3;

        /* JADX INFO: renamed from: c3 */
        public static final String f34776c3;

        /* JADX INFO: renamed from: d3 */
        public static final String f34777d3;

        /* JADX INFO: renamed from: e3 */
        public static final String f34778e3;

        /* JADX INFO: renamed from: f3 */
        public static final String f34779f3;

        /* JADX INFO: renamed from: g3 */
        public static final String f34780g3;

        /* JADX INFO: renamed from: h3 */
        public static final String f34781h3;

        /* JADX INFO: renamed from: i3 */
        public static final String f34782i3;

        /* JADX INFO: renamed from: j3 */
        public static final String f34783j3;

        /* JADX INFO: renamed from: k3 */
        public static final String f34784k3;

        /* JADX INFO: renamed from: l3 */
        public static final String f34785l3;

        /* JADX INFO: renamed from: m3 */
        public static final String f34786m3;

        /* JADX INFO: renamed from: n3 */
        public static final String f34787n3;

        /* JADX INFO: renamed from: o3 */
        public static final String f34788o3;

        /* JADX INFO: renamed from: p3 */
        public static final String f34789p3;

        /* JADX INFO: renamed from: q3 */
        public static final String f34790q3;

        /* JADX INFO: renamed from: r3 */
        public static final String f34791r3;

        /* JADX INFO: renamed from: s3 */
        public static final String f34792s3;

        /* JADX INFO: renamed from: t3 */
        public static final String f34793t3;

        /* JADX INFO: renamed from: u3 */
        public static final gh1.InterfaceC6311a<C5550e> f34794u3;

        /* JADX INFO: renamed from: K2 */
        public final boolean f34795K2;

        /* JADX INFO: renamed from: L2 */
        public final boolean f34796L2;

        /* JADX INFO: renamed from: M2 */
        public final boolean f34797M2;

        /* JADX INFO: renamed from: N2 */
        public final boolean f34798N2;

        /* JADX INFO: renamed from: O2 */
        public final boolean f34799O2;

        /* JADX INFO: renamed from: P2 */
        public final boolean f34800P2;

        /* JADX INFO: renamed from: Q2 */
        public final boolean f34801Q2;

        /* JADX INFO: renamed from: R2 */
        public final boolean f34802R2;

        /* JADX INFO: renamed from: S2 */
        public final boolean f34803S2;

        /* JADX INFO: renamed from: T2 */
        public final boolean f34804T2;

        /* JADX INFO: renamed from: U2 */
        public final boolean f34805U2;

        /* JADX INFO: renamed from: V2 */
        public final boolean f34806V2;

        /* JADX INFO: renamed from: W2 */
        public final boolean f34807W2;

        /* JADX INFO: renamed from: X2 */
        public final boolean f34808X2;

        /* JADX INFO: renamed from: Y2 */
        public final SparseArray<Map<m6h, C5552g>> f34809Y2;

        /* JADX INFO: renamed from: Z2 */
        public final SparseBooleanArray f34810Z2;

        /* JADX INFO: renamed from: f24$e$a */
        public static final class a extends j7h.C7775a {

            /* JADX INFO: renamed from: A */
            public boolean f34811A;

            /* JADX INFO: renamed from: B */
            public boolean f34812B;

            /* JADX INFO: renamed from: C */
            public boolean f34813C;

            /* JADX INFO: renamed from: D */
            public boolean f34814D;

            /* JADX INFO: renamed from: E */
            public boolean f34815E;

            /* JADX INFO: renamed from: F */
            public boolean f34816F;

            /* JADX INFO: renamed from: G */
            public boolean f34817G;

            /* JADX INFO: renamed from: H */
            public boolean f34818H;

            /* JADX INFO: renamed from: I */
            public boolean f34819I;

            /* JADX INFO: renamed from: J */
            public boolean f34820J;

            /* JADX INFO: renamed from: K */
            public boolean f34821K;

            /* JADX INFO: renamed from: L */
            public boolean f34822L;

            /* JADX INFO: renamed from: M */
            public boolean f34823M;

            /* JADX INFO: renamed from: N */
            public boolean f34824N;

            /* JADX INFO: renamed from: O */
            public final SparseArray<Map<m6h, C5552g>> f34825O;

            /* JADX INFO: renamed from: P */
            public final SparseBooleanArray f34826P;

            private static SparseArray<Map<m6h, C5552g>> cloneSelectionOverrides(SparseArray<Map<m6h, C5552g>> sparseArray) {
                SparseArray<Map<m6h, C5552g>> sparseArray2 = new SparseArray<>();
                for (int i = 0; i < sparseArray.size(); i++) {
                    sparseArray2.put(sparseArray.keyAt(i), new HashMap(sparseArray.valueAt(i)));
                }
                return sparseArray2;
            }

            private void init() {
                this.f34811A = true;
                this.f34812B = false;
                this.f34813C = true;
                this.f34814D = false;
                this.f34815E = true;
                this.f34816F = false;
                this.f34817G = false;
                this.f34818H = false;
                this.f34819I = false;
                this.f34820J = true;
                this.f34821K = true;
                this.f34822L = false;
                this.f34823M = true;
                this.f34824N = false;
            }

            private SparseBooleanArray makeSparseBooleanArrayFromTrueKeys(@hib int[] iArr) {
                if (iArr == null) {
                    return new SparseBooleanArray();
                }
                SparseBooleanArray sparseBooleanArray = new SparseBooleanArray(iArr.length);
                for (int i : iArr) {
                    sparseBooleanArray.append(i, true);
                }
                return sparseBooleanArray;
            }

            /* JADX WARN: Multi-variable type inference failed */
            private void setSelectionOverridesFromBundle(Bundle bundle) {
                int[] intArray = bundle.getIntArray(C5550e.f34786m3);
                ArrayList parcelableArrayList = bundle.getParcelableArrayList(C5550e.f34787n3);
                kx7 kx7VarM15110of = parcelableArrayList == null ? kx7.m15110of() : ih1.fromBundleList(m6h.f60033m, parcelableArrayList);
                SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(C5550e.f34788o3);
                SparseArray sparseArray = sparseParcelableArray == null ? new SparseArray() : ih1.fromBundleSparseArray(C5552g.f34828C, sparseParcelableArray);
                if (intArray == null || intArray.length != kx7VarM15110of.size()) {
                    return;
                }
                for (int i = 0; i < intArray.length; i++) {
                    setSelectionOverride(intArray[i], (m6h) kx7VarM15110of.get(i), (C5552g) sparseArray.get(i));
                }
            }

            @Override // p000.j7h.C7775a
            @op1
            /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
            public a mo10475A(j7h j7hVar) {
                super.mo10475A(j7hVar);
                return this;
            }

            @op1
            @Deprecated
            public a clearSelectionOverride(int i, m6h m6hVar) {
                Map<m6h, C5552g> map = this.f34825O.get(i);
                if (map != null && map.containsKey(m6hVar)) {
                    map.remove(m6hVar);
                    if (map.isEmpty()) {
                        this.f34825O.remove(i);
                    }
                }
                return this;
            }

            @op1
            @Deprecated
            public a clearSelectionOverrides(int i) {
                Map<m6h, C5552g> map = this.f34825O.get(i);
                if (map != null && !map.isEmpty()) {
                    this.f34825O.remove(i);
                }
                return this;
            }

            @op1
            public a setAllowAudioMixedChannelCountAdaptiveness(boolean z) {
                this.f34818H = z;
                return this;
            }

            @op1
            public a setAllowAudioMixedDecoderSupportAdaptiveness(boolean z) {
                this.f34819I = z;
                return this;
            }

            @op1
            public a setAllowAudioMixedMimeTypeAdaptiveness(boolean z) {
                this.f34816F = z;
                return this;
            }

            @op1
            public a setAllowAudioMixedSampleRateAdaptiveness(boolean z) {
                this.f34817G = z;
                return this;
            }

            @op1
            public a setAllowInvalidateSelectionsOnRendererCapabilitiesChange(boolean z) {
                this.f34824N = z;
                return this;
            }

            @op1
            public a setAllowMultipleAdaptiveSelections(boolean z) {
                this.f34823M = z;
                return this;
            }

            @op1
            public a setAllowVideoMixedDecoderSupportAdaptiveness(boolean z) {
                this.f34814D = z;
                return this;
            }

            @op1
            public a setAllowVideoMixedMimeTypeAdaptiveness(boolean z) {
                this.f34812B = z;
                return this;
            }

            @op1
            public a setAllowVideoNonSeamlessAdaptiveness(boolean z) {
                this.f34813C = z;
                return this;
            }

            @op1
            public a setConstrainAudioChannelCountToDeviceCapabilities(boolean z) {
                this.f34820J = z;
                return this;
            }

            @op1
            @Deprecated
            public a setDisabledTextTrackSelectionFlags(int i) {
                return setIgnoredTextSelectionFlags(i);
            }

            @Override // p000.j7h.C7775a
            @op1
            @Deprecated
            public /* bridge */ /* synthetic */ j7h.C7775a setDisabledTrackTypes(Set set) {
                return setDisabledTrackTypes((Set<Integer>) set);
            }

            @op1
            public a setExceedAudioConstraintsIfNecessary(boolean z) {
                this.f34815E = z;
                return this;
            }

            @op1
            public a setExceedRendererCapabilitiesIfNecessary(boolean z) {
                this.f34821K = z;
                return this;
            }

            @op1
            public a setExceedVideoConstraintsIfNecessary(boolean z) {
                this.f34811A = z;
                return this;
            }

            @op1
            public a setRendererDisabled(int i, boolean z) {
                if (this.f34826P.get(i) == z) {
                    return this;
                }
                if (z) {
                    this.f34826P.put(i, true);
                } else {
                    this.f34826P.delete(i);
                }
                return this;
            }

            @op1
            @Deprecated
            public a setSelectionOverride(int i, m6h m6hVar, @hib C5552g c5552g) {
                Map<m6h, C5552g> map = this.f34825O.get(i);
                if (map == null) {
                    map = new HashMap<>();
                    this.f34825O.put(i, map);
                }
                if (map.containsKey(m6hVar) && x0i.areEqual(map.get(m6hVar), c5552g)) {
                    return this;
                }
                map.put(m6hVar, c5552g);
                return this;
            }

            @op1
            public a setTunnelingEnabled(boolean z) {
                this.f34822L = z;
                return this;
            }

            @Override // p000.j7h.C7775a
            @op1
            public a addOverride(d7h d7hVar) {
                super.addOverride(d7hVar);
                return this;
            }

            @Override // p000.j7h.C7775a
            public C5550e build() {
                return new C5550e(this);
            }

            @Override // p000.j7h.C7775a
            @op1
            public a clearOverride(g6h g6hVar) {
                super.clearOverride(g6hVar);
                return this;
            }

            @Override // p000.j7h.C7775a
            @op1
            public a clearOverrides() {
                super.clearOverrides();
                return this;
            }

            @Override // p000.j7h.C7775a
            @op1
            public a clearOverridesOfType(int i) {
                super.clearOverridesOfType(i);
                return this;
            }

            @Override // p000.j7h.C7775a
            @op1
            public a clearVideoSizeConstraints() {
                super.clearVideoSizeConstraints();
                return this;
            }

            @Override // p000.j7h.C7775a
            @op1
            public a clearViewportSizeConstraints() {
                super.clearViewportSizeConstraints();
                return this;
            }

            @Override // p000.j7h.C7775a
            @op1
            @Deprecated
            public a setDisabledTrackTypes(Set<Integer> set) {
                super.setDisabledTrackTypes(set);
                return this;
            }

            @Override // p000.j7h.C7775a
            @op1
            public a setForceHighestSupportedBitrate(boolean z) {
                super.setForceHighestSupportedBitrate(z);
                return this;
            }

            @Override // p000.j7h.C7775a
            @op1
            public a setForceLowestBitrate(boolean z) {
                super.setForceLowestBitrate(z);
                return this;
            }

            @Override // p000.j7h.C7775a
            @op1
            public a setIgnoredTextSelectionFlags(int i) {
                super.setIgnoredTextSelectionFlags(i);
                return this;
            }

            @Override // p000.j7h.C7775a
            @op1
            public a setMaxAudioBitrate(int i) {
                super.setMaxAudioBitrate(i);
                return this;
            }

            @Override // p000.j7h.C7775a
            @op1
            public a setMaxAudioChannelCount(int i) {
                super.setMaxAudioChannelCount(i);
                return this;
            }

            @Override // p000.j7h.C7775a
            @op1
            public a setMaxVideoBitrate(int i) {
                super.setMaxVideoBitrate(i);
                return this;
            }

            @Override // p000.j7h.C7775a
            @op1
            public a setMaxVideoFrameRate(int i) {
                super.setMaxVideoFrameRate(i);
                return this;
            }

            @Override // p000.j7h.C7775a
            @op1
            public a setMaxVideoSize(int i, int i2) {
                super.setMaxVideoSize(i, i2);
                return this;
            }

            @Override // p000.j7h.C7775a
            @op1
            public a setMaxVideoSizeSd() {
                super.setMaxVideoSizeSd();
                return this;
            }

            @Override // p000.j7h.C7775a
            @op1
            public a setMinVideoBitrate(int i) {
                super.setMinVideoBitrate(i);
                return this;
            }

            @Override // p000.j7h.C7775a
            @op1
            public a setMinVideoFrameRate(int i) {
                super.setMinVideoFrameRate(i);
                return this;
            }

            @Override // p000.j7h.C7775a
            @op1
            public a setMinVideoSize(int i, int i2) {
                super.setMinVideoSize(i, i2);
                return this;
            }

            @Override // p000.j7h.C7775a
            @op1
            public a setOverrideForType(d7h d7hVar) {
                super.setOverrideForType(d7hVar);
                return this;
            }

            @Override // p000.j7h.C7775a
            @op1
            public a setPreferredAudioLanguage(@hib String str) {
                super.setPreferredAudioLanguage(str);
                return this;
            }

            @Override // p000.j7h.C7775a
            @op1
            public a setPreferredAudioLanguages(String... strArr) {
                super.setPreferredAudioLanguages(strArr);
                return this;
            }

            @Override // p000.j7h.C7775a
            @op1
            public a setPreferredAudioMimeType(@hib String str) {
                super.setPreferredAudioMimeType(str);
                return this;
            }

            @Override // p000.j7h.C7775a
            @op1
            public a setPreferredAudioMimeTypes(String... strArr) {
                super.setPreferredAudioMimeTypes(strArr);
                return this;
            }

            @Override // p000.j7h.C7775a
            @op1
            public a setPreferredAudioRoleFlags(int i) {
                super.setPreferredAudioRoleFlags(i);
                return this;
            }

            @Override // p000.j7h.C7775a
            @op1
            public a setPreferredTextLanguage(@hib String str) {
                super.setPreferredTextLanguage(str);
                return this;
            }

            @Override // p000.j7h.C7775a
            @op1
            public a setPreferredTextLanguageAndRoleFlagsToCaptioningManagerSettings(Context context) {
                super.setPreferredTextLanguageAndRoleFlagsToCaptioningManagerSettings(context);
                return this;
            }

            @Override // p000.j7h.C7775a
            @op1
            public a setPreferredTextLanguages(String... strArr) {
                super.setPreferredTextLanguages(strArr);
                return this;
            }

            @Override // p000.j7h.C7775a
            @op1
            public a setPreferredTextRoleFlags(int i) {
                super.setPreferredTextRoleFlags(i);
                return this;
            }

            @Override // p000.j7h.C7775a
            @op1
            public a setPreferredVideoMimeType(@hib String str) {
                super.setPreferredVideoMimeType(str);
                return this;
            }

            @Override // p000.j7h.C7775a
            @op1
            public a setPreferredVideoMimeTypes(String... strArr) {
                super.setPreferredVideoMimeTypes(strArr);
                return this;
            }

            @Override // p000.j7h.C7775a
            @op1
            public a setPreferredVideoRoleFlags(int i) {
                super.setPreferredVideoRoleFlags(i);
                return this;
            }

            @Override // p000.j7h.C7775a
            @op1
            public a setSelectUndeterminedTextLanguage(boolean z) {
                super.setSelectUndeterminedTextLanguage(z);
                return this;
            }

            @Override // p000.j7h.C7775a
            @op1
            public a setTrackTypeDisabled(int i, boolean z) {
                super.setTrackTypeDisabled(i, z);
                return this;
            }

            @Override // p000.j7h.C7775a
            @op1
            public a setViewportSize(int i, int i2, boolean z) {
                super.setViewportSize(i, i2, z);
                return this;
            }

            @Override // p000.j7h.C7775a
            @op1
            public a setViewportSizeToPhysicalDisplaySize(Context context, boolean z) {
                super.setViewportSizeToPhysicalDisplaySize(context, z);
                return this;
            }

            @Deprecated
            public a() {
                this.f34825O = new SparseArray<>();
                this.f34826P = new SparseBooleanArray();
                init();
            }

            @op1
            @Deprecated
            public a clearSelectionOverrides() {
                if (this.f34825O.size() == 0) {
                    return this;
                }
                this.f34825O.clear();
                return this;
            }

            public a(Context context) {
                super(context);
                this.f34825O = new SparseArray<>();
                this.f34826P = new SparseBooleanArray();
                init();
            }

            private a(C5550e c5550e) {
                super(c5550e);
                this.f34811A = c5550e.f34795K2;
                this.f34812B = c5550e.f34796L2;
                this.f34813C = c5550e.f34797M2;
                this.f34814D = c5550e.f34798N2;
                this.f34815E = c5550e.f34799O2;
                this.f34816F = c5550e.f34800P2;
                this.f34817G = c5550e.f34801Q2;
                this.f34818H = c5550e.f34802R2;
                this.f34819I = c5550e.f34803S2;
                this.f34820J = c5550e.f34804T2;
                this.f34821K = c5550e.f34805U2;
                this.f34822L = c5550e.f34806V2;
                this.f34823M = c5550e.f34807W2;
                this.f34824N = c5550e.f34808X2;
                this.f34825O = cloneSelectionOverrides(c5550e.f34809Y2);
                this.f34826P = c5550e.f34810Z2.clone();
            }

            private a(Bundle bundle) {
                super(bundle);
                init();
                C5550e c5550e = C5550e.f34774a3;
                setExceedVideoConstraintsIfNecessary(bundle.getBoolean(C5550e.f34776c3, c5550e.f34795K2));
                setAllowVideoMixedMimeTypeAdaptiveness(bundle.getBoolean(C5550e.f34777d3, c5550e.f34796L2));
                setAllowVideoNonSeamlessAdaptiveness(bundle.getBoolean(C5550e.f34778e3, c5550e.f34797M2));
                setAllowVideoMixedDecoderSupportAdaptiveness(bundle.getBoolean(C5550e.f34790q3, c5550e.f34798N2));
                setExceedAudioConstraintsIfNecessary(bundle.getBoolean(C5550e.f34779f3, c5550e.f34799O2));
                setAllowAudioMixedMimeTypeAdaptiveness(bundle.getBoolean(C5550e.f34780g3, c5550e.f34800P2));
                setAllowAudioMixedSampleRateAdaptiveness(bundle.getBoolean(C5550e.f34781h3, c5550e.f34801Q2));
                setAllowAudioMixedChannelCountAdaptiveness(bundle.getBoolean(C5550e.f34782i3, c5550e.f34802R2));
                setAllowAudioMixedDecoderSupportAdaptiveness(bundle.getBoolean(C5550e.f34791r3, c5550e.f34803S2));
                setConstrainAudioChannelCountToDeviceCapabilities(bundle.getBoolean(C5550e.f34792s3, c5550e.f34804T2));
                setExceedRendererCapabilitiesIfNecessary(bundle.getBoolean(C5550e.f34783j3, c5550e.f34805U2));
                setTunnelingEnabled(bundle.getBoolean(C5550e.f34784k3, c5550e.f34806V2));
                setAllowMultipleAdaptiveSelections(bundle.getBoolean(C5550e.f34785l3, c5550e.f34807W2));
                setAllowInvalidateSelectionsOnRendererCapabilitiesChange(bundle.getBoolean(C5550e.f34793t3, c5550e.f34808X2));
                this.f34825O = new SparseArray<>();
                setSelectionOverridesFromBundle(bundle);
                this.f34826P = makeSparseBooleanArrayFromTrueKeys(bundle.getIntArray(C5550e.f34789p3));
            }
        }

        static {
            C5550e c5550eBuild = new a().build();
            f34774a3 = c5550eBuild;
            f34775b3 = c5550eBuild;
            f34776c3 = x0i.intToStringMaxRadix(1000);
            f34777d3 = x0i.intToStringMaxRadix(1001);
            f34778e3 = x0i.intToStringMaxRadix(1002);
            f34779f3 = x0i.intToStringMaxRadix(1003);
            f34780g3 = x0i.intToStringMaxRadix(1004);
            f34781h3 = x0i.intToStringMaxRadix(1005);
            f34782i3 = x0i.intToStringMaxRadix(1006);
            f34783j3 = x0i.intToStringMaxRadix(1007);
            f34784k3 = x0i.intToStringMaxRadix(1008);
            f34785l3 = x0i.intToStringMaxRadix(1009);
            f34786m3 = x0i.intToStringMaxRadix(1010);
            f34787n3 = x0i.intToStringMaxRadix(1011);
            f34788o3 = x0i.intToStringMaxRadix(1012);
            f34789p3 = x0i.intToStringMaxRadix(1013);
            f34790q3 = x0i.intToStringMaxRadix(1014);
            f34791r3 = x0i.intToStringMaxRadix(1015);
            f34792s3 = x0i.intToStringMaxRadix(1016);
            f34793t3 = x0i.intToStringMaxRadix(1017);
            f34794u3 = new gh1.InterfaceC6311a() { // from class: r14
                @Override // p000.gh1.InterfaceC6311a
                public final gh1 fromBundle(Bundle bundle) {
                    return f24.C5550e.lambda$static$0(bundle);
                }
            };
        }

        private static boolean areRendererDisabledFlagsEqual(SparseBooleanArray sparseBooleanArray, SparseBooleanArray sparseBooleanArray2) {
            int size = sparseBooleanArray.size();
            if (sparseBooleanArray2.size() != size) {
                return false;
            }
            for (int i = 0; i < size; i++) {
                if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i)) < 0) {
                    return false;
                }
            }
            return true;
        }

        private static boolean areSelectionOverridesEqual(SparseArray<Map<m6h, C5552g>> sparseArray, SparseArray<Map<m6h, C5552g>> sparseArray2) {
            int size = sparseArray.size();
            if (sparseArray2.size() != size) {
                return false;
            }
            for (int i = 0; i < size; i++) {
                int iIndexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i));
                if (iIndexOfKey < 0 || !areSelectionOverridesEqual(sparseArray.valueAt(i), sparseArray2.valueAt(iIndexOfKey))) {
                    return false;
                }
            }
            return true;
        }

        public static C5550e getDefaults(Context context) {
            return new a(context).build();
        }

        private static int[] getKeysFromSparseBooleanArray(SparseBooleanArray sparseBooleanArray) {
            int[] iArr = new int[sparseBooleanArray.size()];
            for (int i = 0; i < sparseBooleanArray.size(); i++) {
                iArr[i] = sparseBooleanArray.keyAt(i);
            }
            return iArr;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ C5550e lambda$static$0(Bundle bundle) {
            return new a(bundle).build();
        }

        private static void putSelectionOverridesToBundle(Bundle bundle, SparseArray<Map<m6h, C5552g>> sparseArray) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            SparseArray sparseArray2 = new SparseArray();
            for (int i = 0; i < sparseArray.size(); i++) {
                int iKeyAt = sparseArray.keyAt(i);
                for (Map.Entry<m6h, C5552g> entry : sparseArray.valueAt(i).entrySet()) {
                    C5552g value = entry.getValue();
                    if (value != null) {
                        sparseArray2.put(arrayList2.size(), value);
                    }
                    arrayList2.add(entry.getKey());
                    arrayList.add(Integer.valueOf(iKeyAt));
                }
                bundle.putIntArray(f34786m3, rd8.toArray(arrayList));
                bundle.putParcelableArrayList(f34787n3, ih1.toBundleArrayList(arrayList2));
                bundle.putSparseParcelableArray(f34788o3, ih1.toBundleSparseArray(sparseArray2));
            }
        }

        @Override // p000.j7h
        public boolean equals(@hib Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C5550e.class != obj.getClass()) {
                return false;
            }
            C5550e c5550e = (C5550e) obj;
            return super.equals(c5550e) && this.f34795K2 == c5550e.f34795K2 && this.f34796L2 == c5550e.f34796L2 && this.f34797M2 == c5550e.f34797M2 && this.f34798N2 == c5550e.f34798N2 && this.f34799O2 == c5550e.f34799O2 && this.f34800P2 == c5550e.f34800P2 && this.f34801Q2 == c5550e.f34801Q2 && this.f34802R2 == c5550e.f34802R2 && this.f34803S2 == c5550e.f34803S2 && this.f34804T2 == c5550e.f34804T2 && this.f34805U2 == c5550e.f34805U2 && this.f34806V2 == c5550e.f34806V2 && this.f34807W2 == c5550e.f34807W2 && this.f34808X2 == c5550e.f34808X2 && areRendererDisabledFlagsEqual(this.f34810Z2, c5550e.f34810Z2) && areSelectionOverridesEqual(this.f34809Y2, c5550e.f34809Y2);
        }

        public boolean getRendererDisabled(int i) {
            return this.f34810Z2.get(i);
        }

        @hib
        @Deprecated
        public C5552g getSelectionOverride(int i, m6h m6hVar) {
            Map<m6h, C5552g> map = this.f34809Y2.get(i);
            if (map != null) {
                return map.get(m6hVar);
            }
            return null;
        }

        @Deprecated
        public boolean hasSelectionOverride(int i, m6h m6hVar) {
            Map<m6h, C5552g> map = this.f34809Y2.get(i);
            return map != null && map.containsKey(m6hVar);
        }

        @Override // p000.j7h
        public int hashCode() {
            return ((((((((((((((((((((((((((((super.hashCode() + 31) * 31) + (this.f34795K2 ? 1 : 0)) * 31) + (this.f34796L2 ? 1 : 0)) * 31) + (this.f34797M2 ? 1 : 0)) * 31) + (this.f34798N2 ? 1 : 0)) * 31) + (this.f34799O2 ? 1 : 0)) * 31) + (this.f34800P2 ? 1 : 0)) * 31) + (this.f34801Q2 ? 1 : 0)) * 31) + (this.f34802R2 ? 1 : 0)) * 31) + (this.f34803S2 ? 1 : 0)) * 31) + (this.f34804T2 ? 1 : 0)) * 31) + (this.f34805U2 ? 1 : 0)) * 31) + (this.f34806V2 ? 1 : 0)) * 31) + (this.f34807W2 ? 1 : 0)) * 31) + (this.f34808X2 ? 1 : 0);
        }

        @Override // p000.j7h, p000.gh1
        public Bundle toBundle() {
            Bundle bundle = super.toBundle();
            bundle.putBoolean(f34776c3, this.f34795K2);
            bundle.putBoolean(f34777d3, this.f34796L2);
            bundle.putBoolean(f34778e3, this.f34797M2);
            bundle.putBoolean(f34790q3, this.f34798N2);
            bundle.putBoolean(f34779f3, this.f34799O2);
            bundle.putBoolean(f34780g3, this.f34800P2);
            bundle.putBoolean(f34781h3, this.f34801Q2);
            bundle.putBoolean(f34782i3, this.f34802R2);
            bundle.putBoolean(f34791r3, this.f34803S2);
            bundle.putBoolean(f34792s3, this.f34804T2);
            bundle.putBoolean(f34783j3, this.f34805U2);
            bundle.putBoolean(f34784k3, this.f34806V2);
            bundle.putBoolean(f34785l3, this.f34807W2);
            bundle.putBoolean(f34793t3, this.f34808X2);
            putSelectionOverridesToBundle(bundle, this.f34809Y2);
            bundle.putIntArray(f34789p3, getKeysFromSparseBooleanArray(this.f34810Z2));
            return bundle;
        }

        private C5550e(a aVar) {
            super(aVar);
            this.f34795K2 = aVar.f34811A;
            this.f34796L2 = aVar.f34812B;
            this.f34797M2 = aVar.f34813C;
            this.f34798N2 = aVar.f34814D;
            this.f34799O2 = aVar.f34815E;
            this.f34800P2 = aVar.f34816F;
            this.f34801Q2 = aVar.f34817G;
            this.f34802R2 = aVar.f34818H;
            this.f34803S2 = aVar.f34819I;
            this.f34804T2 = aVar.f34820J;
            this.f34805U2 = aVar.f34821K;
            this.f34806V2 = aVar.f34822L;
            this.f34807W2 = aVar.f34823M;
            this.f34808X2 = aVar.f34824N;
            this.f34809Y2 = aVar.f34825O;
            this.f34810Z2 = aVar.f34826P;
        }

        @Override // p000.j7h
        public a buildUpon() {
            return new a();
        }

        private static boolean areSelectionOverridesEqual(Map<m6h, C5552g> map, Map<m6h, C5552g> map2) {
            if (map2.size() != map.size()) {
                return false;
            }
            for (Map.Entry<m6h, C5552g> entry : map.entrySet()) {
                m6h key = entry.getKey();
                if (!map2.containsKey(key) || !x0i.areEqual(entry.getValue(), map2.get(key))) {
                    return false;
                }
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: f24$f */
    @Deprecated
    public static final class C5551f extends j7h.C7775a {

        /* JADX INFO: renamed from: A */
        public final C5550e.a f34827A;

        @Deprecated
        public C5551f() {
            this.f34827A = new C5550e.a();
        }

        @Override // p000.j7h.C7775a
        @op1
        /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
        public C5551f mo10475A(j7h j7hVar) {
            this.f34827A.mo10475A(j7hVar);
            return this;
        }

        @op1
        @Deprecated
        public C5551f clearSelectionOverride(int i, m6h m6hVar) {
            this.f34827A.clearSelectionOverride(i, m6hVar);
            return this;
        }

        @op1
        @Deprecated
        public C5551f clearSelectionOverrides(int i) {
            this.f34827A.clearSelectionOverrides(i);
            return this;
        }

        @op1
        public C5551f setAllowAudioMixedChannelCountAdaptiveness(boolean z) {
            this.f34827A.setAllowAudioMixedChannelCountAdaptiveness(z);
            return this;
        }

        @op1
        public C5551f setAllowAudioMixedDecoderSupportAdaptiveness(boolean z) {
            this.f34827A.setAllowAudioMixedDecoderSupportAdaptiveness(z);
            return this;
        }

        @op1
        public C5551f setAllowAudioMixedMimeTypeAdaptiveness(boolean z) {
            this.f34827A.setAllowAudioMixedMimeTypeAdaptiveness(z);
            return this;
        }

        @op1
        public C5551f setAllowAudioMixedSampleRateAdaptiveness(boolean z) {
            this.f34827A.setAllowAudioMixedSampleRateAdaptiveness(z);
            return this;
        }

        @op1
        public C5551f setAllowMultipleAdaptiveSelections(boolean z) {
            this.f34827A.setAllowMultipleAdaptiveSelections(z);
            return this;
        }

        @op1
        public C5551f setAllowVideoMixedDecoderSupportAdaptiveness(boolean z) {
            this.f34827A.setAllowVideoMixedDecoderSupportAdaptiveness(z);
            return this;
        }

        @op1
        public C5551f setAllowVideoMixedMimeTypeAdaptiveness(boolean z) {
            this.f34827A.setAllowVideoMixedMimeTypeAdaptiveness(z);
            return this;
        }

        @op1
        public C5551f setAllowVideoNonSeamlessAdaptiveness(boolean z) {
            this.f34827A.setAllowVideoNonSeamlessAdaptiveness(z);
            return this;
        }

        @op1
        @Deprecated
        public C5551f setDisabledTextTrackSelectionFlags(int i) {
            this.f34827A.setDisabledTextTrackSelectionFlags(i);
            return this;
        }

        @Override // p000.j7h.C7775a
        @op1
        @Deprecated
        public /* bridge */ /* synthetic */ j7h.C7775a setDisabledTrackTypes(Set set) {
            return setDisabledTrackTypes((Set<Integer>) set);
        }

        @op1
        public C5551f setExceedAudioConstraintsIfNecessary(boolean z) {
            this.f34827A.setExceedAudioConstraintsIfNecessary(z);
            return this;
        }

        @op1
        public C5551f setExceedRendererCapabilitiesIfNecessary(boolean z) {
            this.f34827A.setExceedRendererCapabilitiesIfNecessary(z);
            return this;
        }

        @op1
        public C5551f setExceedVideoConstraintsIfNecessary(boolean z) {
            this.f34827A.setExceedVideoConstraintsIfNecessary(z);
            return this;
        }

        @op1
        public C5551f setRendererDisabled(int i, boolean z) {
            this.f34827A.setRendererDisabled(i, z);
            return this;
        }

        @op1
        @Deprecated
        public C5551f setSelectionOverride(int i, m6h m6hVar, @hib C5552g c5552g) {
            this.f34827A.setSelectionOverride(i, m6hVar, c5552g);
            return this;
        }

        @op1
        public C5551f setTunnelingEnabled(boolean z) {
            this.f34827A.setTunnelingEnabled(z);
            return this;
        }

        @Override // p000.j7h.C7775a
        @op1
        public C5551f addOverride(d7h d7hVar) {
            this.f34827A.addOverride(d7hVar);
            return this;
        }

        @Override // p000.j7h.C7775a
        public C5550e build() {
            return this.f34827A.build();
        }

        @Override // p000.j7h.C7775a
        @op1
        public C5551f clearOverride(g6h g6hVar) {
            this.f34827A.clearOverride(g6hVar);
            return this;
        }

        @Override // p000.j7h.C7775a
        @op1
        public C5551f clearOverrides() {
            this.f34827A.clearOverrides();
            return this;
        }

        @Override // p000.j7h.C7775a
        @op1
        public C5551f clearOverridesOfType(int i) {
            this.f34827A.clearOverridesOfType(i);
            return this;
        }

        @op1
        @Deprecated
        public C5551f clearSelectionOverrides() {
            this.f34827A.clearSelectionOverrides();
            return this;
        }

        @Override // p000.j7h.C7775a
        @op1
        public C5551f clearVideoSizeConstraints() {
            this.f34827A.clearVideoSizeConstraints();
            return this;
        }

        @Override // p000.j7h.C7775a
        @op1
        public C5551f clearViewportSizeConstraints() {
            this.f34827A.clearViewportSizeConstraints();
            return this;
        }

        @Override // p000.j7h.C7775a
        @op1
        @Deprecated
        public C5551f setDisabledTrackTypes(Set<Integer> set) {
            this.f34827A.setDisabledTrackTypes(set);
            return this;
        }

        @Override // p000.j7h.C7775a
        @op1
        public C5551f setForceHighestSupportedBitrate(boolean z) {
            this.f34827A.setForceHighestSupportedBitrate(z);
            return this;
        }

        @Override // p000.j7h.C7775a
        @op1
        public C5551f setForceLowestBitrate(boolean z) {
            this.f34827A.setForceLowestBitrate(z);
            return this;
        }

        @Override // p000.j7h.C7775a
        @op1
        public C5551f setIgnoredTextSelectionFlags(int i) {
            this.f34827A.setIgnoredTextSelectionFlags(i);
            return this;
        }

        @Override // p000.j7h.C7775a
        @op1
        public C5551f setMaxAudioBitrate(int i) {
            this.f34827A.setMaxAudioBitrate(i);
            return this;
        }

        @Override // p000.j7h.C7775a
        @op1
        public C5551f setMaxAudioChannelCount(int i) {
            this.f34827A.setMaxAudioChannelCount(i);
            return this;
        }

        @Override // p000.j7h.C7775a
        @op1
        public C5551f setMaxVideoBitrate(int i) {
            this.f34827A.setMaxVideoBitrate(i);
            return this;
        }

        @Override // p000.j7h.C7775a
        @op1
        public C5551f setMaxVideoFrameRate(int i) {
            this.f34827A.setMaxVideoFrameRate(i);
            return this;
        }

        @Override // p000.j7h.C7775a
        @op1
        public C5551f setMaxVideoSize(int i, int i2) {
            this.f34827A.setMaxVideoSize(i, i2);
            return this;
        }

        @Override // p000.j7h.C7775a
        @op1
        public C5551f setMaxVideoSizeSd() {
            this.f34827A.setMaxVideoSizeSd();
            return this;
        }

        @Override // p000.j7h.C7775a
        @op1
        public C5551f setMinVideoBitrate(int i) {
            this.f34827A.setMinVideoBitrate(i);
            return this;
        }

        @Override // p000.j7h.C7775a
        @op1
        public C5551f setMinVideoFrameRate(int i) {
            this.f34827A.setMinVideoFrameRate(i);
            return this;
        }

        @Override // p000.j7h.C7775a
        @op1
        public C5551f setMinVideoSize(int i, int i2) {
            this.f34827A.setMinVideoSize(i, i2);
            return this;
        }

        @Override // p000.j7h.C7775a
        @op1
        public C5551f setOverrideForType(d7h d7hVar) {
            this.f34827A.setOverrideForType(d7hVar);
            return this;
        }

        @Override // p000.j7h.C7775a
        @op1
        public C5551f setPreferredAudioLanguage(@hib String str) {
            this.f34827A.setPreferredAudioLanguage(str);
            return this;
        }

        @Override // p000.j7h.C7775a
        @op1
        public C5551f setPreferredAudioLanguages(String... strArr) {
            this.f34827A.setPreferredAudioLanguages(strArr);
            return this;
        }

        @Override // p000.j7h.C7775a
        @op1
        public C5551f setPreferredAudioMimeType(@hib String str) {
            this.f34827A.setPreferredAudioMimeType(str);
            return this;
        }

        @Override // p000.j7h.C7775a
        @op1
        public C5551f setPreferredAudioMimeTypes(String... strArr) {
            this.f34827A.setPreferredAudioMimeTypes(strArr);
            return this;
        }

        @Override // p000.j7h.C7775a
        @op1
        public C5551f setPreferredAudioRoleFlags(int i) {
            this.f34827A.setPreferredAudioRoleFlags(i);
            return this;
        }

        @Override // p000.j7h.C7775a
        @op1
        public C5551f setPreferredTextLanguage(@hib String str) {
            this.f34827A.setPreferredTextLanguage(str);
            return this;
        }

        @Override // p000.j7h.C7775a
        @op1
        public C5551f setPreferredTextLanguageAndRoleFlagsToCaptioningManagerSettings(Context context) {
            this.f34827A.setPreferredTextLanguageAndRoleFlagsToCaptioningManagerSettings(context);
            return this;
        }

        @Override // p000.j7h.C7775a
        @op1
        public C5551f setPreferredTextLanguages(String... strArr) {
            this.f34827A.setPreferredTextLanguages(strArr);
            return this;
        }

        @Override // p000.j7h.C7775a
        @op1
        public C5551f setPreferredTextRoleFlags(int i) {
            this.f34827A.setPreferredTextRoleFlags(i);
            return this;
        }

        @Override // p000.j7h.C7775a
        @op1
        public C5551f setPreferredVideoMimeType(@hib String str) {
            this.f34827A.setPreferredVideoMimeType(str);
            return this;
        }

        @Override // p000.j7h.C7775a
        @op1
        public C5551f setPreferredVideoMimeTypes(String... strArr) {
            this.f34827A.setPreferredVideoMimeTypes(strArr);
            return this;
        }

        @Override // p000.j7h.C7775a
        @op1
        public C5551f setPreferredVideoRoleFlags(int i) {
            this.f34827A.setPreferredVideoRoleFlags(i);
            return this;
        }

        @Override // p000.j7h.C7775a
        @op1
        public C5551f setSelectUndeterminedTextLanguage(boolean z) {
            this.f34827A.setSelectUndeterminedTextLanguage(z);
            return this;
        }

        @Override // p000.j7h.C7775a
        @op1
        public C5551f setTrackTypeDisabled(int i, boolean z) {
            this.f34827A.setTrackTypeDisabled(i, z);
            return this;
        }

        @Override // p000.j7h.C7775a
        @op1
        public C5551f setViewportSize(int i, int i2, boolean z) {
            this.f34827A.setViewportSize(i, i2, z);
            return this;
        }

        @Override // p000.j7h.C7775a
        @op1
        public C5551f setViewportSizeToPhysicalDisplaySize(Context context, boolean z) {
            this.f34827A.setViewportSizeToPhysicalDisplaySize(context, z);
            return this;
        }

        public C5551f(Context context) {
            this.f34827A = new C5550e.a(context);
        }
    }

    /* JADX INFO: renamed from: f24$g */
    public static final class C5552g implements gh1 {

        /* JADX INFO: renamed from: a */
        public final int f34832a;

        /* JADX INFO: renamed from: b */
        public final int[] f34833b;

        /* JADX INFO: renamed from: c */
        public final int f34834c;

        /* JADX INFO: renamed from: d */
        public final int f34835d;

        /* JADX INFO: renamed from: e */
        public static final String f34829e = x0i.intToStringMaxRadix(0);

        /* JADX INFO: renamed from: f */
        public static final String f34830f = x0i.intToStringMaxRadix(1);

        /* JADX INFO: renamed from: m */
        public static final String f34831m = x0i.intToStringMaxRadix(2);

        /* JADX INFO: renamed from: C */
        public static final gh1.InterfaceC6311a<C5552g> f34828C = new gh1.InterfaceC6311a() { // from class: w14
            @Override // p000.gh1.InterfaceC6311a
            public final gh1 fromBundle(Bundle bundle) {
                return f24.C5552g.lambda$static$0(bundle);
            }
        };

        public C5552g(int i, int... iArr) {
            this(i, iArr, 0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ C5552g lambda$static$0(Bundle bundle) {
            int i = bundle.getInt(f34829e, -1);
            int[] intArray = bundle.getIntArray(f34830f);
            int i2 = bundle.getInt(f34831m, -1);
            u80.checkArgument(i >= 0 && i2 >= 0);
            u80.checkNotNull(intArray);
            return new C5552g(i, intArray, i2);
        }

        public boolean containsTrack(int i) {
            for (int i2 : this.f34833b) {
                if (i2 == i) {
                    return true;
                }
            }
            return false;
        }

        public boolean equals(@hib Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C5552g.class != obj.getClass()) {
                return false;
            }
            C5552g c5552g = (C5552g) obj;
            return this.f34832a == c5552g.f34832a && Arrays.equals(this.f34833b, c5552g.f34833b) && this.f34835d == c5552g.f34835d;
        }

        public int hashCode() {
            return (((this.f34832a * 31) + Arrays.hashCode(this.f34833b)) * 31) + this.f34835d;
        }

        @Override // p000.gh1
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putInt(f34829e, this.f34832a);
            bundle.putIntArray(f34830f, this.f34833b);
            bundle.putInt(f34831m, this.f34835d);
            return bundle;
        }

        public C5552g(int i, int[] iArr, int i2) {
            this.f34832a = i;
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
            this.f34833b = iArrCopyOf;
            this.f34834c = iArr.length;
            this.f34835d = i2;
            Arrays.sort(iArrCopyOf);
        }
    }

    /* JADX INFO: renamed from: f24$h */
    public static final class C5553h extends AbstractC5554i<C5553h> implements Comparable<C5553h> {

        /* JADX INFO: renamed from: C */
        public final boolean f34836C;

        /* JADX INFO: renamed from: F */
        public final int f34837F;

        /* JADX INFO: renamed from: H */
        public final int f34838H;

        /* JADX INFO: renamed from: L */
        public final int f34839L;

        /* JADX INFO: renamed from: M */
        public final int f34840M;

        /* JADX INFO: renamed from: N */
        public final boolean f34841N;

        /* JADX INFO: renamed from: e */
        public final int f34842e;

        /* JADX INFO: renamed from: f */
        public final boolean f34843f;

        /* JADX INFO: renamed from: m */
        public final boolean f34844m;

        public C5553h(int i, g6h g6hVar, int i2, C5550e c5550e, int i3, @hib String str) {
            int iM10429q;
            super(i, g6hVar, i2);
            int i4 = 0;
            this.f34843f = f24.m10430r(i3, false);
            int i5 = this.f34848d.f55004d & (~c5550e.f49763a2);
            this.f34844m = (i5 & 1) != 0;
            this.f34836C = (i5 & 2) != 0;
            kx7<String> kx7VarM15111of = c5550e.f49757V1.isEmpty() ? kx7.m15111of("") : c5550e.f49757V1;
            int i6 = 0;
            while (true) {
                if (i6 >= kx7VarM15111of.size()) {
                    i6 = Integer.MAX_VALUE;
                    iM10429q = 0;
                    break;
                } else {
                    iM10429q = f24.m10429q(this.f34848d, kx7VarM15111of.get(i6), c5550e.f49765b2);
                    if (iM10429q > 0) {
                        break;
                    } else {
                        i6++;
                    }
                }
            }
            this.f34837F = i6;
            this.f34838H = iM10429q;
            int roleFlagMatchScore = f24.getRoleFlagMatchScore(this.f34848d.f55006e, c5550e.f49761Z1);
            this.f34839L = roleFlagMatchScore;
            this.f34841N = (this.f34848d.f55006e & 1088) != 0;
            int iM10429q2 = f24.m10429q(this.f34848d, str, f24.m10431s(str) == null);
            this.f34840M = iM10429q2;
            boolean z = iM10429q > 0 || (c5550e.f49757V1.isEmpty() && roleFlagMatchScore > 0) || this.f34844m || (this.f34836C && iM10429q2 > 0);
            if (f24.m10430r(i3, c5550e.f34805U2) && z) {
                i4 = 1;
            }
            this.f34842e = i4;
        }

        public static int compareSelections(List<C5553h> list, List<C5553h> list2) {
            return list.get(0).compareTo(list2.get(0));
        }

        public static kx7<C5553h> createForTrackGroup(int i, g6h g6hVar, C5550e c5550e, int[] iArr, @hib String str) {
            kx7.C8541a c8541aBuilder = kx7.builder();
            for (int i2 = 0; i2 < g6hVar.f38907a; i2++) {
                c8541aBuilder.add(new C5553h(i, g6hVar, i2, c5550e, iArr[i2], str));
            }
            return c8541aBuilder.build();
        }

        @Override // p000.f24.AbstractC5554i
        public int getSelectionEligibility() {
            return this.f34842e;
        }

        @Override // java.lang.Comparable
        public int compareTo(C5553h c5553h) {
            bd2 bd2VarCompare = bd2.start().compareFalseFirst(this.f34843f, c5553h.f34843f).compare(Integer.valueOf(this.f34837F), Integer.valueOf(c5553h.f34837F), s7c.natural().reverse()).compare(this.f34838H, c5553h.f34838H).compare(this.f34839L, c5553h.f34839L).compareFalseFirst(this.f34844m, c5553h.f34844m).compare(Boolean.valueOf(this.f34836C), Boolean.valueOf(c5553h.f34836C), this.f34838H == 0 ? s7c.natural() : s7c.natural().reverse()).compare(this.f34840M, c5553h.f34840M);
            if (this.f34839L == 0) {
                bd2VarCompare = bd2VarCompare.compareTrueFirst(this.f34841N, c5553h.f34841N);
            }
            return bd2VarCompare.result();
        }

        @Override // p000.f24.AbstractC5554i
        public boolean isCompatibleForAdaptationWith(C5553h c5553h) {
            return false;
        }
    }

    /* JADX INFO: renamed from: f24$i */
    public static abstract class AbstractC5554i<T extends AbstractC5554i<T>> {

        /* JADX INFO: renamed from: a */
        public final int f34845a;

        /* JADX INFO: renamed from: b */
        public final g6h f34846b;

        /* JADX INFO: renamed from: c */
        public final int f34847c;

        /* JADX INFO: renamed from: d */
        public final kq6 f34848d;

        /* JADX INFO: renamed from: f24$i$a */
        public interface a<T extends AbstractC5554i<T>> {
            List<T> create(int i, g6h g6hVar, int[] iArr);
        }

        public AbstractC5554i(int i, g6h g6hVar, int i2) {
            this.f34845a = i;
            this.f34846b = g6hVar;
            this.f34847c = i2;
            this.f34848d = g6hVar.getFormat(i2);
        }

        public abstract int getSelectionEligibility();

        public abstract boolean isCompatibleForAdaptationWith(T t);
    }

    /* JADX INFO: renamed from: f24$j */
    public static final class C5555j extends AbstractC5554i<C5555j> {

        /* JADX INFO: renamed from: C */
        public final boolean f34849C;

        /* JADX INFO: renamed from: F */
        public final int f34850F;

        /* JADX INFO: renamed from: H */
        public final int f34851H;

        /* JADX INFO: renamed from: L */
        public final int f34852L;

        /* JADX INFO: renamed from: M */
        public final int f34853M;

        /* JADX INFO: renamed from: M1 */
        public final int f34854M1;

        /* JADX INFO: renamed from: N */
        public final boolean f34855N;

        /* JADX INFO: renamed from: Q */
        public final boolean f34856Q;

        /* JADX INFO: renamed from: X */
        public final int f34857X;

        /* JADX INFO: renamed from: Y */
        public final boolean f34858Y;

        /* JADX INFO: renamed from: Z */
        public final boolean f34859Z;

        /* JADX INFO: renamed from: e */
        public final boolean f34860e;

        /* JADX INFO: renamed from: f */
        public final C5550e f34861f;

        /* JADX INFO: renamed from: m */
        public final boolean f34862m;

        /* JADX WARN: Removed duplicated region for block: B:31:0x004b  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x0079  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public C5555j(int r5, p000.g6h r6, int r7, p000.f24.C5550e r8, int r9, int r10, boolean r11) {
            /*
                Method dump skipped, instruction units count: 246
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.f24.C5555j.<init>(int, g6h, int, f24$e, int, int, boolean):void");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static int compareNonQualityPreferences(C5555j c5555j, C5555j c5555j2) {
            bd2 bd2VarCompareFalseFirst = bd2.start().compareFalseFirst(c5555j.f34849C, c5555j2.f34849C).compare(c5555j.f34853M, c5555j2.f34853M).compareFalseFirst(c5555j.f34855N, c5555j2.f34855N).compareFalseFirst(c5555j.f34860e, c5555j2.f34860e).compareFalseFirst(c5555j.f34862m, c5555j2.f34862m).compare(Integer.valueOf(c5555j.f34852L), Integer.valueOf(c5555j2.f34852L), s7c.natural().reverse()).compareFalseFirst(c5555j.f34858Y, c5555j2.f34858Y).compareFalseFirst(c5555j.f34859Z, c5555j2.f34859Z);
            if (c5555j.f34858Y && c5555j.f34859Z) {
                bd2VarCompareFalseFirst = bd2VarCompareFalseFirst.compare(c5555j.f34854M1, c5555j2.f34854M1);
            }
            return bd2VarCompareFalseFirst.result();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static int compareQualityPreferences(C5555j c5555j, C5555j c5555j2) {
            s7c s7cVarReverse = (c5555j.f34860e && c5555j.f34849C) ? f24.f34739q : f24.f34739q.reverse();
            return bd2.start().compare(Integer.valueOf(c5555j.f34850F), Integer.valueOf(c5555j2.f34850F), c5555j.f34861f.f49767c2 ? f24.f34739q.reverse() : f24.f34740r).compare(Integer.valueOf(c5555j.f34851H), Integer.valueOf(c5555j2.f34851H), s7cVarReverse).compare(Integer.valueOf(c5555j.f34850F), Integer.valueOf(c5555j2.f34850F), s7cVarReverse).result();
        }

        public static int compareSelections(List<C5555j> list, List<C5555j> list2) {
            return bd2.start().compare((C5555j) Collections.max(list, new Comparator() { // from class: g24
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return f24.C5555j.compareNonQualityPreferences((f24.C5555j) obj, (f24.C5555j) obj2);
                }
            }), (C5555j) Collections.max(list2, new Comparator() { // from class: g24
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return f24.C5555j.compareNonQualityPreferences((f24.C5555j) obj, (f24.C5555j) obj2);
                }
            }), new Comparator() { // from class: g24
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return f24.C5555j.compareNonQualityPreferences((f24.C5555j) obj, (f24.C5555j) obj2);
                }
            }).compare(list.size(), list2.size()).compare((C5555j) Collections.max(list, new Comparator() { // from class: i24
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return f24.C5555j.compareQualityPreferences((f24.C5555j) obj, (f24.C5555j) obj2);
                }
            }), (C5555j) Collections.max(list2, new Comparator() { // from class: i24
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return f24.C5555j.compareQualityPreferences((f24.C5555j) obj, (f24.C5555j) obj2);
                }
            }), new Comparator() { // from class: i24
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return f24.C5555j.compareQualityPreferences((f24.C5555j) obj, (f24.C5555j) obj2);
                }
            }).result();
        }

        public static kx7<C5555j> createForTrackGroup(int i, g6h g6hVar, C5550e c5550e, int[] iArr, int i2) {
            int maxVideoPixelsToRetainForViewport = f24.getMaxVideoPixelsToRetainForViewport(g6hVar, c5550e.f49750F, c5550e.f49751H, c5550e.f49752L);
            kx7.C8541a c8541aBuilder = kx7.builder();
            for (int i3 = 0; i3 < g6hVar.f38907a; i3++) {
                int pixelCount = g6hVar.getFormat(i3).getPixelCount();
                c8541aBuilder.add(new C5555j(i, g6hVar, i3, c5550e, iArr[i3], i2, maxVideoPixelsToRetainForViewport == Integer.MAX_VALUE || (pixelCount != -1 && pixelCount <= maxVideoPixelsToRetainForViewport)));
            }
            return c8541aBuilder.build();
        }

        private int evaluateSelectionEligibility(int i, int i2) {
            if ((this.f34848d.f55006e & 16384) != 0 || !f24.m10430r(i, this.f34861f.f34805U2)) {
                return 0;
            }
            if (!this.f34860e && !this.f34861f.f34795K2) {
                return 0;
            }
            if (f24.m10430r(i, false) && this.f34862m && this.f34860e && this.f34848d.f54985C != -1) {
                C5550e c5550e = this.f34861f;
                if (!c5550e.f49769d2 && !c5550e.f49767c2 && (i & i2) != 0) {
                    return 2;
                }
            }
            return 1;
        }

        @Override // p000.f24.AbstractC5554i
        public int getSelectionEligibility() {
            return this.f34857X;
        }

        @Override // p000.f24.AbstractC5554i
        public boolean isCompatibleForAdaptationWith(C5555j c5555j) {
            return (this.f34856Q || x0i.areEqual(this.f34848d.f54989M, c5555j.f34848d.f54989M)) && (this.f34861f.f34798N2 || (this.f34858Y == c5555j.f34858Y && this.f34859Z == c5555j.f34859Z));
        }
    }

    public f24(Context context) {
        this(context, new C11477qh.b());
    }

    private static void applyLegacyRendererOverrides(st9.C12776a c12776a, C5550e c5550e, pf5.C10940a[] c10940aArr) {
        int rendererCount = c12776a.getRendererCount();
        for (int i = 0; i < rendererCount; i++) {
            m6h trackGroups = c12776a.getTrackGroups(i);
            if (c5550e.hasSelectionOverride(i, trackGroups)) {
                C5552g selectionOverride = c5550e.getSelectionOverride(i, trackGroups);
                c10940aArr[i] = (selectionOverride == null || selectionOverride.f34833b.length == 0) ? null : new pf5.C10940a(trackGroups.get(selectionOverride.f34832a), selectionOverride.f34833b, selectionOverride.f34835d);
            }
        }
    }

    private static void applyTrackSelectionOverrides(st9.C12776a c12776a, j7h j7hVar, pf5.C10940a[] c10940aArr) {
        int rendererCount = c12776a.getRendererCount();
        HashMap map = new HashMap();
        for (int i = 0; i < rendererCount; i++) {
            collectTrackSelectionOverrides(c12776a.getTrackGroups(i), j7hVar, map);
        }
        collectTrackSelectionOverrides(c12776a.getUnmappedTrackGroups(), j7hVar, map);
        for (int i2 = 0; i2 < rendererCount; i2++) {
            d7h d7hVar = (d7h) map.get(Integer.valueOf(c12776a.getRendererType(i2)));
            if (d7hVar != null) {
                c10940aArr[i2] = (d7hVar.f28721b.isEmpty() || c12776a.getTrackGroups(i2).indexOf(d7hVar.f28720a) == -1) ? null : new pf5.C10940a(d7hVar.f28720a, rd8.toArray(d7hVar.f28721b));
            }
        }
    }

    private static void collectTrackSelectionOverrides(m6h m6hVar, j7h j7hVar, Map<Integer, d7h> map) {
        d7h d7hVar;
        for (int i = 0; i < m6hVar.f60034a; i++) {
            d7h d7hVar2 = j7hVar.f49771e2.get(m6hVar.get(i));
            if (d7hVar2 != null && ((d7hVar = map.get(Integer.valueOf(d7hVar2.getType()))) == null || (d7hVar.f28721b.isEmpty() && !d7hVar2.f28721b.isEmpty()))) {
                map.put(Integer.valueOf(d7hVar2.getType()), d7hVar2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getMaxVideoPixelsToRetainForViewport(g6h g6hVar, int i, int i2, boolean z) {
        int i3;
        int i4 = Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE && i2 != Integer.MAX_VALUE) {
            for (int i5 = 0; i5 < g6hVar.f38907a; i5++) {
                kq6 format = g6hVar.getFormat(i5);
                int i6 = format.f54996Z;
                if (i6 > 0 && (i3 = format.f54990M1) > 0) {
                    Point maxVideoSizeInViewport = getMaxVideoSizeInViewport(z, i, i2, i6, i3);
                    int i7 = format.f54996Z;
                    int i8 = format.f54990M1;
                    int i9 = i7 * i8;
                    if (i7 >= ((int) (maxVideoSizeInViewport.x * 0.98f)) && i8 >= ((int) (maxVideoSizeInViewport.y * 0.98f)) && i9 < i4) {
                        i4 = i9;
                    }
                }
            }
        }
        return i4;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x000f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static android.graphics.Point getMaxVideoSizeInViewport(boolean r3, int r4, int r5, int r6, int r7) {
        /*
            if (r3 == 0) goto Lf
            r3 = 0
            r0 = 1
            if (r6 <= r7) goto L8
            r1 = r0
            goto L9
        L8:
            r1 = r3
        L9:
            if (r4 <= r5) goto Lc
            r3 = r0
        Lc:
            if (r1 == r3) goto Lf
            goto L12
        Lf:
            r2 = r5
            r5 = r4
            r4 = r2
        L12:
            int r3 = r6 * r4
            int r0 = r7 * r5
            if (r3 < r0) goto L22
            android.graphics.Point r3 = new android.graphics.Point
            int r4 = p000.x0i.ceilDivide(r0, r6)
            r3.<init>(r5, r4)
            return r3
        L22:
            android.graphics.Point r5 = new android.graphics.Point
            int r3 = p000.x0i.ceilDivide(r3, r7)
            r5.<init>(r3, r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.f24.getMaxVideoSizeInViewport(boolean, int, int, int, int):android.graphics.Point");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getRoleFlagMatchScore(int i, int i2) {
        if (i == 0 || i != i2) {
            return Integer.bitCount(i & i2);
        }
        return Integer.MAX_VALUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getVideoCodecPreferenceScore(@hib String str) {
        if (str == null) {
            return 0;
        }
        switch (str) {
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isAudioFormatWithinAudioChannelCountConstraints(kq6 kq6Var) {
        boolean z;
        C5546a c5546a;
        C5546a c5546a2;
        synchronized (this.f34741d) {
            try {
                if (this.f34745h.f34804T2 && !this.f34744g && kq6Var.f55007e2 > 2 && (!isDolbyAudio(kq6Var) || (x0i.f95978a >= 32 && (c5546a2 = this.f34746i) != null && c5546a2.isSpatializationSupported()))) {
                    z = x0i.f95978a >= 32 && (c5546a = this.f34746i) != null && c5546a.isSpatializationSupported() && this.f34746i.isAvailable() && this.f34746i.isEnabled() && this.f34746i.canBeSpatialized(this.f34747j, kq6Var);
                }
            } finally {
            }
        }
        return z;
    }

    private static boolean isDolbyAudio(kq6 kq6Var) {
        String str = kq6Var.f54989M;
        if (str == null) {
            return false;
        }
        str.hashCode();
        switch (str) {
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List lambda$selectAudioTrack$3(C5550e c5550e, boolean z, int i, g6h g6hVar, int[] iArr) {
        return C5548c.createForTrackGroup(i, g6hVar, c5550e, iArr, z, new l8d() { // from class: f14
            @Override // p000.l8d
            public final boolean apply(Object obj) {
                return this.f34653a.isAudioFormatWithinAudioChannelCountConstraints((kq6) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List lambda$selectTextTrack$4(C5550e c5550e, String str, int i, g6h g6hVar, int[] iArr) {
        return C5553h.createForTrackGroup(i, g6hVar, c5550e, iArr, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List lambda$selectVideoTrack$2(C5550e c5550e, int[] iArr, int i, g6h g6hVar, int[] iArr2) {
        return C5555j.createForTrackGroup(i, g6hVar, c5550e, iArr2, iArr[i]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$static$0(Integer num, Integer num2) {
        if (num.intValue() == -1) {
            return num2.intValue() == -1 ? 0 : -1;
        }
        if (num2.intValue() == -1) {
            return 1;
        }
        return num.intValue() - num2.intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$static$1(Integer num, Integer num2) {
        return 0;
    }

    private static void maybeConfigureRenderersForTunneling(st9.C12776a c12776a, int[][][] iArr, r1e[] r1eVarArr, pf5[] pf5VarArr) {
        boolean z;
        boolean z2 = false;
        int i = -1;
        int i2 = -1;
        for (int i3 = 0; i3 < c12776a.getRendererCount(); i3++) {
            int rendererType = c12776a.getRendererType(i3);
            pf5 pf5Var = pf5VarArr[i3];
            if ((rendererType == 1 || rendererType == 2) && pf5Var != null && rendererSupportsTunneling(iArr[i3], c12776a.getTrackGroups(i3), pf5Var)) {
                if (rendererType == 1) {
                    if (i2 != -1) {
                        z = false;
                        break;
                    }
                    i2 = i3;
                } else {
                    if (i != -1) {
                        z = false;
                        break;
                    }
                    i = i3;
                }
            }
        }
        z = true;
        if (i2 != -1 && i != -1) {
            z2 = true;
        }
        if (z && z2) {
            r1e r1eVar = new r1e(true);
            r1eVarArr[i2] = r1eVar;
            r1eVarArr[i] = r1eVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void maybeInvalidateForAudioChannelCountConstraints() {
        boolean z;
        C5546a c5546a;
        synchronized (this.f34741d) {
            try {
                z = this.f34745h.f34804T2 && !this.f34744g && x0i.f95978a >= 32 && (c5546a = this.f34746i) != null && c5546a.isSpatializationSupported();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            m19316b();
        }
    }

    private void maybeInvalidateForRendererCapabilitiesChange(n1e n1eVar) {
        boolean z;
        synchronized (this.f34741d) {
            z = this.f34745h.f34808X2;
        }
        if (z) {
            m19317c(n1eVar);
        }
    }

    /* JADX INFO: renamed from: q */
    public static int m10429q(kq6 kq6Var, @hib String str, boolean z) {
        if (!TextUtils.isEmpty(str) && str.equals(kq6Var.f55002c)) {
            return 4;
        }
        String strM10431s = m10431s(str);
        String strM10431s2 = m10431s(kq6Var.f55002c);
        if (strM10431s2 == null || strM10431s == null) {
            return (z && strM10431s2 == null) ? 1 : 0;
        }
        if (strM10431s2.startsWith(strM10431s) || strM10431s.startsWith(strM10431s2)) {
            return 3;
        }
        return x0i.splitAtFirst(strM10431s2, "-")[0].equals(x0i.splitAtFirst(strM10431s, "-")[0]) ? 2 : 0;
    }

    /* JADX INFO: renamed from: r */
    public static boolean m10430r(int i, boolean z) {
        int formatSupport = p1e.getFormatSupport(i);
        return formatSupport == 4 || (z && formatSupport == 3);
    }

    private static boolean rendererSupportsTunneling(int[][] iArr, m6h m6hVar, pf5 pf5Var) {
        if (pf5Var == null) {
            return false;
        }
        int iIndexOf = m6hVar.indexOf(pf5Var.getTrackGroup());
        for (int i = 0; i < pf5Var.length(); i++) {
            if (p1e.getTunnelingSupport(iArr[iIndexOf][pf5Var.getIndexInTrackGroup(i)]) != 32) {
                return false;
            }
        }
        return true;
    }

    @hib
    /* JADX INFO: renamed from: s */
    public static String m10431s(@hib String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    @hib
    private <T extends AbstractC5554i<T>> Pair<pf5.C10940a, Integer> selectTracksForType(int i, st9.C12776a c12776a, int[][][] iArr, AbstractC5554i.a<T> aVar, Comparator<List<T>> comparator) {
        int i2;
        RandomAccess randomAccessM15111of;
        st9.C12776a c12776a2 = c12776a;
        ArrayList arrayList = new ArrayList();
        int rendererCount = c12776a.getRendererCount();
        int i3 = 0;
        while (i3 < rendererCount) {
            if (i == c12776a2.getRendererType(i3)) {
                m6h trackGroups = c12776a2.getTrackGroups(i3);
                for (int i4 = 0; i4 < trackGroups.f60034a; i4++) {
                    g6h g6hVar = trackGroups.get(i4);
                    List<T> listCreate = aVar.create(i3, g6hVar, iArr[i3][i4]);
                    boolean[] zArr = new boolean[g6hVar.f38907a];
                    int i5 = 0;
                    while (i5 < g6hVar.f38907a) {
                        T t = listCreate.get(i5);
                        int selectionEligibility = t.getSelectionEligibility();
                        if (zArr[i5] || selectionEligibility == 0) {
                            i2 = rendererCount;
                        } else {
                            if (selectionEligibility == 1) {
                                randomAccessM15111of = kx7.m15111of(t);
                                i2 = rendererCount;
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(t);
                                int i6 = i5 + 1;
                                while (i6 < g6hVar.f38907a) {
                                    T t2 = listCreate.get(i6);
                                    int i7 = rendererCount;
                                    if (t2.getSelectionEligibility() == 2 && t.isCompatibleForAdaptationWith(t2)) {
                                        arrayList2.add(t2);
                                        zArr[i6] = true;
                                    }
                                    i6++;
                                    rendererCount = i7;
                                }
                                i2 = rendererCount;
                                randomAccessM15111of = arrayList2;
                            }
                            arrayList.add(randomAccessM15111of);
                        }
                        i5++;
                        rendererCount = i2;
                    }
                }
            }
            i3++;
            c12776a2 = c12776a;
            rendererCount = rendererCount;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i8 = 0; i8 < list.size(); i8++) {
            iArr2[i8] = ((AbstractC5554i) list.get(i8)).f34847c;
        }
        AbstractC5554i abstractC5554i = (AbstractC5554i) list.get(0);
        return Pair.create(new pf5.C10940a(abstractC5554i.f34846b, iArr2), Integer.valueOf(abstractC5554i.f34845a));
    }

    private void setParametersInternal(C5550e c5550e) {
        boolean zEquals;
        u80.checkNotNull(c5550e);
        synchronized (this.f34741d) {
            zEquals = this.f34745h.equals(c5550e);
            this.f34745h = c5550e;
        }
        if (zEquals) {
            return;
        }
        if (c5550e.f34804T2 && this.f34742e == null) {
            yh9.m25919w("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
        m19316b();
    }

    public C5550e.a buildUponParameters() {
        return getParameters().buildUpon();
    }

    @Override // p000.st9
    /* JADX INFO: renamed from: d */
    public final Pair<r1e[], pf5[]> mo10432d(st9.C12776a c12776a, int[][][] iArr, int[] iArr2, vna.C14175b c14175b, t1h t1hVar) throws ba5 {
        C5550e c5550e;
        C5546a c5546a;
        synchronized (this.f34741d) {
            try {
                c5550e = this.f34745h;
                if (c5550e.f34804T2 && x0i.f95978a >= 32 && (c5546a = this.f34746i) != null) {
                    c5546a.ensureInitialized(this, (Looper) u80.checkStateNotNull(Looper.myLooper()));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        int rendererCount = c12776a.getRendererCount();
        pf5.C10940a[] c10940aArrM10433t = m10433t(c12776a, iArr, iArr2, c5550e);
        applyTrackSelectionOverrides(c12776a, c5550e, c10940aArrM10433t);
        applyLegacyRendererOverrides(c12776a, c5550e, c10940aArrM10433t);
        for (int i = 0; i < rendererCount; i++) {
            int rendererType = c12776a.getRendererType(i);
            if (c5550e.getRendererDisabled(i) || c5550e.f49773f2.contains(Integer.valueOf(rendererType))) {
                c10940aArrM10433t[i] = null;
            }
        }
        pf5[] pf5VarArrCreateTrackSelections = this.f34743f.createTrackSelections(c10940aArrM10433t, m19315a(), c14175b, t1hVar);
        r1e[] r1eVarArr = new r1e[rendererCount];
        for (int i2 = 0; i2 < rendererCount; i2++) {
            r1eVarArr[i2] = (c5550e.getRendererDisabled(i2) || c5550e.f49773f2.contains(Integer.valueOf(c12776a.getRendererType(i2))) || (c12776a.getRendererType(i2) != -2 && pf5VarArrCreateTrackSelections[i2] == null)) ? null : r1e.f76782b;
        }
        if (c5550e.f34806V2) {
            maybeConfigureRenderersForTunneling(c12776a, iArr, r1eVarArr, pf5VarArrCreateTrackSelections);
        }
        return Pair.create(r1eVarArr, pf5VarArrCreateTrackSelections);
    }

    @Override // p000.p7h
    @hib
    public p1e.InterfaceC10758f getRendererCapabilitiesListener() {
        return this;
    }

    @Override // p000.p7h
    public boolean isSetParametersSupported() {
        return true;
    }

    @Override // p000.p1e.InterfaceC10758f
    public void onRendererCapabilitiesChanged(n1e n1eVar) {
        maybeInvalidateForRendererCapabilitiesChange(n1eVar);
    }

    @Override // p000.p7h
    public void release() {
        C5546a c5546a;
        synchronized (this.f34741d) {
            try {
                if (x0i.f95978a >= 32 && (c5546a = this.f34746i) != null) {
                    c5546a.release();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        super.release();
    }

    @Override // p000.p7h
    public void setAudioAttributes(yc0 yc0Var) {
        boolean zEquals;
        synchronized (this.f34741d) {
            zEquals = this.f34747j.equals(yc0Var);
            this.f34747j = yc0Var;
        }
        if (zEquals) {
            return;
        }
        maybeInvalidateForAudioChannelCountConstraints();
    }

    @Override // p000.p7h
    public void setParameters(j7h j7hVar) {
        if (j7hVar instanceof C5550e) {
            setParametersInternal((C5550e) j7hVar);
        }
        setParametersInternal(new C5550e.a().mo10475A(j7hVar).build());
    }

    /* JADX INFO: renamed from: t */
    public pf5.C10940a[] m10433t(st9.C12776a c12776a, int[][][] iArr, int[] iArr2, C5550e c5550e) throws ba5 {
        String str;
        int rendererCount = c12776a.getRendererCount();
        pf5.C10940a[] c10940aArr = new pf5.C10940a[rendererCount];
        Pair<pf5.C10940a, Integer> pairM10437x = m10437x(c12776a, iArr, iArr2, c5550e);
        if (pairM10437x != null) {
            c10940aArr[((Integer) pairM10437x.second).intValue()] = (pf5.C10940a) pairM10437x.first;
        }
        Pair<pf5.C10940a, Integer> pairM10434u = m10434u(c12776a, iArr, iArr2, c5550e);
        if (pairM10434u != null) {
            c10940aArr[((Integer) pairM10434u.second).intValue()] = (pf5.C10940a) pairM10434u.first;
        }
        if (pairM10434u == null) {
            str = null;
        } else {
            Object obj = pairM10434u.first;
            str = ((pf5.C10940a) obj).f70594a.getFormat(((pf5.C10940a) obj).f70595b[0]).f55002c;
        }
        Pair<pf5.C10940a, Integer> pairM10436w = m10436w(c12776a, iArr, c5550e, str);
        if (pairM10436w != null) {
            c10940aArr[((Integer) pairM10436w.second).intValue()] = (pf5.C10940a) pairM10436w.first;
        }
        for (int i = 0; i < rendererCount; i++) {
            int rendererType = c12776a.getRendererType(i);
            if (rendererType != 2 && rendererType != 1 && rendererType != 3) {
                c10940aArr[i] = m10435v(rendererType, c12776a.getTrackGroups(i), iArr[i], c5550e);
            }
        }
        return c10940aArr;
    }

    @hib
    /* JADX INFO: renamed from: u */
    public Pair<pf5.C10940a, Integer> m10434u(st9.C12776a c12776a, int[][][] iArr, int[] iArr2, final C5550e c5550e) throws ba5 {
        final boolean z = false;
        int i = 0;
        while (true) {
            if (i < c12776a.getRendererCount()) {
                if (2 == c12776a.getRendererType(i) && c12776a.getTrackGroups(i).f60034a > 0) {
                    z = true;
                    break;
                }
                i++;
            } else {
                break;
            }
        }
        return selectTracksForType(1, c12776a, iArr, new AbstractC5554i.a() { // from class: h14
            @Override // p000.f24.AbstractC5554i.a
            public final List create(int i2, g6h g6hVar, int[] iArr3) {
                return this.f41982a.lambda$selectAudioTrack$3(c5550e, z, i2, g6hVar, iArr3);
            }
        }, new Comparator() { // from class: j14
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return f24.C5548c.compareSelections((List) obj, (List) obj2);
            }
        });
    }

    @hib
    /* JADX INFO: renamed from: v */
    public pf5.C10940a m10435v(int i, m6h m6hVar, int[][] iArr, C5550e c5550e) throws ba5 {
        g6h g6hVar = null;
        C5549d c5549d = null;
        int i2 = 0;
        for (int i3 = 0; i3 < m6hVar.f60034a; i3++) {
            g6h g6hVar2 = m6hVar.get(i3);
            int[] iArr2 = iArr[i3];
            for (int i4 = 0; i4 < g6hVar2.f38907a; i4++) {
                if (m10430r(iArr2[i4], c5550e.f34805U2)) {
                    C5549d c5549d2 = new C5549d(g6hVar2.getFormat(i4), iArr2[i4]);
                    if (c5549d == null || c5549d2.compareTo(c5549d) > 0) {
                        g6hVar = g6hVar2;
                        i2 = i4;
                        c5549d = c5549d2;
                    }
                }
            }
        }
        if (g6hVar == null) {
            return null;
        }
        return new pf5.C10940a(g6hVar, i2);
    }

    @hib
    /* JADX INFO: renamed from: w */
    public Pair<pf5.C10940a, Integer> m10436w(st9.C12776a c12776a, int[][][] iArr, final C5550e c5550e, @hib final String str) throws ba5 {
        return selectTracksForType(3, c12776a, iArr, new AbstractC5554i.a() { // from class: l14
            @Override // p000.f24.AbstractC5554i.a
            public final List create(int i, g6h g6hVar, int[] iArr2) {
                return f24.lambda$selectTextTrack$4(c5550e, str, i, g6hVar, iArr2);
            }
        }, new Comparator() { // from class: n14
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return f24.C5553h.compareSelections((List) obj, (List) obj2);
            }
        });
    }

    @hib
    /* JADX INFO: renamed from: x */
    public Pair<pf5.C10940a, Integer> m10437x(st9.C12776a c12776a, int[][][] iArr, final int[] iArr2, final C5550e c5550e) throws ba5 {
        return selectTracksForType(2, c12776a, iArr, new AbstractC5554i.a() { // from class: b14
            @Override // p000.f24.AbstractC5554i.a
            public final List create(int i, g6h g6hVar, int[] iArr3) {
                return f24.lambda$selectVideoTrack$2(c5550e, iArr2, i, g6hVar, iArr3);
            }
        }, new Comparator() { // from class: d14
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return f24.C5555j.compareSelections((List) obj, (List) obj2);
            }
        });
    }

    public f24(Context context, pf5.InterfaceC10941b interfaceC10941b) {
        this(context, C5550e.getDefaults(context), interfaceC10941b);
    }

    @Override // p000.p7h
    public C5550e getParameters() {
        C5550e c5550e;
        synchronized (this.f34741d) {
            c5550e = this.f34745h;
        }
        return c5550e;
    }

    public f24(Context context, j7h j7hVar) {
        this(context, j7hVar, new C11477qh.b());
    }

    @Deprecated
    public f24(j7h j7hVar, pf5.InterfaceC10941b interfaceC10941b) {
        this(j7hVar, interfaceC10941b, (Context) null);
    }

    public f24(Context context, j7h j7hVar, pf5.InterfaceC10941b interfaceC10941b) {
        this(j7hVar, interfaceC10941b, context);
    }

    @Deprecated
    public void setParameters(C5551f c5551f) {
        setParametersInternal(c5551f.build());
    }

    private f24(j7h j7hVar, pf5.InterfaceC10941b interfaceC10941b, @hib Context context) {
        this.f34741d = new Object();
        this.f34742e = context != null ? context.getApplicationContext() : null;
        this.f34743f = interfaceC10941b;
        if (j7hVar instanceof C5550e) {
            this.f34745h = (C5550e) j7hVar;
        } else {
            this.f34745h = (context == null ? C5550e.f34774a3 : C5550e.getDefaults(context)).buildUpon().mo10475A(j7hVar).build();
        }
        this.f34747j = yc0.f101069m;
        boolean z = context != null && x0i.isTv(context);
        this.f34744g = z;
        if (!z && context != null && x0i.f95978a >= 32) {
            this.f34746i = C5546a.tryCreateInstance(context);
        }
        if (this.f34745h.f34804T2 && context == null) {
            yh9.m25919w("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }

    public void setParameters(C5550e.a aVar) {
        setParametersInternal(aVar.build());
    }
}
