package p000;

import android.os.Bundle;
import android.os.Looper;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p000.h36;

/* JADX INFO: loaded from: classes3.dex */
public interface izc {

    /* JADX INFO: renamed from: A */
    public static final int f49014A = 1;

    /* JADX INFO: renamed from: A0 */
    public static final int f49015A0 = 13;

    /* JADX INFO: renamed from: B */
    public static final int f49016B = 0;

    /* JADX INFO: renamed from: B0 */
    public static final int f49017B0 = 14;

    /* JADX INFO: renamed from: C */
    public static final int f49018C = 1;

    /* JADX INFO: renamed from: C0 */
    public static final int f49019C0 = 15;

    /* JADX INFO: renamed from: D */
    public static final int f49020D = 2;

    /* JADX INFO: renamed from: D0 */
    public static final int f49021D0 = 16;

    /* JADX INFO: renamed from: E */
    public static final int f49022E = 3;

    /* JADX INFO: renamed from: E0 */
    public static final int f49023E0 = 17;

    /* JADX INFO: renamed from: F */
    public static final int f49024F = 0;

    /* JADX INFO: renamed from: F0 */
    @Deprecated
    public static final int f49025F0 = 18;

    /* JADX INFO: renamed from: G */
    public static final int f49026G = 1;

    /* JADX INFO: renamed from: G0 */
    public static final int f49027G0 = 18;

    /* JADX INFO: renamed from: H */
    public static final int f49028H = 2;

    /* JADX INFO: renamed from: H0 */
    @Deprecated
    public static final int f49029H0 = 19;

    /* JADX INFO: renamed from: I */
    public static final int f49030I = 3;

    /* JADX INFO: renamed from: I0 */
    public static final int f49031I0 = 19;

    /* JADX INFO: renamed from: J */
    public static final int f49032J = 4;

    /* JADX INFO: renamed from: J0 */
    public static final int f49033J0 = 31;

    /* JADX INFO: renamed from: K */
    public static final int f49034K = 5;

    /* JADX INFO: renamed from: K0 */
    public static final int f49035K0 = 20;

    /* JADX INFO: renamed from: L */
    public static final int f49036L = 6;

    /* JADX INFO: renamed from: L0 */
    public static final int f49037L0 = 21;

    /* JADX INFO: renamed from: M */
    public static final int f49038M = 7;

    /* JADX INFO: renamed from: M0 */
    public static final int f49039M0 = 22;

    /* JADX INFO: renamed from: N */
    public static final int f49040N = 8;

    /* JADX INFO: renamed from: N0 */
    public static final int f49041N0 = 23;

    /* JADX INFO: renamed from: O */
    public static final int f49042O = 9;

    /* JADX INFO: renamed from: O0 */
    public static final int f49043O0 = 24;

    /* JADX INFO: renamed from: P */
    public static final int f49044P = 10;

    /* JADX INFO: renamed from: P0 */
    @Deprecated
    public static final int f49045P0 = 25;

    /* JADX INFO: renamed from: Q */
    public static final int f49046Q = 11;

    /* JADX INFO: renamed from: Q0 */
    public static final int f49047Q0 = 33;

    /* JADX INFO: renamed from: R */
    public static final int f49048R = 12;

    /* JADX INFO: renamed from: R0 */
    @Deprecated
    public static final int f49049R0 = 26;

    /* JADX INFO: renamed from: S */
    public static final int f49050S = 13;

    /* JADX INFO: renamed from: S0 */
    public static final int f49051S0 = 34;

    /* JADX INFO: renamed from: T */
    public static final int f49052T = 14;

    /* JADX INFO: renamed from: T0 */
    public static final int f49053T0 = 35;

    /* JADX INFO: renamed from: U */
    public static final int f49054U = 15;

    /* JADX INFO: renamed from: U0 */
    public static final int f49055U0 = 27;

    /* JADX INFO: renamed from: V */
    public static final int f49056V = 16;

