package p000;

import java.lang.Thread;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes5.dex */
@jd7
@qx4
@yg8
public final class txg {

    /* JADX INFO: renamed from: a */
    @wx1
    public String f86278a = null;

    /* JADX INFO: renamed from: b */
    @wx1
    public Boolean f86279b = null;

    /* JADX INFO: renamed from: c */
    @wx1
    public Integer f86280c = null;

    /* JADX INFO: renamed from: d */
    @wx1
    public Thread.UncaughtExceptionHandler f86281d = null;

    /* JADX INFO: renamed from: e */
    @wx1
    public ThreadFactory f86282e = null;

    /* JADX INFO: renamed from: txg$a */
    public class ThreadFactoryC13279a implements ThreadFactory {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ThreadFactory f86283a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f86284b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ AtomicLong f86285c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ Boolean f86286d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ Integer f86287e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ Thread.UncaughtExceptionHandler f86288f;

        public ThreadFactoryC13279a(final ThreadFactory val$backingThreadFactory, final String val$nameFormat, final AtomicLong val$count, final Boolean val$daemon, final Integer val$priority, final Thread.UncaughtExceptionHandler val$uncaughtExceptionHandler) {
            this.f86283a = val$backingThreadFactory;
            this.f86284b = val$nameFormat;
            this.f86285c = val$count;
            this.f86286d = val$daemon;
            this.f86287e = val$priority;
            this.f86288f = val$uncaughtExceptionHandler;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread threadNewThread = this.f86283a.newThread(runnable);
            Objects.requireNonNull(threadNewThread);
            String str = this.f86284b;
            if (str != null) {
                AtomicLong atomicLong = this.f86285c;
                Objects.requireNonNull(atomicLong);
                threadNewThread.setName(txg.format(str, Long.valueOf(atomicLong.getAndIncrement())));
            }
            Boolean bool = this.f86286d;
            if (bool != null) {
                threadNewThread.setDaemon(bool.booleanValue());
            }
            Integer num = this.f86287e;
            if (num != null) {
                threadNewThread.setPriority(num.intValue());
            }
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f86288f;
            if (uncaughtExceptionHandler != null) {
                threadNewThread.setUncaughtExceptionHandler(uncaughtExceptionHandler);
            }
            return threadNewThread;
        }
    }

    private static ThreadFactory doBuild(txg builder) {
        String str = builder.f86278a;
        Boolean bool = builder.f86279b;
        Integer num = builder.f86280c;
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = builder.f86281d;
        ThreadFactory threadFactoryDefaultThreadFactory = builder.f86282e;
        if (threadFactoryDefaultThreadFactory == null) {
            threadFactoryDefaultThreadFactory = Executors.defaultThreadFactory();
        }
        return new ThreadFactoryC13279a(threadFactoryDefaultThreadFactory, str, str != null ? new AtomicLong(0L) : null, bool, num, uncaughtExceptionHandler);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String format(String format, Object... args) {
        return String.format(Locale.ROOT, format, args);
    }

    public ThreadFactory build() {
        return doBuild(this);
    }

    @op1
    public txg setDaemon(boolean daemon) {
        this.f86279b = Boolean.valueOf(daemon);
        return this;
    }

    @op1
    public txg setNameFormat(String nameFormat) {
        format(nameFormat, 0);
        this.f86278a = nameFormat;
        return this;
    }

    @op1
    public txg setPriority(int priority) {
        v7d.checkArgument(priority >= 1, "Thread priority (%s) must be >= %s", priority, 1);
        v7d.checkArgument(priority <= 10, "Thread priority (%s) must be <= %s", priority, 10);
        this.f86280c = Integer.valueOf(priority);
        return this;
    }

    @op1
    public txg setThreadFactory(ThreadFactory backingThreadFactory) {
        this.f86282e = (ThreadFactory) v7d.checkNotNull(backingThreadFactory);
        return this;
    }

    @op1
    public txg setUncaughtExceptionHandler(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f86281d = (Thread.UncaughtExceptionHandler) v7d.checkNotNull(uncaughtExceptionHandler);
        return this;
    }
}
