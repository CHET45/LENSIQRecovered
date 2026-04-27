package p000;

import android.content.Context;
import android.media.DeniedByServerException;
import android.media.MediaCodec;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.util.Pair;
import com.google.android.exoplayer2.drm.C3002b;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.drm.InterfaceC3004d;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.UUID;
import p000.InterfaceC5415eo;
import p000.aga;
import p000.ch0;
import p000.en7;
import p000.lzc;
import p000.os5;
import p000.t1h;
import p000.tqh;
import p000.tyc;
import p000.uda;
import p000.vna;
import p000.y7h;

/* JADX INFO: loaded from: classes4.dex */
@c5e(31)
@Deprecated
public final class qia implements InterfaceC5415eo, tyc.InterfaceC13289a {

    /* JADX INFO: renamed from: A0 */
    @hib
    public C11484b f74503A0;

    /* JADX INFO: renamed from: B0 */
    @hib
    public kq6 f74504B0;

    /* JADX INFO: renamed from: C0 */
    @hib
    public kq6 f74505C0;

    /* JADX INFO: renamed from: D0 */
    @hib
    public kq6 f74506D0;

    /* JADX INFO: renamed from: E0 */
    public boolean f74507E0;

    /* JADX INFO: renamed from: F0 */
    public int f74508F0;

    /* JADX INFO: renamed from: G0 */
    public boolean f74509G0;

    /* JADX INFO: renamed from: H0 */
    public int f74510H0;

    /* JADX INFO: renamed from: I0 */
    public int f74511I0;

    /* JADX INFO: renamed from: J0 */
    public int f74512J0;

    /* JADX INFO: renamed from: K0 */
    public boolean f74513K0;

    /* JADX INFO: renamed from: k0 */
    public final Context f74514k0;

    /* JADX INFO: renamed from: l0 */
    public final tyc f74515l0;

    /* JADX INFO: renamed from: m0 */
    public final PlaybackSession f74516m0;

    /* JADX INFO: renamed from: s0 */
    @hib
    public String f74522s0;

    /* JADX INFO: renamed from: t0 */
    @hib
    public PlaybackMetrics.Builder f74523t0;

    /* JADX INFO: renamed from: u0 */
    public int f74524u0;

    /* JADX INFO: renamed from: x0 */
    @hib
    public lyc f74527x0;

    /* JADX INFO: renamed from: y0 */
    @hib
    public C11484b f74528y0;

    /* JADX INFO: renamed from: z0 */
    @hib
    public C11484b f74529z0;

    /* JADX INFO: renamed from: o0 */
    public final t1h.C12851d f74518o0 = new t1h.C12851d();

    /* JADX INFO: renamed from: p0 */
    public final t1h.C12849b f74519p0 = new t1h.C12849b();

    /* JADX INFO: renamed from: r0 */
    public final HashMap<String, Long> f74521r0 = new HashMap<>();

    /* JADX INFO: renamed from: q0 */
    public final HashMap<String, Long> f74520q0 = new HashMap<>();

    /* JADX INFO: renamed from: n0 */
    public final long f74517n0 = SystemClock.elapsedRealtime();

    /* JADX INFO: renamed from: v0 */
    public int f74525v0 = 0;

    /* JADX INFO: renamed from: w0 */
    public int f74526w0 = 0;

    /* JADX INFO: renamed from: qia$a */
    public static final class C11483a {

        /* JADX INFO: renamed from: a */
        public final int f74530a;

        /* JADX INFO: renamed from: b */
        public final int f74531b;

        public C11483a(int i, int i2) {
            this.f74530a = i;
            this.f74531b = i2;
        }
    }

    /* JADX INFO: renamed from: qia$b */
    public static final class C11484b {

        /* JADX INFO: renamed from: a */
        public final kq6 f74532a;

        /* JADX INFO: renamed from: b */
        public final int f74533b;

        /* JADX INFO: renamed from: c */
        public final String f74534c;

        public C11484b(kq6 kq6Var, int i, String str) {
            this.f74532a = kq6Var;
            this.f74533b = i;
            this.f74534c = str;
        }
    }

