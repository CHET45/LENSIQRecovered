package p000;

import im.zego.zegoexpress.ZegoExpressErrorCode;
import java.util.Set;
import p000.yoe;

/* JADX INFO: loaded from: classes4.dex */
public final class sl0 extends yoe.AbstractC15748b {

    /* JADX INFO: renamed from: a */
    public final long f82142a;

    /* JADX INFO: renamed from: b */
    public final long f82143b;

    /* JADX INFO: renamed from: c */
    public final Set<yoe.EnumC15749c> f82144c;

    /* JADX INFO: renamed from: sl0$b */
    public static final class C12642b extends yoe.AbstractC15748b.a {

        /* JADX INFO: renamed from: a */
        public Long f82145a;

        /* JADX INFO: renamed from: b */
        public Long f82146b;

        /* JADX INFO: renamed from: c */
        public Set<yoe.EnumC15749c> f82147c;

        @Override // p000.yoe.AbstractC15748b.a
        public yoe.AbstractC15748b build() {
            String str = "";
            if (this.f82145a == null) {
                str = " delta";
            }
            if (this.f82146b == null) {
                str = str + " maxAllowedDelay";
            }
            if (this.f82147c == null) {
                str = str + " flags";
            }
            if (str.isEmpty()) {
                return new sl0(this.f82145a.longValue(), this.f82146b.longValue(), this.f82147c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p000.yoe.AbstractC15748b.a
        public yoe.AbstractC15748b.a setDelta(long j) {
            this.f82145a = Long.valueOf(j);
            return this;
        }

        @Override // p000.yoe.AbstractC15748b.a
        public yoe.AbstractC15748b.a setFlags(Set<yoe.EnumC15749c> set) {
            if (set == null) {
                throw new NullPointerException("Null flags");
            }
            this.f82147c = set;
            return this;
        }

        @Override // p000.yoe.AbstractC15748b.a
        public yoe.AbstractC15748b.a setMaxAllowedDelay(long j) {
            this.f82146b = Long.valueOf(j);
            return this;
        }
    }

    @Override // p000.yoe.AbstractC15748b
    /* JADX INFO: renamed from: a */
    public long mo22086a() {
        return this.f82142a;
    }

    @Override // p000.yoe.AbstractC15748b
    /* JADX INFO: renamed from: b */
    public Set<yoe.EnumC15749c> mo22087b() {
        return this.f82144c;
    }

    @Override // p000.yoe.AbstractC15748b
    /* JADX INFO: renamed from: c */
    public long mo22088c() {
        return this.f82143b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof yoe.AbstractC15748b)) {
            return false;
        }
        yoe.AbstractC15748b abstractC15748b = (yoe.AbstractC15748b) obj;
        return this.f82142a == abstractC15748b.mo22086a() && this.f82143b == abstractC15748b.mo22088c() && this.f82144c.equals(abstractC15748b.mo22087b());
    }

    public int hashCode() {
        long j = this.f82142a;
        int i = (((int) (j ^ (j >>> 32))) ^ ZegoExpressErrorCode.CommonEngineNotStarted) * ZegoExpressErrorCode.CommonEngineNotStarted;
        long j2 = this.f82143b;
        return ((i ^ ((int) ((j2 >>> 32) ^ j2))) * ZegoExpressErrorCode.CommonEngineNotStarted) ^ this.f82144c.hashCode();
    }

    public String toString() {
        return "ConfigValue{delta=" + this.f82142a + ", maxAllowedDelay=" + this.f82143b + ", flags=" + this.f82144c + "}";
    }

    private sl0(long j, long j2, Set<yoe.EnumC15749c> set) {
        this.f82142a = j;
        this.f82143b = j2;
        this.f82144c = set;
    }
}
