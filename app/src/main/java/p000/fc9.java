package p000;

import p000.p7e;

/* JADX INFO: loaded from: classes5.dex */
public final class fc9 {

    /* JADX INFO: renamed from: g */
    public static final fc9 f36110g = new fc9(0, 0, 0, 0, null, EnumC5719a.SUCCESS);

    /* JADX INFO: renamed from: a */
    public final int f36111a;

    /* JADX INFO: renamed from: b */
    public final int f36112b;

    /* JADX INFO: renamed from: c */
    public final long f36113c;

    /* JADX INFO: renamed from: d */
    public final long f36114d;

    /* JADX INFO: renamed from: e */
    @efb
    public final EnumC5719a f36115e;

    /* JADX INFO: renamed from: f */
    @hib
    public final Exception f36116f;

    /* JADX INFO: renamed from: fc9$a */
    public enum EnumC5719a {
        ERROR,
        RUNNING,
        SUCCESS
    }

    @p7e({p7e.EnumC10826a.f69935b})
    public fc9(int i, int i2, long j, long j2, @hib Exception exc, @efb EnumC5719a enumC5719a) {
        this.f36111a = i;
        this.f36112b = i2;
        this.f36113c = j;
        this.f36114d = j2;
        this.f36115e = enumC5719a;
        this.f36116f = exc;
    }

    @efb
    @p7e({p7e.EnumC10826a.f69935b})
    public static fc9 forInitial(@efb ah1 ah1Var) {
        return new fc9(0, ah1Var.getTotalDocuments(), 0L, ah1Var.getTotalBytes(), null, EnumC5719a.RUNNING);
    }

    @efb
    @p7e({p7e.EnumC10826a.f69935b})
    public static fc9 forSuccess(@efb ah1 ah1Var) {
        return new fc9(ah1Var.getTotalDocuments(), ah1Var.getTotalDocuments(), ah1Var.getTotalBytes(), ah1Var.getTotalBytes(), null, EnumC5719a.SUCCESS);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || fc9.class != obj.getClass()) {
            return false;
        }
        fc9 fc9Var = (fc9) obj;
        if (this.f36111a != fc9Var.f36111a || this.f36112b != fc9Var.f36112b || this.f36113c != fc9Var.f36113c || this.f36114d != fc9Var.f36114d || this.f36115e != fc9Var.f36115e) {
            return false;
        }
        Exception exc = this.f36116f;
        Exception exc2 = fc9Var.f36116f;
        return exc != null ? exc.equals(exc2) : exc2 == null;
    }

    public long getBytesLoaded() {
        return this.f36113c;
    }

    public int getDocumentsLoaded() {
        return this.f36111a;
    }

    @hib
    public Exception getException() {
        return this.f36116f;
    }

    @efb
    public EnumC5719a getTaskState() {
        return this.f36115e;
    }

    public long getTotalBytes() {
        return this.f36114d;
    }

    public int getTotalDocuments() {
        return this.f36112b;
    }

    public int hashCode() {
        int i = ((this.f36111a * 31) + this.f36112b) * 31;
        long j = this.f36113c;
        int i2 = (i + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.f36114d;
        int iHashCode = (((i2 + ((int) (j2 ^ (j2 >>> 32)))) * 31) + this.f36115e.hashCode()) * 31;
        Exception exc = this.f36116f;
        return iHashCode + (exc != null ? exc.hashCode() : 0);
    }
}
