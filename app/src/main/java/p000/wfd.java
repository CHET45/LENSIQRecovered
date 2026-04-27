package p000;

import android.opengl.GLES20;
import android.util.Log;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import p000.sfd;
import p000.x67;

/* JADX INFO: loaded from: classes3.dex */
public final class wfd {

    /* JADX INFO: renamed from: j */
    public static final String f94097j = "ProjectionRenderer";

    /* JADX INFO: renamed from: k */
    public static final String f94098k = "uniform mat4 uMvpMatrix;\nuniform mat3 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec2 aTexCoords;\nvarying vec2 vTexCoords;\n// Standard transformation.\nvoid main() {\n  gl_Position = uMvpMatrix * aPosition;\n  vTexCoords = (uTexMatrix * vec3(aTexCoords, 1)).xy;\n}\n";

    /* JADX INFO: renamed from: l */
    public static final String f94099l = "// This is required since the texture data is GL_TEXTURE_EXTERNAL_OES.\n#extension GL_OES_EGL_image_external : require\nprecision mediump float;\n// Standard texture rendering shader.\nuniform samplerExternalOES uTexture;\nvarying vec2 vTexCoords;\nvoid main() {\n  gl_FragColor = texture2D(uTexture, vTexCoords);\n}\n";

    /* JADX INFO: renamed from: m */
    public static final float[] f94100m = {1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* JADX INFO: renamed from: n */
    public static final float[] f94101n = {1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.5f, 1.0f};

    /* JADX INFO: renamed from: o */
    public static final float[] f94102o = {1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* JADX INFO: renamed from: p */
    public static final float[] f94103p = {0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* JADX INFO: renamed from: q */
    public static final float[] f94104q = {0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.5f, 1.0f, 1.0f};

    /* JADX INFO: renamed from: a */
    public int f94105a;

    /* JADX INFO: renamed from: b */
    @hib
    public C14572a f94106b;

    /* JADX INFO: renamed from: c */
    @hib
    public C14572a f94107c;

    /* JADX INFO: renamed from: d */
    public s67 f94108d;

    /* JADX INFO: renamed from: e */
    public int f94109e;

    /* JADX INFO: renamed from: f */
    public int f94110f;

    /* JADX INFO: renamed from: g */
    public int f94111g;

    /* JADX INFO: renamed from: h */
    public int f94112h;

    /* JADX INFO: renamed from: i */
    public int f94113i;

    /* JADX INFO: renamed from: wfd$a */
    public static class C14572a {

        /* JADX INFO: renamed from: a */
        public final int f94114a;

        /* JADX INFO: renamed from: b */
        public final FloatBuffer f94115b;

        /* JADX INFO: renamed from: c */
        public final FloatBuffer f94116c;

        /* JADX INFO: renamed from: d */
        public final int f94117d;

        public C14572a(sfd.C12558c c12558c) {
            this.f94114a = c12558c.getVertexCount();
            this.f94115b = x67.createBuffer(c12558c.f81673c);
            this.f94116c = x67.createBuffer(c12558c.f81674d);
            int i = c12558c.f81672b;
            if (i == 1) {
                this.f94117d = 5;
            } else if (i != 2) {
                this.f94117d = 4;
            } else {
                this.f94117d = 6;
            }
        }
    }

    public static boolean isSupported(sfd sfdVar) {
        sfd.C12557b c12557b = sfdVar.f81665a;
        sfd.C12557b c12557b2 = sfdVar.f81666b;
        return c12557b.getSubMeshCount() == 1 && c12557b.getSubMesh(0).f81671a == 0 && c12557b2.getSubMeshCount() == 1 && c12557b2.getSubMesh(0).f81671a == 0;
    }

    public void draw(int i, float[] fArr, boolean z) {
        C14572a c14572a = z ? this.f94107c : this.f94106b;
        if (c14572a == null) {
            return;
        }
        int i2 = this.f94105a;
        GLES20.glUniformMatrix3fv(this.f94110f, 1, false, i2 == 1 ? z ? f94102o : f94101n : i2 == 2 ? z ? f94104q : f94103p : f94100m, 0);
        GLES20.glUniformMatrix4fv(this.f94109e, 1, false, fArr, 0);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, i);
        GLES20.glUniform1i(this.f94113i, 0);
        try {
            x67.checkGlError();
        } catch (x67.C14938a e) {
            Log.e("ProjectionRenderer", "Failed to bind uniforms", e);
        }
        GLES20.glVertexAttribPointer(this.f94111g, 3, 5126, false, 12, (Buffer) c14572a.f94115b);
        try {
            x67.checkGlError();
        } catch (x67.C14938a e2) {
            Log.e("ProjectionRenderer", "Failed to load position data", e2);
        }
        GLES20.glVertexAttribPointer(this.f94112h, 2, 5126, false, 8, (Buffer) c14572a.f94116c);
        try {
            x67.checkGlError();
        } catch (x67.C14938a e3) {
            Log.e("ProjectionRenderer", "Failed to load texture data", e3);
        }
        GLES20.glDrawArrays(c14572a.f94117d, 0, c14572a.f94114a);
        try {
            x67.checkGlError();
        } catch (x67.C14938a e4) {
            Log.e("ProjectionRenderer", "Failed to render", e4);
        }
    }

    public void init() {
        try {
            s67 s67Var = new s67("uniform mat4 uMvpMatrix;\nuniform mat3 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec2 aTexCoords;\nvarying vec2 vTexCoords;\n// Standard transformation.\nvoid main() {\n  gl_Position = uMvpMatrix * aPosition;\n  vTexCoords = (uTexMatrix * vec3(aTexCoords, 1)).xy;\n}\n", "// This is required since the texture data is GL_TEXTURE_EXTERNAL_OES.\n#extension GL_OES_EGL_image_external : require\nprecision mediump float;\n// Standard texture rendering shader.\nuniform samplerExternalOES uTexture;\nvarying vec2 vTexCoords;\nvoid main() {\n  gl_FragColor = texture2D(uTexture, vTexCoords);\n}\n");
            this.f94108d = s67Var;
            this.f94109e = s67Var.getUniformLocation("uMvpMatrix");
            this.f94110f = this.f94108d.getUniformLocation("uTexMatrix");
            this.f94111g = this.f94108d.getAttributeArrayLocationAndEnable("aPosition");
            this.f94112h = this.f94108d.getAttributeArrayLocationAndEnable("aTexCoords");
            this.f94113i = this.f94108d.getUniformLocation("uTexture");
        } catch (x67.C14938a e) {
            Log.e("ProjectionRenderer", "Failed to initialize the program", e);
        }
    }

    public void setProjection(sfd sfdVar) {
        if (isSupported(sfdVar)) {
            this.f94105a = sfdVar.f81667c;
            C14572a c14572a = new C14572a(sfdVar.f81665a.getSubMesh(0));
            this.f94106b = c14572a;
            if (!sfdVar.f81668d) {
                c14572a = new C14572a(sfdVar.f81666b.getSubMesh(0));
            }
            this.f94107c = c14572a;
        }
    }

    public void shutdown() {
        s67 s67Var = this.f94108d;
        if (s67Var != null) {
            try {
                s67Var.delete();
            } catch (x67.C14938a e) {
                Log.e("ProjectionRenderer", "Failed to delete the shader program", e);
            }
        }
    }
}
