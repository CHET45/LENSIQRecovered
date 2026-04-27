package p000;

import android.graphics.RenderEffect;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nAndroidRenderEffect.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidRenderEffect.android.kt\nandroidx/compose/ui/graphics/RenderEffect\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,169:1\n1#2:170\n*E\n"})
@vw7
public abstract class ozd {

    /* JADX INFO: renamed from: a */
    @gib
    public RenderEffect f69283a;

    public /* synthetic */ ozd(jt3 jt3Var) {
        this();
    }

    @c5e(31)
    @yfb
    /* JADX INFO: renamed from: a */
    public abstract RenderEffect mo16479a();

    @c5e(31)
    @yfb
    public final RenderEffect asAndroidRenderEffect() {
        RenderEffect renderEffect = this.f69283a;
        if (renderEffect != null) {
            return renderEffect;
        }
        RenderEffect renderEffectMo16479a = mo16479a();
        this.f69283a = renderEffectMo16479a;
        return renderEffectMo16479a;
    }

    public boolean isSupported() {
        return Build.VERSION.SDK_INT >= 31;
    }

    private ozd() {
    }
}
