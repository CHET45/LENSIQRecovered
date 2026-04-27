package p000;

/* JADX INFO: loaded from: classes6.dex */
public class w3e {

    /* JADX INFO: renamed from: a */
    public hu0 f93181a;

    /* JADX INFO: renamed from: b */
    public hu0 f93182b;

    public void addTaskToChain(hu0 hu0Var) {
        if (this.f93181a == null) {
            this.f93181a = hu0Var;
        }
        hu0 hu0Var2 = this.f93182b;
        if (hu0Var2 != null) {
            hu0Var2.f44870a = hu0Var;
        }
        this.f93182b = hu0Var;
    }

    public void runTask() {
        this.f93181a.request();
    }
}
