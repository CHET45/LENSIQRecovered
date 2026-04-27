package p000;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.firestore.AbstractC3595a;
import com.google.firebase.firestore.C3596b;
import com.google.firebase.firestore.C3611n;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p000.p7e;

/* JADX INFO: renamed from: pj */
/* JADX INFO: loaded from: classes5.dex */
public class C10978pj {

    /* JADX INFO: renamed from: a */
    @efb
    public final C3611n f71041a;

    /* JADX INFO: renamed from: b */
    @efb
    public final List<AbstractC3595a> f71042b;

    public C10978pj(@efb C3611n c3611n, @efb List<AbstractC3595a> list) {
        this.f71041a = c3611n;
        this.f71042b = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task lambda$get$0(u06 u06Var) {
        return u06Var.runAggregateQuery(this.f71041a.f23591a, this.f71042b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$get$1(TaskCompletionSource taskCompletionSource, Task task) throws Exception {
        if (task.isSuccessful()) {
            taskCompletionSource.setResult(new C3596b(this, (Map) task.getResult()));
            return null;
        }
        taskCompletionSource.setException(task.getException());
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10978pj)) {
            return false;
        }
        C10978pj c10978pj = (C10978pj) obj;
        return this.f71041a.equals(c10978pj.f71041a) && this.f71042b.equals(c10978pj.f71042b);
    }

    @efb
    public Task<C3596b> get(@efb EnumC11487qj enumC11487qj) {
        x7d.checkNotNull(enumC11487qj, "AggregateSource must not be null");
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        ((Task) this.f71041a.f23592b.m6747o(new pz6() { // from class: nj
            @Override // p000.pz6
            public final Object apply(Object obj) {
                return this.f64699a.lambda$get$0((u06) obj);
            }
        })).continueWith(z85.f104372c, new Continuation() { // from class: oj
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                return this.f67782a.lambda$get$1(taskCompletionSource, task);
            }
        });
        return taskCompletionSource.getTask();
    }

    @efb
    @p7e({p7e.EnumC10826a.f69934a})
    public List<AbstractC3595a> getAggregateFields() {
        return this.f71042b;
    }

    @efb
    public C3611n getQuery() {
        return this.f71041a;
    }

    public int hashCode() {
        return Objects.hash(this.f71041a, this.f71042b);
    }
}
