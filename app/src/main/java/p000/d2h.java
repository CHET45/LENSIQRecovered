package p000;

import androidx.appcompat.widget.C0546a;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: loaded from: classes7.dex */
@xn8(name = "TimersKt")
public final class d2h {

    /* JADX INFO: renamed from: d2h$a */
    public static final class C4592a extends TimerTask {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ qy6<TimerTask, bth> f28295a;

        /* JADX WARN: Multi-variable type inference failed */
        public C4592a(qy6<? super TimerTask, bth> qy6Var) {
            this.f28295a = qy6Var;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            this.f28295a.invoke(this);
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Timer m8860a(String str, boolean z, long j, long j2, qy6 qy6Var, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            j = 0;
        }
        md8.checkNotNullParameter(qy6Var, "action");
        Timer timer = timer(str, z);
        timer.scheduleAtFixedRate(new C4592a(qy6Var), j, j2);
        return timer;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ Timer m8861b(String str, boolean z, Date date, long j, qy6 qy6Var, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        md8.checkNotNullParameter(date, "startAt");
        md8.checkNotNullParameter(qy6Var, "action");
        Timer timer = timer(str, z);
        timer.scheduleAtFixedRate(new C4592a(qy6Var), date, j);
        return timer;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ Timer m8862c(String str, boolean z, long j, long j2, qy6 qy6Var, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            j = 0;
        }
        md8.checkNotNullParameter(qy6Var, "action");
        Timer timer = timer(str, z);
        timer.schedule(new C4592a(qy6Var), j, j2);
        return timer;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ Timer m8863d(String str, boolean z, Date date, long j, qy6 qy6Var, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        md8.checkNotNullParameter(date, "startAt");
        md8.checkNotNullParameter(qy6Var, "action");
        Timer timer = timer(str, z);
        timer.schedule(new C4592a(qy6Var), date, j);
        return timer;
    }

    @t28
    private static final Timer fixedRateTimer(String str, boolean z, long j, long j2, qy6<? super TimerTask, bth> qy6Var) {
        md8.checkNotNullParameter(qy6Var, "action");
        Timer timer = timer(str, z);
        timer.scheduleAtFixedRate(new C4592a(qy6Var), j, j2);
        return timer;
    }

    @t28
    private static final TimerTask schedule(Timer timer, long j, qy6<? super TimerTask, bth> qy6Var) {
        md8.checkNotNullParameter(timer, "<this>");
        md8.checkNotNullParameter(qy6Var, "action");
        C4592a c4592a = new C4592a(qy6Var);
        timer.schedule(c4592a, j);
        return c4592a;
    }

    @t28
    private static final TimerTask scheduleAtFixedRate(Timer timer, long j, long j2, qy6<? super TimerTask, bth> qy6Var) {
        md8.checkNotNullParameter(timer, "<this>");
        md8.checkNotNullParameter(qy6Var, "action");
        C4592a c4592a = new C4592a(qy6Var);
        timer.scheduleAtFixedRate(c4592a, j, j2);
        return c4592a;
    }

    @yfb
    @yjd
    public static final Timer timer(@gib String str, boolean z) {
        return str == null ? new Timer(z) : new Timer(str, z);
    }

    @t28
    private static final TimerTask timerTask(qy6<? super TimerTask, bth> qy6Var) {
        md8.checkNotNullParameter(qy6Var, "action");
        return new C4592a(qy6Var);
    }

    @t28
    private static final Timer timer(String str, boolean z, long j, long j2, qy6<? super TimerTask, bth> qy6Var) {
        md8.checkNotNullParameter(qy6Var, "action");
        Timer timer = timer(str, z);
        timer.schedule(new C4592a(qy6Var), j, j2);
        return timer;
    }

    @t28
    private static final Timer fixedRateTimer(String str, boolean z, Date date, long j, qy6<? super TimerTask, bth> qy6Var) {
        md8.checkNotNullParameter(date, "startAt");
        md8.checkNotNullParameter(qy6Var, "action");
        Timer timer = timer(str, z);
        timer.scheduleAtFixedRate(new C4592a(qy6Var), date, j);
        return timer;
    }

    @t28
    private static final TimerTask schedule(Timer timer, Date date, qy6<? super TimerTask, bth> qy6Var) {
        md8.checkNotNullParameter(timer, "<this>");
        md8.checkNotNullParameter(date, C0546a.f3357s);
        md8.checkNotNullParameter(qy6Var, "action");
        C4592a c4592a = new C4592a(qy6Var);
        timer.schedule(c4592a, date);
        return c4592a;
    }

    @t28
    private static final TimerTask scheduleAtFixedRate(Timer timer, Date date, long j, qy6<? super TimerTask, bth> qy6Var) {
        md8.checkNotNullParameter(timer, "<this>");
        md8.checkNotNullParameter(date, C0546a.f3357s);
        md8.checkNotNullParameter(qy6Var, "action");
        C4592a c4592a = new C4592a(qy6Var);
        timer.scheduleAtFixedRate(c4592a, date, j);
        return c4592a;
    }

    @t28
    private static final Timer timer(String str, boolean z, Date date, long j, qy6<? super TimerTask, bth> qy6Var) {
        md8.checkNotNullParameter(date, "startAt");
        md8.checkNotNullParameter(qy6Var, "action");
        Timer timer = timer(str, z);
        timer.schedule(new C4592a(qy6Var), date, j);
        return timer;
    }

    @t28
    private static final TimerTask schedule(Timer timer, long j, long j2, qy6<? super TimerTask, bth> qy6Var) {
        md8.checkNotNullParameter(timer, "<this>");
        md8.checkNotNullParameter(qy6Var, "action");
        C4592a c4592a = new C4592a(qy6Var);
        timer.schedule(c4592a, j, j2);
        return c4592a;
    }

    @t28
    private static final TimerTask schedule(Timer timer, Date date, long j, qy6<? super TimerTask, bth> qy6Var) {
        md8.checkNotNullParameter(timer, "<this>");
        md8.checkNotNullParameter(date, C0546a.f3357s);
        md8.checkNotNullParameter(qy6Var, "action");
        C4592a c4592a = new C4592a(qy6Var);
        timer.schedule(c4592a, date, j);
        return c4592a;
    }
}
