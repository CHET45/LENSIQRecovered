package p000;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes4.dex */
@uxa
public abstract class n85 {
    @nid
    @qpf
    @igg({"ThreadPoolCreation"})
    /* JADX INFO: renamed from: a */
    public static Executor m17805a() {
        return new tke(Executors.newSingleThreadExecutor());
    }
}
