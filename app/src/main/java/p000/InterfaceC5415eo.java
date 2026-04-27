package p000;

import android.util.SparseArray;
import com.google.android.exoplayer2.metadata.Metadata;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.List;
import p000.lzc;
import p000.vna;

/* JADX INFO: renamed from: eo */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public interface InterfaceC5415eo {

    /* JADX INFO: renamed from: A */
    public static final int f33630A = 26;

    /* JADX INFO: renamed from: B */
    public static final int f33631B = 28;

    /* JADX INFO: renamed from: C */
    public static final int f33632C = 27;

    /* JADX INFO: renamed from: D */
    public static final int f33633D = 29;

    /* JADX INFO: renamed from: E */
    public static final int f33634E = 30;

    /* JADX INFO: renamed from: F */
    public static final int f33635F = 1000;

    /* JADX INFO: renamed from: G */
    public static final int f33636G = 1001;

    /* JADX INFO: renamed from: H */
    public static final int f33637H = 1002;

    /* JADX INFO: renamed from: I */
    public static final int f33638I = 1003;

    /* JADX INFO: renamed from: J */
    public static final int f33639J = 1004;

    /* JADX INFO: renamed from: K */
    public static final int f33640K = 1005;

    /* JADX INFO: renamed from: L */
    public static final int f33641L = 1006;

    /* JADX INFO: renamed from: M */
    public static final int f33642M = 1007;

    /* JADX INFO: renamed from: N */
    public static final int f33643N = 1008;

    /* JADX INFO: renamed from: O */
    public static final int f33644O = 1009;

    /* JADX INFO: renamed from: P */
    public static final int f33645P = 1010;

    /* JADX INFO: renamed from: Q */
    public static final int f33646Q = 1011;

    /* JADX INFO: renamed from: R */
    public static final int f33647R = 1012;

    /* JADX INFO: renamed from: S */
    public static final int f33648S = 1013;

    /* JADX INFO: renamed from: T */
    public static final int f33649T = 1014;

    /* JADX INFO: renamed from: U */
    public static final int f33650U = 1015;

    /* JADX INFO: renamed from: V */
    public static final int f33651V = 1016;

    /* JADX INFO: renamed from: W */
    public static final int f33652W = 1017;

    /* JADX INFO: renamed from: X */
    public static final int f33653X = 1018;

    /* JADX INFO: renamed from: Y */
    public static final int f33654Y = 1019;

    /* JADX INFO: renamed from: Z */
    public static final int f33655Z = 1020;

    /* JADX INFO: renamed from: a */
    public static final int f33656a = 0;

    /* JADX INFO: renamed from: a0 */
    public static final int f33657a0 = 1021;

    /* JADX INFO: renamed from: b */
    public static final int f33658b = 1;

    /* JADX INFO: renamed from: b0 */
    public static final int f33659b0 = 1022;

    /* JADX INFO: renamed from: c */
    public static final int f33660c = 2;

    /* JADX INFO: renamed from: c0 */
    public static final int f33661c0 = 1023;

    /* JADX INFO: renamed from: d */
    public static final int f33662d = 3;

    /* JADX INFO: renamed from: d0 */
    public static final int f33663d0 = 1024;

    /* JADX INFO: renamed from: e */
    public static final int f33664e = 4;

    /* JADX INFO: renamed from: e0 */
    public static final int f33665e0 = 1025;

    /* JADX INFO: renamed from: f */
    public static final int f33666f = 5;

    /* JADX INFO: renamed from: f0 */
    public static final int f33667f0 = 1026;

    /* JADX INFO: renamed from: g */
    public static final int f33668g = 6;

    /* JADX INFO: renamed from: g0 */
    public static final int f33669g0 = 1027;

    /* JADX INFO: renamed from: h */
    public static final int f33670h = 7;

    /* JADX INFO: renamed from: h0 */
    public static final int f33671h0 = 1028;

    /* JADX INFO: renamed from: i */
    public static final int f33672i = 8;

    /* JADX INFO: renamed from: i0 */
    public static final int f33673i0 = 1029;

    /* JADX INFO: renamed from: j */
    public static final int f33674j = 9;

    /* JADX INFO: renamed from: j0 */
    public static final int f33675j0 = 1030;

    /* JADX INFO: renamed from: k */
    public static final int f33676k = 10;

    /* JADX INFO: renamed from: l */
    public static final int f33677l = 11;

    /* JADX INFO: renamed from: m */
    public static final int f33678m = 12;

    /* JADX INFO: renamed from: n */
    public static final int f33679n = 13;

    /* JADX INFO: renamed from: o */
    public static final int f33680o = 14;

    /* JADX INFO: renamed from: p */
    public static final int f33681p = 15;

    /* JADX INFO: renamed from: q */
    public static final int f33682q = 16;

    /* JADX INFO: renamed from: r */
    public static final int f33683r = 17;

    /* JADX INFO: renamed from: s */
    public static final int f33684s = 18;

    /* JADX INFO: renamed from: t */
    public static final int f33685t = 19;

    /* JADX INFO: renamed from: u */
    public static final int f33686u = 20;

    /* JADX INFO: renamed from: v */
    public static final int f33687v = 21;

    /* JADX INFO: renamed from: w */
    public static final int f33688w = 22;

    /* JADX INFO: renamed from: x */
    public static final int f33689x = 23;

    /* JADX INFO: renamed from: y */
    public static final int f33690y = 24;

    /* JADX INFO: renamed from: z */
    public static final int f33691z = 25;

    /* JADX INFO: renamed from: eo$a */
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    /* JADX INFO: renamed from: eo$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public final long f33692a;

        /* JADX INFO: renamed from: b */
        public final t1h f33693b;

        /* JADX INFO: renamed from: c */
        public final int f33694c;

        /* JADX INFO: renamed from: d */
        @hib
        public final vna.C14175b f33695d;

        /* JADX INFO: renamed from: e */
        public final long f33696e;

        /* JADX INFO: renamed from: f */
        public final t1h f33697f;

        /* JADX INFO: renamed from: g */
        public final int f33698g;

        /* JADX INFO: renamed from: h */
        @hib
        public final vna.C14175b f33699h;

        /* JADX INFO: renamed from: i */
        public final long f33700i;

        /* JADX INFO: renamed from: j */
        public final long f33701j;

        public b(long j, t1h t1hVar, int i, @hib vna.C14175b c14175b, long j2, t1h t1hVar2, int i2, @hib vna.C14175b c14175b2, long j3, long j4) {
            this.f33692a = j;
            this.f33693b = t1hVar;
            this.f33694c = i;
            this.f33695d = c14175b;
            this.f33696e = j2;
            this.f33697f = t1hVar2;
            this.f33698g = i2;
            this.f33699h = c14175b2;
            this.f33700i = j3;
            this.f33701j = j4;
        }

        public boolean equals(@hib Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            return this.f33692a == bVar.f33692a && this.f33694c == bVar.f33694c && this.f33696e == bVar.f33696e && this.f33698g == bVar.f33698g && this.f33700i == bVar.f33700i && this.f33701j == bVar.f33701j && okb.equal(this.f33693b, bVar.f33693b) && okb.equal(this.f33695d, bVar.f33695d) && okb.equal(this.f33697f, bVar.f33697f) && okb.equal(this.f33699h, bVar.f33699h);
        }

        public int hashCode() {
            return okb.hashCode(Long.valueOf(this.f33692a), this.f33693b, Integer.valueOf(this.f33694c), this.f33695d, Long.valueOf(this.f33696e), this.f33697f, Integer.valueOf(this.f33698g), this.f33699h, Long.valueOf(this.f33700i), Long.valueOf(this.f33701j));
        }
    }

    /* JADX INFO: renamed from: eo$c */
    public static final class c {

        /* JADX INFO: renamed from: a */
        public final i36 f33702a;

        /* JADX INFO: renamed from: b */
        public final SparseArray<b> f33703b;

        public c(i36 i36Var, SparseArray<b> sparseArray) {
            this.f33702a = i36Var;
            SparseArray<b> sparseArray2 = new SparseArray<>(i36Var.size());
            for (int i = 0; i < i36Var.size(); i++) {
                int i2 = i36Var.get(i);
                sparseArray2.append(i2, (b) u80.checkNotNull(sparseArray.get(i2)));
            }
            this.f33703b = sparseArray2;
        }

        public boolean contains(int i) {
            return this.f33702a.contains(i);
        }

        public boolean containsAny(int... iArr) {
            return this.f33702a.containsAny(iArr);
        }

        public int get(int i) {
            return this.f33702a.get(i);
        }

        public b getEventTime(int i) {
            return (b) u80.checkNotNull(this.f33703b.get(i));
        }

        public int size() {
            return this.f33702a.size();
        }
    }

    default void onAudioAttributesChanged(b bVar, yc0 yc0Var) {
    }

    default void onAudioCodecError(b bVar, Exception exc) {
    }

    default void onAudioDecoderInitialized(b bVar, String str, long j, long j2) {
    }

    default void onAudioDecoderReleased(b bVar, String str) {
    }

    default void onAudioDisabled(b bVar, nl3 nl3Var) {
    }

    default void onAudioEnabled(b bVar, nl3 nl3Var) {
    }

    @Deprecated
    default void onAudioInputFormatChanged(b bVar, kq6 kq6Var) {
    }

    default void onAudioPositionAdvancing(b bVar, long j) {
    }

    default void onAudioSessionIdChanged(b bVar, int i) {
    }

    default void onAudioSinkError(b bVar, Exception exc) {
    }

    default void onAudioUnderrun(b bVar, int i, long j, long j2) {
    }

    default void onAvailableCommandsChanged(b bVar, lzc.C9045c c9045c) {
    }

    default void onBandwidthEstimate(b bVar, int i, long j, long j2) {
    }

    @Deprecated
    default void onCues(b bVar, List<o93> list) {
    }

    default void onDeviceInfoChanged(b bVar, p84 p84Var) {
    }

    default void onDeviceVolumeChanged(b bVar, int i, boolean z) {
    }

    default void onDownstreamFormatChanged(b bVar, ega egaVar) {
    }

    default void onDrmKeysLoaded(b bVar) {
    }

    default void onDrmKeysRemoved(b bVar) {
    }

    default void onDrmKeysRestored(b bVar) {
    }

    @Deprecated
    default void onDrmSessionAcquired(b bVar) {
    }

    default void onDrmSessionManagerError(b bVar, Exception exc) {
    }

    default void onDrmSessionReleased(b bVar) {
    }

    default void onDroppedVideoFrames(b bVar, int i, long j) {
    }

    default void onEvents(lzc lzcVar, c cVar) {
    }

    default void onIsLoadingChanged(b bVar, boolean z) {
    }

    default void onIsPlayingChanged(b bVar, boolean z) {
    }

    default void onLoadCanceled(b bVar, jc9 jc9Var, ega egaVar) {
    }

    default void onLoadCompleted(b bVar, jc9 jc9Var, ega egaVar) {
    }

    default void onLoadError(b bVar, jc9 jc9Var, ega egaVar, IOException iOException, boolean z) {
    }

    default void onLoadStarted(b bVar, jc9 jc9Var, ega egaVar) {
    }

    @Deprecated
    default void onLoadingChanged(b bVar, boolean z) {
    }

    default void onMaxSeekToPreviousPositionChanged(b bVar, long j) {
    }

    default void onMediaItemTransition(b bVar, @hib aga agaVar, int i) {
    }

    default void onMediaMetadataChanged(b bVar, iga igaVar) {
    }

    default void onMetadata(b bVar, Metadata metadata) {
    }

    default void onPlayWhenReadyChanged(b bVar, boolean z, int i) {
    }

    default void onPlaybackParametersChanged(b bVar, qyc qycVar) {
    }

    default void onPlaybackStateChanged(b bVar, int i) {
    }

    default void onPlaybackSuppressionReasonChanged(b bVar, int i) {
    }

    default void onPlayerError(b bVar, lyc lycVar) {
    }

    default void onPlayerErrorChanged(b bVar, @hib lyc lycVar) {
    }

    default void onPlayerReleased(b bVar) {
    }

    @Deprecated
    default void onPlayerStateChanged(b bVar, boolean z, int i) {
    }

    default void onPlaylistMetadataChanged(b bVar, iga igaVar) {
    }

    @Deprecated
    default void onPositionDiscontinuity(b bVar, int i) {
    }

    default void onRenderedFirstFrame(b bVar, Object obj, long j) {
    }

    default void onRepeatModeChanged(b bVar, int i) {
    }

    default void onSeekBackIncrementChanged(b bVar, long j) {
    }

    default void onSeekForwardIncrementChanged(b bVar, long j) {
    }

    @Deprecated
    default void onSeekStarted(b bVar) {
    }

    default void onShuffleModeChanged(b bVar, boolean z) {
    }

    default void onSkipSilenceEnabledChanged(b bVar, boolean z) {
    }

    default void onSurfaceSizeChanged(b bVar, int i, int i2) {
    }

    default void onTimelineChanged(b bVar, int i) {
    }

    default void onTrackSelectionParametersChanged(b bVar, j7h j7hVar) {
    }

    default void onTracksChanged(b bVar, y7h y7hVar) {
    }

    default void onUpstreamDiscarded(b bVar, ega egaVar) {
    }

    default void onVideoCodecError(b bVar, Exception exc) {
    }

    default void onVideoDecoderInitialized(b bVar, String str, long j, long j2) {
    }

    default void onVideoDecoderReleased(b bVar, String str) {
    }

    default void onVideoDisabled(b bVar, nl3 nl3Var) {
    }

    default void onVideoEnabled(b bVar, nl3 nl3Var) {
    }

    default void onVideoFrameProcessingOffset(b bVar, long j, int i) {
    }

    @Deprecated
    default void onVideoInputFormatChanged(b bVar, kq6 kq6Var) {
    }

    default void onVideoSizeChanged(b bVar, z7i z7iVar) {
    }

    default void onVolumeChanged(b bVar, float f) {
    }

    @Deprecated
    default void onAudioDecoderInitialized(b bVar, String str, long j) {
    }

    default void onAudioInputFormatChanged(b bVar, kq6 kq6Var, @hib wl3 wl3Var) {
    }

    default void onCues(b bVar, y93 y93Var) {
    }

    default void onDrmSessionAcquired(b bVar, int i) {
    }

    default void onPositionDiscontinuity(b bVar, lzc.C9053k c9053k, lzc.C9053k c9053k2, int i) {
    }

    @Deprecated
    default void onVideoDecoderInitialized(b bVar, String str, long j) {
    }

    default void onVideoInputFormatChanged(b bVar, kq6 kq6Var, @hib wl3 wl3Var) {
    }

    @Deprecated
    default void onVideoSizeChanged(b bVar, int i, int i2, int i3, float f) {
    }
}
