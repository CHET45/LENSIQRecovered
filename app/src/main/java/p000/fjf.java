package p000;

import java.util.Collection;

/* JADX INFO: loaded from: classes7.dex */
public abstract class fjf extends qlg {
    @hib
    public abstract Object getSpans(@efb mu9 mu9Var, @efb l1e l1eVar, @efb nm7 nm7Var);

    @Override // p000.qlg
    public void handle(@efb yu9 yu9Var, @efb pu9 pu9Var, @efb nm7 nm7Var) {
        if (nm7Var.isBlock()) {
            qlg.m20435a(yu9Var, pu9Var, nm7Var.getAsBlock());
        }
        Object spans = getSpans(yu9Var.configuration(), yu9Var.renderProps(), nm7Var);
        if (spans != null) {
            ywf.setSpans(yu9Var.builder(), spans, nm7Var.start(), nm7Var.end());
        }
    }

    @Override // p000.qlg
    @efb
    public abstract Collection<String> supportedTags();
}
