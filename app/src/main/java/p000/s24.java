package p000;

import android.graphics.Bitmap;
import android.media.MediaFormat;
import android.view.Surface;
import androidx.media3.common.C1213a;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.Executor;
import p000.x7i;
import p000.z6i;

/* JADX INFO: loaded from: classes3.dex */
public final class s24 implements x7i {

    /* JADX INFO: renamed from: f */
    public final t6i f80419f;

    /* JADX INFO: renamed from: g */
    public final z6i f80420g;

    /* JADX INFO: renamed from: h */
    public final Queue<x7i.InterfaceC14975d> f80421h;

    /* JADX INFO: renamed from: i */
    @hib
    public Surface f80422i;

    /* JADX INFO: renamed from: j */
    public C1213a f80423j;

    /* JADX INFO: renamed from: k */
    public long f80424k;

    /* JADX INFO: renamed from: l */
    public x7i.InterfaceC14974c f80425l;

    /* JADX INFO: renamed from: m */
    public Executor f80426m;

    /* JADX INFO: renamed from: n */
    public o6i f80427n;

    /* JADX INFO: renamed from: s24$b */
    public final class C12406b implements z6i.InterfaceC16021a {

        /* JADX INFO: renamed from: a */
        public C1213a f80428a;

        private C12406b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$dropFrame$2() {
            s24.this.f80425l.onFrameDropped();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onVideoSizeChanged$0(a8i a8iVar) {
            s24.this.f80425l.onVideoSizeChanged(a8iVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$renderFrame$1() {
            s24.this.f80425l.onFirstFrameRendered();
        }

        @Override // p000.z6i.InterfaceC16021a
        public void dropFrame() {
            s24.this.f80426m.execute(new Runnable() { // from class: u24
                @Override // java.lang.Runnable
                public final void run() {
                    this.f86580a.lambda$dropFrame$2();
                }
            });
            ((x7i.InterfaceC14975d) s24.this.f80421h.remove()).skip();
        }

        @Override // p000.z6i.InterfaceC16021a
        public void onVideoSizeChanged(final a8i a8iVar) {
            this.f80428a = new C1213a.b().setWidth(a8iVar.f647a).setHeight(a8iVar.f648b).setSampleMimeType("video/raw").build();
            s24.this.f80426m.execute(new Runnable() { // from class: v24
                @Override // java.lang.Runnable
                public final void run() {
                    this.f89728a.lambda$onVideoSizeChanged$0(a8iVar);
                }
            });
        }

        @Override // p000.z6i.InterfaceC16021a
        public void renderFrame(long j, long j2, boolean z) {
            if (z && s24.this.f80422i != null) {
                s24.this.f80426m.execute(new Runnable() { // from class: t24
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f83495a.lambda$renderFrame$1();
                    }
                });
            }
            C1213a c1213aBuild = this.f80428a;
            if (c1213aBuild == null) {
                c1213aBuild = new C1213a.b().build();
            }
            s24.this.f80427n.onVideoFrameAboutToBeRendered(j2, j, c1213aBuild, null);
            ((x7i.InterfaceC14975d) s24.this.f80421h.remove()).render(j);
        }
    }

    public s24(t6i t6iVar, j52 j52Var) {
        this.f80419f = t6iVar;
        t6iVar.setClock(j52Var);
        this.f80420g = new z6i(new C12406b(), t6iVar);
        this.f80421h = new ArrayDeque();
        this.f80423j = new C1213a.b().build();
        this.f80424k = -9223372036854775807L;
        this.f80425l = x7i.InterfaceC14974c.f97122a;
        this.f80426m = new Executor() { // from class: p24
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                s24.lambda$new$0(runnable);
            }
        };
        this.f80427n = new o6i() { // from class: q24
            @Override // p000.o6i
            public final void onVideoFrameAboutToBeRendered(long j, long j2, C1213a c1213a, MediaFormat mediaFormat) {
                s24.lambda$new$1(j, j2, c1213a, mediaFormat);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$handleInputFrame$2() {
        this.f80425l.onFrameAvailableForRendering();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$new$0(Runnable runnable) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$new$1(long j, long j2, C1213a c1213a, MediaFormat mediaFormat) {
    }

    @Override // p000.x7i
    public void allowReleaseFirstFrameBeforeStarted() {
        this.f80419f.allowReleaseFirstFrameBeforeStarted();
    }

    @Override // p000.x7i
    public void clearOutputSurfaceInfo() {
        this.f80422i = null;
        this.f80419f.setOutputSurface(null);
    }

    @Override // p000.x7i
    public void flush(boolean z) {
        if (z) {
            this.f80419f.reset();
        }
        this.f80420g.flush();
        this.f80421h.clear();
    }

    @Override // p000.x7i
    public Surface getInputSurface() {
        return (Surface) v80.checkStateNotNull(this.f80422i);
    }

    @Override // p000.x7i
    public boolean handleInputBitmap(Bitmap bitmap, j2h j2hVar) {
        throw new UnsupportedOperationException();
    }

    @Override // p000.x7i
    public boolean handleInputFrame(long j, x7i.InterfaceC14975d interfaceC14975d) {
        this.f80421h.add(interfaceC14975d);
        this.f80420g.onFrameAvailableForRendering(j);
        this.f80426m.execute(new Runnable() { // from class: r24
            @Override // java.lang.Runnable
            public final void run() {
                this.f76834a.lambda$handleInputFrame$2();
            }
        });
        return true;
    }

    @Override // p000.x7i
    public boolean initialize(C1213a c1213a) {
        return true;
    }

    @Override // p000.x7i
    public boolean isEnded() {
        return this.f80420g.isEnded();
    }

    @Override // p000.x7i
    public boolean isInitialized() {
        return true;
    }

    @Override // p000.x7i
    public boolean isReady(boolean z) {
        return this.f80419f.isReady(z);
    }

    @Override // p000.x7i
    public void join(boolean z) {
        this.f80419f.join(z);
    }

    @Override // p000.x7i
    public void onInputStreamChanged(int i, C1213a c1213a, long j, int i2, List<ix4> list) {
        v80.checkState(list.isEmpty());
        int i3 = c1213a.f8298v;
        C1213a c1213a2 = this.f80423j;
        if (i3 != c1213a2.f8298v || c1213a.f8299w != c1213a2.f8299w) {
            this.f80420g.onVideoSizeChanged(i3, c1213a.f8299w);
        }
        float f = c1213a.f8302z;
        if (f != this.f80423j.f8302z) {
            this.f80419f.setFrameRate(f);
        }
        this.f80423j = c1213a;
        if (j != this.f80424k) {
            this.f80420g.onStreamChanged(i2, j);
            this.f80424k = j;
        }
    }

    @Override // p000.x7i
    public void redraw() {
        throw new UnsupportedOperationException();
    }

    @Override // p000.x7i
    public void release() {
    }

    @Override // p000.x7i
    public void render(long j, long j2) throws x7i.C14976e {
        try {
            this.f80420g.render(j, j2);
        } catch (aa5 e) {
            throw new x7i.C14976e(e, this.f80423j);
        }
    }

    @Override // p000.x7i
    public void setBufferTimestampAdjustmentUs(long j) {
        throw new UnsupportedOperationException();
    }

    @Override // p000.x7i
    public void setChangeFrameRateStrategy(int i) {
        this.f80419f.setChangeFrameRateStrategy(i);
    }

    @Override // p000.x7i
    public void setListener(x7i.InterfaceC14974c interfaceC14974c, Executor executor) {
        this.f80425l = interfaceC14974c;
        this.f80426m = executor;
    }

    @Override // p000.x7i
    public void setOutputSurfaceInfo(Surface surface, xpf xpfVar) {
        this.f80422i = surface;
        this.f80419f.setOutputSurface(surface);
    }

    @Override // p000.x7i
    public void setPlaybackSpeed(float f) {
        this.f80419f.setPlaybackSpeed(f);
    }

    @Override // p000.x7i
    public void setVideoEffects(List<ix4> list) {
        throw new UnsupportedOperationException();
    }

    @Override // p000.x7i
    public void setVideoFrameMetadataListener(o6i o6iVar) {
        this.f80427n = o6iVar;
    }

    @Override // p000.x7i
    public void signalEndOfCurrentInputStream() {
        this.f80420g.signalEndOfInput();
    }

    @Override // p000.x7i
    public void signalEndOfInput() {
    }

    @Override // p000.x7i
    public void startRendering() {
        this.f80419f.onStarted();
    }

    @Override // p000.x7i
    public void stopRendering() {
        this.f80419f.onStopped();
    }
}
