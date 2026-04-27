package p000;

import android.graphics.Shader;
import p000.w82;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nBrush.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Brush.kt\nandroidx/compose/ui/graphics/ShaderBrush\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,670:1\n1#2:671\n*E\n"})
@vw7
public abstract class a8f extends he1 {

    /* JADX INFO: renamed from: c */
    @gib
    public Shader f624c;

    /* JADX INFO: renamed from: d */
    public long f625d;

    public a8f() {
        super(null);
        this.f625d = wpf.f95046b.m33077getUnspecifiedNHjbRc();
    }

    @Override // p000.he1
    /* JADX INFO: renamed from: applyTo-Pq9zytI, reason: not valid java name */
    public final void mo27217applyToPq9zytI(long j, @yfb icc iccVar, float f) {
        Shader shaderMo27218createShaderuvyYCjk = this.f624c;
        if (shaderMo27218createShaderuvyYCjk == null || !wpf.m33065equalsimpl0(this.f625d, j)) {
            if (wpf.m33071isEmptyimpl(j)) {
                shaderMo27218createShaderuvyYCjk = null;
                this.f624c = null;
                this.f625d = wpf.f95046b.m33077getUnspecifiedNHjbRc();
            } else {
                shaderMo27218createShaderuvyYCjk = mo27218createShaderuvyYCjk(j);
                this.f624c = shaderMo27218createShaderuvyYCjk;
                this.f625d = j;
            }
        }
        long jMo30193getColor0d7_KjU = iccVar.mo30193getColor0d7_KjU();
        w82.C14471a c14471a = w82.f93556b;
        if (!w82.m32952equalsimpl0(jMo30193getColor0d7_KjU, c14471a.m32977getBlack0d7_KjU())) {
            iccVar.mo30199setColor8_81llA(c14471a.m32977getBlack0d7_KjU());
        }
        if (!md8.areEqual(iccVar.getShader(), shaderMo27218createShaderuvyYCjk)) {
            iccVar.setShader(shaderMo27218createShaderuvyYCjk);
        }
        if (iccVar.getAlpha() == f) {
            return;
        }
        iccVar.setAlpha(f);
    }

    @yfb
    /* JADX INFO: renamed from: createShader-uvyYCjk, reason: not valid java name */
    public abstract Shader mo27218createShaderuvyYCjk(long j);
}
