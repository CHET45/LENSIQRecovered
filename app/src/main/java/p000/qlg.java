package p000;

import java.util.Collection;
import p000.nm7;

/* JADX INFO: loaded from: classes7.dex */
public abstract class qlg {
    /* JADX INFO: renamed from: a */
    public static void m20435a(@efb yu9 yu9Var, @efb pu9 pu9Var, @efb nm7.InterfaceC9940a interfaceC9940a) {
        for (nm7.InterfaceC9940a interfaceC9940a2 : interfaceC9940a.children()) {
            if (interfaceC9940a2.isClosed()) {
                qlg qlgVarTagHandler = pu9Var.tagHandler(interfaceC9940a2.name());
                if (qlgVarTagHandler != null) {
                    qlgVarTagHandler.handle(yu9Var, pu9Var, interfaceC9940a2);
                } else {
                    m20435a(yu9Var, pu9Var, interfaceC9940a2);
                }
            }
        }
    }

    public abstract void handle(@efb yu9 yu9Var, @efb pu9 pu9Var, @efb nm7 nm7Var);

    @efb
    public abstract Collection<String> supportedTags();
}
