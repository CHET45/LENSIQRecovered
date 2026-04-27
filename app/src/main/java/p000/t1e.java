package p000;

import androidx.media3.common.C1213a;
import androidx.media3.exoplayer.C1227f;
import androidx.media3.exoplayer.C1234l;
import androidx.media3.exoplayer.InterfaceC1254q;
import java.io.IOException;
import java.util.Objects;
import p000.una;

/* JADX INFO: loaded from: classes3.dex */
public class t1e {

    /* JADX INFO: renamed from: g */
    public static final int f83364g = 0;

    /* JADX INFO: renamed from: h */
    public static final int f83365h = 1;

    /* JADX INFO: renamed from: i */
    public static final int f83366i = 2;

    /* JADX INFO: renamed from: j */
    public static final int f83367j = 3;

    /* JADX INFO: renamed from: k */
    public static final int f83368k = 4;

    /* JADX INFO: renamed from: l */
    public static final int f83369l = 1;

    /* JADX INFO: renamed from: m */
    public static final int f83370m = 2;

    /* JADX INFO: renamed from: a */
    public final InterfaceC1254q f83371a;

    /* JADX INFO: renamed from: b */
    public final int f83372b;

    /* JADX INFO: renamed from: c */
    @hib
    public final InterfaceC1254q f83373c;

    /* JADX INFO: renamed from: d */
    public int f83374d = 0;

    /* JADX INFO: renamed from: e */
    public boolean f83375e = false;

    /* JADX INFO: renamed from: f */
    public boolean f83376f = false;

    public t1e(InterfaceC1254q interfaceC1254q, @hib InterfaceC1254q interfaceC1254q2, int i) {
        this.f83371a = interfaceC1254q;
        this.f83372b = i;
        this.f83373c = interfaceC1254q2;
    }

    private void disableRenderer(InterfaceC1254q interfaceC1254q, C1227f c1227f) {
        v80.checkState(this.f83371a == interfaceC1254q || this.f83373c == interfaceC1254q);
        if (isRendererEnabled(interfaceC1254q)) {
            c1227f.onRendererDisabled(interfaceC1254q);
            ensureStopped(interfaceC1254q);
            interfaceC1254q.disable();
        }
    }

    private void ensureStopped(InterfaceC1254q interfaceC1254q) {
        if (interfaceC1254q.getState() == 2) {
            interfaceC1254q.stop();
        }
    }

    private static C1213a[] getFormats(@hib of5 of5Var) {
        int length = of5Var != null ? of5Var.length() : 0;
        C1213a[] c1213aArr = new C1213a[length];
        for (int i = 0; i < length; i++) {
            c1213aArr[i] = ((of5) v80.checkNotNull(of5Var)).getFormat(i);
        }
        return c1213aArr;
    }

    @hib
    private InterfaceC1254q getRendererReadingFromPeriod(@hib C1234l c1234l) {
        if (c1234l != null && c1234l.f8764c[this.f83372b] != null) {
            if (this.f83371a.getStream() == c1234l.f8764c[this.f83372b]) {
                return this.f83371a;
            }
            InterfaceC1254q interfaceC1254q = this.f83373c;
            if (interfaceC1254q != null && interfaceC1254q.getStream() == c1234l.f8764c[this.f83372b]) {
                return this.f83373c;
            }
        }
        return null;
    }

    private boolean hasFinishedReadingFromPeriodInternal(C1234l c1234l, @hib InterfaceC1254q interfaceC1254q) {
        if (interfaceC1254q == null) {
            return true;
        }
        mle mleVar = c1234l.f8764c[this.f83372b];
        if (interfaceC1254q.getStream() == null) {
            return true;
        }
        if (interfaceC1254q.getStream() == mleVar && (mleVar == null || interfaceC1254q.hasReadStreamToEnd() || hasReachedServerSideInsertedAdsTransition(interfaceC1254q, c1234l))) {
            return true;
        }
        C1234l next = c1234l.getNext();
        return next != null && next.f8764c[this.f83372b] == interfaceC1254q.getStream();
    }

    private boolean hasReachedServerSideInsertedAdsTransition(InterfaceC1254q interfaceC1254q, C1234l c1234l) {
        C1234l next = c1234l.getNext();
        return c1234l.f8769h.f78463g && next != null && next.f8767f && ((interfaceC1254q instanceof qvg) || (interfaceC1254q instanceof gua) || interfaceC1254q.getReadingPositionUs() >= next.getStartPositionRendererTime());
    }

