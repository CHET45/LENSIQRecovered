package p000;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class gt3 implements an2 {
    @Override // p000.an2
    public yye create(List<? extends yye> list, List<List<Integer>> list2) {
        return new xm2(list, list2);
    }

    @Override // p000.an2
    @Deprecated
    public yye createCompositeSequenceableLoader(yye... yyeVarArr) {
        return new xm2(yyeVarArr);
    }

    @Override // p000.an2
    public yye empty() {
        return new xm2(kx7.m15110of(), kx7.m15110of());
    }
}
