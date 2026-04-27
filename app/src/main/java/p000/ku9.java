package p000;

import android.content.Context;
import android.text.Spanned;
import android.widget.TextView;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public abstract class ku9 {

    /* JADX INFO: renamed from: ku9$a */
    public interface InterfaceC8524a {
        @efb
        InterfaceC8524a bufferType(@efb TextView.BufferType bufferType);

        @efb
        ku9 build();

        @efb
        InterfaceC8524a fallbackToRawInputWhenEmpty(boolean z);

        @efb
        InterfaceC8524a textSetter(@efb InterfaceC8525b interfaceC8525b);

        @efb
        InterfaceC8524a usePlugin(@efb tu9 tu9Var);

        @efb
        InterfaceC8524a usePlugins(@efb Iterable<? extends tu9> iterable);
    }

    /* JADX INFO: renamed from: ku9$b */
    public interface InterfaceC8525b {
        void setText(@efb TextView textView, @efb Spanned spanned, @efb TextView.BufferType bufferType, @efb Runnable runnable);
    }

    @efb
    public static InterfaceC8524a builder(@efb Context context) {
        return new lu9(context).usePlugin(n03.create());
    }

    @efb
    public static InterfaceC8524a builderNoCore(@efb Context context) {
        return new lu9(context);
    }

    @efb
    public static ku9 create(@efb Context context) {
        return builder(context).usePlugin(n03.create()).build();
    }

    @efb
    public abstract mu9 configuration();

    @hib
    public abstract <P extends tu9> P getPlugin(@efb Class<P> cls);

    @efb
    public abstract List<? extends tu9> getPlugins();

    public abstract boolean hasPlugin(@efb Class<? extends tu9> cls);

    @efb
    public abstract deb parse(@efb String str);

    @efb
    public abstract Spanned render(@efb deb debVar);

    @efb
    public abstract <P extends tu9> P requirePlugin(@efb Class<P> cls);

    public abstract void setMarkdown(@efb TextView textView, @efb String str);

    public abstract void setParsedMarkdown(@efb TextView textView, @efb Spanned spanned);

    @efb
    public abstract Spanned toMarkdown(@efb String str);
}
