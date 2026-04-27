package p000;

import java.util.List;
import p000.nm7;

/* JADX INFO: loaded from: classes7.dex */
public abstract class nu9 {

    /* JADX INFO: renamed from: nu9$a */
    public interface InterfaceC10061a<T> {
        void apply(@efb List<T> list);
    }

    public abstract void flushBlockTags(int i, @efb InterfaceC10061a<nm7.InterfaceC9940a> interfaceC10061a);

    public abstract void flushInlineTags(int i, @efb InterfaceC10061a<nm7.InterfaceC9941b> interfaceC10061a);

    public abstract <T extends Appendable & CharSequence> void processFragment(@efb T t, @efb String str);

    public abstract void reset();
}
