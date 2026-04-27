package p000;

import android.graphics.Shader;

/* JADX INFO: loaded from: classes.dex */
public final class ie1 {

    /* JADX INFO: renamed from: ie1$a */
    public static final class C7248a extends a8f {

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ Shader f46586e;

        public C7248a(Shader shader) {
            this.f46586e = shader;
        }

        @Override // p000.a8f
        @yfb
        /* JADX INFO: renamed from: createShader-uvyYCjk */
        public Shader mo27218createShaderuvyYCjk(long j) {
            return this.f46586e;
        }
    }

    @yfb
    public static final a8f ShaderBrush(@yfb Shader shader) {
        return new C7248a(shader);
    }
}
