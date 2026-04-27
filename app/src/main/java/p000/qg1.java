package p000;

/* JADX INFO: loaded from: classes5.dex */
public class qg1 implements sg1 {

    /* JADX INFO: renamed from: a */
    public t4b f74330a;

    public qg1(t4b t4bVar) {
        this.f74330a = t4bVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f74330a.equals(((qg1) obj).f74330a);
    }

    public t4b getDocument() {
        return this.f74330a;
    }

    public ci4 getKey() {
        return this.f74330a.getKey();
    }

    public int hashCode() {
        return this.f74330a.hashCode();
    }
}
