package p000;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import p000.a77;

/* JADX INFO: loaded from: classes7.dex */
public final class qm2 extends RuntimeException {
    private static final long serialVersionUID = 3026362227162912146L;

    /* JADX INFO: renamed from: a */
    public final List<Throwable> f74907a;

    /* JADX INFO: renamed from: b */
    public final String f74908b;

    /* JADX INFO: renamed from: c */
    public Throwable f74909c;

    /* JADX INFO: renamed from: qm2$a */
    public static final class C11549a extends RuntimeException {
        private static final long serialVersionUID = 3875212506787802066L;

        public C11549a(String message) {
            super(message);
        }

        @Override // java.lang.Throwable
        public synchronized Throwable fillInStackTrace() {
            return this;
        }
    }

    /* JADX INFO: renamed from: qm2$b */
    public static abstract class AbstractC11550b {
        /* JADX INFO: renamed from: a */
        public abstract AbstractC11550b mo20436a(Object o);
    }

    /* JADX INFO: renamed from: qm2$c */
    public static final class C11551c extends AbstractC11550b {

        /* JADX INFO: renamed from: a */
        public final PrintStream f74910a;

        public C11551c(PrintStream printStream) {
            this.f74910a = printStream;
        }

        @Override // p000.qm2.AbstractC11550b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C11551c mo20436a(Object o) {
            this.f74910a.print(o);
            return this;
        }
    }

    /* JADX INFO: renamed from: qm2$d */
    public static final class C11552d extends AbstractC11550b {

        /* JADX INFO: renamed from: a */
        public final PrintWriter f74911a;

        public C11552d(PrintWriter printWriter) {
            this.f74911a = printWriter;
        }

        @Override // p000.qm2.AbstractC11550b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C11552d mo20436a(Object o) {
            this.f74911a.print(o);
            return this;
        }
    }

    public qm2(@cfb Throwable... exceptions) {
        this(exceptions == null ? Collections.singletonList(new NullPointerException("exceptions was null")) : Arrays.asList(exceptions));
    }

    private void appendStackTrace(AbstractC11550b output, Throwable ex, String prefix) {
        output.mo20436a(prefix).mo20436a(ex).mo20436a('\n');
        for (StackTraceElement stackTraceElement : ex.getStackTrace()) {
            output.mo20436a("\t\tat ").mo20436a(stackTraceElement).mo20436a('\n');
        }
        if (ex.getCause() != null) {
            output.mo20436a("\tCaused by: ");
            appendStackTrace(output, ex.getCause(), "");
        }
    }

    @Override // java.lang.Throwable
    @cfb
    public synchronized Throwable getCause() {
        int i;
        try {
            if (this.f74909c == null) {
                String property = System.getProperty("line.separator");
                if (this.f74907a.size() > 1) {
                    IdentityHashMap identityHashMap = new IdentityHashMap();
                    StringBuilder sb = new StringBuilder();
                    sb.append("Multiple exceptions (");
                    sb.append(this.f74907a.size());
                    sb.append(c0b.f15434d);
                    sb.append(property);
                    for (Throwable cause : this.f74907a) {
                        int i2 = 0;
                        while (true) {
                            if (cause != null) {
                                for (int i3 = 0; i3 < i2; i3++) {
                                    sb.append(a77.C0077a.f542d);
                                }
                                sb.append("|-- ");
                                sb.append(cause.getClass().getCanonicalName());
                                sb.append(": ");
                                String message = cause.getMessage();
                                if (message == null || !message.contains(property)) {
                                    sb.append(message);
                                    sb.append(property);
                                } else {
                                    sb.append(property);
                                    for (String str : message.split(property)) {
                                        for (int i4 = 0; i4 < i2 + 2; i4++) {
                                            sb.append(a77.C0077a.f542d);
                                        }
                                        sb.append(str);
                                        sb.append(property);
                                    }
                                }
                                int i5 = 0;
                                while (true) {
                                    i = i2 + 2;
                                    if (i5 >= i) {
                                        break;
                                    }
                                    sb.append(a77.C0077a.f542d);
                                    i5++;
                                }
                                StackTraceElement[] stackTrace = cause.getStackTrace();
                                if (stackTrace.length > 0) {
                                    sb.append("at ");
                                    sb.append(stackTrace[0]);
                                    sb.append(property);
                                }
                                if (identityHashMap.containsKey(cause)) {
                                    Throwable cause2 = cause.getCause();
                                    if (cause2 != null) {
                                        for (int i6 = 0; i6 < i; i6++) {
                                            sb.append(a77.C0077a.f542d);
                                        }
                                        sb.append("|-- ");
                                        sb.append("(cause not expanded again) ");
                                        sb.append(cause2.getClass().getCanonicalName());
                                        sb.append(": ");
                                        sb.append(cause2.getMessage());
                                        sb.append(property);
                                    }
                                } else {
                                    identityHashMap.put(cause, Boolean.TRUE);
                                    cause = cause.getCause();
                                    i2++;
                                }
                            }
                        }
                    }
                    this.f74909c = new C11549a(sb.toString().trim());
                } else {
                    this.f74909c = this.f74907a.get(0);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f74909c;
    }

    @cfb
    public List<Throwable> getExceptions() {
        return this.f74907a;
    }

    @Override // java.lang.Throwable
    @cfb
    public String getMessage() {
        return this.f74908b;
    }

    @Override // java.lang.Throwable
    public void printStackTrace() {
        printStackTrace(System.err);
    }

    public int size() {
        return this.f74907a.size();
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream s) {
        printStackTrace(new C11551c(s));
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter s) {
        printStackTrace(new C11552d(s));
    }

    public qm2(@cfb Iterable<? extends Throwable> errors) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (errors != null) {
            for (Throwable th : errors) {
                if (th instanceof qm2) {
                    linkedHashSet.addAll(((qm2) th).getExceptions());
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
            List<Throwable> listUnmodifiableList = Collections.unmodifiableList(new ArrayList(linkedHashSet));
            this.f74907a = listUnmodifiableList;
            this.f74908b = listUnmodifiableList.size() + " exceptions occurred. ";
            return;
        }
        throw new IllegalArgumentException("errors is empty");
    }

    private void printStackTrace(AbstractC11550b output) {
        output.mo20436a(this).mo20436a("\n");
        for (StackTraceElement stackTraceElement : getStackTrace()) {
            output.mo20436a("\tat ").mo20436a(stackTraceElement).mo20436a("\n");
        }
        int i = 1;
        for (Throwable th : this.f74907a) {
            output.mo20436a("  ComposedException ").mo20436a(Integer.valueOf(i)).mo20436a(" :\n");
            appendStackTrace(output, th, "\t");
            i++;
        }
        output.mo20436a("\n");
    }
}
