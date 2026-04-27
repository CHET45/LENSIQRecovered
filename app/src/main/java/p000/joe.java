package p000;

import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.opengl.GLES20;
import android.opengl.Matrix;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import p000.y67;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class joe implements n6i, fp1 {

    /* JADX INFO: renamed from: Q */
    public static final String f51365Q = "SceneRenderer";

    /* JADX INFO: renamed from: F */
    public int f51367F;

    /* JADX INFO: renamed from: H */
    public SurfaceTexture f51368H;

    /* JADX INFO: renamed from: N */
    @hib
    public byte[] f51371N;

    /* JADX INFO: renamed from: a */
    public final AtomicBoolean f51372a = new AtomicBoolean();

    /* JADX INFO: renamed from: b */
    public final AtomicBoolean f51373b = new AtomicBoolean(true);

    /* JADX INFO: renamed from: c */
    public final xfd f51374c = new xfd();

    /* JADX INFO: renamed from: d */
    public final hv6 f51375d = new hv6();

    /* JADX INFO: renamed from: e */
    public final l1h<Long> f51376e = new l1h<>();

    /* JADX INFO: renamed from: f */
    public final l1h<tfd> f51377f = new l1h<>();

    /* JADX INFO: renamed from: m */
    public final float[] f51378m = new float[16];

    /* JADX INFO: renamed from: C */
    public final float[] f51366C = new float[16];

    /* JADX INFO: renamed from: L */
    public volatile int f51369L = 0;

    /* JADX INFO: renamed from: M */
    public int f51370M = -1;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$init$0(SurfaceTexture surfaceTexture) {
        this.f51372a.set(true);
    }

    private void setProjection(@hib byte[] bArr, int i, long j) {
        byte[] bArr2 = this.f51371N;
        int i2 = this.f51370M;
        this.f51371N = bArr;
        if (i == -1) {
            i = this.f51369L;
        }
        this.f51370M = i;
        if (i2 == i && Arrays.equals(bArr2, this.f51371N)) {
            return;
        }
        byte[] bArr3 = this.f51371N;
        tfd tfdVarDecode = bArr3 != null ? ufd.decode(bArr3, this.f51370M) : null;
        if (tfdVarDecode == null || !xfd.isSupported(tfdVarDecode)) {
            tfdVarDecode = tfd.createEquirectangular(this.f51370M);
        }
        this.f51377f.add(j, tfdVarDecode);
    }

    public void drawFrame(float[] fArr, boolean z) {
        GLES20.glClear(16384);
        try {
            y67.checkGlError();
        } catch (y67.C15503b e) {
            yh9.m25916e("SceneRenderer", "Failed to draw a frame", e);
        }
        if (this.f51372a.compareAndSet(true, false)) {
            ((SurfaceTexture) u80.checkNotNull(this.f51368H)).updateTexImage();
            try {
                y67.checkGlError();
            } catch (y67.C15503b e2) {
                yh9.m25916e("SceneRenderer", "Failed to draw a frame", e2);
            }
            if (this.f51373b.compareAndSet(true, false)) {
                y67.setToIdentity(this.f51378m);
            }
            long timestamp = this.f51368H.getTimestamp();
            Long lPoll = this.f51376e.poll(timestamp);
            if (lPoll != null) {
                this.f51375d.pollRotationMatrix(this.f51378m, lPoll.longValue());
            }
            tfd tfdVarPollFloor = this.f51377f.pollFloor(timestamp);
            if (tfdVarPollFloor != null) {
                this.f51374c.setProjection(tfdVarPollFloor);
            }
        }
        Matrix.multiplyMM(this.f51366C, 0, fArr, 0, this.f51378m, 0);
        this.f51374c.draw(this.f51367F, this.f51366C, z);
    }

    public SurfaceTexture init() {
        try {
            GLES20.glClearColor(0.5f, 0.5f, 0.5f, 1.0f);
            y67.checkGlError();
            this.f51374c.init();
            y67.checkGlError();
            this.f51367F = y67.createExternalTexture();
        } catch (y67.C15503b e) {
            yh9.m25916e("SceneRenderer", "Failed to initialize the renderer", e);
        }
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f51367F);
        this.f51368H = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: hoe
            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public final void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                this.f44416a.lambda$init$0(surfaceTexture2);
            }
        });
        return this.f51368H;
    }

    @Override // p000.fp1
    public void onCameraMotion(long j, float[] fArr) {
        this.f51375d.setRotation(j, fArr);
    }

    @Override // p000.fp1
    public void onCameraMotionReset() {
        this.f51376e.clear();
        this.f51375d.reset();
        this.f51373b.set(true);
    }

    @Override // p000.n6i
    public void onVideoFrameAboutToBeRendered(long j, long j2, kq6 kq6Var, @hib MediaFormat mediaFormat) {
        this.f51376e.add(j2, Long.valueOf(j));
        setProjection(kq6Var.f55001b2, kq6Var.f55003c2, j2);
    }

    public void setDefaultStereoMode(int i) {
        this.f51369L = i;
    }

    public void shutdown() {
        this.f51374c.shutdown();
    }
}
