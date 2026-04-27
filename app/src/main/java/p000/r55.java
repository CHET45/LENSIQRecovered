package p000;

import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes5.dex */
@vx4
public class r55 {

    /* JADX INFO: renamed from: f */
    public static final Logger f77069f = Logger.getLogger(r55.class.getName());

    /* JADX INFO: renamed from: a */
    public final String f77070a;

    /* JADX INFO: renamed from: b */
    public final Executor f77071b;

    /* JADX INFO: renamed from: c */
    public final bdg f77072c;

    /* JADX INFO: renamed from: d */
    public final cdg f77073d;

    /* JADX INFO: renamed from: e */
    public final af4 f77074e;

    /* JADX INFO: renamed from: r55$a */
    public static final class C11893a implements bdg {

        /* JADX INFO: renamed from: a */
        public static final C11893a f77075a = new C11893a();

        private static Logger logger(adg context) {
            return Logger.getLogger(r55.class.getName() + "." + context.getEventBus().identifier());
        }

        private static String message(adg context) {
            Method subscriberMethod = context.getSubscriberMethod();
            return "Exception thrown by subscriber method " + subscriberMethod.getName() + '(' + subscriberMethod.getParameterTypes()[0].getName() + ") on subscriber " + context.getSubscriber() + " when dispatching event: " + context.getEvent();
        }

        @Override // p000.bdg
        public void handleException(Throwable exception, adg context) {
            Logger logger = logger(context);
            Level level = Level.SEVERE;
            if (logger.isLoggable(level)) {
                logger.log(level, message(context), exception);
            }
        }
    }

    public r55() {
        this("default");
    }

    /* JADX INFO: renamed from: a */
    public final Executor m21018a() {
        return this.f77071b;
    }

    /* JADX INFO: renamed from: b */
    public void m21019b(Throwable e, adg context) {
        v7d.checkNotNull(e);
        v7d.checkNotNull(context);
        try {
            this.f77072c.handleException(e, context);
        } catch (Throwable th) {
            f77069f.log(Level.SEVERE, String.format(Locale.ROOT, "Exception %s thrown while handling exception: %s", th, e), th);
        }
    }

    public final String identifier() {
        return this.f77070a;
    }

    public void post(Object event) {
        Iterator<vcg> itM3906c = this.f77073d.m3906c(event);
        if (itM3906c.hasNext()) {
            this.f77074e.mo472a(event, itM3906c);
        } else {
            if (event instanceof qj3) {
                return;
            }
            post(new qj3(this, event));
        }
    }

    public void register(Object object) {
        this.f77073d.m3908e(object);
    }

    public String toString() {
        return yya.toStringHelper(this).addValue(this.f77070a).toString();
    }

    public void unregister(Object object) {
        this.f77073d.m3909f(object);
    }

    public r55(String identifier) {
        this(identifier, xya.directExecutor(), af4.m471d(), C11893a.f77075a);
    }

    public r55(bdg exceptionHandler) {
        this("default", xya.directExecutor(), af4.m471d(), exceptionHandler);
    }

    public r55(String identifier, Executor executor, af4 dispatcher, bdg exceptionHandler) {
        this.f77073d = new cdg(this);
        this.f77070a = (String) v7d.checkNotNull(identifier);
        this.f77071b = (Executor) v7d.checkNotNull(executor);
        this.f77074e = (af4) v7d.checkNotNull(dispatcher);
        this.f77072c = (bdg) v7d.checkNotNull(exceptionHandler);
    }
}
