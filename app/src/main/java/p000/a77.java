package p000;

import android.util.Log;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class a77 extends Exception {

    /* JADX INFO: renamed from: m */
    public static final StackTraceElement[] f534m = new StackTraceElement[0];
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: a */
    public final List<Throwable> f535a;

    /* JADX INFO: renamed from: b */
    public eq8 f536b;

    /* JADX INFO: renamed from: c */
    public hh3 f537c;

    /* JADX INFO: renamed from: d */
    public Class<?> f538d;

    /* JADX INFO: renamed from: e */
    public String f539e;

    /* JADX INFO: renamed from: f */
    @hib
    public Exception f540f;

    public a77(String str) {
        this(str, (List<Throwable>) Collections.emptyList());
    }

    private void addRootCauses(Throwable th, List<Throwable> list) {
        if (!(th instanceof a77)) {
            list.add(th);
            return;
        }
        Iterator<Throwable> it = ((a77) th).getCauses().iterator();
        while (it.hasNext()) {
            addRootCauses(it.next(), list);
        }
    }

    private static void appendCauses(List<Throwable> list, Appendable appendable) {
        try {
            appendCausesWrapped(list, appendable);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void appendCausesWrapped(List<Throwable> list, Appendable appendable) throws IOException {
        int size = list.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            appendable.append("Cause (").append(String.valueOf(i2)).append(" of ").append(String.valueOf(size)).append("): ");
            Throwable th = list.get(i);
            if (th instanceof a77) {
                ((a77) th).printStackTrace(appendable);
            } else {
                appendExceptionMessage(th, appendable);
            }
            i = i2;
        }
    }

    private static void appendExceptionMessage(Throwable th, Appendable appendable) {
        try {
            appendable.append(th.getClass().toString()).append(": ").append(th.getMessage()).append('\n');
        } catch (IOException unused) {
            throw new RuntimeException(th);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m173a(eq8 eq8Var, hh3 hh3Var) {
        m174b(eq8Var, hh3Var, null);
    }

    /* JADX INFO: renamed from: b */
    public void m174b(eq8 eq8Var, hh3 hh3Var, Class<?> cls) {
        this.f536b = eq8Var;
        this.f537c = hh3Var;
        this.f538d = cls;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        return this;
    }

    public List<Throwable> getCauses() {
        return this.f535a;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        StringBuilder sb = new StringBuilder(71);
        sb.append(this.f539e);
        sb.append(this.f538d != null ? ", " + this.f538d : "");
        sb.append(this.f537c != null ? ", " + this.f537c : "");
        sb.append(this.f536b != null ? ", " + this.f536b : "");
        List<Throwable> rootCauses = getRootCauses();
        if (rootCauses.isEmpty()) {
            return sb.toString();
        }
        if (rootCauses.size() == 1) {
            sb.append("\nThere was 1 root cause:");
        } else {
            sb.append("\nThere were ");
            sb.append(rootCauses.size());
            sb.append(" root causes:");
        }
        for (Throwable th : rootCauses) {
            sb.append('\n');
            sb.append(th.getClass().getName());
            sb.append('(');
            sb.append(th.getMessage());
            sb.append(')');
        }
        sb.append("\n call GlideException#logRootCauses(String) for more detail");
        return sb.toString();
    }

    @hib
    public Exception getOrigin() {
        return this.f540f;
    }

    public List<Throwable> getRootCauses() {
        ArrayList arrayList = new ArrayList();
        addRootCauses(this, arrayList);
        return arrayList;
    }

    public void logRootCauses(String str) {
        List<Throwable> rootCauses = getRootCauses();
        int size = rootCauses.size();
        int i = 0;
        while (i < size) {
            StringBuilder sb = new StringBuilder();
            sb.append("Root cause (");
            int i2 = i + 1;
            sb.append(i2);
            sb.append(" of ");
            sb.append(size);
            sb.append(c0b.f15434d);
            Log.i(str, sb.toString(), rootCauses.get(i));
            i = i2;
        }
    }

    @Override // java.lang.Throwable
    public void printStackTrace() {
        printStackTrace(System.err);
    }

    public void setOrigin(@hib Exception exc) {
        this.f540f = exc;
    }

    public a77(String str, Throwable th) {
        this(str, (List<Throwable>) Collections.singletonList(th));
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream printStream) {
        printStackTrace((Appendable) printStream);
    }

    public a77(String str, List<Throwable> list) {
        this.f539e = str;
        setStackTrace(f534m);
        this.f535a = list;
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter printWriter) {
        printStackTrace((Appendable) printWriter);
    }

    private void printStackTrace(Appendable appendable) {
        appendExceptionMessage(this, appendable);
        appendCauses(getCauses(), new C0077a(appendable));
    }

    /* JADX INFO: renamed from: a77$a */
    public static final class C0077a implements Appendable {

        /* JADX INFO: renamed from: c */
        public static final String f541c = "";

        /* JADX INFO: renamed from: d */
        public static final String f542d = "  ";

        /* JADX INFO: renamed from: a */
        public final Appendable f543a;

        /* JADX INFO: renamed from: b */
        public boolean f544b = true;

        public C0077a(Appendable appendable) {
            this.f543a = appendable;
        }

        @efb
        private CharSequence safeSequence(@hib CharSequence charSequence) {
            return charSequence == null ? "" : charSequence;
        }

        @Override // java.lang.Appendable
        public Appendable append(char c) throws IOException {
            if (this.f544b) {
                this.f544b = false;
                this.f543a.append(f542d);
            }
            this.f544b = c == '\n';
            this.f543a.append(c);
            return this;
        }

        @Override // java.lang.Appendable
        public Appendable append(@hib CharSequence charSequence) throws IOException {
            CharSequence charSequenceSafeSequence = safeSequence(charSequence);
            return append(charSequenceSafeSequence, 0, charSequenceSafeSequence.length());
        }

        @Override // java.lang.Appendable
        public Appendable append(@hib CharSequence charSequence, int i, int i2) throws IOException {
            CharSequence charSequenceSafeSequence = safeSequence(charSequence);
            boolean z = false;
            if (this.f544b) {
                this.f544b = false;
                this.f543a.append(f542d);
            }
            if (charSequenceSafeSequence.length() > 0 && charSequenceSafeSequence.charAt(i2 - 1) == '\n') {
                z = true;
            }
            this.f544b = z;
            this.f543a.append(charSequenceSafeSequence, i, i2);
            return this;
        }
    }
}
