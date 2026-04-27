package p000;

import android.view.View;
import java.util.Iterator;
import java.util.List;
import p000.smi;
import p000.xli;

/* JADX INFO: loaded from: classes5.dex */
public class s48 extends xli.AbstractC15190b {

    /* JADX INFO: renamed from: C */
    public final int[] f80631C;

    /* JADX INFO: renamed from: e */
    public final View f80632e;

    /* JADX INFO: renamed from: f */
    public int f80633f;

    /* JADX INFO: renamed from: m */
    public int f80634m;

    public s48(View view) {
        super(0);
        this.f80631C = new int[2];
        this.f80632e = view;
    }

    @Override // p000.xli.AbstractC15190b
    public void onEnd(@efb xli xliVar) {
        this.f80632e.setTranslationY(0.0f);
    }

    @Override // p000.xli.AbstractC15190b
    public void onPrepare(@efb xli xliVar) {
        this.f80632e.getLocationOnScreen(this.f80631C);
        this.f80633f = this.f80631C[1];
    }

    @Override // p000.xli.AbstractC15190b
    @efb
    public smi onProgress(@efb smi smiVar, @efb List<xli> list) {
        Iterator<xli> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if ((it.next().getTypeMask() & smi.C12678m.ime()) != 0) {
                this.f80632e.setTranslationY(C13280ty.lerp(this.f80634m, 0, r0.getInterpolatedFraction()));
                break;
            }
        }
        return smiVar;
    }

    @Override // p000.xli.AbstractC15190b
    @efb
    public xli.C15189a onStart(@efb xli xliVar, @efb xli.C15189a c15189a) {
        this.f80632e.getLocationOnScreen(this.f80631C);
        int i = this.f80633f - this.f80631C[1];
        this.f80634m = i;
        this.f80632e.setTranslationY(i);
        return c15189a;
    }
}
