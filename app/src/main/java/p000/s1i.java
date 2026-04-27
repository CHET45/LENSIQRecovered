package p000;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/* JADX INFO: loaded from: classes7.dex */
@zh5
public final class s1i implements Externalizable {

    /* JADX INFO: renamed from: c */
    @yfb
    public static final C12400a f80396c = new C12400a(null);
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: a */
    public long f80397a;

    /* JADX INFO: renamed from: b */
    public long f80398b;

    /* JADX INFO: renamed from: s1i$a */
    public static final class C12400a {
        public /* synthetic */ C12400a(jt3 jt3Var) {
            this();
        }

        private C12400a() {
        }
    }

    public s1i(long j, long j2) {
        this.f80397a = j;
        this.f80398b = j2;
    }

    private final Object readResolve() {
        return m1i.f59664c.fromLongs(this.f80397a, this.f80398b);
    }

    public final long getLeastSignificantBits() {
        return this.f80398b;
    }

    public final long getMostSignificantBits() {
        return this.f80397a;
    }

    @Override // java.io.Externalizable
    public void readExternal(@yfb ObjectInput objectInput) {
        md8.checkNotNullParameter(objectInput, "input");
        this.f80397a = objectInput.readLong();
        this.f80398b = objectInput.readLong();
    }

    public final void setLeastSignificantBits(long j) {
        this.f80398b = j;
    }

    public final void setMostSignificantBits(long j) {
        this.f80397a = j;
    }

    @Override // java.io.Externalizable
    public void writeExternal(@yfb ObjectOutput objectOutput) throws IOException {
        md8.checkNotNullParameter(objectOutput, "output");
        objectOutput.writeLong(this.f80397a);
        objectOutput.writeLong(this.f80398b);
    }

    public s1i() {
        this(0L, 0L);
    }
}
