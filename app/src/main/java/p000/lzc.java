package p000;

import android.os.Bundle;
import android.os.Looper;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import com.google.android.exoplayer2.metadata.Metadata;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.List;
import p000.gh1;
import p000.i36;
import p000.lzc;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public interface lzc {

    /* JADX INFO: renamed from: A */
    public static final int f59338A = 0;

    /* JADX INFO: renamed from: A0 */
    public static final int f59339A0 = 14;

    /* JADX INFO: renamed from: B */
    public static final int f59340B = 1;

    /* JADX INFO: renamed from: B0 */
    public static final int f59341B0 = 15;

    /* JADX INFO: renamed from: C */
    public static final int f59342C = 2;

    /* JADX INFO: renamed from: C0 */
    public static final int f59343C0 = 16;

    /* JADX INFO: renamed from: D */
    public static final int f59344D = 3;

    /* JADX INFO: renamed from: D0 */
    public static final int f59345D0 = 17;

    /* JADX INFO: renamed from: E */
    public static final int f59346E = 0;

    /* JADX INFO: renamed from: E0 */
    @Deprecated
    public static final int f59347E0 = 18;

    /* JADX INFO: renamed from: F */
    public static final int f59348F = 1;

    /* JADX INFO: renamed from: F0 */
    public static final int f59349F0 = 18;

    /* JADX INFO: renamed from: G */
    public static final int f59350G = 2;

    /* JADX INFO: renamed from: G0 */
    @Deprecated
    public static final int f59351G0 = 19;

    /* JADX INFO: renamed from: H */
    public static final int f59352H = 3;

    /* JADX INFO: renamed from: H0 */
    public static final int f59353H0 = 19;

    /* JADX INFO: renamed from: I */
    public static final int f59354I = 4;

    /* JADX INFO: renamed from: I0 */
    public static final int f59355I0 = 31;

    /* JADX INFO: renamed from: J */
    public static final int f59356J = 5;

    /* JADX INFO: renamed from: J0 */
    public static final int f59357J0 = 20;

    /* JADX INFO: renamed from: K */
    public static final int f59358K = 6;

    /* JADX INFO: renamed from: K0 */
    public static final int f59359K0 = 21;

    /* JADX INFO: renamed from: L */
    public static final int f59360L = 7;

    /* JADX INFO: renamed from: L0 */
    public static final int f59361L0 = 22;

    /* JADX INFO: renamed from: M */
    public static final int f59362M = 8;

    /* JADX INFO: renamed from: M0 */
    public static final int f59363M0 = 23;

    /* JADX INFO: renamed from: N */
    public static final int f59364N = 9;

    /* JADX INFO: renamed from: N0 */
    public static final int f59365N0 = 24;

    /* JADX INFO: renamed from: O */
    public static final int f59366O = 10;

    /* JADX INFO: renamed from: O0 */
    @Deprecated
    public static final int f59367O0 = 25;

    /* JADX INFO: renamed from: P */
    public static final int f59368P = 11;

    /* JADX INFO: renamed from: P0 */
    public static final int f59369P0 = 33;

    /* JADX INFO: renamed from: Q */
    public static final int f59370Q = 12;

    /* JADX INFO: renamed from: Q0 */
    @Deprecated
    public static final int f59371Q0 = 26;

    /* JADX INFO: renamed from: R */
    public static final int f59372R = 13;

    /* JADX INFO: renamed from: R0 */
    public static final int f59373R0 = 34;

    /* JADX INFO: renamed from: S */
    public static final int f59374S = 14;

    /* JADX INFO: renamed from: S0 */
    public static final int f59375S0 = 27;

    /* JADX INFO: renamed from: T */
    public static final int f59376T = 15;

    /* JADX INFO: renamed from: T0 */
    public static final int f59377T0 = 28;

    /* JADX INFO: renamed from: U */
    public static final int f59378U = 16;

    /* JADX INFO: renamed from: U0 */
    public static final int f59379U0 = 29;

    /* JADX INFO: renamed from: V */
    public static final int f59380V = 17;

    /* JADX INFO: renamed from: V0 */
    public static final int f59381V0 = 30;

    /* JADX INFO: renamed from: W */
    public static final int f59382W = 18;

    /* JADX INFO: renamed from: W0 */
    public static final int f59383W0 = 32;

    /* JADX INFO: renamed from: X */
    public static final int f59384X = 19;

    /* JADX INFO: renamed from: X0 */
    public static final int f59385X0 = -1;

    /* JADX INFO: renamed from: Y */
    public static final int f59386Y = 20;

    /* JADX INFO: renamed from: Z */
    public static final int f59387Z = 21;

    /* JADX INFO: renamed from: a0 */
    public static final int f59388a0 = 22;

    /* JADX INFO: renamed from: b0 */
    public static final int f59389b0 = 23;

    /* JADX INFO: renamed from: c */
    public static final int f59390c = 1;

    /* JADX INFO: renamed from: c0 */
    public static final int f59391c0 = 24;

    /* JADX INFO: renamed from: d */
    public static final int f59392d = 2;

    /* JADX INFO: renamed from: d0 */
    public static final int f59393d0 = 25;

    /* JADX INFO: renamed from: e */
    public static final int f59394e = 3;

    /* JADX INFO: renamed from: e0 */
    public static final int f59395e0 = 26;

    /* JADX INFO: renamed from: f */
    public static final int f59396f = 4;

    /* JADX INFO: renamed from: f0 */
    public static final int f59397f0 = 27;

    /* JADX INFO: renamed from: g */
    public static final int f59398g = 1;

    /* JADX INFO: renamed from: g0 */
    public static final int f59399g0 = 28;

    /* JADX INFO: renamed from: h */
    public static final int f59400h = 2;

    /* JADX INFO: renamed from: h0 */
    public static final int f59401h0 = 29;

    /* JADX INFO: renamed from: i */
    public static final int f59402i = 3;

    /* JADX INFO: renamed from: i0 */
    public static final int f59403i0 = 30;

    /* JADX INFO: renamed from: j */
    public static final int f59404j = 4;

    /* JADX INFO: renamed from: j0 */
    public static final int f59405j0 = 1;

    /* JADX INFO: renamed from: k */
    public static final int f59406k = 5;

    /* JADX INFO: renamed from: k0 */
    public static final int f59407k0 = 2;

    /* JADX INFO: renamed from: l */
    public static final int f59408l = 6;

    /* JADX INFO: renamed from: l0 */
    public static final int f59409l0 = 3;

    /* JADX INFO: renamed from: m */
    public static final int f59410m = 0;

    /* JADX INFO: renamed from: m0 */
    public static final int f59411m0 = 4;

    /* JADX INFO: renamed from: n */
    public static final int f59412n = 1;

    /* JADX INFO: renamed from: n0 */
    public static final int f59413n0 = 5;

    /* JADX INFO: renamed from: o */
    public static final int f59414o = 2;

    /* JADX INFO: renamed from: o0 */
    @Deprecated
    public static final int f59415o0 = 5;

    /* JADX INFO: renamed from: p */
    public static final int f59416p = 0;

    /* JADX INFO: renamed from: p0 */
    public static final int f59417p0 = 6;

    /* JADX INFO: renamed from: q */
    public static final int f59418q = 1;

    /* JADX INFO: renamed from: q0 */
    @Deprecated
    public static final int f59419q0 = 6;

    /* JADX INFO: renamed from: r */
    public static final int f59420r = 2;

    /* JADX INFO: renamed from: r0 */
    public static final int f59421r0 = 7;

    /* JADX INFO: renamed from: s */
    public static final int f59422s = 0;

    /* JADX INFO: renamed from: s0 */
    public static final int f59423s0 = 8;

    /* JADX INFO: renamed from: t */
    public static final int f59424t = 1;

    /* JADX INFO: renamed from: t0 */
    @Deprecated
    public static final int f59425t0 = 8;

    /* JADX INFO: renamed from: u */
    public static final int f59426u = 2;

    /* JADX INFO: renamed from: u0 */
    public static final int f59427u0 = 9;

    /* JADX INFO: renamed from: v */
    public static final int f59428v = 3;

    /* JADX INFO: renamed from: v0 */
    public static final int f59429v0 = 10;

    /* JADX INFO: renamed from: w */
    public static final int f59430w = 4;

    /* JADX INFO: renamed from: w0 */
    @Deprecated
    public static final int f59431w0 = 10;

    /* JADX INFO: renamed from: x */
    public static final int f59432x = 5;

    /* JADX INFO: renamed from: x0 */
    public static final int f59433x0 = 11;

    /* JADX INFO: renamed from: y */
    public static final int f59434y = 0;

    /* JADX INFO: renamed from: y0 */
    public static final int f59435y0 = 12;

    /* JADX INFO: renamed from: z */
    public static final int f59436z = 1;

    /* JADX INFO: renamed from: z0 */
    public static final int f59437z0 = 13;

    /* JADX INFO: renamed from: lzc$b */
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC9044b {
    }

    /* JADX INFO: renamed from: lzc$c */
    public static final class C9045c implements gh1 {

        /* JADX INFO: renamed from: b */
        public static final C9045c f59438b = new a().build();

        /* JADX INFO: renamed from: c */
        public static final String f59439c = x0i.intToStringMaxRadix(0);

        /* JADX INFO: renamed from: d */
        public static final gh1.InterfaceC6311a<C9045c> f59440d = new gh1.InterfaceC6311a() { // from class: jzc
            @Override // p000.gh1.InterfaceC6311a
            public final gh1 fromBundle(Bundle bundle) {
                return lzc.C9045c.fromBundle(bundle);
            }
        };

        /* JADX INFO: renamed from: a */
        public final i36 f59441a;

        /* JADX INFO: renamed from: lzc$c$a */
        public static final class a {

            /* JADX INFO: renamed from: b */
            public static final int[] f59442b = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 31, 20, 21, 22, 23, 24, 25, 33, 26, 34, 27, 28, 29, 30, 32};

            /* JADX INFO: renamed from: a */
            public final i36.C7126b f59443a;

            @op1
            public a add(int i) {
                this.f59443a.add(i);
                return this;
            }

            @op1
            public a addAll(int... iArr) {
                this.f59443a.addAll(iArr);
                return this;
            }

            @op1
            public a addAllCommands() {
                this.f59443a.addAll(f59442b);
                return this;
            }

            @op1
            public a addIf(int i, boolean z) {
                this.f59443a.addIf(i, z);
                return this;
            }

            public C9045c build() {
                return new C9045c(this.f59443a.build());
            }

            @op1
            public a remove(int i) {
                this.f59443a.remove(i);
                return this;
            }

            @op1
            public a removeAll(int... iArr) {
                this.f59443a.removeAll(iArr);
                return this;
            }

            @op1
            public a removeIf(int i, boolean z) {
                this.f59443a.removeIf(i, z);
                return this;
            }

            public a() {
                this.f59443a = new i36.C7126b();
            }

            @op1
            public a addAll(C9045c c9045c) {
                this.f59443a.addAll(c9045c.f59441a);
                return this;
            }

            private a(C9045c c9045c) {
                i36.C7126b c7126b = new i36.C7126b();
                this.f59443a = c7126b;
                c7126b.addAll(c9045c.f59441a);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static C9045c fromBundle(Bundle bundle) {
            ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList(f59439c);
            if (integerArrayList == null) {
                return f59438b;
            }
            a aVar = new a();
            for (int i = 0; i < integerArrayList.size(); i++) {
                aVar.add(integerArrayList.get(i).intValue());
            }
            return aVar.build();
        }

        public a buildUpon() {
            return new a();
        }

        public boolean contains(int i) {
            return this.f59441a.contains(i);
        }

        public boolean containsAny(int... iArr) {
            return this.f59441a.containsAny(iArr);
        }

        public boolean equals(@hib Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C9045c) {
                return this.f59441a.equals(((C9045c) obj).f59441a);
            }
            return false;
        }

        public int get(int i) {
            return this.f59441a.get(i);
        }

        public int hashCode() {
            return this.f59441a.hashCode();
        }

        public int size() {
            return this.f59441a.size();
        }

        @Override // p000.gh1
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            ArrayList<Integer> arrayList = new ArrayList<>();
            for (int i = 0; i < this.f59441a.size(); i++) {
                arrayList.add(Integer.valueOf(this.f59441a.get(i)));
            }
            bundle.putIntegerArrayList(f59439c, arrayList);
            return bundle;
        }

        private C9045c(i36 i36Var) {
            this.f59441a = i36Var;
        }
    }

    /* JADX INFO: renamed from: lzc$d */
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC9046d {
    }

    /* JADX INFO: renamed from: lzc$e */
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC9047e {
    }

    /* JADX INFO: renamed from: lzc$f */
    public static final class C9048f {

        /* JADX INFO: renamed from: a */
        public final i36 f59444a;

        public C9048f(i36 i36Var) {
            this.f59444a = i36Var;
        }

        public boolean contains(int i) {
            return this.f59444a.contains(i);
        }

        public boolean containsAny(int... iArr) {
            return this.f59444a.containsAny(iArr);
        }

        public boolean equals(@hib Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C9048f) {
                return this.f59444a.equals(((C9048f) obj).f59444a);
            }
            return false;
        }

        public int get(int i) {
            return this.f59444a.get(i);
        }

        public int hashCode() {
            return this.f59444a.hashCode();
        }

        public int size() {
            return this.f59444a.size();
        }
    }

    /* JADX INFO: renamed from: lzc$g */
    public interface InterfaceC9049g {
        default void onAudioAttributesChanged(yc0 yc0Var) {
        }

        default void onAudioSessionIdChanged(int i) {
        }

        default void onAvailableCommandsChanged(C9045c c9045c) {
        }

        @Deprecated
        default void onCues(List<o93> list) {
        }

        default void onDeviceInfoChanged(p84 p84Var) {
        }

        default void onDeviceVolumeChanged(int i, boolean z) {
        }

        default void onEvents(lzc lzcVar, C9048f c9048f) {
        }

        default void onIsLoadingChanged(boolean z) {
        }

        default void onIsPlayingChanged(boolean z) {
        }

        @Deprecated
        default void onLoadingChanged(boolean z) {
        }

        default void onMaxSeekToPreviousPositionChanged(long j) {
        }

        default void onMediaItemTransition(@hib aga agaVar, int i) {
        }

        default void onMediaMetadataChanged(iga igaVar) {
        }

        default void onMetadata(Metadata metadata) {
        }

        default void onPlayWhenReadyChanged(boolean z, int i) {
        }

        default void onPlaybackParametersChanged(qyc qycVar) {
        }

        default void onPlaybackStateChanged(int i) {
        }

        default void onPlaybackSuppressionReasonChanged(int i) {
        }

        default void onPlayerError(lyc lycVar) {
        }

        default void onPlayerErrorChanged(@hib lyc lycVar) {
        }

        @Deprecated
        default void onPlayerStateChanged(boolean z, int i) {
        }

        default void onPlaylistMetadataChanged(iga igaVar) {
        }

        @Deprecated
        default void onPositionDiscontinuity(int i) {
        }

        default void onRenderedFirstFrame() {
        }

        default void onRepeatModeChanged(int i) {
        }

        default void onSeekBackIncrementChanged(long j) {
        }

        default void onSeekForwardIncrementChanged(long j) {
        }

        default void onShuffleModeEnabledChanged(boolean z) {
        }

        default void onSkipSilenceEnabledChanged(boolean z) {
        }

        default void onSurfaceSizeChanged(int i, int i2) {
        }

        default void onTimelineChanged(t1h t1hVar, int i) {
        }

        default void onTrackSelectionParametersChanged(j7h j7hVar) {
        }

        default void onTracksChanged(y7h y7hVar) {
        }

        default void onVideoSizeChanged(z7i z7iVar) {
        }

        default void onVolumeChanged(float f) {
        }

        default void onCues(y93 y93Var) {
        }

        default void onPositionDiscontinuity(C9053k c9053k, C9053k c9053k2, int i) {
        }
    }

    /* JADX INFO: renamed from: lzc$h */
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC9050h {
    }

    /* JADX INFO: renamed from: lzc$i */
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC9051i {
    }

    /* JADX INFO: renamed from: lzc$j */
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC9052j {
    }

    /* JADX INFO: renamed from: lzc$k */
    public static final class C9053k implements gh1 {

        /* JADX INFO: renamed from: C */
        public final long f59453C;

        /* JADX INFO: renamed from: F */
        public final int f59454F;

        /* JADX INFO: renamed from: H */
        public final int f59455H;

        /* JADX INFO: renamed from: a */
        @hib
        public final Object f59456a;

        /* JADX INFO: renamed from: b */
        @Deprecated
        public final int f59457b;

        /* JADX INFO: renamed from: c */
        public final int f59458c;

        /* JADX INFO: renamed from: d */
        @hib
        public final aga f59459d;

        /* JADX INFO: renamed from: e */
        @hib
        public final Object f59460e;

        /* JADX INFO: renamed from: f */
        public final int f59461f;

        /* JADX INFO: renamed from: m */
        public final long f59462m;

        /* JADX INFO: renamed from: L */
        public static final String f59445L = x0i.intToStringMaxRadix(0);

        /* JADX INFO: renamed from: M */
        public static final String f59446M = x0i.intToStringMaxRadix(1);

        /* JADX INFO: renamed from: N */
        public static final String f59448N = x0i.intToStringMaxRadix(2);

        /* JADX INFO: renamed from: Q */
        public static final String f59449Q = x0i.intToStringMaxRadix(3);

        /* JADX INFO: renamed from: X */
        public static final String f59450X = x0i.intToStringMaxRadix(4);

        /* JADX INFO: renamed from: Y */
        public static final String f59451Y = x0i.intToStringMaxRadix(5);

        /* JADX INFO: renamed from: Z */
        public static final String f59452Z = x0i.intToStringMaxRadix(6);

        /* JADX INFO: renamed from: M1 */
        public static final gh1.InterfaceC6311a<C9053k> f59447M1 = new gh1.InterfaceC6311a() { // from class: kzc
            @Override // p000.gh1.InterfaceC6311a
            public final gh1 fromBundle(Bundle bundle) {
                return lzc.C9053k.fromBundle(bundle);
            }
        };

        @Deprecated
        public C9053k(@hib Object obj, int i, @hib Object obj2, int i2, long j, long j2, int i3, int i4) {
            this(obj, i, aga.f1436H, obj2, i2, j, j2, i3, i4);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static C9053k fromBundle(Bundle bundle) {
            int i = bundle.getInt(f59445L, 0);
            Bundle bundle2 = bundle.getBundle(f59446M);
            return new C9053k(null, i, bundle2 == null ? null : (aga) aga.f1443Z.fromBundle(bundle2), null, bundle.getInt(f59448N, 0), bundle.getLong(f59449Q, 0L), bundle.getLong(f59450X, 0L), bundle.getInt(f59451Y, -1), bundle.getInt(f59452Z, -1));
        }

        public boolean equals(@hib Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C9053k.class != obj.getClass()) {
                return false;
            }
            C9053k c9053k = (C9053k) obj;
            return this.f59458c == c9053k.f59458c && this.f59461f == c9053k.f59461f && this.f59462m == c9053k.f59462m && this.f59453C == c9053k.f59453C && this.f59454F == c9053k.f59454F && this.f59455H == c9053k.f59455H && okb.equal(this.f59456a, c9053k.f59456a) && okb.equal(this.f59460e, c9053k.f59460e) && okb.equal(this.f59459d, c9053k.f59459d);
        }

        public int hashCode() {
            return okb.hashCode(this.f59456a, Integer.valueOf(this.f59458c), this.f59459d, this.f59460e, Integer.valueOf(this.f59461f), Long.valueOf(this.f59462m), Long.valueOf(this.f59453C), Integer.valueOf(this.f59454F), Integer.valueOf(this.f59455H));
        }

        @Override // p000.gh1
        public Bundle toBundle() {
            return toBundle(true, true);
        }

        public C9053k(@hib Object obj, int i, @hib aga agaVar, @hib Object obj2, int i2, long j, long j2, int i3, int i4) {
            this.f59456a = obj;
            this.f59457b = i;
            this.f59458c = i;
            this.f59459d = agaVar;
            this.f59460e = obj2;
            this.f59461f = i2;
            this.f59462m = j;
            this.f59453C = j2;
            this.f59454F = i3;
            this.f59455H = i4;
        }

        public Bundle toBundle(boolean z, boolean z2) {
            Bundle bundle = new Bundle();
            bundle.putInt(f59445L, z2 ? this.f59458c : 0);
            aga agaVar = this.f59459d;
            if (agaVar != null && z) {
                bundle.putBundle(f59446M, agaVar.toBundle());
            }
            bundle.putInt(f59448N, z2 ? this.f59461f : 0);
            bundle.putLong(f59449Q, z ? this.f59462m : 0L);
            bundle.putLong(f59450X, z ? this.f59453C : 0L);
            bundle.putInt(f59451Y, z ? this.f59454F : -1);
            bundle.putInt(f59452Z, z ? this.f59455H : -1);
            return bundle;
        }
    }

    /* JADX INFO: renamed from: lzc$l */
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC9054l {
    }

    /* JADX INFO: renamed from: lzc$m */
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC9055m {
    }

    /* JADX INFO: renamed from: lzc$n */
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC9056n {
    }

    void addListener(InterfaceC9049g interfaceC9049g);

    void addMediaItem(int i, aga agaVar);

    void addMediaItem(aga agaVar);

    void addMediaItems(int i, List<aga> list);

    void addMediaItems(List<aga> list);

    boolean canAdvertiseSession();

    void clearMediaItems();

    void clearVideoSurface();

    void clearVideoSurface(@hib Surface surface);

    void clearVideoSurfaceHolder(@hib SurfaceHolder surfaceHolder);

    void clearVideoSurfaceView(@hib SurfaceView surfaceView);

    void clearVideoTextureView(@hib TextureView textureView);

    @Deprecated
    void decreaseDeviceVolume();

    void decreaseDeviceVolume(int i);

    Looper getApplicationLooper();

    yc0 getAudioAttributes();

    C9045c getAvailableCommands();

    @h78(from = 0, m12174to = 100)
    int getBufferedPercentage();

    long getBufferedPosition();

    long getContentBufferedPosition();

    long getContentDuration();

    long getContentPosition();

    int getCurrentAdGroupIndex();

    int getCurrentAdIndexInAdGroup();

    y93 getCurrentCues();

    long getCurrentLiveOffset();

    @hib
    Object getCurrentManifest();

    @hib
    aga getCurrentMediaItem();

    int getCurrentMediaItemIndex();

    int getCurrentPeriodIndex();

    long getCurrentPosition();

    t1h getCurrentTimeline();

    y7h getCurrentTracks();

    @Deprecated
    int getCurrentWindowIndex();

    p84 getDeviceInfo();

    @h78(from = 0)
    int getDeviceVolume();

    long getDuration();

    long getMaxSeekToPreviousPosition();

    aga getMediaItemAt(int i);

    int getMediaItemCount();

    iga getMediaMetadata();

    int getNextMediaItemIndex();

    @Deprecated
    int getNextWindowIndex();

    boolean getPlayWhenReady();

    qyc getPlaybackParameters();

    int getPlaybackState();

    int getPlaybackSuppressionReason();

    @hib
    lyc getPlayerError();

    iga getPlaylistMetadata();

    int getPreviousMediaItemIndex();

    @Deprecated
    int getPreviousWindowIndex();

    int getRepeatMode();

    long getSeekBackIncrement();

    long getSeekForwardIncrement();

    boolean getShuffleModeEnabled();

    ypf getSurfaceSize();

    long getTotalBufferedDuration();

    j7h getTrackSelectionParameters();

    z7i getVideoSize();

    @y46(from = 0.0d, m25645to = 1.0d)
    float getVolume();

    @Deprecated
    boolean hasNext();

    boolean hasNextMediaItem();

    @Deprecated
    boolean hasNextWindow();

    @Deprecated
    boolean hasPrevious();

    boolean hasPreviousMediaItem();

    @Deprecated
    boolean hasPreviousWindow();

    @Deprecated
    void increaseDeviceVolume();

    void increaseDeviceVolume(int i);

    boolean isCommandAvailable(int i);

    boolean isCurrentMediaItemDynamic();

    boolean isCurrentMediaItemLive();

    boolean isCurrentMediaItemSeekable();

    @Deprecated
    boolean isCurrentWindowDynamic();

    @Deprecated
    boolean isCurrentWindowLive();

    @Deprecated
    boolean isCurrentWindowSeekable();

    boolean isDeviceMuted();

    boolean isLoading();

    boolean isPlaying();

    boolean isPlayingAd();

    void moveMediaItem(int i, int i2);

    void moveMediaItems(int i, int i2, int i3);

    @Deprecated
    void next();

    void pause();

    void play();

    void prepare();

    @Deprecated
    void previous();

    void release();

    void removeListener(InterfaceC9049g interfaceC9049g);

    void removeMediaItem(int i);

    void removeMediaItems(int i, int i2);

    void replaceMediaItem(int i, aga agaVar);

    void replaceMediaItems(int i, int i2, List<aga> list);

    void seekBack();

    void seekForward();

    void seekTo(int i, long j);

    void seekTo(long j);

    void seekToDefaultPosition();

    void seekToDefaultPosition(int i);

    void seekToNext();

    void seekToNextMediaItem();

    @Deprecated
    void seekToNextWindow();

    void seekToPrevious();

    void seekToPreviousMediaItem();

    @Deprecated
    void seekToPreviousWindow();

    @Deprecated
    void setDeviceMuted(boolean z);

    void setDeviceMuted(boolean z, int i);

    @Deprecated
    void setDeviceVolume(@h78(from = 0) int i);

    void setDeviceVolume(@h78(from = 0) int i, int i2);

    void setMediaItem(aga agaVar);

    void setMediaItem(aga agaVar, long j);

    void setMediaItem(aga agaVar, boolean z);

    void setMediaItems(List<aga> list);

    void setMediaItems(List<aga> list, int i, long j);

    void setMediaItems(List<aga> list, boolean z);

    void setPlayWhenReady(boolean z);

    void setPlaybackParameters(qyc qycVar);

    void setPlaybackSpeed(@y46(from = 0.0d, fromInclusive = false) float f);

    void setPlaylistMetadata(iga igaVar);

    void setRepeatMode(int i);

    void setShuffleModeEnabled(boolean z);

    void setTrackSelectionParameters(j7h j7hVar);

    void setVideoSurface(@hib Surface surface);

    void setVideoSurfaceHolder(@hib SurfaceHolder surfaceHolder);

    void setVideoSurfaceView(@hib SurfaceView surfaceView);

    void setVideoTextureView(@hib TextureView textureView);

    void setVolume(@y46(from = 0.0d, m25645to = 1.0d) float f);

    void stop();
}
