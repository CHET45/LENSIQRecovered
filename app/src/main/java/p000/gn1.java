package p000;

import android.text.TextUtils;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class gn1 implements Serializable, Comparable<gn1> {
    private static final long serialVersionUID = 141315161718191143L;

    /* JADX INFO: renamed from: C */
    public String f40310C;

    /* JADX INFO: renamed from: F */
    public String f40311F;

    /* JADX INFO: renamed from: H */
    public String f40312H;

    /* JADX INFO: renamed from: L */
    public String f40313L;

    /* JADX INFO: renamed from: M */
    public String f40314M;

    /* JADX INFO: renamed from: N */
    public int f40315N;

    /* JADX INFO: renamed from: Q */
    public List<C6432a> f40316Q;

    /* JADX INFO: renamed from: X */
    public boolean f40317X;

    /* JADX INFO: renamed from: Y */
    public int f40318Y;

    /* JADX INFO: renamed from: Z */
    public gn1 f40319Z;

    /* JADX INFO: renamed from: a */
    public int f40320a;

    /* JADX INFO: renamed from: b */
    public int f40321b;

    /* JADX INFO: renamed from: c */
    public int f40322c;

    /* JADX INFO: renamed from: d */
    public int f40323d;

    /* JADX INFO: renamed from: e */
    public boolean f40324e;

    /* JADX INFO: renamed from: f */
    public boolean f40325f;

    /* JADX INFO: renamed from: m */
    public boolean f40326m;

    /* JADX INFO: renamed from: gn1$a */
    public static final class C6432a implements Serializable {

        /* JADX INFO: renamed from: a */
        public int f40327a;

        /* JADX INFO: renamed from: b */
        public int f40328b;

        /* JADX INFO: renamed from: c */
        public String f40329c;

        /* JADX INFO: renamed from: d */
        public String f40330d;

        /* JADX INFO: renamed from: e */
        public Object f40331e;

        public C6432a() {
        }

        public Object getObj() {
            return this.f40331e;
        }

        public String getOther() {
            return this.f40330d;
        }

        public String getScheme() {
            return this.f40329c;
        }

        public int getShcemeColor() {
            return this.f40328b;
        }

        public int getType() {
            return this.f40327a;
        }

        public void setObj(Object obj) {
            this.f40331e = obj;
        }

        public void setOther(String str) {
            this.f40330d = str;
        }

        public void setScheme(String str) {
            this.f40329c = str;
        }

        public void setShcemeColor(int i) {
            this.f40328b = i;
        }

        public void setType(int i) {
            this.f40327a = i;
        }

        public C6432a(int i, int i2, String str, String str2) {
            this.f40327a = i;
            this.f40328b = i2;
            this.f40329c = str;
            this.f40330d = str2;
        }

        public C6432a(int i, int i2, String str) {
            this.f40327a = i;
            this.f40328b = i2;
            this.f40329c = str;
        }

        public C6432a(int i, String str) {
            this.f40328b = i;
            this.f40329c = str;
        }

        public C6432a(int i, String str, String str2) {
            this.f40328b = i;
            this.f40329c = str;
            this.f40330d = str2;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m11785a() {
        setScheme("");
        setSchemeColor(0);
        setSchemes(null);
    }

    public void addScheme(C6432a c6432a) {
        if (this.f40316Q == null) {
            this.f40316Q = new ArrayList();
        }
        this.f40316Q.add(c6432a);
    }

    /* JADX INFO: renamed from: b */
    public final void m11786b(gn1 gn1Var, String str) {
        if (gn1Var == null) {
            return;
        }
        if (!TextUtils.isEmpty(gn1Var.getScheme())) {
            str = gn1Var.getScheme();
        }
        setScheme(str);
        setSchemeColor(gn1Var.getSchemeColor());
        setSchemes(gn1Var.getSchemes());
    }

    public final int differ(gn1 gn1Var) {
        return mn1.m17448b(this, gn1Var);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof gn1)) {
            gn1 gn1Var = (gn1) obj;
            if (gn1Var.getYear() == this.f40320a && gn1Var.getMonth() == this.f40321b && gn1Var.getDay() == this.f40323d) {
                return true;
            }
        }
        return super.equals(obj);
    }

    public int getDay() {
        return this.f40323d;
    }

    public String getGregorianFestival() {
        return this.f40312H;
    }

    public int getLeapMonth() {
        return this.f40322c;
    }

    public String getLunar() {
        return this.f40310C;
    }

    public gn1 getLunarCalendar() {
        return this.f40319Z;
    }

    public int getMonth() {
        return this.f40321b;
    }

    public String getScheme() {
        return this.f40314M;
    }

    public int getSchemeColor() {
        return this.f40315N;
    }

    public List<C6432a> getSchemes() {
        return this.f40316Q;
    }

    public String getSolarTerm() {
        return this.f40311F;
    }

    public long getTimeInMillis() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(1, this.f40320a);
        calendar.set(2, this.f40321b - 1);
        calendar.set(5, this.f40323d);
        return calendar.getTimeInMillis();
    }

    public String getTraditionFestival() {
        return this.f40313L;
    }

    public int getWeek() {
        return this.f40318Y;
    }

    public int getYear() {
        return this.f40320a;
    }

    public boolean hasScheme() {
        List<C6432a> list = this.f40316Q;
        return ((list == null || list.size() == 0) && TextUtils.isEmpty(this.f40314M)) ? false : true;
    }

    public boolean isAvailable() {
        int i = this.f40320a;
        boolean z = i > 0;
        int i2 = this.f40321b;
        boolean z2 = z & (i2 > 0);
        int i3 = this.f40323d;
        return z2 & (i3 > 0) & (i3 <= 31) & (i2 <= 12) & (i >= 1900) & (i <= 2099);
    }

    public boolean isCurrentDay() {
        return this.f40326m;
    }

    public boolean isCurrentMonth() {
        return this.f40325f;
    }

    public boolean isLeapYear() {
        return this.f40324e;
    }

    public boolean isSameMonth(gn1 gn1Var) {
        return this.f40320a == gn1Var.getYear() && this.f40321b == gn1Var.getMonth();
    }

    public boolean isWeekend() {
        return this.f40317X;
    }

    public void setCurrentDay(boolean z) {
        this.f40326m = z;
    }

    public void setCurrentMonth(boolean z) {
        this.f40325f = z;
    }

    public void setDay(int i) {
        this.f40323d = i;
    }

    public void setGregorianFestival(String str) {
        this.f40312H = str;
    }

    public void setLeapMonth(int i) {
        this.f40322c = i;
    }

    public void setLeapYear(boolean z) {
        this.f40324e = z;
    }

    public void setLunar(String str) {
        this.f40310C = str;
    }

    public void setLunarCalendar(gn1 gn1Var) {
        this.f40319Z = gn1Var;
    }

    public void setMonth(int i) {
        this.f40321b = i;
    }

    public void setScheme(String str) {
        this.f40314M = str;
    }

    public void setSchemeColor(int i) {
        this.f40315N = i;
    }

    public void setSchemes(List<C6432a> list) {
        this.f40316Q = list;
    }

    public void setSolarTerm(String str) {
        this.f40311F = str;
    }

    public void setTraditionFestival(String str) {
        this.f40313L = str;
    }

    public void setWeek(int i) {
        this.f40318Y = i;
    }

    public void setWeekend(boolean z) {
        this.f40317X = z;
    }

    public void setYear(int i) {
        this.f40320a = i;
    }

    public String toString() {
        Object objValueOf;
        Object objValueOf2;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f40320a);
        sb.append("");
        int i = this.f40321b;
        if (i < 10) {
            objValueOf = a43.f347l + this.f40321b;
        } else {
            objValueOf = Integer.valueOf(i);
        }
        sb.append(objValueOf);
        sb.append("");
        int i2 = this.f40323d;
        if (i2 < 10) {
            objValueOf2 = a43.f347l + this.f40323d;
        } else {
            objValueOf2 = Integer.valueOf(i2);
        }
        sb.append(objValueOf2);
        return sb.toString();
    }

    @Override // java.lang.Comparable
    public int compareTo(gn1 gn1Var) {
        if (gn1Var == null) {
            return 1;
        }
        return toString().compareTo(gn1Var.toString());
    }

    public void addScheme(int i, String str) {
        if (this.f40316Q == null) {
            this.f40316Q = new ArrayList();
        }
        this.f40316Q.add(new C6432a(i, str));
    }

    public void addScheme(int i, int i2, String str) {
        if (this.f40316Q == null) {
            this.f40316Q = new ArrayList();
        }
        this.f40316Q.add(new C6432a(i, i2, str));
    }

    public void addScheme(int i, int i2, String str, String str2) {
        if (this.f40316Q == null) {
            this.f40316Q = new ArrayList();
        }
        this.f40316Q.add(new C6432a(i, i2, str, str2));
    }

    public void addScheme(int i, String str, String str2) {
        if (this.f40316Q == null) {
            this.f40316Q = new ArrayList();
        }
        this.f40316Q.add(new C6432a(i, str, str2));
    }
}
