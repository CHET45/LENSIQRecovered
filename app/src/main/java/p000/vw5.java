package p000;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import p000.z24;

/* JADX INFO: loaded from: classes5.dex */
public final class vw5 extends t83<syh> {

    /* JADX INFO: renamed from: f */
    public static final String f92413f = "FirebaseAuthCredentialsProvider";

    /* JADX INFO: renamed from: a */
    public final lr7 f92414a = new lr7() { // from class: sw5
        @Override // p000.lr7
        public final void onIdTokenChanged(zb8 zb8Var) {
            this.f83125a.lambda$new$0(zb8Var);
        }
    };

    /* JADX INFO: renamed from: b */
    @xc7("this")
    @hib
    public aa8 f92415b;

    /* JADX INFO: renamed from: c */
    @xc7("this")
    @hib
    public pa9<syh> f92416c;

    /* JADX INFO: renamed from: d */
    @xc7("this")
    public int f92417d;

    /* JADX INFO: renamed from: e */
    @xc7("this")
    public boolean f92418e;

    @igg({"ProviderAssignment"})
    public vw5(z24<aa8> z24Var) {
        z24Var.whenAvailable(new z24.InterfaceC15937a() { // from class: tw5
            @Override // p000.z24.InterfaceC15937a
            public final void handle(eid eidVar) {
                this.f86167a.lambda$new$1(eidVar);
            }
        });
    }

    private synchronized syh getUser() {
        String uid;
        try {
            aa8 aa8Var = this.f92415b;
            uid = aa8Var == null ? null : aa8Var.getUid();
        } catch (Throwable th) {
            throw th;
        }
        return uid != null ? new syh(uid) : syh.f83239b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task lambda$getToken$2(int i, Task task) throws Exception {
        synchronized (this) {
            try {
                if (i != this.f92417d) {
                    fj9.debug(f92413f, "getToken aborted due to token change", new Object[0]);
                    return getToken();
                }
                if (task.isSuccessful()) {
                    return Tasks.forResult(((f57) task.getResult()).getToken());
                }
                return Tasks.forException(task.getException());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(zb8 zb8Var) {
        onIdTokenChanged();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$1(eid eidVar) {
        synchronized (this) {
            this.f92415b = (aa8) eidVar.get();
            onIdTokenChanged();
            this.f92415b.addIdTokenListener(this.f92414a);
        }
    }

    private synchronized void onIdTokenChanged() {
        this.f92417d++;
        pa9<syh> pa9Var = this.f92416c;
        if (pa9Var != null) {
            pa9Var.onValue(getUser());
        }
    }

    @Override // p000.t83
    public synchronized Task<String> getToken() {
        aa8 aa8Var = this.f92415b;
        if (aa8Var == null) {
            return Tasks.forException(new iw5("auth is not available"));
        }
        Task<f57> accessToken = aa8Var.getAccessToken(this.f92418e);
        this.f92418e = false;
        final int i = this.f92417d;
        return accessToken.continueWithTask(z85.f104372c, new Continuation() { // from class: uw5
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                return this.f89264a.lambda$getToken$2(i, task);
            }
        });
    }

    @Override // p000.t83
    public synchronized void invalidateToken() {
        this.f92418e = true;
    }

    @Override // p000.t83
    public synchronized void removeChangeListener() {
        this.f92416c = null;
        aa8 aa8Var = this.f92415b;
        if (aa8Var != null) {
            aa8Var.removeIdTokenListener(this.f92414a);
        }
    }

    @Override // p000.t83
    public synchronized void setChangeListener(@efb pa9<syh> pa9Var) {
        this.f92416c = pa9Var;
        pa9Var.onValue(getUser());
    }
}
