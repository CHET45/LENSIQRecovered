package p000;

import com.google.auto.value.AutoValue;

/* JADX INFO: loaded from: classes5.dex */
@AutoValue
public abstract class z3g {

    /* JADX INFO: renamed from: z3g$a */
    @AutoValue
    public static abstract class AbstractC15979a {
        public static AbstractC15979a create(String str, String str2, String str3, String str4, int i, b84 b84Var) {
            return new xl0(str, str2, str3, str4, i, b84Var);
        }

        public abstract String appIdentifier();

        public abstract int deliveryMechanism();

        public abstract b84 developmentPlatformProvider();

        public abstract String installUuid();

        public abstract String versionCode();

        public abstract String versionName();
    }

    /* JADX INFO: renamed from: z3g$b */
    @AutoValue
    public static abstract class AbstractC15980b {
        public static AbstractC15980b create(int i, String str, int i2, long j, long j2, boolean z, int i3, String str2, String str3) {
            return new yl0(i, str, i2, j, j2, z, i3, str2, str3);
        }

        public abstract int arch();

        public abstract int availableProcessors();

        public abstract long diskSpace();

        public abstract boolean isEmulator();

        public abstract String manufacturer();

        public abstract String model();

        public abstract String modelClass();

        public abstract int state();

        public abstract long totalRam();
    }

    /* JADX INFO: renamed from: z3g$c */
    @AutoValue
    public static abstract class AbstractC15981c {
        public static AbstractC15981c create(String str, String str2, boolean z) {
            return new zl0(str, str2, z);
        }

        public abstract boolean isRooted();

        public abstract String osCodeName();

        public abstract String osRelease();
    }

    public static z3g create(AbstractC15979a abstractC15979a, AbstractC15981c abstractC15981c, AbstractC15980b abstractC15980b) {
        return new wl0(abstractC15979a, abstractC15981c, abstractC15980b);
    }

    public abstract AbstractC15979a appData();

    public abstract AbstractC15980b deviceData();

    public abstract AbstractC15981c osData();
}
