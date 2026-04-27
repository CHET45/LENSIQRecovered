package p000;

import android.util.SparseArray;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public interface dkh {

    /* JADX INFO: renamed from: a */
    public static final int f29895a = 1;

    /* JADX INFO: renamed from: b */
    public static final int f29896b = 2;

    /* JADX INFO: renamed from: c */
    public static final int f29897c = 4;

    /* JADX INFO: renamed from: dkh$a */
    public static final class C4834a {

        /* JADX INFO: renamed from: a */
        public final String f29898a;

        /* JADX INFO: renamed from: b */
        public final int f29899b;

        /* JADX INFO: renamed from: c */
        public final byte[] f29900c;

        public C4834a(String str, int i, byte[] bArr) {
            this.f29898a = str;
            this.f29899b = i;
            this.f29900c = bArr;
        }
    }

    /* JADX INFO: renamed from: dkh$b */
    public static final class C4835b {

        /* JADX INFO: renamed from: a */
        public final int f29901a;

        /* JADX INFO: renamed from: b */
        @hib
        public final String f29902b;

        /* JADX INFO: renamed from: c */
        public final List<C4834a> f29903c;

        /* JADX INFO: renamed from: d */
        public final byte[] f29904d;

        public C4835b(int i, @hib String str, @hib List<C4834a> list, byte[] bArr) {
            this.f29901a = i;
            this.f29902b = str;
            this.f29903c = list == null ? Collections.emptyList() : Collections.unmodifiableList(list);
            this.f29904d = bArr;
        }
    }

    /* JADX INFO: renamed from: dkh$c */
    public interface InterfaceC4836c {
        SparseArray<dkh> createInitialPayloadReaders();

        @hib
        dkh createPayloadReader(int i, C4835b c4835b);
    }

    /* JADX INFO: renamed from: dkh$d */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC4837d {
    }

    /* JADX INFO: renamed from: dkh$e */
    public static final class C4838e {

        /* JADX INFO: renamed from: f */
        public static final int f29905f = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: a */
        public final String f29906a;

        /* JADX INFO: renamed from: b */
        public final int f29907b;

        /* JADX INFO: renamed from: c */
        public final int f29908c;

        /* JADX INFO: renamed from: d */
        public int f29909d;

        /* JADX INFO: renamed from: e */
        public String f29910e;

        public C4838e(int i, int i2) {
            this(Integer.MIN_VALUE, i, i2);
        }

        private void maybeThrowUninitializedError() {
            if (this.f29909d == Integer.MIN_VALUE) {
                throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
            }
        }

        public void generateNewId() {
            int i = this.f29909d;
            this.f29909d = i == Integer.MIN_VALUE ? this.f29907b : i + this.f29908c;
            this.f29910e = this.f29906a + this.f29909d;
        }

        public String getFormatId() {
            maybeThrowUninitializedError();
            return this.f29910e;
        }

        public int getTrackId() {
            maybeThrowUninitializedError();
            return this.f29909d;
        }

        public C4838e(int i, int i2, int i3) {
            String str;
            if (i != Integer.MIN_VALUE) {
                str = i + pj4.f71071b;
            } else {
                str = "";
            }
            this.f29906a = str;
            this.f29907b = i2;
            this.f29908c = i3;
            this.f29909d = Integer.MIN_VALUE;
            this.f29910e = "";
        }
    }

    void consume(ihc ihcVar, int i) throws xhc;

    void init(g2h g2hVar, ck5 ck5Var, C4838e c4838e);

    void seek();
}
