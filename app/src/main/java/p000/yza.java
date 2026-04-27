package p000;

import p000.eta;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class yza implements eta.InterfaceC5464a {

    /* JADX INFO: renamed from: a */
    public final long f103529a;

    /* JADX INFO: renamed from: b */
    public final long f103530b;

    /* JADX INFO: renamed from: c */
    public final long f103531c;

    /* JADX INFO: renamed from: d */
    public final long f103532d;

    /* JADX INFO: renamed from: e */
    public final long f103533e;

    public yza(long j, long j2, long j3, long j4, long j5) {
        this.f103529a = j;
        this.f103530b = j2;
        this.f103531c = j3;
        this.f103532d = j4;
        this.f103533e = j5;
    }

    public boolean equals(@hib Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || yza.class != obj.getClass()) {
            return false;
        }
        yza yzaVar = (yza) obj;
        return this.f103529a == yzaVar.f103529a && this.f103530b == yzaVar.f103530b && this.f103531c == yzaVar.f103531c && this.f103532d == yzaVar.f103532d && this.f103533e == yzaVar.f103533e;
    }

    public int hashCode() {
        return ((((((((527 + im9.hashCode(this.f103529a)) * 31) + im9.hashCode(this.f103530b)) * 31) + im9.hashCode(this.f103531c)) * 31) + im9.hashCode(this.f103532d)) * 31) + im9.hashCode(this.f103533e);
    }

    public String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.f103529a + ", photoSize=" + this.f103530b + ", photoPresentationTimestampUs=" + this.f103531c + ", videoStartPosition=" + this.f103532d + ", videoSize=" + this.f103533e;
    }
}
