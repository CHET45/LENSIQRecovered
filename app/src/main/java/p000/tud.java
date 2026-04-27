package p000;

import android.animation.TypeEvaluator;
import android.graphics.Rect;
import p000.p7e;

/* JADX INFO: loaded from: classes5.dex */
@p7e({p7e.EnumC10826a.f69935b})
public class tud implements TypeEvaluator<Rect> {

    /* JADX INFO: renamed from: a */
    public final Rect f86015a;

    public tud(@efb Rect rect) {
        this.f86015a = rect;
    }

    @Override // android.animation.TypeEvaluator
    public Rect evaluate(float f, @efb Rect rect, @efb Rect rect2) {
        this.f86015a.set(rect.left + ((int) ((rect2.left - r0) * f)), rect.top + ((int) ((rect2.top - r1) * f)), rect.right + ((int) ((rect2.right - r2) * f)), rect.bottom + ((int) ((rect2.bottom - r6) * f)));
        return this.f86015a;
    }
}
