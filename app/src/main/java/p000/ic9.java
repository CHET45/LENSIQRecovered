package p000;

import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public interface ic9 {

    /* JADX INFO: renamed from: a */
    public static final int f46486a = 1;

    /* JADX INFO: renamed from: b */
    public static final int f46487b = 2;

    /* JADX INFO: renamed from: ic9$a */
    public static final class C7229a {

        /* JADX INFO: renamed from: a */
        public final int f46488a;

        /* JADX INFO: renamed from: b */
        public final int f46489b;

        /* JADX INFO: renamed from: c */
        public final int f46490c;

        /* JADX INFO: renamed from: d */
        public final int f46491d;

        public C7229a(int i, int i2, int i3, int i4) {
            this.f46488a = i;
            this.f46489b = i2;
            this.f46490c = i3;
            this.f46491d = i4;
        }

        public boolean isFallbackAvailable(int i) {
            if (i == 1) {
                if (this.f46488a - this.f46489b <= 1) {
                    return false;
                }
            } else if (this.f46490c - this.f46491d <= 1) {
                return false;
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: ic9$b */
    public static final class C7230b {

        /* JADX INFO: renamed from: a */
        public final int f46492a;

        /* JADX INFO: renamed from: b */
        public final long f46493b;

        public C7230b(int i, long j) {
            u80.checkArgument(j >= 0);
            this.f46492a = i;
            this.f46493b = j;
        }
    }

    /* JADX INFO: renamed from: ic9$c */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC7231c {
    }

    /* JADX INFO: renamed from: ic9$d */
    public static final class C7232d {

        /* JADX INFO: renamed from: a */
        public final jc9 f46494a;

        /* JADX INFO: renamed from: b */
        public final ega f46495b;

        /* JADX INFO: renamed from: c */
        public final IOException f46496c;

        /* JADX INFO: renamed from: d */
        public final int f46497d;

        public C7232d(jc9 jc9Var, ega egaVar, IOException iOException, int i) {
            this.f46494a = jc9Var;
            this.f46495b = egaVar;
            this.f46496c = iOException;
            this.f46497d = i;
        }
    }

    @hib
    C7230b getFallbackSelectionFor(C7229a c7229a, C7232d c7232d);

    int getMinimumLoadableRetryCount(int i);

    long getRetryDelayMsFor(C7232d c7232d);

    default void onLoadTaskConcluded(long j) {
    }
}
