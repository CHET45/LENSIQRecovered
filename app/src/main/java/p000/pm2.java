package p000;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class pm2 extends RuntimeException {
    private static final long serialVersionUID = 3026362227162912146L;

    /* JADX INFO: renamed from: a */
    public final List<Throwable> f71368a;

    /* JADX INFO: renamed from: b */
    public final String f71369b;

    /* JADX INFO: renamed from: c */
    public Throwable f71370c;

    /* JADX INFO: renamed from: pm2$a */
    public static final class C11021a extends RuntimeException {

        /* JADX INFO: renamed from: a */
        public static final String f71371a = "Chain of Causes for CompositeException In Order Received =>";
        private static final long serialVersionUID = 3875212506787802066L;

        @Override // java.lang.Throwable
        public String getMessage() {
            return f71371a;
        }
    }

    /* JADX INFO: renamed from: pm2$b */
    public static abstract class AbstractC11022b {
        /* JADX INFO: renamed from: a */
        public abstract void mo19614a(Object obj);
    }

    /* JADX INFO: renamed from: pm2$c */
    public static final class C11023c extends AbstractC11022b {

        /* JADX INFO: renamed from: a */
        public final PrintStream f71372a;

        public C11023c(PrintStream printStream) {
            this.f71372a = printStream;
        }

        @Override // p000.pm2.AbstractC11022b
        /* JADX INFO: renamed from: a */
        public void mo19614a(Object obj) {
            this.f71372a.println(obj);
        }
    }

    /* JADX INFO: renamed from: pm2$d */
    public static final class C11024d extends AbstractC11022b {

        /* JADX INFO: renamed from: a */
        public final PrintWriter f71373a;

        public C11024d(PrintWriter printWriter) {
            this.f71373a = printWriter;
        }

        @Override // p000.pm2.AbstractC11022b
        /* JADX INFO: renamed from: a */
        public void mo19614a(Object obj) {
            this.f71373a.println(obj);
        }
    }

    public pm2(@bfb Throwable... thArr) {
        this(thArr == null ? Collections.singletonList(new NullPointerException("exceptions was null")) : Arrays.asList(thArr));
    }

    private void appendStackTrace(StringBuilder sb, Throwable th, String str) {
        sb.append(str);
        sb.append(th);
        sb.append('\n');
        for (StackTraceElement stackTraceElement : th.getStackTrace()) {
            sb.append("\t\tat ");
            sb.append(stackTraceElement);
            sb.append('\n');
        }
        if (th.getCause() != null) {
            sb.append("\tCaused by: ");
            appendStackTrace(sb, th.getCause(), "");
        }
    }

    private List<Throwable> getListOfCauses(Throwable th) {
        ArrayList arrayList = new ArrayList();
        Throwable cause = th.getCause();
        if (cause != null && cause != th) {
            while (true) {
                arrayList.add(cause);
                Throwable cause2 = cause.getCause();
                if (cause2 == null || cause2 == cause) {
                    break;
                }
                cause = cause2;
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    public Throwable m19613a(Throwable th) {
        Throwable cause = th.getCause();
        if (cause == null || th == cause) {
            return th;
        }
        while (true) {
            Throwable cause2 = cause.getCause();
            if (cause2 == null || cause2 == cause) {
                break;
            }
            cause = cause2;
        }
        return cause;
    }

    @Override // java.lang.Throwable
    @bfb
    public synchronized Throwable getCause() {
        try {
            if (this.f71370c == null) {
                C11021a c11021a = new C11021a();
                HashSet hashSet = new HashSet();
                Iterator<Throwable> it = this.f71368a.iterator();
                Throwable thM19613a = c11021a;
                while (it.hasNext()) {
                    Throwable next = it.next();
                    if (!hashSet.contains(next)) {
                        hashSet.add(next);
                        for (Throwable th : getListOfCauses(next)) {
                            if (hashSet.contains(th)) {
                                next = new RuntimeException("Duplicate found in causal chain so cropping to prevent loop ...");
                            } else {
                                hashSet.add(th);
                            }
                        }
                        try {
                            thM19613a.initCause(next);
                        } catch (Throwable unused) {
                        }
                        thM19613a = m19613a(thM19613a);
                    }
                }
                this.f71370c = c11021a;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f71370c;
    }

    @bfb
    public List<Throwable> getExceptions() {
        return this.f71368a;
    }

    @Override // java.lang.Throwable
    @bfb
    public String getMessage() {
        return this.f71369b;
    }

    @Override // java.lang.Throwable
    public void printStackTrace() {
        printStackTrace(System.err);
    }

    public int size() {
        return this.f71368a.size();
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream printStream) {
        printStackTrace(new C11023c(printStream));
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter printWriter) {
        printStackTrace(new C11024d(printWriter));
    }

    public pm2(@bfb Iterable<? extends Throwable> iterable) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList = new ArrayList();
        if (iterable != null) {
            for (Throwable th : iterable) {
                if (th instanceof pm2) {
                    linkedHashSet.addAll(((pm2) th).getExceptions());
                } else if (th != null) {
                    linkedHashSet.add(th);
                } else {
                    linkedHashSet.add(new NullPointerException("Throwable was null!"));
                }
            }
        } else {
            linkedHashSet.add(new NullPointerException("errors was null"));
        }
        if (!linkedHashSet.isEmpty()) {
            arrayList.addAll(linkedHashSet);
            List<Throwable> listUnmodifiableList = Collections.unmodifiableList(arrayList);
            this.f71368a = listUnmodifiableList;
            this.f71369b = listUnmodifiableList.size() + " exceptions occurred. ";
            return;
        }
        throw new IllegalArgumentException("errors is empty");
    }

    private void printStackTrace(AbstractC11022b abstractC11022b) {
        StringBuilder sb = new StringBuilder(128);
        sb.append(this);
        sb.append('\n');
        for (StackTraceElement stackTraceElement : getStackTrace()) {
            sb.append("\tat ");
            sb.append(stackTraceElement);
            sb.append('\n');
        }
        int i = 1;
        for (Throwable th : this.f71368a) {
            sb.append("  ComposedException ");
            sb.append(i);
            sb.append(" :\n");
            appendStackTrace(sb, th, "\t");
            i++;
        }
        abstractC11022b.mo19614a(sb.toString());
    }
}
