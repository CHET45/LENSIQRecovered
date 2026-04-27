package p000;

import android.util.SparseArray;
import com.google.auto.value.AutoValue;
import p000.jl0;

/* JADX INFO: loaded from: classes4.dex */
@AutoValue
public abstract class gbb {

    /* JADX INFO: renamed from: gbb$a */
    @AutoValue.Builder
    public static abstract class AbstractC6200a {
        @efb
        public abstract gbb build();

        @efb
        public abstract AbstractC6200a setMobileSubtype(@hib EnumC6201b enumC6201b);

        @efb
        public abstract AbstractC6200a setNetworkType(@hib EnumC6202c enumC6202c);
    }

    /* JADX INFO: renamed from: gbb$b */
    public enum EnumC6201b {
        UNKNOWN_MOBILE_SUBTYPE(0),
        GPRS(1),
        EDGE(2),
        UMTS(3),
        CDMA(4),
        /* JADX INFO: Fake field, exist only in values array */
        EVDO_0(5),
        /* JADX INFO: Fake field, exist only in values array */
        EVDO_A(6),
        RTT(7),
        HSDPA(8),
        HSUPA(9),
        HSPA(10),
        IDEN(11),
        EVDO_B(12),
        LTE(13),
        EHRPD(14),
        HSPAP(15),
        GSM(16),
        TD_SCDMA(17),
        IWLAN(18),
        LTE_CA(19),
        COMBINED(100);


        /* JADX INFO: renamed from: C */
        public static final EnumC6201b f39266C;

        /* JADX INFO: renamed from: c2 */
        public static final SparseArray<EnumC6201b> f39283c2;

        /* JADX INFO: renamed from: m */
        public static final EnumC6201b f39288m;

        /* JADX INFO: renamed from: a */
        public final int f39289a;

        static {
            EnumC6201b enumC6201b = UNKNOWN_MOBILE_SUBTYPE;
            EnumC6201b enumC6201b2 = GPRS;
            EnumC6201b enumC6201b3 = EDGE;
            EnumC6201b enumC6201b4 = UMTS;
            EnumC6201b enumC6201b5 = CDMA;
            EnumC6201b enumC6201b6 = EVDO_0;
            f39288m = enumC6201b6;
            EnumC6201b enumC6201b7 = EVDO_A;
            f39266C = enumC6201b7;
            EnumC6201b enumC6201b8 = RTT;
            EnumC6201b enumC6201b9 = HSDPA;
            EnumC6201b enumC6201b10 = HSUPA;
            EnumC6201b enumC6201b11 = HSPA;
            EnumC6201b enumC6201b12 = IDEN;
            EnumC6201b enumC6201b13 = EVDO_B;
            EnumC6201b enumC6201b14 = LTE;
            EnumC6201b enumC6201b15 = EHRPD;
            EnumC6201b enumC6201b16 = HSPAP;
            EnumC6201b enumC6201b17 = GSM;
            EnumC6201b enumC6201b18 = TD_SCDMA;
            EnumC6201b enumC6201b19 = IWLAN;
            EnumC6201b enumC6201b20 = LTE_CA;
            SparseArray<EnumC6201b> sparseArray = new SparseArray<>();
            f39283c2 = sparseArray;
            sparseArray.put(0, enumC6201b);
            sparseArray.put(1, enumC6201b2);
            sparseArray.put(2, enumC6201b3);
            sparseArray.put(3, enumC6201b4);
            sparseArray.put(4, enumC6201b5);
            sparseArray.put(5, enumC6201b6);
            sparseArray.put(6, enumC6201b7);
            sparseArray.put(7, enumC6201b8);
            sparseArray.put(8, enumC6201b9);
            sparseArray.put(9, enumC6201b10);
            sparseArray.put(10, enumC6201b11);
            sparseArray.put(11, enumC6201b12);
            sparseArray.put(12, enumC6201b13);
            sparseArray.put(13, enumC6201b14);
            sparseArray.put(14, enumC6201b15);
            sparseArray.put(15, enumC6201b16);
            sparseArray.put(16, enumC6201b17);
            sparseArray.put(17, enumC6201b18);
            sparseArray.put(18, enumC6201b19);
            sparseArray.put(19, enumC6201b20);
        }

