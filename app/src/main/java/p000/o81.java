package p000;

import java.util.Collection;
import java.util.Collections;

/* JADX INFO: loaded from: classes7.dex */
public class o81 extends qlg {
    @Override // p000.qlg
    public void handle(@efb yu9 yu9Var, @efb pu9 pu9Var, @efb nm7 nm7Var) {
        if (nm7Var.isBlock()) {
            qlg.m20435a(yu9Var, pu9Var, nm7Var.getAsBlock());
        }
        mu9 mu9VarConfiguration = yu9Var.configuration();
        qwf qwfVar = mu9VarConfiguration.spansFactory().get(o61.class);
        if (qwfVar != null) {
            ywf.setSpans(yu9Var.builder(), qwfVar.getSpans(mu9VarConfiguration, yu9Var.renderProps()), nm7Var.start(), nm7Var.end());
        }
    }

    @Override // p000.qlg
    @efb
    public Collection<String> supportedTags() {
        return Collections.singleton("blockquote");
    }
}
