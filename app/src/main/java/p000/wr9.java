package p000;

/* JADX INFO: loaded from: classes7.dex */
@kyg
public interface wr9 extends r42 {

    /* JADX INFO: renamed from: wr9$a */
    public interface InterfaceC14756a {
        default sc0 filterTransport(sc0 sc0Var) {
            return sc0Var;
        }

        void transportInUse(boolean z);

        void transportReady();

        void transportShutdown(n4g n4gVar);

        void transportTerminated();
    }

    void shutdown(n4g n4gVar);

    void shutdownNow(n4g n4gVar);

    @dy1
    @eib
    Runnable start(InterfaceC14756a interfaceC14756a);
}