    /* JADX INFO: renamed from: V0 */
    public static final int f49057V0 = 28;

    /* JADX INFO: renamed from: W */
    public static final int f49058W = 17;

    /* JADX INFO: renamed from: W0 */
    public static final int f49059W0 = 29;

    /* JADX INFO: renamed from: X */
    public static final int f49060X = 18;

    /* JADX INFO: renamed from: X0 */
    public static final int f49061X0 = 30;

    /* JADX INFO: renamed from: Y */
    public static final int f49062Y = 19;

    /* JADX INFO: renamed from: Y0 */
    public static final int f49063Y0 = 32;

    /* JADX INFO: renamed from: Z */
    public static final int f49064Z = 20;

    /* JADX INFO: renamed from: Z0 */
    public static final int f49065Z0 = -1;

    /* JADX INFO: renamed from: a */
    public static final int f49066a = 1;

    /* JADX INFO: renamed from: a0 */
    public static final int f49067a0 = 21;

    /* JADX INFO: renamed from: b */
    public static final int f49068b = 2;

    /* JADX INFO: renamed from: b0 */
    public static final int f49069b0 = 22;

    /* JADX INFO: renamed from: c */
    public static final int f49070c = 3;

    /* JADX INFO: renamed from: c0 */
    public static final int f49071c0 = 23;

    /* JADX INFO: renamed from: d */
    public static final int f49072d = 4;

    /* JADX INFO: renamed from: d0 */
    public static final int f49073d0 = 24;

    /* JADX INFO: renamed from: e */
    public static final int f49074e = 1;

    /* JADX INFO: renamed from: e0 */
    public static final int f49075e0 = 25;

    /* JADX INFO: renamed from: f */
    public static final int f49076f = 2;

    /* JADX INFO: renamed from: f0 */
    public static final int f49077f0 = 26;

    /* JADX INFO: renamed from: g */
    public static final int f49078g = 3;

    /* JADX INFO: renamed from: g0 */
    public static final int f49079g0 = 27;

    /* JADX INFO: renamed from: h */
    public static final int f49080h = 4;

    /* JADX INFO: renamed from: h0 */
    public static final int f49081h0 = 28;

    /* JADX INFO: renamed from: i */
    public static final int f49082i = 5;

    /* JADX INFO: renamed from: i0 */
    public static final int f49083i0 = 29;

    /* JADX INFO: renamed from: j */
    public static final int f49084j = 6;

    /* JADX INFO: renamed from: j0 */
    public static final int f49085j0 = 30;

    /* JADX INFO: renamed from: k */
    public static final int f49086k = 0;

    /* JADX INFO: renamed from: k0 */
    public static final int f49087k0 = 1;

    /* JADX INFO: renamed from: l */
    public static final int f49088l = 1;

    /* JADX INFO: renamed from: l0 */
    public static final int f49089l0 = 2;

    /* JADX INFO: renamed from: m */
    @Deprecated
    public static final int f49090m = 2;

    /* JADX INFO: renamed from: m0 */
    public static final int f49091m0 = 3;

    /* JADX INFO: renamed from: n */
    public static final int f49092n = 3;

    /* JADX INFO: renamed from: n0 */
    public static final int f49093n0 = 4;

    /* JADX INFO: renamed from: o */
    public static final int f49094o = 4;

    /* JADX INFO: renamed from: o0 */
    public static final int f49095o0 = 5;

    /* JADX INFO: renamed from: p */
    public static final int f49096p = 0;

    /* JADX INFO: renamed from: p0 */
    @ovh
    @Deprecated
    public static final int f49097p0 = 5;

    /* JADX INFO: renamed from: q */
    public static final int f49098q = 1;

    /* JADX INFO: renamed from: q0 */
    public static final int f49099q0 = 6;

    /* JADX INFO: renamed from: r */
    public static final int f49100r = 2;

    /* JADX INFO: renamed from: r0 */
    @ovh
    @Deprecated
    public static final int f49101r0 = 6;