    private boolean isPrimaryRendererPrewarming() {
        int i = this.f83374d;
        return i == 2 || i == 4;
    }

    private boolean isSecondaryRendererPrewarming() {
        return this.f83374d == 3;
    }

    private void maybeDisableOrResetPositionInternal(InterfaceC1254q interfaceC1254q, mle mleVar, C1227f c1227f, long j, boolean z) throws aa5 {
        if (isRendererEnabled(interfaceC1254q)) {
            if (mleVar != interfaceC1254q.getStream()) {
                disableRenderer(interfaceC1254q, c1227f);
            } else if (z) {
                interfaceC1254q.resetPosition(j);
            }
        }
    }

    private void maybeResetRenderer(boolean z) {
        if (z) {
            if (this.f83375e) {
                this.f83371a.reset();
                this.f83375e = false;
                return;
            }
            return;
        }
        if (this.f83376f) {
            ((InterfaceC1254q) v80.checkNotNull(this.f83373c)).reset();
            this.f83376f = false;
        }
    }

    private int replaceStreamsOrDisableRendererForTransitionInternal(@hib InterfaceC1254q interfaceC1254q, C1234l c1234l, r7h r7hVar, C1227f c1227f) throws aa5 {
        if (interfaceC1254q == null || !isRendererEnabled(interfaceC1254q) || ((interfaceC1254q == this.f83371a && isPrimaryRendererPrewarming()) || (interfaceC1254q == this.f83373c && isSecondaryRendererPrewarming()))) {
            return 1;
        }
        mle stream = interfaceC1254q.getStream();
        mle[] mleVarArr = c1234l.f8764c;
        int i = this.f83372b;
        boolean z = stream != mleVarArr[i];
        boolean zIsRendererEnabled = r7hVar.isRendererEnabled(i);
        if (zIsRendererEnabled && !z) {
            return 1;
        }
        if (!interfaceC1254q.isCurrentStreamFinal()) {
            interfaceC1254q.replaceStream(getFormats(r7hVar.f77358c[this.f83372b]), (mle) v80.checkNotNull(c1234l.f8764c[this.f83372b]), c1234l.getStartPositionRendererTime(), c1234l.getRendererOffset(), c1234l.f8769h.f78457a);
            return 3;
        }
        if (!interfaceC1254q.isEnded()) {
            return 0;
        }
        disableRenderer(interfaceC1254q, c1227f);
        if (!zIsRendererEnabled || isPrewarming()) {
            maybeResetRenderer(interfaceC1254q == this.f83371a);
        }
        return 1;
    }

    private void setCurrentStreamFinalInternal(InterfaceC1254q interfaceC1254q, long j) {
        interfaceC1254q.setCurrentStreamFinal();
        if (interfaceC1254q instanceof qvg) {
            ((qvg) interfaceC1254q).setFinalStreamEndPositionUs(j);
        }
    }

    private void transferResources(boolean z) throws aa5 {
        if (z) {
            ((InterfaceC1254q) v80.checkNotNull(this.f83373c)).handleMessage(17, this.f83371a);
        } else {
            this.f83371a.handleMessage(17, v80.checkNotNull(this.f83373c));
        }
    }

    public boolean allowsPlayback(C1234l c1234l) {
        InterfaceC1254q rendererReadingFromPeriod = getRendererReadingFromPeriod(c1234l);
        return rendererReadingFromPeriod == null || rendererReadingFromPeriod.hasReadStreamToEnd() || rendererReadingFromPeriod.isReady() || rendererReadingFromPeriod.isEnded();
    }

    public void disable(C1227f c1227f) throws aa5 {
        disableRenderer(this.f83371a, c1227f);
        InterfaceC1254q interfaceC1254q = this.f83373c;
        if (interfaceC1254q != null) {
            boolean z = isRendererEnabled(interfaceC1254q) && this.f83374d != 3;
            disableRenderer(this.f83373c, c1227f);
            maybeResetRenderer(false);
            if (z) {
                transferResources(true);
            }
        }
        this.f83374d = 0;
    }