    private qia(Context context, PlaybackSession playbackSession) {
        this.f74514k0 = context.getApplicationContext();
        this.f74516m0 = playbackSession;
        ay3 ay3Var = new ay3();
        this.f74515l0 = ay3Var;
        ay3Var.setListener(this);
    }

    @a35(expression = {"#1"}, result = true)
    private boolean canReportPendingFormatUpdate(@hib C11484b c11484b) {
        return c11484b != null && c11484b.f74534c.equals(this.f74515l0.getActiveSessionId());
    }

    @hib
    public static qia create(Context context) {
        MediaMetricsManager mediaMetricsManagerM14746a = kha.m14746a(context.getSystemService("media_metrics"));
        if (mediaMetricsManagerM14746a == null) {
            return null;
        }
        return new qia(context, mediaMetricsManagerM14746a.createPlaybackSession());
    }

    private void finishCurrentSession() {
        PlaybackMetrics.Builder builder = this.f74523t0;
        if (builder != null && this.f74513K0) {
            builder.setAudioUnderrunCount(this.f74512J0);
            this.f74523t0.setVideoFramesDropped(this.f74510H0);
            this.f74523t0.setVideoFramesPlayed(this.f74511I0);
            Long l = this.f74520q0.get(this.f74522s0);
            this.f74523t0.setNetworkTransferDurationMillis(l == null ? 0L : l.longValue());
            Long l2 = this.f74521r0.get(this.f74522s0);
            this.f74523t0.setNetworkBytesRead(l2 == null ? 0L : l2.longValue());
            this.f74523t0.setStreamSource((l2 == null || l2.longValue() <= 0) ? 0 : 1);
            this.f74516m0.reportPlaybackMetrics(this.f74523t0.build());
        }
        this.f74523t0 = null;
        this.f74522s0 = null;
        this.f74512J0 = 0;
        this.f74510H0 = 0;
        this.f74511I0 = 0;
        this.f74504B0 = null;
        this.f74505C0 = null;
        this.f74506D0 = null;
        this.f74513K0 = false;
    }

    @igg({"SwitchIntDef"})
    private static int getDrmErrorCode(int i) {
        switch (x0i.getErrorCodeForMediaDrmErrorCode(i)) {
            case 6002:
                return 24;
            case 6003:
                return 28;
            case 6004:
                return 25;
            case 6005:
                return 26;
            default:
                return 27;
        }
    }

    @hib
    private static DrmInitData getDrmInitData(kx7<y7h.C15542a> kx7Var) {
        DrmInitData drmInitData;
        quh<y7h.C15542a> it = kx7Var.iterator();
        while (it.hasNext()) {
            y7h.C15542a next = it.next();
            for (int i = 0; i < next.f100710a; i++) {
                if (next.isTrackSelected(i) && (drmInitData = next.getTrackFormat(i).f54994X) != null) {
                    return drmInitData;
                }
            }
        }
        return null;
    }

    private static int getDrmType(DrmInitData drmInitData) {
        for (int i = 0; i < drmInitData.f19396d; i++) {
            UUID uuid = drmInitData.get(i).f19398b;
            if (uuid.equals(kk1.f54461g2)) {
                return 3;
            }
            if (uuid.equals(kk1.f54466h2)) {
                return 2;
            }
            if (uuid.equals(kk1.f54456f2)) {
                return 6;
            }
        }
        return 1;
    }

