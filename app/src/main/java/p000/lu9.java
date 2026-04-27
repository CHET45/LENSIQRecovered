package p000;

import android.content.Context;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p000.av9;
import p000.ku9;
import p000.mu9;
import p000.thc;
import p000.wu9;
import p000.xu9;

/* JADX INFO: loaded from: classes7.dex */
public class lu9 implements ku9.InterfaceC8524a {

    /* JADX INFO: renamed from: a */
    public final Context f58787a;

    /* JADX INFO: renamed from: d */
    public ku9.InterfaceC8525b f58790d;

    /* JADX INFO: renamed from: b */
    public final List<tu9> f58788b = new ArrayList(3);

    /* JADX INFO: renamed from: c */
    public TextView.BufferType f58789c = TextView.BufferType.SPANNABLE;

    /* JADX INFO: renamed from: e */
    public boolean f58791e = true;

    public lu9(@efb Context context) {
        this.f58787a = context;
    }

    @efb
    private static List<tu9> preparePlugins(@efb List<tu9> list) {
        return new hxd(list).m12656a();
    }

    @Override // p000.ku9.InterfaceC8524a
    @efb
    public ku9.InterfaceC8524a bufferType(@efb TextView.BufferType bufferType) {
        this.f58789c = bufferType;
        return this;
    }

    @Override // p000.ku9.InterfaceC8524a
    @efb
    public ku9 build() {
        if (this.f58788b.isEmpty()) {
            throw new IllegalStateException("No plugins were added to this builder. Use #usePlugin method to add them");
        }
        List<tu9> listPreparePlugins = preparePlugins(this.f58788b);
        thc.C13039a c13039a = new thc.C13039a();
        xu9.C15304a c15304aBuilderWithDefaults = xu9.builderWithDefaults(this.f58787a);
        mu9.C9528b c9528b = new mu9.C9528b();
        av9.C1616a c1616a = new av9.C1616a();
        wu9.C14799a c14799a = new wu9.C14799a();
        for (tu9 tu9Var : listPreparePlugins) {
            tu9Var.configureParser(c13039a);
            tu9Var.configureTheme(c15304aBuilderWithDefaults);
            tu9Var.configureConfiguration(c9528b);
            tu9Var.configureVisitor(c1616a);
            tu9Var.configureSpansFactory(c14799a);
        }
        mu9 mu9VarBuild = c9528b.build(c15304aBuilderWithDefaults.build(), c14799a.build());
        return new su9(this.f58789c, this.f58790d, c13039a.build(), zu9.m27095b(c1616a, mu9VarBuild), mu9VarBuild, Collections.unmodifiableList(listPreparePlugins), this.f58791e);
    }

    @Override // p000.ku9.InterfaceC8524a
    @efb
    public ku9.InterfaceC8524a fallbackToRawInputWhenEmpty(boolean z) {
        this.f58791e = z;
        return this;
    }

    @Override // p000.ku9.InterfaceC8524a
    @efb
    public ku9.InterfaceC8524a textSetter(@efb ku9.InterfaceC8525b interfaceC8525b) {
        this.f58790d = interfaceC8525b;
        return this;
    }

    @Override // p000.ku9.InterfaceC8524a
    @efb
    public ku9.InterfaceC8524a usePlugin(@efb tu9 tu9Var) {
        this.f58788b.add(tu9Var);
        return this;
    }

    @Override // p000.ku9.InterfaceC8524a
    @efb
    public ku9.InterfaceC8524a usePlugins(@efb Iterable<? extends tu9> iterable) {
        for (tu9 tu9Var : iterable) {
            tu9Var.getClass();
            this.f58788b.add(tu9Var);
        }
        return this;
    }
}