        EnumC6201b(int i) {
            this.f39289a = i;
        }

        @hib
        public static EnumC6201b forNumber(int i) {
            return f39283c2.get(i);
        }

        public int getValue() {
            return this.f39289a;
        }
    }

    /* JADX INFO: renamed from: gbb$c */
    public enum EnumC6202c {
        MOBILE(0),
        WIFI(1),
        MOBILE_MMS(2),
        MOBILE_SUPL(3),
        MOBILE_DUN(4),
        /* JADX INFO: Fake field, exist only in values array */
        MOBILE_HIPRI(5),
        /* JADX INFO: Fake field, exist only in values array */
        WIMAX(6),
        BLUETOOTH(7),
        DUMMY(8),
        ETHERNET(9),
        MOBILE_FOTA(10),
        MOBILE_IMS(11),
        MOBILE_CBS(12),
        WIFI_P2P(13),
        MOBILE_IA(14),
        MOBILE_EMERGENCY(15),
        PROXY(16),
        VPN(17),
        NONE(-1);


        /* JADX INFO: renamed from: C */
        public static final EnumC6202c f39290C;

        /* JADX INFO: renamed from: a2 */
        public static final SparseArray<EnumC6202c> f39303a2;

        /* JADX INFO: renamed from: m */
        public static final EnumC6202c f39310m;

        /* JADX INFO: renamed from: a */
        public final int f39311a;

        static {
            EnumC6202c enumC6202c = MOBILE;
            EnumC6202c enumC6202c2 = WIFI;
            EnumC6202c enumC6202c3 = MOBILE_MMS;
            EnumC6202c enumC6202c4 = MOBILE_SUPL;
            EnumC6202c enumC6202c5 = MOBILE_DUN;
            EnumC6202c enumC6202c6 = MOBILE_HIPRI;
            f39310m = enumC6202c6;
            EnumC6202c enumC6202c7 = WIMAX;
            f39290C = enumC6202c7;
            EnumC6202c enumC6202c8 = BLUETOOTH;
            EnumC6202c enumC6202c9 = DUMMY;
            EnumC6202c enumC6202c10 = ETHERNET;
            EnumC6202c enumC6202c11 = MOBILE_FOTA;
            EnumC6202c enumC6202c12 = MOBILE_IMS;
            EnumC6202c enumC6202c13 = MOBILE_CBS;
            EnumC6202c enumC6202c14 = WIFI_P2P;
            EnumC6202c enumC6202c15 = MOBILE_IA;
            EnumC6202c enumC6202c16 = MOBILE_EMERGENCY;
            EnumC6202c enumC6202c17 = PROXY;
            EnumC6202c enumC6202c18 = VPN;
            EnumC6202c enumC6202c19 = NONE;
            SparseArray<EnumC6202c> sparseArray = new SparseArray<>();
            f39303a2 = sparseArray;
            sparseArray.put(0, enumC6202c);
            sparseArray.put(1, enumC6202c2);
            sparseArray.put(2, enumC6202c3);
            sparseArray.put(3, enumC6202c4);
            sparseArray.put(4, enumC6202c5);
            sparseArray.put(5, enumC6202c6);
            sparseArray.put(6, enumC6202c7);
            sparseArray.put(7, enumC6202c8);
            sparseArray.put(8, enumC6202c9);
            sparseArray.put(9, enumC6202c10);
            sparseArray.put(10, enumC6202c11);
            sparseArray.put(11, enumC6202c12);
            sparseArray.put(12, enumC6202c13);
            sparseArray.put(13, enumC6202c14);
            sparseArray.put(14, enumC6202c15);
            sparseArray.put(15, enumC6202c16);
            sparseArray.put(16, enumC6202c17);
            sparseArray.put(17, enumC6202c18);
            sparseArray.put(-1, enumC6202c19);
        }

        EnumC6202c(int i) {
            this.f39311a = i;
        }

        @hib
        public static EnumC6202c forNumber(int i) {
            return f39303a2.get(i);
        }

        public int getValue() {
            return this.f39311a;
        }
    }

    @efb
    public static AbstractC6200a builder() {
        return new jl0.C7967b();
    }

    @hib
    public abstract EnumC6201b getMobileSubtype();

    @hib
    public abstract EnumC6202c getNetworkType();
}
