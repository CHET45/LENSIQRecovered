package p000;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.UUID;
import p000.k62;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class k62 {

    /* JADX INFO: renamed from: d */
    public static final int f52620d = 64;

    /* JADX INFO: renamed from: e */
    public static final String f52621e = "CMCD-Object";

    /* JADX INFO: renamed from: f */
    public static final String f52622f = "CMCD-Request";

    /* JADX INFO: renamed from: g */
    public static final String f52623g = "CMCD-Session";

    /* JADX INFO: renamed from: h */
    public static final String f52624h = "CMCD-Status";

    /* JADX INFO: renamed from: i */
    public static final String f52625i = "br";

    /* JADX INFO: renamed from: j */
    public static final String f52626j = "bl";

    /* JADX INFO: renamed from: k */
    public static final String f52627k = "cid";

    /* JADX INFO: renamed from: l */
    public static final String f52628l = "sid";

    /* JADX INFO: renamed from: m */
    public static final String f52629m = "rtp";

    /* JADX INFO: renamed from: n */
    public static final String f52630n = "sf";

    /* JADX INFO: renamed from: o */
    public static final String f52631o = "st";

    /* JADX INFO: renamed from: p */
    public static final String f52632p = "v";

    /* JADX INFO: renamed from: q */
    public static final String f52633q = "tb";

    /* JADX INFO: renamed from: r */
    public static final String f52634r = "d";

    /* JADX INFO: renamed from: s */
    public static final String f52635s = "mtp";

    /* JADX INFO: renamed from: t */
    public static final String f52636t = "ot";

    /* JADX INFO: renamed from: a */
    @hib
    public final String f52637a;

    /* JADX INFO: renamed from: b */
    @hib
    public final String f52638b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC8210d f52639c;

    /* JADX INFO: renamed from: k62$a */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC8207a {
    }

    /* JADX INFO: renamed from: k62$b */
    public interface InterfaceC8208b {

        /* JADX INFO: renamed from: a */
        public static final InterfaceC8208b f52640a = new InterfaceC8208b() { // from class: i62
            @Override // p000.k62.InterfaceC8208b
            public final k62 createCmcdConfiguration(aga agaVar) {
                return k62.InterfaceC8208b.lambda$static$0(agaVar);
            }
        };

        /* JADX INFO: renamed from: k62$b$a */
        public class a implements InterfaceC8210d {
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ k62 lambda$static$0(aga agaVar) {
            String string = UUID.randomUUID().toString();
            String str = agaVar.f1445a;
            if (str == null) {
                str = "";
            }
            return new k62(string, str, new a());
        }

        k62 createCmcdConfiguration(aga agaVar);
    }

    /* JADX INFO: renamed from: k62$c */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC8209c {
    }

    /* JADX INFO: renamed from: k62$d */
    public interface InterfaceC8210d {
        default ox7<String, String> getCustomData() {
            return ox7.m19076of();
        }

        default int getRequestedMaximumThroughputKbps(int i) {
            return -2147483647;
        }

        default boolean isKeyAllowed(String str) {
            return true;
        }
    }

    public k62(@hib String str, @hib String str2, InterfaceC8210d interfaceC8210d) {
        boolean z = true;
        u80.checkArgument(str == null || str.length() <= 64);
        if (str2 != null && str2.length() > 64) {
            z = false;
        }
        u80.checkArgument(z);
        u80.checkNotNull(interfaceC8210d);
        this.f52637a = str;
        this.f52638b = str2;
        this.f52639c = interfaceC8210d;
    }

    public boolean isBitrateLoggingAllowed() {
        return this.f52639c.isKeyAllowed("br");
    }

    public boolean isBufferLengthLoggingAllowed() {
        return this.f52639c.isKeyAllowed("bl");
    }

    public boolean isContentIdLoggingAllowed() {
        return this.f52639c.isKeyAllowed("cid");
    }

    public boolean isMaximumRequestThroughputLoggingAllowed() {
        return this.f52639c.isKeyAllowed("rtp");
    }

    public boolean isMeasuredThroughputLoggingAllowed() {
        return this.f52639c.isKeyAllowed("mtp");
    }

    public boolean isObjectDurationLoggingAllowed() {
        return this.f52639c.isKeyAllowed("d");
    }

    public boolean isObjectTypeLoggingAllowed() {
        return this.f52639c.isKeyAllowed("ot");
    }

    public boolean isSessionIdLoggingAllowed() {
        return this.f52639c.isKeyAllowed("sid");
    }

    public boolean isStreamTypeLoggingAllowed() {
        return this.f52639c.isKeyAllowed("st");
    }

    public boolean isStreamingFormatLoggingAllowed() {
        return this.f52639c.isKeyAllowed("sf");
    }

    public boolean isTopBitrateLoggingAllowed() {
        return this.f52639c.isKeyAllowed("tb");
    }
}
