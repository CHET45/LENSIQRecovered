package p000;

import android.os.SystemClock;
import android.text.TextUtils;
import androidx.media3.common.C1213a;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.Locale;
import p000.InterfaceC2409co;
import p000.a77;
import p000.bh0;
import p000.izc;
import p000.q1h;
import p000.x7h;

/* JADX INFO: loaded from: classes3.dex */
public class d65 implements InterfaceC2409co {

    /* JADX INFO: renamed from: r0 */
    public static final String f28513r0 = "EventLogger";

    /* JADX INFO: renamed from: s0 */
    public static final int f28514s0 = 3;

    /* JADX INFO: renamed from: t0 */
    public static final NumberFormat f28515t0;

    /* JADX INFO: renamed from: n0 */
    public final String f28516n0;

    /* JADX INFO: renamed from: o0 */
    public final q1h.C11272d f28517o0;

    /* JADX INFO: renamed from: p0 */
    public final q1h.C11270b f28518p0;

    /* JADX INFO: renamed from: q0 */
    public final long f28519q0;

    static {
        NumberFormat numberFormat = NumberFormat.getInstance(Locale.US);
        f28515t0 = numberFormat;
        numberFormat.setMinimumFractionDigits(2);
        numberFormat.setMaximumFractionDigits(2);
        numberFormat.setGroupingUsed(false);
    }

    public d65() {
        this("EventLogger");
    }

    private static String getAudioTrackConfigString(bh0.C1887a c1887a) {
        return c1887a.f13716a + "," + c1887a.f13718c + "," + c1887a.f13717b + "," + c1887a.f13719d + "," + c1887a.f13720e + "," + c1887a.f13721f;
    }

    private static String getDiscontinuityReasonString(int i) {
        switch (i) {
            case 0:
                return "AUTO_TRANSITION";
            case 1:
                return "SEEK";
            case 2:
                return "SEEK_ADJUSTMENT";
            case 3:
                return "SKIP";
            case 4:
                return pe4.f70512c2;
            case 5:
                return "INTERNAL";
            case 6:
                return "SILENCE_SKIP";
            default:
                return "?";
        }
    }

    private String getEventString(InterfaceC2409co.b bVar, String str, @hib String str2, @hib Throwable th) {
        String str3 = str + " [" + getEventTimeString(bVar);
        if (th instanceof kyc) {
            str3 = str3 + ", errorCode=" + ((kyc) th).getErrorCodeName();
        }
        if (str2 != null) {
            str3 = str3 + ", " + str2;
        }
        String throwableString = xh9.getThrowableString(th);
        if (!TextUtils.isEmpty(throwableString)) {
            str3 = str3 + "\n  " + throwableString.replace("\n", "\n  ") + '\n';
        }
        return str3 + "]";
    }

    private String getEventTimeString(InterfaceC2409co.b bVar) {
        String str = "window=" + bVar.f17204c;
        if (bVar.f17205d != null) {
            str = str + ", period=" + bVar.f17203b.getIndexOfPeriod(bVar.f17205d.f88603a);
            if (bVar.f17205d.isAd()) {
                str = (str + ", adGroup=" + bVar.f17205d.f88604b) + ", ad=" + bVar.f17205d.f88605c;
            }
        }
        return "eventTime=" + getTimeString(bVar.f17202a - this.f28519q0) + ", mediaPos=" + getTimeString(bVar.f17206e) + ", " + str;
    }

    private static String getMediaItemTransitionReasonString(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? "?" : "PLAYLIST_CHANGED" : "SEEK" : "AUTO" : "REPEAT";
    }

    private static String getPlayWhenReadyChangeReasonString(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "?" : "END_OF_MEDIA_ITEM" : "REMOTE" : "AUDIO_BECOMING_NOISY" : "AUDIO_FOCUS_LOSS" : "USER_REQUEST";
    }

    private static String getPlaybackSuppressionReasonString(int i) {
        return i != 0 ? i != 1 ? i != 3 ? i != 4 ? "?" : "SCRUBBING" : "UNSUITABLE_AUDIO_OUTPUT" : "TRANSIENT_AUDIO_FOCUS_LOSS" : "NONE";
    }

