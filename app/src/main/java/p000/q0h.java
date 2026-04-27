package p000;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes7.dex */
public interface q0h {

    /* JADX INFO: renamed from: a */
    public static final q0h f72713a = new C11243a();

    /* JADX INFO: renamed from: q0h$a */
    public class C11243a implements q0h {
        @Override // p000.q0h
        public long currentTimeNanos() {
            return TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
        }
    }

    long currentTimeNanos();
}
