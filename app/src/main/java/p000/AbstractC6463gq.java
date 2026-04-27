package p000;

import com.google.auto.value.AutoValue;
import p000.hj0;

/* JADX INFO: renamed from: gq */
/* JADX INFO: loaded from: classes4.dex */
@AutoValue
public abstract class AbstractC6463gq {

    /* JADX INFO: renamed from: gq$a */
    @AutoValue.Builder
    public static abstract class a {
        @efb
        public abstract AbstractC6463gq build();

        @efb
        public abstract a setApplicationBuild(@hib String str);

        @efb
        public abstract a setCountry(@hib String str);

        @efb
        public abstract a setDevice(@hib String str);

        @efb
        public abstract a setFingerprint(@hib String str);

        @efb
        public abstract a setHardware(@hib String str);

        @efb
        public abstract a setLocale(@hib String str);

        @efb
        public abstract a setManufacturer(@hib String str);

        @efb
        public abstract a setMccMnc(@hib String str);

        @efb
        public abstract a setModel(@hib String str);

        @efb
        public abstract a setOsBuild(@hib String str);

        @efb
        public abstract a setProduct(@hib String str);

        @efb
        public abstract a setSdkVersion(@hib Integer num);
    }

    @efb
    public static a builder() {
        return new hj0.C6869b();
    }

    @hib
    public abstract String getApplicationBuild();

    @hib
    public abstract String getCountry();

    @hib
    public abstract String getDevice();

    @hib
    public abstract String getFingerprint();

    @hib
    public abstract String getHardware();

    @hib
    public abstract String getLocale();

    @hib
    public abstract String getManufacturer();

    @hib
    public abstract String getMccMnc();

    @hib
    public abstract String getModel();

    @hib
    public abstract String getOsBuild();

    @hib
    public abstract String getProduct();

    @hib
    public abstract Integer getSdkVersion();
}
