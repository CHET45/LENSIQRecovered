package p000;

import android.content.Context;
import android.widget.EdgeEffect;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nEdgeEffectCompat.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EdgeEffectCompat.android.kt\nandroidx/compose/foundation/GlowEdgeEffectCompat\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,157:1\n1#2:158\n148#3:159\n*S KotlinDebug\n*F\n+ 1 EdgeEffectCompat.android.kt\nandroidx/compose/foundation/GlowEdgeEffectCompat\n*L\n88#1:159\n*E\n"})
public final class w77 extends EdgeEffect {

    /* JADX INFO: renamed from: a */
    public final float f93464a;

    /* JADX INFO: renamed from: b */
    public float f93465b;

    public w77(@yfb Context context) {
        super(context);
        this.f93464a = C2030bs.Density(context).mo27173toPx0680j_4(kn4.m30705constructorimpl(1));
    }

    @Override // android.widget.EdgeEffect
    public void onAbsorb(int i) {
        this.f93465b = 0.0f;
        super.onAbsorb(i);
    }

    @Override // android.widget.EdgeEffect
    public void onPull(float f, float f2) {
        this.f93465b = 0.0f;
        super.onPull(f, f2);
    }

    @Override // android.widget.EdgeEffect
    public void onRelease() {
        this.f93465b = 0.0f;
        super.onRelease();
    }

    public final void releaseWithOppositeDelta(float f) {
        float f2 = this.f93465b + f;
        this.f93465b = f2;
        if (Math.abs(f2) > this.f93464a) {
            onRelease();
        }
    }

    @Override // android.widget.EdgeEffect
    public void onPull(float f) {
        this.f93465b = 0.0f;
        super.onPull(f);
    }
}
