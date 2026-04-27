package p000;

import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.exoplayer2.metadata.Metadata;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.Locale;
import p000.InterfaceC5415eo;
import p000.a77;
import p000.lzc;
import p000.t1h;
import p000.y7h;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class c65 implements InterfaceC5415eo {

    /* JADX INFO: renamed from: o0 */
    public static final String f15828o0 = "EventLogger";

    /* JADX INFO: renamed from: p0 */
    public static final int f15829p0 = 3;

    /* JADX INFO: renamed from: q0 */
    public static final NumberFormat f15830q0;

    /* JADX INFO: renamed from: k0 */
    public final String f15831k0;

    /* JADX INFO: renamed from: l0 */
    public final t1h.C12851d f15832l0;

    /* JADX INFO: renamed from: m0 */
    public final t1h.C12849b f15833m0;

    /* JADX INFO: renamed from: n0 */
    public final long f15834n0;

    static {
        NumberFormat numberFormat = NumberFormat.getInstance(Locale.US);
        f15830q0 = numberFormat;
        numberFormat.setMinimumFractionDigits(2);
        numberFormat.setMaximumFractionDigits(2);
        numberFormat.setGroupingUsed(false);
    }

    public c65() {
        this("EventLogger");
    }

    private static String getDiscontinuityReasonString(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "?" : "INTERNAL" : pe4.f70512c2 : "SKIP" : "SEEK_ADJUSTMENT" : "SEEK" : "AUTO_TRANSITION";
    }

    private String getEventString(InterfaceC5415eo.b bVar, String str, @hib String str2, @hib Throwable th) {
        String str3 = str + " [" + getEventTimeString(bVar);
        if (th instanceof lyc) {
            str3 = str3 + ", errorCode=" + ((lyc) th).getErrorCodeName();
        }
        if (str2 != null) {
            str3 = str3 + ", " + str2;
        }
        String throwableString = yh9.getThrowableString(th);
        if (!TextUtils.isEmpty(throwableString)) {
            str3 = str3 + "\n  " + throwableString.replace("\n", "\n  ") + '\n';
        }
        return str3 + "]";
    }

    private String getEventTimeString(InterfaceC5415eo.b bVar) {
        String str = "window=" + bVar.f33694c;
        if (bVar.f33695d != null) {
            str = str + ", period=" + bVar.f33693b.getIndexOfPeriod(bVar.f33695d.f71106a);
            if (bVar.f33695d.isAd()) {
                str = (str + ", adGroup=" + bVar.f33695d.f71107b) + ", ad=" + bVar.f33695d.f71108c;
            }
        }
        return "eventTime=" + getTimeString(bVar.f33692a - this.f15834n0) + ", mediaPos=" + getTimeString(bVar.f33696e) + ", " + str;
    }

    private static String getMediaItemTransitionReasonString(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? "?" : "PLAYLIST_CHANGED" : "SEEK" : "AUTO" : "REPEAT";
    }

    private static String getPlayWhenReadyChangeReasonString(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "?" : "END_OF_MEDIA_ITEM" : "REMOTE" : "AUDIO_BECOMING_NOISY" : "AUDIO_FOCUS_LOSS" : "USER_REQUEST";
    }

    private static String getPlaybackSuppressionReasonString(int i) {
        return i != 0 ? i != 1 ? "?" : "TRANSIENT_AUDIO_FOCUS_LOSS" : "NONE";
    }

    private static String getRepeatModeString(int i) {
        return i != 0 ? i != 1 ? i != 2 ? "?" : "ALL" : "ONE" : "OFF";
    }

    private static String getStateString(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "?" : "ENDED" : "READY" : "BUFFERING" : "IDLE";
    }

    private static String getTimeString(long j) {
        return j == -9223372036854775807L ? "?" : f15830q0.format(j / 1000.0f);
    }

    private static String getTimelineChangeReasonString(int i) {
        return i != 0 ? i != 1 ? "?" : "SOURCE_UPDATE" : "PLAYLIST_CHANGED";
    }

    private static String getTrackStatusString(boolean z) {
        return z ? "[X]" : "[ ]";
    }

    private void logd(InterfaceC5415eo.b bVar, String str) {
        m3820a(getEventString(bVar, str, null, null));
    }

    private void loge(InterfaceC5415eo.b bVar, String str, @hib Throwable th) {
        m3821b(getEventString(bVar, str, null, th));
    }

    private void printInternalError(InterfaceC5415eo.b bVar, String str, Exception exc) {
        loge(bVar, "internalError", str, exc);
    }

    private void printMetadata(Metadata metadata, String str) {
        for (int i = 0; i < metadata.length(); i++) {
            m3820a(str + metadata.get(i));
        }
    }

    /* JADX INFO: renamed from: a */
    public void m3820a(String str) {
        yh9.m25913d(this.f15831k0, str);
    }

    /* JADX INFO: renamed from: b */
    public void m3821b(String str) {
        yh9.m25915e(this.f15831k0, str);
    }

    @Override // p000.InterfaceC5415eo
    public void onAudioAttributesChanged(InterfaceC5415eo.b bVar, yc0 yc0Var) {
        logd(bVar, "audioAttributes", yc0Var.f101070a + "," + yc0Var.f101071b + "," + yc0Var.f101072c + "," + yc0Var.f101073d);
    }

    @Override // p000.InterfaceC5415eo
    public void onAudioDecoderInitialized(InterfaceC5415eo.b bVar, String str, long j) {
        logd(bVar, "audioDecoderInitialized", str);
    }

    @Override // p000.InterfaceC5415eo
    public void onAudioDecoderReleased(InterfaceC5415eo.b bVar, String str) {
        logd(bVar, "audioDecoderReleased", str);
    }

    @Override // p000.InterfaceC5415eo
    public void onAudioDisabled(InterfaceC5415eo.b bVar, nl3 nl3Var) {
        logd(bVar, "audioDisabled");
    }

    @Override // p000.InterfaceC5415eo
    public void onAudioEnabled(InterfaceC5415eo.b bVar, nl3 nl3Var) {
        logd(bVar, "audioEnabled");
    }

    @Override // p000.InterfaceC5415eo
    public void onAudioInputFormatChanged(InterfaceC5415eo.b bVar, kq6 kq6Var, @hib wl3 wl3Var) {
        logd(bVar, "audioInputFormat", kq6.toLogString(kq6Var));
    }

    @Override // p000.InterfaceC5415eo
    public void onAudioSessionIdChanged(InterfaceC5415eo.b bVar, int i) {
        logd(bVar, "audioSessionId", Integer.toString(i));
    }

    @Override // p000.InterfaceC5415eo
    public void onAudioUnderrun(InterfaceC5415eo.b bVar, int i, long j, long j2) {
        loge(bVar, "audioTrackUnderrun", i + ", " + j + ", " + j2, null);
    }

    @Override // p000.InterfaceC5415eo
    public void onBandwidthEstimate(InterfaceC5415eo.b bVar, int i, long j, long j2) {
    }

    @Override // p000.InterfaceC5415eo
    public void onDownstreamFormatChanged(InterfaceC5415eo.b bVar, ega egaVar) {
        logd(bVar, "downstreamFormat", kq6.toLogString(egaVar.f32944c));
    }

    @Override // p000.InterfaceC5415eo
    public void onDrmKeysLoaded(InterfaceC5415eo.b bVar) {
        logd(bVar, "drmKeysLoaded");
    }

    @Override // p000.InterfaceC5415eo
    public void onDrmKeysRemoved(InterfaceC5415eo.b bVar) {
        logd(bVar, "drmKeysRemoved");
    }

    @Override // p000.InterfaceC5415eo
    public void onDrmKeysRestored(InterfaceC5415eo.b bVar) {
        logd(bVar, "drmKeysRestored");
    }

    @Override // p000.InterfaceC5415eo
    public void onDrmSessionAcquired(InterfaceC5415eo.b bVar, int i) {
        logd(bVar, "drmSessionAcquired", "state=" + i);
    }

    @Override // p000.InterfaceC5415eo
    public void onDrmSessionManagerError(InterfaceC5415eo.b bVar, Exception exc) {
        printInternalError(bVar, "drmSessionManagerError", exc);
    }

    @Override // p000.InterfaceC5415eo
    public void onDrmSessionReleased(InterfaceC5415eo.b bVar) {
        logd(bVar, "drmSessionReleased");
    }

    @Override // p000.InterfaceC5415eo
    public void onDroppedVideoFrames(InterfaceC5415eo.b bVar, int i, long j) {
        logd(bVar, "droppedFrames", Integer.toString(i));
    }

    @Override // p000.InterfaceC5415eo
    public void onIsLoadingChanged(InterfaceC5415eo.b bVar, boolean z) {
        logd(bVar, "loading", Boolean.toString(z));
    }

    @Override // p000.InterfaceC5415eo
    public void onIsPlayingChanged(InterfaceC5415eo.b bVar, boolean z) {
        logd(bVar, "isPlaying", Boolean.toString(z));
    }

    @Override // p000.InterfaceC5415eo
    public void onLoadCanceled(InterfaceC5415eo.b bVar, jc9 jc9Var, ega egaVar) {
    }

    @Override // p000.InterfaceC5415eo
    public void onLoadCompleted(InterfaceC5415eo.b bVar, jc9 jc9Var, ega egaVar) {
    }

    @Override // p000.InterfaceC5415eo
    public void onLoadError(InterfaceC5415eo.b bVar, jc9 jc9Var, ega egaVar, IOException iOException, boolean z) {
        printInternalError(bVar, "loadError", iOException);
    }

    @Override // p000.InterfaceC5415eo
    public void onLoadStarted(InterfaceC5415eo.b bVar, jc9 jc9Var, ega egaVar) {
    }

    @Override // p000.InterfaceC5415eo
    public void onMediaItemTransition(InterfaceC5415eo.b bVar, @hib aga agaVar, int i) {
        m3820a("mediaItem [" + getEventTimeString(bVar) + ", reason=" + getMediaItemTransitionReasonString(i) + "]");
    }

    @Override // p000.InterfaceC5415eo
    public void onMetadata(InterfaceC5415eo.b bVar, Metadata metadata) {
        m3820a("metadata [" + getEventTimeString(bVar));
        printMetadata(metadata, a77.C0077a.f542d);
        m3820a("]");
    }

    @Override // p000.InterfaceC5415eo
    public void onPlayWhenReadyChanged(InterfaceC5415eo.b bVar, boolean z, int i) {
        logd(bVar, "playWhenReady", z + ", " + getPlayWhenReadyChangeReasonString(i));
    }

    @Override // p000.InterfaceC5415eo
    public void onPlaybackParametersChanged(InterfaceC5415eo.b bVar, qyc qycVar) {
        logd(bVar, "playbackParameters", qycVar.toString());
    }

    @Override // p000.InterfaceC5415eo
    public void onPlaybackStateChanged(InterfaceC5415eo.b bVar, int i) {
        logd(bVar, "state", getStateString(i));
    }

    @Override // p000.InterfaceC5415eo
    public void onPlaybackSuppressionReasonChanged(InterfaceC5415eo.b bVar, int i) {
        logd(bVar, "playbackSuppressionReason", getPlaybackSuppressionReasonString(i));
    }

    @Override // p000.InterfaceC5415eo
    public void onPlayerError(InterfaceC5415eo.b bVar, lyc lycVar) {
        loge(bVar, "playerFailed", lycVar);
    }

    @Override // p000.InterfaceC5415eo
    public void onPositionDiscontinuity(InterfaceC5415eo.b bVar, lzc.C9053k c9053k, lzc.C9053k c9053k2, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("reason=");
        sb.append(getDiscontinuityReasonString(i));
        sb.append(", PositionInfo:old [");
        sb.append("mediaItem=");
        sb.append(c9053k.f59458c);
        sb.append(", period=");
        sb.append(c9053k.f59461f);
        sb.append(", pos=");
        sb.append(c9053k.f59462m);
        if (c9053k.f59454F != -1) {
            sb.append(", contentPos=");
            sb.append(c9053k.f59453C);
            sb.append(", adGroup=");
            sb.append(c9053k.f59454F);
            sb.append(", ad=");
            sb.append(c9053k.f59455H);
        }
        sb.append("], PositionInfo:new [");
        sb.append("mediaItem=");
        sb.append(c9053k2.f59458c);
        sb.append(", period=");
        sb.append(c9053k2.f59461f);
        sb.append(", pos=");
        sb.append(c9053k2.f59462m);
        if (c9053k2.f59454F != -1) {
            sb.append(", contentPos=");
            sb.append(c9053k2.f59453C);
            sb.append(", adGroup=");
            sb.append(c9053k2.f59454F);
            sb.append(", ad=");
            sb.append(c9053k2.f59455H);
        }
        sb.append("]");
        logd(bVar, "positionDiscontinuity", sb.toString());
    }

    @Override // p000.InterfaceC5415eo
    public void onRenderedFirstFrame(InterfaceC5415eo.b bVar, Object obj, long j) {
        logd(bVar, "renderedFirstFrame", String.valueOf(obj));
    }

    @Override // p000.InterfaceC5415eo
    public void onRepeatModeChanged(InterfaceC5415eo.b bVar, int i) {
        logd(bVar, "repeatMode", getRepeatModeString(i));
    }

    @Override // p000.InterfaceC5415eo
    public void onShuffleModeChanged(InterfaceC5415eo.b bVar, boolean z) {
        logd(bVar, "shuffleModeEnabled", Boolean.toString(z));
    }

    @Override // p000.InterfaceC5415eo
    public void onSkipSilenceEnabledChanged(InterfaceC5415eo.b bVar, boolean z) {
        logd(bVar, "skipSilenceEnabled", Boolean.toString(z));
    }

    @Override // p000.InterfaceC5415eo
    public void onSurfaceSizeChanged(InterfaceC5415eo.b bVar, int i, int i2) {
        logd(bVar, "surfaceSize", i + ", " + i2);
    }

    @Override // p000.InterfaceC5415eo
    public void onTimelineChanged(InterfaceC5415eo.b bVar, int i) {
        int periodCount = bVar.f33693b.getPeriodCount();
        int windowCount = bVar.f33693b.getWindowCount();
        m3820a("timeline [" + getEventTimeString(bVar) + ", periodCount=" + periodCount + ", windowCount=" + windowCount + ", reason=" + getTimelineChangeReasonString(i));
        for (int i2 = 0; i2 < Math.min(periodCount, 3); i2++) {
            bVar.f33693b.getPeriod(i2, this.f15833m0);
            m3820a("  period [" + getTimeString(this.f15833m0.getDurationMs()) + "]");
        }
        if (periodCount > 3) {
            m3820a("  ...");
        }
        for (int i3 = 0; i3 < Math.min(windowCount, 3); i3++) {
            bVar.f33693b.getWindow(i3, this.f15832l0);
            m3820a("  window [" + getTimeString(this.f15832l0.getDurationMs()) + ", seekable=" + this.f15832l0.f83424C + ", dynamic=" + this.f15832l0.f83425F + "]");
        }
        if (windowCount > 3) {
            m3820a("  ...");
        }
        m3820a("]");
    }

    @Override // p000.InterfaceC5415eo
    public void onTracksChanged(InterfaceC5415eo.b bVar, y7h y7hVar) {
        Metadata metadata;
        m3820a("tracks [" + getEventTimeString(bVar));
        kx7<y7h.C15542a> groups = y7hVar.getGroups();
        for (int i = 0; i < groups.size(); i++) {
            y7h.C15542a c15542a = groups.get(i);
            m3820a("  group [");
            for (int i2 = 0; i2 < c15542a.f100710a; i2++) {
                m3820a(pl8.f71328a + getTrackStatusString(c15542a.isTrackSelected(i2)) + " Track:" + i2 + ", " + kq6.toLogString(c15542a.getTrackFormat(i2)) + ", supported=" + x0i.getFormatSupportString(c15542a.getTrackSupport(i2)));
            }
            m3820a("  ]");
        }
        boolean z = false;
        for (int i3 = 0; !z && i3 < groups.size(); i3++) {
            y7h.C15542a c15542a2 = groups.get(i3);
            for (int i4 = 0; !z && i4 < c15542a2.f100710a; i4++) {
                if (c15542a2.isTrackSelected(i4) && (metadata = c15542a2.getTrackFormat(i4).f54987H) != null && metadata.length() > 0) {
                    m3820a("  Metadata [");
                    printMetadata(metadata, pl8.f71328a);
                    m3820a("  ]");
                    z = true;
                }
            }
        }
        m3820a("]");
    }

    @Override // p000.InterfaceC5415eo
    public void onUpstreamDiscarded(InterfaceC5415eo.b bVar, ega egaVar) {
        logd(bVar, "upstreamDiscarded", kq6.toLogString(egaVar.f32944c));
    }

    @Override // p000.InterfaceC5415eo
    public void onVideoDecoderInitialized(InterfaceC5415eo.b bVar, String str, long j) {
        logd(bVar, "videoDecoderInitialized", str);
    }

    @Override // p000.InterfaceC5415eo
    public void onVideoDecoderReleased(InterfaceC5415eo.b bVar, String str) {
        logd(bVar, "videoDecoderReleased", str);
    }

    @Override // p000.InterfaceC5415eo
    public void onVideoDisabled(InterfaceC5415eo.b bVar, nl3 nl3Var) {
        logd(bVar, "videoDisabled");
    }

    @Override // p000.InterfaceC5415eo
    public void onVideoEnabled(InterfaceC5415eo.b bVar, nl3 nl3Var) {
        logd(bVar, "videoEnabled");
    }

    @Override // p000.InterfaceC5415eo
    public void onVideoInputFormatChanged(InterfaceC5415eo.b bVar, kq6 kq6Var, @hib wl3 wl3Var) {
        logd(bVar, "videoInputFormat", kq6.toLogString(kq6Var));
    }

    @Override // p000.InterfaceC5415eo
    public void onVideoSizeChanged(InterfaceC5415eo.b bVar, z7i z7iVar) {
        logd(bVar, "videoSize", z7iVar.f104349a + ", " + z7iVar.f104350b);
    }

    @Override // p000.InterfaceC5415eo
    public void onVolumeChanged(InterfaceC5415eo.b bVar, float f) {
        logd(bVar, "volume", Float.toString(f));
    }

    public c65(String str) {
        this.f15831k0 = str;
        this.f15832l0 = new t1h.C12851d();
        this.f15833m0 = new t1h.C12849b();
        this.f15834n0 = SystemClock.elapsedRealtime();
    }

    private void logd(InterfaceC5415eo.b bVar, String str, String str2) {
        m3820a(getEventString(bVar, str, str2, null));
    }

    private void loge(InterfaceC5415eo.b bVar, String str, String str2, @hib Throwable th) {
        m3821b(getEventString(bVar, str, str2, th));
    }

    @Deprecated
    public c65(@hib st9 st9Var) {
        this("EventLogger");
    }

    @Deprecated
    public c65(@hib st9 st9Var, String str) {
        this(str);
    }
}
