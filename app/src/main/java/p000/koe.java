package p000;

import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.opengl.GLES20;
import android.opengl.Matrix;
import androidx.media3.common.C1213a;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import p000.x67;

/* JADX INFO: loaded from: classes3.dex */
public final class koe implements o6i, gp1 {

    /* JADX INFO: renamed from: Q */
    public static final String f54851Q = "SceneRenderer";

    /* JADX INFO: renamed from: F */
    public int f54853F;

    /* JADX INFO: renamed from: H */
    public SurfaceTexture f54854H;

    /* JADX INFO: renamed from: N */
    @hib
    public byte[] f54857N;

    /* JADX INFO: renamed from: a */
    public final AtomicBoolean f54858a = new AtomicBoolean();

    /* JADX INFO: renamed from: b */
    public final AtomicBoolean f54859b = new AtomicBoolean(true);

    /* JADX INFO: renamed from: c */
    public final wfd f54860c = new wfd();

    /* JADX INFO: renamed from: d */
    public final iv6 f54861d = new iv6();

    /* JADX INFO: renamed from: e */
    public final m1h<Long> f54862e = new m1h<>();

    /* JADX INFO: renamed from: f */
    public final m1h<sfd> f54863f = new m1h<>();

    /* JADX INFO: renamed from: m */
    public final float[] f54864m = new float[16];

    /* JADX INFO: renamed from: C */
    public final float[] f54852C = new float[16];

    /* JADX INFO: renamed from: L */
    public volatile int f54855L = 0;

    /* JADX INFO: renamed from: M */
    public int f54856M = -1;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$init$0(SurfaceTexture surfaceTexture) {
        this.f54858a.set(true);
    }

    private void setProjection(@hib byte[] bArr, int i, long j) {
        byte[] bArr2 = this.f54857N;
        int i2 = this.f54856M;
        this.f54857N = bArr;
        if (i == -1) {
            i = this.f54855L;
        }
        this.f54856M = i;
        if (i2 == i && Arrays.equals(bArr2, this.f54857N)) {
            return;
        }
        byte[] bArr3 = this.f54857N;
        sfd sfdVarDecode = bArr3 != null ? vfd.decode(bArr3, this.f54856M) : null;
        if (sfdVarDecode == null || !wfd.isSupported(sfdVarDecode)) {
            sfdVarDecode = sfd.createEquirectangular(this.f54856M);
        }
        this.f54863f.add(j, sfdVarDecode);
    }

    public void drawFrame(float[] fArr, boolean z) {
        GLES20.glClear(16384);
        try {
            x67.checkGlError();
        } catch (x67.C14938a e) {
            xh9.m25145e("SceneRenderer", "Failed to draw a frame", e);
        }
        if (this.f54858a.compareAndSet(true, false)) {
            ((SurfaceTexture) v80.checkNotNull(this.f54854H)).updateTexImage();
            try {
                x67.checkGlError();
            } catch (x67.C14938a e2) {
                xh9.m25145e("SceneRenderer", "Failed to draw a frame", e2);
            }
            if (this.f54859b.compareAndSet(true, false)) {
                x67.setToIdentity(this.f54864m);
            }
            long timestamp = this.f54854H.getTimestamp();
            Long lPoll = this.f54862e.poll(timestamp);
            if (lPoll != null) {
                this.f54861d.pollRotationMatrix(this.f54864m, lPoll.longValue());
            }
            sfd sfdVarPollFloor = this.f54863f.pollFloor(timestamp);
            if (sfdVarPollFloor != null) {
                this.f54860c.setProjection(sfdVarPollFloor);
            }
        }
        Matrix.multiplyMM(this.f54852C, 0, fArr, 0, this.f54864m, 0);
        this.f54860c.draw(this.f54853F, this.f54852C, z);
    }

    public SurfaceTexture init() {
        try {
            GLES20.glClearColor(0.5f, 0.5f, 0.5f, 1.0f);
            x67.checkGlError();
            this.f54860c.init();
            x67.checkGlError();
            this.f54853F = x67.createExternalTexture();
        } catch (x67.C14938a e) {
            xh9.m25145e("SceneRenderer", "Failed to initialize the renderer", e);
        }
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f54853F);
        this.f54854H = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: ioe
            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public final void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                this.f47794a.lambda$init$0(surfaceTexture2);
            }
        });
        return this.f54854H;
    }

    @Override // p000.gp1
    public void onCameraMotion(long j, float[] fArr) {
        this.f54861d.setRotation(j, fArr);
    }

    @Override // p000.gp1
    public void onCameraMotionReset() {
        this.f54862e.clear();
        this.f54861d.reset();
        this.f54859b.set(true);
    }

    @Override // p000.o6i
    public void onVideoFrameAboutToBeRendered(long j, long j2, C1213a c1213a, @hib MediaFormat mediaFormat) {
        this.f54862e.add(j2, Long.valueOf(j));
        setProjection(c1213a.f8262C, c1213a.f8263D, j2);
    }

    public void setDefaultStereoMode(int i) {
        this.f54855L = i;
    }

    public void shutdown() {
        this.f54860c.shutdown();
    }
}
