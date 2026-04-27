package p000;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import p000.p7e;

/* JADX INFO: loaded from: classes3.dex */
public class mai {

    /* JADX INFO: renamed from: a */
    @yfb
    public final Map<String, cai> f60370a = new LinkedHashMap();

    public final void clear() {
        Iterator<cai> it = this.f60370a.values().iterator();
        while (it.hasNext()) {
            it.next().clear$lifecycle_viewmodel_release();
        }
        this.f60370a.clear();
    }

    @gib
    @p7e({p7e.EnumC10826a.f69935b})
    public final cai get(@yfb String str) {
        md8.checkNotNullParameter(str, "key");
        return this.f60370a.get(str);
    }

    @yfb
    @p7e({p7e.EnumC10826a.f69935b})
    public final Set<String> keys() {
        return new HashSet(this.f60370a.keySet());
    }

    @p7e({p7e.EnumC10826a.f69935b})
    public final void put(@yfb String str, @yfb cai caiVar) {
        md8.checkNotNullParameter(str, "key");
        md8.checkNotNullParameter(caiVar, "viewModel");
        cai caiVarPut = this.f60370a.put(str, caiVar);
        if (caiVarPut != null) {
            caiVarPut.clear$lifecycle_viewmodel_release();
        }
    }
}
