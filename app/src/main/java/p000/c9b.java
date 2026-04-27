package p000;

/* JADX INFO: loaded from: classes5.dex */
public class c9b implements sg1 {

    /* JADX INFO: renamed from: a */
    public final String f16039a;

    /* JADX INFO: renamed from: b */
    public final th1 f16040b;

    /* JADX INFO: renamed from: c */
    public final euf f16041c;

    public c9b(String str, th1 th1Var, euf eufVar) {
        this.f16039a = str;
        this.f16040b = th1Var;
        this.f16041c = eufVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        c9b c9bVar = (c9b) obj;
        if (this.f16039a.equals(c9bVar.f16039a) && this.f16040b.equals(c9bVar.f16040b)) {
            return this.f16041c.equals(c9bVar.f16041c);
        }
        return false;
    }

    public th1 getBundledQuery() {
        return this.f16040b;
    }

    public String getName() {
        return this.f16039a;
    }

    public euf getReadTime() {
        return this.f16041c;
    }

    public int hashCode() {
        return (((this.f16039a.hashCode() * 31) + this.f16040b.hashCode()) * 31) + this.f16041c.hashCode();
    }
}