    /* JADX INFO: renamed from: s */
    public static final int f49102s = 0;

    /* JADX INFO: renamed from: s0 */
    public static final int f49103s0 = 7;

    /* JADX INFO: renamed from: t */
    public static final int f49104t = 1;

    /* JADX INFO: renamed from: t0 */
    public static final int f49105t0 = 8;

    /* JADX INFO: renamed from: u */
    public static final int f49106u = 2;

    /* JADX INFO: renamed from: u0 */
    @ovh
    @Deprecated
    public static final int f49107u0 = 8;

    /* JADX INFO: renamed from: v */
    public static final int f49108v = 3;

    /* JADX INFO: renamed from: v0 */
    public static final int f49109v0 = 9;

    /* JADX INFO: renamed from: w */
    public static final int f49110w = 4;

    /* JADX INFO: renamed from: w0 */
    public static final int f49111w0 = 10;

    /* JADX INFO: renamed from: x */
    public static final int f49112x = 5;

    /* JADX INFO: renamed from: x0 */
    @ovh
    @Deprecated
    public static final int f49113x0 = 10;

    /* JADX INFO: renamed from: y */
    public static final int f49114y = 6;

    /* JADX INFO: renamed from: y0 */
    public static final int f49115y0 = 11;

    /* JADX INFO: renamed from: z */
    public static final int f49116z = 0;

    /* JADX INFO: renamed from: z0 */
    public static final int f49117z0 = 12;

    /* JADX INFO: renamed from: izc$b */
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC7675b {
    }

    /* JADX INFO: renamed from: izc$c */
    public static final class C7676c {

        /* JADX INFO: renamed from: b */
        public static final C7676c f49118b = new a().build();

        /* JADX INFO: renamed from: c */
        public static final String f49119c = t0i.intToStringMaxRadix(0);

        /* JADX INFO: renamed from: a */
        public final h36 f49120a;

        /* JADX INFO: renamed from: izc$c$a */
        @ovh
        public static final class a {

            /* JADX INFO: renamed from: b */
            public static final int[] f49121b = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 31, 20, 21, 22, 23, 24, 25, 33, 26, 34, 35, 27, 28, 29, 30, 32};

            /* JADX INFO: renamed from: a */
            public final h36.C6691b f49122a;

            @op1
            public a add(int i) {
                this.f49122a.add(i);
                return this;
            }

            @op1
            public a addAll(int... iArr) {
                this.f49122a.addAll(iArr);
                return this;
            }

            @op1
            public a addAllCommands() {
                this.f49122a.addAll(f49121b);
                return this;
            }

            @op1
            public a addIf(int i, boolean z) {
                this.f49122a.addIf(i, z);
                return this;
            }

            public C7676c build() {
                return new C7676c(this.f49122a.build());
            }

            @op1
            public a remove(int i) {
                this.f49122a.remove(i);
                return this;
            }

            @op1
            public a removeAll(int... iArr) {
                this.f49122a.removeAll(iArr);
                return this;
            }

            @op1
            public a removeIf(int i, boolean z) {
                this.f49122a.removeIf(i, z);
                return this;
            }

            public a() {
                this.f49122a = new h36.C6691b();
            }

            @op1
            public a addAll(C7676c c7676c) {
                this.f49122a.addAll(c7676c.f49120a);
                return this;
            }

            private a(C7676c c7676c) {
                h36.C6691b c6691b = new h36.C6691b();
                this.f49122a = c6691b;
                c6691b.addAll(c7676c.f49120a);
            }
        }

        @ovh
        public static C7676c fromBundle(Bundle bundle) {
            ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList(f49119c);
            if (integerArrayList == null) {
                return f49118b;
            }
            a aVar = new a();
            for (int i = 0; i < integerArrayList.size(); i++) {
                aVar.add(integerArrayList.get(i).intValue());
            }
            return aVar.build();
        }

