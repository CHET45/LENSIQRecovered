package p000;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.UUID;
import p000.h62;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class h62 {

    /* JADX INFO: renamed from: A */
    public static final String f42439A = "nor";

    /* JADX INFO: renamed from: B */
    public static final String f42440B = "nrr";

    /* JADX INFO: renamed from: C */
    public static final int f42441C = 0;

    /* JADX INFO: renamed from: D */
    public static final int f42442D = 1;

    /* JADX INFO: renamed from: e */
    public static final int f42443e = 64;

    /* JADX INFO: renamed from: f */
    public static final String f42444f = "CMCD-Object";

    /* JADX INFO: renamed from: g */
    public static final String f42445g = "CMCD-Request";

    /* JADX INFO: renamed from: h */
    public static final String f42446h = "CMCD-Session";

    /* JADX INFO: renamed from: i */
    public static final String f42447i = "CMCD-Status";

    /* JADX INFO: renamed from: j */
    public static final String f42448j = "CMCD";

    /* JADX INFO: renamed from: k */
    public static final String f42449k = "br";

    /* JADX INFO: renamed from: l */
    public static final String f42450l = "bl";

    /* JADX INFO: renamed from: m */
    public static final String f42451m = "cid";

    /* JADX INFO: renamed from: n */
    public static final String f42452n = "sid";

    /* JADX INFO: renamed from: o */
    public static final String f42453o = "rtp";

    /* JADX INFO: renamed from: p */
    public static final String f42454p = "sf";

    /* JADX INFO: renamed from: q */
    public static final String f42455q = "st";

    /* JADX INFO: renamed from: r */
    public static final String f42456r = "v";

    /* JADX INFO: renamed from: s */
    public static final String f42457s = "tb";

    /* JADX INFO: renamed from: t */
    public static final String f42458t = "d";

    /* JADX INFO: renamed from: u */
    public static final String f42459u = "mtp";

    /* JADX INFO: renamed from: v */
    public static final String f42460v = "ot";

    /* JADX INFO: renamed from: w */
    public static final String f42461w = "bs";

    /* JADX INFO: renamed from: x */
    public static final String f42462x = "dl";

    /* JADX INFO: renamed from: y */
    public static final String f42463y = "pr";

    /* JADX INFO: renamed from: z */
    public static final String f42464z = "su";

    /* JADX INFO: renamed from: a */
    @hib
    public final String f42465a;

    /* JADX INFO: renamed from: b */
    @hib
    public final String f42466b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC6723e f42467c;

    /* JADX INFO: renamed from: d */
    public final int f42468d;

    /* JADX INFO: renamed from: h62$a */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC6719a {
    }

    /* JADX INFO: renamed from: h62$b */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC6720b {
    }

    /* JADX INFO: renamed from: h62$c */
    public interface InterfaceC6721c {

        /* JADX INFO: renamed from: a */
        public static final InterfaceC6721c f42469a = new InterfaceC6721c() { // from class: j62
            @Override // p000.h62.InterfaceC6721c
            public final h62 createCmcdConfiguration(nfa nfaVar) {
                return h62.InterfaceC6721c.lambda$static$0(nfaVar);
            }
        };

        /* JADX INFO: renamed from: h62$c$a */
        public class a implements InterfaceC6723e {
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ h62 lambda$static$0(nfa nfaVar) {
            String string = UUID.randomUUID().toString();
            String str = nfaVar.f64304a;
            if (str == null) {
                str = "";
            }
            return new h62(string, str, new a());
        }

        @hib
        h62 createCmcdConfiguration(nfa nfaVar);
    }

    /* JADX INFO: renamed from: h62$d */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC6722d {
    }

    /* JADX INFO: renamed from: h62$e */
    public interface InterfaceC6723e {
        default mx7<String, String> getCustomData() {
            return mx7.m17655of();
        }

        default int getRequestedMaximumThroughputKbps(int i) {
            return -2147483647;
        }

        default boolean isKeyAllowed(String str) {
            return true;
        }
    }

    public h62(@hib String str, @hib String str2, InterfaceC6723e interfaceC6723e) {
        this(str, str2, interfaceC6723e, 0);
    }

    public boolean isBitrateLoggingAllowed() {
        return this.f42467c.isKeyAllowed("br");
    }

    public boolean isBufferLengthLoggingAllowed() {
        return this.f42467c.isKeyAllowed("bl");
    }

    public boolean isBufferStarvationLoggingAllowed() {
        return this.f42467c.isKeyAllowed(f42461w);
    }

    public boolean isContentIdLoggingAllowed() {
        return this.f42467c.isKeyAllowed("cid");
    }

    public boolean isDeadlineLoggingAllowed() {
        return this.f42467c.isKeyAllowed(f42462x);
    }

    public boolean isMaximumRequestThroughputLoggingAllowed() {
        return this.f42467c.isKeyAllowed("rtp");
    }

    public boolean isMeasuredThroughputLoggingAllowed() {
        return this.f42467c.isKeyAllowed("mtp");
    }

    public boolean isNextObjectRequestLoggingAllowed() {
        return this.f42467c.isKeyAllowed(f42439A);
    }

    public boolean isNextRangeRequestLoggingAllowed() {
        return this.f42467c.isKeyAllowed(f42440B);
    }

    public boolean isObjectDurationLoggingAllowed() {
        return this.f42467c.isKeyAllowed("d");
    }

    public boolean isObjectTypeLoggingAllowed() {
        return this.f42467c.isKeyAllowed("ot");
    }

    public boolean isPlaybackRateLoggingAllowed() {
        return this.f42467c.isKeyAllowed(f42463y);
    }

    public boolean isSessionIdLoggingAllowed() {
        return this.f42467c.isKeyAllowed("sid");
    }

    public boolean isStartupLoggingAllowed() {
        return this.f42467c.isKeyAllowed(f42464z);
    }

    public boolean isStreamTypeLoggingAllowed() {
        return this.f42467c.isKeyAllowed("st");
    }

    public boolean isStreamingFormatLoggingAllowed() {
        return this.f42467c.isKeyAllowed("sf");
    }

    public boolean isTopBitrateLoggingAllowed() {
        return this.f42467c.isKeyAllowed("tb");
    }

    public h62(@hib String str, @hib String str2, InterfaceC6723e interfaceC6723e, int i) {
        boolean z = true;
        v80.checkArgument(str == null || str.length() <= 64);
        if (str2 != null && str2.length() > 64) {
            z = false;
        }
        v80.checkArgument(z);
        v80.checkNotNull(interfaceC6723e);
        this.f42465a = str;
        this.f42466b = str2;
        this.f42467c = interfaceC6723e;
        this.f42468d = i;
    }
}
