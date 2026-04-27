package p000;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes8.dex */
public class y45 extends r4i {

    /* JADX INFO: renamed from: a */
    public List<Throwable> f100322a = new ArrayList();

    /* JADX INFO: renamed from: y45$a */
    public class CallableC15487a implements Callable<Object> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f100323a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Object f100324b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ yv9 f100325c;

        public CallableC15487a(String str, Object obj, yv9 yv9Var) {
            this.f100323a = str;
            this.f100324b = obj;
            this.f100325c = yv9Var;
        }

        @Override // java.util.concurrent.Callable
        public Object call() throws Exception {
            q80.assertThat(this.f100323a, this.f100324b, this.f100325c);
            return this.f100324b;
        }
    }

    @Override // p000.r4i
    /* JADX INFO: renamed from: a */
    public void mo21016a() throws Exception {
        b4b.assertEmpty(this.f100322a);
    }

    public void addError(Throwable th) {
        this.f100322a.add(th);
    }

    public <T> T checkSucceeds(Callable<T> callable) {
        try {
            return callable.call();
        } catch (Throwable th) {
            addError(th);
            return null;
        }
    }

    public <T> void checkThat(T t, yv9<T> yv9Var) {
        checkThat("", t, yv9Var);
    }

    public <T> void checkThat(String str, T t, yv9<T> yv9Var) {
        checkSucceeds(new CallableC15487a(str, t, yv9Var));
    }
}
