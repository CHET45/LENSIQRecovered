package p000;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public abstract class jhi {

    /* JADX INFO: renamed from: jhi$b */
    public static final class C7905b extends jhi {

        /* JADX INFO: renamed from: a */
        public final List<Integer> f50583a;

        /* JADX INFO: renamed from: b */
        public final List<Integer> f50584b;

        /* JADX INFO: renamed from: c */
        public final ci4 f50585c;

        /* JADX INFO: renamed from: d */
        @hib
        public final t4b f50586d;

        public C7905b(List<Integer> list, List<Integer> list2, ci4 ci4Var, @hib t4b t4bVar) {
            super();
            this.f50583a = list;
            this.f50584b = list2;
            this.f50585c = ci4Var;
            this.f50586d = t4bVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C7905b.class != obj.getClass()) {
                return false;
            }
            C7905b c7905b = (C7905b) obj;
            if (!this.f50583a.equals(c7905b.f50583a) || !this.f50584b.equals(c7905b.f50584b) || !this.f50585c.equals(c7905b.f50585c)) {
                return false;
            }
            t4b t4bVar = this.f50586d;
            t4b t4bVar2 = c7905b.f50586d;
            return t4bVar != null ? t4bVar.equals(t4bVar2) : t4bVar2 == null;
        }

        public ci4 getDocumentKey() {
            return this.f50585c;
        }

        @hib
        public t4b getNewDocument() {
            return this.f50586d;
        }

        public List<Integer> getRemovedTargetIds() {
            return this.f50584b;
        }

        public List<Integer> getUpdatedTargetIds() {
            return this.f50583a;
        }

        public int hashCode() {
            int iHashCode = ((((this.f50583a.hashCode() * 31) + this.f50584b.hashCode()) * 31) + this.f50585c.hashCode()) * 31;
            t4b t4bVar = this.f50586d;
            return iHashCode + (t4bVar != null ? t4bVar.hashCode() : 0);
        }

        public String toString() {
            return "DocumentChange{updatedTargetIds=" + this.f50583a + ", removedTargetIds=" + this.f50584b + ", key=" + this.f50585c + ", newDocument=" + this.f50586d + '}';
        }
    }

    /* JADX INFO: renamed from: jhi$c */
    public static final class C7906c extends jhi {

        /* JADX INFO: renamed from: a */
        public final int f50587a;

        /* JADX INFO: renamed from: b */
        public final p95 f50588b;

        public C7906c(int i, p95 p95Var) {
            super();
            this.f50587a = i;
            this.f50588b = p95Var;
        }

        public p95 getExistenceFilter() {
            return this.f50588b;
        }

        public int getTargetId() {
            return this.f50587a;
        }

        public String toString() {
            return "ExistenceFilterWatchChange{targetId=" + this.f50587a + ", existenceFilter=" + this.f50588b + '}';
        }
    }

    /* JADX INFO: renamed from: jhi$d */
    public static final class C7907d extends jhi {

        /* JADX INFO: renamed from: a */
        public final EnumC7908e f50589a;

        /* JADX INFO: renamed from: b */
        public final List<Integer> f50590b;

        /* JADX INFO: renamed from: c */
        public final vj1 f50591c;

        /* JADX INFO: renamed from: d */
        @hib
        public final n4g f50592d;

        public C7907d(EnumC7908e enumC7908e, List<Integer> list) {
            this(enumC7908e, list, lhi.f57653u, null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C7907d.class != obj.getClass()) {
                return false;
            }
            C7907d c7907d = (C7907d) obj;
            if (this.f50589a != c7907d.f50589a || !this.f50590b.equals(c7907d.f50590b) || !this.f50591c.equals(c7907d.f50591c)) {
                return false;
            }
            n4g n4gVar = this.f50592d;
            return n4gVar != null ? c7907d.f50592d != null && n4gVar.getCode().equals(c7907d.f50592d.getCode()) : c7907d.f50592d == null;
        }

        @hib
        public n4g getCause() {
            return this.f50592d;
        }

        public EnumC7908e getChangeType() {
            return this.f50589a;
        }

        public vj1 getResumeToken() {
            return this.f50591c;
        }

        public List<Integer> getTargetIds() {
            return this.f50590b;
        }

        public int hashCode() {
            int iHashCode = ((((this.f50589a.hashCode() * 31) + this.f50590b.hashCode()) * 31) + this.f50591c.hashCode()) * 31;
            n4g n4gVar = this.f50592d;
            return iHashCode + (n4gVar != null ? n4gVar.getCode().hashCode() : 0);
        }

        public String toString() {
            return "WatchTargetChange{changeType=" + this.f50589a + ", targetIds=" + this.f50590b + '}';
        }

        public C7907d(EnumC7908e enumC7908e, List<Integer> list, vj1 vj1Var) {
            this(enumC7908e, list, vj1Var, null);
        }

        public C7907d(EnumC7908e enumC7908e, List<Integer> list, vj1 vj1Var, @hib n4g n4gVar) {
            super();
            r80.hardAssert(n4gVar == null || enumC7908e == EnumC7908e.Removed, "Got cause for a target change that was not a removal", new Object[0]);
            this.f50589a = enumC7908e;
            this.f50590b = list;
            this.f50591c = vj1Var;
            if (n4gVar != null && !n4gVar.isOk()) {
                this.f50592d = n4gVar;
            } else {
                this.f50592d = null;
            }
        }
    }

    /* JADX INFO: renamed from: jhi$e */
    public enum EnumC7908e {
        NoChange,
        Added,
        Removed,
        Current,
        Reset
    }

    private jhi() {
    }
}
