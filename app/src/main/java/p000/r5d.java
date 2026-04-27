package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import p000.v27;
import p000.w98;

/* JADX INFO: loaded from: classes5.dex */
public final class r5d extends v27<r5d, C11897b> implements s5d {
    public static final int ADDRESS_LINES_FIELD_NUMBER = 9;
    public static final int ADMINISTRATIVE_AREA_FIELD_NUMBER = 6;
    private static final r5d DEFAULT_INSTANCE;
    public static final int LANGUAGE_CODE_FIELD_NUMBER = 3;
    public static final int LOCALITY_FIELD_NUMBER = 7;
    public static final int ORGANIZATION_FIELD_NUMBER = 11;
    private static volatile uhc<r5d> PARSER = null;
    public static final int POSTAL_CODE_FIELD_NUMBER = 4;
    public static final int RECIPIENTS_FIELD_NUMBER = 10;
    public static final int REGION_CODE_FIELD_NUMBER = 2;
    public static final int REVISION_FIELD_NUMBER = 1;
    public static final int SORTING_CODE_FIELD_NUMBER = 5;
    public static final int SUBLOCALITY_FIELD_NUMBER = 8;
    private int revision_;
    private String regionCode_ = "";
    private String languageCode_ = "";
    private String postalCode_ = "";
    private String sortingCode_ = "";
    private String administrativeArea_ = "";
    private String locality_ = "";
    private String sublocality_ = "";
    private w98.InterfaceC14504k<String> addressLines_ = v27.m23722x();
    private w98.InterfaceC14504k<String> recipients_ = v27.m23722x();
    private String organization_ = "";

    /* JADX INFO: renamed from: r5d$a */
    public static /* synthetic */ class C11896a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f77096a;

