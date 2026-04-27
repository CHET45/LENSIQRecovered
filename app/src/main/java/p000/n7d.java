package p000;

/* JADX INFO: loaded from: classes5.dex */
public final class n7d {

    /* JADX INFO: renamed from: c */
    public static final n7d f63462c = new n7d(null, null);

    /* JADX INFO: renamed from: a */
    @hib
    public final euf f63463a;

    /* JADX INFO: renamed from: b */
    @hib
    public final Boolean f63464b;

    private n7d(@hib euf eufVar, @hib Boolean bool) {
        r80.hardAssert(eufVar == null || bool == null, "Precondition can specify \"exists\" or \"updateTime\" but not both", new Object[0]);
        this.f63463a = eufVar;
        this.f63464b = bool;
    }

    public static n7d exists(boolean z) {
        return new n7d(null, Boolean.valueOf(z));
    }

    public static n7d updateTime(euf eufVar) {
        return new n7d(eufVar, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || n7d.class != obj.getClass()) {
            return false;
        }
        n7d n7dVar = (n7d) obj;
        euf eufVar = this.f63463a;
        if (eufVar == null ? n7dVar.f63463a != null : !eufVar.equals(n7dVar.f63463a)) {
            return false;
        }
        Boolean bool = this.f63464b;
        Boolean bool2 = n7dVar.f63464b;
        return bool != null ? bool.equals(bool2) : bool2 == null;
    }

    @hib
    public Boolean getExists() {
        return this.f63464b;
    }

    @hib
    public euf getUpdateTime() {
        return this.f63463a;
    }

    public int hashCode() {
        euf eufVar = this.f63463a;
        int iHashCode = (eufVar != null ? eufVar.hashCode() : 0) * 31;
        Boolean bool = this.f63464b;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }

    public boolean isNone() {
        return this.f63463a == null && this.f63464b == null;
    }

    public boolean isValidFor(t4b t4bVar) {
        if (this.f63463a != null) {
            return t4bVar.isFoundDocument() && t4bVar.getVersion().equals(this.f63463a);
        }
        Boolean bool = this.f63464b;
        if (bool != null) {
            return bool.booleanValue() == t4bVar.isFoundDocument();
        }
        r80.hardAssert(isNone(), "Precondition should be empty", new Object[0]);
        return true;
    }

    public String toString() {
        if (isNone()) {
            return "Precondition{<none>}";
        }
        if (this.f63463a != null) {
            return "Precondition{updateTime=" + this.f63463a + "}";
        }
        if (this.f63464b == null) {
            throw r80.fail("Invalid Precondition", new Object[0]);
        }
        return "Precondition{exists=" + this.f63464b + "}";
    }
}
