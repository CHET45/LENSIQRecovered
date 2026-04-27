package p000;

import android.content.Context;
import android.graphics.Point;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.accessibility.CaptioningManager;
import androidx.media3.common.C1213a;
import androidx.media3.exoplayer.InterfaceC1254q;
import androidx.media3.exoplayer.InterfaceC1255s;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.RandomAccess;
import java.util.Set;
import p000.C10958ph;
import p000.h7h;
import p000.kx7;
import p000.of5;
import p000.q14;
import p000.rt9;
import p000.una;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public class q14 extends rt9 implements InterfaceC1255s.f {

    /* JADX INFO: renamed from: l */
    public static final String f72745l = "DefaultTrackSelector";

    /* JADX INFO: renamed from: m */
    public static final String f72746m = "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.";

    /* JADX INFO: renamed from: n */
    public static final int f72747n = 0;

    /* JADX INFO: renamed from: o */
    public static final int f72748o = 1;

    /* JADX INFO: renamed from: p */
    public static final int f72749p = 2;

    /* JADX INFO: renamed from: q */
    public static final float f72750q = 0.98f;

    /* JADX INFO: renamed from: r */
    public static final s7c<Integer> f72751r = s7c.from(new Comparator() { // from class: y04
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return q14.lambda$static$0((Integer) obj, (Integer) obj2);
        }
    });

    /* JADX INFO: renamed from: d */
    public final Object f72752d;

    /* JADX INFO: renamed from: e */
    @hib
    public final Context f72753e;

    /* JADX INFO: renamed from: f */
    public final of5.InterfaceC10356b f72754f;

    /* JADX INFO: renamed from: g */
    @xc7("lock")
    public C11255e f72755g;

    /* JADX INFO: renamed from: h */
    @xc7("lock")
    @hib
    public Thread f72756h;

    /* JADX INFO: renamed from: i */
    @hib
    public C11258h f72757i;

    /* JADX INFO: renamed from: j */
    public uc0 f72758j;

    /* JADX INFO: renamed from: k */
    public Boolean f72759k;

    /* JADX INFO: renamed from: q14$b */
    public static final class C11252b extends AbstractC11260j<C11252b> implements Comparable<C11252b> {

        /* JADX INFO: renamed from: C */
        public final C11255e f72760C;

        /* JADX INFO: renamed from: F */
        public final boolean f72761F;

        /* JADX INFO: renamed from: H */
        public final int f72762H;

        /* JADX INFO: renamed from: L */
        public final int f72763L;

        /* JADX INFO: renamed from: M */
        public final int f72764M;

        /* JADX INFO: renamed from: M1 */
        public final int f72765M1;

        /* JADX INFO: renamed from: N */
        public final boolean f72766N;

        /* JADX INFO: renamed from: Q */
        public final boolean f72767Q;

        /* JADX INFO: renamed from: V1 */
        public final int f72768V1;

        /* JADX INFO: renamed from: X */
        public final int f72769X;

        /* JADX INFO: renamed from: Y */
        public final int f72770Y;

        /* JADX INFO: renamed from: Z */
        public final boolean f72771Z;

        /* JADX INFO: renamed from: Z1 */
        public final int f72772Z1;

        /* JADX INFO: renamed from: a2 */
        public final int f72773a2;

        /* JADX INFO: renamed from: b2 */
        public final boolean f72774b2;

        /* JADX INFO: renamed from: c2 */
        public final boolean f72775c2;

        /* JADX INFO: renamed from: d2 */
        public final boolean f72776d2;

        /* JADX INFO: renamed from: e */
        public final int f72777e;

        /* JADX INFO: renamed from: f */
        public final boolean f72778f;

        /* JADX INFO: renamed from: m */
        @hib
        public final String f72779m;

        public C11252b(int i, h6h h6hVar, int i2, C11255e c11255e, int i3, boolean z, l8d<C1213a> l8dVar, int i4) {
            int i5;
            int iM19934r;
            int iM19934r2;
            super(i, h6hVar, i2);
            this.f72760C = c11255e;
            int i6 = c11255e.f72821z0 ? 24 : 16;
            this.f72766N = c11255e.f72817v0 && (i4 & i6) != 0;
            this.f72779m = q14.m19936t(this.f72865d.f8280d);
            this.f72761F = InterfaceC1255s.isFormatSupported(i3, false);
            int i7 = 0;
            while (true) {
                i5 = Integer.MAX_VALUE;
                if (i7 >= c11255e.f42815p.size()) {
                    iM19934r = 0;
                    i7 = Integer.MAX_VALUE;
                    break;
                } else {
                    iM19934r = q14.m19934r(this.f72865d, c11255e.f42815p.get(i7), false);
                    if (iM19934r > 0) {
                        break;
                    } else {
                        i7++;
                    }
                }
            }
            this.f72763L = i7;
            this.f72762H = iM19934r;
            this.f72764M = q14.getRoleFlagMatchScore(this.f72865d.f8282f, c11255e.f42816q);
            C1213a c1213a = this.f72865d;
            int i8 = c1213a.f8282f;
            this.f72767Q = i8 == 0 || (i8 & 1) != 0;
            this.f72771Z = (c1213a.f8281e & 1) != 0;
            this.f72776d2 = q14.isObjectBasedAudio(c1213a);
            C1213a c1213a2 = this.f72865d;
            int i9 = c1213a2.f8266G;
            this.f72765M1 = i9;
            this.f72768V1 = c1213a2.f8267H;
            int i10 = c1213a2.f8286j;
            this.f72772Z1 = i10;
            this.f72778f = (i10 == -1 || i10 <= c11255e.f42818s) && (i9 == -1 || i9 <= c11255e.f42817r) && l8dVar.apply(c1213a2);
            String[] systemLanguageCodes = t0i.getSystemLanguageCodes();
            int i11 = 0;
            while (true) {
                if (i11 >= systemLanguageCodes.length) {
                    iM19934r2 = 0;
                    i11 = Integer.MAX_VALUE;
                    break;
                } else {
                    iM19934r2 = q14.m19934r(this.f72865d, systemLanguageCodes[i11], false);
                    if (iM19934r2 > 0) {
                        break;
                    } else {
                        i11++;
                    }
                }
            }
            this.f72769X = i11;
            this.f72770Y = iM19934r2;
            int i12 = 0;
            while (true) {
                if (i12 < c11255e.f42819t.size()) {
                    String str = this.f72865d.f8291o;
                    if (str != null && str.equals(c11255e.f42819t.get(i12))) {
                        i5 = i12;
                        break;
                    }
                    i12++;
                } else {
                    break;
                }
            }
            this.f72773a2 = i5;
            this.f72774b2 = InterfaceC1255s.getDecoderSupport(i3) == 128;
            this.f72775c2 = InterfaceC1255s.getHardwareAccelerationSupport(i3) == 64;
            this.f72777e = evaluateSelectionEligibility(i3, z, i6);
        }

        public static int compareSelections(List<C11252b> list, List<C11252b> list2) {
            return ((C11252b) Collections.max(list)).compareTo((C11252b) Collections.max(list2));
        }

        public static kx7<C11252b> createForTrackGroup(int i, h6h h6hVar, C11255e c11255e, int[] iArr, boolean z, l8d<C1213a> l8dVar, int i2) {
            kx7.C8541a c8541aBuilder = kx7.builder();
            for (int i3 = 0; i3 < h6hVar.f42518a; i3++) {
                c8541aBuilder.add(new C11252b(i, h6hVar, i3, c11255e, iArr[i3], z, l8dVar, i2));
            }
            return c8541aBuilder.build();
        }

        private int evaluateSelectionEligibility(int i, boolean z, int i2) {
            if (!InterfaceC1255s.isFormatSupported(i, this.f72760C.f72806B0)) {
                return 0;
            }
            if (!this.f72778f && !this.f72760C.f72816u0) {
                return 0;
            }
            C11255e c11255e = this.f72760C;
            if (c11255e.f42820u.f42833a == 2 && !q14.rendererSupportsOffload(c11255e, i, this.f72865d)) {
                return 0;
            }
            if (InterfaceC1255s.isFormatSupported(i, false) && this.f72778f && this.f72865d.f8286j != -1) {
                C11255e c11255e2 = this.f72760C;
                if (!c11255e2.f42797C && !c11255e2.f42796B && ((c11255e2.f72808D0 || !z) && c11255e2.f42820u.f42833a != 2 && (i & i2) != 0)) {
                    return 2;
                }
            }
            return 1;
        }

        @Override // p000.q14.AbstractC11260j
        public int getSelectionEligibility() {
            return this.f72777e;
        }

        @Override // java.lang.Comparable
        public int compareTo(C11252b c11252b) {
            s7c s7cVarReverse = (this.f72778f && this.f72761F) ? q14.f72751r : q14.f72751r.reverse();
            bd2 bd2VarCompare = bd2.start().compareFalseFirst(this.f72761F, c11252b.f72761F).compare(Integer.valueOf(this.f72763L), Integer.valueOf(c11252b.f72763L), s7c.natural().reverse()).compare(this.f72762H, c11252b.f72762H).compare(this.f72764M, c11252b.f72764M).compareFalseFirst(this.f72771Z, c11252b.f72771Z).compareFalseFirst(this.f72767Q, c11252b.f72767Q).compare(Integer.valueOf(this.f72769X), Integer.valueOf(c11252b.f72769X), s7c.natural().reverse()).compare(this.f72770Y, c11252b.f72770Y).compareFalseFirst(this.f72778f, c11252b.f72778f).compare(Integer.valueOf(this.f72773a2), Integer.valueOf(c11252b.f72773a2), s7c.natural().reverse());
            if (this.f72760C.f42796B) {
                bd2VarCompare = bd2VarCompare.compare(Integer.valueOf(this.f72772Z1), Integer.valueOf(c11252b.f72772Z1), q14.f72751r.reverse());
            }
            bd2 bd2VarCompare2 = bd2VarCompare.compareFalseFirst(this.f72774b2, c11252b.f72774b2).compareFalseFirst(this.f72775c2, c11252b.f72775c2).compareFalseFirst(this.f72776d2, c11252b.f72776d2).compare(Integer.valueOf(this.f72765M1), Integer.valueOf(c11252b.f72765M1), s7cVarReverse).compare(Integer.valueOf(this.f72768V1), Integer.valueOf(c11252b.f72768V1), s7cVarReverse);
            if (Objects.equals(this.f72779m, c11252b.f72779m)) {
                bd2VarCompare2 = bd2VarCompare2.compare(Integer.valueOf(this.f72772Z1), Integer.valueOf(c11252b.f72772Z1), s7cVarReverse);
            }
            return bd2VarCompare2.result();
        }

        @Override // p000.q14.AbstractC11260j
        public boolean isCompatibleForAdaptationWith(C11252b c11252b) {
            int i;
            String str;
            int i2;
            if ((this.f72760C.f72819x0 || ((i2 = this.f72865d.f8266G) != -1 && i2 == c11252b.f72865d.f8266G)) && (this.f72766N || ((str = this.f72865d.f8291o) != null && TextUtils.equals(str, c11252b.f72865d.f8291o)))) {
                C11255e c11255e = this.f72760C;
                if ((c11255e.f72818w0 || ((i = this.f72865d.f8267H) != -1 && i == c11252b.f72865d.f8267H)) && (c11255e.f72820y0 || (this.f72774b2 == c11252b.f72774b2 && this.f72775c2 == c11252b.f72775c2))) {
                    return true;
                }
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: q14$c */
    public static final class C11253c extends AbstractC11260j<C11253c> implements Comparable<C11253c> {

        /* JADX INFO: renamed from: e */
        public final int f72780e;

        /* JADX INFO: renamed from: f */
        public final int f72781f;

        public C11253c(int i, h6h h6hVar, int i2, C11255e c11255e, int i3) {
            super(i, h6hVar, i2);
            this.f72780e = InterfaceC1255s.isFormatSupported(i3, c11255e.f72806B0) ? 1 : 0;
            this.f72781f = this.f72865d.getPixelCount();
        }

        public static int compareSelections(List<C11253c> list, List<C11253c> list2) {
            return list.get(0).compareTo(list2.get(0));
        }

        public static kx7<C11253c> createForTrackGroup(int i, h6h h6hVar, C11255e c11255e, int[] iArr) {
            kx7.C8541a c8541aBuilder = kx7.builder();
            for (int i2 = 0; i2 < h6hVar.f42518a; i2++) {
                c8541aBuilder.add(new C11253c(i, h6hVar, i2, c11255e, iArr[i2]));
            }
            return c8541aBuilder.build();
        }

        @Override // p000.q14.AbstractC11260j
        public int getSelectionEligibility() {
            return this.f72780e;
        }

        @Override // java.lang.Comparable
        public int compareTo(C11253c c11253c) {
            return Integer.compare(this.f72781f, c11253c.f72781f);
        }

        @Override // p000.q14.AbstractC11260j
        public boolean isCompatibleForAdaptationWith(C11253c c11253c) {
            return false;
        }
    }

    /* JADX INFO: renamed from: q14$d */
    public static final class C11254d implements Comparable<C11254d> {

        /* JADX INFO: renamed from: a */
        public final boolean f72782a;

        /* JADX INFO: renamed from: b */
        public final boolean f72783b;

        public C11254d(C1213a c1213a, int i) {
            this.f72782a = (c1213a.f8281e & 1) != 0;
            this.f72783b = InterfaceC1255s.isFormatSupported(i, false);
        }

        @Override // java.lang.Comparable
        public int compareTo(C11254d c11254d) {
            return bd2.start().compareFalseFirst(this.f72783b, c11254d.f72783b).compareFalseFirst(this.f72782a, c11254d.f72782a).result();
        }
    }

    /* JADX INFO: renamed from: q14$e */
    public static final class C11255e extends h7h {

        /* JADX INFO: renamed from: H0 */
        public static final C11255e f72784H0;

        /* JADX INFO: renamed from: I0 */
        @Deprecated
        public static final C11255e f72785I0;

        /* JADX INFO: renamed from: J0 */
        public static final String f72786J0;

        /* JADX INFO: renamed from: K0 */
        public static final String f72787K0;

        /* JADX INFO: renamed from: L0 */
        public static final String f72788L0;

        /* JADX INFO: renamed from: M0 */
        public static final String f72789M0;

        /* JADX INFO: renamed from: N0 */
        public static final String f72790N0;

        /* JADX INFO: renamed from: O0 */
        public static final String f72791O0;

        /* JADX INFO: renamed from: P0 */
        public static final String f72792P0;

        /* JADX INFO: renamed from: Q0 */
        public static final String f72793Q0;

        /* JADX INFO: renamed from: R0 */
        public static final String f72794R0;

        /* JADX INFO: renamed from: S0 */
        public static final String f72795S0;

        /* JADX INFO: renamed from: T0 */
        public static final String f72796T0;

        /* JADX INFO: renamed from: U0 */
        public static final String f72797U0;

        /* JADX INFO: renamed from: V0 */
        public static final String f72798V0;

        /* JADX INFO: renamed from: W0 */
        public static final String f72799W0;

        /* JADX INFO: renamed from: X0 */
        public static final String f72800X0;

        /* JADX INFO: renamed from: Y0 */
        public static final String f72801Y0;

        /* JADX INFO: renamed from: Z0 */
        public static final String f72802Z0;

        /* JADX INFO: renamed from: a1 */
        public static final String f72803a1;

        /* JADX INFO: renamed from: b1 */
        public static final String f72804b1;

        /* JADX INFO: renamed from: A0 */
        public final boolean f72805A0;

        /* JADX INFO: renamed from: B0 */
        public final boolean f72806B0;

        /* JADX INFO: renamed from: C0 */
        public final boolean f72807C0;

        /* JADX INFO: renamed from: D0 */
        public final boolean f72808D0;

        /* JADX INFO: renamed from: E0 */
        public final boolean f72809E0;

        /* JADX INFO: renamed from: F0 */
        public final SparseArray<Map<n6h, C11257g>> f72810F0;

        /* JADX INFO: renamed from: G0 */
        public final SparseBooleanArray f72811G0;

        /* JADX INFO: renamed from: q0 */
        public final boolean f72812q0;

        /* JADX INFO: renamed from: r0 */
        public final boolean f72813r0;

        /* JADX INFO: renamed from: s0 */
        public final boolean f72814s0;

        /* JADX INFO: renamed from: t0 */
        public final boolean f72815t0;

        /* JADX INFO: renamed from: u0 */
        public final boolean f72816u0;

        /* JADX INFO: renamed from: v0 */
        public final boolean f72817v0;

        /* JADX INFO: renamed from: w0 */
        public final boolean f72818w0;

        /* JADX INFO: renamed from: x0 */
        public final boolean f72819x0;

        /* JADX INFO: renamed from: y0 */
        public final boolean f72820y0;

        /* JADX INFO: renamed from: z0 */
        public final boolean f72821z0;

        /* JADX INFO: renamed from: q14$e$a */
        public static final class a extends h7h.C6741c {

            /* JADX INFO: renamed from: F */
            public boolean f72822F;

            /* JADX INFO: renamed from: G */
            public boolean f72823G;

            /* JADX INFO: renamed from: H */
            public boolean f72824H;

            /* JADX INFO: renamed from: I */
            public boolean f72825I;

            /* JADX INFO: renamed from: J */
            public boolean f72826J;

            /* JADX INFO: renamed from: K */
            public boolean f72827K;

            /* JADX INFO: renamed from: L */
            public boolean f72828L;

            /* JADX INFO: renamed from: M */
            public boolean f72829M;

            /* JADX INFO: renamed from: N */
            public boolean f72830N;

            /* JADX INFO: renamed from: O */
            public boolean f72831O;

            /* JADX INFO: renamed from: P */
            public boolean f72832P;

            /* JADX INFO: renamed from: Q */
            public boolean f72833Q;

            /* JADX INFO: renamed from: R */
            public boolean f72834R;

            /* JADX INFO: renamed from: S */
            public boolean f72835S;

            /* JADX INFO: renamed from: T */
            public boolean f72836T;

            /* JADX INFO: renamed from: U */
            public final SparseArray<Map<n6h, C11257g>> f72837U;

            /* JADX INFO: renamed from: V */
            public final SparseBooleanArray f72838V;

            private static SparseArray<Map<n6h, C11257g>> cloneSelectionOverrides(SparseArray<Map<n6h, C11257g>> sparseArray) {
                SparseArray<Map<n6h, C11257g>> sparseArray2 = new SparseArray<>();
                for (int i = 0; i < sparseArray.size(); i++) {
                    sparseArray2.put(sparseArray.keyAt(i), new HashMap(sparseArray.valueAt(i)));
                }
                return sparseArray2;
            }

            private void init() {
                this.f72822F = true;
                this.f72823G = false;
                this.f72824H = true;
                this.f72825I = false;
                this.f72826J = true;
                this.f72827K = false;
                this.f72828L = false;
                this.f72829M = false;
                this.f72830N = false;
                this.f72831O = true;
                this.f72832P = true;
                this.f72833Q = true;
                this.f72834R = false;
                this.f72835S = true;
                this.f72836T = false;
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
                int[] intArray = bundle.getIntArray(C11255e.f72796T0);
                ArrayList parcelableArrayList = bundle.getParcelableArrayList(C11255e.f72797U0);
                kx7 kx7VarM15110of = parcelableArrayList == null ? kx7.m15110of() : og1.fromBundleList(new lz6() { // from class: u14
                    @Override // p000.lz6
                    public final Object apply(Object obj) {
                        return n6h.fromBundle((Bundle) obj);
                    }
                }, parcelableArrayList);
                SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(C11255e.f72798V0);
                SparseArray sparseArray = sparseParcelableArray == null ? new SparseArray() : og1.fromBundleSparseArray(new lz6() { // from class: v14
                    @Override // p000.lz6
                    public final Object apply(Object obj) {
                        return q14.C11257g.fromBundle((Bundle) obj);
                    }
                }, sparseParcelableArray);
                if (intArray == null || intArray.length != kx7VarM15110of.size()) {
                    return;
                }
                for (int i = 0; i < intArray.length; i++) {
                    setSelectionOverride(intArray[i], (n6h) kx7VarM15110of.get(i), (C11257g) sparseArray.get(i));
                }
            }

            @Override // p000.h7h.C6741c
            @op1
            /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
            public a mo12257F(h7h h7hVar) {
                super.mo12257F(h7hVar);
                return this;
            }

            @op1
            @Deprecated
            public a clearSelectionOverride(int i, n6h n6hVar) {
                Map<n6h, C11257g> map = this.f72837U.get(i);
                if (map != null && map.containsKey(n6hVar)) {
                    map.remove(n6hVar);
                    if (map.isEmpty()) {
                        this.f72837U.remove(i);
                    }
                }
                return this;
            }

            @op1
            @Deprecated
            public a clearSelectionOverrides(int i) {
                Map<n6h, C11257g> map = this.f72837U.get(i);
                if (map != null && !map.isEmpty()) {
                    this.f72837U.remove(i);
                }
                return this;
            }

            @op1
            public a setAllowAudioMixedChannelCountAdaptiveness(boolean z) {
                this.f72829M = z;
                return this;
            }

            @op1
            public a setAllowAudioMixedDecoderSupportAdaptiveness(boolean z) {
                this.f72830N = z;
                return this;
            }

            @op1
            public a setAllowAudioMixedMimeTypeAdaptiveness(boolean z) {
                this.f72827K = z;
                return this;
            }

            @op1
            public a setAllowAudioMixedSampleRateAdaptiveness(boolean z) {
                this.f72828L = z;
                return this;
            }

            @op1
            public a setAllowAudioNonSeamlessAdaptiveness(boolean z) {
                this.f72831O = z;
                return this;
            }

            @op1
            public a setAllowInvalidateSelectionsOnRendererCapabilitiesChange(boolean z) {
                this.f72836T = z;
                return this;
            }

            @op1
            public a setAllowMultipleAdaptiveSelections(boolean z) {
                this.f72835S = z;
                return this;
            }

            @op1
            public a setAllowVideoMixedDecoderSupportAdaptiveness(boolean z) {
                this.f72825I = z;
                return this;
            }

            @op1
            public a setAllowVideoMixedMimeTypeAdaptiveness(boolean z) {
                this.f72823G = z;
                return this;
            }

            @op1
            public a setAllowVideoNonSeamlessAdaptiveness(boolean z) {
                this.f72824H = z;
                return this;
            }

            @op1
            public a setConstrainAudioChannelCountToDeviceCapabilities(boolean z) {
                this.f72832P = z;
                return this;
            }

            @op1
            @Deprecated
            public a setDisabledTextTrackSelectionFlags(int i) {
                return setIgnoredTextSelectionFlags(i);
            }

            @Override // p000.h7h.C6741c
            @op1
            public /* bridge */ /* synthetic */ h7h.C6741c setDisabledTrackTypes(Set set) {
                return setDisabledTrackTypes((Set<Integer>) set);
            }

            @op1
            public a setExceedAudioConstraintsIfNecessary(boolean z) {
                this.f72826J = z;
                return this;
            }

            @op1
            public a setExceedRendererCapabilitiesIfNecessary(boolean z) {
                this.f72833Q = z;
                return this;
            }

            @op1
            public a setExceedVideoConstraintsIfNecessary(boolean z) {
                this.f72822F = z;
                return this;
            }

            @op1
            public a setRendererDisabled(int i, boolean z) {
                if (this.f72838V.get(i) == z) {
                    return this;
                }
                if (z) {
                    this.f72838V.put(i, true);
                } else {
                    this.f72838V.delete(i);
                }
                return this;
            }

            @op1
            @Deprecated
            public a setSelectionOverride(int i, n6h n6hVar, @hib C11257g c11257g) {
                Map<n6h, C11257g> map = this.f72837U.get(i);
                if (map == null) {
                    map = new HashMap<>();
                    this.f72837U.put(i, map);
                }
                if (map.containsKey(n6hVar) && Objects.equals(map.get(n6hVar), c11257g)) {
                    return this;
                }
                map.put(n6hVar, c11257g);
                return this;
            }

            @op1
            public a setTunnelingEnabled(boolean z) {
                this.f72834R = z;
                return this;
            }

            @Override // p000.h7h.C6741c
            @op1
            public a addOverride(e7h e7hVar) {
                super.addOverride(e7hVar);
                return this;
            }

            @Override // p000.h7h.C6741c
            public C11255e build() {
                return new C11255e(this);
            }

            @Override // p000.h7h.C6741c
            @op1
            public a clearOverride(h6h h6hVar) {
                super.clearOverride(h6hVar);
                return this;
            }

            @Override // p000.h7h.C6741c
            @op1
            public a clearOverrides() {
                super.clearOverrides();
                return this;
            }

            @Override // p000.h7h.C6741c
            @op1
            public a clearOverridesOfType(int i) {
                super.clearOverridesOfType(i);
                return this;
            }

            @Override // p000.h7h.C6741c
            @op1
            public a clearVideoSizeConstraints() {
                super.clearVideoSizeConstraints();
                return this;
            }

            @Override // p000.h7h.C6741c
            @op1
            public a clearViewportSizeConstraints() {
                super.clearViewportSizeConstraints();
                return this;
            }

            @Override // p000.h7h.C6741c
            @op1
            public a setAudioOffloadPreferences(h7h.C6740b c6740b) {
                super.setAudioOffloadPreferences(c6740b);
                return this;
            }

            @Override // p000.h7h.C6741c
            @op1
            public a setDisabledTrackTypes(Set<Integer> set) {
                super.setDisabledTrackTypes(set);
                return this;
            }

            @Override // p000.h7h.C6741c
            @op1
            public a setForceHighestSupportedBitrate(boolean z) {
                super.setForceHighestSupportedBitrate(z);
                return this;
            }

            @Override // p000.h7h.C6741c
            @op1
            public a setForceLowestBitrate(boolean z) {
                super.setForceLowestBitrate(z);
                return this;
            }

            @Override // p000.h7h.C6741c
            @op1
            public a setIgnoredTextSelectionFlags(int i) {
                super.setIgnoredTextSelectionFlags(i);
                return this;
            }

            @Override // p000.h7h.C6741c
            @op1
            public a setMaxAudioBitrate(int i) {
                super.setMaxAudioBitrate(i);
                return this;
            }

            @Override // p000.h7h.C6741c
            @op1
            public a setMaxAudioChannelCount(int i) {
                super.setMaxAudioChannelCount(i);
                return this;
            }

            @Override // p000.h7h.C6741c
            @op1
            public a setMaxVideoBitrate(int i) {
                super.setMaxVideoBitrate(i);
                return this;
            }

            @Override // p000.h7h.C6741c
            @op1
            public a setMaxVideoFrameRate(int i) {
                super.setMaxVideoFrameRate(i);
                return this;
            }

            @Override // p000.h7h.C6741c
            @op1
            public a setMaxVideoSize(int i, int i2) {
                super.setMaxVideoSize(i, i2);
                return this;
            }

            @Override // p000.h7h.C6741c
            @op1
            public a setMaxVideoSizeSd() {
                super.setMaxVideoSizeSd();
                return this;
            }

            @Override // p000.h7h.C6741c
            @op1
            public a setMinVideoBitrate(int i) {
                super.setMinVideoBitrate(i);
                return this;
            }

            @Override // p000.h7h.C6741c
            @op1
            public a setMinVideoFrameRate(int i) {
                super.setMinVideoFrameRate(i);
                return this;
            }

            @Override // p000.h7h.C6741c
            @op1
            public a setMinVideoSize(int i, int i2) {
                super.setMinVideoSize(i, i2);
                return this;
            }

            @Override // p000.h7h.C6741c
            @op1
            public a setOverrideForType(e7h e7hVar) {
                super.setOverrideForType(e7hVar);
                return this;
            }

            @Override // p000.h7h.C6741c
            @op1
            public a setPreferredAudioLanguage(@hib String str) {
                super.setPreferredAudioLanguage(str);
                return this;
            }

            @Override // p000.h7h.C6741c
            @op1
            public a setPreferredAudioLanguages(String... strArr) {
                super.setPreferredAudioLanguages(strArr);
                return this;
            }

            @Override // p000.h7h.C6741c
            @op1
            public a setPreferredAudioMimeType(@hib String str) {
                super.setPreferredAudioMimeType(str);
                return this;
            }

            @Override // p000.h7h.C6741c
            @op1
            public a setPreferredAudioMimeTypes(String... strArr) {
                super.setPreferredAudioMimeTypes(strArr);
                return this;
            }

            @Override // p000.h7h.C6741c
            @op1
            public a setPreferredAudioRoleFlags(int i) {
                super.setPreferredAudioRoleFlags(i);
                return this;
            }

            @Override // p000.h7h.C6741c
            @op1
            public a setPreferredTextLanguage(@hib String str) {
                super.setPreferredTextLanguage(str);
                return this;
            }

            @Override // p000.h7h.C6741c
            @op1
            public a setPreferredTextLanguages(String... strArr) {
                super.setPreferredTextLanguages(strArr);
                return this;
            }

            @Override // p000.h7h.C6741c
            @op1
            public a setPreferredTextRoleFlags(int i) {
                super.setPreferredTextRoleFlags(i);
                return this;
            }

            @Override // p000.h7h.C6741c
            @op1
            public a setPreferredVideoLanguage(@hib String str) {
                super.setPreferredVideoLanguage(str);
                return this;
            }

            @Override // p000.h7h.C6741c
            @op1
            public a setPreferredVideoLanguages(String... strArr) {
                super.setPreferredVideoLanguages(strArr);
                return this;
            }

            @Override // p000.h7h.C6741c
            @op1
            public a setPreferredVideoMimeType(@hib String str) {
                super.setPreferredVideoMimeType(str);
                return this;
            }

            @Override // p000.h7h.C6741c
            @op1
            public a setPreferredVideoMimeTypes(String... strArr) {
                super.setPreferredVideoMimeTypes(strArr);
                return this;
            }

            @Override // p000.h7h.C6741c
            @op1
            public a setPreferredVideoRoleFlags(int i) {
                super.setPreferredVideoRoleFlags(i);
                return this;
            }

            @Override // p000.h7h.C6741c
            @op1
            public a setPrioritizeImageOverVideoEnabled(boolean z) {
                super.setPrioritizeImageOverVideoEnabled(z);
                return this;
            }

            @Override // p000.h7h.C6741c
            @op1
            public a setSelectUndeterminedTextLanguage(boolean z) {
                super.setSelectUndeterminedTextLanguage(z);
                return this;
            }

            @Override // p000.h7h.C6741c
            @op1
            public a setTrackTypeDisabled(int i, boolean z) {
                super.setTrackTypeDisabled(i, z);
                return this;
            }

            @Override // p000.h7h.C6741c
            @op1
            public a setViewportSize(int i, int i2, boolean z) {
                super.setViewportSize(i, i2, z);
                return this;
            }

            public a() {
                this.f72837U = new SparseArray<>();
                this.f72838V = new SparseBooleanArray();
                init();
            }

            @Override // p000.h7h.C6741c
            @op1
            public a setPreferredTextLanguageAndRoleFlagsToCaptioningManagerSettings() {
                super.setPreferredTextLanguageAndRoleFlagsToCaptioningManagerSettings();
                return this;
            }

            @Override // p000.h7h.C6741c
            @op1
            public a setViewportSizeToPhysicalDisplaySize(boolean z) {
                super.setViewportSizeToPhysicalDisplaySize(z);
                return this;
            }

            @Override // p000.h7h.C6741c
            @op1
            @Deprecated
            public a setPreferredTextLanguageAndRoleFlagsToCaptioningManagerSettings(Context context) {
                super.setPreferredTextLanguageAndRoleFlagsToCaptioningManagerSettings(context);
                return this;
            }

            @Override // p000.h7h.C6741c
            @op1
            @Deprecated
            public a setViewportSizeToPhysicalDisplaySize(Context context, boolean z) {
                super.setViewportSizeToPhysicalDisplaySize(context, z);
                return this;
            }

            @op1
            @Deprecated
            public a clearSelectionOverrides() {
                if (this.f72837U.size() == 0) {
                    return this;
                }
                this.f72837U.clear();
                return this;
            }

            @Deprecated
            @p28(replacement = "this()")
            public a(Context context) {
                this();
            }

            private a(C11255e c11255e) {
                super(c11255e);
                this.f72822F = c11255e.f72812q0;
                this.f72823G = c11255e.f72813r0;
                this.f72824H = c11255e.f72814s0;
                this.f72825I = c11255e.f72815t0;
                this.f72826J = c11255e.f72816u0;
                this.f72827K = c11255e.f72817v0;
                this.f72828L = c11255e.f72818w0;
                this.f72829M = c11255e.f72819x0;
                this.f72830N = c11255e.f72820y0;
                this.f72831O = c11255e.f72821z0;
                this.f72832P = c11255e.f72805A0;
                this.f72833Q = c11255e.f72806B0;
                this.f72834R = c11255e.f72807C0;
                this.f72835S = c11255e.f72808D0;
                this.f72836T = c11255e.f72809E0;
                this.f72837U = cloneSelectionOverrides(c11255e.f72810F0);
                this.f72838V = c11255e.f72811G0.clone();
            }

            private a(Bundle bundle) {
                super(bundle);
                init();
                C11255e c11255e = C11255e.f72784H0;
                setExceedVideoConstraintsIfNecessary(bundle.getBoolean(C11255e.f72786J0, c11255e.f72812q0));
                setAllowVideoMixedMimeTypeAdaptiveness(bundle.getBoolean(C11255e.f72787K0, c11255e.f72813r0));
                setAllowVideoNonSeamlessAdaptiveness(bundle.getBoolean(C11255e.f72788L0, c11255e.f72814s0));
                setAllowVideoMixedDecoderSupportAdaptiveness(bundle.getBoolean(C11255e.f72800X0, c11255e.f72815t0));
                setExceedAudioConstraintsIfNecessary(bundle.getBoolean(C11255e.f72789M0, c11255e.f72816u0));
                setAllowAudioMixedMimeTypeAdaptiveness(bundle.getBoolean(C11255e.f72790N0, c11255e.f72817v0));
                setAllowAudioMixedSampleRateAdaptiveness(bundle.getBoolean(C11255e.f72791O0, c11255e.f72818w0));
                setAllowAudioMixedChannelCountAdaptiveness(bundle.getBoolean(C11255e.f72792P0, c11255e.f72819x0));
                setAllowAudioMixedDecoderSupportAdaptiveness(bundle.getBoolean(C11255e.f72801Y0, c11255e.f72820y0));
                setAllowAudioNonSeamlessAdaptiveness(bundle.getBoolean(C11255e.f72804b1, c11255e.f72821z0));
                setConstrainAudioChannelCountToDeviceCapabilities(bundle.getBoolean(C11255e.f72802Z0, c11255e.f72805A0));
                setExceedRendererCapabilitiesIfNecessary(bundle.getBoolean(C11255e.f72793Q0, c11255e.f72806B0));
                setTunnelingEnabled(bundle.getBoolean(C11255e.f72794R0, c11255e.f72807C0));
                setAllowMultipleAdaptiveSelections(bundle.getBoolean(C11255e.f72795S0, c11255e.f72808D0));
                setAllowInvalidateSelectionsOnRendererCapabilitiesChange(bundle.getBoolean(C11255e.f72803a1, c11255e.f72809E0));
                this.f72837U = new SparseArray<>();
                setSelectionOverridesFromBundle(bundle);
                this.f72838V = makeSparseBooleanArrayFromTrueKeys(bundle.getIntArray(C11255e.f72799W0));
            }
        }

        static {
            C11255e c11255eBuild = new a().build();
            f72784H0 = c11255eBuild;
            f72785I0 = c11255eBuild;
            f72786J0 = t0i.intToStringMaxRadix(1000);
            f72787K0 = t0i.intToStringMaxRadix(1001);
            f72788L0 = t0i.intToStringMaxRadix(1002);
            f72789M0 = t0i.intToStringMaxRadix(1003);
            f72790N0 = t0i.intToStringMaxRadix(1004);
            f72791O0 = t0i.intToStringMaxRadix(1005);
            f72792P0 = t0i.intToStringMaxRadix(1006);
            f72793Q0 = t0i.intToStringMaxRadix(1007);
            f72794R0 = t0i.intToStringMaxRadix(1008);
            f72795S0 = t0i.intToStringMaxRadix(1009);
            f72796T0 = t0i.intToStringMaxRadix(1010);
            f72797U0 = t0i.intToStringMaxRadix(1011);
            f72798V0 = t0i.intToStringMaxRadix(1012);
            f72799W0 = t0i.intToStringMaxRadix(1013);
            f72800X0 = t0i.intToStringMaxRadix(1014);
            f72801Y0 = t0i.intToStringMaxRadix(1015);
            f72802Z0 = t0i.intToStringMaxRadix(1016);
            f72803a1 = t0i.intToStringMaxRadix(1017);
            f72804b1 = t0i.intToStringMaxRadix(1018);
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

        private static boolean areSelectionOverridesEqual(SparseArray<Map<n6h, C11257g>> sparseArray, SparseArray<Map<n6h, C11257g>> sparseArray2) {
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

        public static C11255e fromBundle(Bundle bundle) {
            return new a(bundle).build();
        }

        @Deprecated
        public static C11255e getDefaults(Context context) {
            return f72784H0;
        }

        private static int[] getKeysFromSparseBooleanArray(SparseBooleanArray sparseBooleanArray) {
            int[] iArr = new int[sparseBooleanArray.size()];
            for (int i = 0; i < sparseBooleanArray.size(); i++) {
                iArr[i] = sparseBooleanArray.keyAt(i);
            }
            return iArr;
        }

        private static void putSelectionOverridesToBundle(Bundle bundle, SparseArray<Map<n6h, C11257g>> sparseArray) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            SparseArray sparseArray2 = new SparseArray();
            for (int i = 0; i < sparseArray.size(); i++) {
                int iKeyAt = sparseArray.keyAt(i);
                for (Map.Entry<n6h, C11257g> entry : sparseArray.valueAt(i).entrySet()) {
                    C11257g value = entry.getValue();
                    if (value != null) {
                        sparseArray2.put(arrayList2.size(), value);
                    }
                    arrayList2.add(entry.getKey());
                    arrayList.add(Integer.valueOf(iKeyAt));
                }
                bundle.putIntArray(f72796T0, rd8.toArray(arrayList));
                bundle.putParcelableArrayList(f72797U0, og1.toBundleArrayList(arrayList2, new lz6() { // from class: s14
                    @Override // p000.lz6
                    public final Object apply(Object obj) {
                        return ((n6h) obj).toBundle();
                    }
                }));
                bundle.putSparseParcelableArray(f72798V0, og1.toBundleSparseArray(sparseArray2, new lz6() { // from class: t14
                    @Override // p000.lz6
                    public final Object apply(Object obj) {
                        return ((q14.C11257g) obj).toBundle();
                    }
                }));
            }
        }

        @Override // p000.h7h
        public boolean equals(@hib Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C11255e.class != obj.getClass()) {
                return false;
            }
            C11255e c11255e = (C11255e) obj;
            return super.equals(c11255e) && this.f72812q0 == c11255e.f72812q0 && this.f72813r0 == c11255e.f72813r0 && this.f72814s0 == c11255e.f72814s0 && this.f72815t0 == c11255e.f72815t0 && this.f72816u0 == c11255e.f72816u0 && this.f72817v0 == c11255e.f72817v0 && this.f72818w0 == c11255e.f72818w0 && this.f72819x0 == c11255e.f72819x0 && this.f72820y0 == c11255e.f72820y0 && this.f72821z0 == c11255e.f72821z0 && this.f72805A0 == c11255e.f72805A0 && this.f72806B0 == c11255e.f72806B0 && this.f72807C0 == c11255e.f72807C0 && this.f72808D0 == c11255e.f72808D0 && this.f72809E0 == c11255e.f72809E0 && areRendererDisabledFlagsEqual(this.f72811G0, c11255e.f72811G0) && areSelectionOverridesEqual(this.f72810F0, c11255e.f72810F0);
        }

        public boolean getRendererDisabled(int i) {
            return this.f72811G0.get(i);
        }

        @hib
        @Deprecated
        public C11257g getSelectionOverride(int i, n6h n6hVar) {
            Map<n6h, C11257g> map = this.f72810F0.get(i);
            if (map != null) {
                return map.get(n6hVar);
            }
            return null;
        }

        @Deprecated
        public boolean hasSelectionOverride(int i, n6h n6hVar) {
            Map<n6h, C11257g> map = this.f72810F0.get(i);
            return map != null && map.containsKey(n6hVar);
        }

        @Override // p000.h7h
        public int hashCode() {
            return ((((((((((((((((((((((((((((((super.hashCode() + 31) * 31) + (this.f72812q0 ? 1 : 0)) * 31) + (this.f72813r0 ? 1 : 0)) * 31) + (this.f72814s0 ? 1 : 0)) * 31) + (this.f72815t0 ? 1 : 0)) * 31) + (this.f72816u0 ? 1 : 0)) * 31) + (this.f72817v0 ? 1 : 0)) * 31) + (this.f72818w0 ? 1 : 0)) * 31) + (this.f72819x0 ? 1 : 0)) * 31) + (this.f72820y0 ? 1 : 0)) * 31) + (this.f72821z0 ? 1 : 0)) * 31) + (this.f72805A0 ? 1 : 0)) * 31) + (this.f72806B0 ? 1 : 0)) * 31) + (this.f72807C0 ? 1 : 0)) * 31) + (this.f72808D0 ? 1 : 0)) * 31) + (this.f72809E0 ? 1 : 0);
        }

        @Override // p000.h7h
        public Bundle toBundle() {
            Bundle bundle = super.toBundle();
            bundle.putBoolean(f72786J0, this.f72812q0);
            bundle.putBoolean(f72787K0, this.f72813r0);
            bundle.putBoolean(f72788L0, this.f72814s0);
            bundle.putBoolean(f72800X0, this.f72815t0);
            bundle.putBoolean(f72789M0, this.f72816u0);
            bundle.putBoolean(f72790N0, this.f72817v0);
            bundle.putBoolean(f72791O0, this.f72818w0);
            bundle.putBoolean(f72792P0, this.f72819x0);
            bundle.putBoolean(f72801Y0, this.f72820y0);
            bundle.putBoolean(f72804b1, this.f72821z0);
            bundle.putBoolean(f72802Z0, this.f72805A0);
            bundle.putBoolean(f72793Q0, this.f72806B0);
            bundle.putBoolean(f72794R0, this.f72807C0);
            bundle.putBoolean(f72795S0, this.f72808D0);
            bundle.putBoolean(f72803a1, this.f72809E0);
            putSelectionOverridesToBundle(bundle, this.f72810F0);
            bundle.putIntArray(f72799W0, getKeysFromSparseBooleanArray(this.f72811G0));
            return bundle;
        }

        private C11255e(a aVar) {
            super(aVar);
            this.f72812q0 = aVar.f72822F;
            this.f72813r0 = aVar.f72823G;
            this.f72814s0 = aVar.f72824H;
            this.f72815t0 = aVar.f72825I;
            this.f72816u0 = aVar.f72826J;
            this.f72817v0 = aVar.f72827K;
            this.f72818w0 = aVar.f72828L;
            this.f72819x0 = aVar.f72829M;
            this.f72820y0 = aVar.f72830N;
            this.f72821z0 = aVar.f72831O;
            this.f72805A0 = aVar.f72832P;
            this.f72806B0 = aVar.f72833Q;
            this.f72807C0 = aVar.f72834R;
            this.f72808D0 = aVar.f72835S;
            this.f72809E0 = aVar.f72836T;
            this.f72810F0 = aVar.f72837U;
            this.f72811G0 = aVar.f72838V;
        }

        @Override // p000.h7h
        public a buildUpon() {
            return new a();
        }

        private static boolean areSelectionOverridesEqual(Map<n6h, C11257g> map, Map<n6h, C11257g> map2) {
            if (map2.size() != map.size()) {
                return false;
            }
            for (Map.Entry<n6h, C11257g> entry : map.entrySet()) {
                n6h key = entry.getKey();
                if (!map2.containsKey(key) || !Objects.equals(entry.getValue(), map2.get(key))) {
                    return false;
                }
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: q14$f */
    @Deprecated
    public static final class C11256f extends h7h.C6741c {

        /* JADX INFO: renamed from: F */
        public final C11255e.a f72839F;

        public C11256f() {
            this.f72839F = new C11255e.a();
        }

        @Override // p000.h7h.C6741c
        @op1
        /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
        public C11256f mo12257F(h7h h7hVar) {
            this.f72839F.mo12257F(h7hVar);
            return this;
        }

        @op1
        @Deprecated
        public C11256f clearSelectionOverride(int i, n6h n6hVar) {
            this.f72839F.clearSelectionOverride(i, n6hVar);
            return this;
        }

        @op1
        @Deprecated
        public C11256f clearSelectionOverrides(int i) {
            this.f72839F.clearSelectionOverrides(i);
            return this;
        }

        @op1
        public C11256f setAllowAudioMixedChannelCountAdaptiveness(boolean z) {
            this.f72839F.setAllowAudioMixedChannelCountAdaptiveness(z);
            return this;
        }

        @op1
        public C11256f setAllowAudioMixedDecoderSupportAdaptiveness(boolean z) {
            this.f72839F.setAllowAudioMixedDecoderSupportAdaptiveness(z);
            return this;
        }

        @op1
        public C11256f setAllowAudioMixedMimeTypeAdaptiveness(boolean z) {
            this.f72839F.setAllowAudioMixedMimeTypeAdaptiveness(z);
            return this;
        }

        @op1
        public C11256f setAllowAudioMixedSampleRateAdaptiveness(boolean z) {
            this.f72839F.setAllowAudioMixedSampleRateAdaptiveness(z);
            return this;
        }

        @op1
        public C11256f setAllowMultipleAdaptiveSelections(boolean z) {
            this.f72839F.setAllowMultipleAdaptiveSelections(z);
            return this;
        }

        @op1
        public C11256f setAllowVideoMixedDecoderSupportAdaptiveness(boolean z) {
            this.f72839F.setAllowVideoMixedDecoderSupportAdaptiveness(z);
            return this;
        }

        @op1
        public C11256f setAllowVideoMixedMimeTypeAdaptiveness(boolean z) {
            this.f72839F.setAllowVideoMixedMimeTypeAdaptiveness(z);
            return this;
        }

        @op1
        public C11256f setAllowVideoNonSeamlessAdaptiveness(boolean z) {
            this.f72839F.setAllowVideoNonSeamlessAdaptiveness(z);
            return this;
        }

        @op1
        @Deprecated
        public C11256f setDisabledTextTrackSelectionFlags(int i) {
            this.f72839F.setDisabledTextTrackSelectionFlags(i);
            return this;
        }

        @Override // p000.h7h.C6741c
        @op1
        public /* bridge */ /* synthetic */ h7h.C6741c setDisabledTrackTypes(Set set) {
            return setDisabledTrackTypes((Set<Integer>) set);
        }

        @op1
        public C11256f setExceedAudioConstraintsIfNecessary(boolean z) {
            this.f72839F.setExceedAudioConstraintsIfNecessary(z);
            return this;
        }

        @op1
        public C11256f setExceedRendererCapabilitiesIfNecessary(boolean z) {
            this.f72839F.setExceedRendererCapabilitiesIfNecessary(z);
            return this;
        }

        @op1
        public C11256f setExceedVideoConstraintsIfNecessary(boolean z) {
            this.f72839F.setExceedVideoConstraintsIfNecessary(z);
            return this;
        }

        @op1
        public C11256f setRendererDisabled(int i, boolean z) {
            this.f72839F.setRendererDisabled(i, z);
            return this;
        }

        @op1
        @Deprecated
        public C11256f setSelectionOverride(int i, n6h n6hVar, @hib C11257g c11257g) {
            this.f72839F.setSelectionOverride(i, n6hVar, c11257g);
            return this;
        }

        @op1
        public C11256f setTunnelingEnabled(boolean z) {
            this.f72839F.setTunnelingEnabled(z);
            return this;
        }

        @Override // p000.h7h.C6741c
        @op1
        public C11256f addOverride(e7h e7hVar) {
            this.f72839F.addOverride(e7hVar);
            return this;
        }

        @Override // p000.h7h.C6741c
        public C11255e build() {
            return this.f72839F.build();
        }

        @Override // p000.h7h.C6741c
        @op1
        public C11256f clearOverride(h6h h6hVar) {
            this.f72839F.clearOverride(h6hVar);
            return this;
        }

        @Override // p000.h7h.C6741c
        @op1
        public C11256f clearOverrides() {
            this.f72839F.clearOverrides();
            return this;
        }

        @Override // p000.h7h.C6741c
        @op1
        public C11256f clearOverridesOfType(int i) {
            this.f72839F.clearOverridesOfType(i);
            return this;
        }

        @op1
        @Deprecated
        public C11256f clearSelectionOverrides() {
            this.f72839F.clearSelectionOverrides();
            return this;
        }

        @Override // p000.h7h.C6741c
        @op1
        public C11256f clearVideoSizeConstraints() {
            this.f72839F.clearVideoSizeConstraints();
            return this;
        }

        @Override // p000.h7h.C6741c
        @op1
        public C11256f clearViewportSizeConstraints() {
            this.f72839F.clearViewportSizeConstraints();
            return this;
        }

        @Override // p000.h7h.C6741c
        @op1
        public C11256f setAudioOffloadPreferences(h7h.C6740b c6740b) {
            this.f72839F.setAudioOffloadPreferences(c6740b);
            return this;
        }

        @Override // p000.h7h.C6741c
        @op1
        public C11256f setDisabledTrackTypes(Set<Integer> set) {
            this.f72839F.setDisabledTrackTypes(set);
            return this;
        }

        @Override // p000.h7h.C6741c
        @op1
        public C11256f setForceHighestSupportedBitrate(boolean z) {
            this.f72839F.setForceHighestSupportedBitrate(z);
            return this;
        }

        @Override // p000.h7h.C6741c
        @op1
        public C11256f setForceLowestBitrate(boolean z) {
            this.f72839F.setForceLowestBitrate(z);
            return this;
        }

        @Override // p000.h7h.C6741c
        @op1
        public C11256f setIgnoredTextSelectionFlags(int i) {
            this.f72839F.setIgnoredTextSelectionFlags(i);
            return this;
        }

        @Override // p000.h7h.C6741c
        @op1
        public C11256f setMaxAudioBitrate(int i) {
            this.f72839F.setMaxAudioBitrate(i);
            return this;
        }

        @Override // p000.h7h.C6741c
        @op1
        public C11256f setMaxAudioChannelCount(int i) {
            this.f72839F.setMaxAudioChannelCount(i);
            return this;
        }

        @Override // p000.h7h.C6741c
        @op1
        public C11256f setMaxVideoBitrate(int i) {
            this.f72839F.setMaxVideoBitrate(i);
            return this;
        }

        @Override // p000.h7h.C6741c
        @op1
        public C11256f setMaxVideoFrameRate(int i) {
            this.f72839F.setMaxVideoFrameRate(i);
            return this;
        }

        @Override // p000.h7h.C6741c
        @op1
        public C11256f setMaxVideoSize(int i, int i2) {
            this.f72839F.setMaxVideoSize(i, i2);
            return this;
        }

        @Override // p000.h7h.C6741c
        @op1
        public C11256f setMaxVideoSizeSd() {
            this.f72839F.setMaxVideoSizeSd();
            return this;
        }

        @Override // p000.h7h.C6741c
        @op1
        public C11256f setMinVideoBitrate(int i) {
            this.f72839F.setMinVideoBitrate(i);
            return this;
        }

        @Override // p000.h7h.C6741c
        @op1
        public C11256f setMinVideoFrameRate(int i) {
            this.f72839F.setMinVideoFrameRate(i);
            return this;
        }

        @Override // p000.h7h.C6741c
        @op1
        public C11256f setMinVideoSize(int i, int i2) {
            this.f72839F.setMinVideoSize(i, i2);
            return this;
        }

        @Override // p000.h7h.C6741c
        @op1
        public C11256f setOverrideForType(e7h e7hVar) {
            this.f72839F.setOverrideForType(e7hVar);
            return this;
        }

        @Override // p000.h7h.C6741c
        @op1
        public C11256f setPreferredAudioLanguage(@hib String str) {
            this.f72839F.setPreferredAudioLanguage(str);
            return this;
        }

        @Override // p000.h7h.C6741c
        @op1
        public C11256f setPreferredAudioLanguages(String... strArr) {
            this.f72839F.setPreferredAudioLanguages(strArr);
            return this;
        }

        @Override // p000.h7h.C6741c
        @op1
        public C11256f setPreferredAudioMimeType(@hib String str) {
            this.f72839F.setPreferredAudioMimeType(str);
            return this;
        }

        @Override // p000.h7h.C6741c
        @op1
        public C11256f setPreferredAudioMimeTypes(String... strArr) {
            this.f72839F.setPreferredAudioMimeTypes(strArr);
            return this;
        }

        @Override // p000.h7h.C6741c
        @op1
        public C11256f setPreferredAudioRoleFlags(int i) {
            this.f72839F.setPreferredAudioRoleFlags(i);
            return this;
        }

        @Override // p000.h7h.C6741c
        @op1
        public C11256f setPreferredTextLanguage(@hib String str) {
            this.f72839F.setPreferredTextLanguage(str);
            return this;
        }

        @Override // p000.h7h.C6741c
        @op1
        public C11256f setPreferredTextLanguages(String... strArr) {
            this.f72839F.setPreferredTextLanguages(strArr);
            return this;
        }

        @Override // p000.h7h.C6741c
        @op1
        public C11256f setPreferredTextRoleFlags(int i) {
            this.f72839F.setPreferredTextRoleFlags(i);
            return this;
        }

        @Override // p000.h7h.C6741c
        @op1
        public C11256f setPreferredVideoLanguage(@hib String str) {
            super.setPreferredVideoLanguage(str);
            return this;
        }

        @Override // p000.h7h.C6741c
        @op1
        public C11256f setPreferredVideoLanguages(String... strArr) {
            super.setPreferredVideoLanguages(strArr);
            return this;
        }

        @Override // p000.h7h.C6741c
        @op1
        public C11256f setPreferredVideoMimeType(@hib String str) {
            this.f72839F.setPreferredVideoMimeType(str);
            return this;
        }

        @Override // p000.h7h.C6741c
        @op1
        public C11256f setPreferredVideoMimeTypes(String... strArr) {
            this.f72839F.setPreferredVideoMimeTypes(strArr);
            return this;
        }

        @Override // p000.h7h.C6741c
        @op1
        public C11256f setPreferredVideoRoleFlags(int i) {
            this.f72839F.setPreferredVideoRoleFlags(i);
            return this;
        }

        @Override // p000.h7h.C6741c
        @op1
        public C11256f setPrioritizeImageOverVideoEnabled(boolean z) {
            this.f72839F.setPrioritizeImageOverVideoEnabled(z);
            return this;
        }

        @Override // p000.h7h.C6741c
        @op1
        public C11256f setSelectUndeterminedTextLanguage(boolean z) {
            this.f72839F.setSelectUndeterminedTextLanguage(z);
            return this;
        }

        @Override // p000.h7h.C6741c
        @op1
        public C11256f setTrackTypeDisabled(int i, boolean z) {
            this.f72839F.setTrackTypeDisabled(i, z);
            return this;
        }

        @Override // p000.h7h.C6741c
        @op1
        public C11256f setViewportSize(int i, int i2, boolean z) {
            this.f72839F.setViewportSize(i, i2, z);
            return this;
        }

        public C11256f(Context context) {
            this.f72839F = new C11255e.a(context);
        }

        @Override // p000.h7h.C6741c
        @op1
        public C11256f setPreferredTextLanguageAndRoleFlagsToCaptioningManagerSettings() {
            this.f72839F.setPreferredTextLanguageAndRoleFlagsToCaptioningManagerSettings();
            return this;
        }

        @Override // p000.h7h.C6741c
        @op1
        public C11256f setViewportSizeToPhysicalDisplaySize(boolean z) {
            this.f72839F.setViewportSizeToPhysicalDisplaySize(z);
            return this;
        }

        @Override // p000.h7h.C6741c
        @op1
        public C11256f setPreferredTextLanguageAndRoleFlagsToCaptioningManagerSettings(Context context) {
            this.f72839F.setPreferredTextLanguageAndRoleFlagsToCaptioningManagerSettings(context);
            return this;
        }

        @Override // p000.h7h.C6741c
        @op1
        public C11256f setViewportSizeToPhysicalDisplaySize(Context context, boolean z) {
            this.f72839F.setViewportSizeToPhysicalDisplaySize(context, z);
            return this;
        }
    }

    /* JADX INFO: renamed from: q14$g */
    public static final class C11257g {

        /* JADX INFO: renamed from: e */
        public static final String f72840e = t0i.intToStringMaxRadix(0);

        /* JADX INFO: renamed from: f */
        public static final String f72841f = t0i.intToStringMaxRadix(1);

        /* JADX INFO: renamed from: g */
        public static final String f72842g = t0i.intToStringMaxRadix(2);

        /* JADX INFO: renamed from: a */
        public final int f72843a;

        /* JADX INFO: renamed from: b */
        public final int[] f72844b;

        /* JADX INFO: renamed from: c */
        public final int f72845c;

        /* JADX INFO: renamed from: d */
        public final int f72846d;

        public C11257g(int i, int... iArr) {
            this(i, iArr, 0);
        }

        @ovh
        public static C11257g fromBundle(Bundle bundle) {
            int i = bundle.getInt(f72840e, -1);
            int[] intArray = bundle.getIntArray(f72841f);
            int i2 = bundle.getInt(f72842g, -1);
            v80.checkArgument(i >= 0 && i2 >= 0);
            v80.checkNotNull(intArray);
            return new C11257g(i, intArray, i2);
        }

        public boolean containsTrack(int i) {
            for (int i2 : this.f72844b) {
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
            if (obj == null || C11257g.class != obj.getClass()) {
                return false;
            }
            C11257g c11257g = (C11257g) obj;
            return this.f72843a == c11257g.f72843a && Arrays.equals(this.f72844b, c11257g.f72844b) && this.f72846d == c11257g.f72846d;
        }

        public int hashCode() {
            return (((this.f72843a * 31) + Arrays.hashCode(this.f72844b)) * 31) + this.f72846d;
        }

        @ovh
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putInt(f72840e, this.f72843a);
            bundle.putIntArray(f72841f, this.f72844b);
            bundle.putInt(f72842g, this.f72846d);
            return bundle;
        }

        @ovh
        public C11257g(int i, int[] iArr, int i2) {
            this.f72843a = i;
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
            this.f72844b = iArrCopyOf;
            this.f72845c = iArr.length;
            this.f72846d = i2;
            Arrays.sort(iArrCopyOf);
        }
    }

    /* JADX INFO: renamed from: q14$h */
    @c5e(32)
    public static class C11258h {

        /* JADX INFO: renamed from: a */
        @hib
        public final Spatializer f72847a;

        /* JADX INFO: renamed from: b */
        public final boolean f72848b;

        /* JADX INFO: renamed from: c */
        @hib
        public final Handler f72849c;

        /* JADX INFO: renamed from: d */
        @hib
        public final Spatializer$OnSpatializerStateChangedListener f72850d;

        /* JADX INFO: renamed from: q14$h$a */
        public class a implements Spatializer$OnSpatializerStateChangedListener {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ q14 f72851a;

            public a(q14 q14Var) {
                this.f72851a = q14Var;
            }

            public void onSpatializerAvailableChanged(Spatializer spatializer, boolean z) {
                this.f72851a.maybeInvalidateForAudioChannelCountConstraints();
            }

            public void onSpatializerEnabledChanged(Spatializer spatializer, boolean z) {
                this.f72851a.maybeInvalidateForAudioChannelCountConstraints();
            }
        }

        public C11258h(@hib Context context, q14 q14Var, @hib Boolean bool) {
            AudioManager audioManager = context == null ? null : he0.getAudioManager(context);
            if (audioManager == null || (bool != null && bool.booleanValue())) {
                this.f72847a = null;
                this.f72848b = false;
                this.f72849c = null;
                this.f72850d = null;
                return;
            }
            Spatializer spatializer = audioManager.getSpatializer();
            this.f72847a = spatializer;
            this.f72848b = spatializer.getImmersiveAudioLevel() != 0;
            a aVar = new a(q14Var);
            this.f72850d = aVar;
            Handler handler = new Handler((Looper) v80.checkStateNotNull(Looper.myLooper()));
            this.f72849c = handler;
            Objects.requireNonNull(handler);
            spatializer.addOnSpatializerStateChangedListener(new gp2(handler), aVar);
        }

        public boolean canBeSpatialized(uc0 uc0Var, C1213a c1213a) {
            int i;
            if (Objects.equals(c1213a.f8291o, "audio/eac3-joc")) {
                i = c1213a.f8266G;
                if (i == 16) {
                    i = 12;
                }
            } else if (Objects.equals(c1213a.f8291o, rva.f79839m0)) {
                i = c1213a.f8266G;
                if (i == -1) {
                    i = 6;
                }
            } else if (Objects.equals(c1213a.f8291o, "audio/ac4")) {
                i = c1213a.f8266G;
                if (i == 18 || i == 21) {
                    i = 24;
                }
            } else {
                i = c1213a.f8266G;
            }
            int audioTrackChannelConfig = t0i.getAudioTrackChannelConfig(i);
            if (audioTrackChannelConfig == 0) {
                return false;
            }
            AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(audioTrackChannelConfig);
            int i2 = c1213a.f8267H;
            if (i2 != -1) {
                channelMask.setSampleRate(i2);
            }
            return x14.m24913a(v80.checkNotNull(this.f72847a)).canBeSpatialized(uc0Var.getAudioAttributesV21().f87481a, channelMask.build());
        }

        public boolean isAvailable() {
            return x14.m24913a(v80.checkNotNull(this.f72847a)).isAvailable();
        }

        public boolean isEnabled() {
            return x14.m24913a(v80.checkNotNull(this.f72847a)).isEnabled();
        }

        public boolean isSpatializationSupported() {
            return this.f72848b;
        }

        public void release() {
            Spatializer$OnSpatializerStateChangedListener spatializer$OnSpatializerStateChangedListener;
            Spatializer spatializer = this.f72847a;
            if (spatializer == null || (spatializer$OnSpatializerStateChangedListener = this.f72850d) == null || this.f72849c == null) {
                return;
            }
            spatializer.removeOnSpatializerStateChangedListener(spatializer$OnSpatializerStateChangedListener);
            this.f72849c.removeCallbacksAndMessages(null);
        }
    }

    /* JADX INFO: renamed from: q14$i */
    public static final class C11259i extends AbstractC11260j<C11259i> implements Comparable<C11259i> {

        /* JADX INFO: renamed from: C */
        public final boolean f72853C;

        /* JADX INFO: renamed from: F */
        public final int f72854F;

        /* JADX INFO: renamed from: H */
        public final int f72855H;

        /* JADX INFO: renamed from: L */
        public final int f72856L;

        /* JADX INFO: renamed from: M */
        public final int f72857M;

        /* JADX INFO: renamed from: N */
        public final boolean f72858N;

        /* JADX INFO: renamed from: e */
        public final int f72859e;

        /* JADX INFO: renamed from: f */
        public final boolean f72860f;

        /* JADX INFO: renamed from: m */
        public final boolean f72861m;

        public C11259i(int i, h6h h6hVar, int i2, C11255e c11255e, int i3, @hib String str, @hib String str2) {
            int iM19934r;
            super(i, h6hVar, i2);
            int i4 = 0;
            this.f72860f = InterfaceC1255s.isFormatSupported(i3, false);
            int i5 = this.f72865d.f8281e & (~c11255e.f42824y);
            this.f72861m = (i5 & 1) != 0;
            this.f72853C = (i5 & 2) != 0;
            kx7<String> kx7VarM15111of = str2 != null ? kx7.m15111of(str2) : c11255e.f42821v.isEmpty() ? kx7.m15111of("") : c11255e.f42821v;
            int i6 = 0;
            while (true) {
                if (i6 >= kx7VarM15111of.size()) {
                    i6 = Integer.MAX_VALUE;
                    iM19934r = 0;
                    break;
                } else {
                    iM19934r = q14.m19934r(this.f72865d, kx7VarM15111of.get(i6), c11255e.f42825z);
                    if (iM19934r > 0) {
                        break;
                    } else {
                        i6++;
                    }
                }
            }
            this.f72854F = i6;
            this.f72855H = iM19934r;
            int roleFlagMatchScore = q14.getRoleFlagMatchScore(this.f72865d.f8282f, str2 != null ? 1088 : c11255e.f42822w);
            this.f72856L = roleFlagMatchScore;
            this.f72858N = (1088 & this.f72865d.f8282f) != 0;
            int iM19934r2 = q14.m19934r(this.f72865d, str, q14.m19936t(str) == null);
            this.f72857M = iM19934r2;
            boolean z = iM19934r > 0 || (c11255e.f42821v.isEmpty() && roleFlagMatchScore > 0) || this.f72861m || (this.f72853C && iM19934r2 > 0);
            if (InterfaceC1255s.isFormatSupported(i3, c11255e.f72806B0) && z) {
                i4 = 1;
            }
            this.f72859e = i4;
        }

        public static int compareSelections(List<C11259i> list, List<C11259i> list2) {
            return list.get(0).compareTo(list2.get(0));
        }

        public static kx7<C11259i> createForTrackGroup(int i, h6h h6hVar, C11255e c11255e, int[] iArr, @hib String str, @hib String str2) {
            kx7.C8541a c8541aBuilder = kx7.builder();
            for (int i2 = 0; i2 < h6hVar.f42518a; i2++) {
                c8541aBuilder.add(new C11259i(i, h6hVar, i2, c11255e, iArr[i2], str, str2));
            }
            return c8541aBuilder.build();
        }

        @Override // p000.q14.AbstractC11260j
        public int getSelectionEligibility() {
            return this.f72859e;
        }

        @Override // java.lang.Comparable
        public int compareTo(C11259i c11259i) {
            bd2 bd2VarCompare = bd2.start().compareFalseFirst(this.f72860f, c11259i.f72860f).compare(Integer.valueOf(this.f72854F), Integer.valueOf(c11259i.f72854F), s7c.natural().reverse()).compare(this.f72855H, c11259i.f72855H).compare(this.f72856L, c11259i.f72856L).compareFalseFirst(this.f72861m, c11259i.f72861m).compare(Boolean.valueOf(this.f72853C), Boolean.valueOf(c11259i.f72853C), this.f72855H == 0 ? s7c.natural() : s7c.natural().reverse()).compare(this.f72857M, c11259i.f72857M);
            if (this.f72856L == 0) {
                bd2VarCompare = bd2VarCompare.compareTrueFirst(this.f72858N, c11259i.f72858N);
            }
            return bd2VarCompare.result();
        }

        @Override // p000.q14.AbstractC11260j
        public boolean isCompatibleForAdaptationWith(C11259i c11259i) {
            return false;
        }
    }

    /* JADX INFO: renamed from: q14$j */
    public static abstract class AbstractC11260j<T extends AbstractC11260j<T>> {

        /* JADX INFO: renamed from: a */
        public final int f72862a;

        /* JADX INFO: renamed from: b */
        public final h6h f72863b;

        /* JADX INFO: renamed from: c */
        public final int f72864c;

        /* JADX INFO: renamed from: d */
        public final C1213a f72865d;

        /* JADX INFO: renamed from: q14$j$a */
        public interface a<T extends AbstractC11260j<T>> {
            List<T> create(int i, h6h h6hVar, int[] iArr);
        }

        public AbstractC11260j(int i, h6h h6hVar, int i2) {
            this.f72862a = i;
            this.f72863b = h6hVar;
            this.f72864c = i2;
            this.f72865d = h6hVar.getFormat(i2);
        }

        public abstract int getSelectionEligibility();

        public abstract boolean isCompatibleForAdaptationWith(T t);
    }

    /* JADX INFO: renamed from: q14$k */
    public static final class C11261k extends AbstractC11260j<C11261k> {

        /* JADX INFO: renamed from: c2 */
        public static final float f72866c2 = 10.0f;

        /* JADX INFO: renamed from: C */
        public final boolean f72867C;

        /* JADX INFO: renamed from: F */
        public final boolean f72868F;

        /* JADX INFO: renamed from: H */
        public final int f72869H;

        /* JADX INFO: renamed from: L */
        public final int f72870L;

        /* JADX INFO: renamed from: M */
        public final int f72871M;

        /* JADX INFO: renamed from: M1 */
        public final boolean f72872M1;

        /* JADX INFO: renamed from: N */
        public final int f72873N;

        /* JADX INFO: renamed from: Q */
        public final int f72874Q;

        /* JADX INFO: renamed from: V1 */
        public final int f72875V1;

        /* JADX INFO: renamed from: X */
        public final int f72876X;

        /* JADX INFO: renamed from: Y */
        public final boolean f72877Y;

        /* JADX INFO: renamed from: Z */
        public final int f72878Z;

        /* JADX INFO: renamed from: Z1 */
        public final boolean f72879Z1;

        /* JADX INFO: renamed from: a2 */
        public final boolean f72880a2;

        /* JADX INFO: renamed from: b2 */
        public final int f72881b2;

        /* JADX INFO: renamed from: e */
        public final boolean f72882e;

        /* JADX INFO: renamed from: f */
        public final C11255e f72883f;

        /* JADX INFO: renamed from: m */
        public final boolean f72884m;

        /* JADX WARN: Removed duplicated region for block: B:31:0x004b  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x0079  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public C11261k(int r5, p000.h6h r6, int r7, p000.q14.C11255e r8, int r9, @p000.hib java.lang.String r10, int r11, boolean r12) {
            /*
                Method dump skipped, instruction units count: 317
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.q14.C11261k.<init>(int, h6h, int, q14$e, int, java.lang.String, int, boolean):void");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static int compareNonQualityPreferences(C11261k c11261k, C11261k c11261k2) {
            bd2 bd2VarCompareFalseFirst = bd2.start().compareFalseFirst(c11261k.f72867C, c11261k2.f72867C).compare(Integer.valueOf(c11261k.f72873N), Integer.valueOf(c11261k2.f72873N), s7c.natural().reverse()).compare(c11261k.f72874Q, c11261k2.f72874Q).compare(c11261k.f72876X, c11261k2.f72876X).compareFalseFirst(c11261k.f72877Y, c11261k2.f72877Y).compare(c11261k.f72878Z, c11261k2.f72878Z).compareFalseFirst(c11261k.f72868F, c11261k2.f72868F).compareFalseFirst(c11261k.f72882e, c11261k2.f72882e).compareFalseFirst(c11261k.f72884m, c11261k2.f72884m).compare(Integer.valueOf(c11261k.f72871M), Integer.valueOf(c11261k2.f72871M), s7c.natural().reverse()).compareFalseFirst(c11261k.f72879Z1, c11261k2.f72879Z1).compareFalseFirst(c11261k.f72880a2, c11261k2.f72880a2);
            if (c11261k.f72879Z1 && c11261k.f72880a2) {
                bd2VarCompareFalseFirst = bd2VarCompareFalseFirst.compare(c11261k.f72881b2, c11261k2.f72881b2);
            }
            return bd2VarCompareFalseFirst.result();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static int compareQualityPreferences(C11261k c11261k, C11261k c11261k2) {
            s7c s7cVarReverse = (c11261k.f72882e && c11261k.f72867C) ? q14.f72751r : q14.f72751r.reverse();
            bd2 bd2VarStart = bd2.start();
            if (c11261k.f72883f.f42796B) {
                bd2VarStart = bd2VarStart.compare(Integer.valueOf(c11261k.f72869H), Integer.valueOf(c11261k2.f72869H), q14.f72751r.reverse());
            }
            return bd2VarStart.compare(Integer.valueOf(c11261k.f72870L), Integer.valueOf(c11261k2.f72870L), s7cVarReverse).compare(Integer.valueOf(c11261k.f72869H), Integer.valueOf(c11261k2.f72869H), s7cVarReverse).result();
        }

        public static int compareSelections(List<C11261k> list, List<C11261k> list2) {
            return bd2.start().compare((C11261k) Collections.max(list, new Comparator() { // from class: h24
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return q14.C11261k.compareNonQualityPreferences((q14.C11261k) obj, (q14.C11261k) obj2);
                }
            }), (C11261k) Collections.max(list2, new Comparator() { // from class: h24
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return q14.C11261k.compareNonQualityPreferences((q14.C11261k) obj, (q14.C11261k) obj2);
                }
            }), new Comparator() { // from class: h24
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return q14.C11261k.compareNonQualityPreferences((q14.C11261k) obj, (q14.C11261k) obj2);
                }
            }).compare(list.size(), list2.size()).compare((C11261k) Collections.max(list, new Comparator() { // from class: j24
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return q14.C11261k.compareQualityPreferences((q14.C11261k) obj, (q14.C11261k) obj2);
                }
            }), (C11261k) Collections.max(list2, new Comparator() { // from class: j24
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return q14.C11261k.compareQualityPreferences((q14.C11261k) obj, (q14.C11261k) obj2);
                }
            }), new Comparator() { // from class: j24
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return q14.C11261k.compareQualityPreferences((q14.C11261k) obj, (q14.C11261k) obj2);
                }
            }).result();
        }

        public static kx7<C11261k> createForTrackGroup(int i, h6h h6hVar, C11255e c11255e, int[] iArr, @hib String str, int i2, @hib Point point) {
            int maxVideoPixelsToRetainForViewport = q14.getMaxVideoPixelsToRetainForViewport(h6hVar, point != null ? point.x : c11255e.f42808i, point != null ? point.y : c11255e.f42809j, c11255e.f42811l);
            kx7.C8541a c8541aBuilder = kx7.builder();
            for (int i3 = 0; i3 < h6hVar.f42518a; i3++) {
                int pixelCount = h6hVar.getFormat(i3).getPixelCount();
                c8541aBuilder.add(new C11261k(i, h6hVar, i3, c11255e, iArr[i3], str, i2, maxVideoPixelsToRetainForViewport == Integer.MAX_VALUE || (pixelCount != -1 && pixelCount <= maxVideoPixelsToRetainForViewport)));
            }
            return c8541aBuilder.build();
        }

        private int evaluateSelectionEligibility(int i, int i2) {
            if ((this.f72865d.f8282f & 16384) != 0 || !InterfaceC1255s.isFormatSupported(i, this.f72883f.f72806B0)) {
                return 0;
            }
            if (!this.f72882e && !this.f72883f.f72812q0) {
                return 0;
            }
            if (InterfaceC1255s.isFormatSupported(i, false) && this.f72884m && this.f72882e && this.f72865d.f8286j != -1) {
                C11255e c11255e = this.f72883f;
                if (!c11255e.f42797C && !c11255e.f42796B && (i & i2) != 0) {
                    return 2;
                }
            }
            return 1;
        }

        @Override // p000.q14.AbstractC11260j
        public int getSelectionEligibility() {
            return this.f72875V1;
        }

        @Override // p000.q14.AbstractC11260j
        public boolean isCompatibleForAdaptationWith(C11261k c11261k) {
            return (this.f72872M1 || Objects.equals(this.f72865d.f8291o, c11261k.f72865d.f8291o)) && (this.f72883f.f72815t0 || (this.f72879Z1 == c11261k.f72879Z1 && this.f72880a2 == c11261k.f72880a2));
        }
    }

    public q14(Context context) {
        this(context, new C10958ph.b());
    }

    private static void applyLegacyRendererOverrides(rt9.C12281a c12281a, C11255e c11255e, of5.C10355a[] c10355aArr) {
        int rendererCount = c12281a.getRendererCount();
        for (int i = 0; i < rendererCount; i++) {
            n6h trackGroups = c12281a.getTrackGroups(i);
            if (c11255e.hasSelectionOverride(i, trackGroups)) {
                C11257g selectionOverride = c11255e.getSelectionOverride(i, trackGroups);
                c10355aArr[i] = (selectionOverride == null || selectionOverride.f72844b.length == 0) ? null : new of5.C10355a(trackGroups.get(selectionOverride.f72843a), selectionOverride.f72844b, selectionOverride.f72846d);
            }
        }
    }

    private static void applyTrackSelectionOverrides(rt9.C12281a c12281a, h7h h7hVar, of5.C10355a[] c10355aArr) {
        int rendererCount = c12281a.getRendererCount();
        HashMap map = new HashMap();
        for (int i = 0; i < rendererCount; i++) {
            collectTrackSelectionOverrides(c12281a.getTrackGroups(i), h7hVar, map);
        }
        collectTrackSelectionOverrides(c12281a.getUnmappedTrackGroups(), h7hVar, map);
        for (int i2 = 0; i2 < rendererCount; i2++) {
            e7h e7hVar = (e7h) map.get(Integer.valueOf(c12281a.getRendererType(i2)));
            if (e7hVar != null) {
                c10355aArr[i2] = (e7hVar.f32080b.isEmpty() || c12281a.getTrackGroups(i2).indexOf(e7hVar.f32079a) == -1) ? null : new of5.C10355a(e7hVar.f32079a, rd8.toArray(e7hVar.f32080b));
            }
        }
    }

    private static void collectTrackSelectionOverrides(n6h n6hVar, h7h h7hVar, Map<Integer, e7h> map) {
        e7h e7hVar;
        for (int i = 0; i < n6hVar.f63418a; i++) {
            e7h e7hVar2 = h7hVar.f42798D.get(n6hVar.get(i));
            if (e7hVar2 != null && ((e7hVar = map.get(Integer.valueOf(e7hVar2.getType()))) == null || (e7hVar.f32080b.isEmpty() && !e7hVar2.f32080b.isEmpty()))) {
                map.put(Integer.valueOf(e7hVar2.getType()), e7hVar2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getMaxVideoPixelsToRetainForViewport(h6h h6hVar, int i, int i2, boolean z) {
        int i3;
        int i4 = Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE && i2 != Integer.MAX_VALUE) {
            for (int i5 = 0; i5 < h6hVar.f42518a; i5++) {
                C1213a format = h6hVar.getFormat(i5);
                int i6 = format.f8298v;
                if (i6 > 0 && (i3 = format.f8299w) > 0) {
                    Point maxVideoSizeInViewport = k7h.getMaxVideoSizeInViewport(z, i, i2, i6, i3);
                    int i7 = format.f8298v;
                    int i8 = format.f8299w;
                    int i9 = i7 * i8;
                    if (i7 >= ((int) (maxVideoSizeInViewport.x * 0.98f)) && i8 >= ((int) (maxVideoSizeInViewport.y * 0.98f)) && i9 < i4) {
                        i4 = i9;
                    }
                }
            }
        }
        return i4;
    }

    @hib
    private static String getPreferredLanguageFromCaptioningManager(@hib Context context) {
        CaptioningManager captioningManager;
        Locale locale;
        if (context == null || (captioningManager = (CaptioningManager) context.getSystemService("captioning")) == null || !captioningManager.isEnabled() || (locale = captioningManager.getLocale()) == null) {
            return null;
        }
        return t0i.getLocaleLanguageTag(locale);
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
    /* JADX INFO: renamed from: isAudioFormatWithinAudioChannelCountConstraints, reason: merged with bridge method [inline-methods] */
    public boolean lambda$selectAudioTrack$2(C1213a c1213a, C11255e c11255e) {
        Boolean bool;
        int i;
        C11258h c11258h;
        C11258h c11258h2;
        return !c11255e.f72805A0 || ((bool = this.f72759k) != null && bool.booleanValue()) || (i = c1213a.f8266G) == -1 || i <= 2 || ((isDolbyAudio(c1213a) && (Build.VERSION.SDK_INT < 32 || (c11258h2 = this.f72757i) == null || !c11258h2.isSpatializationSupported())) || (Build.VERSION.SDK_INT >= 32 && (c11258h = this.f72757i) != null && c11258h.isSpatializationSupported() && this.f72757i.isAvailable() && this.f72757i.isEnabled() && this.f72757i.canBeSpatialized(this.f72758j, c1213a)));
    }

    private static boolean isDolbyAudio(C1213a c1213a) {
        String str = c1213a.f8291o;
        if (str == null) {
            return false;
        }
        str.hashCode();
        switch (str) {
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isObjectBasedAudio(C1213a c1213a) {
        String str = c1213a.f8291o;
        if (str == null) {
            return false;
        }
        str.hashCode();
        switch (str) {
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List lambda$selectAudioTrack$3(final C11255e c11255e, boolean z, int[] iArr, int i, h6h h6hVar, int[] iArr2) {
        return C11252b.createForTrackGroup(i, h6hVar, c11255e, iArr2, z, new l8d() { // from class: e14
            @Override // p000.l8d
            public final boolean apply(Object obj) {
                return this.f31495a.lambda$selectAudioTrack$2(c11255e, (C1213a) obj);
            }
        }, iArr[i]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List lambda$selectImageTrack$5(C11255e c11255e, int i, h6h h6hVar, int[] iArr) {
        return C11253c.createForTrackGroup(i, h6hVar, c11255e, iArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List lambda$selectTextTrack$4(C11255e c11255e, String str, String str2, int i, h6h h6hVar, int[] iArr) {
        return C11259i.createForTrackGroup(i, h6hVar, c11255e, iArr, str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List lambda$selectVideoTrack$1(C11255e c11255e, String str, int[] iArr, Point point, int i, h6h h6hVar, int[] iArr2) {
        return C11261k.createForTrackGroup(i, h6hVar, c11255e, iArr2, str, iArr[i], point);
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

    private static void maybeConfigureRendererForOffload(C11255e c11255e, rt9.C12281a c12281a, int[][][] iArr, s1e[] s1eVarArr, of5[] of5VarArr) {
        int i = -1;
        boolean z = false;
        int i2 = 0;
        for (int i3 = 0; i3 < c12281a.getRendererCount(); i3++) {
            int rendererType = c12281a.getRendererType(i3);
            of5 of5Var = of5VarArr[i3];
            if (rendererType != 1 && of5Var != null) {
                return;
            }
            if (rendererType == 1 && of5Var != null && of5Var.length() == 1) {
                if (rendererSupportsOffload(c11255e, iArr[i3][c12281a.getTrackGroups(i3).indexOf(of5Var.getTrackGroup())][of5Var.getIndexInTrackGroup(0)], of5Var.getSelectedFormat())) {
                    i2++;
                    i = i3;
                }
            }
        }
        if (i2 == 1) {
            int i4 = c11255e.f42820u.f42834b ? 1 : 2;
            s1e s1eVar = s1eVarArr[i];
            if (s1eVar != null && s1eVar.f80390b) {
                z = true;
            }
            s1eVarArr[i] = new s1e(i4, z);
        }
    }

    private static void maybeConfigureRenderersForTunneling(rt9.C12281a c12281a, int[][][] iArr, s1e[] s1eVarArr, of5[] of5VarArr) {
        boolean z;
        int i = -1;
        int i2 = -1;
        for (int i3 = 0; i3 < c12281a.getRendererCount(); i3++) {
            int rendererType = c12281a.getRendererType(i3);
            of5 of5Var = of5VarArr[i3];
            if ((rendererType == 1 || rendererType == 2) && of5Var != null && rendererSupportsTunneling(iArr[i3], c12281a.getTrackGroups(i3), of5Var)) {
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
        if (z && ((i2 == -1 || i == -1) ? false : true)) {
            s1e s1eVar = new s1e(0, true);
            s1eVarArr[i2] = s1eVar;
            s1eVarArr[i] = s1eVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void maybeInvalidateForAudioChannelCountConstraints() {
        boolean z;
        C11258h c11258h;
        synchronized (this.f72752d) {
            try {
                z = this.f72755g.f72805A0 && Build.VERSION.SDK_INT >= 32 && (c11258h = this.f72757i) != null && c11258h.isSpatializationSupported();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            m18396b();
        }
    }

    private void maybeInvalidateForRendererCapabilitiesChange(InterfaceC1254q interfaceC1254q) {
        boolean z;
        synchronized (this.f72752d) {
            z = this.f72755g.f72809E0;
        }
        if (z) {
            m18397c(interfaceC1254q);
        }
    }

    /* JADX INFO: renamed from: r */
    public static int m19934r(C1213a c1213a, @hib String str, boolean z) {
        if (!TextUtils.isEmpty(str) && str.equals(c1213a.f8280d)) {
            return 4;
        }
        String strM19936t = m19936t(str);
        String strM19936t2 = m19936t(c1213a.f8280d);
        if (strM19936t2 == null || strM19936t == null) {
            return (z && strM19936t2 == null) ? 1 : 0;
        }
        if (strM19936t2.startsWith(strM19936t) || strM19936t.startsWith(strM19936t2)) {
            return 3;
        }
        return t0i.splitAtFirst(strM19936t2, "-")[0].equals(t0i.splitAtFirst(strM19936t, "-")[0]) ? 2 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean rendererSupportsOffload(C11255e c11255e, int i, C1213a c1213a) {
        if (InterfaceC1255s.getAudioOffloadSupport(i) == 0) {
            return false;
        }
        if (c11255e.f42820u.f42835c && (InterfaceC1255s.getAudioOffloadSupport(i) & 2048) == 0) {
            return false;
        }
        if (c11255e.f42820u.f42834b) {
            return !(c1213a.f8269J != 0 || c1213a.f8270K != 0) || ((InterfaceC1255s.getAudioOffloadSupport(i) & 1024) != 0);
        }
        return true;
    }

    private static boolean rendererSupportsTunneling(int[][] iArr, n6h n6hVar, of5 of5Var) {
        if (of5Var == null) {
            return false;
        }
        int iIndexOf = n6hVar.indexOf(of5Var.getTrackGroup());
        for (int i = 0; i < of5Var.length(); i++) {
            if (InterfaceC1255s.getTunnelingSupport(iArr[iIndexOf][of5Var.getIndexInTrackGroup(i)]) != 32) {
                return false;
            }
        }
        return true;
    }

    @Deprecated
    /* JADX INFO: renamed from: s */
    public static boolean m19935s(int i, boolean z) {
        return InterfaceC1255s.isFormatSupported(i, z);
    }

    @hib
    private <T extends AbstractC11260j<T>> Pair<of5.C10355a, Integer> selectTracksForType(int i, rt9.C12281a c12281a, int[][][] iArr, AbstractC11260j.a<T> aVar, Comparator<List<T>> comparator) {
        int i2;
        RandomAccess randomAccessM15111of;
        rt9.C12281a c12281a2 = c12281a;
        ArrayList arrayList = new ArrayList();
        int rendererCount = c12281a.getRendererCount();
        int i3 = 0;
        while (i3 < rendererCount) {
            if (i == c12281a2.getRendererType(i3)) {
                n6h trackGroups = c12281a2.getTrackGroups(i3);
                for (int i4 = 0; i4 < trackGroups.f63418a; i4++) {
                    h6h h6hVar = trackGroups.get(i4);
                    List<T> listCreate = aVar.create(i3, h6hVar, iArr[i3][i4]);
                    boolean[] zArr = new boolean[h6hVar.f42518a];
                    int i5 = 0;
                    while (i5 < h6hVar.f42518a) {
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
                                while (i6 < h6hVar.f42518a) {
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
            c12281a2 = c12281a;
            rendererCount = rendererCount;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i8 = 0; i8 < list.size(); i8++) {
            iArr2[i8] = ((AbstractC11260j) list.get(i8)).f72864c;
        }
        AbstractC11260j abstractC11260j = (AbstractC11260j) list.get(0);
        return Pair.create(new of5.C10355a(abstractC11260j.f72863b, iArr2), Integer.valueOf(abstractC11260j.f72862a));
    }

    private void setParametersInternal(C11255e c11255e) {
        boolean zEquals;
        v80.checkNotNull(c11255e);
        synchronized (this.f72752d) {
            zEquals = this.f72755g.equals(c11255e);
            this.f72755g = c11255e;
        }
        if (zEquals) {
            return;
        }
        if (c11255e.f72805A0 && this.f72753e == null) {
            xh9.m25148w("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
        m18396b();
    }

    @hib
    /* JADX INFO: renamed from: t */
    public static String m19936t(@hib String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    public C11255e.a buildUponParameters() {
        return getParameters().buildUpon();
    }

    @Override // p000.rt9
    /* JADX INFO: renamed from: d */
    public final Pair<s1e[], of5[]> mo19937d(rt9.C12281a c12281a, int[][][] iArr, int[] iArr2, una.C13612b c13612b, q1h q1hVar) throws aa5 {
        C11255e c11255e;
        Context context;
        synchronized (this.f72752d) {
            this.f72756h = Thread.currentThread();
            c11255e = this.f72755g;
        }
        if (this.f72759k == null && (context = this.f72753e) != null) {
            this.f72759k = Boolean.valueOf(t0i.isTv(context));
        }
        if (c11255e.f72805A0 && Build.VERSION.SDK_INT >= 32 && this.f72757i == null) {
            this.f72757i = new C11258h(this.f72753e, this, this.f72759k);
        }
        int rendererCount = c12281a.getRendererCount();
        of5.C10355a[] c10355aArrM19938u = m19938u(c12281a, iArr, iArr2, c11255e);
        applyTrackSelectionOverrides(c12281a, c11255e, c10355aArrM19938u);
        applyLegacyRendererOverrides(c12281a, c11255e, c10355aArrM19938u);
        for (int i = 0; i < rendererCount; i++) {
            int rendererType = c12281a.getRendererType(i);
            if (c11255e.getRendererDisabled(i) || c11255e.f42799E.contains(Integer.valueOf(rendererType))) {
                c10355aArrM19938u[i] = null;
            }
        }
        of5[] of5VarArrCreateTrackSelections = this.f72754f.createTrackSelections(c10355aArrM19938u, m18395a(), c13612b, q1hVar);
        s1e[] s1eVarArr = new s1e[rendererCount];
        for (int i2 = 0; i2 < rendererCount; i2++) {
            s1eVarArr[i2] = (c11255e.getRendererDisabled(i2) || c11255e.f42799E.contains(Integer.valueOf(c12281a.getRendererType(i2))) || (c12281a.getRendererType(i2) != -2 && of5VarArrCreateTrackSelections[i2] == null)) ? null : s1e.f80388c;
        }
        if (c11255e.f72807C0) {
            maybeConfigureRenderersForTunneling(c12281a, iArr, s1eVarArr, of5VarArrCreateTrackSelections);
        }
        if (c11255e.f42820u.f42833a != 0) {
            maybeConfigureRendererForOffload(c11255e, c12281a, iArr, s1eVarArr, of5VarArrCreateTrackSelections);
        }
        return Pair.create(s1eVarArr, of5VarArrCreateTrackSelections);
    }

    @Override // p000.o7h
    @hib
    public InterfaceC1255s.f getRendererCapabilitiesListener() {
        return this;
    }

    @Override // p000.o7h
    public boolean isSetParametersSupported() {
        return true;
    }

    @Override // androidx.media3.exoplayer.InterfaceC1255s.f
    public void onRendererCapabilitiesChanged(InterfaceC1254q interfaceC1254q) {
        maybeInvalidateForRendererCapabilitiesChange(interfaceC1254q);
    }

    @Override // p000.o7h
    public void release() {
        C11258h c11258h;
        synchronized (this.f72752d) {
            try {
                Thread thread = this.f72756h;
                if (thread != null) {
                    v80.checkState(thread == Thread.currentThread(), "DefaultTrackSelector is accessed on the wrong thread.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (Build.VERSION.SDK_INT >= 32 && (c11258h = this.f72757i) != null) {
            c11258h.release();
            this.f72757i = null;
        }
        super.release();
    }

    @Override // p000.o7h
    public void setAudioAttributes(uc0 uc0Var) {
        if (this.f72758j.equals(uc0Var)) {
            return;
        }
        this.f72758j = uc0Var;
        maybeInvalidateForAudioChannelCountConstraints();
    }

    @Override // p000.o7h
    public void setParameters(h7h h7hVar) {
        if (h7hVar instanceof C11255e) {
            setParametersInternal((C11255e) h7hVar);
        }
        setParametersInternal(new C11255e.a().mo12257F(h7hVar).build());
    }

    /* JADX INFO: renamed from: u */
    public of5.C10355a[] m19938u(rt9.C12281a c12281a, int[][][] iArr, int[] iArr2, C11255e c11255e) throws aa5 {
        String str;
        int rendererCount = c12281a.getRendererCount();
        of5.C10355a[] c10355aArr = new of5.C10355a[rendererCount];
        Pair<of5.C10355a, Integer> pairM19939v = m19939v(c12281a, iArr, iArr2, c11255e);
        if (pairM19939v != null) {
            c10355aArr[((Integer) pairM19939v.second).intValue()] = (of5.C10355a) pairM19939v.first;
        }
        if (pairM19939v == null) {
            str = null;
        } else {
            Object obj = pairM19939v.first;
            str = ((of5.C10355a) obj).f67489a.getFormat(((of5.C10355a) obj).f67490b[0]).f8280d;
        }
        Pair<of5.C10355a, Integer> pairM19943z = m19943z(c12281a, iArr, iArr2, c11255e, str);
        Pair<of5.C10355a, Integer> pairM19940w = (c11255e.f42795A || pairM19943z == null) ? m19940w(c12281a, iArr, c11255e) : null;
        if (pairM19940w != null) {
            c10355aArr[((Integer) pairM19940w.second).intValue()] = (of5.C10355a) pairM19940w.first;
        } else if (pairM19943z != null) {
            c10355aArr[((Integer) pairM19943z.second).intValue()] = (of5.C10355a) pairM19943z.first;
        }
        Pair<of5.C10355a, Integer> pairM19942y = m19942y(c12281a, iArr, c11255e, str);
        if (pairM19942y != null) {
            c10355aArr[((Integer) pairM19942y.second).intValue()] = (of5.C10355a) pairM19942y.first;
        }
        for (int i = 0; i < rendererCount; i++) {
            int rendererType = c12281a.getRendererType(i);
            if (rendererType != 2 && rendererType != 1 && rendererType != 3 && rendererType != 4) {
                c10355aArr[i] = m19941x(rendererType, c12281a.getTrackGroups(i), iArr[i], c11255e);
            }
        }
        return c10355aArr;
    }

    @hib
    /* JADX INFO: renamed from: v */
    public Pair<of5.C10355a, Integer> m19939v(rt9.C12281a c12281a, int[][][] iArr, final int[] iArr2, final C11255e c11255e) throws aa5 {
        final boolean z = false;
        int i = 0;
        while (true) {
            if (i < c12281a.getRendererCount()) {
                if (2 == c12281a.getRendererType(i) && c12281a.getTrackGroups(i).f63418a > 0) {
                    z = true;
                    break;
                }
                i++;
            } else {
                break;
            }
        }
        return selectTracksForType(1, c12281a, iArr, new AbstractC11260j.a() { // from class: k14
            @Override // p000.q14.AbstractC11260j.a
            public final List create(int i2, h6h h6hVar, int[] iArr3) {
                return this.f52362a.lambda$selectAudioTrack$3(c11255e, z, iArr2, i2, h6hVar, iArr3);
            }
        }, new Comparator() { // from class: m14
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return q14.C11252b.compareSelections((List) obj, (List) obj2);
            }
        });
    }

    @hib
    /* JADX INFO: renamed from: w */
    public Pair<of5.C10355a, Integer> m19940w(rt9.C12281a c12281a, int[][][] iArr, final C11255e c11255e) throws aa5 {
        if (c11255e.f42820u.f42833a == 2) {
            return null;
        }
        return selectTracksForType(4, c12281a, iArr, new AbstractC11260j.a() { // from class: a14
            @Override // p000.q14.AbstractC11260j.a
            public final List create(int i, h6h h6hVar, int[] iArr2) {
                return q14.lambda$selectImageTrack$5(c11255e, i, h6hVar, iArr2);
            }
        }, new Comparator() { // from class: c14
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return q14.C11253c.compareSelections((List) obj, (List) obj2);
            }
        });
    }

    @hib
    /* JADX INFO: renamed from: x */
    public of5.C10355a m19941x(int i, n6h n6hVar, int[][] iArr, C11255e c11255e) throws aa5 {
        if (c11255e.f42820u.f42833a == 2) {
            return null;
        }
        int i2 = 0;
        h6h h6hVar = null;
        C11254d c11254d = null;
        for (int i3 = 0; i3 < n6hVar.f63418a; i3++) {
            h6h h6hVar2 = n6hVar.get(i3);
            int[] iArr2 = iArr[i3];
            for (int i4 = 0; i4 < h6hVar2.f42518a; i4++) {
                if (InterfaceC1255s.isFormatSupported(iArr2[i4], c11255e.f72806B0)) {
                    C11254d c11254d2 = new C11254d(h6hVar2.getFormat(i4), iArr2[i4]);
                    if (c11254d == null || c11254d2.compareTo(c11254d) > 0) {
                        h6hVar = h6hVar2;
                        i2 = i4;
                        c11254d = c11254d2;
                    }
                }
            }
        }
        if (h6hVar == null) {
            return null;
        }
        return new of5.C10355a(h6hVar, i2);
    }

    @hib
    /* JADX INFO: renamed from: y */
    public Pair<of5.C10355a, Integer> m19942y(rt9.C12281a c12281a, int[][][] iArr, final C11255e c11255e, @hib final String str) throws aa5 {
        if (c11255e.f42820u.f42833a == 2) {
            return null;
        }
        final String preferredLanguageFromCaptioningManager = c11255e.f42823x ? getPreferredLanguageFromCaptioningManager(this.f72753e) : null;
        return selectTracksForType(3, c12281a, iArr, new AbstractC11260j.a() { // from class: o14
            @Override // p000.q14.AbstractC11260j.a
            public final List create(int i, h6h h6hVar, int[] iArr2) {
                return q14.lambda$selectTextTrack$4(c11255e, str, preferredLanguageFromCaptioningManager, i, h6hVar, iArr2);
            }
        }, new Comparator() { // from class: p14
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return q14.C11259i.compareSelections((List) obj, (List) obj2);
            }
        });
    }

    @hib
    /* JADX INFO: renamed from: z */
    public Pair<of5.C10355a, Integer> m19943z(rt9.C12281a c12281a, int[][][] iArr, final int[] iArr2, final C11255e c11255e, @hib final String str) throws aa5 {
        Context context;
        final Point currentDisplayModeSize = null;
        if (c11255e.f42820u.f42833a == 2) {
            return null;
        }
        if (c11255e.f42810k && (context = this.f72753e) != null) {
            currentDisplayModeSize = t0i.getCurrentDisplayModeSize(context);
        }
        return selectTracksForType(2, c12281a, iArr, new AbstractC11260j.a() { // from class: g14
            @Override // p000.q14.AbstractC11260j.a
            public final List create(int i, h6h h6hVar, int[] iArr3) {
                return q14.lambda$selectVideoTrack$1(c11255e, str, iArr2, currentDisplayModeSize, i, h6hVar, iArr3);
            }
        }, new Comparator() { // from class: i14
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return q14.C11261k.compareSelections((List) obj, (List) obj2);
            }
        });
    }

    public q14(Context context, of5.InterfaceC10356b interfaceC10356b) {
        this(context, C11255e.f72784H0, interfaceC10356b);
    }

    @Override // p000.o7h
    public C11255e getParameters() {
        C11255e c11255e;
        synchronized (this.f72752d) {
            c11255e = this.f72755g;
        }
        return c11255e;
    }

    public q14(Context context, h7h h7hVar) {
        this(context, h7hVar, new C10958ph.b());
    }

    @Deprecated
    public q14(h7h h7hVar, of5.InterfaceC10356b interfaceC10356b) {
        this(h7hVar, interfaceC10356b, (Context) null);
    }

    public q14(Context context, h7h h7hVar, of5.InterfaceC10356b interfaceC10356b) {
        this(h7hVar, interfaceC10356b, context);
    }

    @Deprecated
    public void setParameters(C11256f c11256f) {
        setParametersInternal(c11256f.build());
    }

    private q14(h7h h7hVar, of5.InterfaceC10356b interfaceC10356b, @hib Context context) {
        this.f72752d = new Object();
        this.f72753e = context != null ? context.getApplicationContext() : null;
        this.f72754f = interfaceC10356b;
        if (h7hVar instanceof C11255e) {
            this.f72755g = (C11255e) h7hVar;
        } else {
            this.f72755g = C11255e.f72784H0.buildUpon().mo12257F(h7hVar).build();
        }
        this.f72758j = uc0.f87467h;
        if (this.f72755g.f72805A0 && context == null) {
            xh9.m25148w("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }

    public void setParameters(C11255e.a aVar) {
        setParametersInternal(aVar.build());
    }
}