        static {
            int[] iArr = new int[v27.EnumC13830i.values().length];
            f77096a = iArr;
            try {
                iArr[v27.EnumC13830i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f77096a[v27.EnumC13830i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f77096a[v27.EnumC13830i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f77096a[v27.EnumC13830i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f77096a[v27.EnumC13830i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f77096a[v27.EnumC13830i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f77096a[v27.EnumC13830i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: r5d$b */
    public static final class C11897b extends v27.AbstractC13823b<r5d, C11897b> implements s5d {
        public /* synthetic */ C11897b(C11896a c11896a) {
            this();
        }

        public C11897b addAddressLines(String str) {
            m23743e();
            ((r5d) this.f89756b).addAddressLines(str);
            return this;
        }

        public C11897b addAddressLinesBytes(vj1 vj1Var) {
            m23743e();
            ((r5d) this.f89756b).addAddressLinesBytes(vj1Var);
            return this;
        }

        public C11897b addAllAddressLines(Iterable<String> iterable) {
            m23743e();
            ((r5d) this.f89756b).addAllAddressLines(iterable);
            return this;
        }

        public C11897b addAllRecipients(Iterable<String> iterable) {
            m23743e();
            ((r5d) this.f89756b).addAllRecipients(iterable);
            return this;
        }

        public C11897b addRecipients(String str) {
            m23743e();
            ((r5d) this.f89756b).addRecipients(str);
            return this;
        }

        public C11897b addRecipientsBytes(vj1 vj1Var) {
            m23743e();
            ((r5d) this.f89756b).addRecipientsBytes(vj1Var);
            return this;
        }

        public C11897b clearAddressLines() {
            m23743e();
            ((r5d) this.f89756b).clearAddressLines();
            return this;
        }

        public C11897b clearAdministrativeArea() {
            m23743e();
            ((r5d) this.f89756b).clearAdministrativeArea();
            return this;
        }

        public C11897b clearLanguageCode() {
            m23743e();
            ((r5d) this.f89756b).clearLanguageCode();
            return this;
        }

        public C11897b clearLocality() {
            m23743e();
            ((r5d) this.f89756b).clearLocality();
            return this;
        }

        public C11897b clearOrganization() {
            m23743e();
            ((r5d) this.f89756b).clearOrganization();
            return this;
        }

        public C11897b clearPostalCode() {
            m23743e();
            ((r5d) this.f89756b).clearPostalCode();
            return this;
        }

        public C11897b clearRecipients() {
            m23743e();
            ((r5d) this.f89756b).clearRecipients();
            return this;
        }

        public C11897b clearRegionCode() {
            m23743e();
            ((r5d) this.f89756b).clearRegionCode();
            return this;
        }

        public C11897b clearRevision() {
            m23743e();
            ((r5d) this.f89756b).clearRevision();
            return this;
        }

        public C11897b clearSortingCode() {
            m23743e();
            ((r5d) this.f89756b).clearSortingCode();
            return this;
        }

        public C11897b clearSublocality() {
            m23743e();
            ((r5d) this.f89756b).clearSublocality();
            return this;
        }

        @Override // p000.s5d
        public String getAddressLines(int i) {
            return ((r5d) this.f89756b).getAddressLines(i);
        }

        @Override // p000.s5d
        public vj1 getAddressLinesBytes(int i) {
            return ((r5d) this.f89756b).getAddressLinesBytes(i);
        }

        @Override // p000.s5d
        public int getAddressLinesCount() {
            return ((r5d) this.f89756b).getAddressLinesCount();
        }

        @Override // p000.s5d
        public List<String> getAddressLinesList() {
            return Collections.unmodifiableList(((r5d) this.f89756b).getAddressLinesList());
        }

        @Override // p000.s5d
        public String getAdministrativeArea() {
            return ((r5d) this.f89756b).getAdministrativeArea();
        }

        @Override // p000.s5d
        public vj1 getAdministrativeAreaBytes() {
            return ((r5d) this.f89756b).getAdministrativeAreaBytes();
        }

        @Override // p000.s5d
        public String getLanguageCode() {
            return ((r5d) this.f89756b).getLanguageCode();
        }

        @Override // p000.s5d
        public vj1 getLanguageCodeBytes() {
            return ((r5d) this.f89756b).getLanguageCodeBytes();
        }

        @Override // p000.s5d
        public String getLocality() {
            return ((r5d) this.f89756b).getLocality();
        }

        @Override // p000.s5d
        public vj1 getLocalityBytes() {
            return ((r5d) this.f89756b).getLocalityBytes();
        }

        @Override // p000.s5d
        public String getOrganization() {
            return ((r5d) this.f89756b).getOrganization();
        }

        @Override // p000.s5d
        public vj1 getOrganizationBytes() {
            return ((r5d) this.f89756b).getOrganizationBytes();
        }

        @Override // p000.s5d
        public String getPostalCode() {
            return ((r5d) this.f89756b).getPostalCode();
        }

        @Override // p000.s5d
        public vj1 getPostalCodeBytes() {
            return ((r5d) this.f89756b).getPostalCodeBytes();
        }

        @Override // p000.s5d
        public String getRecipients(int i) {
            return ((r5d) this.f89756b).getRecipients(i);
        }

        @Override // p000.s5d
        public vj1 getRecipientsBytes(int i) {
            return ((r5d) this.f89756b).getRecipientsBytes(i);
        }

        @Override // p000.s5d
        public int getRecipientsCount() {
            return ((r5d) this.f89756b).getRecipientsCount();
        }

        @Override // p000.s5d
        public List<String> getRecipientsList() {
            return Collections.unmodifiableList(((r5d) this.f89756b).getRecipientsList());
        }

        @Override // p000.s5d
        public String getRegionCode() {
            return ((r5d) this.f89756b).getRegionCode();
        }

        @Override // p000.s5d
        public vj1 getRegionCodeBytes() {
            return ((r5d) this.f89756b).getRegionCodeBytes();
        }

        @Override // p000.s5d
        public int getRevision() {
            return ((r5d) this.f89756b).getRevision();
        }

        @Override // p000.s5d
        public String getSortingCode() {
            return ((r5d) this.f89756b).getSortingCode();
        }

        @Override // p000.s5d
        public vj1 getSortingCodeBytes() {
            return ((r5d) this.f89756b).getSortingCodeBytes();
        }

        @Override // p000.s5d
        public String getSublocality() {
            return ((r5d) this.f89756b).getSublocality();
        }

        @Override // p000.s5d
        public vj1 getSublocalityBytes() {
            return ((r5d) this.f89756b).getSublocalityBytes();
        }

        public C11897b setAddressLines(int i, String str) {
            m23743e();
            ((r5d) this.f89756b).setAddressLines(i, str);
            return this;
        }

        public C11897b setAdministrativeArea(String str) {
            m23743e();
            ((r5d) this.f89756b).setAdministrativeArea(str);
            return this;
        }

        public C11897b setAdministrativeAreaBytes(vj1 vj1Var) {
            m23743e();
            ((r5d) this.f89756b).setAdministrativeAreaBytes(vj1Var);
            return this;
        }

        public C11897b setLanguageCode(String str) {
            m23743e();
            ((r5d) this.f89756b).setLanguageCode(str);
            return this;
        }

        public C11897b setLanguageCodeBytes(vj1 vj1Var) {
            m23743e();
            ((r5d) this.f89756b).setLanguageCodeBytes(vj1Var);
            return this;
        }

        public C11897b setLocality(String str) {
            m23743e();
            ((r5d) this.f89756b).setLocality(str);
            return this;
        }

        public C11897b setLocalityBytes(vj1 vj1Var) {
            m23743e();
            ((r5d) this.f89756b).setLocalityBytes(vj1Var);
            return this;
        }

        public C11897b setOrganization(String str) {
            m23743e();
            ((r5d) this.f89756b).setOrganization(str);
            return this;
        }

        public C11897b setOrganizationBytes(vj1 vj1Var) {
            m23743e();
            ((r5d) this.f89756b).setOrganizationBytes(vj1Var);
            return this;
        }

        public C11897b setPostalCode(String str) {
            m23743e();
            ((r5d) this.f89756b).setPostalCode(str);
            return this;
        }

        public C11897b setPostalCodeBytes(vj1 vj1Var) {
            m23743e();
            ((r5d) this.f89756b).setPostalCodeBytes(vj1Var);
            return this;
        }

        public C11897b setRecipients(int i, String str) {
            m23743e();
            ((r5d) this.f89756b).setRecipients(i, str);
            return this;
        }

        public C11897b setRegionCode(String str) {
            m23743e();
            ((r5d) this.f89756b).setRegionCode(str);
            return this;
        }

        public C11897b setRegionCodeBytes(vj1 vj1Var) {
            m23743e();
            ((r5d) this.f89756b).setRegionCodeBytes(vj1Var);
            return this;
        }

        public C11897b setRevision(int i) {
            m23743e();
            ((r5d) this.f89756b).setRevision(i);
            return this;
        }

        public C11897b setSortingCode(String str) {
            m23743e();
            ((r5d) this.f89756b).setSortingCode(str);
            return this;
        }

        public C11897b setSortingCodeBytes(vj1 vj1Var) {
            m23743e();
            ((r5d) this.f89756b).setSortingCodeBytes(vj1Var);
            return this;
        }

        public C11897b setSublocality(String str) {
            m23743e();
            ((r5d) this.f89756b).setSublocality(str);
            return this;
        }

        public C11897b setSublocalityBytes(vj1 vj1Var) {
            m23743e();
            ((r5d) this.f89756b).setSublocalityBytes(vj1Var);
            return this;
        }

        private C11897b() {
            super(r5d.DEFAULT_INSTANCE);
        }
    }

    static {
        r5d r5dVar = new r5d();
        DEFAULT_INSTANCE = r5dVar;
        v27.m23715h0(r5d.class, r5dVar);
    }

    private r5d() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAddressLines(String str) {
        str.getClass();
        ensureAddressLinesIsMutable();
        this.addressLines_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAddressLinesBytes(vj1 vj1Var) {
        AbstractC1714b3.m2857c(vj1Var);
        ensureAddressLinesIsMutable();
        this.addressLines_.add(vj1Var.toStringUtf8());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllAddressLines(Iterable<String> iterable) {
        ensureAddressLinesIsMutable();
        AbstractC1714b3.m2856b(iterable, this.addressLines_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllRecipients(Iterable<String> iterable) {
        ensureRecipientsIsMutable();
        AbstractC1714b3.m2856b(iterable, this.recipients_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRecipients(String str) {
        str.getClass();
        ensureRecipientsIsMutable();
        this.recipients_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRecipientsBytes(vj1 vj1Var) {
        AbstractC1714b3.m2857c(vj1Var);
        ensureRecipientsIsMutable();
        this.recipients_.add(vj1Var.toStringUtf8());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAddressLines() {
        this.addressLines_ = v27.m23722x();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAdministrativeArea() {
        this.administrativeArea_ = getDefaultInstance().getAdministrativeArea();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLanguageCode() {
        this.languageCode_ = getDefaultInstance().getLanguageCode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLocality() {
        this.locality_ = getDefaultInstance().getLocality();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOrganization() {
        this.organization_ = getDefaultInstance().getOrganization();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPostalCode() {
        this.postalCode_ = getDefaultInstance().getPostalCode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRecipients() {
        this.recipients_ = v27.m23722x();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRegionCode() {
        this.regionCode_ = getDefaultInstance().getRegionCode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRevision() {
        this.revision_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSortingCode() {
        this.sortingCode_ = getDefaultInstance().getSortingCode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSublocality() {
        this.sublocality_ = getDefaultInstance().getSublocality();
    }

    private void ensureAddressLinesIsMutable() {
        w98.InterfaceC14504k<String> interfaceC14504k = this.addressLines_;
        if (interfaceC14504k.isModifiable()) {
            return;
        }
        this.addressLines_ = v27.m23698P(interfaceC14504k);
    }

    private void ensureRecipientsIsMutable() {
        w98.InterfaceC14504k<String> interfaceC14504k = this.recipients_;
        if (interfaceC14504k.isModifiable()) {
            return;
        }
        this.recipients_ = v27.m23698P(interfaceC14504k);
    }

    public static r5d getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C11897b newBuilder() {
        return DEFAULT_INSTANCE.m23738n();
    }

    public static r5d parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (r5d) v27.m23700S(DEFAULT_INSTANCE, inputStream);
    }

    public static r5d parseFrom(ByteBuffer byteBuffer) throws ce8 {
        return (r5d) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
    }

    public static uhc<r5d> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAddressLines(int i, String str) {
        str.getClass();
        ensureAddressLinesIsMutable();
        this.addressLines_.set(i, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdministrativeArea(String str) {
        str.getClass();
        this.administrativeArea_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdministrativeAreaBytes(vj1 vj1Var) {
        AbstractC1714b3.m2857c(vj1Var);
        this.administrativeArea_ = vj1Var.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLanguageCode(String str) {
        str.getClass();
        this.languageCode_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLanguageCodeBytes(vj1 vj1Var) {
        AbstractC1714b3.m2857c(vj1Var);
        this.languageCode_ = vj1Var.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLocality(String str) {
        str.getClass();
        this.locality_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLocalityBytes(vj1 vj1Var) {
        AbstractC1714b3.m2857c(vj1Var);
        this.locality_ = vj1Var.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOrganization(String str) {
        str.getClass();
        this.organization_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOrganizationBytes(vj1 vj1Var) {
        AbstractC1714b3.m2857c(vj1Var);
        this.organization_ = vj1Var.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPostalCode(String str) {
        str.getClass();
        this.postalCode_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPostalCodeBytes(vj1 vj1Var) {
        AbstractC1714b3.m2857c(vj1Var);
        this.postalCode_ = vj1Var.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRecipients(int i, String str) {
        str.getClass();
        ensureRecipientsIsMutable();
        this.recipients_.set(i, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRegionCode(String str) {
        str.getClass();
        this.regionCode_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRegionCodeBytes(vj1 vj1Var) {
        AbstractC1714b3.m2857c(vj1Var);
        this.regionCode_ = vj1Var.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRevision(int i) {
        this.revision_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSortingCode(String str) {
        str.getClass();
        this.sortingCode_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSortingCodeBytes(vj1 vj1Var) {
        AbstractC1714b3.m2857c(vj1Var);
        this.sortingCode_ = vj1Var.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSublocality(String str) {
        str.getClass();
        this.sublocality_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSublocalityBytes(vj1 vj1Var) {
        AbstractC1714b3.m2857c(vj1Var);
        this.sublocality_ = vj1Var.toStringUtf8();
    }

    @Override // p000.s5d
    public String getAddressLines(int i) {
        return this.addressLines_.get(i);
    }

    @Override // p000.s5d
    public vj1 getAddressLinesBytes(int i) {
        return vj1.copyFromUtf8(this.addressLines_.get(i));
    }

    @Override // p000.s5d
    public int getAddressLinesCount() {
        return this.addressLines_.size();
    }

    @Override // p000.s5d
    public List<String> getAddressLinesList() {
        return this.addressLines_;
    }

    @Override // p000.s5d
    public String getAdministrativeArea() {
        return this.administrativeArea_;
    }

    @Override // p000.s5d
    public vj1 getAdministrativeAreaBytes() {
        return vj1.copyFromUtf8(this.administrativeArea_);
    }

    @Override // p000.s5d
    public String getLanguageCode() {
        return this.languageCode_;
    }

    @Override // p000.s5d
    public vj1 getLanguageCodeBytes() {
        return vj1.copyFromUtf8(this.languageCode_);
    }

    @Override // p000.s5d
    public String getLocality() {
        return this.locality_;
    }

    @Override // p000.s5d
    public vj1 getLocalityBytes() {
        return vj1.copyFromUtf8(this.locality_);
    }

    @Override // p000.s5d
    public String getOrganization() {
        return this.organization_;
    }

    @Override // p000.s5d
    public vj1 getOrganizationBytes() {
        return vj1.copyFromUtf8(this.organization_);
    }

    @Override // p000.s5d
    public String getPostalCode() {
        return this.postalCode_;
    }

    @Override // p000.s5d
    public vj1 getPostalCodeBytes() {
        return vj1.copyFromUtf8(this.postalCode_);
    }

    @Override // p000.s5d
    public String getRecipients(int i) {
        return this.recipients_.get(i);
    }

    @Override // p000.s5d
    public vj1 getRecipientsBytes(int i) {
        return vj1.copyFromUtf8(this.recipients_.get(i));
    }

    @Override // p000.s5d
    public int getRecipientsCount() {
        return this.recipients_.size();
    }

    @Override // p000.s5d
    public List<String> getRecipientsList() {
        return this.recipients_;
    }

    @Override // p000.s5d
    public String getRegionCode() {
        return this.regionCode_;
    }

    @Override // p000.s5d
    public vj1 getRegionCodeBytes() {
        return vj1.copyFromUtf8(this.regionCode_);
    }

    @Override // p000.s5d
    public int getRevision() {
        return this.revision_;
    }

    @Override // p000.s5d
    public String getSortingCode() {
        return this.sortingCode_;
    }

    @Override // p000.s5d
    public vj1 getSortingCodeBytes() {
        return vj1.copyFromUtf8(this.sortingCode_);
    }

    @Override // p000.s5d
    public String getSublocality() {
        return this.sublocality_;
    }

    @Override // p000.s5d
    public vj1 getSublocalityBytes() {
        return vj1.copyFromUtf8(this.sublocality_);
    }

    @Override // p000.v27
    /* JADX INFO: renamed from: r */
    public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
        C11896a c11896a = null;
        switch (C11896a.f77096a[enumC13830i.ordinal()]) {
            case 1:
                return new r5d();
            case 2:
                return new C11897b(c11896a);
            case 3:
                return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u000b\u0000\u0000\u0001\u000b\u000b\u0000\u0002\u0000\u0001\u0004\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007Ȉ\bȈ\tȚ\nȚ\u000bȈ", new Object[]{"revision_", "regionCode_", "languageCode_", "postalCode_", "sortingCode_", "administrativeArea_", "locality_", "sublocality_", "addressLines_", "recipients_", "organization_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                uhc<r5d> c13824c = PARSER;
                if (c13824c == null) {
                    synchronized (r5d.class) {
                        try {
                            c13824c = PARSER;
                            if (c13824c == null) {
                                c13824c = new v27.C13824c<>(DEFAULT_INSTANCE);
                                PARSER = c13824c;
                            }
                        } finally {
                        }
                        break;
                    }
                }
                return c13824c;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public static C11897b newBuilder(r5d r5dVar) {
        return DEFAULT_INSTANCE.m23739o(r5dVar);
    }

    public static r5d parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (r5d) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static r5d parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
        return (r5d) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
    }

    public static r5d parseFrom(vj1 vj1Var) throws ce8 {
        return (r5d) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
    }

    public static r5d parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
        return (r5d) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
    }

    public static r5d parseFrom(byte[] bArr) throws ce8 {
        return (r5d) v27.m23710c0(DEFAULT_INSTANCE, bArr);
    }

    public static r5d parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
        return (r5d) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
    }

    public static r5d parseFrom(InputStream inputStream) throws IOException {
        return (r5d) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
    }

    public static r5d parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (r5d) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static r5d parseFrom(f72 f72Var) throws IOException {
        return (r5d) v27.m23704W(DEFAULT_INSTANCE, f72Var);
    }

    public static r5d parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
        return (r5d) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
    }
}
