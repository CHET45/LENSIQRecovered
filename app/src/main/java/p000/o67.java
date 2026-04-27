package p000;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: loaded from: classes8.dex */
public final class o67 extends ScheduledThreadPoolExecutor {

    /* JADX INFO: renamed from: o67$b */
    public static final class C10206b {

        /* JADX INFO: renamed from: a */
        public static final o67 f66547a = new o67();

        private C10206b() {
        }
    }

    /* JADX INFO: renamed from: a */
    public static o67 m18382a() {
        return C10206b.f66547a;
    }

    private o67() {
        super(1, new ThreadPoolExecutor.DiscardPolicy());
    }
}
