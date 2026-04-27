package p000;

import android.content.Context;
import android.media.DeniedByServerException;
import android.media.MediaCodec;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.PlaybackStateEvent;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.util.Pair;
import androidx.media3.common.C1213a;
import androidx.media3.common.DrmInitData;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.Executor;
import p000.InterfaceC2409co;
import p000.ar4;
import p000.bh0;
import p000.dn7;
import p000.izc;
import p000.ju3;
import p000.nfa;
import p000.ns5;
import p000.q1h;
import p000.sda;
import p000.sqh;
import p000.syc;
import p000.una;
import p000.x7h;

/* JADX INFO: loaded from: classes3.dex */
@c5e(31)
@ovh
public final class pia implements InterfaceC2409co, syc.InterfaceC12829a {

    /* JADX INFO: renamed from: B0 */
    @hib
    public kyc f70960B0;

    /* JADX INFO: renamed from: C0 */
    @hib
    public C10972b f70961C0;

    /* JADX INFO: renamed from: D0 */
    @hib
    public C10972b f70962D0;

    /* JADX INFO: renamed from: E0 */
    @hib
    public C10972b f70963E0;

    /* JADX INFO: renamed from: F0 */
    @hib
    public C1213a f70964F0;

    /* JADX INFO: renamed from: G0 */
    @hib
    public C1213a f70965G0;

    /* JADX INFO: renamed from: H0 */
    @hib
    public C1213a f70966H0;

    /* JADX INFO: renamed from: I0 */
    public boolean f70967I0;

    /* JADX INFO: renamed from: J0 */
    public int f70968J0;

    /* JADX INFO: renamed from: K0 */
    public boolean f70969K0;

    /* JADX INFO: renamed from: L0 */
    public int f70970L0;

    /* JADX INFO: renamed from: M0 */
    public int f70971M0;

    /* JADX INFO: renamed from: N0 */
    public int f70972N0;

    /* JADX INFO: renamed from: O0 */
    public boolean f70973O0;

    /* JADX INFO: renamed from: n0 */
    public final Context f70974n0;

    /* JADX INFO: renamed from: p0 */
    public final syc f70976p0;

    /* JADX INFO: renamed from: q0 */
    public final PlaybackSession f70977q0;

    /* JADX INFO: renamed from: w0 */
    @hib
    public String f70983w0;

    /* JADX INFO: renamed from: x0 */
    @hib
    public PlaybackMetrics.Builder f70984x0;

    /* JADX INFO: renamed from: y0 */
    public int f70985y0;

    /* JADX INFO: renamed from: o0 */
    public final Executor f70975o0 = bo0.get();

    /* JADX INFO: renamed from: s0 */
    public final q1h.C11272d f70979s0 = new q1h.C11272d();

    /* JADX INFO: renamed from: t0 */
    public final q1h.C11270b f70980t0 = new q1h.C11270b();

    /* JADX INFO: renamed from: v0 */
    public final HashMap<String, Long> f70982v0 = new HashMap<>();

    /* JADX INFO: renamed from: u0 */
    public final HashMap<String, Long> f70981u0 = new HashMap<>();

    /* JADX INFO: renamed from: r0 */
    public final long f70978r0 = SystemClock.elapsedRealtime();

    /* JADX INFO: renamed from: z0 */
    public int f70986z0 = 0;

    /* JADX INFO: renamed from: A0 */
    public int f70959A0 = 0;

    /* JADX INFO: renamed from: pia$a */
    public static final class C10971a {

        /* JADX INFO: renamed from: a */
        public final int f70987a;

        /* JADX INFO: renamed from: b */
        public final int f70988b;

        public C10971a(int i, int i2) {
            this.f70987a = i;
            this.f70988b = i2;
        }
    }

    /* JADX INFO: renamed from: pia$b */
    public static final class C10972b {

        /* JADX INFO: renamed from: a */
        public final C1213a f70989a;

        /* JADX INFO: renamed from: b */
        public final int f70990b;

        /* JADX INFO: renamed from: c */
        public final String f70991c;