    private static String getRepeatModeString(int i) {
        return i != 0 ? i != 1 ? i != 2 ? "?" : "ALL" : "ONE" : "OFF";
    }

    private static String getStateString(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "?" : "ENDED" : "READY" : "BUFFERING" : "IDLE";
    }

    private static String getTimeString(long j) {
        return j == -9223372036854775807L ? "?" : f28515t0.format(j / 1000.0f);
    }

    private static String getTimelineChangeReasonString(int i) {
        return i != 0 ? i != 1 ? "?" : "SOURCE_UPDATE" : "PLAYLIST_CHANGED";
    }

    private static String getTrackStatusString(boolean z) {
        return z ? "[X]" : "[ ]";
    }

    private void logd(InterfaceC2409co.b bVar, String str) {
        m8932a(getEventString(bVar, str, null, null));
    }

    private void loge(InterfaceC2409co.b bVar, String str, @hib Throwable th) {
        m8933b(getEventString(bVar, str, null, th));
    }

    private void printInternalError(InterfaceC2409co.b bVar, String str, Exception exc) {
        loge(bVar, "internalError", str, exc);
    }

    private void printMetadata(eta etaVar, String str) {
        for (int i = 0; i < etaVar.length(); i++) {
            m8932a(str + etaVar.get(i));
        }
    }

    @ovh
    /* JADX INFO: renamed from: a */
    public void m8932a(String str) {
        xh9.m25142d(this.f28516n0, str);
    }

    @ovh
    /* JADX INFO: renamed from: b */
    public void m8933b(String str) {
        xh9.m25144e(this.f28516n0, str);
    }

    @Override // p000.InterfaceC2409co
    @ovh
    public void onAudioAttributesChanged(InterfaceC2409co.b bVar, uc0 uc0Var) {
        logd(bVar, "audioAttributes", uc0Var.f87474a + "," + uc0Var.f87475b + "," + uc0Var.f87476c + "," + uc0Var.f87477d);
    }

    @Override // p000.InterfaceC2409co
    @ovh
    public void onAudioDecoderInitialized(InterfaceC2409co.b bVar, String str, long j, long j2) {
        logd(bVar, "audioDecoderInitialized", str);
    }

    @Override // p000.InterfaceC2409co
    @ovh
    public void onAudioDecoderReleased(InterfaceC2409co.b bVar, String str) {
        logd(bVar, "audioDecoderReleased", str);
    }

    @Override // p000.InterfaceC2409co
    @ovh
    public void onAudioDisabled(InterfaceC2409co.b bVar, ol3 ol3Var) {
        logd(bVar, "audioDisabled");
    }

    @Override // p000.InterfaceC2409co
    @ovh
    public void onAudioEnabled(InterfaceC2409co.b bVar, ol3 ol3Var) {
        logd(bVar, "audioEnabled");
    }

    @Override // p000.InterfaceC2409co
    @ovh
    public void onAudioInputFormatChanged(InterfaceC2409co.b bVar, C1213a c1213a, @hib vl3 vl3Var) {
        logd(bVar, "audioInputFormat", C1213a.toLogString(c1213a));
    }

    @Override // p000.InterfaceC2409co
    @ovh
    public void onAudioPositionAdvancing(InterfaceC2409co.b bVar, long j) {
        logd(bVar, "audioPositionAdvancing", "since " + getTimeString(((j - System.currentTimeMillis()) + SystemClock.elapsedRealtime()) - this.f28519q0));
    }

    @Override // p000.InterfaceC2409co
    @ovh
    public void onAudioSessionIdChanged(InterfaceC2409co.b bVar, int i) {
        logd(bVar, "audioSessionId", Integer.toString(i));
    }

    @Override // p000.InterfaceC2409co
    @ovh
    public void onAudioTrackInitialized(InterfaceC2409co.b bVar, bh0.C1887a c1887a) {
        logd(bVar, "audioTrackInit", getAudioTrackConfigString(c1887a));
    }

