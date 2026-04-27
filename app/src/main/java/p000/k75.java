package p000;

import com.blankj.utilcode.util.C2473f;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class k75 {

    /* JADX INFO: renamed from: a */
    public static final Throwable f52721a = new C8222a();

    /* JADX INFO: renamed from: k75$a */
    public static final class C8222a extends Throwable {
        private static final long serialVersionUID = -4649703670690200604L;

        public C8222a() {
            super("No further exceptions");
        }

        @Override // java.lang.Throwable
        public Throwable fillInStackTrace() {
            return this;
        }
    }

    private k75() {
        throw new IllegalStateException("No instances!");
    }

    public static boolean addThrowable(AtomicReference<Throwable> field, Throwable exception) {
        Throwable th;
        do {
            th = field.get();
            if (th == f52721a) {
                return false;
            }
        } while (!v7b.m23844a(field, th, th == null ? exception : new qm2(th, exception)));
        return true;
    }

    public static NullPointerException createNullPointerException(String prefix) {
        return new NullPointerException(nullWarning(prefix));
    }

    public static List<Throwable> flatten(Throwable t) {
        ArrayList arrayList = new ArrayList();
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.offer(t);
        while (!arrayDeque.isEmpty()) {
            Throwable th = (Throwable) arrayDeque.removeFirst();
            if (th instanceof qm2) {
                List<Throwable> exceptions = ((qm2) th).getExceptions();
                for (int size = exceptions.size() - 1; size >= 0; size--) {
                    arrayDeque.offerFirst(exceptions.get(size));
                }
            } else {
                arrayList.add(th);
            }
        }
        return arrayList;
    }

    public static <T> T nullCheck(T value, String prefix) {
        if (value != null) {
            return value;
        }
        throw createNullPointerException(prefix);
    }

    public static String nullWarning(String prefix) {
        return prefix + " Null values are generally not allowed in 3.x operators and sources.";
    }

    public static Throwable terminate(AtomicReference<Throwable> field) {
        Throwable th = field.get();
        Throwable th2 = f52721a;
        return th != th2 ? field.getAndSet(th2) : th;
    }

    public static <E extends Throwable> Exception throwIfThrowable(Throwable e) throws Throwable {
        if (e instanceof Exception) {
            return (Exception) e;
        }
        throw e;
    }

    public static String timeoutMessage(long timeout, TimeUnit unit) {
        return "The source did not signal an event for " + timeout + C2473f.f17566z + unit.toString().toLowerCase() + " and has been terminated.";
    }

    public static RuntimeException wrapOrThrow(Throwable error) {
        if (error instanceof Error) {
            throw ((Error) error);
        }
        return error instanceof RuntimeException ? (RuntimeException) error : new RuntimeException(error);
    }
}
