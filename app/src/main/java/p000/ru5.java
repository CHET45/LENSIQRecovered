package p000;

import java.util.Iterator;

/* JADX INFO: loaded from: classes8.dex */
public abstract class ru5 {

    /* JADX INFO: renamed from: a */
    public static final ru5 f79608a = new C12292c();

    /* JADX INFO: renamed from: ru5$a */
    public static class C12290a extends ru5 {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ j74 f79609b;

        public C12290a(j74 j74Var) {
            this.f79609b = j74Var;
        }

        @Override // p000.ru5
        public String describe() {
            return String.format("Method %s", this.f79609b.getDisplayName());
        }

        @Override // p000.ru5
        public boolean shouldRun(j74 j74Var) {
            if (j74Var.isTest()) {
                return this.f79609b.equals(j74Var);
            }
            Iterator<j74> it = j74Var.getChildren().iterator();
            while (it.hasNext()) {
                if (shouldRun(it.next())) {
                    return true;
                }
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: ru5$b */
    public class C12291b extends ru5 {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ru5 f79610b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ ru5 f79611c;

        public C12291b(ru5 ru5Var, ru5 ru5Var2) {
            this.f79610b = ru5Var;
            this.f79611c = ru5Var2;
        }

        @Override // p000.ru5
        public String describe() {
            return this.f79610b.describe() + " and " + this.f79611c.describe();
        }

        @Override // p000.ru5
        public boolean shouldRun(j74 j74Var) {
            return this.f79610b.shouldRun(j74Var) && this.f79611c.shouldRun(j74Var);
        }
    }

    /* JADX INFO: renamed from: ru5$c */
    public static class C12292c extends ru5 {
        @Override // p000.ru5
        public void apply(Object obj) throws aeb {
        }

        @Override // p000.ru5
        public String describe() {
            return "all tests";
        }

        @Override // p000.ru5
        public ru5 intersect(ru5 ru5Var) {
            return ru5Var;
        }

        @Override // p000.ru5
        public boolean shouldRun(j74 j74Var) {
            return true;
        }
    }

    public static ru5 matchMethodDescription(j74 j74Var) {
        return new C12290a(j74Var);
    }

    public void apply(Object obj) throws aeb {
        if (obj instanceof zu5) {
            ((zu5) obj).filter(this);
        }
    }

    public abstract String describe();

    public ru5 intersect(ru5 ru5Var) {
        return (ru5Var == this || ru5Var == f79608a) ? this : new C12291b(this, ru5Var);
    }

    public abstract boolean shouldRun(j74 j74Var);
}