    @Override // p000.InterfaceC2409co
    @ovh
    public void onAudioTrackReleased(InterfaceC2409co.b bVar, bh0.C1887a c1887a) {
        logd(bVar, "audioTrackReleased", getAudioTrackConfigString(c1887a));
    }

    @Override // p000.InterfaceC2409co
    @ovh
    public void onAudioUnderrun(InterfaceC2409co.b bVar, int i, long j, long j2) {
        loge(bVar, "audioTrackUnderrun", i + ", " + j + ", " + j2, null);
    }

    @Override // p000.InterfaceC2409co
    @ovh
    public void onDownstreamFormatChanged(InterfaceC2409co.b bVar, fga fgaVar) {
        logd(bVar, "downstreamFormat", C1213a.toLogString(fgaVar.f36528c));
    }

    @Override // p000.InterfaceC2409co
    @ovh
    public void onDrmKeysLoaded(InterfaceC2409co.b bVar) {
        logd(bVar, "drmKeysLoaded");
    }

    @Override // p000.InterfaceC2409co
    @ovh
    public void onDrmKeysRemoved(InterfaceC2409co.b bVar) {
        logd(bVar, "drmKeysRemoved");
    }

    @Override // p000.InterfaceC2409co
    @ovh
    public void onDrmKeysRestored(InterfaceC2409co.b bVar) {
        logd(bVar, "drmKeysRestored");
    }

    @Override // p000.InterfaceC2409co
    @ovh
    public void onDrmSessionAcquired(InterfaceC2409co.b bVar, int i) {
        logd(bVar, "drmSessionAcquired", "state=" + i);
    }

    @Override // p000.InterfaceC2409co
    @ovh
    public void onDrmSessionManagerError(InterfaceC2409co.b bVar, Exception exc) {
        printInternalError(bVar, "drmSessionManagerError", exc);
    }

    @Override // p000.InterfaceC2409co
    @ovh
    public void onDrmSessionReleased(InterfaceC2409co.b bVar) {
        logd(bVar, "drmSessionReleased");
    }

    @Override // p000.InterfaceC2409co
    @ovh
    public void onDroppedVideoFrames(InterfaceC2409co.b bVar, int i, long j) {
        logd(bVar, "droppedFrames", Integer.toString(i));
    }

    @Override // p000.InterfaceC2409co
    @ovh
    public void onIsLoadingChanged(InterfaceC2409co.b bVar, boolean z) {
        logd(bVar, "loading", Boolean.toString(z));
    }

    @Override // p000.InterfaceC2409co
    @ovh
    public void onIsPlayingChanged(InterfaceC2409co.b bVar, boolean z) {
        logd(bVar, "isPlaying", Boolean.toString(z));
    }

    @Override // p000.InterfaceC2409co
    @ovh
    public void onLoadError(InterfaceC2409co.b bVar, kc9 kc9Var, fga fgaVar, IOException iOException, boolean z) {
        printInternalError(bVar, "loadError", iOException);
    }

    @Override // p000.InterfaceC2409co
    @ovh
    public void onMediaItemTransition(InterfaceC2409co.b bVar, @hib nfa nfaVar, int i) {
        m8932a("mediaItem [" + getEventTimeString(bVar) + ", reason=" + getMediaItemTransitionReasonString(i) + "]");
    }

    @Override // p000.InterfaceC2409co
    @ovh
    public void onMetadata(InterfaceC2409co.b bVar, eta etaVar) {
        m8932a("metadata [" + getEventTimeString(bVar));
        printMetadata(etaVar, a77.C0077a.f542d);
        m8932a("]");
    }

    @Override // p000.InterfaceC2409co
    @ovh
    public void onPlayWhenReadyChanged(InterfaceC2409co.b bVar, boolean z, int i) {
        logd(bVar, "playWhenReady", z + ", " + getPlayWhenReadyChangeReasonString(i));
    }

    @Override // p000.InterfaceC2409co
    @ovh
    public void onPlaybackParametersChanged(InterfaceC2409co.b bVar, ryc rycVar) {
        logd(bVar, "playbackParameters", rycVar.toString());
    }

