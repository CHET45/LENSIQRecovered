package p000;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import p000.z24;

/* JADX INFO: loaded from: classes5.dex */
public final class pw5 extends t83<String> {

    /* JADX INFO: renamed from: e */
    public static final String f72256e = "FirebaseAppCheckTokenProvider";

    /* JADX INFO: renamed from: a */
    @xc7("this")
    @hib
    public pa9<String> f72257a;

    /* JADX INFO: renamed from: b */
    @xc7("this")
    @hib
    public gc8 f72258b;

    /* JADX INFO: renamed from: c */
    @xc7("this")
    public boolean f72259c;

    /* JADX INFO: renamed from: d */
    public final w10 f72260d = new w10() { // from class: mw5
        @Override // p000.w10
        public final void onAppCheckTokenChanged(x10 x10Var) {
            this.f62542a.lambda$new$0(x10Var);
        }
    };

    @igg({"ProviderAssignment"})
    public pw5(z24<gc8> z24Var) {
        z24Var.whenAvailable(new z24.InterfaceC15937a() { // from class: nw5
            @Override // p000.z24.InterfaceC15937a
            public final void handle(eid eidVar) {
                this.f65883a.lambda$new$1(eidVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Task lambda$getToken$2(Task task) throws Exception {
        return task.isSuccessful() ? Tasks.forResult(((x10) task.getResult()).getToken()) : Tasks.forException(task.getException());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$1(eid eidVar) {
        synchronized (this) {
            try {
                gc8 gc8Var = (gc8) eidVar.get();
                this.f72258b = gc8Var;
                if (gc8Var != null) {
                    gc8Var.addAppCheckTokenListener(this.f72260d);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onTokenChanged, reason: merged with bridge method [inline-methods] */
    public synchronized void lambda$new$0(@efb x10 x10Var) {
        try {
            if (x10Var.getError() != null) {
                fj9.warn(f72256e, "Error getting App Check token; using placeholder token instead. Error: " + x10Var.getError(), new Object[0]);
            }
            pa9<String> pa9Var = this.f72257a;
            if (pa9Var != null) {
                pa9Var.onValue(x10Var.getToken());
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p000.t83
    public synchronized Task<String> getToken() {
        gc8 gc8Var = this.f72258b;
        if (gc8Var == null) {
            return Tasks.forException(new iw5("AppCheck is not available"));
        }
        Task<x10> token = gc8Var.getToken(this.f72259c);
        this.f72259c = false;
        return token.continueWithTask(z85.f104372c, new Continuation() { // from class: ow5
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                return pw5.lambda$getToken$2(task);
            }
        });
    }

    @Override // p000.t83
    public synchronized void invalidateToken() {
        this.f72259c = true;
    }

    @Override // p000.t83
    public synchronized void removeChangeListener() {
        this.f72257a = null;
        gc8 gc8Var = this.f72258b;
        if (gc8Var != null) {
            gc8Var.removeAppCheckTokenListener(this.f72260d);
        }
    }

    @Override // p000.t83
    public synchronized void setChangeListener(@efb pa9<String> pa9Var) {
        this.f72257a = pa9Var;
    }
}
