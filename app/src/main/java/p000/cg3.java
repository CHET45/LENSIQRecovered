package p000;

/* JADX INFO: loaded from: classes3.dex */
public interface cg3 {

    /* JADX INFO: renamed from: cg3$a */
    public interface InterfaceC2302a {
        void onDataFetcherFailed(eq8 eq8Var, Exception exc, bg3<?> bg3Var, hh3 hh3Var);

        void onDataFetcherReady(eq8 eq8Var, @hib Object obj, bg3<?> bg3Var, hh3 hh3Var, eq8 eq8Var2);

        void reschedule();
    }

    void cancel();

    boolean startNext();
}
