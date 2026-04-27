package p000;

import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import java.util.List;
import java.util.Objects;
import p000.eta;
import p000.izc;
import p000.thf;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public class lt6 extends thf {

    /* JADX INFO: renamed from: l1 */
    public final izc.InterfaceC7680g f58691l1;

    /* JADX INFO: renamed from: m1 */
    public izc f58692m1;

    /* JADX INFO: renamed from: n1 */
    public C8965b f58693n1;

    /* JADX INFO: renamed from: o1 */
    public eta f58694o1;

    /* JADX INFO: renamed from: p1 */
    public int f58695p1;

    /* JADX INFO: renamed from: q1 */
    public int f58696q1;

    /* JADX INFO: renamed from: r1 */
    public long f58697r1;

    /* JADX INFO: renamed from: s1 */
    public boolean f58698s1;

    /* JADX INFO: renamed from: lt6$b */
    public static final class C8965b {

        /* JADX INFO: renamed from: a */
        public final thf.C13043b f58699a;

        /* JADX INFO: renamed from: b */
        public final thf.C13043b f58700b;

        /* JADX INFO: renamed from: c */
        public final thf.C13043b f58701c;

        /* JADX INFO: renamed from: d */
        public final thf.C13043b f58702d;

        /* JADX INFO: renamed from: e */
        public final thf.C13043b f58703e;

        public C8965b(final izc izcVar) {
            Objects.requireNonNull(izcVar);
            this.f58699a = new thf.C13043b(new thf.InterfaceC13048g() { // from class: mt6
                @Override // p000.thf.InterfaceC13048g
                public final long get() {
                    return izcVar.getCurrentPosition();
                }
            });
            this.f58700b = new thf.C13043b(new thf.InterfaceC13048g() { // from class: nt6
                @Override // p000.thf.InterfaceC13048g
                public final long get() {
                    return izcVar.getBufferedPosition();
                }
            });
            this.f58701c = new thf.C13043b(new thf.InterfaceC13048g() { // from class: ot6
                @Override // p000.thf.InterfaceC13048g
                public final long get() {
                    return izcVar.getContentPosition();
                }
            });
            this.f58702d = new thf.C13043b(new thf.InterfaceC13048g() { // from class: pt6
                @Override // p000.thf.InterfaceC13048g
                public final long get() {
                    return izcVar.getContentBufferedPosition();
                }
            });
            this.f58703e = new thf.C13043b(new thf.InterfaceC13048g() { // from class: qt6
                @Override // p000.thf.InterfaceC13048g
                public final long get() {
                    return izcVar.getTotalBufferedDuration();
                }
            });
        }

        public void disconnect(long j, long j2) {
            this.f58699a.disconnect(j);
            this.f58700b.disconnect(j);
            this.f58701c.disconnect(j2);
            this.f58702d.disconnect(j2);
            this.f58703e.disconnect(0L);
        }
    }

    /* JADX INFO: renamed from: lt6$c */
    public class C8966c implements izc.InterfaceC7680g {
        private C8966c() {
        }

        @Override // p000.izc.InterfaceC7680g
        public void onEvents(izc izcVar, izc.C7679f c7679f) {
            lt6.this.m22596Q0();
        }

        @Override // p000.izc.InterfaceC7680g
        public void onMetadata(eta etaVar) {
            lt6.this.f58694o1 = etaVar;
        }

        @Override // p000.izc.InterfaceC7680g
        public void onPlayWhenReadyChanged(boolean z, int i) {
            lt6.this.f58695p1 = i;
        }

        @Override // p000.izc.InterfaceC7680g
        public void onPositionDiscontinuity(izc.C7684k c7684k, izc.C7684k c7684k2, int i) {
            lt6.this.f58696q1 = i;
            lt6.this.f58697r1 = c7684k2.f49137g;
            lt6.this.f58693n1.disconnect(c7684k.f49137g, c7684k.f49138h);
            lt6 lt6Var = lt6.this;
            lt6Var.f58693n1 = new C8965b(lt6Var.f58692m1);
        }

        @Override // p000.izc.InterfaceC7680g
        public void onRenderedFirstFrame() {
            lt6.this.f58698s1 = true;
        }
    }

    public lt6(izc izcVar) {
        super(izcVar.getApplicationLooper());
        initializeForwardingState(izcVar);
        C8966c c8966c = new C8966c();
        this.f58691l1 = c8966c;
        izcVar.addListener(c8966c);
    }

    @z25({"player", "lastTimedMetadata", "playWhenReadyChangeReason", "pendingDiscontinuityReason", "livePositionSuppliers"})
    private void initializeForwardingState(izc izcVar) {
        this.f58692m1 = izcVar;
        this.f58694o1 = new eta(-9223372036854775807L, new eta.InterfaceC5464a[0]);
        this.f58695p1 = 1;
        this.f58696q1 = 5;
        this.f58693n1 = new C8965b(izcVar);
    }

    @Override // p000.thf
    /* JADX INFO: renamed from: A0 */
    public ja9<?> mo16356A0(int i, int i2) {
        if (i2 == i + 1) {
            this.f58692m1.removeMediaItem(i);
        } else {
            this.f58692m1.removeMediaItems(i, i2);
        }
        return w17.immediateVoidFuture();
    }

    @Override // p000.thf
    /* JADX INFO: renamed from: B0 */
    public ja9<?> mo16357B0(int i, int i2, List<nfa> list) {
        if (i2 == i + 1 && list.size() == 1) {
            this.f58692m1.replaceMediaItem(i, list.get(0));
        } else {
            this.f58692m1.replaceMediaItems(i, i2, list);
        }
        return w17.immediateVoidFuture();
    }

    @Override // p000.thf
    /* JADX INFO: renamed from: C0 */
    public ja9<?> mo16358C0(int i, long j, int i2) {
        switch (i2) {
            case 4:
                this.f58692m1.seekToDefaultPosition();
                break;
            case 5:
                this.f58692m1.seekTo(j);
                break;
            case 6:
                this.f58692m1.seekToPreviousMediaItem();
                break;
            case 7:
                this.f58692m1.seekToPrevious();
                break;
            case 8:
                this.f58692m1.seekToNextMediaItem();
                break;
            case 9:
                this.f58692m1.seekToNext();
                break;
            case 10:
                if (i != -1) {
                    this.f58692m1.seekTo(i, j);
                }
                break;
            case 11:
                this.f58692m1.seekBack();
                break;
            case 12:
                this.f58692m1.seekForward();
                break;
            default:
                throw new IllegalStateException();
        }
        return w17.immediateVoidFuture();
    }

    @Override // p000.thf
    /* JADX INFO: renamed from: D0 */
    public ja9<?> mo16359D0(uc0 uc0Var, boolean z) {
        this.f58692m1.setAudioAttributes(uc0Var, z);
        return w17.immediateVoidFuture();
    }

    @Override // p000.thf
    /* JADX INFO: renamed from: E0 */
    public ja9<?> mo16360E0(boolean z, int i) {
        if (this.f58692m1.isCommandAvailable(34)) {
            this.f58692m1.setDeviceMuted(z, i);
        } else {
            this.f58692m1.setDeviceMuted(z);
        }
        return w17.immediateVoidFuture();
    }

    @Override // p000.thf
    /* JADX INFO: renamed from: F0 */
    public ja9<?> mo16361F0(int i, int i2) {
        if (this.f58692m1.isCommandAvailable(33)) {
            this.f58692m1.setDeviceVolume(i, i2);
        } else {
            this.f58692m1.setDeviceVolume(i);
        }
        return w17.immediateVoidFuture();
    }

    @Override // p000.thf
    /* JADX INFO: renamed from: G0 */
    public ja9<?> mo16362G0(List<nfa> list, int i, long j) {
        boolean z = list.size() == 1 && this.f58692m1.isCommandAvailable(31);
        if (i == -1) {
            if (z) {
                this.f58692m1.setMediaItem(list.get(0));
            } else {
                this.f58692m1.setMediaItems(list);
            }
        } else if (z) {
            this.f58692m1.setMediaItem(list.get(0), j);
        } else {
            this.f58692m1.setMediaItems(list, i, j);
        }
        return w17.immediateVoidFuture();
    }

    @Override // p000.thf
    /* JADX INFO: renamed from: H0 */
    public ja9<?> mo16363H0(boolean z) {
        this.f58692m1.setPlayWhenReady(z);
        return w17.immediateVoidFuture();
    }

    @Override // p000.thf
    /* JADX INFO: renamed from: I0 */
    public ja9<?> mo16364I0(ryc rycVar) {
        this.f58692m1.setPlaybackParameters(rycVar);
        return w17.immediateVoidFuture();
    }

    @Override // p000.thf
    /* JADX INFO: renamed from: J0 */
    public ja9<?> mo16365J0(hga hgaVar) {
        this.f58692m1.setPlaylistMetadata(hgaVar);
        return w17.immediateVoidFuture();
    }

    @Override // p000.thf
    /* JADX INFO: renamed from: K0 */
    public ja9<?> mo16366K0(int i) {
        this.f58692m1.setRepeatMode(i);
        return w17.immediateVoidFuture();
    }

    @Override // p000.thf
    /* JADX INFO: renamed from: L0 */
    public ja9<?> mo16367L0(boolean z) {
        this.f58692m1.setShuffleModeEnabled(z);
        return w17.immediateVoidFuture();
    }

    @Override // p000.thf
    /* JADX INFO: renamed from: M0 */
    public ja9<?> mo16368M0(h7h h7hVar) {
        this.f58692m1.setTrackSelectionParameters(h7hVar);
        return w17.immediateVoidFuture();
    }

    @Override // p000.thf
    /* JADX INFO: renamed from: N0 */
    public ja9<?> mo16369N0(Object obj) {
        if (obj instanceof SurfaceView) {
            this.f58692m1.setVideoSurfaceView((SurfaceView) obj);
        } else if (obj instanceof TextureView) {
            this.f58692m1.setVideoTextureView((TextureView) obj);
        } else if (obj instanceof SurfaceHolder) {
            this.f58692m1.setVideoSurfaceHolder((SurfaceHolder) obj);
        } else {
            if (!(obj instanceof Surface)) {
                throw new IllegalStateException();
            }
            this.f58692m1.setVideoSurface((Surface) obj);
        }
        return w17.immediateVoidFuture();
    }

    @Override // p000.thf
    /* JADX INFO: renamed from: O0 */
    public ja9<?> mo16370O0(float f) {
        this.f58692m1.setVolume(f);
        return w17.immediateVoidFuture();
    }

    @Override // p000.thf
    /* JADX INFO: renamed from: P0 */
    public ja9<?> mo16371P0() {
        this.f58692m1.stop();
        return w17.immediateVoidFuture();
    }

    /* JADX INFO: renamed from: Z0 */
    public final izc m16372Z0() {
        return this.f58692m1;
    }

    /* JADX INFO: renamed from: a1 */
    public final void m16373a1(izc izcVar) {
        izc izcVar2 = this.f58692m1;
        if (izcVar2 == izcVar) {
            return;
        }
        if (izcVar.getApplicationLooper() != izcVar2.getApplicationLooper()) {
            throw new IllegalArgumentException("Trying to swap players with non-matching loopers.");
        }
        izcVar2.removeListener(this.f58691l1);
        izcVar.addListener(this.f58691l1);
        initializeForwardingState(izcVar);
        this.f58697r1 = izcVar.getCurrentPosition();
        m22596Q0();
    }

    @Override // p000.thf
    /* JADX INFO: renamed from: s0 */
    public thf.C13049h mo16374s0() {
        thf.C13049h.a aVar = new thf.C13049h.a();
        C8965b c8965b = this.f58693n1;
        if (this.f58692m1.isCommandAvailable(16)) {
            aVar.setAdBufferedPositionMs(c8965b.f58700b);
            aVar.setAdPositionMs(c8965b.f58699a);
        }
        if (this.f58692m1.isCommandAvailable(21)) {
            aVar.setAudioAttributes(this.f58692m1.getAudioAttributes());
        }
        aVar.setAvailableCommands(this.f58692m1.getAvailableCommands());
        if (this.f58692m1.isCommandAvailable(16)) {
            aVar.setContentBufferedPositionMs(c8965b.f58702d);
            aVar.setContentPositionMs(c8965b.f58701c);
            if (this.f58692m1.isCommandAvailable(17)) {
                aVar.setCurrentAd(this.f58692m1.getCurrentAdGroupIndex(), this.f58692m1.getCurrentAdIndexInAdGroup());
            }
        }
        if (this.f58692m1.isCommandAvailable(28)) {
            aVar.setCurrentCues(this.f58692m1.getCurrentCues());
        }
        if (this.f58692m1.isCommandAvailable(17)) {
            aVar.setCurrentMediaItemIndex(this.f58692m1.getCurrentMediaItemIndex());
        }
        aVar.setDeviceInfo(this.f58692m1.getDeviceInfo());
        if (this.f58692m1.isCommandAvailable(23)) {
            aVar.setDeviceVolume(this.f58692m1.getDeviceVolume());
            aVar.setIsDeviceMuted(this.f58692m1.isDeviceMuted());
        }
        aVar.setIsLoading(this.f58692m1.isLoading());
        aVar.setMaxSeekToPreviousPositionMs(this.f58692m1.getMaxSeekToPreviousPosition());
        if (this.f58698s1) {
            aVar.setNewlyRenderedFirstFrame(true);
            this.f58698s1 = false;
        }
        aVar.setPlaybackParameters(this.f58692m1.getPlaybackParameters());
        aVar.setPlaybackState(this.f58692m1.getPlaybackState());
        aVar.setPlaybackSuppressionReason(this.f58692m1.getPlaybackSuppressionReason());
        aVar.setPlayerError(this.f58692m1.getPlayerError());
        if (this.f58692m1.isCommandAvailable(17)) {
            aVar.setPlaylist(this.f58692m1.getCurrentTimeline(), this.f58692m1.isCommandAvailable(30) ? this.f58692m1.getCurrentTracks() : x7h.f97105b, this.f58692m1.isCommandAvailable(18) ? this.f58692m1.getMediaMetadata() : null);
        }
        if (this.f58692m1.isCommandAvailable(18)) {
            aVar.setPlaylistMetadata(this.f58692m1.getPlaylistMetadata());
        }
        aVar.setPlayWhenReady(this.f58692m1.getPlayWhenReady(), this.f58695p1);
        long j = this.f58697r1;
        if (j != -9223372036854775807L) {
            aVar.setPositionDiscontinuity(this.f58696q1, j);
            this.f58697r1 = -9223372036854775807L;
        }
        aVar.setRepeatMode(this.f58692m1.getRepeatMode());
        aVar.setSeekBackIncrementMs(this.f58692m1.getSeekBackIncrement());
        aVar.setSeekForwardIncrementMs(this.f58692m1.getSeekForwardIncrement());
        aVar.setShuffleModeEnabled(this.f58692m1.getShuffleModeEnabled());
        aVar.setSurfaceSize(this.f58692m1.getSurfaceSize());
        aVar.setTimedMetadata(this.f58694o1);
        if (this.f58692m1.isCommandAvailable(16)) {
            aVar.setTotalBufferedDurationMs(c8965b.f58703e);
        }
        aVar.setTrackSelectionParameters(this.f58692m1.getTrackSelectionParameters());
        aVar.setVideoSize(this.f58692m1.getVideoSize());
        if (this.f58692m1.isCommandAvailable(22)) {
            aVar.setVolume(this.f58692m1.getVolume());
        }
        return aVar.build();
    }

    @Override // p000.thf
    /* JADX INFO: renamed from: t0 */
    public ja9<?> mo16375t0(int i, List<nfa> list) {
        if (list.size() == 1) {
            this.f58692m1.addMediaItem(i, list.get(0));
        } else {
            this.f58692m1.addMediaItems(i, list);
        }
        return w17.immediateVoidFuture();
    }

    @Override // p000.thf
    /* JADX INFO: renamed from: u0 */
    public ja9<?> mo16376u0(@hib Object obj) {
        if (obj instanceof SurfaceView) {
            this.f58692m1.clearVideoSurfaceView((SurfaceView) obj);
        } else if (obj instanceof TextureView) {
            this.f58692m1.clearVideoTextureView((TextureView) obj);
        } else if (obj instanceof SurfaceHolder) {
            this.f58692m1.clearVideoSurfaceHolder((SurfaceHolder) obj);
        } else if (obj instanceof Surface) {
            this.f58692m1.clearVideoSurface((Surface) obj);
        } else {
            if (obj != null) {
                throw new IllegalStateException();
            }
            this.f58692m1.clearVideoSurface();
        }
        return w17.immediateVoidFuture();
    }

    @Override // p000.thf
    /* JADX INFO: renamed from: v0 */
    public ja9<?> mo16377v0(int i) {
        if (this.f58692m1.isCommandAvailable(34)) {
            this.f58692m1.decreaseDeviceVolume(i);
        } else {
            this.f58692m1.decreaseDeviceVolume();
        }
        return w17.immediateVoidFuture();
    }

    @Override // p000.thf
    /* JADX INFO: renamed from: w0 */
    public ja9<?> mo16378w0(int i) {
        if (this.f58692m1.isCommandAvailable(34)) {
            this.f58692m1.increaseDeviceVolume(i);
        } else {
            this.f58692m1.increaseDeviceVolume();
        }
        return w17.immediateVoidFuture();
    }

    @Override // p000.thf
    /* JADX INFO: renamed from: x0 */
    public ja9<?> mo16379x0(int i, int i2, int i3) {
        if (i2 == i + 1) {
            this.f58692m1.moveMediaItem(i, i3);
        } else {
            this.f58692m1.moveMediaItems(i, i2, i3);
        }
        return w17.immediateVoidFuture();
    }

    @Override // p000.thf
    /* JADX INFO: renamed from: y0 */
    public ja9<?> mo16380y0() {
        this.f58692m1.prepare();
        return w17.immediateVoidFuture();
    }

    @Override // p000.thf
    /* JADX INFO: renamed from: z0 */
    public ja9<?> mo16381z0() {
        this.f58692m1.release();
        return w17.immediateVoidFuture();
    }
}
