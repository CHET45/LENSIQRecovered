package p000;

import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public interface r6h {

    /* JADX INFO: renamed from: a */
    public static final int f77144a = 0;

    /* JADX INFO: renamed from: b */
    public static final int f77145b = 1;

    /* JADX INFO: renamed from: c */
    public static final int f77146c = 2;

    /* JADX INFO: renamed from: r6h$a */
    public static final class C11906a {

        /* JADX INFO: renamed from: a */
        public final int f77147a;

        /* JADX INFO: renamed from: b */
        public final byte[] f77148b;

        /* JADX INFO: renamed from: c */
        public final int f77149c;

        /* JADX INFO: renamed from: d */
        public final int f77150d;

        public C11906a(int i, byte[] bArr, int i2, int i3) {
            this.f77147a = i;
            this.f77148b = bArr;
            this.f77149c = i2;
            this.f77150d = i3;
        }

        public boolean equals(@hib Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C11906a.class != obj.getClass()) {
                return false;
            }
            C11906a c11906a = (C11906a) obj;
            return this.f77147a == c11906a.f77147a && this.f77149c == c11906a.f77149c && this.f77150d == c11906a.f77150d && Arrays.equals(this.f77148b, c11906a.f77148b);
        }

        public int hashCode() {
            return (((((this.f77147a * 31) + Arrays.hashCode(this.f77148b)) * 31) + this.f77149c) * 31) + this.f77150d;
        }
    }

    /* JADX INFO: renamed from: r6h$b */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC11907b {
    }

    void format(kq6 kq6Var);

    default int sampleData(ah3 ah3Var, int i, boolean z) throws IOException {
        return sampleData(ah3Var, i, z, 0);
    }

    int sampleData(ah3 ah3Var, int i, boolean z, int i2) throws IOException;

    void sampleData(ihc ihcVar, int i, int i2);

    void sampleMetadata(long j, int i, int i2, int i3, @hib C11906a c11906a);

    default void sampleData(ihc ihcVar, int i) {
        sampleData(ihcVar, i, 0);
    }
}
