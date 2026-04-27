package p000;

import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;

/* JADX INFO: renamed from: fs */
/* JADX INFO: loaded from: classes.dex */
public final class TextureViewSurfaceTextureListenerC5944fs extends fq0 implements TextureView.SurfaceTextureListener {

    /* JADX INFO: renamed from: C */
    @gib
    public Surface f37589C;

    /* JADX INFO: renamed from: f */
    public long f37590f;

    /* JADX INFO: renamed from: m */
    @yfb
    public final Matrix f37591m;

    public TextureViewSurfaceTextureListenerC5944fs(@yfb x13 x13Var) {
        super(x13Var);
        this.f37590f = r78.f77324b.m32092getZeroYbymL2g();
        this.f37591m = new Matrix();
    }

    @yfb
    public final Matrix getMatrix() {
        return this.f37591m;
    }

    /* JADX INFO: renamed from: getSurfaceSize-YbymL2g, reason: not valid java name */
    public final long m29640getSurfaceSizeYbymL2g() {
        return this.f37590f;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(@yfb SurfaceTexture surfaceTexture, int i, int i2) {
        if (!r78.m32085equalsimpl0(this.f37590f, r78.f77324b.m32092getZeroYbymL2g())) {
            i = r78.m32087getWidthimpl(this.f37590f);
            i2 = r78.m32086getHeightimpl(this.f37590f);
            surfaceTexture.setDefaultBufferSize(i, i2);
        }
        Surface surface = new Surface(surfaceTexture);
        this.f37589C = surface;
        dispatchSurfaceCreated(surface, i, i2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(@yfb SurfaceTexture surfaceTexture) {
        Surface surface = this.f37589C;
        md8.checkNotNull(surface);
        dispatchSurfaceDestroyed(surface);
        this.f37589C = null;
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(@yfb SurfaceTexture surfaceTexture, int i, int i2) {
        if (!r78.m32085equalsimpl0(this.f37590f, r78.f77324b.m32092getZeroYbymL2g())) {
            i = r78.m32087getWidthimpl(this.f37590f);
            i2 = r78.m32086getHeightimpl(this.f37590f);
            surfaceTexture.setDefaultBufferSize(i, i2);
        }
        Surface surface = this.f37589C;
        md8.checkNotNull(surface);
        dispatchSurfaceChanged(surface, i, i2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(@yfb SurfaceTexture surfaceTexture) {
    }

    /* JADX INFO: renamed from: setSurfaceSize-ozmzZPI, reason: not valid java name */
    public final void m29641setSurfaceSizeozmzZPI(long j) {
        this.f37590f = j;
    }
}
