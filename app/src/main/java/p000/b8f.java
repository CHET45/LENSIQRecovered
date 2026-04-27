package p000;

import android.graphics.Shader;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nShaderBrushSpan.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShaderBrushSpan.android.kt\nandroidx/compose/ui/text/platform/style/ShaderBrushSpan\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,56:1\n81#2:57\n107#2,2:58\n*S KotlinDebug\n*F\n+ 1 ShaderBrushSpan.android.kt\nandroidx/compose/ui/text/platform/style/ShaderBrushSpan\n*L\n41#1:57\n41#1:58,2\n*E\n"})
@e0g(parameters = 1)
public final class b8f extends CharacterStyle implements UpdateAppearance {

    /* JADX INFO: renamed from: e */
    public static final int f12979e = 0;

    /* JADX INFO: renamed from: a */
    @yfb
    public final a8f f12980a;

    /* JADX INFO: renamed from: b */
    public final float f12981b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final z6b f12982c = xtf.mutableStateOf$default(wpf.m33057boximpl(wpf.f95046b.m33077getUnspecifiedNHjbRc()), null, 2, null);

    /* JADX INFO: renamed from: d */
    @yfb
    public final i2g<Shader> f12983d = stf.derivedStateOf(new C1781a());

    /* JADX INFO: renamed from: b8f$a */
    @dwf({"SMAP\nShaderBrushSpan.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShaderBrushSpan.android.kt\nandroidx/compose/ui/text/platform/style/ShaderBrushSpan$shaderState$1\n+ 2 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n*L\n1#1,56:1\n205#2:57\n*S KotlinDebug\n*F\n+ 1 ShaderBrushSpan.android.kt\nandroidx/compose/ui/text/platform/style/ShaderBrushSpan$shaderState$1\n*L\n44#1:57\n*E\n"})
    public static final class C1781a extends tt8 implements ny6<Shader> {
        public C1781a() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p000.ny6
        @gib
        public final Shader invoke() {
            if (b8f.this.m27962getSizeNHjbRc() == j28.f49422d || wpf.m33071isEmptyimpl(b8f.this.m27962getSizeNHjbRc())) {
                return null;
            }
            return b8f.this.getShaderBrush().mo27218createShaderuvyYCjk(b8f.this.m27962getSizeNHjbRc());
        }
    }

    public b8f(@yfb a8f a8fVar, float f) {
        this.f12980a = a8fVar;
        this.f12981b = f;
    }

    public final float getAlpha() {
        return this.f12981b;
    }

    @yfb
    public final a8f getShaderBrush() {
        return this.f12980a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: getSize-NH-jbRc, reason: not valid java name */
    public final long m27962getSizeNHjbRc() {
        return ((wpf) this.f12982c.getValue()).m33074unboximpl();
    }

    /* JADX INFO: renamed from: setSize-uvyYCjk, reason: not valid java name */
    public final void m27963setSizeuvyYCjk(long j) {
        this.f12982c.setValue(wpf.m33057boximpl(j));
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(@yfb TextPaint textPaint) {
        C10661ov.setAlpha(textPaint, this.f12981b);
        textPaint.setShader(this.f12983d.getValue());
    }
}
