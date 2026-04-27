package p000;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class y87 extends is8<w87> {

    /* JADX INFO: renamed from: i */
    public final w87 f100752i;

    public y87(List<hs8<w87>> list) {
        super(list);
        w87 w87Var = list.get(0).f44691b;
        int size = w87Var != null ? w87Var.getSize() : 0;
        this.f100752i = new w87(new float[size], new int[size]);
    }

    @Override // p000.nr0
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public w87 getValue(hs8<w87> hs8Var, float f) {
        this.f100752i.lerp(hs8Var.f44691b, hs8Var.f44692c, f);
        return this.f100752i;
    }
}
