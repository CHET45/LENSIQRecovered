package p000;

import android.os.PersistableBundle;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nPersistableBundle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PersistableBundle.kt\nandroidx/core/os/PersistableBundleKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,155:1\n13579#2,2:156\n*S KotlinDebug\n*F\n+ 1 PersistableBundle.kt\nandroidx/core/os/PersistableBundleKt\n*L\n35#1:156,2\n*E\n"})
public final class fqc {
    @c5e(21)
    @yfb
    public static final PersistableBundle persistableBundleOf(@yfb scc<String, ? extends Object>... sccVarArr) {
        PersistableBundle persistableBundleCreatePersistableBundle = dqc.createPersistableBundle(sccVarArr.length);
        for (scc<String, ? extends Object> sccVar : sccVarArr) {
            dqc.putValue(persistableBundleCreatePersistableBundle, sccVar.component1(), sccVar.component2());
        }
        return persistableBundleCreatePersistableBundle;
    }

    @c5e(21)
    @yfb
    public static final PersistableBundle toPersistableBundle(@yfb Map<String, ? extends Object> map) {
        PersistableBundle persistableBundleCreatePersistableBundle = dqc.createPersistableBundle(map.size());
        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
            dqc.putValue(persistableBundleCreatePersistableBundle, entry.getKey(), entry.getValue());
        }
        return persistableBundleCreatePersistableBundle;
    }

    @c5e(21)
    @yfb
    public static final PersistableBundle persistableBundleOf() {
        return dqc.createPersistableBundle(0);
    }
}
