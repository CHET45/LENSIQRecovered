package p000;

import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.widget.TextView;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import p000.ku9;

/* JADX INFO: loaded from: classes7.dex */
public class su9 extends ku9 {

    /* JADX INFO: renamed from: a */
    public final TextView.BufferType f82904a;

    /* JADX INFO: renamed from: b */
    public final thc f82905b;

    /* JADX INFO: renamed from: c */
    public final zu9 f82906c;

    /* JADX INFO: renamed from: d */
    public final mu9 f82907d;

    /* JADX INFO: renamed from: e */
    public final List<tu9> f82908e;

    /* JADX INFO: renamed from: f */
    @hib
    public final ku9.InterfaceC8525b f82909f;

    /* JADX INFO: renamed from: g */
    public final boolean f82910g;

    /* JADX INFO: renamed from: su9$a */
    public class RunnableC12793a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ TextView f82911a;

        public RunnableC12793a(TextView textView) {
            this.f82911a = textView;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = su9.this.f82908e.iterator();
            while (it.hasNext()) {
                ((tu9) it.next()).afterSetText(this.f82911a);
            }
        }
    }

    public su9(@efb TextView.BufferType bufferType, @hib ku9.InterfaceC8525b interfaceC8525b, @efb thc thcVar, @efb zu9 zu9Var, @efb mu9 mu9Var, @efb List<tu9> list, boolean z) {
        this.f82904a = bufferType;
        this.f82909f = interfaceC8525b;
        this.f82905b = thcVar;
        this.f82906c = zu9Var;
        this.f82907d = mu9Var;
        this.f82908e = list;
        this.f82910g = z;
    }

    @Override // p000.ku9
    @efb
    public mu9 configuration() {
        return this.f82907d;
    }

    @Override // p000.ku9
    @hib
    public <P extends tu9> P getPlugin(@efb Class<P> cls) {
        P p = null;
        for (tu9 tu9Var : this.f82908e) {
            if (cls.isAssignableFrom(tu9Var.getClass())) {
                p = (P) tu9Var;
            }
        }
        return p;
    }

    @Override // p000.ku9
    @efb
    public List<? extends tu9> getPlugins() {
        return Collections.unmodifiableList(this.f82908e);
    }

    @Override // p000.ku9
    public boolean hasPlugin(@efb Class<? extends tu9> cls) {
        return getPlugin(cls) != null;
    }

    @Override // p000.ku9
    @efb
    public deb parse(@efb String str) {
        Iterator<tu9> it = this.f82908e.iterator();
        while (it.hasNext()) {
            str = it.next().processMarkdown(str);
        }
        return this.f82905b.parse(str);
    }

    @Override // p000.ku9
    @efb
    public Spanned render(@efb deb debVar) {
        Iterator<tu9> it = this.f82908e.iterator();
        while (it.hasNext()) {
            it.next().beforeRender(debVar);
        }
        yu9 yu9VarMo27096a = this.f82906c.mo27096a();
        debVar.accept(yu9VarMo27096a);
        Iterator<tu9> it2 = this.f82908e.iterator();
        while (it2.hasNext()) {
            it2.next().afterRender(debVar, yu9VarMo27096a);
        }
        return yu9VarMo27096a.builder().spannableStringBuilder();
    }

    @Override // p000.ku9
    @efb
    public <P extends tu9> P requirePlugin(@efb Class<P> cls) {
        P p = (P) getPlugin(cls);
        if (p != null) {
            return p;
        }
        throw new IllegalStateException(String.format(Locale.US, "Requested plugin `%s` is not registered with this Markwon instance", cls.getName()));
    }

    @Override // p000.ku9
    public void setMarkdown(@efb TextView textView, @efb String str) {
        setParsedMarkdown(textView, toMarkdown(str));
    }

    @Override // p000.ku9
    public void setParsedMarkdown(@efb TextView textView, @efb Spanned spanned) {
        Iterator<tu9> it = this.f82908e.iterator();
        while (it.hasNext()) {
            it.next().beforeSetText(textView, spanned);
        }
        ku9.InterfaceC8525b interfaceC8525b = this.f82909f;
        if (interfaceC8525b != null) {
            interfaceC8525b.setText(textView, spanned, this.f82904a, new RunnableC12793a(textView));
            return;
        }
        textView.setText(spanned, this.f82904a);
        Iterator<tu9> it2 = this.f82908e.iterator();
        while (it2.hasNext()) {
            it2.next().afterSetText(textView);
        }
    }

    @Override // p000.ku9
    @efb
    public Spanned toMarkdown(@efb String str) {
        Spanned spannedRender = render(parse(str));
        return (TextUtils.isEmpty(spannedRender) && this.f82910g && !TextUtils.isEmpty(str)) ? new SpannableStringBuilder(str) : spannedRender;
    }
}
