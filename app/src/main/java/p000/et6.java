package p000;

import androidx.media3.common.C1213a;
import androidx.media3.exoplayer.InterfaceC1254q;
import androidx.media3.exoplayer.InterfaceC1255s;
import java.io.IOException;
import p000.una;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public class et6 implements InterfaceC1254q {

    /* JADX INFO: renamed from: a */
    public final InterfaceC1254q f34003a;

    public et6(InterfaceC1254q interfaceC1254q) {
        this.f34003a = interfaceC1254q;
    }

    @Override // androidx.media3.exoplayer.InterfaceC1254q
    public void disable() {
        this.f34003a.disable();
    }

    @Override // androidx.media3.exoplayer.InterfaceC1254q
    public void enable(s1e s1eVar, C1213a[] c1213aArr, mle mleVar, long j, boolean z, boolean z2, long j2, long j3, una.C13612b c13612b) throws aa5 {
        this.f34003a.enable(s1eVar, c1213aArr, mleVar, j, z, z2, j2, j3, c13612b);
    }

    @Override // androidx.media3.exoplayer.InterfaceC1254q
    public void enableMayRenderStartOfStream() {
        this.f34003a.enableMayRenderStartOfStream();
    }

    @Override // androidx.media3.exoplayer.InterfaceC1254q
    public InterfaceC1255s getCapabilities() {
        return this.f34003a.getCapabilities();
    }

    @Override // androidx.media3.exoplayer.InterfaceC1254q
    public long getDurationToProgressUs(long j, long j2) {
        return this.f34003a.getDurationToProgressUs(j, j2);
    }

    @Override // androidx.media3.exoplayer.InterfaceC1254q
    @hib
    public cda getMediaClock() {
        return this.f34003a.getMediaClock();
    }

    @Override // androidx.media3.exoplayer.InterfaceC1254q
    public String getName() {
        return this.f34003a.getName();
    }

    @Override // androidx.media3.exoplayer.InterfaceC1254q
    public long getReadingPositionUs() {
        return this.f34003a.getReadingPositionUs();
    }

    @Override // androidx.media3.exoplayer.InterfaceC1254q
    public int getState() {
        return this.f34003a.getState();
    }

    @Override // androidx.media3.exoplayer.InterfaceC1254q
    @hib
    public mle getStream() {
        return this.f34003a.getStream();
    }

    @Override // androidx.media3.exoplayer.InterfaceC1254q, androidx.media3.exoplayer.InterfaceC1255s
    public int getTrackType() {
        return this.f34003a.getTrackType();
    }

    @Override // androidx.media3.exoplayer.C1253p.b
    public void handleMessage(int i, @hib Object obj) throws aa5 {
        this.f34003a.handleMessage(i, obj);
    }

    @Override // androidx.media3.exoplayer.InterfaceC1254q
    public boolean hasReadStreamToEnd() {
        return this.f34003a.hasReadStreamToEnd();
    }

    @Override // androidx.media3.exoplayer.InterfaceC1254q
    public void init(int i, j0d j0dVar, j52 j52Var) {
        this.f34003a.init(i, j0dVar, j52Var);
    }

    @Override // androidx.media3.exoplayer.InterfaceC1254q
    public boolean isCurrentStreamFinal() {
        return this.f34003a.isCurrentStreamFinal();
    }

    @Override // androidx.media3.exoplayer.InterfaceC1254q
    public boolean isEnded() {
        return this.f34003a.isEnded();
    }

    @Override // androidx.media3.exoplayer.InterfaceC1254q
    public boolean isReady() {
        return this.f34003a.isReady();
    }

    @Override // androidx.media3.exoplayer.InterfaceC1254q
    public void maybeThrowStreamError() throws IOException {
        this.f34003a.maybeThrowStreamError();
    }

    @Override // androidx.media3.exoplayer.InterfaceC1254q
    public void release() {
        this.f34003a.release();
    }

    @Override // androidx.media3.exoplayer.InterfaceC1254q
    public void render(long j, long j2) throws aa5 {
        this.f34003a.render(j, j2);
    }

    @Override // androidx.media3.exoplayer.InterfaceC1254q
    public void replaceStream(C1213a[] c1213aArr, mle mleVar, long j, long j2, una.C13612b c13612b) throws aa5 {
        this.f34003a.replaceStream(c1213aArr, mleVar, j, j2, c13612b);
    }

    @Override // androidx.media3.exoplayer.InterfaceC1254q
    public void reset() {
        this.f34003a.reset();
    }

    @Override // androidx.media3.exoplayer.InterfaceC1254q
    public void resetPosition(long j) throws aa5 {
        this.f34003a.resetPosition(j);
    }

    @Override // androidx.media3.exoplayer.InterfaceC1254q
    public void setCurrentStreamFinal() {
        this.f34003a.setCurrentStreamFinal();
    }

    @Override // androidx.media3.exoplayer.InterfaceC1254q
    public void setPlaybackSpeed(float f, float f2) throws aa5 {
        this.f34003a.setPlaybackSpeed(f, f2);
    }

    @Override // androidx.media3.exoplayer.InterfaceC1254q
    public void setTimeline(q1h q1hVar) {
        this.f34003a.setTimeline(q1hVar);
    }

    @Override // androidx.media3.exoplayer.InterfaceC1254q
    public void start() throws aa5 {
        this.f34003a.start();
    }

    @Override // androidx.media3.exoplayer.InterfaceC1254q
    public void stop() {
        this.f34003a.stop();
    }
}
