package p000;

import im.zego.zegoexpress.ZegoExpressErrorCode;
import p000.AbstractC6463gq;

/* JADX INFO: loaded from: classes4.dex */
public final class hj0 extends AbstractC6463gq {

    /* JADX INFO: renamed from: a */
    public final Integer f43777a;

    /* JADX INFO: renamed from: b */
    public final String f43778b;

    /* JADX INFO: renamed from: c */
    public final String f43779c;

    /* JADX INFO: renamed from: d */
    public final String f43780d;

    /* JADX INFO: renamed from: e */
    public final String f43781e;

    /* JADX INFO: renamed from: f */
    public final String f43782f;

    /* JADX INFO: renamed from: g */
    public final String f43783g;

    /* JADX INFO: renamed from: h */
    public final String f43784h;

    /* JADX INFO: renamed from: i */
    public final String f43785i;

    /* JADX INFO: renamed from: j */
    public final String f43786j;

    /* JADX INFO: renamed from: k */
    public final String f43787k;

    /* JADX INFO: renamed from: l */
    public final String f43788l;

    /* JADX INFO: renamed from: hj0$b */
    public static final class C6869b extends AbstractC6463gq.a {

        /* JADX INFO: renamed from: a */
        public Integer f43789a;

        /* JADX INFO: renamed from: b */
        public String f43790b;

        /* JADX INFO: renamed from: c */
        public String f43791c;

        /* JADX INFO: renamed from: d */
        public String f43792d;

        /* JADX INFO: renamed from: e */
        public String f43793e;

        /* JADX INFO: renamed from: f */
        public String f43794f;

        /* JADX INFO: renamed from: g */
        public String f43795g;

        /* JADX INFO: renamed from: h */
        public String f43796h;

        /* JADX INFO: renamed from: i */
        public String f43797i;

        /* JADX INFO: renamed from: j */
        public String f43798j;

        /* JADX INFO: renamed from: k */
        public String f43799k;

        /* JADX INFO: renamed from: l */
        public String f43800l;

        @Override // p000.AbstractC6463gq.a
        public AbstractC6463gq build() {
            return new hj0(this.f43789a, this.f43790b, this.f43791c, this.f43792d, this.f43793e, this.f43794f, this.f43795g, this.f43796h, this.f43797i, this.f43798j, this.f43799k, this.f43800l);
        }

        @Override // p000.AbstractC6463gq.a
        public AbstractC6463gq.a setApplicationBuild(@hib String str) {
            this.f43800l = str;
            return this;
        }

        @Override // p000.AbstractC6463gq.a
        public AbstractC6463gq.a setCountry(@hib String str) {
            this.f43798j = str;
            return this;
        }

        @Override // p000.AbstractC6463gq.a
        public AbstractC6463gq.a setDevice(@hib String str) {
            this.f43792d = str;
            return this;
        }

        @Override // p000.AbstractC6463gq.a
        public AbstractC6463gq.a setFingerprint(@hib String str) {
            this.f43796h = str;
            return this;
        }

        @Override // p000.AbstractC6463gq.a
        public AbstractC6463gq.a setHardware(@hib String str) {
            this.f43791c = str;
            return this;
        }

        @Override // p000.AbstractC6463gq.a
        public AbstractC6463gq.a setLocale(@hib String str) {
            this.f43797i = str;
            return this;
        }

        @Override // p000.AbstractC6463gq.a
        public AbstractC6463gq.a setManufacturer(@hib String str) {
            this.f43795g = str;
            return this;
        }

        @Override // p000.AbstractC6463gq.a
        public AbstractC6463gq.a setMccMnc(@hib String str) {
            this.f43799k = str;
            return this;
        }

        @Override // p000.AbstractC6463gq.a
        public AbstractC6463gq.a setModel(@hib String str) {
            this.f43790b = str;
            return this;
        }

        @Override // p000.AbstractC6463gq.a
        public AbstractC6463gq.a setOsBuild(@hib String str) {
            this.f43794f = str;
            return this;
        }

        @Override // p000.AbstractC6463gq.a
        public AbstractC6463gq.a setProduct(@hib String str) {
            this.f43793e = str;
            return this;
        }

