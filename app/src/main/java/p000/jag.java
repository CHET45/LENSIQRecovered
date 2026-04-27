package p000;

import java.util.Arrays;
import java.util.Collection;

/* JADX INFO: loaded from: classes7.dex */
public class jag extends fjf {
    @Override // p000.fjf
    @hib
    public Object getSpans(@efb mu9 mu9Var, @efb l1e l1eVar, @efb nm7 nm7Var) {
        qwf qwfVar = mu9Var.spansFactory().get(iag.class);
        if (qwfVar == null) {
            return null;
        }
        return qwfVar.getSpans(mu9Var, l1eVar);
    }

    @Override // p000.fjf, p000.qlg
    @efb
    public Collection<String> supportedTags() {
        return Arrays.asList("b", "strong");
    }
}
