package p000;

import android.content.Context;

/* JADX INFO: loaded from: classes7.dex */
public class cd4 {

    /* JADX INFO: renamed from: a */
    public final float f16283a;

    public cd4(float f) {
        this.f16283a = f;
    }

    @efb
    public static cd4 create(@efb Context context) {
        return new cd4(context.getResources().getDisplayMetrics().density);
    }

    public int toPx(int i) {
        return (int) ((i * this.f16283a) + 0.5f);
    }

    @efb
    public static cd4 create(float f) {
        return new cd4(f);
    }
}
