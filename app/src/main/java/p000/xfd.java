package p000;

import android.opengl.GLES20;
import android.util.Log;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import p000.tfd;
import p000.y67;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class xfd {

    /* JADX INFO: renamed from: j */
    public static final String f97640j = "ProjectionRenderer";

    /* JADX INFO: renamed from: k */
    public static final String f97641k = "uniform mat4 uMvpMatrix;\nuniform mat3 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec2 aTexCoords;\nvarying vec2 vTexCoords;\n// Standard transformation.\nvoid main() {\n  gl_Position = uMvpMatrix * aPosition;\n  vTexCoords = (uTexMatrix * vec3(aTexCoords, 1)).xy;\n}\n";

    /* JADX INFO: renamed from: l */
    public static final String f97642l = "// This is required since the texture data is GL_TEXTURE_EXTERNAL_OES.\n#extension GL_OES_EGL_image_external : require\nprecision mediump float;\n// Standard texture rendering shader.\nuniform samplerExternalOES uTexture;\nvarying vec2 vTexCoords;\nvoid main() {\n  gl_FragColor = texture2D(uTexture, vTexCoords);\n}\n";

    /* JADX INFO: renamed from: m */
    public static final float[] f97643m = {1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* JADX INFO: renamed from: n */
    public static final float[] f97644n = {1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.5f, 1.0f};

    /* JADX INFO: renamed from: o */
    public static final float[] f97645o = {1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* JADX INFO: renamed from: p */
    public static final float[] f97646p = {0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* JADX INFO: renamed from: q */
    public static final float[] f97647q = {0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.5f, 1.0f, 1.0f};

    /* JADX INFO: renamed from: a */
    public int f97648a;

    /* JADX INFO: renamed from: b */
    @hib
    public C15045a f97649b;

    /* JADX INFO: renamed from: c */
    @hib
    public C15045a f97650c;

    /* JADX INFO: renamed from: d */
    public t67 f97651d;

    /* JADX INFO: renamed from: e */
    public int f97652e;

    /* JADX INFO: renamed from: f */
    public int f97653f;

    /* JADX INFO: renamed from: g */
    public int f97654g;

    /* JADX INFO: renamed from: h */
    public int f97655h;

    /* JADX INFO: renamed from: i */
    public int f97656i;

    /* JADX INFO: renamed from: xfd$a */
    public static class C15045a {

        /* JADX INFO: renamed from: a */
        public final int f97657a;

        /* JADX INFO: renamed from: b */
        public final FloatBuffer f97658b;

        /* JADX INFO: renamed from: c */
        public final FloatBuffer f97659c;

        /* JADX INFO: renamed from: d */
        public final int f97660d;

        public C15045a(tfd.C13015c c13015c) {
            this.f97657a = c13015c.getVertexCount();
            this.f97658b = y67.createBuffer(c13015c.f84545c);
            this.f97659c = y67.createBuffer(c13015c.f84546d);
            int i = c13015c.f84544b;
            if (i == 1) {
                this.f97660d = 5;
            } else if (i != 2) {
                this.f97660d = 4;
            } else {
                this.f97660d = 6;
            }
        }
    }

    public static boolean isSupported(tfd tfdVar) {
        tfd.C13014b c13014b = tfdVar.f84537a;
        tfd.C13014b c13014b2 = tfdVar.f84538b;
        return c13014b.getSubMeshCount() == 1 && c13014b.getSubMesh(0).f84543a == 0 && c13014b2.getSubMeshCount() == 1 && c13014b2.getSubMesh(0).f84543a == 0;
    }

    public void draw(int i, float[] fArr, boolean z) {
        C15045a c15045a = z ? this.f97650c : this.f97649b;
        if (c15045a == null) {
            return;
        }
        int i2 = this.f97648a;
        GLES20.glUniformMatrix3fv(this.f97653f, 1, false, i2 == 1 ? z ? f97645o : f97644n : i2 == 2 ? z ? f97647q : f97646p : f97643m, 0);
        GLES20.glUniformMatrix4fv(this.f97652e, 1, false, fArr, 0);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, i);
        GLES20.glUniform1i(this.f97656i, 0);
        try {
            y67.checkGlError();
        } catch (y67.C15503b e) {
            Log.e("ProjectionRenderer", "Failed to bind uniforms", e);
        }
        GLES20.glVertexAttribPointer(this.f97654g, 3, 5126, false, 12, (Buffer) c15045a.f97658b);
        try {
            y67.checkGlError();
        } catch (y67.C15503b e2) {
            Log.e("ProjectionRenderer", "Failed to load position data", e2);
        }
        GLES20.glVertexAttribPointer(this.f97655h, 2, 5126, false, 8, (Buffer) c15045a.f97659c);
        try {
            y67.checkGlError();
        } catch (y67.C15503b e3) {
            Log.e("ProjectionRenderer", "Failed to load texture data", e3);
        }
        GLES20.glDrawArrays(c15045a.f97660d, 0, c15045a.f97657a);
        try {
            y67.checkGlError();
        } catch (y67.C15503b e4) {
            Log.e("ProjectionRenderer", "Failed to render", e4);
        }
    }

    public void init() {
        try {
            t67 t67Var = new t67("uniform mat4 uMvpMatrix;\nuniform mat3 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec2 aTexCoords;\nvarying vec2 vTexCoords;\n// Standard transformation.\nvoid main() {\n  gl_Position = uMvpMatrix * aPosition;\n  vTexCoords = (uTexMatrix * vec3(aTexCoords, 1)).xy;\n}\n", "// This is required since the texture data is GL_TEXTURE_EXTERNAL_OES.\n#extension GL_OES_EGL_image_external : require\nprecision mediump float;\n// Standard texture rendering shader.\nuniform samplerExternalOES uTexture;\nvarying vec2 vTexCoords;\nvoid main() {\n  gl_FragColor = texture2D(uTexture, vTexCoords);\n}\n");
            this.f97651d = t67Var;
            this.f97652e = t67Var.getUniformLocation("uMvpMatrix");
            this.f97653f = this.f97651d.getUniformLocation("uTexMatrix");
            this.f97654g = this.f97651d.getAttributeArrayLocationAndEnable("aPosition");
            this.f97655h = this.f97651d.getAttributeArrayLocationAndEnable("aTexCoords");
            this.f97656i = this.f97651d.getUniformLocation("uTexture");
        } catch (y67.C15503b e) {
            Log.e("ProjectionRenderer", "Failed to initialize the program", e);
        }
    }

    public void setProjection(tfd tfdVar) {
        if (isSupported(tfdVar)) {
            this.f97648a = tfdVar.f84539c;
            C15045a c15045a = new C15045a(tfdVar.f84537a.getSubMesh(0));
            this.f97649b = c15045a;
            if (!tfdVar.f84540d) {
                c15045a = new C15045a(tfdVar.f84538b.getSubMesh(0));
            }
            this.f97650c = c15045a;
        }
    }

    public void shutdown() {
        t67 t67Var = this.f97651d;
        if (t67Var != null) {
            try {
                t67Var.delete();
            } catch (y67.C15503b e) {
                Log.e("ProjectionRenderer", "Failed to delete the shader program", e);
            }
        }
    }
}
