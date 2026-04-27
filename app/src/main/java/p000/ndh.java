package p000;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.firestore.C3603f;
import p000.ga0;

/* JADX INFO: loaded from: classes5.dex */
public class ndh<TResult> {

    /* JADX INFO: renamed from: a */
    public ga0 f64079a;

    /* JADX INFO: renamed from: b */
    public wyd f64080b;

    /* JADX INFO: renamed from: c */
    public pz6<cdh, Task<TResult>> f64081c;

    /* JADX INFO: renamed from: d */
    public int f64082d;

    /* JADX INFO: renamed from: e */
    public hi5 f64083e;

    /* JADX INFO: renamed from: f */
    public TaskCompletionSource<TResult> f64084f = new TaskCompletionSource<>();

    public ndh(ga0 ga0Var, wyd wydVar, hdh hdhVar, pz6<cdh, Task<TResult>> pz6Var) {
        this.f64079a = ga0Var;
        this.f64080b = wydVar;
        this.f64081c = pz6Var;
        this.f64082d = hdhVar.getMaxAttempts();
        this.f64083e = new hi5(ga0Var, ga0.EnumC6181d.RETRY_TRANSACTION);
    }

    private void handleTransactionError(Task task) {
        if (this.f64082d <= 0 || !isRetryableTransactionError(task.getException())) {
            this.f64084f.setException(task.getException());
        } else {
            runWithBackoff();
        }
    }

    private static boolean isRetryableTransactionError(Exception exc) {
        if (!(exc instanceof C3603f)) {
            return false;
        }
        C3603f c3603f = (C3603f) exc;
        C3603f.a code = c3603f.getCode();
        return code == C3603f.a.ABORTED || code == C3603f.a.ALREADY_EXISTS || code == C3603f.a.FAILED_PRECONDITION || !zi3.isPermanentError(c3603f.getCode());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$runWithBackoff$0(Task task, Task task2) {
        if (task2.isSuccessful()) {
            this.f64084f.setResult((TResult) task.getResult());
        } else {
            handleTransactionError(task2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$runWithBackoff$1(cdh cdhVar, final Task task) {
        if (task.isSuccessful()) {
            cdhVar.commit().addOnCompleteListener(this.f64079a.getExecutor(), new OnCompleteListener() { // from class: kdh
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task2) {
                    this.f53673a.lambda$runWithBackoff$0(task, task2);
                }
            });
        } else {
            handleTransactionError(task);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$runWithBackoff$2() {
        final cdh cdhVarCreateTransaction = this.f64080b.createTransaction();
        this.f64081c.apply(cdhVarCreateTransaction).addOnCompleteListener(this.f64079a.getExecutor(), new OnCompleteListener() { // from class: ldh
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                this.f57287a.lambda$runWithBackoff$1(cdhVarCreateTransaction, task);
            }
        });
    }

    private void runWithBackoff() {
        this.f64082d--;
        this.f64083e.backoffAndRun(new Runnable() { // from class: mdh
            @Override // java.lang.Runnable
            public final void run() {
                this.f60717a.lambda$runWithBackoff$2();
            }
        });
    }

    public Task<TResult> run() {
        runWithBackoff();
        return this.f64084f.getTask();
    }
}
