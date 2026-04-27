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
import p000.y67;

/* JADX INFO: loaded from: classes4.dex */
@c5e(17)
@Deprecated
public final class ev4 implements SurfaceTexture.OnFrameAvailableListener, Runnable {

    /* JADX INFO: renamed from: C */
    public static final int f34120C = 0;

    /* JADX INFO: renamed from: F */
    public static final int f34121F = 1;

    /* JADX INFO: renamed from: H */
    public static final int f34122H = 2;

    /* JADX INFO: renamed from: L */
    public static final int f34123L = 1;

    /* JADX INFO: renamed from: M */
    public static final int f34124M = 1;

    /* JADX INFO: renamed from: N */
    public static final int[] f34125N = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};

    /* JADX INFO: renamed from: Q */
    public static final int f34126Q = 12992;

    /* JADX INFO: renamed from: a */
    public final Handler f34127a;

    /* JADX INFO: renamed from: b */
    public final int[] f34128b;

    /* JADX INFO: renamed from: c */
    @hib
    public final InterfaceC5477b f34129c;

    /* JADX INFO: renamed from: d */
    @hib
    public EGLDisplay f34130d;

    /* JADX INFO: renamed from: e */
    @hib
    public EGLContext f34131e;

    /* JADX INFO: renamed from: f */
    @hib
    public EGLSurface f34132f;

    /* JADX INFO: renamed from: m */
    @hib
    public SurfaceTexture f34133m;

    /* JADX INFO: renamed from: ev4$a */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC5476a {
    }

    /* JADX INFO: renamed from: ev4$b */
    public interface InterfaceC5477b {
        void onFrameAvailable();
    }

    public ev4(Handler handler) {
        this(handler, null);
    }

    private static EGLConfig chooseEGLConfig(EGLDisplay eGLDisplay) throws y67.C15503b {
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr = new int[1];
        boolean zEglChooseConfig = EGL14.eglChooseConfig(eGLDisplay, f34125N, 0, eGLConfigArr, 0, 1, iArr, 0);
        y67.checkGlException(zEglChooseConfig && iArr[0] > 0 && eGLConfigArr[0] != null, x0i.formatInvariant("eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", Boolean.valueOf(zEglChooseConfig), Integer.valueOf(iArr[0]), eGLConfigArr[0]));
        return eGLConfigArr[0];
    }

    private static EGLContext createEGLContext(EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i) throws y67.C15503b {
        EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(eGLDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, i == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344}, 0);
        y67.checkGlException(eGLContextEglCreateContext != null, "eglCreateContext failed");
        return eGLContextEglCreateContext;
    }

    private static EGLSurface createEGLSurface(EGLDisplay eGLDisplay, EGLConfig eGLConfig, EGLContext eGLContext, int i) throws y67.C15503b {
        EGLSurface eGLSurfaceEglCreatePbufferSurface;
        if (i == 1) {
            eGLSurfaceEglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
        } else {
            eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, i == 2 ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
            y67.checkGlException(eGLSurfaceEglCreatePbufferSurface != null, "eglCreatePbufferSurface failed");
        }
        y67.checkGlException(EGL14.eglMakeCurrent(eGLDisplay, eGLSurfaceEglCreatePbufferSurface, eGLSurfaceEglCreatePbufferSurface, eGLContext), "eglMakeCurrent failed");
        return eGLSurfaceEglCreatePbufferSurface;
    }

    private void dispatchOnFrameAvailable() {
        InterfaceC5477b interfaceC5477b = this.f34129c;
        if (interfaceC5477b != null) {
            interfaceC5477b.onFrameAvailable();
        }
    }

    private static void generateTextureIds(int[] iArr) throws y67.C15503b {
        GLES20.glGenTextures(1, iArr, 0);
        y67.checkGlError();
    }

    private static EGLDisplay getDefaultDisplay() throws y67.C15503b {
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        y67.checkGlException(eGLDisplayEglGetDisplay != null, "eglGetDisplay failed");
        int[] iArr = new int[2];
        y67.checkGlException(EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr, 0, iArr, 1), "eglInitialize failed");
        return eGLDisplayEglGetDisplay;
    }

    public SurfaceTexture getSurfaceTexture() {
        return (SurfaceTexture) u80.checkNotNull(this.f34133m);
    }

    public void init(int i) throws y67.C15503b {
        EGLDisplay defaultDisplay = getDefaultDisplay();
        this.f34130d = defaultDisplay;
        EGLConfig eGLConfigChooseEGLConfig = chooseEGLConfig(defaultDisplay);
        EGLContext eGLContextCreateEGLContext = createEGLContext(this.f34130d, eGLConfigChooseEGLConfig, i);
        this.f34131e = eGLContextCreateEGLContext;
        this.f34132f = createEGLSurface(this.f34130d, eGLConfigChooseEGLConfig, eGLContextCreateEGLContext, i);
        generateTextureIds(this.f34128b);
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f34128b[0]);
        this.f34133m = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(this);
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f34127a.post(this);
    }

    public void release() {
        this.f34127a.removeCallbacks(this);
        try {
            SurfaceTexture surfaceTexture = this.f34133m;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                GLES20.glDeleteTextures(1, this.f34128b, 0);
            }
        } finally {
            EGLDisplay eGLDisplay = this.f34130d;
            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay2 = this.f34130d;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface2 = this.f34132f;
            if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.f34130d, this.f34132f);
            }
            EGLContext eGLContext = this.f34131e;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(this.f34130d, eGLContext);
            }
            if (x0i.f95978a >= 19) {
                EGL14.eglReleaseThread();
            }
            EGLDisplay eGLDisplay3 = this.f34130d;
            if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(this.f34130d);
            }
            this.f34130d = null;
            this.f34131e = null;
            this.f34132f = null;
            this.f34133m = null;
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        dispatchOnFrameAvailable();
        SurfaceTexture surfaceTexture = this.f34133m;
        if (surfaceTexture != null) {
            try {
                surfaceTexture.updateTexImage();
            } catch (RuntimeException unused) {
            }
        }
    }

    public ev4(Handler handler, @hib InterfaceC5477b interfaceC5477b) {
        this.f34127a = handler;
        this.f34129c = interfaceC5477b;
        this.f34128b = new int[1];
    }
}
