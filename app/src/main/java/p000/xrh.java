package p000;

import android.text.style.UnderlineSpan;
import java.util.Arrays;
import java.util.Collection;

/* JADX INFO: loaded from: classes7.dex */
public class xrh extends qlg {
    @Override // p000.qlg
    public void handle(@efb yu9 yu9Var, @efb pu9 pu9Var, @efb nm7 nm7Var) {
        if (nm7Var.isBlock()) {
            qlg.m20435a(yu9Var, pu9Var, nm7Var.getAsBlock());
        }
        ywf.setSpans(yu9Var.builder(), new UnderlineSpan(), nm7Var.start(), nm7Var.end());
    }

    @Override // p000.qlg
    @efb
    public Collection<String> supportedTags() {
        return Arrays.asList("u", "ins");
    }
}
