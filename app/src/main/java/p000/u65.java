package p000;

import com.google.auto.value.AutoValue;
import p000.sk0;

/* JADX INFO: loaded from: classes4.dex */
@AutoValue
public abstract class u65 {

    /* JADX INFO: renamed from: a */
    public static final long f86870a = 10485760;

    /* JADX INFO: renamed from: b */
    public static final int f86871b = 200;

    /* JADX INFO: renamed from: c */
    public static final int f86872c = 10000;

    /* JADX INFO: renamed from: d */
    public static final long f86873d = 604800000;

    /* JADX INFO: renamed from: e */
    public static final int f86874e = 81920;

    /* JADX INFO: renamed from: f */
    public static final u65 f86875f = m23106a().mo22072f(10485760).mo22070d(200).mo22068b(10000).mo22069c(f86873d).mo22071e(f86874e).mo22067a();

    /* JADX INFO: renamed from: u65$a */
    @AutoValue.Builder
    public static abstract class AbstractC13375a {
        /* JADX INFO: renamed from: a */
        public abstract u65 mo22067a();

        /* JADX INFO: renamed from: b */
        public abstract AbstractC13375a mo22068b(int i);

        /* JADX INFO: renamed from: c */
        public abstract AbstractC13375a mo22069c(long j);

        /* JADX INFO: renamed from: d */
        public abstract AbstractC13375a mo22070d(int i);

        /* JADX INFO: renamed from: e */
        public abstract AbstractC13375a mo22071e(int i);

        /* JADX INFO: renamed from: f */
        public abstract AbstractC13375a mo22072f(long j);
    }

    /* JADX INFO: renamed from: a */
    public static AbstractC13375a m23106a() {
        return new sk0.C12634b();
    }

    /* JADX INFO: renamed from: b */
    public abstract int mo22062b();

    /* JADX INFO: renamed from: c */
    public abstract long mo22063c();

    /* JADX INFO: renamed from: d */
    public abstract int mo22064d();

    /* JADX INFO: renamed from: e */
    public abstract int mo22065e();

    /* JADX INFO: renamed from: f */
    public abstract long mo22066f();

    /* JADX INFO: renamed from: g */
    public AbstractC13375a m23107g() {
        return m23106a().mo22072f(mo22066f()).mo22070d(mo22064d()).mo22068b(mo22062b()).mo22069c(mo22063c()).mo22071e(mo22065e());
    }
}
