package p000;

import android.text.style.StrikethroughSpan;
import java.util.Arrays;
import java.util.Collection;
import org.commonmark.ext.gfm.strikethrough.Strikethrough;

/* JADX INFO: loaded from: classes7.dex */
public class i7g extends qlg {

    /* JADX INFO: renamed from: a */
    public static final boolean f45960a;

    static {
        boolean z;
        try {
            Class.forName("org.commonmark.ext.gfm.strikethrough.Strikethrough");
            z = true;
        } catch (Throwable unused) {
            z = false;
        }
        f45960a = z;
    }

    @hib
    private static Object getMarkdownSpans(@efb yu9 yu9Var) {
        mu9 mu9VarConfiguration = yu9Var.configuration();
        qwf qwfVar = mu9VarConfiguration.spansFactory().get(Strikethrough.class);
        if (qwfVar == null) {
            return null;
        }
        return qwfVar.getSpans(mu9VarConfiguration, yu9Var.renderProps());
    }

    @Override // p000.qlg
    public void handle(@efb yu9 yu9Var, @efb pu9 pu9Var, @efb nm7 nm7Var) {
        if (nm7Var.isBlock()) {
            qlg.m20435a(yu9Var, pu9Var, nm7Var.getAsBlock());
        }
        ywf.setSpans(yu9Var.builder(), f45960a ? getMarkdownSpans(yu9Var) : new StrikethroughSpan(), nm7Var.start(), nm7Var.end());
    }

    @Override // p000.qlg
    @efb
    public Collection<String> supportedTags() {
        return Arrays.asList("s", "del");
    }
}
