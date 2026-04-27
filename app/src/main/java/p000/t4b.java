package p000;

/* JADX INFO: loaded from: classes5.dex */
public final class t4b implements ph4 {

    /* JADX INFO: renamed from: b */
    public final ci4 f83695b;

    /* JADX INFO: renamed from: c */
    public EnumC12911b f83696c;

    /* JADX INFO: renamed from: d */
    public euf f83697d;

    /* JADX INFO: renamed from: e */
    public euf f83698e;

    /* JADX INFO: renamed from: f */
    public nkb f83699f;

    /* JADX INFO: renamed from: g */
    public EnumC12910a f83700g;

    /* JADX INFO: renamed from: t4b$a */
    public enum EnumC12910a {
        HAS_LOCAL_MUTATIONS,
        HAS_COMMITTED_MUTATIONS,
        SYNCED
    }

    /* JADX INFO: renamed from: t4b$b */
    public enum EnumC12911b {
        INVALID,
        FOUND_DOCUMENT,
        NO_DOCUMENT,
        UNKNOWN_DOCUMENT
    }

    private t4b(ci4 ci4Var) {
        this.f83695b = ci4Var;
        this.f83698e = euf.f34067b;
    }

    public static t4b newFoundDocument(ci4 ci4Var, euf eufVar, nkb nkbVar) {
        return new t4b(ci4Var).convertToFoundDocument(eufVar, nkbVar);
    }

    public static t4b newInvalidDocument(ci4 ci4Var) {
        EnumC12911b enumC12911b = EnumC12911b.INVALID;
        euf eufVar = euf.f34067b;
        return new t4b(ci4Var, enumC12911b, eufVar, eufVar, new nkb(), EnumC12910a.SYNCED);
    }

    public static t4b newNoDocument(ci4 ci4Var, euf eufVar) {
        return new t4b(ci4Var).convertToNoDocument(eufVar);
    }

    public static t4b newUnknownDocument(ci4 ci4Var, euf eufVar) {
        return new t4b(ci4Var).convertToUnknownDocument(eufVar);
    }

    public t4b convertToFoundDocument(euf eufVar, nkb nkbVar) {
        this.f83697d = eufVar;
        this.f83696c = EnumC12911b.FOUND_DOCUMENT;
        this.f83699f = nkbVar;
        this.f83700g = EnumC12910a.SYNCED;
        return this;
    }

    public t4b convertToNoDocument(euf eufVar) {
        this.f83697d = eufVar;
        this.f83696c = EnumC12911b.NO_DOCUMENT;
        this.f83699f = new nkb();
        this.f83700g = EnumC12910a.SYNCED;
        return this;
    }

    public t4b convertToUnknownDocument(euf eufVar) {
        this.f83697d = eufVar;
        this.f83696c = EnumC12911b.UNKNOWN_DOCUMENT;
        this.f83699f = new nkb();
        this.f83700g = EnumC12910a.HAS_COMMITTED_MUTATIONS;
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || t4b.class != obj.getClass()) {
            return false;
        }
        t4b t4bVar = (t4b) obj;
        if (this.f83695b.equals(t4bVar.f83695b) && this.f83697d.equals(t4bVar.f83697d) && this.f83696c.equals(t4bVar.f83696c) && this.f83700g.equals(t4bVar.f83700g)) {
            return this.f83699f.equals(t4bVar.f83699f);
        }
        return false;
    }

    @Override // p000.ph4
    public nkb getData() {
        return this.f83699f;
    }

    @Override // p000.ph4
    public b2i getField(wr5 wr5Var) {
        return getData().get(wr5Var);
    }

    @Override // p000.ph4
    public ci4 getKey() {
        return this.f83695b;
    }

    @Override // p000.ph4
    public euf getReadTime() {
        return this.f83698e;
    }

    @Override // p000.ph4
    public euf getVersion() {
        return this.f83697d;
    }

    @Override // p000.ph4
    public boolean hasCommittedMutations() {
        return this.f83700g.equals(EnumC12910a.HAS_COMMITTED_MUTATIONS);
    }

    @Override // p000.ph4
    public boolean hasLocalMutations() {
        return this.f83700g.equals(EnumC12910a.HAS_LOCAL_MUTATIONS);
    }

    @Override // p000.ph4
    public boolean hasPendingWrites() {
        return hasLocalMutations() || hasCommittedMutations();
    }

    public int hashCode() {
        return this.f83695b.hashCode();
    }

    @Override // p000.ph4
    public boolean isFoundDocument() {
        return this.f83696c.equals(EnumC12911b.FOUND_DOCUMENT);
    }

    @Override // p000.ph4
    public boolean isNoDocument() {
        return this.f83696c.equals(EnumC12911b.NO_DOCUMENT);
    }

    @Override // p000.ph4
    public boolean isUnknownDocument() {
        return this.f83696c.equals(EnumC12911b.UNKNOWN_DOCUMENT);
    }

    @Override // p000.ph4
    public boolean isValidDocument() {
        return !this.f83696c.equals(EnumC12911b.INVALID);
    }

    @Override // p000.ph4
    @efb
    public t4b mutableCopy() {
        return new t4b(this.f83695b, this.f83696c, this.f83697d, this.f83698e, this.f83699f.clone(), this.f83700g);
    }

    public t4b setHasCommittedMutations() {
        this.f83700g = EnumC12910a.HAS_COMMITTED_MUTATIONS;
        return this;
    }

    public t4b setHasLocalMutations() {
        this.f83700g = EnumC12910a.HAS_LOCAL_MUTATIONS;
        this.f83697d = euf.f34067b;
        return this;
    }

    public t4b setReadTime(euf eufVar) {
        this.f83698e = eufVar;
        return this;
    }

    public String toString() {
        return "Document{key=" + this.f83695b + ", version=" + this.f83697d + ", readTime=" + this.f83698e + ", type=" + this.f83696c + ", documentState=" + this.f83700g + ", value=" + this.f83699f + '}';
    }

    private t4b(ci4 ci4Var, EnumC12911b enumC12911b, euf eufVar, euf eufVar2, nkb nkbVar, EnumC12910a enumC12910a) {
        this.f83695b = ci4Var;
        this.f83697d = eufVar;
        this.f83698e = eufVar2;
        this.f83696c = enumC12911b;
        this.f83700g = enumC12910a;
        this.f83699f = nkbVar;
    }
}