    @Override // p000.InterfaceC2409co
    @ovh
    public void onPlaybackStateChanged(InterfaceC2409co.b bVar, int i) {
        logd(bVar, "state", getStateString(i));
    }

    @Override // p000.InterfaceC2409co
    @ovh
    public void onPlaybackSuppressionReasonChanged(InterfaceC2409co.b bVar, int i) {
        logd(bVar, "playbackSuppressionReason", getPlaybackSuppressionReasonString(i));
    }

    @Override // p000.InterfaceC2409co
    @ovh
    public void onPlayerError(InterfaceC2409co.b bVar, kyc kycVar) {
        loge(bVar, "playerFailed", kycVar);
    }

    @Override // p000.InterfaceC2409co
    @ovh
    public void onPositionDiscontinuity(InterfaceC2409co.b bVar, izc.C7684k c7684k, izc.C7684k c7684k2, int i) {
        logd(bVar, "positionDiscontinuity", "reason=" + getDiscontinuityReasonString(i) + ", PositionInfo:old [" + c7684k + "], PositionInfo:new [" + c7684k2 + "]");
    }

    @Override // p000.InterfaceC2409co
    @ovh
    public void onRenderedFirstFrame(InterfaceC2409co.b bVar, Object obj, long j) {
        logd(bVar, "renderedFirstFrame", String.valueOf(obj));
    }

    @Override // p000.InterfaceC2409co
    @ovh
    public void onRendererReadyChanged(InterfaceC2409co.b bVar, int i, int i2, boolean z) {
        logd(bVar, "rendererReady", "rendererIndex=" + i + ", " + t0i.getTrackTypeString(i2) + ", " + z);
    }

    @Override // p000.InterfaceC2409co
    @ovh
    public void onRepeatModeChanged(InterfaceC2409co.b bVar, int i) {
        logd(bVar, "repeatMode", getRepeatModeString(i));
    }

    @Override // p000.InterfaceC2409co
    @ovh
    public void onShuffleModeChanged(InterfaceC2409co.b bVar, boolean z) {
        logd(bVar, "shuffleModeEnabled", Boolean.toString(z));
    }

    @Override // p000.InterfaceC2409co
    @ovh
    public void onSkipSilenceEnabledChanged(InterfaceC2409co.b bVar, boolean z) {
        logd(bVar, "skipSilenceEnabled", Boolean.toString(z));
    }

    @Override // p000.InterfaceC2409co
    @ovh
    public void onSurfaceSizeChanged(InterfaceC2409co.b bVar, int i, int i2) {
        logd(bVar, "surfaceSize", "w=" + i + ", h=" + i2);
    }

    @Override // p000.InterfaceC2409co
    @ovh
    public void onTimelineChanged(InterfaceC2409co.b bVar, int i) {
        int periodCount = bVar.f17203b.getPeriodCount();
        int windowCount = bVar.f17203b.getWindowCount();
        m8932a("timeline [" + getEventTimeString(bVar) + ", periodCount=" + periodCount + ", windowCount=" + windowCount + ", reason=" + getTimelineChangeReasonString(i));
        for (int i2 = 0; i2 < Math.min(periodCount, 3); i2++) {
            bVar.f17203b.getPeriod(i2, this.f28518p0);
            m8932a("  period [" + getTimeString(this.f28518p0.getDurationMs()) + "]");
        }
        if (periodCount > 3) {
            m8932a("  ...");
        }
        for (int i3 = 0; i3 < Math.min(windowCount, 3); i3++) {
            bVar.f17203b.getWindow(i3, this.f28517o0);
            m8932a("  window [" + getTimeString(this.f28517o0.getDurationMs()) + ", seekable=" + this.f28517o0.f72978h + ", dynamic=" + this.f28517o0.f72979i + "]");
        }
        if (windowCount > 3) {
            m8932a("  ...");
        }
        m8932a("]");
    }

