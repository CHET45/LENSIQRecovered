package p000;

import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import p000.x67;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public interface r67 {
    w67 createBuffersForTexture(int i, int i2, int i3) throws x67.C14938a;

    EGLContext createEglContext(EGLDisplay eGLDisplay, @h78(from = 2, m12174to = 3) int i, int[] iArr) throws x67.C14938a;

    EGLSurface createEglSurface(EGLDisplay eGLDisplay, Object obj, int i, boolean z) throws x67.C14938a;

    EGLSurface createFocusedPlaceholderEglSurface(EGLContext eGLContext, EGLDisplay eGLDisplay) throws x67.C14938a;

    void release(EGLDisplay eGLDisplay) throws x67.C14938a;
}
