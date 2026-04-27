package p000;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Executor;
import p000.fta;
import p000.pn1;

/* JADX INFO: loaded from: classes5.dex */
public final class pz5 extends pn1 {

    /* JADX INFO: renamed from: c */
    public static final String f72561c = "FirestoreCallCredentials";

    /* JADX INFO: renamed from: d */
    public static final fta.AbstractC5971i<String> f72562d;

    /* JADX INFO: renamed from: e */
    public static final fta.AbstractC5971i<String> f72563e;

    /* JADX INFO: renamed from: a */
    public final t83<syh> f72564a;

    /* JADX INFO: renamed from: b */
    public final t83<String> f72565b;

    static {
        fta.InterfaceC5967e<String> interfaceC5967e = fta.f37690f;
        f72562d = fta.AbstractC5971i.m11174of(go7.f40559n, interfaceC5967e);
        f72563e = fta.AbstractC5971i.m11174of("x-firebase-appcheck", interfaceC5967e);
    }

    public pz5(t83<syh> t83Var, t83<String> t83Var2) {
        this.f72564a = t83Var;
        this.f72565b = t83Var2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$applyRequestMetadata$0(Task task, pn1.AbstractC11034a abstractC11034a, Task task2, Task task3) {
        fta ftaVar = new fta();
        if (task.isSuccessful()) {
            String str = (String) task.getResult();
            fj9.debug(f72561c, "Successfully fetched auth token.", new Object[0]);
            if (str != null) {
                ftaVar.put(f72562d, "Bearer " + str);
            }
        } else {
            Exception exception = task.getException();
            if (exception instanceof iw5) {
                fj9.debug(f72561c, "Firebase Auth API not available, not using authentication.", new Object[0]);
            } else {
                if (!(exception instanceof zy5)) {
                    fj9.warn(f72561c, "Failed to get auth token: %s.", exception);
                    abstractC11034a.fail(n4g.f63266m.withCause(exception));
                    return;
                }
                fj9.debug(f72561c, "No user signed in, not using authentication.", new Object[0]);
            }
        }
        if (task2.isSuccessful()) {
            String str2 = (String) task2.getResult();
            if (str2 != null && !str2.isEmpty()) {
                fj9.debug(f72561c, "Successfully fetched AppCheck token.", new Object[0]);
                ftaVar.put(f72563e, str2);
            }
        } else {
            Exception exception2 = task2.getException();
            if (!(exception2 instanceof iw5)) {
                fj9.warn(f72561c, "Failed to get AppCheck token: %s.", exception2);
                abstractC11034a.fail(n4g.f63266m.withCause(exception2));
                return;
            }
            fj9.debug(f72561c, "Firebase AppCheck API not available.", new Object[0]);
        }
        abstractC11034a.apply(ftaVar);
    }

    @Override // p000.pn1
    public void applyRequestMetadata(pn1.AbstractC11035b abstractC11035b, Executor executor, final pn1.AbstractC11034a abstractC11034a) {
        final Task<String> token = this.f72564a.getToken();
        final Task<String> token2 = this.f72565b.getToken();
        Tasks.whenAll((Task<?>[]) new Task[]{token, token2}).addOnCompleteListener(z85.f104372c, new OnCompleteListener() { // from class: oz5
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                pz5.lambda$applyRequestMetadata$0(token, abstractC11034a, token2, task);
            }
        });
    }

    @Override // p000.pn1
    public void thisUsesUnstableApi() {
    }
}
