package p000;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public interface sle {

    /* JADX INFO: renamed from: sle$a */
    public interface InterfaceC12651a {
        void unregister();
    }

    boolean canBeSaved(@yfb Object obj);

    @gib
    Object consumeRestored(@yfb String str);

    @yfb
    Map<String, List<Object>> performSave();

    @yfb
    InterfaceC12651a registerProvider(@yfb String str, @yfb ny6<? extends Object> ny6Var);
}
