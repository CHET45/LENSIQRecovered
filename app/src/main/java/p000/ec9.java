package p000;

import android.app.Activity;
import com.google.android.gms.common.api.internal.ActivityLifecycleObserver;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCanceledListener;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.TaskExecutors;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.Executor;
import p000.fc9;
import p000.p7e;

/* JADX INFO: loaded from: classes5.dex */
public class ec9 extends Task<fc9> {

    /* JADX INFO: renamed from: a */
    public final Object f32620a = new Object();

    /* JADX INFO: renamed from: b */
    @xc7("lock")
    public fc9 f32621b = fc9.f36110g;

    /* JADX INFO: renamed from: c */
    public final TaskCompletionSource<fc9> f32622c;

    /* JADX INFO: renamed from: d */
    public final Task<fc9> f32623d;

    /* JADX INFO: renamed from: e */
    @xc7("lock")
    public final Queue<C5255a> f32624e;

    /* JADX INFO: renamed from: ec9$a */
    public static class C5255a {

        /* JADX INFO: renamed from: a */
        public Executor f32625a;

        /* JADX INFO: renamed from: b */
        public h4c<fc9> f32626b;

        public C5255a(@hib Executor executor, h4c<fc9> h4cVar) {
            this.f32625a = executor == null ? TaskExecutors.MAIN_THREAD : executor;
            this.f32626b = h4cVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$invokeAsync$0(fc9 fc9Var) {
            this.f32626b.onProgress(fc9Var);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            return this.f32626b.equals(((C5255a) obj).f32626b);
        }

        public int hashCode() {
            return this.f32626b.hashCode();
        }

        public void invokeAsync(final fc9 fc9Var) {
            this.f32625a.execute(new Runnable() { // from class: dc9
                @Override // java.lang.Runnable
                public final void run() {
                    this.f29285a.lambda$invokeAsync$0(fc9Var);
                }
            });
        }
    }

