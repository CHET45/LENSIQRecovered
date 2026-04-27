package p000;

import com.google.auto.value.AutoValue;
import java.util.List;
import p000.c15;
import p000.hl0;

/* JADX INFO: loaded from: classes4.dex */
@AutoValue
public abstract class ni9 {

    /* JADX INFO: renamed from: ni9$a */
    @AutoValue.Builder
    public static abstract class AbstractC9892a {
        @efb
        /* JADX INFO: renamed from: a */
        public abstract AbstractC9892a mo12452a(@hib Integer num);

        @efb
        /* JADX INFO: renamed from: b */
        public abstract AbstractC9892a mo12453b(@hib String str);

        @efb
        public abstract ni9 build();

        @efb
        public abstract AbstractC9892a setClientInfo(@hib c42 c42Var);

        @efb
        public abstract AbstractC9892a setLogEvents(@hib List<di9> list);

        @efb
        public abstract AbstractC9892a setQosTier(@hib lkd lkdVar);

        @efb
        public abstract AbstractC9892a setRequestTimeMs(long j);

        @efb
        public abstract AbstractC9892a setRequestUptimeMs(long j);

        @efb
        public AbstractC9892a setSource(int i) {
            return mo12452a(Integer.valueOf(i));
        }

        @efb
        public AbstractC9892a setSource(@efb String str) {
            return mo12453b(str);
        }
    }

    @efb
    public static AbstractC9892a builder() {
        return new hl0.C6888b();
    }

    @hib
    public abstract c42 getClientInfo();

    @hib
    @c15.InterfaceC2147a(name = "logEvent")
    public abstract List<di9> getLogEvents();

    @hib
    public abstract Integer getLogSource();

    @hib
    public abstract String getLogSourceName();

    @hib
    public abstract lkd getQosTier();

    public abstract long getRequestTimeMs();

    public abstract long getRequestUptimeMs();
}
