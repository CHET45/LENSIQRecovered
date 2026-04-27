package p000;

import com.google.firebase.firestore.C3603f;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes5.dex */
public class t90<T> implements b65<T> {

    /* JADX INFO: renamed from: a */
    public final Executor f84006a;

    /* JADX INFO: renamed from: b */
    public final b65<T> f84007b;

    /* JADX INFO: renamed from: c */
    public volatile boolean f84008c = false;

    public t90(Executor executor, b65<T> b65Var) {
        this.f84006a = executor;
        this.f84007b = b65Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onEvent$0(Object obj, C3603f c3603f) {
        if (this.f84008c) {
            return;
        }
        this.f84007b.onEvent(obj, c3603f);
    }

    public void mute() {
        this.f84008c = true;
    }

    @Override // p000.b65
    public void onEvent(@hib final T t, @hib final C3603f c3603f) {
        this.f84006a.execute(new Runnable() { // from class: s90
            @Override // java.lang.Runnable
            public final void run() {
                this.f80965a.lambda$onEvent$0(t, c3603f);
            }
        });
    }
}
