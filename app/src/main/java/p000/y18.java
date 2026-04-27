package p000;

import androidx.lifecycle.C1137f0;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
@dai
public final class y18 {

    /* JADX INFO: renamed from: a */
    @yfb
    public final Map<oo8<?>, fai<?>> f100020a = new LinkedHashMap();

    public final <T extends cai> void addInitializer(@yfb oo8<T> oo8Var, @yfb qy6<? super k63, ? extends T> qy6Var) {
        md8.checkNotNullParameter(oo8Var, "clazz");
        md8.checkNotNullParameter(qy6Var, "initializer");
        if (!this.f100020a.containsKey(oo8Var)) {
            this.f100020a.put(oo8Var, new fai<>(oo8Var, qy6Var));
            return;
        }
        throw new IllegalArgumentException(("A `initializer` with the same `clazz` has already been added: " + lai.getCanonicalName(oo8Var) + a18.f100c).toString());
    }

    @yfb
    public final C1137f0.c build() {
        return kai.f53482a.createInitializerFactory$lifecycle_viewmodel_release(this.f100020a.values());
    }
}
