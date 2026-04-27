package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.GLES30;
import android.opengl.GLU;
import android.opengl.GLUtils;
import android.opengl.Matrix;
import android.os.Build;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p000.p7e;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class x67 {

    /* JADX INFO: renamed from: a */
    public static final int f96865a = 4;

    /* JADX INFO: renamed from: b */
    @p7e({p7e.EnumC10826a.f69935b})
    public static final int f96866b = 4096;

    /* JADX INFO: renamed from: c */
    public static final float f96867c = 2.0f;

    /* JADX INFO: renamed from: f */
    public static final long f96870f = 0;

    /* JADX INFO: renamed from: g */
    public static final String f96871g = "EGL_EXT_protected_content";

    /* JADX INFO: renamed from: h */
    public static final String f96872h = "EGL_KHR_surfaceless_context";

    /* JADX INFO: renamed from: i */
    public static final String f96873i = "GL_EXT_YUV_target";

    /* JADX INFO: renamed from: j */
    public static final String f96874j = "EGL_EXT_gl_colorspace_bt2020_pq";

    /* JADX INFO: renamed from: k */
    public static final String f96875k = "EGL_EXT_gl_colorspace_bt2020_hlg";

    /* JADX INFO: renamed from: l */
    public static final int f96876l = 12445;

    /* JADX INFO: renamed from: m */
    public static final int f96877m = 13120;

    /* JADX INFO: renamed from: d */
    public static final int[] f96868d = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12344};

    /* JADX INFO: renamed from: e */
    public static final int[] f96869e = {12352, 4, 12324, 10, 12323, 10, 12322, 10, 12321, 2, 12325, 0, 12326, 0, 12344};

    /* JADX INFO: renamed from: n */
    public static final int[] f96878n = {12445, 13120, 12344, 12344};

    /* JADX INFO: renamed from: o */
    public static final int f96879o = 13632;

    /* JADX INFO: renamed from: p */
    public static final int[] f96880p = {12445, f96879o, 12344, 12344};

    /* JADX INFO: renamed from: q */
    public static final int[] f96881q = {12344};

    /* JADX INFO: renamed from: x67$a */
    public static final class C14938a extends Exception {
        public C14938a(String str) {
            super(str);
        }
    }

    private x67() {
    }

    private static void assertValidTextureSize(int i, int i2) throws C14938a {
        int[] iArr = new int[1];
        GLES20.glGetIntegerv(3379, iArr, 0);
        int i3 = iArr[0];
        v80.checkState(i3 > 0, "Create a OpenGL context first or run the GL methods on an OpenGL thread.");
        if (i < 0 || i2 < 0) {
            throw new C14938a("width or height is less than 0");
        }
        if (i > i3 || i2 > i3) {
            throw new C14938a("width or height is greater than GL_MAX_TEXTURE_SIZE " + i3);
        }
    }

    public static void awaitSyncObject(long j) throws C14938a {
        if (j == 0) {
            GLES20.glFinish();
        } else {
            GLES30.glWaitSync(j, 0, -1L);
            checkGlError();
        }
    }

    public static void bindTexture(int i, int i2, int i3) throws C14938a {
        GLES20.glBindTexture(i, i2);
        checkGlError();
        GLES20.glTexParameteri(i, 10240, i3);
        checkGlError();
        GLES20.glTexParameteri(i, 10241, i3);
        checkGlError();
        GLES20.glTexParameteri(i, 10242, 33071);
        checkGlError();
        GLES20.glTexParameteri(i, 10243, 33071);
        checkGlError();
    }

    public static void blitFrameBuffer(int i, u67 u67Var, int i2, u67 u67Var2) throws C14938a {
        int[] iArr = new int[1];
        GLES20.glGetIntegerv(36006, iArr, 0);
        checkGlError();
        GLES20.glBindFramebuffer(36008, i);
        checkGlError();
        GLES20.glBindFramebuffer(36009, i2);
        checkGlError();
        GLES30.glBlitFramebuffer(u67Var.f86876a, u67Var.f86877b, u67Var.f86878c, u67Var.f86879d, u67Var2.f86876a, u67Var2.f86877b, u67Var2.f86878c, u67Var2.f86879d, 16384, jk1.f50790I3);
        checkGlError();
        GLES20.glBindFramebuffer(36160, iArr[0]);
        checkGlError();
    }

    private static void checkEglException(String str) throws C14938a {
        int iEglGetError = EGL14.eglGetError();
        if (iEglGetError == 12288) {
            return;
        }
        throw new C14938a(str + ", error code: 0x" + Integer.toHexString(iEglGetError));
    }

    public static void checkGlError() throws C14938a {
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
            String strGluErrorString = GLU.gluErrorString(iGlGetError);
            if (strGluErrorString == null) {
                strGluErrorString = "error code: 0x" + Integer.toHexString(iGlGetError);
            }
            sb.append("glError: ");
            sb.append(strGluErrorString);
            z = true;
        }
        if (z) {
            throw new C14938a(sb.toString());
        }
    }

    public static void checkGlException(boolean z, String str) throws C14938a {
        if (!z) {
            throw new C14938a(str);
        }
    }

    public static void clearFocusedBuffers() throws C14938a {
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

    public static EGLContext createEglContext(EGLDisplay eGLDisplay) throws C14938a {
        return createEglContext(EGL14.EGL_NO_CONTEXT, eGLDisplay, 2, f96868d);
    }

    public static EGLSurface createEglSurface(EGLDisplay eGLDisplay, Object obj, int i, boolean z) throws C14938a {
        int[] iArr;
        int[] iArr2;
        if (i == 3 || i == 10) {
            iArr = f96868d;
            iArr2 = f96881q;
        } else {
            if (i != 7 && i != 6) {
                throw new IllegalArgumentException("Unsupported color transfer: " + i);
            }
            iArr = f96869e;
            if (z) {
                iArr2 = f96881q;
            } else if (i == 6) {
                if (!isBt2020PqExtensionSupported()) {
                    throw new C14938a("BT.2020 PQ OpenGL output isn't supported.");
                }
                iArr2 = f96878n;
            } else {
                if (!isBt2020HlgExtensionSupported()) {
                    throw new C14938a("BT.2020 HLG OpenGL output isn't supported.");
                }
                iArr2 = f96880p;
            }
        }
        EGLSurface eGLSurfaceEglCreateWindowSurface = EGL14.eglCreateWindowSurface(eGLDisplay, getEglConfig(eGLDisplay, iArr), obj, iArr2, 0);
        checkEglException("Error creating a new EGL surface");
        return eGLSurfaceEglCreateWindowSurface;
    }

    public static int createExternalTexture() throws C14938a {
        int iGenerateTexture = generateTexture();
        bindTexture(36197, iGenerateTexture, jk1.f50790I3);
        return iGenerateTexture;
    }

    public static int createFboForTexture(int i) throws C14938a {
        int[] iArr = new int[1];
        GLES20.glGenFramebuffers(1, iArr, 0);
        checkGlError();
        GLES20.glBindFramebuffer(36160, iArr[0]);
        checkGlError();
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, i, 0);
        checkGlError();
        return iArr[0];
    }

    public static EGLSurface createFocusedPlaceholderEglSurface(EGLContext eGLContext, EGLDisplay eGLDisplay) throws C14938a {
        EGLSurface eGLSurfaceCreatePbufferSurface = isSurfacelessContextExtensionSupported() ? EGL14.EGL_NO_SURFACE : createPbufferSurface(eGLDisplay, 1, 1, f96868d);
        focusEglSurface(eGLDisplay, eGLContext, eGLSurfaceCreatePbufferSurface, 1, 1);
        return eGLSurfaceCreatePbufferSurface;
    }

    public static long createGlSyncFence() throws C14938a {
        if (getContextMajorVersion() < 3) {
            return 0L;
        }
        long jGlFenceSync = GLES30.glFenceSync(37143, 0);
        checkGlError();
        GLES20.glFlush();
        checkGlError();
        return jGlFenceSync;
    }

    private static EGLSurface createPbufferSurface(EGLDisplay eGLDisplay, int i, int i2, int[] iArr) throws C14938a {
        EGLSurface eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, getEglConfig(eGLDisplay, iArr), new int[]{12375, i, 12374, i2, 12344}, 0);
        checkEglException("Error creating a new EGL Pbuffer surface");
        return eGLSurfaceEglCreatePbufferSurface;
    }

    public static int createPixelBufferObject(int i) throws C14938a {
        int[] iArr = new int[1];
        GLES20.glGenBuffers(1, iArr, 0);
        checkGlError();
        GLES20.glBindBuffer(35051, iArr[0]);
        checkGlError();
        GLES20.glBufferData(35051, i, null, 35049);
        checkGlError();
        GLES20.glBindBuffer(35051, 0);
        checkGlError();
        return iArr[0];
    }

    public static int createRgb10A2Texture(int i, int i2) throws C14938a {
        return createTextureUninitialized(i, i2, 32857, 33640);
    }

    public static int createTexture(Bitmap bitmap) throws C14938a {
        int iGenerateTexture = generateTexture();
        setTexture(iGenerateTexture, bitmap);
        return iGenerateTexture;
    }

    private static int createTextureUninitialized(int i, int i2, int i3, int i4) throws C14938a {
        assertValidTextureSize(i, i2);
        int iGenerateTexture = generateTexture();
        bindTexture(3553, iGenerateTexture, jk1.f50790I3);
        GLES20.glTexImage2D(3553, 0, i3, i, i2, 0, 6408, i4, null);
        checkGlError();
        return iGenerateTexture;
    }

    public static float[] createVertexBuffer(List<float[]> list) {
        float[] fArr = new float[list.size() * 4];
        for (int i = 0; i < list.size(); i++) {
            System.arraycopy(list.get(i), 0, fArr, i * 4, 4);
        }
        return fArr;
    }

    public static void deleteBuffer(int i) throws C14938a {
        GLES20.glDeleteBuffers(1, new int[]{i}, 0);
        checkGlError();
    }

    public static void deleteFbo(int i) throws C14938a {
        GLES20.glDeleteFramebuffers(1, new int[]{i}, 0);
        checkGlError();
    }

    public static void deleteRbo(int i) throws C14938a {
        GLES20.glDeleteRenderbuffers(1, new int[]{i}, 0);
        checkGlError();
    }

    public static void deleteSyncObject(long j) throws C14938a {
        deleteSyncObjectQuietly(j);
        checkGlError();
    }

    public static void deleteSyncObjectQuietly(long j) {
        GLES30.glDeleteSync(j);
    }

    public static void deleteTexture(int i) throws C14938a {
        GLES20.glDeleteTextures(1, new int[]{i}, 0);
        checkGlError();
    }

    public static void destroyEglContext(@hib EGLDisplay eGLDisplay, @hib EGLContext eGLContext) throws C14938a {
        if (eGLDisplay == null || eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
            return;
        }
        EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
        EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
        checkEglException("Error releasing context");
        if (eGLContext != null && !eGLContext.equals(EGL14.EGL_NO_CONTEXT)) {
            EGL14.eglDestroyContext(eGLDisplay, eGLContext);
            checkEglException("Error destroying context");
        }
        EGL14.eglReleaseThread();
        checkEglException("Error releasing thread");
        EGL14.eglTerminate(eGLDisplay);
        checkEglException("Error terminating display");
    }

    public static void destroyEglSurface(@hib EGLDisplay eGLDisplay, @hib EGLSurface eGLSurface) throws C14938a {
        if (eGLDisplay == null || eGLDisplay.equals(EGL14.EGL_NO_DISPLAY) || eGLSurface == null || eGLSurface.equals(EGL14.EGL_NO_SURFACE)) {
            return;
        }
        EGL14.eglDestroySurface(eGLDisplay, eGLSurface);
        checkEglException("Error destroying surface");
    }

    public static void focusEglSurface(EGLDisplay eGLDisplay, EGLContext eGLContext, EGLSurface eGLSurface, int i, int i2) throws C14938a {
        focusRenderTarget(eGLDisplay, eGLContext, eGLSurface, 0, i, i2);
    }

    public static void focusFramebuffer(EGLDisplay eGLDisplay, EGLContext eGLContext, EGLSurface eGLSurface, int i, int i2, int i3) throws C14938a {
        focusRenderTarget(eGLDisplay, eGLContext, eGLSurface, i, i2, i3);
    }

    public static void focusFramebufferUsingCurrentContext(int i, int i2, int i3) throws C14938a {
        int[] iArr = new int[1];
        GLES20.glGetIntegerv(36006, iArr, 0);
        if (iArr[0] != i) {
            GLES20.glBindFramebuffer(36160, i);
        }
        checkGlError();
        GLES20.glViewport(0, 0, i2, i3);
        checkGlError();
    }

    private static void focusRenderTarget(EGLDisplay eGLDisplay, EGLContext eGLContext, EGLSurface eGLSurface, int i, int i2, int i3) throws C14938a {
        EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, eGLContext);
        checkEglException("Error making context current");
        focusFramebufferUsingCurrentContext(i, i2, i3);
    }

    public static int generateTexture() throws C14938a {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        checkGlError();
        return iArr[0];
    }

    public static long getContextMajorVersion() throws C14938a {
        EGL14.eglQueryContext(EGL14.eglGetDisplay(0), EGL14.eglGetCurrentContext(), 12440, new int[1], 0);
        checkGlError();
        return r0[0];
    }

    public static EGLContext getCurrentContext() {
        return EGL14.eglGetCurrentContext();
    }

    public static EGLDisplay getDefaultEglDisplay() throws C14938a {
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        checkGlException(!eGLDisplayEglGetDisplay.equals(EGL14.EGL_NO_DISPLAY), "No EGL display.");
        checkGlException(EGL14.eglInitialize(eGLDisplayEglGetDisplay, new int[1], 0, new int[1], 0), "Error in eglInitialize.");
        checkGlError();
        return eGLDisplayEglGetDisplay;
    }

    private static EGLConfig getEglConfig(EGLDisplay eGLDisplay, int[] iArr) throws C14938a {
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        if (EGL14.eglChooseConfig(eGLDisplay, iArr, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
            return eGLConfigArr[0];
        }
        throw new C14938a("eglChooseConfig failed.");
    }

    public static float[] getNormalizedCoordinateBounds() {
        return new float[]{-1.0f, -1.0f, 0.0f, 1.0f, 1.0f, -1.0f, 0.0f, 1.0f, -1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f};
    }

    public static float[] getTextureCoordinateBounds() {
        return new float[]{0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 1.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f};
    }

    public static boolean isBt2020HlgExtensionSupported() throws C14938a {
        return isExtensionSupported(f96875k);
    }

    public static boolean isBt2020PqExtensionSupported() throws C14938a {
        return Build.VERSION.SDK_INT >= 33 && isExtensionSupported("EGL_EXT_gl_colorspace_bt2020_pq");
    }

    public static boolean isColorTransferSupported(int i) throws C14938a {
        if (i == 6) {
            return isBt2020PqExtensionSupported();
        }
        if (i == 7) {
            return isBt2020HlgExtensionSupported();
        }
        return true;
    }

    private static boolean isExtensionSupported(String str) throws C14938a {
        String strEglQueryString = EGL14.eglQueryString(getDefaultEglDisplay(), 12373);
        return strEglQueryString != null && strEglQueryString.contains(str);
    }

    public static boolean isProtectedContentExtensionSupported(Context context) throws C14938a {
        return isExtensionSupported("EGL_EXT_protected_content");
    }

    public static boolean isSurfacelessContextExtensionSupported() throws C14938a {
        return isExtensionSupported("EGL_KHR_surfaceless_context");
    }

    public static boolean isYuvTargetExtensionSupported() {
        String strGlGetString;
        if (Objects.equals(EGL14.eglGetCurrentContext(), EGL14.EGL_NO_CONTEXT)) {
            try {
                EGLDisplay defaultEglDisplay = getDefaultEglDisplay();
                EGLContext eGLContextCreateEglContext = createEglContext(defaultEglDisplay);
                createFocusedPlaceholderEglSurface(eGLContextCreateEglContext, defaultEglDisplay);
                strGlGetString = GLES20.glGetString(7939);
                destroyEglContext(defaultEglDisplay, eGLContextCreateEglContext);
            } catch (C14938a unused) {
                return false;
            }
        } else {
            strGlGetString = GLES20.glGetString(7939);
        }
        return strGlGetString != null && strGlGetString.contains("GL_EXT_YUV_target");
    }

    @c5e(24)
    public static ByteBuffer mapPixelBufferObject(int i, int i2) throws C14938a {
        GLES20.glBindBuffer(35051, i);
        checkGlError();
        ByteBuffer byteBuffer = (ByteBuffer) GLES30.glMapBufferRange(35051, 0, i2, 1);
        checkGlError();
        GLES20.glBindBuffer(35051, 0);
        checkGlError();
        return byteBuffer;
    }

    @c5e(24)
    public static void schedulePixelBufferRead(int i, int i2, int i3, int i4) throws C14938a {
        focusFramebufferUsingCurrentContext(i, i2, i3);
        GLES20.glBindBuffer(35051, i4);
        checkGlError();
        GLES30.glReadBuffer(36064);
        GLES30.glReadPixels(0, 0, i2, i3, 6408, 5121, 0);
        checkGlError();
        GLES20.glBindBuffer(35051, 0);
        checkGlError();
    }

    public static void setTexture(int i, Bitmap bitmap) throws C14938a {
        assertValidTextureSize(bitmap.getWidth(), bitmap.getHeight());
        bindTexture(3553, i, jk1.f50790I3);
        GLUtils.texImage2D(3553, 0, bitmap, 0);
        checkGlError();
    }

    public static void setToIdentity(float[] fArr) {
        Matrix.setIdentityM(fArr, 0);
    }

    @c5e(24)
    public static void unmapPixelBufferObject(int i) throws C14938a {
        GLES20.glBindBuffer(35051, i);
        checkGlError();
        GLES30.glUnmapBuffer(35051);
        checkGlError();
        GLES20.glBindBuffer(35051, 0);
        checkGlError();
    }

    private static FloatBuffer createBuffer(int i) {
        return ByteBuffer.allocateDirect(i * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
    }

    public static EGLContext createEglContext(EGLContext eGLContext, EGLDisplay eGLDisplay, @h78(from = 2, m12174to = 3) int i, int[] iArr) throws C14938a {
        boolean z = true;
        v80.checkArgument(Arrays.equals(iArr, f96868d) || Arrays.equals(iArr, f96869e));
        if (i != 2 && i != 3) {
            z = false;
        }
        v80.checkArgument(z);
        EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(eGLDisplay, getEglConfig(eGLDisplay, iArr), eGLContext, new int[]{12440, i, 12344}, 0);
        if (eGLContextEglCreateContext != null && !eGLContextEglCreateContext.equals(EGL14.EGL_NO_CONTEXT)) {
            checkGlError();
            return eGLContextEglCreateContext;
        }
        EGL14.eglTerminate(eGLDisplay);
        throw new C14938a("eglCreateContext() failed to create a valid context. The device may not support EGL version " + i);
    }

    public static int createTexture(int i, int i2, boolean z) throws C14938a {
        if (z) {
            return createTextureUninitialized(i, i2, 34842, 5131);
        }
        return createTextureUninitialized(i, i2, 6408, 5121);
    }
}
