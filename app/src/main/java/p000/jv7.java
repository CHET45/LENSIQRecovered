package p000;

import android.text.TextUtils;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class jv7 extends fjf {

    /* JADX INFO: renamed from: a */
    public final InterfaceC8104a f52000a;

    /* JADX INFO: renamed from: jv7$a */
    public interface InterfaceC8104a {
        @hib
        vv7 parse(@efb Map<String, String> map);
    }

    public jv7(@efb InterfaceC8104a interfaceC8104a) {
        this.f52000a = interfaceC8104a;
    }

    @efb
    public static jv7 create() {
        return new jv7(new wv7(h93.create()));
    }

    @Override // p000.fjf
    @hib
    public Object getSpans(@efb mu9 mu9Var, @efb l1e l1eVar, @efb nm7 nm7Var) {
        qwf qwfVar;
        String str = nm7Var.attributes().get("src");
        if (TextUtils.isEmpty(str) || (qwfVar = mu9Var.spansFactory().get(os7.class)) == null) {
            return null;
        }
        String strProcess = mu9Var.imageDestinationProcessor().process(str);
        vv7 vv7Var = this.f52000a.parse(nm7Var.attributes());
        rv7.f79739a.set(l1eVar, strProcess);
        rv7.f79741c.set(l1eVar, vv7Var);
        rv7.f79740b.set(l1eVar, Boolean.FALSE);
        return qwfVar.getSpans(mu9Var, l1eVar);
    }

    @Override // p000.fjf, p000.qlg
    @efb
    public Collection<String> supportedTags() {
        return Collections.singleton("img");
    }
}
