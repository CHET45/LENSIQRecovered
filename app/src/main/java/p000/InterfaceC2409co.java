package p000;

import android.util.SparseArray;
import androidx.media3.common.C1213a;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.List;
import java.util.Objects;
import p000.bh0;
import p000.izc;
import p000.una;

/* JADX INFO: renamed from: co */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC2409co {

    /* JADX INFO: renamed from: A */
    @ovh
    public static final int f17137A = 26;

    /* JADX INFO: renamed from: B */
    @ovh
    public static final int f17138B = 28;

    /* JADX INFO: renamed from: C */
    @ovh
    public static final int f17139C = 27;

    /* JADX INFO: renamed from: D */
    @ovh
    public static final int f17140D = 29;

    /* JADX INFO: renamed from: E */
    @ovh
    public static final int f17141E = 30;

    /* JADX INFO: renamed from: F */
    @ovh
    public static final int f17142F = 1000;

    /* JADX INFO: renamed from: G */
    @ovh
    public static final int f17143G = 1001;

    /* JADX INFO: renamed from: H */
    @ovh
    public static final int f17144H = 1002;

    /* JADX INFO: renamed from: I */
    @ovh
    public static final int f17145I = 1003;

    /* JADX INFO: renamed from: J */
    @ovh
    public static final int f17146J = 1004;

    /* JADX INFO: renamed from: K */
    @ovh
    public static final int f17147K = 1005;

    /* JADX INFO: renamed from: L */
    @ovh
    public static final int f17148L = 1006;

    /* JADX INFO: renamed from: M */
    @ovh
    public static final int f17149M = 1007;

    /* JADX INFO: renamed from: N */
    @ovh
    public static final int f17150N = 1008;

    /* JADX INFO: renamed from: O */
    @ovh
    public static final int f17151O = 1009;

    /* JADX INFO: renamed from: P */
    @ovh
    public static final int f17152P = 1010;

    /* JADX INFO: renamed from: Q */
    @ovh
    public static final int f17153Q = 1011;

    /* JADX INFO: renamed from: R */
    @ovh
    public static final int f17154R = 1012;

    /* JADX INFO: renamed from: S */
    @ovh
    public static final int f17155S = 1013;

    /* JADX INFO: renamed from: T */
    @ovh
    public static final int f17156T = 1014;

    /* JADX INFO: renamed from: U */
    @ovh
    public static final int f17157U = 1015;

    /* JADX INFO: renamed from: V */
    @ovh
    public static final int f17158V = 1016;

    /* JADX INFO: renamed from: W */
    @ovh
    public static final int f17159W = 1017;

    /* JADX INFO: renamed from: X */
    @ovh
    public static final int f17160X = 1018;

    /* JADX INFO: renamed from: Y */
    @ovh
    public static final int f17161Y = 1019;

    /* JADX INFO: renamed from: Z */
    @ovh
    public static final int f17162Z = 1020;

    /* JADX INFO: renamed from: a */
    @ovh
    public static final int f17163a = 0;

    /* JADX INFO: renamed from: a0 */
    @ovh
    public static final int f17164a0 = 1021;

    /* JADX INFO: renamed from: b */
    @ovh
    public static final int f17165b = 1;

    /* JADX INFO: renamed from: b0 */
    @ovh
    public static final int f17166b0 = 1022;

    /* JADX INFO: renamed from: c */
    @ovh
    public static final int f17167c = 2;

    /* JADX INFO: renamed from: c0 */
    @ovh
    public static final int f17168c0 = 1023;

    /* JADX INFO: renamed from: d */
    @ovh
    public static final int f17169d = 3;

    /* JADX INFO: renamed from: d0 */
    @ovh
    public static final int f17170d0 = 1024;

    /* JADX INFO: renamed from: e */
    @ovh
    public static final int f17171e = 4;

    /* JADX INFO: renamed from: e0 */
    @ovh
    public static final int f17172e0 = 1025;

    /* JADX INFO: renamed from: f */
    @ovh
    public static final int f17173f = 5;

    /* JADX INFO: renamed from: f0 */
    @ovh
    public static final int f17174f0 = 1026;

    /* JADX INFO: renamed from: g */
    @ovh
    public static final int f17175g = 6;

    /* JADX INFO: renamed from: g0 */
    @ovh
    public static final int f17176g0 = 1027;

    /* JADX INFO: renamed from: h */
    @ovh
    public static final int f17177h = 7;

    /* JADX INFO: renamed from: h0 */
    @ovh
    public static final int f17178h0 = 1028;

    /* JADX INFO: renamed from: i */
    @ovh
    public static final int f17179i = 8;

    /* JADX INFO: renamed from: i0 */
    @ovh
    public static final int f17180i0 = 1029;

    /* JADX INFO: renamed from: j */
    @ovh
    public static final int f17181j = 9;

    /* JADX INFO: renamed from: j0 */
    @ovh
    public static final int f17182j0 = 1030;

    /* JADX INFO: renamed from: k */
    @ovh
    public static final int f17183k = 10;

    /* JADX INFO: renamed from: k0 */
    @ovh
    public static final int f17184k0 = 1031;

    /* JADX INFO: renamed from: l */
    @ovh
    public static final int f17185l = 11;

    /* JADX INFO: renamed from: l0 */
    @ovh
    public static final int f17186l0 = 1032;

    /* JADX INFO: renamed from: m */
    @ovh
    public static final int f17187m = 12;

    /* JADX INFO: renamed from: m0 */
    @ovh
    public static final int f17188m0 = 1033;

    /* JADX INFO: renamed from: n */
    @ovh
    public static final int f17189n = 13;

    /* JADX INFO: renamed from: o */
    @ovh
    public static final int f17190o = 14;

    /* JADX INFO: renamed from: p */
    @ovh
    public static final int f17191p = 15;

    /* JADX INFO: renamed from: q */
    @ovh
    public static final int f17192q = 16;

    /* JADX INFO: renamed from: r */
    @ovh
    public static final int f17193r = 17;

    /* JADX INFO: renamed from: s */
    @ovh
    public static final int f17194s = 18;

    /* JADX INFO: renamed from: t */
    @ovh
    public static final int f17195t = 19;

    /* JADX INFO: renamed from: u */
    @ovh
    public static final int f17196u = 20;

    /* JADX INFO: renamed from: v */
    @ovh
    public static final int f17197v = 21;

    /* JADX INFO: renamed from: w */
    @ovh
    public static final int f17198w = 22;

    /* JADX INFO: renamed from: x */
    @ovh
    public static final int f17199x = 23;

    /* JADX INFO: renamed from: y */
    @ovh
    public static final int f17200y = 24;

    /* JADX INFO: renamed from: z */
    @ovh
    public static final int f17201z = 25;

    /* JADX INFO: renamed from: co$a */
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @ovh
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    /* JADX INFO: renamed from: co$b */
    @ovh
    public static final class b {

        /* JADX INFO: renamed from: a */
        public final long f17202a;

        /* JADX INFO: renamed from: b */
        public final q1h f17203b;

        /* JADX INFO: renamed from: c */
        public final int f17204c;

        /* JADX INFO: renamed from: d */
        @hib
        public final una.C13612b f17205d;

        /* JADX INFO: renamed from: e */
        public final long f17206e;

        /* JADX INFO: renamed from: f */
        public final q1h f17207f;

        /* JADX INFO: renamed from: g */
        public final int f17208g;

        /* JADX INFO: renamed from: h */
        @hib
        public final una.C13612b f17209h;

        /* JADX INFO: renamed from: i */
        public final long f17210i;

        /* JADX INFO: renamed from: j */
        public final long f17211j;

        public b(long j, q1h q1hVar, int i, @hib una.C13612b c13612b, long j2, q1h q1hVar2, int i2, @hib una.C13612b c13612b2, long j3, long j4) {
            this.f17202a = j;
            this.f17203b = q1hVar;
            this.f17204c = i;
            this.f17205d = c13612b;
            this.f17206e = j2;
            this.f17207f = q1hVar2;
            this.f17208g = i2;
            this.f17209h = c13612b2;
            this.f17210i = j3;
            this.f17211j = j4;
        }

        public boolean equals(@hib Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            return this.f17202a == bVar.f17202a && this.f17204c == bVar.f17204c && this.f17206e == bVar.f17206e && this.f17208g == bVar.f17208g && this.f17210i == bVar.f17210i && this.f17211j == bVar.f17211j && Objects.equals(this.f17203b, bVar.f17203b) && Objects.equals(this.f17205d, bVar.f17205d) && Objects.equals(this.f17207f, bVar.f17207f) && Objects.equals(this.f17209h, bVar.f17209h);
        }

        public int hashCode() {
            return Objects.hash(Long.valueOf(this.f17202a), this.f17203b, Integer.valueOf(this.f17204c), this.f17205d, Long.valueOf(this.f17206e), this.f17207f, Integer.valueOf(this.f17208g), this.f17209h, Long.valueOf(this.f17210i), Long.valueOf(this.f17211j));
        }
    }

    /* JADX INFO: renamed from: co$c */
    @ovh
    public static final class c {

        /* JADX INFO: renamed from: a */
        public final h36 f17212a;

        /* JADX INFO: renamed from: b */
        public final SparseArray<b> f17213b;

        public c(h36 h36Var, SparseArray<b> sparseArray) {
            this.f17212a = h36Var;
            SparseArray<b> sparseArray2 = new SparseArray<>(h36Var.size());
            for (int i = 0; i < h36Var.size(); i++) {
                int i2 = h36Var.get(i);
                sparseArray2.append(i2, (b) v80.checkNotNull(sparseArray.get(i2)));
            }
            this.f17213b = sparseArray2;
        }

        public boolean contains(int i) {
            return this.f17212a.contains(i);
        }

        public boolean containsAny(int... iArr) {
            return this.f17212a.containsAny(iArr);
        }

        public int get(int i) {
            return this.f17212a.get(i);
        }

        public b getEventTime(int i) {
            return (b) v80.checkNotNull(this.f17213b.get(i));
        }

        public int size() {
            return this.f17212a.size();
        }
    }

    @ovh
    default void onAudioAttributesChanged(b bVar, uc0 uc0Var) {
    }

    @ovh
    default void onAudioCodecError(b bVar, Exception exc) {
    }

    @ovh
    default void onAudioDecoderInitialized(b bVar, String str, long j, long j2) {
    }

    @ovh
    default void onAudioDecoderReleased(b bVar, String str) {
    }

    @ovh
    default void onAudioDisabled(b bVar, ol3 ol3Var) {
    }

    @ovh
    default void onAudioEnabled(b bVar, ol3 ol3Var) {
    }

    @ovh
    default void onAudioInputFormatChanged(b bVar, C1213a c1213a, @hib vl3 vl3Var) {
    }

    @ovh
    default void onAudioPositionAdvancing(b bVar, long j) {
    }

    @ovh
    default void onAudioSessionIdChanged(b bVar, int i) {
    }

    @ovh
    default void onAudioSinkError(b bVar, Exception exc) {
    }

    @ovh
    default void onAudioTrackInitialized(b bVar, bh0.C1887a c1887a) {
    }

    @ovh
    default void onAudioTrackReleased(b bVar, bh0.C1887a c1887a) {
    }

    @ovh
    default void onAudioUnderrun(b bVar, int i, long j, long j2) {
    }

    @ovh
    default void onAvailableCommandsChanged(b bVar, izc.C7676c c7676c) {
    }

    @ovh
    default void onBandwidthEstimate(b bVar, int i, long j, long j2) {
    }

    @ovh
    @Deprecated
    default void onCues(b bVar, List<n93> list) {
    }

    @ovh
    default void onDeviceInfoChanged(b bVar, o84 o84Var) {
    }

    @ovh
    default void onDeviceVolumeChanged(b bVar, int i, boolean z) {
    }

    @ovh
    default void onDownstreamFormatChanged(b bVar, fga fgaVar) {
    }

    @ovh
    default void onDrmKeysLoaded(b bVar) {
    }

    @ovh
    default void onDrmKeysRemoved(b bVar) {
    }

    @ovh
    default void onDrmKeysRestored(b bVar) {
    }

    @ovh
    @Deprecated
    default void onDrmSessionAcquired(b bVar) {
    }

    @ovh
    default void onDrmSessionManagerError(b bVar, Exception exc) {
    }

    @ovh
    default void onDrmSessionReleased(b bVar) {
    }

    @ovh
    default void onDroppedVideoFrames(b bVar, int i, long j) {
    }

    @ovh
    default void onEvents(izc izcVar, c cVar) {
    }

    @ovh
    default void onIsLoadingChanged(b bVar, boolean z) {
    }

    @ovh
    default void onIsPlayingChanged(b bVar, boolean z) {
    }

    @ovh
    default void onLoadCanceled(b bVar, kc9 kc9Var, fga fgaVar) {
    }

    @ovh
    default void onLoadCompleted(b bVar, kc9 kc9Var, fga fgaVar) {
    }

    @ovh
    default void onLoadError(b bVar, kc9 kc9Var, fga fgaVar, IOException iOException, boolean z) {
    }

    @ovh
    @Deprecated
    default void onLoadStarted(b bVar, kc9 kc9Var, fga fgaVar) {
    }

    @ovh
    @Deprecated
    default void onLoadingChanged(b bVar, boolean z) {
    }

    @ovh
    default void onMaxSeekToPreviousPositionChanged(b bVar, long j) {
    }

    @ovh
    default void onMediaItemTransition(b bVar, @hib nfa nfaVar, int i) {
    }

    @ovh
    default void onMediaMetadataChanged(b bVar, hga hgaVar) {
    }

    @ovh
    default void onMetadata(b bVar, eta etaVar) {
    }

    @ovh
    default void onPlayWhenReadyChanged(b bVar, boolean z, int i) {
    }

    @ovh
    default void onPlaybackParametersChanged(b bVar, ryc rycVar) {
    }

    @ovh
    default void onPlaybackStateChanged(b bVar, int i) {
    }

    @ovh
    default void onPlaybackSuppressionReasonChanged(b bVar, int i) {
    }

    @ovh
    default void onPlayerError(b bVar, kyc kycVar) {
    }

    @ovh
    default void onPlayerErrorChanged(b bVar, @hib kyc kycVar) {
    }

    @ovh
    default void onPlayerReleased(b bVar) {
    }

    @ovh
    @Deprecated
    default void onPlayerStateChanged(b bVar, boolean z, int i) {
    }

    @ovh
    default void onPlaylistMetadataChanged(b bVar, hga hgaVar) {
    }

    @ovh
    @Deprecated
    default void onPositionDiscontinuity(b bVar, int i) {
    }

    @ovh
    default void onRenderedFirstFrame(b bVar, Object obj, long j) {
    }

    @ovh
    default void onRendererReadyChanged(b bVar, int i, int i2, boolean z) {
    }

    @ovh
    default void onRepeatModeChanged(b bVar, int i) {
    }

    @ovh
    default void onSeekBackIncrementChanged(b bVar, long j) {
    }

    @ovh
    default void onSeekForwardIncrementChanged(b bVar, long j) {
    }

    @ovh
    @Deprecated
    default void onSeekStarted(b bVar) {
    }

    @ovh
    default void onShuffleModeChanged(b bVar, boolean z) {
    }

    @ovh
    default void onSkipSilenceEnabledChanged(b bVar, boolean z) {
    }

    @ovh
    default void onSurfaceSizeChanged(b bVar, int i, int i2) {
    }

    @ovh
    default void onTimelineChanged(b bVar, int i) {
    }

    @ovh
    default void onTrackSelectionParametersChanged(b bVar, h7h h7hVar) {
    }

    @ovh
    default void onTracksChanged(b bVar, x7h x7hVar) {
    }

    @ovh
    default void onUpstreamDiscarded(b bVar, fga fgaVar) {
    }

    @ovh
    default void onVideoCodecError(b bVar, Exception exc) {
    }

    @ovh
    default void onVideoDecoderInitialized(b bVar, String str, long j, long j2) {
    }

    @ovh
    default void onVideoDecoderReleased(b bVar, String str) {
    }

    @ovh
    default void onVideoDisabled(b bVar, ol3 ol3Var) {
    }

    @ovh
    default void onVideoEnabled(b bVar, ol3 ol3Var) {
    }

    @ovh
    default void onVideoFrameProcessingOffset(b bVar, long j, int i) {
    }

    @ovh
    default void onVideoInputFormatChanged(b bVar, C1213a c1213a, @hib vl3 vl3Var) {
    }

    @ovh
    default void onVideoSizeChanged(b bVar, a8i a8iVar) {
    }

    @ovh
    default void onVolumeChanged(b bVar, float f) {
    }

    @ovh
    @Deprecated
    default void onAudioDecoderInitialized(b bVar, String str, long j) {
    }

    @ovh
    default void onCues(b bVar, z93 z93Var) {
    }

    @ovh
    default void onDrmSessionAcquired(b bVar, int i) {
    }

    @ovh
    default void onLoadStarted(b bVar, kc9 kc9Var, fga fgaVar, int i) {
    }

    @ovh
    default void onPositionDiscontinuity(b bVar, izc.C7684k c7684k, izc.C7684k c7684k2, int i) {
    }

    @ovh
    @Deprecated
    default void onVideoDecoderInitialized(b bVar, String str, long j) {
    }

    @ovh
    @Deprecated
    default void onVideoSizeChanged(b bVar, int i, int i2, int i3, float f) {
    }
}
