package p000;

/* JADX INFO: loaded from: classes3.dex */
public interface gqa {

    /* JADX INFO: renamed from: gqa$a */
    public interface InterfaceC6464a {
        void onResourceRemoved(@efb t5e<?> t5eVar);
    }

    void clearMemory();

    long getCurrentSize();

    long getMaxSize();

    @hib
    t5e<?> put(@efb eq8 eq8Var, @hib t5e<?> t5eVar);

    @hib
    t5e<?> remove(@efb eq8 eq8Var);

    void setResourceRemovedListener(@efb InterfaceC6464a interfaceC6464a);

    void setSizeMultiplier(float f);

    void trimMemory(int i);
}
