package p000;

/* JADX INFO: loaded from: classes7.dex */
public interface yu9 extends idi {

    /* JADX INFO: renamed from: yu9$a */
    public interface InterfaceC15811a {
        void blockEnd(@efb yu9 yu9Var, @efb deb debVar);

        void blockStart(@efb yu9 yu9Var, @efb deb debVar);
    }

    /* JADX INFO: renamed from: yu9$b */
    public interface InterfaceC15812b {
        @efb
        InterfaceC15812b blockHandler(@efb InterfaceC15811a interfaceC15811a);

        @efb
        yu9 build(@efb mu9 mu9Var, @efb l1e l1eVar);

        @efb
        /* JADX INFO: renamed from: on */
        <N extends deb> InterfaceC15812b mo2700on(@efb Class<N> cls, @hib InterfaceC15813c<? super N> interfaceC15813c);
    }

    /* JADX INFO: renamed from: yu9$c */
    public interface InterfaceC15813c<N extends deb> {
        void visit(@efb yu9 yu9Var, @efb N n);
    }

    void blockEnd(@efb deb debVar);

    void blockStart(@efb deb debVar);

    @efb
    ywf builder();

    void clear();

    @efb
    mu9 configuration();

    void ensureNewLine();

    void forceNewLine();

    boolean hasNext(@efb deb debVar);

    int length();

    @efb
    l1e renderProps();

    void setSpans(int i, @hib Object obj);

    <N extends deb> void setSpansForNode(@efb N n, int i);

    <N extends deb> void setSpansForNode(@efb Class<N> cls, int i);

    <N extends deb> void setSpansForNodeOptional(@efb N n, int i);

    <N extends deb> void setSpansForNodeOptional(@efb Class<N> cls, int i);

    void visitChildren(@efb deb debVar);
}
