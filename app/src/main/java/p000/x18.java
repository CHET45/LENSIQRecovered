package p000;

import androidx.lifecycle.C1137f0;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class x18 implements C1137f0.c {

    /* JADX INFO: renamed from: b */
    @yfb
    public final fai<?>[] f96023b;

    public x18(@yfb fai<?>... faiVarArr) {
        md8.checkNotNullParameter(faiVarArr, "initializers");
        this.f96023b = faiVarArr;
    }

    @Override // androidx.lifecycle.C1137f0.c
    @yfb
    public <VM extends cai> VM create(@yfb Class<VM> cls, @yfb k63 k63Var) {
        md8.checkNotNullParameter(cls, "modelClass");
        md8.checkNotNullParameter(k63Var, "extras");
        kai kaiVar = kai.f53482a;
        oo8<VM> kotlinClass = hn8.getKotlinClass(cls);
        fai<?>[] faiVarArr = this.f96023b;
        return (VM) kaiVar.createViewModelFromInitializers$lifecycle_viewmodel_release(kotlinClass, k63Var, (fai[]) Arrays.copyOf(faiVarArr, faiVarArr.length));
    }
}
