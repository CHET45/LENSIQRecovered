package p000;

import android.util.SparseArray;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public interface ckh {

    /* JADX INFO: renamed from: a */
    public static final int f16835a = 1;

    /* JADX INFO: renamed from: b */
    public static final int f16836b = 2;

    /* JADX INFO: renamed from: c */
    public static final int f16837c = 4;

    /* JADX INFO: renamed from: ckh$a */
    public static final class C2368a {

        /* JADX INFO: renamed from: a */
        public final String f16838a;

        /* JADX INFO: renamed from: b */
        public final int f16839b;

        /* JADX INFO: renamed from: c */
        public final byte[] f16840c;

        public C2368a(String str, int i, byte[] bArr) {
            this.f16838a = str;
            this.f16839b = i;
            this.f16840c = bArr;
        }
    }

    /* JADX INFO: renamed from: ckh$b */
    public static final class C2369b {

        /* JADX INFO: renamed from: f */
        public static final int f16841f = 0;

        /* JADX INFO: renamed from: g */
        public static final int f16842g = 1;

        /* JADX INFO: renamed from: h */
        public static final int f16843h = 2;

        /* JADX INFO: renamed from: i */
        public static final int f16844i = 3;

        /* JADX INFO: renamed from: a */
        public final int f16845a;

        /* JADX INFO: renamed from: b */
        @hib
        public final String f16846b;

        /* JADX INFO: renamed from: c */
        public final int f16847c;

        /* JADX INFO: renamed from: d */
        public final List<C2368a> f16848d;

        /* JADX INFO: renamed from: e */
        public final byte[] f16849e;

        /* JADX INFO: renamed from: ckh$b$a */
        @Target({ElementType.TYPE_USE})
        @Documented
        @Retention(RetentionPolicy.SOURCE)
        public @interface a {
        }

        public C2369b(int i, @hib String str, int i2, @hib List<C2368a> list, byte[] bArr) {
            this.f16845a = i;
            this.f16846b = str;
            this.f16847c = i2;
            this.f16848d = list == null ? Collections.emptyList() : Collections.unmodifiableList(list);
            this.f16849e = bArr;
        }

        public int getRoleFlags() {
            int i = this.f16847c;
            if (i != 2) {
                return i != 3 ? 0 : 512;
            }
            return 2048;
        }
    }

    /* JADX INFO: renamed from: ckh$c */
    public interface InterfaceC2370c {
        SparseArray<ckh> createInitialPayloadReaders();

        @hib
        ckh createPayloadReader(int i, C2369b c2369b);
    }

    /* JADX INFO: renamed from: ckh$d */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC2371d {
    }

    /* JADX INFO: renamed from: ckh$e */
    public static final class C2372e {

        /* JADX INFO: renamed from: f */
        public static final int f16850f = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: a */
        public final String f16851a;

        /* JADX INFO: renamed from: b */
        public final int f16852b;

        /* JADX INFO: renamed from: c */
        public final int f16853c;

        /* JADX INFO: renamed from: d */
        public int f16854d;

        /* JADX INFO: renamed from: e */
        public String f16855e;

        public C2372e(int i, int i2) {
            this(Integer.MIN_VALUE, i, i2);
        }

        private void maybeThrowUninitializedError() {
            if (this.f16854d == Integer.MIN_VALUE) {
                throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
            }
        }

        public void generateNewId() {
            int i = this.f16854d;
            this.f16854d = i == Integer.MIN_VALUE ? this.f16852b : i + this.f16853c;
            this.f16855e = this.f16851a + this.f16854d;
        }

        public String getFormatId() {
            maybeThrowUninitializedError();
            return this.f16855e;
        }

        public int getTrackId() {
            maybeThrowUninitializedError();
            return this.f16854d;
        }

        public C2372e(int i, int i2, int i3) {
            String str;
            if (i != Integer.MIN_VALUE) {
                str = i + pj4.f71071b;
            } else {
                str = "";
            }
            this.f16851a = str;
            this.f16852b = i2;
            this.f16853c = i3;
            this.f16854d = Integer.MIN_VALUE;
            this.f16855e = "";
        }
    }

    void consume(jhc jhcVar, int i) throws yhc;

    void init(h2h h2hVar, bk5 bk5Var, C2372e c2372e);

    void seek();
}
