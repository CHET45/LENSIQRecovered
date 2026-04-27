package p000;

import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class wj2 implements zj2 {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$processRegistrar$0(String str, ej2 ej2Var, mj2 mj2Var) {
        try {
            nz5.pushTrace(str);
            return ej2Var.getFactory().create(mj2Var);
        } finally {
            nz5.popTrace();
        }
    }

    @Override // p000.zj2
    public List<ej2<?>> processRegistrar(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (final ej2<?> ej2VarWithFactory : componentRegistrar.getComponents()) {
            final String name = ej2VarWithFactory.getName();
            if (name != null) {
                ej2VarWithFactory = ej2VarWithFactory.withFactory(new tj2() { // from class: vj2
                    @Override // p000.tj2
                    public final Object create(mj2 mj2Var) {
                        return wj2.lambda$processRegistrar$0(name, ej2VarWithFactory, mj2Var);
                    }
                });
            }
            arrayList.add(ej2VarWithFactory);
        }
        return arrayList;
    }
}