    private static C11483a getErrorInfo(lyc lycVar, Context context, boolean z) {
        int i;
        boolean z2;
        if (lycVar.f59257a == 1001) {
            return new C11483a(20, 0);
        }
        if (lycVar instanceof ba5) {
            ba5 ba5Var = (ba5) lycVar;
            z2 = ba5Var.f13134A2 == 1;
            i = ba5Var.f13138E2;
        } else {
            i = 0;
            z2 = false;
        }
        Throwable th = (Throwable) u80.checkNotNull(lycVar.getCause());
        if (!(th instanceof IOException)) {
            if (z2 && (i == 0 || i == 1)) {
                return new C11483a(35, 0);
            }
            if (z2 && i == 3) {
                return new C11483a(15, 0);
            }
            if (z2 && i == 2) {
                return new C11483a(23, 0);
            }
            if (th instanceof uda.C13509b) {
                return new C11483a(13, x0i.getErrorCodeFromPlatformDiagnosticsInfo(((uda.C13509b) th).f87747d));
            }
            if (th instanceof ida) {
                return new C11483a(14, x0i.getErrorCodeFromPlatformDiagnosticsInfo(((ida) th).f46552b));
            }
            if (th instanceof OutOfMemoryError) {
                return new C11483a(14, 0);
            }
            if (th instanceof ch0.C2309b) {
                return new C11483a(17, ((ch0.C2309b) th).f16512a);
            }
            if (th instanceof ch0.C2313f) {
                return new C11483a(18, ((ch0.C2313f) th).f16517a);
            }
            if (x0i.f95978a < 16 || !(th instanceof MediaCodec.CryptoException)) {
                return new C11483a(22, 0);
            }
            int errorCode = ((MediaCodec.CryptoException) th).getErrorCode();
            return new C11483a(getDrmErrorCode(errorCode), errorCode);
        }
        if (th instanceof en7.C5410f) {
            return new C11483a(5, ((en7.C5410f) th).f33595C);
        }
        if ((th instanceof en7.C5409e) || (th instanceof xhc)) {
            return new C11483a(z ? 10 : 11, 0);
        }
        boolean z3 = th instanceof en7.C5408d;
        if (z3 || (th instanceof tqh.C13169a)) {
            if (gcb.getInstance(context).getNetworkType() == 1) {
                return new C11483a(3, 0);
            }
            Throwable cause = th.getCause();
            return cause instanceof UnknownHostException ? new C11483a(6, 0) : cause instanceof SocketTimeoutException ? new C11483a(7, 0) : (z3 && ((en7.C5408d) th).f33593d == 1) ? new C11483a(4, 0) : new C11483a(8, 0);
        }
        if (lycVar.f59257a == 1002) {
            return new C11483a(21, 0);
        }
        if (!(th instanceof InterfaceC3004d.a)) {
            if (!(th instanceof os5.C10630c) || !(th.getCause() instanceof FileNotFoundException)) {
                return new C11483a(9, 0);
            }
            Throwable cause2 = ((Throwable) u80.checkNotNull(th.getCause())).getCause();
            return (x0i.f95978a >= 21 && (cause2 instanceof ErrnoException) && ((ErrnoException) cause2).errno == OsConstants.EACCES) ? new C11483a(32, 0) : new C11483a(31, 0);
        }
        Throwable th2 = (Throwable) u80.checkNotNull(th.getCause());
        int i2 = x0i.f95978a;
        if (i2 < 21 || !(th2 instanceof MediaDrm.MediaDrmStateException)) {
            return (i2 < 23 || !(th2 instanceof MediaDrmResetException)) ? (i2 < 18 || !(th2 instanceof NotProvisionedException)) ? (i2 < 18 || !(th2 instanceof DeniedByServerException)) ? th2 instanceof svh ? new C11483a(23, 0) : th2 instanceof C3002b.e ? new C11483a(28, 0) : new C11483a(30, 0) : new C11483a(29, 0) : new C11483a(24, 0) : new C11483a(27, 0);
        }
        int errorCodeFromPlatformDiagnosticsInfo = x0i.getErrorCodeFromPlatformDiagnosticsInfo(((MediaDrm.MediaDrmStateException) th2).getDiagnosticInfo());
        return new C11483a(getDrmErrorCode(errorCodeFromPlatformDiagnosticsInfo), errorCodeFromPlatformDiagnosticsInfo);
    }

    private static Pair<String, String> getLanguageAndRegion(String str) {
        String[] strArrSplit = x0i.split(str, "-");
        return Pair.create(strArrSplit[0], strArrSplit.length >= 2 ? strArrSplit[1] : null);
    }

