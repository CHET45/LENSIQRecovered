package p000;

import p000.k63;

/* JADX INFO: loaded from: classes3.dex */
public final class s4b extends k63 {
    public s4b() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // p000.k63
    @gib
    public <T> T get(@yfb k63.InterfaceC8212b<T> interfaceC8212b) {
        md8.checkNotNullParameter(interfaceC8212b, "key");
        return (T) getMap$lifecycle_viewmodel_release().get(interfaceC8212b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T> void set(@yfb k63.InterfaceC8212b<T> interfaceC8212b, T t) {
        md8.checkNotNullParameter(interfaceC8212b, "key");
        getMap$lifecycle_viewmodel_release().put(interfaceC8212b, t);
    }

    public s4b(@yfb k63 k63Var) {
        md8.checkNotNullParameter(k63Var, "initialExtras");
        getMap$lifecycle_viewmodel_release().putAll(k63Var.getMap$lifecycle_viewmodel_release());
    }

    public /* synthetic */ s4b(k63 k63Var, int i, jt3 jt3Var) {
        this((i & 1) != 0 ? k63.C8211a.f52642b : k63Var);
    }
}
