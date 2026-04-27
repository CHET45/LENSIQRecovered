package p000;

import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import p000.y67;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public interface q67 {

    /* JADX INFO: renamed from: a */
    @Deprecated
    public static final q67 f73323a = new C11324a();

    /* JADX INFO: renamed from: q67$a */
    public class C11324a implements q67 {
        @Override // p000.q67
        public v67 createBuffersForTexture(int i, int i2, int i3) throws y67.C15503b {
            return new v67(i, y67.createFboForTexture(i), -1, i2, i3);
        }

        @Override // p000.q67
        @c5e(17)
        public EGLContext createEglContext(EGLDisplay eGLDisplay, int i, int[] iArr) throws y67.C15503b {
            return y67.createEglContext(EGL14.EGL_NO_CONTEXT, eGLDisplay, i, iArr);
        }

        @Override // p000.q67
        @c5e(17)
        public EGLSurface createEglSurface(EGLDisplay eGLDisplay, Object obj, int i, boolean z) throws y67.C15503b {
            return y67.createEglSurface(eGLDisplay, obj, i, z);
        }

        @Override // p000.q67
        @c5e(17)
        public EGLSurface createFocusedPlaceholderEglSurface(EGLContext eGLContext, EGLDisplay eGLDisplay, int[] iArr) throws y67.C15503b {
            return y67.createFocusedPlaceholderEglSurface(eGLContext, eGLDisplay, iArr);
        }
    }

    v67 createBuffersForTexture(int i, int i2, int i3) throws y67.C15503b;

    @c5e(17)
    EGLContext createEglContext(EGLDisplay eGLDisplay, @h78(from = 2, m12174to = 3) int i, int[] iArr) throws y67.C15503b;

    @c5e(17)
    EGLSurface createEglSurface(EGLDisplay eGLDisplay, Object obj, int i, boolean z) throws y67.C15503b;

    @c5e(17)
    EGLSurface createFocusedPlaceholderEglSurface(EGLContext eGLContext, EGLDisplay eGLDisplay, int[] iArr) throws y67.C15503b;
}