        public C10972b(C1213a c1213a, int i, String str) {
            this.f70989a = c1213a;
            this.f70990b = i;
            this.f70991c = str;
        }
    }

    private pia(Context context, PlaybackSession playbackSession) {
        this.f70974n0 = context.getApplicationContext();
        this.f70977q0 = playbackSession;
        zx3 zx3Var = new zx3();
        this.f70976p0 = zx3Var;
        zx3Var.setListener(this);
    }

    @a35(expression = {"#1"}, result = true)
    private boolean canReportPendingFormatUpdate(@hib C10972b c10972b) {
        return c10972b != null && c10972b.f70991c.equals(this.f70976p0.getActiveSessionId());
    }

    @hib
    public static pia create(Context context) {
        MediaMetricsManager mediaMetricsManagerM14746a = kha.m14746a(context.getSystemService("media_metrics"));
        if (mediaMetricsManagerM14746a == null) {
            return null;
        }
        return new pia(context, mediaMetricsManagerM14746a.createPlaybackSession());
    }

    private void finishCurrentSession() {
        PlaybackMetrics.Builder builder = this.f70984x0;
        if (builder != null && this.f70973O0) {
            builder.setAudioUnderrunCount(this.f70972N0);
            this.f70984x0.setVideoFramesDropped(this.f70970L0);
            this.f70984x0.setVideoFramesPlayed(this.f70971M0);
            Long l = this.f70981u0.get(this.f70983w0);
            this.f70984x0.setNetworkTransferDurationMillis(l == null ? 0L : l.longValue());
            Long l2 = this.f70982v0.get(this.f70983w0);
            this.f70984x0.setNetworkBytesRead(l2 == null ? 0L : l2.longValue());
            this.f70984x0.setStreamSource((l2 == null || l2.longValue() <= 0) ? 0 : 1);
            final PlaybackMetrics playbackMetricsBuild = this.f70984x0.build();
            this.f70975o0.execute(new Runnable() { // from class: nia
                @Override // java.lang.Runnable
                public final void run() {
                    this.f64674a.lambda$finishCurrentSession$4(playbackMetricsBuild);
                }
            });
        }
        this.f70984x0 = null;
        this.f70983w0 = null;
        this.f70972N0 = 0;
        this.f70970L0 = 0;
        this.f70971M0 = 0;
        this.f70964F0 = null;
        this.f70965G0 = null;
        this.f70966H0 = null;
        this.f70973O0 = false;
    }

