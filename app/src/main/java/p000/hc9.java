package p000;

import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public interface hc9 {

    /* JADX INFO: renamed from: a */
    public static final int f43131a = 1;

    /* JADX INFO: renamed from: b */
    public static final int f43132b = 2;

    /* JADX INFO: renamed from: hc9$a */
    public static final class C6792a {

        /* JADX INFO: renamed from: a */
        public final int f43133a;

        /* JADX INFO: renamed from: b */
        public final int f43134b;

        /* JADX INFO: renamed from: c */
        public final int f43135c;

        /* JADX INFO: renamed from: d */
        public final int f43136d;

        public C6792a(int i, int i2, int i3, int i4) {
            this.f43133a = i;
            this.f43134b = i2;
            this.f43135c = i3;
            this.f43136d = i4;
        }

        public boolean isFallbackAvailable(int i) {
            if (i == 1) {
                if (this.f43133a - this.f43134b <= 1) {
                    return false;
                }
            } else if (this.f43135c - this.f43136d <= 1) {
                return false;
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: hc9$b */
    public static final class C6793b {

        /* JADX INFO: renamed from: a */
        public final int f43137a;

        /* JADX INFO: renamed from: b */
        public final long f43138b;

        public C6793b(int i, long j) {
            v80.checkArgument(j >= 0);
            this.f43137a = i;
            this.f43138b = j;
        }
    }

    /* JADX INFO: renamed from: hc9$c */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC6794c {
    }

    /* JADX INFO: renamed from: hc9$d */
    public static final class C6795d {

        /* JADX INFO: renamed from: a */
        public final kc9 f43139a;

        /* JADX INFO: renamed from: b */
        public final fga f43140b;

        /* JADX INFO: renamed from: c */
        public final IOException f43141c;

        /* JADX INFO: renamed from: d */
        public final int f43142d;

        public C6795d(kc9 kc9Var, fga fgaVar, IOException iOException, int i) {
            this.f43139a = kc9Var;
            this.f43140b = fgaVar;
            this.f43141c = iOException;
            this.f43142d = i;
        }
    }

    @hib
    C6793b getFallbackSelectionFor(C6792a c6792a, C6795d c6795d);

    int getMinimumLoadableRetryCount(int i);

    long getRetryDelayMsFor(C6795d c6795d);

    default void onLoadTaskConcluded(long j) {
    }
}
