package p000;

/* JADX INFO: loaded from: classes6.dex */
public class ki9 {

    /* JADX INFO: renamed from: a */
    @hib
    public final Integer f54214a;

    /* JADX INFO: renamed from: b */
    @hib
    public final Integer f54215b;

    /* JADX INFO: renamed from: c */
    @hib
    public final Integer f54216c;

    /* JADX INFO: renamed from: d */
    @hib
    public final Boolean f54217d;

    /* JADX INFO: renamed from: e */
    @hib
    public final Boolean f54218e;

    /* JADX INFO: renamed from: f */
    @hib
    public final InterfaceC8382b f54219f;

    /* JADX INFO: renamed from: ki9$a */
    public static class C8381a {

        /* JADX INFO: renamed from: a */
        @hib
        public Integer f54220a;

        /* JADX INFO: renamed from: b */
        @hib
        public Integer f54221b;

        /* JADX INFO: renamed from: c */
        @hib
        public Integer f54222c;

        /* JADX INFO: renamed from: d */
        @hib
        public Boolean f54223d;

        /* JADX INFO: renamed from: e */
        @hib
        public Boolean f54224e;

        /* JADX INFO: renamed from: f */
        @hib
        public InterfaceC8382b f54225f;

        public ki9 build() {
            return new ki9(this.f54220a, this.f54221b, this.f54222c, this.f54223d, this.f54224e, this.f54225f);
        }

        public C8381a setLogLevel(@hib Integer num) {
            this.f54220a = num;
            return this;
        }

        public C8381a setLogger(@hib InterfaceC8382b interfaceC8382b) {
            this.f54225f = interfaceC8382b;
            return this;
        }

        public C8381a setMacAddressLogSetting(@hib Integer num) {
            this.f54221b = num;
            return this;
        }

        public C8381a setShouldLogAttributeValues(@hib Boolean bool) {
            this.f54223d = bool;
            return this;
        }

        public C8381a setShouldLogScannedPeripherals(@hib Boolean bool) {
            this.f54224e = bool;
            return this;
        }

        public C8381a setUuidsLogSetting(@hib Integer num) {
            this.f54222c = num;
            return this;
        }
    }

    /* JADX INFO: renamed from: ki9$b */
    public interface InterfaceC8382b {
        void log(int i, String str, String str2);
    }

    public ki9(@hib Integer num, @hib Integer num2, @hib Integer num3, @hib Boolean bool, @hib Boolean bool2, @hib InterfaceC8382b interfaceC8382b) {
        this.f54214a = num;
        this.f54215b = num2;
        this.f54216c = num3;
        this.f54217d = bool;
        this.f54218e = bool2;
        this.f54219f = interfaceC8382b;
    }

    @hib
    public Integer getLogLevel() {
        return this.f54214a;
    }

    @hib
    public InterfaceC8382b getLogger() {
        return this.f54219f;
    }

    @hib
    public Integer getMacAddressLogSetting() {
        return this.f54215b;
    }

    @hib
    public Boolean getShouldLogAttributeValues() {
        return this.f54217d;
    }

    @hib
    public Boolean getShouldLogScannedPeripherals() {
        return this.f54218e;
    }

    @hib
    public Integer getUuidLogSetting() {
        return this.f54216c;
    }

    public String toString() {
        return "LogOptions{logLevel=" + this.f54214a + ", macAddressLogSetting=" + this.f54215b + ", uuidLogSetting=" + this.f54216c + ", shouldLogAttributeValues=" + this.f54217d + ", shouldLogScannedPeripherals=" + this.f54218e + ", logger=" + this.f54219f + '}';
    }
}
