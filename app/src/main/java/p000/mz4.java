package p000;

import java.util.Arrays;
import java.util.Collection;

/* JADX INFO: loaded from: classes7.dex */
public class mz4 extends fjf {
    @Override // p000.fjf
    @hib
    public Object getSpans(@efb mu9 mu9Var, @efb l1e l1eVar, @efb nm7 nm7Var) {
        qwf qwfVar = mu9Var.spansFactory().get(kz4.class);
        if (qwfVar == null) {
            return null;
        }
        return qwfVar.getSpans(mu9Var, l1eVar);
    }

    @Override // p000.fjf, p000.qlg
    @efb
    public Collection<String> supportedTags() {
        return Arrays.asList("i", yv7.f103134b, "cite", "dfn");
    }
}