    public void disablePrewarming(C1227f c1227f) {
        if (isPrewarming()) {
            int i = this.f83374d;
            boolean z = i == 4 || i == 2;
            int i2 = i != 4 ? 0 : 1;
            disableRenderer(z ? this.f83371a : (InterfaceC1254q) v80.checkNotNull(this.f83373c), c1227f);
            maybeResetRenderer(z);
            this.f83374d = i2;
        }
    }

    public void enable(s1e s1eVar, of5 of5Var, mle mleVar, long j, boolean z, boolean z2, long j2, long j3, una.C13612b c13612b, C1227f c1227f) throws aa5 {
        C1213a[] formats = getFormats(of5Var);
        int i = this.f83374d;
        if (i == 0 || i == 2 || i == 4) {
            this.f83375e = true;
            this.f83371a.enable(s1eVar, formats, mleVar, j, z, z2, j2, j3, c13612b);
            c1227f.onRendererEnabled(this.f83371a);
        } else {
            this.f83376f = true;
            ((InterfaceC1254q) v80.checkNotNull(this.f83373c)).enable(s1eVar, formats, mleVar, j, z, z2, j2, j3, c13612b);
            c1227f.onRendererEnabled(this.f83373c);
        }
    }

    public void enableMayRenderStartOfStream() {
        if (isRendererEnabled(this.f83371a)) {
            this.f83371a.enableMayRenderStartOfStream();
            return;
        }
        InterfaceC1254q interfaceC1254q = this.f83373c;
        if (interfaceC1254q == null || !isRendererEnabled(interfaceC1254q)) {
            return;
        }
        this.f83373c.enableMayRenderStartOfStream();
    }

    public int getEnabledRendererCount() {
        boolean zIsRendererEnabled = isRendererEnabled(this.f83371a);
        InterfaceC1254q interfaceC1254q = this.f83373c;
        return (zIsRendererEnabled ? 1 : 0) + ((interfaceC1254q == null || !isRendererEnabled(interfaceC1254q)) ? 0 : 1);
    }

    public long getMinDurationToProgressUs(long j, long j2) {
        long durationToProgressUs = isRendererEnabled(this.f83371a) ? this.f83371a.getDurationToProgressUs(j, j2) : Long.MAX_VALUE;
        InterfaceC1254q interfaceC1254q = this.f83373c;
        return (interfaceC1254q == null || !isRendererEnabled(interfaceC1254q)) ? durationToProgressUs : Math.min(durationToProgressUs, this.f83373c.getDurationToProgressUs(j, j2));
    }

    public long getReadingPositionUs(@hib C1234l c1234l) {
        InterfaceC1254q rendererReadingFromPeriod = getRendererReadingFromPeriod(c1234l);
        Objects.requireNonNull(rendererReadingFromPeriod);
        return rendererReadingFromPeriod.getReadingPositionUs();
    }

    public int getTrackType() {
        return this.f83371a.getTrackType();
    }

    public void handleMessage(int i, @hib Object obj, C1234l c1234l) throws aa5 {
        ((InterfaceC1254q) v80.checkNotNull(getRendererReadingFromPeriod(c1234l))).handleMessage(i, obj);
    }

    public boolean hasFinishedReadingFromPeriod(C1234l c1234l) {
        return hasFinishedReadingFromPeriodInternal(c1234l, this.f83371a) && hasFinishedReadingFromPeriodInternal(c1234l, this.f83373c);
    }

    public boolean hasReadPeriodToEnd(C1234l c1234l) {
        return ((InterfaceC1254q) v80.checkNotNull(getRendererReadingFromPeriod(c1234l))).hasReadStreamToEnd();
    }

    public boolean hasSecondary() {
        return this.f83373c != null;
    }

    public boolean isEnded() {
        boolean zIsEnded = isRendererEnabled(this.f83371a) ? this.f83371a.isEnded() : true;
        InterfaceC1254q interfaceC1254q = this.f83373c;
        return (interfaceC1254q == null || !isRendererEnabled(interfaceC1254q)) ? zIsEnded : zIsEnded & this.f83373c.isEnded();
    }

    public boolean isPrewarming() {
        return isPrimaryRendererPrewarming() || isSecondaryRendererPrewarming();
    }

    public boolean isPrewarmingPeriod(C1234l c1234l) {
        return (isPrimaryRendererPrewarming() && getRendererReadingFromPeriod(c1234l) == this.f83371a) || (isSecondaryRendererPrewarming() && getRendererReadingFromPeriod(c1234l) == this.f83373c);
    }