    private static int getNetworkType(Context context) {
        switch (gcb.getInstance(context).getNetworkType()) {
            case 0:
                return 0;
            case 1:
                return 9;
            case 2:
                return 2;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
            case 8:
            default:
                return 1;
            case 7:
                return 3;
            case 9:
                return 8;
            case 10:
                return 7;
        }
    }

    private static int getStreamType(aga agaVar) {
        aga.C0240h c0240h = agaVar.f1446b;
        if (c0240h == null) {
            return 0;
        }
        int iInferContentTypeForUriAndMimeType = x0i.inferContentTypeForUriAndMimeType(c0240h.f1544a, c0240h.f1545b);
        if (iInferContentTypeForUriAndMimeType == 0) {
            return 3;
        }
        if (iInferContentTypeForUriAndMimeType != 1) {
            return iInferContentTypeForUriAndMimeType != 2 ? 1 : 4;
        }
        return 5;
    }

    private static int getTrackChangeReason(int i) {
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 3 ? 1 : 4;
        }
        return 3;
    }

    private void maybeAddSessions(InterfaceC5415eo.c cVar) {
        for (int i = 0; i < cVar.size(); i++) {
            int i2 = cVar.get(i);
            InterfaceC5415eo.b eventTime = cVar.getEventTime(i2);
            if (i2 == 0) {
                this.f74515l0.updateSessionsWithTimelineChange(eventTime);
            } else if (i2 == 11) {
                this.f74515l0.updateSessionsWithDiscontinuity(eventTime, this.f74524u0);
            } else {
                this.f74515l0.updateSessions(eventTime);
            }
        }
    }

    private void maybeReportNetworkChange(long j) {
        int networkType = getNetworkType(this.f74514k0);
        if (networkType != this.f74526w0) {
            this.f74526w0 = networkType;
            this.f74516m0.reportNetworkEvent(aia.m629a().setNetworkType(networkType).setTimeSinceCreatedMillis(j - this.f74517n0).build());
        }
    }

    private void maybeReportPlaybackError(long j) {
        lyc lycVar = this.f74527x0;
        if (lycVar == null) {
            return;
        }
        C11483a errorInfo = getErrorInfo(lycVar, this.f74514k0, this.f74508F0 == 4);
        this.f74516m0.reportPlaybackErrorEvent(dia.m9179a().setTimeSinceCreatedMillis(j - this.f74517n0).setErrorCode(errorInfo.f74530a).setSubErrorCode(errorInfo.f74531b).setException(lycVar).build());
        this.f74513K0 = true;
        this.f74527x0 = null;
    }

    private void maybeReportPlaybackStateChange(lzc lzcVar, InterfaceC5415eo.c cVar, long j) {
        if (lzcVar.getPlaybackState() != 2) {
            this.f74507E0 = false;
        }
        if (lzcVar.getPlayerError() == null) {
            this.f74509G0 = false;
        } else if (cVar.contains(10)) {
            this.f74509G0 = true;
        }
        int iResolveNewPlaybackState = resolveNewPlaybackState(lzcVar);
        if (this.f74525v0 != iResolveNewPlaybackState) {
            this.f74525v0 = iResolveNewPlaybackState;
            this.f74513K0 = true;
            this.f74516m0.reportPlaybackStateEvent(eia.m9992a().setState(this.f74525v0).setTimeSinceCreatedMillis(j - this.f74517n0).build());
        }
    }

    private void maybeReportTrackChanges(lzc lzcVar, InterfaceC5415eo.c cVar, long j) {
        if (cVar.contains(2)) {
            y7h currentTracks = lzcVar.getCurrentTracks();
            boolean zIsTypeSelected = currentTracks.isTypeSelected(2);
            boolean zIsTypeSelected2 = currentTracks.isTypeSelected(1);
            boolean zIsTypeSelected3 = currentTracks.isTypeSelected(3);
            if (zIsTypeSelected || zIsTypeSelected2 || zIsTypeSelected3) {
                if (!zIsTypeSelected) {
                    maybeUpdateVideoFormat(j, null, 0);
                }
                if (!zIsTypeSelected2) {
                    maybeUpdateAudioFormat(j, null, 0);
                }
                if (!zIsTypeSelected3) {
                    maybeUpdateTextFormat(j, null, 0);
                }
            }
        }
        if (canReportPendingFormatUpdate(this.f74528y0)) {
            C11484b c11484b = this.f74528y0;
            kq6 kq6Var = c11484b.f74532a;
            if (kq6Var.f54990M1 != -1) {
                maybeUpdateVideoFormat(j, kq6Var, c11484b.f74533b);
                this.f74528y0 = null;
            }
        }
        if (canReportPendingFormatUpdate(this.f74529z0)) {
            C11484b c11484b2 = this.f74529z0;
            maybeUpdateAudioFormat(j, c11484b2.f74532a, c11484b2.f74533b);
            this.f74529z0 = null;
        }
        if (canReportPendingFormatUpdate(this.f74503A0)) {
            C11484b c11484b3 = this.f74503A0;
            maybeUpdateTextFormat(j, c11484b3.f74532a, c11484b3.f74533b);
            this.f74503A0 = null;
        }
    }

    private void maybeUpdateAudioFormat(long j, @hib kq6 kq6Var, int i) {
        if (x0i.areEqual(this.f74505C0, kq6Var)) {
            return;
        }
        if (this.f74505C0 == null && i == 0) {
            i = 1;
        }
        this.f74505C0 = kq6Var;
        reportTrackChangeEvent(0, j, kq6Var, i);
    }

    private void maybeUpdateMetricsBuilderValues(lzc lzcVar, InterfaceC5415eo.c cVar) {
        DrmInitData drmInitData;
        if (cVar.contains(0)) {
            InterfaceC5415eo.b eventTime = cVar.getEventTime(0);
            if (this.f74523t0 != null) {
                maybeUpdateTimelineMetadata(eventTime.f33693b, eventTime.f33695d);
            }
        }
        if (cVar.contains(2) && this.f74523t0 != null && (drmInitData = getDrmInitData(lzcVar.getCurrentTracks().getGroups())) != null) {
            aha.m582a(x0i.castNonNull(this.f74523t0)).setDrmType(getDrmType(drmInitData));
        }
        if (cVar.contains(1011)) {
            this.f74512J0++;
        }
    }

    private void maybeUpdateTextFormat(long j, @hib kq6 kq6Var, int i) {
        if (x0i.areEqual(this.f74506D0, kq6Var)) {
            return;
        }
        if (this.f74506D0 == null && i == 0) {
            i = 1;
        }
        this.f74506D0 = kq6Var;
        reportTrackChangeEvent(2, j, kq6Var, i);
    }

    @g5e({"metricsBuilder"})
    private void maybeUpdateTimelineMetadata(t1h t1hVar, @hib vna.C14175b c14175b) {
        int indexOfPeriod;
        PlaybackMetrics.Builder builder = this.f74523t0;
        if (c14175b == null || (indexOfPeriod = t1hVar.getIndexOfPeriod(c14175b.f71106a)) == -1) {
            return;
        }
        t1hVar.getPeriod(indexOfPeriod, this.f74519p0);
        t1hVar.getWindow(this.f74519p0.f83398c, this.f74518o0);
        builder.setStreamType(getStreamType(this.f74518o0.f83436c));
        t1h.C12851d c12851d = this.f74518o0;
        if (c12851d.f83430Q != -9223372036854775807L && !c12851d.f83428M && !c12851d.f83425F && !c12851d.isLive()) {
            builder.setMediaDurationMillis(this.f74518o0.getDurationMs());
        }
        builder.setPlaybackType(this.f74518o0.isLive() ? 2 : 1);
        this.f74513K0 = true;
    }

    private void maybeUpdateVideoFormat(long j, @hib kq6 kq6Var, int i) {
        if (x0i.areEqual(this.f74504B0, kq6Var)) {
            return;
        }
        if (this.f74504B0 == null && i == 0) {
            i = 1;
        }
        this.f74504B0 = kq6Var;
        reportTrackChangeEvent(1, j, kq6Var, i);
    }

    private void reportTrackChangeEvent(int i, long j, @hib kq6 kq6Var, int i2) {
        TrackChangeEvent.Builder timeSinceCreatedMillis = zha.m26807a(i).setTimeSinceCreatedMillis(j - this.f74517n0);
        if (kq6Var != null) {
            timeSinceCreatedMillis.setTrackState(1);
            timeSinceCreatedMillis.setTrackChangeReason(getTrackChangeReason(i2));
            String str = kq6Var.f54988L;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = kq6Var.f54989M;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = kq6Var.f54986F;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i3 = kq6Var.f54985C;
            if (i3 != -1) {
                timeSinceCreatedMillis.setBitrate(i3);
            }
            int i4 = kq6Var.f54996Z;
            if (i4 != -1) {
                timeSinceCreatedMillis.setWidth(i4);
            }
            int i5 = kq6Var.f54990M1;
            if (i5 != -1) {
                timeSinceCreatedMillis.setHeight(i5);
            }
            int i6 = kq6Var.f55007e2;
            if (i6 != -1) {
                timeSinceCreatedMillis.setChannelCount(i6);
            }
            int i7 = kq6Var.f55009f2;
            if (i7 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i7);
            }
            String str4 = kq6Var.f55002c;
            if (str4 != null) {
                Pair<String, String> languageAndRegion = getLanguageAndRegion(str4);
                timeSinceCreatedMillis.setLanguage((String) languageAndRegion.first);
                Object obj = languageAndRegion.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f = kq6Var.f54993V1;
            if (f != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.f74513K0 = true;
        this.f74516m0.reportTrackChangeEvent(timeSinceCreatedMillis.build());
    }

    private int resolveNewPlaybackState(lzc lzcVar) {
        int playbackState = lzcVar.getPlaybackState();
        if (this.f74507E0) {
            return 5;
        }
        if (this.f74509G0) {
            return 13;
        }
        if (playbackState == 4) {
            return 11;
        }
        if (playbackState == 2) {
            int i = this.f74525v0;
            if (i == 0 || i == 2) {
                return 2;
            }
            if (lzcVar.getPlayWhenReady()) {
                return lzcVar.getPlaybackSuppressionReason() != 0 ? 10 : 6;
            }
            return 7;
        }
        if (playbackState == 3) {
            if (lzcVar.getPlayWhenReady()) {
                return lzcVar.getPlaybackSuppressionReason() != 0 ? 9 : 3;
            }
            return 4;
        }
        if (playbackState != 1 || this.f74525v0 == 0) {
            return this.f74525v0;
        }
        return 12;
    }

    public LogSessionId getLogSessionId() {
        return this.f74516m0.getSessionId();
    }

    @Override // p000.tyc.InterfaceC13289a
    public void onAdPlaybackStarted(InterfaceC5415eo.b bVar, String str, String str2) {
    }

    @Override // p000.InterfaceC5415eo
    public void onBandwidthEstimate(InterfaceC5415eo.b bVar, int i, long j, long j2) {
        vna.C14175b c14175b = bVar.f33695d;
        if (c14175b != null) {
            String sessionForMediaPeriodId = this.f74515l0.getSessionForMediaPeriodId(bVar.f33693b, (vna.C14175b) u80.checkNotNull(c14175b));
            Long l = this.f74521r0.get(sessionForMediaPeriodId);
            Long l2 = this.f74520q0.get(sessionForMediaPeriodId);
            this.f74521r0.put(sessionForMediaPeriodId, Long.valueOf((l == null ? 0L : l.longValue()) + j));
            this.f74520q0.put(sessionForMediaPeriodId, Long.valueOf((l2 != null ? l2.longValue() : 0L) + ((long) i)));
        }
    }

    @Override // p000.InterfaceC5415eo
    public void onDownstreamFormatChanged(InterfaceC5415eo.b bVar, ega egaVar) {
        if (bVar.f33695d == null) {
            return;
        }
        C11484b c11484b = new C11484b((kq6) u80.checkNotNull(egaVar.f32944c), egaVar.f32945d, this.f74515l0.getSessionForMediaPeriodId(bVar.f33693b, (vna.C14175b) u80.checkNotNull(bVar.f33695d)));
        int i = egaVar.f32943b;
        if (i != 0) {
            if (i == 1) {
                this.f74529z0 = c11484b;
                return;
            } else if (i != 2) {
                if (i != 3) {
                    return;
                }
                this.f74503A0 = c11484b;
                return;
            }
        }
        this.f74528y0 = c11484b;
    }

    @Override // p000.InterfaceC5415eo
    public void onEvents(lzc lzcVar, InterfaceC5415eo.c cVar) {
        if (cVar.size() == 0) {
            return;
        }
        maybeAddSessions(cVar);
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        maybeUpdateMetricsBuilderValues(lzcVar, cVar);
        maybeReportPlaybackError(jElapsedRealtime);
        maybeReportTrackChanges(lzcVar, cVar, jElapsedRealtime);
        maybeReportNetworkChange(jElapsedRealtime);
        maybeReportPlaybackStateChange(lzcVar, cVar, jElapsedRealtime);
        if (cVar.contains(1028)) {
            this.f74515l0.finishAllSessions(cVar.getEventTime(1028));
        }
    }

    @Override // p000.InterfaceC5415eo
    public void onLoadError(InterfaceC5415eo.b bVar, jc9 jc9Var, ega egaVar, IOException iOException, boolean z) {
        this.f74508F0 = egaVar.f32942a;
    }

    @Override // p000.InterfaceC5415eo
    public void onPlayerError(InterfaceC5415eo.b bVar, lyc lycVar) {
        this.f74527x0 = lycVar;
    }

    @Override // p000.InterfaceC5415eo
    public void onPositionDiscontinuity(InterfaceC5415eo.b bVar, lzc.C9053k c9053k, lzc.C9053k c9053k2, int i) {
        if (i == 1) {
            this.f74507E0 = true;
        }
        this.f74524u0 = i;
    }

    @Override // p000.tyc.InterfaceC13289a
    public void onSessionActive(InterfaceC5415eo.b bVar, String str) {
        vna.C14175b c14175b = bVar.f33695d;
        if (c14175b == null || !c14175b.isAd()) {
            finishCurrentSession();
            this.f74522s0 = str;
            this.f74523t0 = cia.m3985a().setPlayerName(lf5.f57467a).setPlayerVersion(lf5.f57468b);
            maybeUpdateTimelineMetadata(bVar.f33693b, bVar.f33695d);
        }
    }

    @Override // p000.tyc.InterfaceC13289a
    public void onSessionCreated(InterfaceC5415eo.b bVar, String str) {
    }

    @Override // p000.tyc.InterfaceC13289a
    public void onSessionFinished(InterfaceC5415eo.b bVar, String str, boolean z) {
        vna.C14175b c14175b = bVar.f33695d;
        if ((c14175b == null || !c14175b.isAd()) && str.equals(this.f74522s0)) {
            finishCurrentSession();
        }
        this.f74520q0.remove(str);
        this.f74521r0.remove(str);
    }

    @Override // p000.InterfaceC5415eo
    public void onVideoDisabled(InterfaceC5415eo.b bVar, nl3 nl3Var) {
        this.f74510H0 += nl3Var.f64834g;
        this.f74511I0 += nl3Var.f64832e;
    }

    @Override // p000.InterfaceC5415eo
    public void onVideoSizeChanged(InterfaceC5415eo.b bVar, z7i z7iVar) {
        C11484b c11484b = this.f74528y0;
        if (c11484b != null) {
            kq6 kq6Var = c11484b.f74532a;
            if (kq6Var.f54990M1 == -1) {
                this.f74528y0 = new C11484b(kq6Var.buildUpon().setWidth(z7iVar.f104349a).setHeight(z7iVar.f104350b).build(), c11484b.f74533b, c11484b.f74534c);
            }
        }
    }
}
