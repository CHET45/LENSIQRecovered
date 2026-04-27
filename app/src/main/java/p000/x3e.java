package p000;

/* JADX INFO: loaded from: classes4.dex */
public interface x3e {

    /* JADX INFO: renamed from: x3e$a */
    public enum EnumC14910a {
        RUNNING(false),
        PAUSED(false),
        CLEARED(false),
        SUCCESS(true),
        FAILED(true);


        /* JADX INFO: renamed from: a */
        public final boolean f96169a;

        EnumC14910a(boolean z) {
            this.f96169a = z;
        }

        /* JADX INFO: renamed from: a */
        public boolean m24951a() {
            return this.f96169a;
        }
    }

    boolean canNotifyCleared(q3e q3eVar);

    boolean canNotifyStatusChanged(q3e q3eVar);

    boolean canSetImage(q3e q3eVar);

    x3e getRoot();

    boolean isAnyResourceSet();

    void onRequestFailed(q3e q3eVar);

    void onRequestSuccess(q3e q3eVar);
}
