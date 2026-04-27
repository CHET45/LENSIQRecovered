package p000;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class nh1 implements sg1 {

    /* JADX INFO: renamed from: a */
    public final ci4 f64500a;

    /* JADX INFO: renamed from: b */
    public final euf f64501b;

    /* JADX INFO: renamed from: c */
    public final boolean f64502c;

    /* JADX INFO: renamed from: d */
    public final List<String> f64503d;

    public nh1(ci4 ci4Var, euf eufVar, boolean z, List<String> list) {
        this.f64500a = ci4Var;
        this.f64501b = eufVar;
        this.f64502c = z;
        this.f64503d = list;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        nh1 nh1Var = (nh1) obj;
        if (this.f64502c == nh1Var.f64502c && this.f64500a.equals(nh1Var.f64500a) && this.f64501b.equals(nh1Var.f64501b)) {
            return this.f64503d.equals(nh1Var.f64503d);
        }
        return false;
    }

    public boolean exists() {
        return this.f64502c;
    }

    public ci4 getKey() {
        return this.f64500a;
    }

    public List<String> getQueries() {
        return this.f64503d;
    }

    public euf getReadTime() {
        return this.f64501b;
    }

    public int hashCode() {
        return (((((this.f64500a.hashCode() * 31) + this.f64501b.hashCode()) * 31) + (this.f64502c ? 1 : 0)) * 31) + this.f64503d.hashCode();
    }
}
