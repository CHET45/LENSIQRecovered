package p000;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;
import p000.da8;

/* JADX INFO: loaded from: classes7.dex */
public final class zu1 {

    /* JADX INFO: renamed from: f */
    public static final Logger f106090f = Logger.getLogger(pu1.class.getName());

    /* JADX INFO: renamed from: a */
    public final Object f106091a = new Object();

    /* JADX INFO: renamed from: b */
    public final cb8 f106092b;

    /* JADX INFO: renamed from: c */
    @eib
    @vc7("lock")
    public final Collection<da8.C4686c.b> f106093c;

    /* JADX INFO: renamed from: d */
    public final long f106094d;

    /* JADX INFO: renamed from: e */
    @vc7("lock")
    public int f106095e;

    /* JADX INFO: renamed from: zu1$a */
    public class C16255a extends ArrayDeque<da8.C4686c.b> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f106096a;

        public C16255a(int i) {
            this.f106096a = i;
        }

        @Override // java.util.ArrayDeque, java.util.AbstractCollection, java.util.Collection, java.util.Deque, java.util.Queue
        @vc7("lock")
        public boolean add(da8.C4686c.b bVar) {
            if (size() == this.f106096a) {
                removeFirst();
            }
            zu1.m27088a(zu1.this);
            return super.add(bVar);
        }
    }

    /* JADX INFO: renamed from: zu1$b */
    public static /* synthetic */ class C16256b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f106098a;

        static {
            int[] iArr = new int[da8.C4686c.b.EnumC16427b.values().length];
            f106098a = iArr;
            try {
                iArr[da8.C4686c.b.EnumC16427b.CT_ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f106098a[da8.C4686c.b.EnumC16427b.CT_WARNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public zu1(cb8 cb8Var, int i, long j, String str) {
        v7d.checkNotNull(str, "description");
        this.f106092b = (cb8) v7d.checkNotNull(cb8Var, "logId");
        if (i > 0) {
            this.f106093c = new C16255a(i);
        } else {
            this.f106093c = null;
        }
        this.f106094d = j;
        m27092e(new da8.C4686c.b.a().setDescription(str + " created").setSeverity(da8.C4686c.b.EnumC16427b.CT_INFO).setTimestampNanos(j).build());
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ int m27088a(zu1 zu1Var) {
        int i = zu1Var.f106095e;
        zu1Var.f106095e = i + 1;
        return i;
    }

    /* JADX INFO: renamed from: d */
    public static void m27089d(cb8 cb8Var, Level level, String str) {
        Logger logger = f106090f;
        if (logger.isLoggable(level)) {
            LogRecord logRecord = new LogRecord(level, "[" + cb8Var + "] " + str);
            logRecord.setLoggerName(logger.getName());
            logRecord.setSourceClassName(logger.getName());
            logRecord.setSourceMethodName("log");
            logger.log(logRecord);
        }
    }

    /* JADX INFO: renamed from: b */
    public cb8 m27090b() {
        return this.f106092b;
    }

    /* JADX INFO: renamed from: c */
    public boolean m27091c() {
        boolean z;
        synchronized (this.f106091a) {
            z = this.f106093c != null;
        }
        return z;
    }

    /* JADX INFO: renamed from: e */
    public void m27092e(da8.C4686c.b bVar) {
        int i = C16256b.f106098a[bVar.f28946b.ordinal()];
        Level level = i != 1 ? i != 2 ? Level.FINEST : Level.FINER : Level.FINE;
        m27093f(bVar);
        m27089d(this.f106092b, level, bVar.f28945a);
    }

    /* JADX INFO: renamed from: f */
    public void m27093f(da8.C4686c.b bVar) {
        synchronized (this.f106091a) {
            try {
                Collection<da8.C4686c.b> collection = this.f106093c;
                if (collection != null) {
                    collection.add(bVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public void m27094g(da8.C4685b.a aVar) {
        synchronized (this.f106091a) {
            try {
                if (this.f106093c == null) {
                    return;
                }
                aVar.setChannelTrace(new da8.C4686c.a().setNumEventsLogged(this.f106095e).setCreationTimeNanos(this.f106094d).setEvents(new ArrayList(this.f106093c)).build());
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