    @p7e({p7e.EnumC10826a.f69935b})
    public ec9() {
        TaskCompletionSource<fc9> taskCompletionSource = new TaskCompletionSource<>();
        this.f32622c = taskCompletionSource;
        this.f32623d = taskCompletionSource.getTask();
        this.f32624e = new ArrayDeque();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: removeOnProgressListener, reason: merged with bridge method [inline-methods] */
    public void lambda$addOnProgressListener$0(@efb h4c<fc9> h4cVar) {
        synchronized (this.f32620a) {
            this.f32624e.remove(new C5255a(null, h4cVar));
        }
    }

    @Override // com.google.android.gms.tasks.Task
    @efb
    public Task<fc9> addOnCanceledListener(@efb OnCanceledListener onCanceledListener) {
        return this.f32623d.addOnCanceledListener(onCanceledListener);
    }

    @Override // com.google.android.gms.tasks.Task
    @efb
    public Task<fc9> addOnCompleteListener(@efb OnCompleteListener<fc9> onCompleteListener) {
        return this.f32623d.addOnCompleteListener(onCompleteListener);
    }

    @Override // com.google.android.gms.tasks.Task
    @efb
    public Task<fc9> addOnFailureListener(@efb OnFailureListener onFailureListener) {
        return this.f32623d.addOnFailureListener(onFailureListener);
    }

    @efb
    public ec9 addOnProgressListener(@efb h4c<fc9> h4cVar) {
        C5255a c5255a = new C5255a(null, h4cVar);
        synchronized (this.f32620a) {
            this.f32624e.add(c5255a);
        }
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    @efb
    public Task<fc9> addOnSuccessListener(@efb OnSuccessListener<? super fc9> onSuccessListener) {
        return this.f32623d.addOnSuccessListener(onSuccessListener);
    }

    @Override // com.google.android.gms.tasks.Task
    @efb
    public <TContinuationResult> Task<TContinuationResult> continueWith(@efb Continuation<fc9, TContinuationResult> continuation) {
        return this.f32623d.continueWith(continuation);
    }

    @Override // com.google.android.gms.tasks.Task
    @efb
    public <TContinuationResult> Task<TContinuationResult> continueWithTask(@efb Continuation<fc9, Task<TContinuationResult>> continuation) {
        return this.f32623d.continueWithTask(continuation);
    }

    @Override // com.google.android.gms.tasks.Task
    @hib
    public Exception getException() {
        return this.f32623d.getException();
    }

    @Override // com.google.android.gms.tasks.Task
    public boolean isCanceled() {
        return this.f32623d.isCanceled();
    }

    @Override // com.google.android.gms.tasks.Task
    public boolean isComplete() {
        return this.f32623d.isComplete();
    }

    @Override // com.google.android.gms.tasks.Task
    public boolean isSuccessful() {
        return this.f32623d.isSuccessful();
    }

    @Override // com.google.android.gms.tasks.Task
    @efb
    public <TContinuationResult> Task<TContinuationResult> onSuccessTask(@efb SuccessContinuation<fc9, TContinuationResult> successContinuation) {
        return this.f32623d.onSuccessTask(successContinuation);
    }

    @p7e({p7e.EnumC10826a.f69935b})
    public void setException(@efb Exception exc) {
        synchronized (this.f32620a) {
            try {
                fc9 fc9Var = new fc9(this.f32621b.getDocumentsLoaded(), this.f32621b.getTotalDocuments(), this.f32621b.getBytesLoaded(), this.f32621b.getTotalBytes(), exc, fc9.EnumC5719a.ERROR);
                this.f32621b = fc9Var;
                Iterator<C5255a> it = this.f32624e.iterator();
                while (it.hasNext()) {
                    it.next().invokeAsync(fc9Var);
                }
                this.f32624e.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f32622c.setException(exc);
    }

    @p7e({p7e.EnumC10826a.f69935b})
    public void setResult(@efb fc9 fc9Var) {
        r80.hardAssert(fc9Var.getTaskState().equals(fc9.EnumC5719a.SUCCESS), "Expected success, but was " + fc9Var.getTaskState(), new Object[0]);
        synchronized (this.f32620a) {
            try {
                this.f32621b = fc9Var;
                Iterator<C5255a> it = this.f32624e.iterator();
                while (it.hasNext()) {
                    it.next().invokeAsync(this.f32621b);
                }
                this.f32624e.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f32622c.setResult(fc9Var);
    }

    @p7e({p7e.EnumC10826a.f69935b})
    public void updateProgress(@efb fc9 fc9Var) {
        synchronized (this.f32620a) {
            try {
                this.f32621b = fc9Var;
                Iterator<C5255a> it = this.f32624e.iterator();
                while (it.hasNext()) {
                    it.next().invokeAsync(fc9Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.tasks.Task
    @efb
    public Task<fc9> addOnCanceledListener(@efb Executor executor, @efb OnCanceledListener onCanceledListener) {
        return this.f32623d.addOnCanceledListener(executor, onCanceledListener);
    }

    @Override // com.google.android.gms.tasks.Task
    @efb
    public Task<fc9> addOnCompleteListener(@efb Executor executor, @efb OnCompleteListener<fc9> onCompleteListener) {
        return this.f32623d.addOnCompleteListener(executor, onCompleteListener);
    }

    @Override // com.google.android.gms.tasks.Task
    @efb
    public Task<fc9> addOnFailureListener(@efb Executor executor, @efb OnFailureListener onFailureListener) {
        return this.f32623d.addOnFailureListener(executor, onFailureListener);
    }

    @Override // com.google.android.gms.tasks.Task
    @efb
    public Task<fc9> addOnSuccessListener(@efb Executor executor, @efb OnSuccessListener<? super fc9> onSuccessListener) {
        return this.f32623d.addOnSuccessListener(executor, onSuccessListener);
    }

    @Override // com.google.android.gms.tasks.Task
    @efb
    public <TContinuationResult> Task<TContinuationResult> continueWith(@efb Executor executor, @efb Continuation<fc9, TContinuationResult> continuation) {
        return this.f32623d.continueWith(executor, continuation);
    }

    @Override // com.google.android.gms.tasks.Task
    @efb
    public <TContinuationResult> Task<TContinuationResult> continueWithTask(@efb Executor executor, @efb Continuation<fc9, Task<TContinuationResult>> continuation) {
        return this.f32623d.continueWithTask(executor, continuation);
    }

    @Override // com.google.android.gms.tasks.Task
    @efb
    public <TContinuationResult> Task<TContinuationResult> onSuccessTask(@efb Executor executor, @efb SuccessContinuation<fc9, TContinuationResult> successContinuation) {
        return this.f32623d.onSuccessTask(executor, successContinuation);
    }

    @Override // com.google.android.gms.tasks.Task
    @efb
    public Task<fc9> addOnCanceledListener(@efb Activity activity, @efb OnCanceledListener onCanceledListener) {
        return this.f32623d.addOnCanceledListener(activity, onCanceledListener);
    }

    @Override // com.google.android.gms.tasks.Task
    @efb
    public Task<fc9> addOnCompleteListener(@efb Activity activity, @efb OnCompleteListener<fc9> onCompleteListener) {
        return this.f32623d.addOnCompleteListener(activity, onCompleteListener);
    }

    @Override // com.google.android.gms.tasks.Task
    @efb
    public Task<fc9> addOnFailureListener(@efb Activity activity, @efb OnFailureListener onFailureListener) {
        return this.f32623d.addOnFailureListener(activity, onFailureListener);
    }

    @Override // com.google.android.gms.tasks.Task
    @efb
    public Task<fc9> addOnSuccessListener(@efb Activity activity, @efb OnSuccessListener<? super fc9> onSuccessListener) {
        return this.f32623d.addOnSuccessListener(activity, onSuccessListener);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.android.gms.tasks.Task
    @efb
    public fc9 getResult() {
        return this.f32623d.getResult();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.android.gms.tasks.Task
    @efb
    public <X extends Throwable> fc9 getResult(@efb Class<X> cls) throws Throwable {
        return this.f32623d.getResult(cls);
    }

    @efb
    public ec9 addOnProgressListener(@efb Executor executor, @efb h4c<fc9> h4cVar) {
        C5255a c5255a = new C5255a(executor, h4cVar);
        synchronized (this.f32620a) {
            this.f32624e.add(c5255a);
        }
        return this;
    }

    @efb
    public ec9 addOnProgressListener(@efb Activity activity, @efb final h4c<fc9> h4cVar) {
        C5255a c5255a = new C5255a(null, h4cVar);
        synchronized (this.f32620a) {
            this.f32624e.add(c5255a);
        }
        ActivityLifecycleObserver.m5779of(activity).onStopCallOnce(new Runnable() { // from class: cc9
            @Override // java.lang.Runnable
            public final void run() {
                this.f16235a.lambda$addOnProgressListener$0(h4cVar);
            }
        });
        return this;
    }
}