        @ovh
        public a buildUpon() {
            return new a();
        }

        public boolean contains(int i) {
            return this.f49120a.contains(i);
        }

        public boolean containsAny(int... iArr) {
            return this.f49120a.containsAny(iArr);
        }

        public boolean equals(@hib Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C7676c) {
                return this.f49120a.equals(((C7676c) obj).f49120a);
            }
            return false;
        }

        public int get(int i) {
            return this.f49120a.get(i);
        }

        public int hashCode() {
            return this.f49120a.hashCode();
        }

        public int size() {
            return this.f49120a.size();
        }

        @ovh
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            ArrayList<Integer> arrayList = new ArrayList<>();
            for (int i = 0; i < this.f49120a.size(); i++) {
                arrayList.add(Integer.valueOf(this.f49120a.get(i)));
            }
            bundle.putIntegerArrayList(f49119c, arrayList);
            return bundle;
        }

        private C7676c(h36 h36Var) {
            this.f49120a = h36Var;
        }
    }

    /* JADX INFO: renamed from: izc$d */
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC7677d {
    }

    /* JADX INFO: renamed from: izc$e */
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC7678e {
    }

    /* JADX INFO: renamed from: izc$f */
    public static final class C7679f {

        /* JADX INFO: renamed from: a */
        public final h36 f49123a;

        @ovh
        public C7679f(h36 h36Var) {
            this.f49123a = h36Var;
        }

        public boolean contains(int i) {
            return this.f49123a.contains(i);
        }

        public boolean containsAny(int... iArr) {
            return this.f49123a.containsAny(iArr);
        }

        public boolean equals(@hib Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C7679f) {
                return this.f49123a.equals(((C7679f) obj).f49123a);
            }
            return false;
        }

        public int get(int i) {
            return this.f49123a.get(i);
        }

        public int hashCode() {
            return this.f49123a.hashCode();
        }

        public int size() {
            return this.f49123a.size();
        }
    }

    /* JADX INFO: renamed from: izc$g */
    public interface InterfaceC7680g {
        default void onAudioAttributesChanged(uc0 uc0Var) {
        }

        @ovh
        default void onAudioSessionIdChanged(int i) {
        }

        default void onAvailableCommandsChanged(C7676c c7676c) {
        }

        @ovh
        @Deprecated
        default void onCues(List<n93> list) {
        }

        default void onDeviceInfoChanged(o84 o84Var) {
        }

        default void onDeviceVolumeChanged(int i, boolean z) {
        }

        default void onEvents(izc izcVar, C7679f c7679f) {
        }

        default void onIsLoadingChanged(boolean z) {
        }

        default void onIsPlayingChanged(boolean z) {
        }

        @ovh
        @Deprecated
        default void onLoadingChanged(boolean z) {
        }

        default void onMaxSeekToPreviousPositionChanged(long j) {
        }

        default void onMediaItemTransition(@hib nfa nfaVar, int i) {
        }

        default void onMediaMetadataChanged(hga hgaVar) {
        }

        @ovh
        default void onMetadata(eta etaVar) {
        }

        default void onPlayWhenReadyChanged(boolean z, int i) {
        }

        default void onPlaybackParametersChanged(ryc rycVar) {
        }

        default void onPlaybackStateChanged(int i) {
        }

        default void onPlaybackSuppressionReasonChanged(int i) {
        }

        default void onPlayerError(kyc kycVar) {
        }

        default void onPlayerErrorChanged(@hib kyc kycVar) {
        }

        @ovh
        @Deprecated
        default void onPlayerStateChanged(boolean z, int i) {
        }

        default void onPlaylistMetadataChanged(hga hgaVar) {
        }

        @ovh
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

        default void onTimelineChanged(q1h q1hVar, int i) {
        }

        default void onTrackSelectionParametersChanged(h7h h7hVar) {
        }

        default void onTracksChanged(x7h x7hVar) {
        }

        default void onVideoSizeChanged(a8i a8iVar) {
        }

        default void onVolumeChanged(float f) {
        }

        default void onCues(z93 z93Var) {
        }

        default void onPositionDiscontinuity(C7684k c7684k, C7684k c7684k2, int i) {
        }
    }

    /* JADX INFO: renamed from: izc$h */
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC7681h {
    }

    /* JADX INFO: renamed from: izc$i */
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC7682i {
    }

    /* JADX INFO: renamed from: izc$j */
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC7683j {
    }

    /* JADX INFO: renamed from: izc$k */
    public static final class C7684k {

        /* JADX INFO: renamed from: k */
        @fdi
        public static final String f49124k = t0i.intToStringMaxRadix(0);

        /* JADX INFO: renamed from: l */
        public static final String f49125l = t0i.intToStringMaxRadix(1);

        /* JADX INFO: renamed from: m */
        @fdi
        public static final String f49126m = t0i.intToStringMaxRadix(2);

        /* JADX INFO: renamed from: n */
        @fdi
        public static final String f49127n = t0i.intToStringMaxRadix(3);

        /* JADX INFO: renamed from: o */
        @fdi
        public static final String f49128o = t0i.intToStringMaxRadix(4);

        /* JADX INFO: renamed from: p */
        public static final String f49129p = t0i.intToStringMaxRadix(5);

        /* JADX INFO: renamed from: q */
        public static final String f49130q = t0i.intToStringMaxRadix(6);

        /* JADX INFO: renamed from: a */
        @hib
        public final Object f49131a;

        /* JADX INFO: renamed from: b */
        @ovh
        @Deprecated
        public final int f49132b;

        /* JADX INFO: renamed from: c */
        public final int f49133c;

        /* JADX INFO: renamed from: d */
        @hib
        @ovh
        public final nfa f49134d;

        /* JADX INFO: renamed from: e */
        @hib
        public final Object f49135e;

        /* JADX INFO: renamed from: f */
        public final int f49136f;

        /* JADX INFO: renamed from: g */
        public final long f49137g;

        /* JADX INFO: renamed from: h */
        public final long f49138h;

        /* JADX INFO: renamed from: i */
        public final int f49139i;

        /* JADX INFO: renamed from: j */
        public final int f49140j;

        @ovh
        @Deprecated
        public C7684k(@hib Object obj, int i, @hib Object obj2, int i2, long j, long j2, int i3, int i4) {
            this(obj, i, nfa.f64297j, obj2, i2, j, j2, i3, i4);
        }

        @ovh
        public static C7684k fromBundle(Bundle bundle) {
            int i = bundle.getInt(f49124k, 0);
            Bundle bundle2 = bundle.getBundle(f49125l);
            return new C7684k(null, i, bundle2 == null ? null : nfa.fromBundle(bundle2), null, bundle.getInt(f49126m, 0), bundle.getLong(f49127n, 0L), bundle.getLong(f49128o, 0L), bundle.getInt(f49129p, -1), bundle.getInt(f49130q, -1));
        }

        public boolean equals(@hib Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C7684k.class != obj.getClass()) {
                return false;
            }
            C7684k c7684k = (C7684k) obj;
            return equalsForBundling(c7684k) && Objects.equals(this.f49131a, c7684k.f49131a) && Objects.equals(this.f49135e, c7684k.f49135e);
        }

        @ovh
        public boolean equalsForBundling(C7684k c7684k) {
            return this.f49133c == c7684k.f49133c && this.f49136f == c7684k.f49136f && this.f49137g == c7684k.f49137g && this.f49138h == c7684k.f49138h && this.f49139i == c7684k.f49139i && this.f49140j == c7684k.f49140j && Objects.equals(this.f49134d, c7684k.f49134d);
        }

        @ovh
        public C7684k filterByAvailableCommands(boolean z, boolean z2) {
            if (z && z2) {
                return this;
            }
            return new C7684k(this.f49131a, z2 ? this.f49133c : 0, z ? this.f49134d : null, this.f49135e, z2 ? this.f49136f : 0, z ? this.f49137g : 0L, z ? this.f49138h : 0L, z ? this.f49139i : -1, z ? this.f49140j : -1);
        }

        public int hashCode() {
            return Objects.hash(this.f49131a, Integer.valueOf(this.f49133c), this.f49134d, this.f49135e, Integer.valueOf(this.f49136f), Long.valueOf(this.f49137g), Long.valueOf(this.f49138h), Integer.valueOf(this.f49139i), Integer.valueOf(this.f49140j));
        }

        @ovh
        public Bundle toBundle(int i) {
            Bundle bundle = new Bundle();
            if (i < 3 || this.f49133c != 0) {
                bundle.putInt(f49124k, this.f49133c);
            }
            nfa nfaVar = this.f49134d;
            if (nfaVar != null) {
                bundle.putBundle(f49125l, nfaVar.toBundle());
            }
            if (i < 3 || this.f49136f != 0) {
                bundle.putInt(f49126m, this.f49136f);
            }
            if (i < 3 || this.f49137g != 0) {
                bundle.putLong(f49127n, this.f49137g);
            }
            if (i < 3 || this.f49138h != 0) {
                bundle.putLong(f49128o, this.f49138h);
            }
            int i2 = this.f49139i;
            if (i2 != -1) {
                bundle.putInt(f49129p, i2);
            }
            int i3 = this.f49140j;
            if (i3 != -1) {
                bundle.putInt(f49130q, i3);
            }
            return bundle;
        }

        public String toString() {
            String str = "mediaItem=" + this.f49133c + ", period=" + this.f49136f + ", pos=" + this.f49137g;
            if (this.f49139i == -1) {
                return str;
            }
            return str + ", contentPos=" + this.f49138h + ", adGroup=" + this.f49139i + ", ad=" + this.f49140j;
        }

        @ovh
        public C7684k(@hib Object obj, int i, @hib nfa nfaVar, @hib Object obj2, int i2, long j, long j2, int i3, int i4) {
            this.f49131a = obj;
            this.f49132b = i;
            this.f49133c = i;
            this.f49134d = nfaVar;
            this.f49135e = obj2;
            this.f49136f = i2;
            this.f49137g = j;
            this.f49138h = j2;
            this.f49139i = i3;
            this.f49140j = i4;
        }

        @ovh
        @Deprecated
        public Bundle toBundle() {
            return toBundle(Integer.MAX_VALUE);
        }
    }

    /* JADX INFO: renamed from: izc$l */
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC7685l {
    }

    /* JADX INFO: renamed from: izc$m */
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC7686m {
    }

    /* JADX INFO: renamed from: izc$n */
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC7687n {
    }

    void addListener(InterfaceC7680g interfaceC7680g);

    void addMediaItem(int i, nfa nfaVar);

    void addMediaItem(nfa nfaVar);

    void addMediaItems(int i, List<nfa> list);

    void addMediaItems(List<nfa> list);

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

    uc0 getAudioAttributes();

    C7676c getAvailableCommands();

    @h78(from = 0, m12174to = 100)
    int getBufferedPercentage();

    long getBufferedPosition();

    long getContentBufferedPosition();

    long getContentDuration();

    long getContentPosition();

    int getCurrentAdGroupIndex();

    int getCurrentAdIndexInAdGroup();

    z93 getCurrentCues();

    long getCurrentLiveOffset();

    @hib
    @ovh
    Object getCurrentManifest();

    @hib
    nfa getCurrentMediaItem();

    int getCurrentMediaItemIndex();

    int getCurrentPeriodIndex();

    long getCurrentPosition();

    q1h getCurrentTimeline();

    x7h getCurrentTracks();

    @ovh
    @Deprecated
    int getCurrentWindowIndex();

    o84 getDeviceInfo();

    @h78(from = 0)
    int getDeviceVolume();

    long getDuration();

    long getMaxSeekToPreviousPosition();

    nfa getMediaItemAt(int i);

    int getMediaItemCount();

    hga getMediaMetadata();

    int getNextMediaItemIndex();

    @ovh
    @Deprecated
    int getNextWindowIndex();

    boolean getPlayWhenReady();

    ryc getPlaybackParameters();

    int getPlaybackState();

    int getPlaybackSuppressionReason();

    @hib
    kyc getPlayerError();

    hga getPlaylistMetadata();

    int getPreviousMediaItemIndex();

    @ovh
    @Deprecated
    int getPreviousWindowIndex();

    int getRepeatMode();

    long getSeekBackIncrement();

    long getSeekForwardIncrement();

    boolean getShuffleModeEnabled();

    @ovh
    xpf getSurfaceSize();

    long getTotalBufferedDuration();

    h7h getTrackSelectionParameters();

    a8i getVideoSize();

    @y46(from = 0.0d, m25645to = 1.0d)
    float getVolume();

    boolean hasNextMediaItem();

    boolean hasPreviousMediaItem();

    @Deprecated
    void increaseDeviceVolume();

    void increaseDeviceVolume(int i);

    boolean isCommandAvailable(int i);

    boolean isCurrentMediaItemDynamic();

    boolean isCurrentMediaItemLive();

    boolean isCurrentMediaItemSeekable();

    @ovh
    @Deprecated
    boolean isCurrentWindowDynamic();

    @ovh
    @Deprecated
    boolean isCurrentWindowLive();

    @ovh
    @Deprecated
    boolean isCurrentWindowSeekable();

    boolean isDeviceMuted();

    boolean isLoading();

    boolean isPlaying();

    boolean isPlayingAd();

    void moveMediaItem(int i, int i2);

    void moveMediaItems(int i, int i2, int i3);

    void pause();

    void play();

    void prepare();

    void release();

    void removeListener(InterfaceC7680g interfaceC7680g);

    void removeMediaItem(int i);

    void removeMediaItems(int i, int i2);

    void replaceMediaItem(int i, nfa nfaVar);

    void replaceMediaItems(int i, int i2, List<nfa> list);

    void seekBack();

    void seekForward();

    void seekTo(int i, long j);

    void seekTo(long j);

    void seekToDefaultPosition();

    void seekToDefaultPosition(int i);

    void seekToNext();

    void seekToNextMediaItem();

    void seekToPrevious();

    void seekToPreviousMediaItem();

    void setAudioAttributes(uc0 uc0Var, boolean z);

    @Deprecated
    void setDeviceMuted(boolean z);

    void setDeviceMuted(boolean z, int i);

    @Deprecated
    void setDeviceVolume(@h78(from = 0) int i);

    void setDeviceVolume(@h78(from = 0) int i, int i2);

    void setMediaItem(nfa nfaVar);

    void setMediaItem(nfa nfaVar, long j);

    void setMediaItem(nfa nfaVar, boolean z);

    void setMediaItems(List<nfa> list);

    void setMediaItems(List<nfa> list, int i, long j);

    void setMediaItems(List<nfa> list, boolean z);

    void setPlayWhenReady(boolean z);

    void setPlaybackParameters(ryc rycVar);

    void setPlaybackSpeed(@y46(from = 0.0d, fromInclusive = false) float f);

    void setPlaylistMetadata(hga hgaVar);

    void setRepeatMode(int i);

    void setShuffleModeEnabled(boolean z);

    void setTrackSelectionParameters(h7h h7hVar);

    void setVideoSurface(@hib Surface surface);

    void setVideoSurfaceHolder(@hib SurfaceHolder surfaceHolder);

    void setVideoSurfaceView(@hib SurfaceView surfaceView);

    void setVideoTextureView(@hib TextureView textureView);

    void setVolume(@y46(from = 0.0d, m25645to = 1.0d) float f);

    void stop();
}
