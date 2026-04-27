package p000;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import p000.x67;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class dv4 implements SurfaceTexture.OnFrameAvailableListener, Runnable {

    /* JADX INFO: renamed from: C */
    public static final int f30953C = 0;

    /* JADX INFO: renamed from: F */
    public static final int f30954F = 1;

    /* JADX INFO: renamed from: H */
    public static final int f30955H = 2;

    /* JADX INFO: renamed from: L */
    public static final int f30956L = 1;

    /* JADX INFO: renamed from: M */
    public static final int f30957M = 1;

    /* JADX INFO: renamed from: N */
    public static final int[] f30958N = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};

    /* JADX INFO: renamed from: Q */
    public static final int f30959Q = 12992;

    /* JADX INFO: renamed from: a */
    public final Handler f30960a;

    /* JADX INFO: renamed from: b */
    public final int[] f30961b;

    /* JADX INFO: renamed from: c */
    @hib
    public final InterfaceC4961b f30962c;

    /* JADX INFO: renamed from: d */
    @hib
    public EGLDisplay f30963d;

    /* JADX INFO: renamed from: e */
    @hib
    public EGLContext f30964e;

    /* JADX INFO: renamed from: f */
    @hib
    public EGLSurface f30965f;

    /* JADX INFO: renamed from: m */
    @hib
    public SurfaceTexture f30966m;

    /* JADX INFO: renamed from: dv4$a */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC4960a {
    }

    /* JADX INFO: renamed from: dv4$b */
    public interface InterfaceC4961b {
        void onFrameAvailable();
    }

    public dv4(Handler handler) {
        this(handler, null);
    }

    private static EGLConfig chooseEGLConfig(EGLDisplay eGLDisplay) throws x67.C14938a {
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr = new int[1];
        boolean zEglChooseConfig = EGL14.eglChooseConfig(eGLDisplay, f30958N, 0, eGLConfigArr, 0, 1, iArr, 0);
        x67.checkGlException(zEglChooseConfig && iArr[0] > 0 && eGLConfigArr[0] != null, t0i.formatInvariant("eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", Boolean.valueOf(zEglChooseConfig), Integer.valueOf(iArr[0]), eGLConfigArr[0]));
        return eGLConfigArr[0];
    }

    private static EGLContext createEGLContext(EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i) throws x67.C14938a {
        EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(eGLDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, i == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344}, 0);
        x67.checkGlException(eGLContextEglCreateContext != null, "eglCreateContext failed");
        return eGLContextEglCreateContext;
    }

    private static EGLSurface createEGLSurface(EGLDisplay eGLDisplay, EGLConfig eGLConfig, EGLContext eGLContext, int i) throws x67.C14938a {
        EGLSurface eGLSurfaceEglCreatePbufferSurface;
        if (i == 1) {
            eGLSurfaceEglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
        } else {
            eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, i == 2 ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
            x67.checkGlException(eGLSurfaceEglCreatePbufferSurface != null, "eglCreatePbufferSurface failed");
        }
        x67.checkGlException(EGL14.eglMakeCurrent(eGLDisplay, eGLSurfaceEglCreatePbufferSurface, eGLSurfaceEglCreatePbufferSurface, eGLContext), "eglMakeCurrent failed");
        return eGLSurfaceEglCreatePbufferSurface;
    }

    private void dispatchOnFrameAvailable() {
        InterfaceC4961b interfaceC4961b = this.f30962c;
        if (interfaceC4961b != null) {
            interfaceC4961b.onFrameAvailable();
        }
    }

    private static void generateTextureIds(int[] iArr) throws x67.C14938a {
        GLES20.glGenTextures(1, iArr, 0);
        x67.checkGlError();
    }

    private static EGLDisplay getDefaultDisplay() throws x67.C14938a {
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        x67.checkGlException(eGLDisplayEglGetDisplay != null, "eglGetDisplay failed");
        int[] iArr = new int[2];
        x67.checkGlException(EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr, 0, iArr, 1), "eglInitialize failed");
        return eGLDisplayEglGetDisplay;
    }

    public SurfaceTexture getSurfaceTexture() {
        return (SurfaceTexture) v80.checkNotNull(this.f30966m);
    }

    public void init(int i) throws x67.C14938a {
        EGLDisplay defaultDisplay = getDefaultDisplay();
        this.f30963d = defaultDisplay;
        EGLConfig eGLConfigChooseEGLConfig = chooseEGLConfig(defaultDisplay);
        EGLContext eGLContextCreateEGLContext = createEGLContext(this.f30963d, eGLConfigChooseEGLConfig, i);
        this.f30964e = eGLContextCreateEGLContext;
        this.f30965f = createEGLSurface(this.f30963d, eGLConfigChooseEGLConfig, eGLContextCreateEGLContext, i);
        generateTextureIds(this.f30961b);
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f30961b[0]);
        this.f30966m = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(this);
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f30960a.post(this);
    }

    public void release() {
        this.f30960a.removeCallbacks(this);
        try {
            SurfaceTexture surfaceTexture = this.f30966m;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                GLES20.glDeleteTextures(1, this.f30961b, 0);
            }
        } finally {
            EGLDisplay eGLDisplay = this.f30963d;
            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay2 = this.f30963d;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface2 = this.f30965f;
            if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.f30963d, this.f30965f);
            }
            EGLContext eGLContext = this.f30964e;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(this.f30963d, eGLContext);
            }
            EGL14.eglReleaseThread();
            EGLDisplay eGLDisplay3 = this.f30963d;
            if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(this.f30963d);
            }
            this.f30963d = null;
            this.f30964e = null;
            this.f30965f = null;
            this.f30966m = null;
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        dispatchOnFrameAvailable();
        SurfaceTexture surfaceTexture = this.f30966m;
        if (surfaceTexture != null) {
            try {
                surfaceTexture.updateTexImage();
            } catch (RuntimeException unused) {
            }
        }
    }

    public dv4(Handler handler, @hib InterfaceC4961b interfaceC4961b) {
        this.f30960a = handler;
        this.f30962c = interfaceC4961b;
        this.f30961b = new int[1];
    }
}