    @Override // p000.InterfaceC2409co
    @ovh
    public void onTracksChanged(InterfaceC2409co.b bVar, x7h x7hVar) {
        eta etaVar;
        m8932a("tracks [" + getEventTimeString(bVar));
        kx7<x7h.C14971a> groups = x7hVar.getGroups();
        for (int i = 0; i < groups.size(); i++) {
            x7h.C14971a c14971a = groups.get(i);
            m8932a("  group [ id=" + c14971a.getMediaTrackGroup().f42519b);
            for (int i2 = 0; i2 < c14971a.f97112a; i2++) {
                m8932a(pl8.f71328a + getTrackStatusString(c14971a.isTrackSelected(i2)) + " Track:" + i2 + ", " + C1213a.toLogString(c14971a.getTrackFormat(i2)) + ", supported=" + t0i.getFormatSupportString(c14971a.getTrackSupport(i2)));
            }
            m8932a("  ]");
        }
        boolean z = false;
        for (int i3 = 0; !z && i3 < groups.size(); i3++) {
            x7h.C14971a c14971a2 = groups.get(i3);
            for (int i4 = 0; !z && i4 < c14971a2.f97112a; i4++) {
                if (c14971a2.isTrackSelected(i4) && (etaVar = c14971a2.getTrackFormat(i4).f8288l) != null && etaVar.length() > 0) {
                    m8932a("  Metadata [");
                    printMetadata(etaVar, pl8.f71328a);
                    m8932a("  ]");
                    z = true;
                }
            }
        }
        m8932a("]");
    }

    @Override // p000.InterfaceC2409co
    @ovh
    public void onUpstreamDiscarded(InterfaceC2409co.b bVar, fga fgaVar) {
        logd(bVar, "upstreamDiscarded", C1213a.toLogString(fgaVar.f36528c));
    }

    @Override // p000.InterfaceC2409co
    @ovh
    public void onVideoDecoderInitialized(InterfaceC2409co.b bVar, String str, long j, long j2) {
        logd(bVar, "videoDecoderInitialized", str);
    }

    @Override // p000.InterfaceC2409co
    @ovh
    public void onVideoDecoderReleased(InterfaceC2409co.b bVar, String str) {
        logd(bVar, "videoDecoderReleased", str);
    }

    @Override // p000.InterfaceC2409co
    @ovh
    public void onVideoDisabled(InterfaceC2409co.b bVar, ol3 ol3Var) {
        logd(bVar, "videoDisabled");
    }

    @Override // p000.InterfaceC2409co
    @ovh
    public void onVideoEnabled(InterfaceC2409co.b bVar, ol3 ol3Var) {
        logd(bVar, "videoEnabled");
    }

    @Override // p000.InterfaceC2409co
    @ovh
    public void onVideoInputFormatChanged(InterfaceC2409co.b bVar, C1213a c1213a, @hib vl3 vl3Var) {
        logd(bVar, "videoInputFormat", C1213a.toLogString(c1213a));
    }

    @Override // p000.InterfaceC2409co
    @ovh
    public void onVideoSizeChanged(InterfaceC2409co.b bVar, a8i a8iVar) {
        StringBuilder sb = new StringBuilder("w=" + a8iVar.f647a + ", h=" + a8iVar.f648b);
        if (a8iVar.f650d != 1.0f) {
            sb.append(", par=");
            sb.append(a8iVar.f650d);
        }
        logd(bVar, "videoSize", sb.toString());
    }

    @Override // p000.InterfaceC2409co
    @ovh
    public void onVolumeChanged(InterfaceC2409co.b bVar, float f) {
        logd(bVar, "volume", Float.toString(f));
    }

    public d65(String str) {
        this.f28516n0 = str;
        this.f28517o0 = new q1h.C11272d();
        this.f28518p0 = new q1h.C11270b();
        this.f28519q0 = SystemClock.elapsedRealtime();
    }

    private void logd(InterfaceC2409co.b bVar, String str, String str2) {
        m8932a(getEventString(bVar, str, str2, null));
    }

    private void loge(InterfaceC2409co.b bVar, String str, String str2, @hib Throwable th) {
        m8933b(getEventString(bVar, str, str2, th));
    }

    @ovh
    @Deprecated
    public d65(@hib rt9 rt9Var) {
        this("EventLogger");
    }

    @ovh
    @Deprecated
    public d65(@hib rt9 rt9Var, String str) {
        this(str);
    }
}
