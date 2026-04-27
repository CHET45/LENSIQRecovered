package p000;

/* JADX INFO: loaded from: classes4.dex */
public final class k8e {
    private k8e() {
    }

    public static <TInput, TResult, TException extends Throwable> TResult retry(int i, TInput tinput, hz6<TInput, TResult, TException> hz6Var, w8e<TInput, TResult> w8eVar) throws Throwable {
        TResult tresultApply;
        if (i < 1) {
            return hz6Var.apply(tinput);
        }
        do {
            tresultApply = hz6Var.apply(tinput);
            tinput = w8eVar.shouldRetry(tinput, tresultApply);
            if (tinput == null) {
                break;
            }
            i--;
        } while (i >= 1);
        return tresultApply;
    }
}