    @igg({"SwitchIntDef"})
    private static int getDrmErrorCode(int i) {
        switch (t0i.getErrorCodeForMediaDrmErrorCode(i)) {
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
    private static DrmInitData getDrmInitData(kx7<x7h.C14971a> kx7Var) {
        DrmInitData drmInitData;
        quh<x7h.C14971a> it = kx7Var.iterator();
        while (it.hasNext()) {
            x7h.C14971a next = it.next();
            for (int i = 0; i < next.f97112a; i++) {
                if (next.isTrackSelected(i) && (drmInitData = next.getTrackFormat(i).f8295s) != null) {
                    return drmInitData;
                }
            }
        }
        return null;
    }

    private static int getDrmType(DrmInitData drmInitData) {
        for (int i = 0; i < drmInitData.f8206d; i++) {
            UUID uuid = drmInitData.get(i).f8208b;
            if (uuid.equals(jk1.f50928n2)) {
                return 3;
            }
            if (uuid.equals(jk1.f50933o2)) {
                return 2;
            }
            if (uuid.equals(jk1.f50923m2)) {
                return 6;
            }
        }
        return 1;
    }

    private static C10971a getErrorInfo(kyc kycVar, Context context, boolean z) {
        int i;
        boolean z2;
        if (kycVar.f55703a == 1001) {
            return new C10971a(20, 0);
        }
        if (kycVar instanceof aa5) {
            aa5 aa5Var = (aa5) kycVar;
            z2 = aa5Var.f807S2 == 1;
            i = aa5Var.f811W2;
        } else {
            i = 0;
            z2 = false;
        }
        Throwable th = (Throwable) v80.checkNotNull(kycVar.getCause());
        if (!(th instanceof IOException)) {
            if (z2 && (i == 0 || i == 1)) {
                return new C10971a(35, 0);
            }
            if (z2 && i == 3) {
                return new C10971a(15, 0);
            }
            if (z2 && i == 2) {
                return new C10971a(23, 0);
            }
            if (th instanceof sda.C12534c) {
                return new C10971a(13, t0i.getErrorCodeFromPlatformDiagnosticsInfo(((sda.C12534c) th).f81463d));
            }
            if (th instanceof jda) {
                return new C10971a(14, ((jda) th).f50355c);
            }
            if (th instanceof OutOfMemoryError) {
                return new C10971a(14, 0);
            }
            if (th instanceof bh0.C1889c) {
                return new C10971a(17, ((bh0.C1889c) th).f13723a);
            }
            if (th instanceof bh0.C1894h) {
                return new C10971a(18, ((bh0.C1894h) th).f13728a);
            }
            if (!(th instanceof MediaCodec.CryptoException)) {
                return new C10971a(22, 0);
            }
            int errorCode = ((MediaCodec.CryptoException) th).getErrorCode();
            return new C10971a(getDrmErrorCode(errorCode), errorCode);
        }
        if (th instanceof dn7.C4882f) {
            return new C10971a(5, ((dn7.C4882f) th).f30195C);
        }
        if ((th instanceof dn7.C4881e) || (th instanceof yhc)) {
            return new C10971a(z ? 10 : 11, 0);
        }
        boolean z3 = th instanceof dn7.C4880d;
        if (z3 || (th instanceof sqh.C12752a)) {
            if (zbb.getInstance(context).getNetworkType() == 1) {
                return new C10971a(3, 0);
            }
            Throwable cause = th.getCause();
            return cause instanceof UnknownHostException ? new C10971a(6, 0) : cause instanceof SocketTimeoutException ? new C10971a(7, 0) : (z3 && ((dn7.C4880d) th).f30193d == 1) ? new C10971a(4, 0) : new C10971a(8, 0);
        }
        if (kycVar.f55703a == 1002) {
            return new C10971a(21, 0);
        }
        if (th instanceof ar4.C1571a) {
            Throwable th2 = (Throwable) v80.checkNotNull(th.getCause());
            if (!(th2 instanceof MediaDrm.MediaDrmStateException)) {
                return th2 instanceof MediaDrmResetException ? new C10971a(27, 0) : th2 instanceof NotProvisionedException ? new C10971a(24, 0) : th2 instanceof DeniedByServerException ? new C10971a(29, 0) : th2 instanceof rvh ? new C10971a(23, 0) : th2 instanceof ju3.C8089e ? new C10971a(28, 0) : new C10971a(30, 0);
            }
            int errorCodeFromPlatformDiagnosticsInfo = t0i.getErrorCodeFromPlatformDiagnosticsInfo(((MediaDrm.MediaDrmStateException) th2).getDiagnosticInfo());
            return new C10971a(getDrmErrorCode(errorCodeFromPlatformDiagnosticsInfo), errorCodeFromPlatformDiagnosticsInfo);
        }
        if (!(th instanceof ns5.C10039b) || !(th.getCause() instanceof FileNotFoundException)) {
            return new C10971a(9, 0);
        }
        Throwable cause2 = ((Throwable) v80.checkNotNull(th.getCause())).getCause();
        return ((cause2 instanceof ErrnoException) && ((ErrnoException) cause2).errno == OsConstants.EACCES) ? new C10971a(32, 0) : new C10971a(31, 0);
    }

    private static Pair<String, String> getLanguageAndRegion(String str) {
        String[] strArrSplit = t0i.split(str, "-");
        return Pair.create(strArrSplit[0], strArrSplit.length >= 2 ? strArrSplit[1] : null);
    }

    private static int getNetworkType(Context context) {
        switch (zbb.getInstance(context).getNetworkType()) {
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

    private static int getStreamType(nfa nfaVar) {
        nfa.C9856h c9856h = nfaVar.f64305b;
        if (c9856h == null) {
            return 0;
        }
        int iInferContentTypeForUriAndMimeType = t0i.inferContentTypeForUriAndMimeType(c9856h.f64406a, c9856h.f64407b);
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

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$finishCurrentSession$4(PlaybackMetrics playbackMetrics) {
        this.f70977q0.reportPlaybackMetrics(playbackMetrics);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$maybeReportNetworkChange$1(NetworkEvent networkEvent) {
        this.f70977q0.reportNetworkEvent(networkEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$maybeReportPlaybackError$0(PlaybackErrorEvent playbackErrorEvent) {
        this.f70977q0.reportPlaybackErrorEvent(playbackErrorEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$maybeReportPlaybackStateChange$2(PlaybackStateEvent playbackStateEvent) {
        this.f70977q0.reportPlaybackStateEvent(playbackStateEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$reportTrackChangeEvent$3(TrackChangeEvent trackChangeEvent) {
        this.f70977q0.reportTrackChangeEvent(trackChangeEvent);
    }

    private void maybeAddSessions(InterfaceC2409co.c cVar) {
        for (int i = 0; i < cVar.size(); i++) {
            int i2 = cVar.get(i);
            InterfaceC2409co.b eventTime = cVar.getEventTime(i2);
            if (i2 == 0) {
                this.f70976p0.updateSessionsWithTimelineChange(eventTime);
            } else if (i2 == 11) {
                this.f70976p0.updateSessionsWithDiscontinuity(eventTime, this.f70985y0);
            } else {
                this.f70976p0.updateSessions(eventTime);
            }
        }
    }

    private void maybeReportNetworkChange(long j) {
        int networkType = getNetworkType(this.f70974n0);
        if (networkType != this.f70959A0) {
            this.f70959A0 = networkType;
            final NetworkEvent networkEventBuild = aia.m629a().setNetworkType(networkType).setTimeSinceCreatedMillis(j - this.f70978r0).build();
            this.f70975o0.execute(new Runnable() { // from class: lia
                @Override // java.lang.Runnable
                public final void run() {
                    this.f57708a.lambda$maybeReportNetworkChange$1(networkEventBuild);
                }
            });
        }
    }

    private void maybeReportPlaybackError(long j) {
        kyc kycVar = this.f70960B0;
        if (kycVar == null) {
            return;
        }
        C10971a errorInfo = getErrorInfo(kycVar, this.f70974n0, this.f70968J0 == 4);
        final PlaybackErrorEvent playbackErrorEventBuild = dia.m9179a().setTimeSinceCreatedMillis(j - this.f70978r0).setErrorCode(errorInfo.f70987a).setSubErrorCode(errorInfo.f70988b).setException(kycVar).build();
        this.f70975o0.execute(new Runnable() { // from class: mia
            @Override // java.lang.Runnable
            public final void run() {
                this.f61074a.lambda$maybeReportPlaybackError$0(playbackErrorEventBuild);
            }
        });
        this.f70973O0 = true;
        this.f70960B0 = null;
    }

    private void maybeReportPlaybackStateChange(izc izcVar, InterfaceC2409co.c cVar, long j) {
        if (izcVar.getPlaybackState() != 2) {
            this.f70967I0 = false;
        }
        if (izcVar.getPlayerError() == null) {
            this.f70969K0 = false;
        } else if (cVar.contains(10)) {
            this.f70969K0 = true;
        }
        int iResolveNewPlaybackState = resolveNewPlaybackState(izcVar);
        if (this.f70986z0 != iResolveNewPlaybackState) {
            this.f70986z0 = iResolveNewPlaybackState;
            this.f70973O0 = true;
            final PlaybackStateEvent playbackStateEventBuild = eia.m9992a().setState(this.f70986z0).setTimeSinceCreatedMillis(j - this.f70978r0).build();
            this.f70975o0.execute(new Runnable() { // from class: oia
                @Override // java.lang.Runnable
                public final void run() {
                    this.f67745a.lambda$maybeReportPlaybackStateChange$2(playbackStateEventBuild);
                }
            });
        }
    }

    private void maybeReportTrackChanges(izc izcVar, InterfaceC2409co.c cVar, long j) {
        if (cVar.contains(2)) {
            x7h currentTracks = izcVar.getCurrentTracks();
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
        if (canReportPendingFormatUpdate(this.f70961C0)) {
            C10972b c10972b = this.f70961C0;
            C1213a c1213a = c10972b.f70989a;
            if (c1213a.f8299w != -1) {
                maybeUpdateVideoFormat(j, c1213a, c10972b.f70990b);
                this.f70961C0 = null;
            }
        }
        if (canReportPendingFormatUpdate(this.f70962D0)) {
            C10972b c10972b2 = this.f70962D0;
            maybeUpdateAudioFormat(j, c10972b2.f70989a, c10972b2.f70990b);
            this.f70962D0 = null;
        }
        if (canReportPendingFormatUpdate(this.f70963E0)) {
            C10972b c10972b3 = this.f70963E0;
            maybeUpdateTextFormat(j, c10972b3.f70989a, c10972b3.f70990b);
            this.f70963E0 = null;
        }
    }

    private void maybeUpdateAudioFormat(long j, @hib C1213a c1213a, int i) {
        if (Objects.equals(this.f70965G0, c1213a)) {
            return;
        }
        if (this.f70965G0 == null && i == 0) {
            i = 1;
        }
        this.f70965G0 = c1213a;
        reportTrackChangeEvent(0, j, c1213a, i);
    }

    private void maybeUpdateMetricsBuilderValues(izc izcVar, InterfaceC2409co.c cVar) {
        DrmInitData drmInitData;
        if (cVar.contains(0)) {
            InterfaceC2409co.b eventTime = cVar.getEventTime(0);
            if (this.f70984x0 != null) {
                maybeUpdateTimelineMetadata(eventTime.f17203b, eventTime.f17205d);
            }
        }
        if (cVar.contains(2) && this.f70984x0 != null && (drmInitData = getDrmInitData(izcVar.getCurrentTracks().getGroups())) != null) {
            aha.m582a(t0i.castNonNull(this.f70984x0)).setDrmType(getDrmType(drmInitData));
        }
        if (cVar.contains(1011)) {
            this.f70972N0++;
        }
    }

    private void maybeUpdateTextFormat(long j, @hib C1213a c1213a, int i) {
        if (Objects.equals(this.f70966H0, c1213a)) {
            return;
        }
        if (this.f70966H0 == null && i == 0) {
            i = 1;
        }
        this.f70966H0 = c1213a;
        reportTrackChangeEvent(2, j, c1213a, i);
    }

    @g5e({"metricsBuilder"})
    private void maybeUpdateTimelineMetadata(q1h q1hVar, @hib una.C13612b c13612b) {
        int indexOfPeriod;
        PlaybackMetrics.Builder builder = this.f70984x0;
        if (c13612b == null || (indexOfPeriod = q1hVar.getIndexOfPeriod(c13612b.f88603a)) == -1) {
            return;
        }
        q1hVar.getPeriod(indexOfPeriod, this.f70980t0);
        q1hVar.getWindow(this.f70980t0.f72946c, this.f70979s0);
        builder.setStreamType(getStreamType(this.f70979s0.f72973c));
        q1h.C11272d c11272d = this.f70979s0;
        if (c11272d.f72983m != -9223372036854775807L && !c11272d.f72981k && !c11272d.f72979i && !c11272d.isLive()) {
            builder.setMediaDurationMillis(this.f70979s0.getDurationMs());
        }
        builder.setPlaybackType(this.f70979s0.isLive() ? 2 : 1);
        this.f70973O0 = true;
    }

    private void maybeUpdateVideoFormat(long j, @hib C1213a c1213a, int i) {
        if (Objects.equals(this.f70964F0, c1213a)) {
            return;
        }
        if (this.f70964F0 == null && i == 0) {
            i = 1;
        }
        this.f70964F0 = c1213a;
        reportTrackChangeEvent(1, j, c1213a, i);
    }

    private void reportTrackChangeEvent(int i, long j, @hib C1213a c1213a, int i2) {
        TrackChangeEvent.Builder timeSinceCreatedMillis = zha.m26807a(i).setTimeSinceCreatedMillis(j - this.f70978r0);
        if (c1213a != null) {
            timeSinceCreatedMillis.setTrackState(1);
            timeSinceCreatedMillis.setTrackChangeReason(getTrackChangeReason(i2));
            String str = c1213a.f8290n;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = c1213a.f8291o;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = c1213a.f8287k;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i3 = c1213a.f8286j;
            if (i3 != -1) {
                timeSinceCreatedMillis.setBitrate(i3);
            }
            int i4 = c1213a.f8298v;
            if (i4 != -1) {
                timeSinceCreatedMillis.setWidth(i4);
            }
            int i5 = c1213a.f8299w;
            if (i5 != -1) {
                timeSinceCreatedMillis.setHeight(i5);
            }
            int i6 = c1213a.f8266G;
            if (i6 != -1) {
                timeSinceCreatedMillis.setChannelCount(i6);
            }
            int i7 = c1213a.f8267H;
            if (i7 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i7);
            }
            String str4 = c1213a.f8280d;
            if (str4 != null) {
                Pair<String, String> languageAndRegion = getLanguageAndRegion(str4);
                timeSinceCreatedMillis.setLanguage((String) languageAndRegion.first);
                Object obj = languageAndRegion.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f = c1213a.f8302z;
            if (f != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.f70973O0 = true;
        final TrackChangeEvent trackChangeEventBuild = timeSinceCreatedMillis.build();
        this.f70975o0.execute(new Runnable() { // from class: kia
            @Override // java.lang.Runnable
            public final void run() {
                this.f54226a.lambda$reportTrackChangeEvent$3(trackChangeEventBuild);
            }
        });
    }

    private int resolveNewPlaybackState(izc izcVar) {
        int playbackState = izcVar.getPlaybackState();
        if (this.f70967I0) {
            return 5;
        }
        if (this.f70969K0) {
            return 13;
        }
        if (playbackState == 4) {
            return 11;
        }
        if (playbackState == 2) {
            int i = this.f70986z0;
            if (i == 0 || i == 2 || i == 12) {
                return 2;
            }
            if (izcVar.getPlayWhenReady()) {
                return izcVar.getPlaybackSuppressionReason() != 0 ? 10 : 6;
            }
            return 7;
        }
        if (playbackState == 3) {
            if (izcVar.getPlayWhenReady()) {
                return izcVar.getPlaybackSuppressionReason() != 0 ? 9 : 3;
            }
            return 4;
        }
        if (playbackState != 1 || this.f70986z0 == 0) {
            return this.f70986z0;
        }
        return 12;
    }

    public LogSessionId getLogSessionId() {
        return this.f70977q0.getSessionId();
    }

    @Override // p000.syc.InterfaceC12829a
    public void onAdPlaybackStarted(InterfaceC2409co.b bVar, String str, String str2) {
    }

    @Override // p000.InterfaceC2409co
    public void onBandwidthEstimate(InterfaceC2409co.b bVar, int i, long j, long j2) {
        una.C13612b c13612b = bVar.f17205d;
        if (c13612b != null) {
            String sessionForMediaPeriodId = this.f70976p0.getSessionForMediaPeriodId(bVar.f17203b, (una.C13612b) v80.checkNotNull(c13612b));
            Long l = this.f70982v0.get(sessionForMediaPeriodId);
            Long l2 = this.f70981u0.get(sessionForMediaPeriodId);
            this.f70982v0.put(sessionForMediaPeriodId, Long.valueOf((l == null ? 0L : l.longValue()) + j));
            this.f70981u0.put(sessionForMediaPeriodId, Long.valueOf((l2 != null ? l2.longValue() : 0L) + ((long) i)));
        }
    }

    @Override // p000.InterfaceC2409co
    public void onDownstreamFormatChanged(InterfaceC2409co.b bVar, fga fgaVar) {
        if (bVar.f17205d == null) {
            return;
        }
        C10972b c10972b = new C10972b((C1213a) v80.checkNotNull(fgaVar.f36528c), fgaVar.f36529d, this.f70976p0.getSessionForMediaPeriodId(bVar.f17203b, (una.C13612b) v80.checkNotNull(bVar.f17205d)));
        int i = fgaVar.f36527b;
        if (i != 0) {
            if (i == 1) {
                this.f70962D0 = c10972b;
                return;
            } else if (i != 2) {
                if (i != 3) {
                    return;
                }
                this.f70963E0 = c10972b;
                return;
            }
        }
        this.f70961C0 = c10972b;
    }

    @Override // p000.InterfaceC2409co
    public void onEvents(izc izcVar, InterfaceC2409co.c cVar) {
        if (cVar.size() == 0) {
            return;
        }
        maybeAddSessions(cVar);
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        maybeUpdateMetricsBuilderValues(izcVar, cVar);
        maybeReportPlaybackError(jElapsedRealtime);
        maybeReportTrackChanges(izcVar, cVar, jElapsedRealtime);
        maybeReportNetworkChange(jElapsedRealtime);
        maybeReportPlaybackStateChange(izcVar, cVar, jElapsedRealtime);
        if (cVar.contains(1028)) {
            this.f70976p0.finishAllSessions(cVar.getEventTime(1028));
        }
    }

    @Override // p000.InterfaceC2409co
    public void onLoadError(InterfaceC2409co.b bVar, kc9 kc9Var, fga fgaVar, IOException iOException, boolean z) {
        this.f70968J0 = fgaVar.f36526a;
    }

    @Override // p000.InterfaceC2409co
    public void onPlayerError(InterfaceC2409co.b bVar, kyc kycVar) {
        this.f70960B0 = kycVar;
    }

    @Override // p000.InterfaceC2409co
    public void onPositionDiscontinuity(InterfaceC2409co.b bVar, izc.C7684k c7684k, izc.C7684k c7684k2, int i) {
        if (i == 1) {
            this.f70967I0 = true;
        }
        this.f70985y0 = i;
    }

    @Override // p000.syc.InterfaceC12829a
    public void onSessionActive(InterfaceC2409co.b bVar, String str) {
        una.C13612b c13612b = bVar.f17205d;
        if (c13612b == null || !c13612b.isAd()) {
            finishCurrentSession();
            this.f70983w0 = str;
            this.f70984x0 = cia.m3985a().setPlayerName(dga.f29599a).setPlayerVersion(dga.f29600b);
            maybeUpdateTimelineMetadata(bVar.f17203b, bVar.f17205d);
        }
    }

    @Override // p000.syc.InterfaceC12829a
    public void onSessionCreated(InterfaceC2409co.b bVar, String str) {
    }

    @Override // p000.syc.InterfaceC12829a
    public void onSessionFinished(InterfaceC2409co.b bVar, String str, boolean z) {
        una.C13612b c13612b = bVar.f17205d;
        if ((c13612b == null || !c13612b.isAd()) && str.equals(this.f70983w0)) {
            finishCurrentSession();
        }
        this.f70981u0.remove(str);
        this.f70982v0.remove(str);
    }

    @Override // p000.InterfaceC2409co
    public void onVideoDisabled(InterfaceC2409co.b bVar, ol3 ol3Var) {
        this.f70970L0 += ol3Var.f68022g;
        this.f70971M0 += ol3Var.f68020e;
    }

    @Override // p000.InterfaceC2409co
    public void onVideoSizeChanged(InterfaceC2409co.b bVar, a8i a8iVar) {
        C10972b c10972b = this.f70961C0;
        if (c10972b != null) {
            C1213a c1213a = c10972b.f70989a;
            if (c1213a.f8299w == -1) {
                this.f70961C0 = new C10972b(c1213a.buildUpon().setWidth(a8iVar.f647a).setHeight(a8iVar.f648b).build(), c10972b.f70990b, c10972b.f70991c);
            }
        }
    }
}
