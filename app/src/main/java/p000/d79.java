package p000;

import android.text.TextUtils;
import java.util.Collection;
import java.util.Collections;

/* JADX INFO: loaded from: classes7.dex */
public class d79 extends fjf {
    @Override // p000.fjf
    @hib
    public Object getSpans(@efb mu9 mu9Var, @efb l1e l1eVar, @efb nm7 nm7Var) {
        qwf qwfVar;
        String str = nm7Var.attributes().get("href");
        if (TextUtils.isEmpty(str) || (qwfVar = mu9Var.spansFactory().get(z69.class)) == null) {
            return null;
        }
        o03.f66153e.set(l1eVar, str);
        return qwfVar.getSpans(mu9Var, l1eVar);
    }

    @Override // p000.fjf, p000.qlg
    @efb
    public Collection<String> supportedTags() {
        return Collections.singleton("a");
    }
}
