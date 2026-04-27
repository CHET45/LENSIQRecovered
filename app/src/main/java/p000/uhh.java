package p000;

import androidx.compose.foundation.lazy.layout.C0661c;
import androidx.compose.p002ui.InterfaceC0701e;

/* JADX INFO: loaded from: classes.dex */
@ah5
public final class uhh extends InterfaceC0701e.d implements shh {

    /* JADX INFO: renamed from: X */
    @yfb
    public i09 f88025X;

    /* JADX INFO: renamed from: Y */
    @yfb
    public final String f88026Y = C0661c.f4908a;

    public uhh(@yfb i09 i09Var) {
        this.f88025X = i09Var;
    }

    @yfb
    public final i09 getPrefetchState() {
        return this.f88025X;
    }

    public final void setPrefetchState(@yfb i09 i09Var) {
        this.f88025X = i09Var;
    }

    @Override // p000.shh
    @yfb
    public String getTraverseKey() {
        return this.f88026Y;
    }
}
