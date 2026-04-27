package p000;

/* JADX INFO: loaded from: classes6.dex */
public class o62<T> implements rb2 {

    /* JADX INFO: renamed from: a */
    public final String f66529a;

    /* JADX INFO: renamed from: b */
    public final lp7<T> f66530b;

    /* JADX INFO: renamed from: c */
    public final xp7<T> f66531c;

    public o62(String str, lp7<T> lp7Var, xp7<T> xp7Var) {
        if (xp7Var == null) {
            throw new NullPointerException("IHandleResult is null.");
        }
        this.f66529a = str;
        this.f66530b = lp7Var;
        this.f66531c = xp7Var;
    }

    @Override // p000.rb2
    public void onCommandResponse(ob2 ob2Var) {
        if (ob2Var.getStatus() != 0) {
            onErrCode(mjb.buildError(u45.f86792p, ob2Var.getStatus(), "status = " + ob2Var.getStatus()));
            return;
        }
        int iHasResult = this.f66531c.hasResult(ob2Var);
        if (iHasResult != 0) {
            onErrCode(mjb.buildError(u45.f86793q, iHasResult, "result = " + iHasResult));
            return;
        }
        T tHandleResult = this.f66531c.handleResult(ob2Var);
        lp7<T> lp7Var = this.f66530b;
        if (lp7Var != null) {
            lp7Var.onSuccess(tHandleResult);
        }
    }

    @Override // p000.rb2
    public void onErrCode(cr0 cr0Var) {
        lp7<T> lp7Var = this.f66530b;
        if (lp7Var != null) {
            lp7Var.onError(cr0Var);
        }
    }
}