    public boolean isReadingFromPeriod(@hib C1234l c1234l) {
        return getRendererReadingFromPeriod(c1234l) != null;
    }

    public boolean isRendererEnabled() {
        int i = this.f83374d;
        return (i == 0 || i == 2 || i == 4) ? isRendererEnabled(this.f83371a) : isRendererEnabled((InterfaceC1254q) v80.checkNotNull(this.f83373c));
    }

    public void maybeDisableOrResetPosition(mle mleVar, C1227f c1227f, long j, boolean z) throws aa5 {
        maybeDisableOrResetPositionInternal(this.f83371a, mleVar, c1227f, j, z);
        InterfaceC1254q interfaceC1254q = this.f83373c;
        if (interfaceC1254q != null) {
            maybeDisableOrResetPositionInternal(interfaceC1254q, mleVar, c1227f, j, z);
        }
    }

    public void maybeHandlePrewarmingTransition() throws aa5 {
        int i = this.f83374d;
        if (i == 3 || i == 4) {
            transferResources(i == 4);
            this.f83374d = this.f83374d != 4 ? 1 : 0;
        } else if (i == 2) {
            this.f83374d = 0;
        }
    }

    public void maybeSetOldStreamToFinal(r7h r7hVar, r7h r7hVar2, long j) {
        int i;
        boolean zIsRendererEnabled = r7hVar.isRendererEnabled(this.f83372b);
        boolean zIsRendererEnabled2 = r7hVar2.isRendererEnabled(this.f83372b);
        InterfaceC1254q interfaceC1254q = (this.f83373c == null || (i = this.f83374d) == 3 || (i == 0 && isRendererEnabled(this.f83371a))) ? this.f83371a : (InterfaceC1254q) v80.checkNotNull(this.f83373c);
        if (!zIsRendererEnabled || interfaceC1254q.isCurrentStreamFinal()) {
            return;
        }
        boolean z = getTrackType() == -2;
        s1e[] s1eVarArr = r7hVar.f77357b;
        int i2 = this.f83372b;
        s1e s1eVar = s1eVarArr[i2];
        s1e s1eVar2 = r7hVar2.f77357b[i2];
        if (!zIsRendererEnabled2 || !Objects.equals(s1eVar2, s1eVar) || z || isPrewarming()) {
            setCurrentStreamFinalInternal(interfaceC1254q, j);
        }
    }

    public void maybeThrowStreamError(C1234l c1234l) throws IOException {
        ((InterfaceC1254q) v80.checkNotNull(getRendererReadingFromPeriod(c1234l))).maybeThrowStreamError();
    }

    public void release() {
        this.f83371a.release();
        this.f83375e = false;
        InterfaceC1254q interfaceC1254q = this.f83373c;
        if (interfaceC1254q != null) {
            interfaceC1254q.release();
            this.f83376f = false;
        }
    }

    public void render(long j, long j2) throws aa5 {
        if (isRendererEnabled(this.f83371a)) {
            this.f83371a.render(j, j2);
        }
        InterfaceC1254q interfaceC1254q = this.f83373c;
        if (interfaceC1254q == null || !isRendererEnabled(interfaceC1254q)) {
            return;
        }
        this.f83373c.render(j, j2);
    }

    public int replaceStreamsOrDisableRendererForTransition(C1234l c1234l, r7h r7hVar, C1227f c1227f) throws aa5 {
        int iReplaceStreamsOrDisableRendererForTransitionInternal = replaceStreamsOrDisableRendererForTransitionInternal(this.f83371a, c1234l, r7hVar, c1227f);
        return iReplaceStreamsOrDisableRendererForTransitionInternal == 1 ? replaceStreamsOrDisableRendererForTransitionInternal(this.f83373c, c1234l, r7hVar, c1227f) : iReplaceStreamsOrDisableRendererForTransitionInternal;
    }

    public void reset() {
        if (!isRendererEnabled(this.f83371a)) {
            maybeResetRenderer(true);
        }
        InterfaceC1254q interfaceC1254q = this.f83373c;
        if (interfaceC1254q == null || isRendererEnabled(interfaceC1254q)) {
            return;
        }
        maybeResetRenderer(false);
    }

