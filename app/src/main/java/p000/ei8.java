package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p000.vu5;

/* JADX INFO: loaded from: classes8.dex */
public class ei8 {

    /* JADX INFO: renamed from: a */
    public final List<String> f33077a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public final List<Class<?>> f33078b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public final List<Throwable> f33079c = new ArrayList();

    /* JADX INFO: renamed from: ei8$a */
    public static class C5320a extends Exception {
        private static final long serialVersionUID = 1;

        public C5320a(String str) {
            super(str);
        }
    }

    private o3e applyFilterSpecs(o3e o3eVar) {
        try {
            Iterator<String> it = this.f33077a.iterator();
            while (it.hasNext()) {
                o3eVar = o3eVar.filterWith(uu5.createFilterFromFilterSpec(o3eVar, it.next()));
            }
            return o3eVar;
        } catch (vu5.C14261a e) {
            return errorReport(e);
        }
    }

    private String[] copyArray(String[] strArr, int i, int i2) {
        ArrayList arrayList = new ArrayList();
        while (i != i2) {
            arrayList.add(strArr[i]);
            i++;
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    private o3e errorReport(Throwable th) {
        return o3e.errorReport(ei8.class, th);
    }

    public static ei8 parse(String[] strArr) {
        ei8 ei8Var = new ei8();
        ei8Var.parseArgs(strArr);
        return ei8Var;
    }

    private void parseArgs(String[] strArr) {
        m9991b(m9990a(strArr));
    }

    /* JADX INFO: renamed from: a */
    public String[] m9990a(String... strArr) {
        String strSubstring;
        int i = 0;
        while (true) {
            if (i == strArr.length) {
                break;
            }
            String str = strArr[i];
            if (str.equals("--")) {
                return copyArray(strArr, i + 1, strArr.length);
            }
            if (!str.startsWith("--")) {
                return copyArray(strArr, i, strArr.length);
            }
            if (str.startsWith("--filter=") || str.equals("--filter")) {
                if (str.equals("--filter")) {
                    i++;
                    if (i >= strArr.length) {
                        this.f33079c.add(new C5320a(str + " value not specified"));
                        break;
                    }
                    strSubstring = strArr[i];
                } else {
                    strSubstring = str.substring(str.indexOf(61) + 1);
                }
                this.f33077a.add(strSubstring);
            } else {
                this.f33079c.add(new C5320a("JUnit knows nothing about the " + str + " option"));
            }
            i++;
        }
        return new String[0];
    }

    /* JADX INFO: renamed from: b */
    public void m9991b(String[] strArr) {
        for (String str : strArr) {
            try {
                this.f33078b.add(v12.getClass(str));
            } catch (ClassNotFoundException e) {
                this.f33079c.add(new IllegalArgumentException("Could not find class [" + str + "]", e));
            }
        }
    }

    public o3e createRequest(vo2 vo2Var) {
        if (!this.f33079c.isEmpty()) {
            return errorReport(new o18(this.f33079c));
        }
        List<Class<?>> list = this.f33078b;
        return applyFilterSpecs(o3e.classes(vo2Var, (Class[]) list.toArray(new Class[list.size()])));
    }

    public List<Class<?>> getClasses() {
        return Collections.unmodifiableList(this.f33078b);
    }

    public List<String> getFilterSpecs() {
        return Collections.unmodifiableList(this.f33077a);
    }
}
