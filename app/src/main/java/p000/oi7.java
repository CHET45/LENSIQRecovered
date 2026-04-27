package p000;

import java.util.Arrays;
import java.util.Collection;

/* JADX INFO: loaded from: classes7.dex */
public class oi7 extends fjf {
    @Override // p000.fjf
    @hib
    public Object getSpans(@efb mu9 mu9Var, @efb l1e l1eVar, @efb nm7 nm7Var) {
        int i;
        qwf qwfVar = mu9Var.spansFactory().get(ni7.class);
        if (qwfVar == null) {
            return null;
        }
        try {
            i = Integer.parseInt(nm7Var.name().substring(1));
        } catch (NumberFormatException e) {
            e.printStackTrace();
            i = 0;
        }
        if (i < 1 || i > 6) {
            return null;
        }
        o03.f66152d.set(l1eVar, Integer.valueOf(i));
        return qwfVar.getSpans(mu9Var, l1eVar);
    }

    @Override // p000.fjf, p000.qlg
    @efb
    public Collection<String> supportedTags() {
        return Arrays.asList("h1", "h2", "h3", "h4", "h5", "h6");
    }
}