    public void resetPosition(C1234l c1234l, long j) throws aa5 {
        InterfaceC1254q rendererReadingFromPeriod = getRendererReadingFromPeriod(c1234l);
        if (rendererReadingFromPeriod != null) {
            rendererReadingFromPeriod.resetPosition(j);
        }
    }

    public void setAllNonPrewarmingRendererStreamsFinal(long j) {
        int i;
        if (isRendererEnabled(this.f83371a) && (i = this.f83374d) != 4 && i != 2) {
            setCurrentStreamFinalInternal(this.f83371a, j);
        }
        InterfaceC1254q interfaceC1254q = this.f83373c;
        if (interfaceC1254q == null || !isRendererEnabled(interfaceC1254q) || this.f83374d == 3) {
            return;
        }
        setCurrentStreamFinalInternal(this.f83373c, j);
    }

    public void setCurrentStreamFinal(C1234l c1234l, long j) {
        setCurrentStreamFinalInternal((InterfaceC1254q) v80.checkNotNull(getRendererReadingFromPeriod(c1234l)), j);
    }

    public void setPlaybackSpeed(float f, float f2) throws aa5 {
        this.f83371a.setPlaybackSpeed(f, f2);
        InterfaceC1254q interfaceC1254q = this.f83373c;
        if (interfaceC1254q != null) {
            interfaceC1254q.setPlaybackSpeed(f, f2);
        }
    }

    public void setScrubbingMode(@hib hse hseVar) throws aa5 {
        this.f83371a.handleMessage(18, hseVar);
        InterfaceC1254q interfaceC1254q = this.f83373c;
        if (interfaceC1254q != null) {
            interfaceC1254q.handleMessage(18, hseVar);
        }
    }

    public void setTimeline(q1h q1hVar) {
        this.f83371a.setTimeline(q1hVar);
        InterfaceC1254q interfaceC1254q = this.f83373c;
        if (interfaceC1254q != null) {
            interfaceC1254q.setTimeline(q1hVar);
        }
    }

    public void setVideoFrameMetadataListener(o6i o6iVar) throws aa5 {
        if (getTrackType() != 2) {
            return;
        }
        this.f83371a.handleMessage(7, o6iVar);
        InterfaceC1254q interfaceC1254q = this.f83373c;
        if (interfaceC1254q != null) {
            interfaceC1254q.handleMessage(7, o6iVar);
        }
    }

    public void setVideoOutput(@hib Object obj) throws aa5 {
        if (getTrackType() != 2) {
            return;
        }
        int i = this.f83374d;
        if (i == 4 || i == 1) {
            ((InterfaceC1254q) v80.checkNotNull(this.f83373c)).handleMessage(1, obj);
        } else {
            this.f83371a.handleMessage(1, obj);
        }
    }

    public void setVolume(float f) throws aa5 {
        if (getTrackType() != 1) {
            return;
        }
        this.f83371a.handleMessage(2, Float.valueOf(f));
        InterfaceC1254q interfaceC1254q = this.f83373c;
        if (interfaceC1254q != null) {
            interfaceC1254q.handleMessage(2, Float.valueOf(f));
        }
    }

    public void start() throws aa5 {
        if (this.f83371a.getState() == 1 && this.f83374d != 4) {
            this.f83371a.start();
            return;
        }
        InterfaceC1254q interfaceC1254q = this.f83373c;
        if (interfaceC1254q == null || interfaceC1254q.getState() != 1 || this.f83374d == 3) {
            return;
        }
        this.f83373c.start();
    }

    public void startPrewarming() {
        int i;
        v80.checkState(!isPrewarming());
        if (isRendererEnabled(this.f83371a)) {
            i = 3;
        } else {
            InterfaceC1254q interfaceC1254q = this.f83373c;
            i = (interfaceC1254q == null || !isRendererEnabled(interfaceC1254q)) ? 2 : 4;
        }
        this.f83374d = i;
    }

    public void stop() {
        if (isRendererEnabled(this.f83371a)) {
            ensureStopped(this.f83371a);
        }
        InterfaceC1254q interfaceC1254q = this.f83373c;
        if (interfaceC1254q == null || !isRendererEnabled(interfaceC1254q)) {
            return;
        }
        ensureStopped(this.f83373c);
    }

    private static boolean isRendererEnabled(InterfaceC1254q interfaceC1254q) {
        return interfaceC1254q.getState() != 0;
    }
}
