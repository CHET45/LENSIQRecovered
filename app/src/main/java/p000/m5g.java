package p000;

import p000.m5g.InterfaceC9150b;

/* JADX INFO: loaded from: classes5.dex */
public interface m5g<CallbackType extends InterfaceC9150b> {

    /* JADX INFO: renamed from: m5g$a */
    public enum EnumC9149a {
        Initial,
        Starting,
        Open,
        Healthy,
        Error,
        Backoff
    }

    /* JADX INFO: renamed from: m5g$b */
    public interface InterfaceC9150b {
        void onClose(n4g n4gVar);

        void onOpen();
    }

    void inhibitBackoff();

    boolean isOpen();

    boolean isStarted();

    void start();

    void stop();
}
