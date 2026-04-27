package p000;

/* JADX INFO: loaded from: classes7.dex */
public interface vu9 {

    /* JADX INFO: renamed from: vu9$a */
    public interface InterfaceC14262a {
        @efb
        @Deprecated
        <N extends deb> InterfaceC14262a addFactory(@efb Class<N> cls, @efb qwf qwfVar);

        @efb
        <N extends deb> InterfaceC14262a appendFactory(@efb Class<N> cls, @efb qwf qwfVar);

        @efb
        vu9 build();

        @hib
        <N extends deb> qwf getFactory(@efb Class<N> cls);

        @efb
        <N extends deb> InterfaceC14262a prependFactory(@efb Class<N> cls, @efb qwf qwfVar);

        @efb
        <N extends deb> qwf requireFactory(@efb Class<N> cls);

        @efb
        <N extends deb> InterfaceC14262a setFactory(@efb Class<N> cls, @hib qwf qwfVar);
    }

    @hib
    <N extends deb> qwf get(@efb Class<N> cls);

    @efb
    <N extends deb> qwf require(@efb Class<N> cls);
}
