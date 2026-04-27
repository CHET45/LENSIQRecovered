package p000;

import android.text.Spanned;
import android.widget.TextView;
import p000.mu9;
import p000.thc;
import p000.vu9;
import p000.xu9;
import p000.yu9;

/* JADX INFO: loaded from: classes7.dex */
public interface tu9 {

    /* JADX INFO: renamed from: tu9$a */
    public interface InterfaceC13245a<P extends tu9> {
        void apply(@efb P p);
    }

    /* JADX INFO: renamed from: tu9$b */
    public interface InterfaceC13246b {
        @efb
        <P extends tu9> P require(@efb Class<P> cls);

        <P extends tu9> void require(@efb Class<P> cls, @efb InterfaceC13245a<? super P> interfaceC13245a);
    }

    void afterRender(@efb deb debVar, @efb yu9 yu9Var);

    void afterSetText(@efb TextView textView);

    void beforeRender(@efb deb debVar);

    void beforeSetText(@efb TextView textView, @efb Spanned spanned);

    void configure(@efb InterfaceC13246b interfaceC13246b);

    void configureConfiguration(@efb mu9.C9528b c9528b);

    void configureParser(@efb thc.C13039a c13039a);

    void configureSpansFactory(@efb vu9.InterfaceC14262a interfaceC14262a);

    void configureTheme(@efb xu9.C15304a c15304a);

    void configureVisitor(@efb yu9.InterfaceC15812b interfaceC15812b);

    @efb
    String processMarkdown(@efb String str);
}
