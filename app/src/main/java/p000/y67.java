package p000;

import android.content.Context;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.GLU;
import android.opengl.Matrix;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class y67 {

    /* JADX INFO: renamed from: a */
    public static final int f100476a = 4;

    /* JADX INFO: renamed from: b */
    public static final float f100477b = 2.0f;

    /* JADX INFO: renamed from: e */
    public static final String f100480e = "EGL_EXT_protected_content";

    /* JADX INFO: renamed from: f */
    public static final String f100481f = "EGL_KHR_surfaceless_context";

    /* JADX INFO: renamed from: g */
    public static final String f100482g = "GL_EXT_YUV_target";

    /* JADX INFO: renamed from: h */
    public static final String f100483h = "EGL_EXT_gl_colorspace_bt2020_pq";

    /* JADX INFO: renamed from: i */
    public static final int f100484i = 12445;

    /* JADX INFO: renamed from: j */
    public static final int f100485j = 13120;

    /* JADX INFO: renamed from: c */
    public static final int[] f100478c = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12344};

    /* JADX INFO: renamed from: d */
    public static final int[] f100479d = {12352, 4, 12324, 10, 12323, 10, 12322, 10, 12321, 2, 12325, 0, 12326, 0, 12344};

    /* JADX INFO: renamed from: k */
    public static final int[] f100486k = {12445, 13120, 12344, 12344};

    /* JADX INFO: renamed from: l */
    public static final int[] f100487l = {12344};

    /* JADX INFO: renamed from: y67$a */
    @c5e(17)
    public static final class C15502a {
        private C15502a() {
        }

        @ih4
        public static EGLContext createEglContext(EGLContext eGLContext, EGLDisplay eGLDisplay, int i, int[] iArr) throws C15503b {
            EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(eGLDisplay, getEglConfig(eGLDisplay, iArr), eGLContext, new int[]{12440, i, 12344}, 0);
            if (eGLContextEglCreateContext != null) {
                y67.checkGlError();
                return eGLContextEglCreateContext;
            }
            EGL14.eglTerminate(eGLDisplay);
            throw new C15503b("eglCreateContext() failed to create a valid context. The device may not support EGL version " + i);
        }

        @ih4
        public static EGLDisplay createEglDisplay() throws C15503b {
            EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
            y67.checkGlException(!eGLDisplayEglGetDisplay.equals(EGL14.EGL_NO_DISPLAY), "No EGL display.");
            y67.checkGlException(EGL14.eglInitialize(eGLDisplayEglGetDisplay, new int[1], 0, new int[1], 0), "Error in eglInitialize.");
            y67.checkGlError();
            return eGLDisplayEglGetDisplay;
        }

        @ih4
        public static EGLSurface createEglPbufferSurface(EGLDisplay eGLDisplay, int[] iArr, int[] iArr2) throws C15503b {
            EGLSurface eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, getEglConfig(eGLDisplay, iArr), iArr2, 0);
            y67.checkEglException("Error creating surface");
            return eGLSurfaceEglCreatePbufferSurface;
        }

        @ih4
        public static EGLSurface createEglSurface(EGLDisplay eGLDisplay, Object obj, int[] iArr, int[] iArr2) throws C15503b {
            EGLSurface eGLSurfaceEglCreateWindowSurface = EGL14.eglCreateWindowSurface(eGLDisplay, getEglConfig(eGLDisplay, iArr), obj, iArr2, 0);
            y67.checkEglException("Error creating surface");
            return eGLSurfaceEglCreateWindowSurface;
        }

        @ih4
        public static void destroyEglContext(@hib EGLDisplay eGLDisplay, @hib EGLContext eGLContext) throws C15503b {
            if (eGLDisplay == null) {
                return;
            }
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            y67.checkEglException("Error releasing context");
            if (eGLContext != null) {
                EGL14.eglDestroyContext(eGLDisplay, eGLContext);
                y67.checkEglException("Error destroying context");
            }
            EGL14.eglReleaseThread();
            y67.checkEglException("Error releasing thread");
            EGL14.eglTerminate(eGLDisplay);
            y67.checkEglException("Error terminating display");
        }

        @ih4
        public static void destroyEglSurface(@hib EGLDisplay eGLDisplay, @hib EGLSurface eGLSurface) throws C15503b {
            if (eGLDisplay == null || eGLSurface == null) {
                return;
            }
            EGL14.eglDestroySurface(eGLDisplay, eGLSurface);
            y67.checkEglException("Error destroying surface");
        }

        @ih4
        public static void focusFramebufferUsingCurrentContext(int i, int i2, int i3) throws C15503b {
            y67.checkGlException(!x0i.areEqual(EGL14.eglGetCurrentContext(), EGL14.EGL_NO_CONTEXT), "No current context");
            int[] iArr = new int[1];
            GLES20.glGetIntegerv(36006, iArr, 0);
            if (iArr[0] != i) {
                GLES20.glBindFramebuffer(36160, i);
            }
            y67.checkGlError();
            GLES20.glViewport(0, 0, i2, i3);
            y67.checkGlError();
        }

        @ih4
        public static void focusRenderTarget(EGLDisplay eGLDisplay, EGLContext eGLContext, EGLSurface eGLSurface, int i, int i2, int i3) throws C15503b {
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, eGLContext);
            y67.checkEglException("Error making context current");
            focusFramebufferUsingCurrentContext(i, i2, i3);
        }

        @ih4
        private static EGLConfig getEglConfig(EGLDisplay eGLDisplay, int[] iArr) throws C15503b {
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            if (EGL14.eglChooseConfig(eGLDisplay, iArr, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
                return eGLConfigArr[0];
            }
            throw new C15503b("eglChooseConfig failed.");
        }
    }

    /* JADX INFO: renamed from: y67$b */
    public static final class C15503b extends Exception {
        public C15503b(String str) {
            super(str);
        }
    }

    private y67() {
    }

    private static void assertValidTextureSize(int i, int i2) throws C15503b {
        int[] iArr = new int[1];
        GLES20.glGetIntegerv(3379, iArr, 0);
        int i3 = iArr[0];
        u80.checkState(i3 > 0, "Create a OpenGL context first or run the GL methods on an OpenGL thread.");
        if (i < 0 || i2 < 0) {
            throw new C15503b("width or height is less than 0");
        }
        if (i > i3 || i2 > i3) {
            throw new C15503b("width or height is greater than GL_MAX_TEXTURE_SIZE " + i3);
        }
    }

    public static void bindTexture(int i, int i2) throws C15503b {
        GLES20.glBindTexture(i, i2);
        checkGlError();
        GLES20.glTexParameteri(i, 10240, jk1.f50790I3);
        checkGlError();
        GLES20.glTexParameteri(i, 10241, jk1.f50790I3);
        checkGlError();
        GLES20.glTexParameteri(i, 10242, 33071);
        checkGlError();
        GLES20.glTexParameteri(i, 10243, 33071);
        checkGlError();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void checkEglException(String str) throws C15503b {
        int iEglGetError = EGL14.eglGetError();
        checkGlException(iEglGetError == 12288, str + ", error code: " + iEglGetError);
    }

    public static void checkGlError() throws C15503b {
        StringBuilder sb = new StringBuilder();
        boolean z = false;
        while (true) {
            int iGlGetError = GLES20.glGetError();
            if (iGlGetError == 0) {
                break;
            }
            if (z) {
                sb.append('\n');
            }
            sb.append("glError: ");
            sb.append(GLU.gluErrorString(iGlGetError));
            z = true;
        }
        if (z) {
            throw new C15503b(sb.toString());
        }
    }

    public static void checkGlException(boolean z, String str) throws C15503b {
        if (!z) {
            throw new C15503b(str);
        }
    }

    public static void clearOutputFrame() throws C15503b {
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        GLES20.glClearDepthf(1.0f);
        GLES20.glClear(16640);
        checkGlError();
    }

    public static float[] create4x4IdentityMatrix() {
        float[] fArr = new float[16];
        setToIdentity(fArr);
        return fArr;
    }

    public static FloatBuffer createBuffer(float[] fArr) {
        return (FloatBuffer) createBuffer(fArr.length).put(fArr).flip();
    }

    @c5e(17)
    public static EGLContext createEglContext(EGLDisplay eGLDisplay) throws C15503b {
        return createEglContext(EGL14.EGL_NO_CONTEXT, eGLDisplay, 2, f100478c);
    }

    @c5e(17)
    public static EGLDisplay createEglDisplay() throws C15503b {
        return C15502a.createEglDisplay();
    }

    @c5e(17)
    public static EGLSurface createEglSurface(EGLDisplay eGLDisplay, Object obj, int i, boolean z) throws C15503b {
        int[] iArr;
        int[] iArr2;
        if (i == 3 || i == 10) {
            iArr = f100478c;
            iArr2 = f100487l;
        } else if (i == 6) {
            iArr = f100479d;
            iArr2 = z ? f100487l : f100486k;
        } else {
            if (i != 7) {
                throw new IllegalArgumentException("Unsupported color transfer: " + i);
            }
            u80.checkArgument(z, "Outputting HLG to the screen is not supported.");
            iArr = f100479d;
            iArr2 = f100487l;
        }
        return C15502a.createEglSurface(eGLDisplay, obj, iArr, iArr2);
    }

    public static int createExternalTexture() throws C15503b {
        int iGenerateTexture = generateTexture();
        bindTexture(36197, iGenerateTexture);
        return iGenerateTexture;
    }

    public static int createFboForTexture(int i) throws C15503b {
        checkGlException(!x0i.areEqual(EGL14.eglGetCurrentContext(), EGL14.EGL_NO_CONTEXT), "No current context");
        int[] iArr = new int[1];
        GLES20.glGenFramebuffers(1, iArr, 0);
        checkGlError();
        GLES20.glBindFramebuffer(36160, iArr[0]);
        checkGlError();
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, i, 0);
        checkGlError();
        return iArr[0];
    }

    @c5e(17)
    public static EGLSurface createFocusedPlaceholderEglSurface(EGLContext eGLContext, EGLDisplay eGLDisplay, int[] iArr) throws C15503b {
        EGLSurface eGLSurfaceCreatePbufferSurface = isSurfacelessContextExtensionSupported() ? EGL14.EGL_NO_SURFACE : createPbufferSurface(eGLDisplay, 1, 1, iArr);
        focusEglSurface(eGLDisplay, eGLContext, eGLSurfaceCreatePbufferSurface, 1, 1);
        return eGLSurfaceCreatePbufferSurface;
    }

    @c5e(17)
    private static EGLSurface createPbufferSurface(EGLDisplay eGLDisplay, int i, int i2, int[] iArr) throws C15503b {
        return C15502a.createEglPbufferSurface(eGLDisplay, iArr, new int[]{12375, i, 12374, i2, 12344});
    }

    public static int createTexture(int i, int i2, boolean z) throws C15503b {
        if (!z) {
            return createTexture(i, i2, 6408, 5121);
        }
        u80.checkState(x0i.f95978a >= 18, "GLES30 extensions are not supported below API 18.");
        return createTexture(i, i2, 34842, 5131);
    }

    public static float[] createVertexBuffer(List<float[]> list) {
        float[] fArr = new float[list.size() * 4];
        for (int i = 0; i < list.size(); i++) {
            System.arraycopy(list.get(i), 0, fArr, i * 4, 4);
        }
        return fArr;
    }

    public static void deleteFbo(int i) throws C15503b {
        GLES20.glDeleteFramebuffers(1, new int[]{i}, 0);
        checkGlError();
    }

    public static void deleteRbo(int i) throws C15503b {
        GLES20.glDeleteRenderbuffers(1, new int[]{i}, 0);
        checkGlError();
    }

    public static void deleteTexture(int i) throws C15503b {
        GLES20.glDeleteTextures(1, new int[]{i}, 0);
        checkGlError();
    }

    @c5e(17)
    public static void destroyEglContext(@hib EGLDisplay eGLDisplay, @hib EGLContext eGLContext) throws C15503b {
        C15502a.destroyEglContext(eGLDisplay, eGLContext);
    }

    @c5e(17)
    public static void destroyEglSurface(@hib EGLDisplay eGLDisplay, @hib EGLSurface eGLSurface) throws C15503b {
        C15502a.destroyEglSurface(eGLDisplay, eGLSurface);
    }

    @c5e(17)
    public static void focusEglSurface(EGLDisplay eGLDisplay, EGLContext eGLContext, EGLSurface eGLSurface, int i, int i2) throws C15503b {
        C15502a.focusRenderTarget(eGLDisplay, eGLContext, eGLSurface, 0, i, i2);
    }

    @c5e(17)
    public static void focusFramebuffer(EGLDisplay eGLDisplay, EGLContext eGLContext, EGLSurface eGLSurface, int i, int i2, int i3) throws C15503b {
        C15502a.focusRenderTarget(eGLDisplay, eGLContext, eGLSurface, i, i2, i3);
    }

    @c5e(17)
    public static void focusFramebufferUsingCurrentContext(int i, int i2, int i3) throws C15503b {
        C15502a.focusFramebufferUsingCurrentContext(i, i2, i3);
    }

    @c5e(17)
    public static EGLSurface focusPlaceholderEglSurface(EGLContext eGLContext, EGLDisplay eGLDisplay) throws C15503b {
        return createFocusedPlaceholderEglSurface(eGLContext, eGLDisplay, f100478c);
    }

    private static int generateTexture() throws C15503b {
        checkGlException(!x0i.areEqual(EGL14.eglGetCurrentContext(), EGL14.EGL_NO_CONTEXT), "No current context");
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        checkGlError();
        return iArr[0];
    }

    public static EGLContext getCurrentContext() {
        return EGL14.eglGetCurrentContext();
    }

    public static float[] getNormalizedCoordinateBounds() {
        return new float[]{-1.0f, -1.0f, 0.0f, 1.0f, 1.0f, -1.0f, 0.0f, 1.0f, -1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f};
    }

    public static float[] getTextureCoordinateBounds() {
        return new float[]{0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 1.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f};
    }

    public static boolean isBt2020PqExtensionSupported() {
        String strEglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373);
        return strEglQueryString != null && strEglQueryString.contains("EGL_EXT_gl_colorspace_bt2020_pq");
    }

    public static boolean isProtectedContentExtensionSupported(Context context) {
        String strEglQueryString;
        int i = x0i.f95978a;
        if (i < 24) {
            return false;
        }
        if (i >= 26 || !(as9.f11748b.equals(x0i.f95980c) || "XT1650".equals(x0i.f95981d))) {
            return (i >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) && (strEglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && strEglQueryString.contains("EGL_EXT_protected_content");
        }
        return false;
    }

    public static boolean isSurfacelessContextExtensionSupported() {
        String strEglQueryString;
        return x0i.f95978a >= 17 && (strEglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && strEglQueryString.contains("EGL_KHR_surfaceless_context");
    }

    public static boolean isYuvTargetExtensionSupported() {
        String strGlGetString;
        if (x0i.f95978a < 17) {
            return false;
        }
        if (x0i.areEqual(EGL14.eglGetCurrentContext(), EGL14.EGL_NO_CONTEXT)) {
            try {
                EGLDisplay eGLDisplayCreateEglDisplay = createEglDisplay();
                EGLContext eGLContextCreateEglContext = createEglContext(eGLDisplayCreateEglDisplay);
                focusPlaceholderEglSurface(eGLContextCreateEglContext, eGLDisplayCreateEglDisplay);
                strGlGetString = GLES20.glGetString(7939);
                destroyEglContext(eGLDisplayCreateEglDisplay, eGLContextCreateEglContext);
            } catch (C15503b unused) {
                return false;
            }
        } else {
            strGlGetString = GLES20.glGetString(7939);
        }
        return strGlGetString != null && strGlGetString.contains("GL_EXT_YUV_target");
    }

    public static void setToIdentity(float[] fArr) {
        Matrix.setIdentityM(fArr, 0);
    }

    private static FloatBuffer createBuffer(int i) {
        return ByteBuffer.allocateDirect(i * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
    }

    @c5e(17)
    public static EGLContext createEglContext(EGLContext eGLContext, EGLDisplay eGLDisplay, @h78(from = 2, m12174to = 3) int i, int[] iArr) throws C15503b {
        boolean z = true;
        u80.checkArgument(Arrays.equals(iArr, f100478c) || Arrays.equals(iArr, f100479d));
        if (i != 2 && i != 3) {
            z = false;
        }
        u80.checkArgument(z);
        return C15502a.createEglContext(eGLContext, eGLDisplay, i, iArr);
    }

    private static int createTexture(int i, int i2, int i3, int i4) throws C15503b {
        assertValidTextureSize(i, i2);
        int iGenerateTexture = generateTexture();
        bindTexture(3553, iGenerateTexture);
        GLES20.glTexImage2D(3553, 0, i3, i, i2, 0, 6408, i4, ByteBuffer.allocateDirect(i * i2 * 4));
        checkGlError();
        return iGenerateTexture;
    }
}