        @Override // p000.AbstractC6463gq.a
        public AbstractC6463gq.a setSdkVersion(@hib Integer num) {
            this.f43789a = num;
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC6463gq)) {
            return false;
        }
        AbstractC6463gq abstractC6463gq = (AbstractC6463gq) obj;
        Integer num = this.f43777a;
        if (num != null ? num.equals(abstractC6463gq.getSdkVersion()) : abstractC6463gq.getSdkVersion() == null) {
            String str = this.f43778b;
            if (str != null ? str.equals(abstractC6463gq.getModel()) : abstractC6463gq.getModel() == null) {
                String str2 = this.f43779c;
                if (str2 != null ? str2.equals(abstractC6463gq.getHardware()) : abstractC6463gq.getHardware() == null) {
                    String str3 = this.f43780d;
                    if (str3 != null ? str3.equals(abstractC6463gq.getDevice()) : abstractC6463gq.getDevice() == null) {
                        String str4 = this.f43781e;
                        if (str4 != null ? str4.equals(abstractC6463gq.getProduct()) : abstractC6463gq.getProduct() == null) {
                            String str5 = this.f43782f;
                            if (str5 != null ? str5.equals(abstractC6463gq.getOsBuild()) : abstractC6463gq.getOsBuild() == null) {
                                String str6 = this.f43783g;
                                if (str6 != null ? str6.equals(abstractC6463gq.getManufacturer()) : abstractC6463gq.getManufacturer() == null) {
                                    String str7 = this.f43784h;
                                    if (str7 != null ? str7.equals(abstractC6463gq.getFingerprint()) : abstractC6463gq.getFingerprint() == null) {
                                        String str8 = this.f43785i;
                                        if (str8 != null ? str8.equals(abstractC6463gq.getLocale()) : abstractC6463gq.getLocale() == null) {
                                            String str9 = this.f43786j;
                                            if (str9 != null ? str9.equals(abstractC6463gq.getCountry()) : abstractC6463gq.getCountry() == null) {
                                                String str10 = this.f43787k;
                                                if (str10 != null ? str10.equals(abstractC6463gq.getMccMnc()) : abstractC6463gq.getMccMnc() == null) {
                                                    String str11 = this.f43788l;
                                                    if (str11 == null) {
                                                        if (abstractC6463gq.getApplicationBuild() == null) {
                                                            return true;
                                                        }
                                                    } else if (str11.equals(abstractC6463gq.getApplicationBuild())) {
                                                        return true;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // p000.AbstractC6463gq
    @hib
    public String getApplicationBuild() {
        return this.f43788l;
    }

    @Override // p000.AbstractC6463gq
    @hib
    public String getCountry() {
        return this.f43786j;
    }

    @Override // p000.AbstractC6463gq
    @hib
    public String getDevice() {
        return this.f43780d;
    }

    @Override // p000.AbstractC6463gq
    @hib
    public String getFingerprint() {
        return this.f43784h;
    }

    @Override // p000.AbstractC6463gq
    @hib
    public String getHardware() {
        return this.f43779c;
    }

    @Override // p000.AbstractC6463gq
    @hib
    public String getLocale() {
        return this.f43785i;
    }

    @Override // p000.AbstractC6463gq
    @hib
    public String getManufacturer() {
        return this.f43783g;
    }

    @Override // p000.AbstractC6463gq
    @hib
    public String getMccMnc() {
        return this.f43787k;
    }

    @Override // p000.AbstractC6463gq
    @hib
    public String getModel() {
        return this.f43778b;
    }

    @Override // p000.AbstractC6463gq
    @hib
    public String getOsBuild() {
        return this.f43782f;
    }

    @Override // p000.AbstractC6463gq
    @hib
    public String getProduct() {
        return this.f43781e;
    }

    @Override // p000.AbstractC6463gq
    @hib
    public Integer getSdkVersion() {
        return this.f43777a;
    }

    public int hashCode() {
        Integer num = this.f43777a;
        int iHashCode = ((num == null ? 0 : num.hashCode()) ^ ZegoExpressErrorCode.CommonEngineNotStarted) * ZegoExpressErrorCode.CommonEngineNotStarted;
        String str = this.f43778b;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * ZegoExpressErrorCode.CommonEngineNotStarted;
        String str2 = this.f43779c;
        int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * ZegoExpressErrorCode.CommonEngineNotStarted;
        String str3 = this.f43780d;
        int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * ZegoExpressErrorCode.CommonEngineNotStarted;
        String str4 = this.f43781e;
        int iHashCode5 = (iHashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * ZegoExpressErrorCode.CommonEngineNotStarted;
        String str5 = this.f43782f;
        int iHashCode6 = (iHashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * ZegoExpressErrorCode.CommonEngineNotStarted;
        String str6 = this.f43783g;
        int iHashCode7 = (iHashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * ZegoExpressErrorCode.CommonEngineNotStarted;
        String str7 = this.f43784h;
        int iHashCode8 = (iHashCode7 ^ (str7 == null ? 0 : str7.hashCode())) * ZegoExpressErrorCode.CommonEngineNotStarted;
        String str8 = this.f43785i;
        int iHashCode9 = (iHashCode8 ^ (str8 == null ? 0 : str8.hashCode())) * ZegoExpressErrorCode.CommonEngineNotStarted;
        String str9 = this.f43786j;
        int iHashCode10 = (iHashCode9 ^ (str9 == null ? 0 : str9.hashCode())) * ZegoExpressErrorCode.CommonEngineNotStarted;
        String str10 = this.f43787k;
        int iHashCode11 = (iHashCode10 ^ (str10 == null ? 0 : str10.hashCode())) * ZegoExpressErrorCode.CommonEngineNotStarted;
        String str11 = this.f43788l;
        return iHashCode11 ^ (str11 != null ? str11.hashCode() : 0);
    }

    public String toString() {
        return "AndroidClientInfo{sdkVersion=" + this.f43777a + ", model=" + this.f43778b + ", hardware=" + this.f43779c + ", device=" + this.f43780d + ", product=" + this.f43781e + ", osBuild=" + this.f43782f + ", manufacturer=" + this.f43783g + ", fingerprint=" + this.f43784h + ", locale=" + this.f43785i + ", country=" + this.f43786j + ", mccMnc=" + this.f43787k + ", applicationBuild=" + this.f43788l + "}";
    }

    private hj0(@hib Integer num, @hib String str, @hib String str2, @hib String str3, @hib String str4, @hib String str5, @hib String str6, @hib String str7, @hib String str8, @hib String str9, @hib String str10, @hib String str11) {
        this.f43777a = num;
        this.f43778b = str;
        this.f43779c = str2;
        this.f43780d = str3;
        this.f43781e = str4;
        this.f43782f = str5;
        this.f43783g = str6;
        this.f43784h = str7;
        this.f43785i = str8;
        this.f43786j = str9;
        this.f43787k = str10;
        this.f43788l = str11;
    }
}
