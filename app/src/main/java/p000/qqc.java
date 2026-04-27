package p000;

import p000.qrc;

/* JADX INFO: loaded from: classes.dex */
public interface qqc extends qrc<kn2<Object>, l2i<Object>>, qn2, ln2 {

    /* JADX INFO: renamed from: qqc$a */
    public interface InterfaceC11587a extends qrc.InterfaceC11636a<kn2<Object>, l2i<Object>> {
        @Override // 
        @yfb
        qqc build();
    }

    @Override // 
    @yfb
    InterfaceC11587a builder();

    @Override // p000.ln2
    default <T> T getCurrentValue(@yfb kn2<T> kn2Var) {
        return (T) rn2.read(this, kn2Var);
    }

    @yfb
    qqc putValue(@yfb kn2<Object> kn2Var, @yfb l2i<Object> l2iVar);
}
