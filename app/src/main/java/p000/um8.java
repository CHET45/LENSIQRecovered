package p000;

import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class um8 extends qm8 {

    /* JADX INFO: renamed from: n */
    @yfb
    public final am8 f88521n;

    /* JADX INFO: renamed from: o */
    @yfb
    public final List<String> f88522o;

    /* JADX INFO: renamed from: p */
    public final int f88523p;

    /* JADX INFO: renamed from: q */
    public int f88524q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public um8(@yfb bk8 bk8Var, @yfb am8 am8Var) {
        super(bk8Var, am8Var, null, null, 12, null);
        md8.checkNotNullParameter(bk8Var, "json");
        md8.checkNotNullParameter(am8Var, "value");
        this.f88521n = am8Var;
        List<String> list = v82.toList(getValue().keySet());
        this.f88522o = list;
        this.f88523p = list.size() * 2;
        this.f88524q = -1;
    }

    @Override // p000.qm8, p000.lm2
    public int decodeElementIndex(@yfb f0f f0fVar) {
        md8.checkNotNullParameter(f0fVar, "descriptor");
        int i = this.f88524q;
        if (i >= this.f88523p - 1) {
            return -1;
        }
        int i2 = i + 1;
        this.f88524q = i2;
        return i2;
    }

    @Override // p000.qm8, p000.AbstractC5049e2, p000.wlg, p000.lm2
    public void endStructure(@yfb f0f f0fVar) {
        md8.checkNotNullParameter(f0fVar, "descriptor");
    }

    @Override // p000.qm8, p000.g9b
    @yfb
    /* JADX INFO: renamed from: k */
    public String mo11444k(@yfb f0f f0fVar, int i) {
        md8.checkNotNullParameter(f0fVar, "descriptor");
        return this.f88522o.get(i / 2);
    }

    @Override // p000.qm8, p000.AbstractC5049e2
    @yfb
    /* JADX INFO: renamed from: o */
    public sk8 mo9628o(@yfb String str) {
        md8.checkNotNullParameter(str, "tag");
        return this.f88524q % 2 == 0 ? uk8.JsonPrimitive(str) : (sk8) xt9.getValue(getValue(), str);
    }

    @Override // p000.qm8, p000.AbstractC5049e2
    @yfb
    public am8 getValue() {
        return this.f88521n;
    }
}
