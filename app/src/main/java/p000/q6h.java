package p000;

import androidx.media3.common.C1213a;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public interface q6h {

    /* JADX INFO: renamed from: a */
    public static final int f73344a = 0;

    /* JADX INFO: renamed from: b */
    public static final int f73345b = 1;

    /* JADX INFO: renamed from: c */
    public static final int f73346c = 2;

    /* JADX INFO: renamed from: q6h$a */
    public static final class C11325a {

        /* JADX INFO: renamed from: a */
        public final int f73347a;

        /* JADX INFO: renamed from: b */
        public final byte[] f73348b;

        /* JADX INFO: renamed from: c */
        public final int f73349c;

        /* JADX INFO: renamed from: d */
        public final int f73350d;

        public C11325a(int i, byte[] bArr, int i2, int i3) {
            this.f73347a = i;
            this.f73348b = bArr;
            this.f73349c = i2;
            this.f73350d = i3;
        }

        public boolean equals(@hib Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C11325a.class != obj.getClass()) {
                return false;
            }
            C11325a c11325a = (C11325a) obj;
            return this.f73347a == c11325a.f73347a && this.f73349c == c11325a.f73349c && this.f73350d == c11325a.f73350d && Arrays.equals(this.f73348b, c11325a.f73348b);
        }

        public int hashCode() {
            return (((((this.f73347a * 31) + Arrays.hashCode(this.f73348b)) * 31) + this.f73349c) * 31) + this.f73350d;
        }
    }

    /* JADX INFO: renamed from: q6h$b */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC11326b {
    }

    default void durationUs(long j) {
    }

    void format(C1213a c1213a);

    default int sampleData(bh3 bh3Var, int i, boolean z) throws IOException {
        return sampleData(bh3Var, i, z, 0);
    }

    int sampleData(bh3 bh3Var, int i, boolean z, int i2) throws IOException;

    void sampleData(jhc jhcVar, int i, int i2);

    void sampleMetadata(long j, int i, int i2, int i3, @hib C11325a c11325a);

    default void sampleData(jhc jhcVar, int i) {
        sampleData(jhcVar, i, 0);
    }
}
