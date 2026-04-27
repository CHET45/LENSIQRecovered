package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import p000.ai0;
import p000.ai9;
import p000.c25;
import p000.dva;
import p000.ej4;
import p000.eya;
import p000.fwf;
import p000.gx2;
import p000.hlh;
import p000.hod;
import p000.j00;
import p000.kya;
import p000.kyh;
import p000.oz2;
import p000.p35;
import p000.qn0;
import p000.sj9;
import p000.tm7;
import p000.v27;
import p000.w98;
import p000.wjg;
import p000.x11;
import p000.yoh;

/* JADX INFO: loaded from: classes5.dex */
public final class f4f extends v27<f4f, C5595b> implements u4f {
    public static final int APIS_FIELD_NUMBER = 3;
    public static final int AUTHENTICATION_FIELD_NUMBER = 11;
    public static final int BACKEND_FIELD_NUMBER = 8;
    public static final int BILLING_FIELD_NUMBER = 26;
    public static final int CONFIG_VERSION_FIELD_NUMBER = 20;
    public static final int CONTEXT_FIELD_NUMBER = 12;
    public static final int CONTROL_FIELD_NUMBER = 21;
    private static final f4f DEFAULT_INSTANCE;
    public static final int DOCUMENTATION_FIELD_NUMBER = 6;
    public static final int ENDPOINTS_FIELD_NUMBER = 18;
    public static final int ENUMS_FIELD_NUMBER = 5;
    public static final int HTTP_FIELD_NUMBER = 9;
    public static final int ID_FIELD_NUMBER = 33;
    public static final int LOGGING_FIELD_NUMBER = 27;
    public static final int LOGS_FIELD_NUMBER = 23;
    public static final int METRICS_FIELD_NUMBER = 24;
    public static final int MONITORED_RESOURCES_FIELD_NUMBER = 25;
    public static final int MONITORING_FIELD_NUMBER = 28;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile uhc<f4f> PARSER = null;
    public static final int PRODUCER_PROJECT_ID_FIELD_NUMBER = 22;
    public static final int QUOTA_FIELD_NUMBER = 10;
    public static final int SOURCE_INFO_FIELD_NUMBER = 37;
    public static final int SYSTEM_PARAMETERS_FIELD_NUMBER = 29;
    public static final int TITLE_FIELD_NUMBER = 2;
    public static final int TYPES_FIELD_NUMBER = 4;
    public static final int USAGE_FIELD_NUMBER = 15;
    private ai0 authentication_;
    private qn0 backend_;
    private x11 billing_;
    private int bitField0_;
    private yoh configVersion_;
    private gx2 context_;
    private oz2 control_;
    private ej4 documentation_;
    private tm7 http_;
    private sj9 logging_;
    private kya monitoring_;
    private hod quota_;
    private fwf sourceInfo_;
    private wjg systemParameters_;
    private kyh usage_;
    private String name_ = "";
    private String id_ = "";
    private String title_ = "";
    private String producerProjectId_ = "";
    private w98.InterfaceC14504k<j00> apis_ = v27.m23722x();
    private w98.InterfaceC14504k<hlh> types_ = v27.m23722x();
    private w98.InterfaceC14504k<p35> enums_ = v27.m23722x();
    private w98.InterfaceC14504k<c25> endpoints_ = v27.m23722x();
    private w98.InterfaceC14504k<ai9> logs_ = v27.m23722x();
    private w98.InterfaceC14504k<dva> metrics_ = v27.m23722x();
    private w98.InterfaceC14504k<eya> monitoredResources_ = v27.m23722x();

    /* JADX INFO: renamed from: f4f$a */
    public static /* synthetic */ class C5594a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f35330a;

        static {
            int[] iArr = new int[v27.EnumC13830i.values().length];
            f35330a = iArr;
            try {
                iArr[v27.EnumC13830i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f35330a[v27.EnumC13830i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f35330a[v27.EnumC13830i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f35330a[v27.EnumC13830i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f35330a[v27.EnumC13830i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f35330a[v27.EnumC13830i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f35330a[v27.EnumC13830i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: f4f$b */
    public static final class C5595b extends v27.AbstractC13823b<f4f, C5595b> implements u4f {
        public /* synthetic */ C5595b(C5594a c5594a) {
            this();
        }

        public C5595b addAllApis(Iterable<? extends j00> iterable) {
            m23743e();
            ((f4f) this.f89756b).addAllApis(iterable);
            return this;
        }

        public C5595b addAllEndpoints(Iterable<? extends c25> iterable) {
            m23743e();
            ((f4f) this.f89756b).addAllEndpoints(iterable);
            return this;
        }

        public C5595b addAllEnums(Iterable<? extends p35> iterable) {
            m23743e();
            ((f4f) this.f89756b).addAllEnums(iterable);
            return this;
        }

        public C5595b addAllLogs(Iterable<? extends ai9> iterable) {
            m23743e();
            ((f4f) this.f89756b).addAllLogs(iterable);
            return this;
        }

        public C5595b addAllMetrics(Iterable<? extends dva> iterable) {
            m23743e();
            ((f4f) this.f89756b).addAllMetrics(iterable);
            return this;
        }

        public C5595b addAllMonitoredResources(Iterable<? extends eya> iterable) {
            m23743e();
            ((f4f) this.f89756b).addAllMonitoredResources(iterable);
            return this;
        }

        public C5595b addAllTypes(Iterable<? extends hlh> iterable) {
            m23743e();
            ((f4f) this.f89756b).addAllTypes(iterable);
            return this;
        }

        public C5595b addApis(j00 j00Var) {
            m23743e();
            ((f4f) this.f89756b).addApis(j00Var);
            return this;
        }

        public C5595b addEndpoints(c25 c25Var) {
            m23743e();
            ((f4f) this.f89756b).addEndpoints(c25Var);
            return this;
        }

        public C5595b addEnums(p35 p35Var) {
            m23743e();
            ((f4f) this.f89756b).addEnums(p35Var);
            return this;
        }

        public C5595b addLogs(ai9 ai9Var) {
            m23743e();
            ((f4f) this.f89756b).addLogs(ai9Var);
            return this;
        }

        public C5595b addMetrics(dva dvaVar) {
            m23743e();
            ((f4f) this.f89756b).addMetrics(dvaVar);
            return this;
        }

        public C5595b addMonitoredResources(eya eyaVar) {
            m23743e();
            ((f4f) this.f89756b).addMonitoredResources(eyaVar);
            return this;
        }

        public C5595b addTypes(hlh hlhVar) {
            m23743e();
            ((f4f) this.f89756b).addTypes(hlhVar);
            return this;
        }

        public C5595b clearApis() {
            m23743e();
            ((f4f) this.f89756b).clearApis();
            return this;
        }

        public C5595b clearAuthentication() {
            m23743e();
            ((f4f) this.f89756b).clearAuthentication();
            return this;
        }

        public C5595b clearBackend() {
            m23743e();
            ((f4f) this.f89756b).clearBackend();
            return this;
        }

        public C5595b clearBilling() {
            m23743e();
            ((f4f) this.f89756b).clearBilling();
            return this;
        }

        public C5595b clearConfigVersion() {
            m23743e();
            ((f4f) this.f89756b).clearConfigVersion();
            return this;
        }

        public C5595b clearContext() {
            m23743e();
            ((f4f) this.f89756b).clearContext();
            return this;
        }

        public C5595b clearControl() {
            m23743e();
            ((f4f) this.f89756b).clearControl();
            return this;
        }

        public C5595b clearDocumentation() {
            m23743e();
            ((f4f) this.f89756b).clearDocumentation();
            return this;
        }

        public C5595b clearEndpoints() {
            m23743e();
            ((f4f) this.f89756b).clearEndpoints();
            return this;
        }

        public C5595b clearEnums() {
            m23743e();
            ((f4f) this.f89756b).clearEnums();
            return this;
        }

        public C5595b clearHttp() {
            m23743e();
            ((f4f) this.f89756b).clearHttp();
            return this;
        }

        public C5595b clearId() {
            m23743e();
            ((f4f) this.f89756b).clearId();
            return this;
        }

        public C5595b clearLogging() {
            m23743e();
            ((f4f) this.f89756b).clearLogging();
            return this;
        }

        public C5595b clearLogs() {
            m23743e();
            ((f4f) this.f89756b).clearLogs();
            return this;
        }

        public C5595b clearMetrics() {
            m23743e();
            ((f4f) this.f89756b).clearMetrics();
            return this;
        }

        public C5595b clearMonitoredResources() {
            m23743e();
            ((f4f) this.f89756b).clearMonitoredResources();
            return this;
        }

        public C5595b clearMonitoring() {
            m23743e();
            ((f4f) this.f89756b).clearMonitoring();
            return this;
        }

        public C5595b clearName() {
            m23743e();
            ((f4f) this.f89756b).clearName();
            return this;
        }

        public C5595b clearProducerProjectId() {
            m23743e();
            ((f4f) this.f89756b).clearProducerProjectId();
            return this;
        }

        public C5595b clearQuota() {
            m23743e();
            ((f4f) this.f89756b).clearQuota();
            return this;
        }

        public C5595b clearSourceInfo() {
            m23743e();
            ((f4f) this.f89756b).clearSourceInfo();
            return this;
        }

        public C5595b clearSystemParameters() {
            m23743e();
            ((f4f) this.f89756b).clearSystemParameters();
            return this;
        }

        public C5595b clearTitle() {
            m23743e();
            ((f4f) this.f89756b).clearTitle();
            return this;
        }

        public C5595b clearTypes() {
            m23743e();
            ((f4f) this.f89756b).clearTypes();
            return this;
        }

        public C5595b clearUsage() {
            m23743e();
            ((f4f) this.f89756b).clearUsage();
            return this;
        }

        @Override // p000.u4f
        public j00 getApis(int i) {
            return ((f4f) this.f89756b).getApis(i);
        }

        @Override // p000.u4f
        public int getApisCount() {
            return ((f4f) this.f89756b).getApisCount();
        }

        @Override // p000.u4f
        public List<j00> getApisList() {
            return Collections.unmodifiableList(((f4f) this.f89756b).getApisList());
        }

        @Override // p000.u4f
        public ai0 getAuthentication() {
            return ((f4f) this.f89756b).getAuthentication();
        }

        @Override // p000.u4f
        public qn0 getBackend() {
            return ((f4f) this.f89756b).getBackend();
        }

        @Override // p000.u4f
        public x11 getBilling() {
            return ((f4f) this.f89756b).getBilling();
        }

        @Override // p000.u4f
        public yoh getConfigVersion() {
            return ((f4f) this.f89756b).getConfigVersion();
        }

        @Override // p000.u4f
        public gx2 getContext() {
            return ((f4f) this.f89756b).getContext();
        }

        @Override // p000.u4f
        public oz2 getControl() {
            return ((f4f) this.f89756b).getControl();
        }

        @Override // p000.u4f
        public ej4 getDocumentation() {
            return ((f4f) this.f89756b).getDocumentation();
        }

        @Override // p000.u4f
        public c25 getEndpoints(int i) {
            return ((f4f) this.f89756b).getEndpoints(i);
        }

        @Override // p000.u4f
        public int getEndpointsCount() {
            return ((f4f) this.f89756b).getEndpointsCount();
        }

        @Override // p000.u4f
        public List<c25> getEndpointsList() {
            return Collections.unmodifiableList(((f4f) this.f89756b).getEndpointsList());
        }

        @Override // p000.u4f
        public p35 getEnums(int i) {
            return ((f4f) this.f89756b).getEnums(i);
        }

        @Override // p000.u4f
        public int getEnumsCount() {
            return ((f4f) this.f89756b).getEnumsCount();
        }

        @Override // p000.u4f
        public List<p35> getEnumsList() {
            return Collections.unmodifiableList(((f4f) this.f89756b).getEnumsList());
        }

        @Override // p000.u4f
        public tm7 getHttp() {
            return ((f4f) this.f89756b).getHttp();
        }

        @Override // p000.u4f
        public String getId() {
            return ((f4f) this.f89756b).getId();
        }

        @Override // p000.u4f
        public vj1 getIdBytes() {
            return ((f4f) this.f89756b).getIdBytes();
        }

        @Override // p000.u4f
        public sj9 getLogging() {
            return ((f4f) this.f89756b).getLogging();
        }

        @Override // p000.u4f
        public ai9 getLogs(int i) {
            return ((f4f) this.f89756b).getLogs(i);
        }

        @Override // p000.u4f
        public int getLogsCount() {
            return ((f4f) this.f89756b).getLogsCount();
        }

        @Override // p000.u4f
        public List<ai9> getLogsList() {
            return Collections.unmodifiableList(((f4f) this.f89756b).getLogsList());
        }

        @Override // p000.u4f
        public dva getMetrics(int i) {
            return ((f4f) this.f89756b).getMetrics(i);
        }

        @Override // p000.u4f
        public int getMetricsCount() {
            return ((f4f) this.f89756b).getMetricsCount();
        }

        @Override // p000.u4f
        public List<dva> getMetricsList() {
            return Collections.unmodifiableList(((f4f) this.f89756b).getMetricsList());
        }

        @Override // p000.u4f
        public eya getMonitoredResources(int i) {
            return ((f4f) this.f89756b).getMonitoredResources(i);
        }

        @Override // p000.u4f
        public int getMonitoredResourcesCount() {
            return ((f4f) this.f89756b).getMonitoredResourcesCount();
        }

        @Override // p000.u4f
        public List<eya> getMonitoredResourcesList() {
            return Collections.unmodifiableList(((f4f) this.f89756b).getMonitoredResourcesList());
        }

        @Override // p000.u4f
        public kya getMonitoring() {
            return ((f4f) this.f89756b).getMonitoring();
        }

        @Override // p000.u4f
        public String getName() {
            return ((f4f) this.f89756b).getName();
        }

        @Override // p000.u4f
        public vj1 getNameBytes() {
            return ((f4f) this.f89756b).getNameBytes();
        }

        @Override // p000.u4f
        public String getProducerProjectId() {
            return ((f4f) this.f89756b).getProducerProjectId();
        }

        @Override // p000.u4f
        public vj1 getProducerProjectIdBytes() {
            return ((f4f) this.f89756b).getProducerProjectIdBytes();
        }

        @Override // p000.u4f
        public hod getQuota() {
            return ((f4f) this.f89756b).getQuota();
        }

        @Override // p000.u4f
        public fwf getSourceInfo() {
            return ((f4f) this.f89756b).getSourceInfo();
        }

        @Override // p000.u4f
        public wjg getSystemParameters() {
            return ((f4f) this.f89756b).getSystemParameters();
        }

        @Override // p000.u4f
        public String getTitle() {
            return ((f4f) this.f89756b).getTitle();
        }

        @Override // p000.u4f
        public vj1 getTitleBytes() {
            return ((f4f) this.f89756b).getTitleBytes();
        }

        @Override // p000.u4f
        public hlh getTypes(int i) {
            return ((f4f) this.f89756b).getTypes(i);
        }

        @Override // p000.u4f
        public int getTypesCount() {
            return ((f4f) this.f89756b).getTypesCount();
        }

        @Override // p000.u4f
        public List<hlh> getTypesList() {
            return Collections.unmodifiableList(((f4f) this.f89756b).getTypesList());
        }

        @Override // p000.u4f
        public kyh getUsage() {
            return ((f4f) this.f89756b).getUsage();
        }

        @Override // p000.u4f
        public boolean hasAuthentication() {
            return ((f4f) this.f89756b).hasAuthentication();
        }

        @Override // p000.u4f
        public boolean hasBackend() {
            return ((f4f) this.f89756b).hasBackend();
        }

        @Override // p000.u4f
        public boolean hasBilling() {
            return ((f4f) this.f89756b).hasBilling();
        }

        @Override // p000.u4f
        public boolean hasConfigVersion() {
            return ((f4f) this.f89756b).hasConfigVersion();
        }

        @Override // p000.u4f
        public boolean hasContext() {
            return ((f4f) this.f89756b).hasContext();
        }

        @Override // p000.u4f
        public boolean hasControl() {
            return ((f4f) this.f89756b).hasControl();
        }

        @Override // p000.u4f
        public boolean hasDocumentation() {
            return ((f4f) this.f89756b).hasDocumentation();
        }

        @Override // p000.u4f
        public boolean hasHttp() {
            return ((f4f) this.f89756b).hasHttp();
        }

        @Override // p000.u4f
        public boolean hasLogging() {
            return ((f4f) this.f89756b).hasLogging();
        }

        @Override // p000.u4f
        public boolean hasMonitoring() {
            return ((f4f) this.f89756b).hasMonitoring();
        }

        @Override // p000.u4f
        public boolean hasQuota() {
            return ((f4f) this.f89756b).hasQuota();
        }

        @Override // p000.u4f
        public boolean hasSourceInfo() {
            return ((f4f) this.f89756b).hasSourceInfo();
        }

        @Override // p000.u4f
        public boolean hasSystemParameters() {
            return ((f4f) this.f89756b).hasSystemParameters();
        }

        @Override // p000.u4f
        public boolean hasUsage() {
            return ((f4f) this.f89756b).hasUsage();
        }

        public C5595b mergeAuthentication(ai0 ai0Var) {
            m23743e();
            ((f4f) this.f89756b).mergeAuthentication(ai0Var);
            return this;
        }

        public C5595b mergeBackend(qn0 qn0Var) {
            m23743e();
            ((f4f) this.f89756b).mergeBackend(qn0Var);
            return this;
        }

        public C5595b mergeBilling(x11 x11Var) {
            m23743e();
            ((f4f) this.f89756b).mergeBilling(x11Var);
            return this;
        }

        public C5595b mergeConfigVersion(yoh yohVar) {
            m23743e();
            ((f4f) this.f89756b).mergeConfigVersion(yohVar);
            return this;
        }

        public C5595b mergeContext(gx2 gx2Var) {
            m23743e();
            ((f4f) this.f89756b).mergeContext(gx2Var);
            return this;
        }

        public C5595b mergeControl(oz2 oz2Var) {
            m23743e();
            ((f4f) this.f89756b).mergeControl(oz2Var);
            return this;
        }

        public C5595b mergeDocumentation(ej4 ej4Var) {
            m23743e();
            ((f4f) this.f89756b).mergeDocumentation(ej4Var);
            return this;
        }

        public C5595b mergeHttp(tm7 tm7Var) {
            m23743e();
            ((f4f) this.f89756b).mergeHttp(tm7Var);
            return this;
        }

        public C5595b mergeLogging(sj9 sj9Var) {
            m23743e();
            ((f4f) this.f89756b).mergeLogging(sj9Var);
            return this;
        }

        public C5595b mergeMonitoring(kya kyaVar) {
            m23743e();
            ((f4f) this.f89756b).mergeMonitoring(kyaVar);
            return this;
        }

        public C5595b mergeQuota(hod hodVar) {
            m23743e();
            ((f4f) this.f89756b).mergeQuota(hodVar);
            return this;
        }

        public C5595b mergeSourceInfo(fwf fwfVar) {
            m23743e();
            ((f4f) this.f89756b).mergeSourceInfo(fwfVar);
            return this;
        }

        public C5595b mergeSystemParameters(wjg wjgVar) {
            m23743e();
            ((f4f) this.f89756b).mergeSystemParameters(wjgVar);
            return this;
        }

        public C5595b mergeUsage(kyh kyhVar) {
            m23743e();
            ((f4f) this.f89756b).mergeUsage(kyhVar);
            return this;
        }

        public C5595b removeApis(int i) {
            m23743e();
            ((f4f) this.f89756b).removeApis(i);
            return this;
        }

        public C5595b removeEndpoints(int i) {
            m23743e();
            ((f4f) this.f89756b).removeEndpoints(i);
            return this;
        }

        public C5595b removeEnums(int i) {
            m23743e();
            ((f4f) this.f89756b).removeEnums(i);
            return this;
        }

        public C5595b removeLogs(int i) {
            m23743e();
            ((f4f) this.f89756b).removeLogs(i);
            return this;
        }

        public C5595b removeMetrics(int i) {
            m23743e();
            ((f4f) this.f89756b).removeMetrics(i);
            return this;
        }

        public C5595b removeMonitoredResources(int i) {
            m23743e();
            ((f4f) this.f89756b).removeMonitoredResources(i);
            return this;
        }

        public C5595b removeTypes(int i) {
            m23743e();
            ((f4f) this.f89756b).removeTypes(i);
            return this;
        }

        public C5595b setApis(int i, j00 j00Var) {
            m23743e();
            ((f4f) this.f89756b).setApis(i, j00Var);
            return this;
        }

        public C5595b setAuthentication(ai0 ai0Var) {
            m23743e();
            ((f4f) this.f89756b).setAuthentication(ai0Var);
            return this;
        }

        public C5595b setBackend(qn0 qn0Var) {
            m23743e();
            ((f4f) this.f89756b).setBackend(qn0Var);
            return this;
        }

        public C5595b setBilling(x11 x11Var) {
            m23743e();
            ((f4f) this.f89756b).setBilling(x11Var);
            return this;
        }

        public C5595b setConfigVersion(yoh yohVar) {
            m23743e();
            ((f4f) this.f89756b).setConfigVersion(yohVar);
            return this;
        }

        public C5595b setContext(gx2 gx2Var) {
            m23743e();
            ((f4f) this.f89756b).setContext(gx2Var);
            return this;
        }

        public C5595b setControl(oz2 oz2Var) {
            m23743e();
            ((f4f) this.f89756b).setControl(oz2Var);
            return this;
        }

        public C5595b setDocumentation(ej4 ej4Var) {
            m23743e();
            ((f4f) this.f89756b).setDocumentation(ej4Var);
            return this;
        }

        public C5595b setEndpoints(int i, c25 c25Var) {
            m23743e();
            ((f4f) this.f89756b).setEndpoints(i, c25Var);
            return this;
        }

        public C5595b setEnums(int i, p35 p35Var) {
            m23743e();
            ((f4f) this.f89756b).setEnums(i, p35Var);
            return this;
        }

        public C5595b setHttp(tm7 tm7Var) {
            m23743e();
            ((f4f) this.f89756b).setHttp(tm7Var);
            return this;
        }

        public C5595b setId(String str) {
            m23743e();
            ((f4f) this.f89756b).setId(str);
            return this;
        }

        public C5595b setIdBytes(vj1 vj1Var) {
            m23743e();
            ((f4f) this.f89756b).setIdBytes(vj1Var);
            return this;
        }

        public C5595b setLogging(sj9 sj9Var) {
            m23743e();
            ((f4f) this.f89756b).setLogging(sj9Var);
            return this;
        }

        public C5595b setLogs(int i, ai9 ai9Var) {
            m23743e();
            ((f4f) this.f89756b).setLogs(i, ai9Var);
            return this;
        }

        public C5595b setMetrics(int i, dva dvaVar) {
            m23743e();
            ((f4f) this.f89756b).setMetrics(i, dvaVar);
            return this;
        }

        public C5595b setMonitoredResources(int i, eya eyaVar) {
            m23743e();
            ((f4f) this.f89756b).setMonitoredResources(i, eyaVar);
            return this;
        }

        public C5595b setMonitoring(kya kyaVar) {
            m23743e();
            ((f4f) this.f89756b).setMonitoring(kyaVar);
            return this;
        }

        public C5595b setName(String str) {
            m23743e();
            ((f4f) this.f89756b).setName(str);
            return this;
        }

        public C5595b setNameBytes(vj1 vj1Var) {
            m23743e();
            ((f4f) this.f89756b).setNameBytes(vj1Var);
            return this;
        }

        public C5595b setProducerProjectId(String str) {
            m23743e();
            ((f4f) this.f89756b).setProducerProjectId(str);
            return this;
        }

        public C5595b setProducerProjectIdBytes(vj1 vj1Var) {
            m23743e();
            ((f4f) this.f89756b).setProducerProjectIdBytes(vj1Var);
            return this;
        }

        public C5595b setQuota(hod hodVar) {
            m23743e();
            ((f4f) this.f89756b).setQuota(hodVar);
            return this;
        }

        public C5595b setSourceInfo(fwf fwfVar) {
            m23743e();
            ((f4f) this.f89756b).setSourceInfo(fwfVar);
            return this;
        }

        public C5595b setSystemParameters(wjg wjgVar) {
            m23743e();
            ((f4f) this.f89756b).setSystemParameters(wjgVar);
            return this;
        }

        public C5595b setTitle(String str) {
            m23743e();
            ((f4f) this.f89756b).setTitle(str);
            return this;
        }

        public C5595b setTitleBytes(vj1 vj1Var) {
            m23743e();
            ((f4f) this.f89756b).setTitleBytes(vj1Var);
            return this;
        }

        public C5595b setTypes(int i, hlh hlhVar) {
            m23743e();
            ((f4f) this.f89756b).setTypes(i, hlhVar);
            return this;
        }

        public C5595b setUsage(kyh kyhVar) {
            m23743e();
            ((f4f) this.f89756b).setUsage(kyhVar);
            return this;
        }

        private C5595b() {
            super(f4f.DEFAULT_INSTANCE);
        }

        public C5595b addApis(int i, j00 j00Var) {
            m23743e();
            ((f4f) this.f89756b).addApis(i, j00Var);
            return this;
        }

        public C5595b addEndpoints(int i, c25 c25Var) {
            m23743e();
            ((f4f) this.f89756b).addEndpoints(i, c25Var);
            return this;
        }

        public C5595b addEnums(int i, p35 p35Var) {
            m23743e();
            ((f4f) this.f89756b).addEnums(i, p35Var);
            return this;
        }

        public C5595b addLogs(int i, ai9 ai9Var) {
            m23743e();
            ((f4f) this.f89756b).addLogs(i, ai9Var);
            return this;
        }

        public C5595b addMetrics(int i, dva dvaVar) {
            m23743e();
            ((f4f) this.f89756b).addMetrics(i, dvaVar);
            return this;
        }

        public C5595b addMonitoredResources(int i, eya eyaVar) {
            m23743e();
            ((f4f) this.f89756b).addMonitoredResources(i, eyaVar);
            return this;
        }

        public C5595b addTypes(int i, hlh hlhVar) {
            m23743e();
            ((f4f) this.f89756b).addTypes(i, hlhVar);
            return this;
        }

        public C5595b setApis(int i, j00.C7699b c7699b) {
            m23743e();
            ((f4f) this.f89756b).setApis(i, c7699b.build());
            return this;
        }

        public C5595b setAuthentication(ai0.C0255b c0255b) {
            m23743e();
            ((f4f) this.f89756b).setAuthentication(c0255b.build());
            return this;
        }

        public C5595b setBackend(qn0.C11564b c11564b) {
            m23743e();
            ((f4f) this.f89756b).setBackend(c11564b.build());
            return this;
        }

        public C5595b setBilling(x11.C14871d c14871d) {
            m23743e();
            ((f4f) this.f89756b).setBilling(c14871d.build());
            return this;
        }

        public C5595b setConfigVersion(yoh.C15752b c15752b) {
            m23743e();
            ((f4f) this.f89756b).setConfigVersion(c15752b.build());
            return this;
        }

        public C5595b setContext(gx2.C6636b c6636b) {
            m23743e();
            ((f4f) this.f89756b).setContext(c6636b.build());
            return this;
        }

        public C5595b setControl(oz2.C10723b c10723b) {
            m23743e();
            ((f4f) this.f89756b).setControl(c10723b.build());
            return this;
        }

        public C5595b setDocumentation(ej4.C5342b c5342b) {
            m23743e();
            ((f4f) this.f89756b).setDocumentation(c5342b.build());
            return this;
        }

        public C5595b setEndpoints(int i, c25.C2166b c2166b) {
            m23743e();
            ((f4f) this.f89756b).setEndpoints(i, c2166b.build());
            return this;
        }

        public C5595b setEnums(int i, p35.C10779b c10779b) {
            m23743e();
            ((f4f) this.f89756b).setEnums(i, c10779b.build());
            return this;
        }

        public C5595b setHttp(tm7.C13105b c13105b) {
            m23743e();
            ((f4f) this.f89756b).setHttp(c13105b.build());
            return this;
        }

        public C5595b setLogging(sj9.C12626b c12626b) {
            m23743e();
            ((f4f) this.f89756b).setLogging(c12626b.build());
            return this;
        }

        public C5595b setLogs(int i, ai9.C0264b c0264b) {
            m23743e();
            ((f4f) this.f89756b).setLogs(i, c0264b.build());
            return this;
        }

        public C5595b setMetrics(int i, dva.C4968b c4968b) {
            m23743e();
            ((f4f) this.f89756b).setMetrics(i, c4968b.build());
            return this;
        }

        public C5595b setMonitoredResources(int i, eya.C5518b c5518b) {
            m23743e();
            ((f4f) this.f89756b).setMonitoredResources(i, c5518b.build());
            return this;
        }

        public C5595b setMonitoring(kya.C8555b c8555b) {
            m23743e();
            ((f4f) this.f89756b).setMonitoring(c8555b.build());
            return this;
        }

        public C5595b setQuota(hod.C6959b c6959b) {
            m23743e();
            ((f4f) this.f89756b).setQuota(c6959b.build());
            return this;
        }

        public C5595b setSourceInfo(fwf.C6009b c6009b) {
            m23743e();
            ((f4f) this.f89756b).setSourceInfo(c6009b.build());
            return this;
        }

        public C5595b setSystemParameters(wjg.C14650b c14650b) {
            m23743e();
            ((f4f) this.f89756b).setSystemParameters(c14650b.build());
            return this;
        }

        public C5595b setTypes(int i, hlh.C6907b c6907b) {
            m23743e();
            ((f4f) this.f89756b).setTypes(i, c6907b.build());
            return this;
        }

        public C5595b setUsage(kyh.C8560b c8560b) {
            m23743e();
            ((f4f) this.f89756b).setUsage(c8560b.build());
            return this;
        }

        public C5595b addApis(j00.C7699b c7699b) {
            m23743e();
            ((f4f) this.f89756b).addApis(c7699b.build());
            return this;
        }

        public C5595b addEndpoints(c25.C2166b c2166b) {
            m23743e();
            ((f4f) this.f89756b).addEndpoints(c2166b.build());
            return this;
        }

        public C5595b addEnums(p35.C10779b c10779b) {
            m23743e();
            ((f4f) this.f89756b).addEnums(c10779b.build());
            return this;
        }

        public C5595b addLogs(ai9.C0264b c0264b) {
            m23743e();
            ((f4f) this.f89756b).addLogs(c0264b.build());
            return this;
        }

        public C5595b addMetrics(dva.C4968b c4968b) {
            m23743e();
            ((f4f) this.f89756b).addMetrics(c4968b.build());
            return this;
        }

        public C5595b addMonitoredResources(eya.C5518b c5518b) {
            m23743e();
            ((f4f) this.f89756b).addMonitoredResources(c5518b.build());
            return this;
        }

        public C5595b addTypes(hlh.C6907b c6907b) {
            m23743e();
            ((f4f) this.f89756b).addTypes(c6907b.build());
            return this;
        }

        public C5595b addApis(int i, j00.C7699b c7699b) {
            m23743e();
            ((f4f) this.f89756b).addApis(i, c7699b.build());
            return this;
        }

        public C5595b addEndpoints(int i, c25.C2166b c2166b) {
            m23743e();
            ((f4f) this.f89756b).addEndpoints(i, c2166b.build());
            return this;
        }

        public C5595b addEnums(int i, p35.C10779b c10779b) {
            m23743e();
            ((f4f) this.f89756b).addEnums(i, c10779b.build());
            return this;
        }

        public C5595b addLogs(int i, ai9.C0264b c0264b) {
            m23743e();
            ((f4f) this.f89756b).addLogs(i, c0264b.build());
            return this;
        }

        public C5595b addMetrics(int i, dva.C4968b c4968b) {
            m23743e();
            ((f4f) this.f89756b).addMetrics(i, c4968b.build());
            return this;
        }

        public C5595b addMonitoredResources(int i, eya.C5518b c5518b) {
            m23743e();
            ((f4f) this.f89756b).addMonitoredResources(i, c5518b.build());
            return this;
        }

        public C5595b addTypes(int i, hlh.C6907b c6907b) {
            m23743e();
            ((f4f) this.f89756b).addTypes(i, c6907b.build());
            return this;
        }
    }

    static {
        f4f f4fVar = new f4f();
        DEFAULT_INSTANCE = f4fVar;
        v27.m23715h0(f4f.class, f4fVar);
    }

    private f4f() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllApis(Iterable<? extends j00> iterable) {
        ensureApisIsMutable();
        AbstractC1714b3.m2856b(iterable, this.apis_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllEndpoints(Iterable<? extends c25> iterable) {
        ensureEndpointsIsMutable();
        AbstractC1714b3.m2856b(iterable, this.endpoints_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllEnums(Iterable<? extends p35> iterable) {
        ensureEnumsIsMutable();
        AbstractC1714b3.m2856b(iterable, this.enums_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllLogs(Iterable<? extends ai9> iterable) {
        ensureLogsIsMutable();
        AbstractC1714b3.m2856b(iterable, this.logs_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllMetrics(Iterable<? extends dva> iterable) {
        ensureMetricsIsMutable();
        AbstractC1714b3.m2856b(iterable, this.metrics_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllMonitoredResources(Iterable<? extends eya> iterable) {
        ensureMonitoredResourcesIsMutable();
        AbstractC1714b3.m2856b(iterable, this.monitoredResources_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllTypes(Iterable<? extends hlh> iterable) {
        ensureTypesIsMutable();
        AbstractC1714b3.m2856b(iterable, this.types_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addApis(j00 j00Var) {
        j00Var.getClass();
        ensureApisIsMutable();
        this.apis_.add(j00Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addEndpoints(c25 c25Var) {
        c25Var.getClass();
        ensureEndpointsIsMutable();
        this.endpoints_.add(c25Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addEnums(p35 p35Var) {
        p35Var.getClass();
        ensureEnumsIsMutable();
        this.enums_.add(p35Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addLogs(ai9 ai9Var) {
        ai9Var.getClass();
        ensureLogsIsMutable();
        this.logs_.add(ai9Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addMetrics(dva dvaVar) {
        dvaVar.getClass();
        ensureMetricsIsMutable();
        this.metrics_.add(dvaVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addMonitoredResources(eya eyaVar) {
        eyaVar.getClass();
        ensureMonitoredResourcesIsMutable();
        this.monitoredResources_.add(eyaVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addTypes(hlh hlhVar) {
        hlhVar.getClass();
        ensureTypesIsMutable();
        this.types_.add(hlhVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearApis() {
        this.apis_ = v27.m23722x();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAuthentication() {
        this.authentication_ = null;
        this.bitField0_ &= -33;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBackend() {
        this.backend_ = null;
        this.bitField0_ &= -5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBilling() {
        this.billing_ = null;
        this.bitField0_ &= -513;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearConfigVersion() {
        this.configVersion_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearContext() {
        this.context_ = null;
        this.bitField0_ &= -65;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearControl() {
        this.control_ = null;
        this.bitField0_ &= -257;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDocumentation() {
        this.documentation_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEndpoints() {
        this.endpoints_ = v27.m23722x();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEnums() {
        this.enums_ = v27.m23722x();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHttp() {
        this.http_ = null;
        this.bitField0_ &= -9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearId() {
        this.id_ = getDefaultInstance().getId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLogging() {
        this.logging_ = null;
        this.bitField0_ &= -1025;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLogs() {
        this.logs_ = v27.m23722x();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMetrics() {
        this.metrics_ = v27.m23722x();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMonitoredResources() {
        this.monitoredResources_ = v27.m23722x();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMonitoring() {
        this.monitoring_ = null;
        this.bitField0_ &= -2049;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearProducerProjectId() {
        this.producerProjectId_ = getDefaultInstance().getProducerProjectId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearQuota() {
        this.quota_ = null;
        this.bitField0_ &= -17;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSourceInfo() {
        this.sourceInfo_ = null;
        this.bitField0_ &= -8193;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSystemParameters() {
        this.systemParameters_ = null;
        this.bitField0_ &= -4097;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTitle() {
        this.title_ = getDefaultInstance().getTitle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTypes() {
        this.types_ = v27.m23722x();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUsage() {
        this.usage_ = null;
        this.bitField0_ &= -129;
    }

    private void ensureApisIsMutable() {
        w98.InterfaceC14504k<j00> interfaceC14504k = this.apis_;
        if (interfaceC14504k.isModifiable()) {
            return;
        }
        this.apis_ = v27.m23698P(interfaceC14504k);
    }

    private void ensureEndpointsIsMutable() {
        w98.InterfaceC14504k<c25> interfaceC14504k = this.endpoints_;
        if (interfaceC14504k.isModifiable()) {
            return;
        }
        this.endpoints_ = v27.m23698P(interfaceC14504k);
    }

    private void ensureEnumsIsMutable() {
        w98.InterfaceC14504k<p35> interfaceC14504k = this.enums_;
        if (interfaceC14504k.isModifiable()) {
            return;
        }
        this.enums_ = v27.m23698P(interfaceC14504k);
    }

    private void ensureLogsIsMutable() {
        w98.InterfaceC14504k<ai9> interfaceC14504k = this.logs_;
        if (interfaceC14504k.isModifiable()) {
            return;
        }
        this.logs_ = v27.m23698P(interfaceC14504k);
    }

    private void ensureMetricsIsMutable() {
        w98.InterfaceC14504k<dva> interfaceC14504k = this.metrics_;
        if (interfaceC14504k.isModifiable()) {
            return;
        }
        this.metrics_ = v27.m23698P(interfaceC14504k);
    }

    private void ensureMonitoredResourcesIsMutable() {
        w98.InterfaceC14504k<eya> interfaceC14504k = this.monitoredResources_;
        if (interfaceC14504k.isModifiable()) {
            return;
        }
        this.monitoredResources_ = v27.m23698P(interfaceC14504k);
    }

    private void ensureTypesIsMutable() {
        w98.InterfaceC14504k<hlh> interfaceC14504k = this.types_;
        if (interfaceC14504k.isModifiable()) {
            return;
        }
        this.types_ = v27.m23698P(interfaceC14504k);
    }

    public static f4f getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAuthentication(ai0 ai0Var) {
        ai0Var.getClass();
        ai0 ai0Var2 = this.authentication_;
        if (ai0Var2 == null || ai0Var2 == ai0.getDefaultInstance()) {
            this.authentication_ = ai0Var;
        } else {
            this.authentication_ = ai0.newBuilder(this.authentication_).mergeFrom(ai0Var).buildPartial();
        }
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeBackend(qn0 qn0Var) {
        qn0Var.getClass();
        qn0 qn0Var2 = this.backend_;
        if (qn0Var2 == null || qn0Var2 == qn0.getDefaultInstance()) {
            this.backend_ = qn0Var;
        } else {
            this.backend_ = qn0.newBuilder(this.backend_).mergeFrom(qn0Var).buildPartial();
        }
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeBilling(x11 x11Var) {
        x11Var.getClass();
        x11 x11Var2 = this.billing_;
        if (x11Var2 == null || x11Var2 == x11.getDefaultInstance()) {
            this.billing_ = x11Var;
        } else {
            this.billing_ = x11.newBuilder(this.billing_).mergeFrom(x11Var).buildPartial();
        }
        this.bitField0_ |= 512;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeConfigVersion(yoh yohVar) {
        yohVar.getClass();
        yoh yohVar2 = this.configVersion_;
        if (yohVar2 == null || yohVar2 == yoh.getDefaultInstance()) {
            this.configVersion_ = yohVar;
        } else {
            this.configVersion_ = yoh.newBuilder(this.configVersion_).mergeFrom(yohVar).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeContext(gx2 gx2Var) {
        gx2Var.getClass();
        gx2 gx2Var2 = this.context_;
        if (gx2Var2 == null || gx2Var2 == gx2.getDefaultInstance()) {
            this.context_ = gx2Var;
        } else {
            this.context_ = gx2.newBuilder(this.context_).mergeFrom(gx2Var).buildPartial();
        }
        this.bitField0_ |= 64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeControl(oz2 oz2Var) {
        oz2Var.getClass();
        oz2 oz2Var2 = this.control_;
        if (oz2Var2 == null || oz2Var2 == oz2.getDefaultInstance()) {
            this.control_ = oz2Var;
        } else {
            this.control_ = oz2.newBuilder(this.control_).mergeFrom(oz2Var).buildPartial();
        }
        this.bitField0_ |= 256;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDocumentation(ej4 ej4Var) {
        ej4Var.getClass();
        ej4 ej4Var2 = this.documentation_;
        if (ej4Var2 == null || ej4Var2 == ej4.getDefaultInstance()) {
            this.documentation_ = ej4Var;
        } else {
            this.documentation_ = ej4.newBuilder(this.documentation_).mergeFrom(ej4Var).buildPartial();
        }
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeHttp(tm7 tm7Var) {
        tm7Var.getClass();
        tm7 tm7Var2 = this.http_;
        if (tm7Var2 == null || tm7Var2 == tm7.getDefaultInstance()) {
            this.http_ = tm7Var;
        } else {
            this.http_ = tm7.newBuilder(this.http_).mergeFrom(tm7Var).buildPartial();
        }
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeLogging(sj9 sj9Var) {
        sj9Var.getClass();
        sj9 sj9Var2 = this.logging_;
        if (sj9Var2 == null || sj9Var2 == sj9.getDefaultInstance()) {
            this.logging_ = sj9Var;
        } else {
            this.logging_ = sj9.newBuilder(this.logging_).mergeFrom(sj9Var).buildPartial();
        }
        this.bitField0_ |= 1024;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeMonitoring(kya kyaVar) {
        kyaVar.getClass();
        kya kyaVar2 = this.monitoring_;
        if (kyaVar2 == null || kyaVar2 == kya.getDefaultInstance()) {
            this.monitoring_ = kyaVar;
        } else {
            this.monitoring_ = kya.newBuilder(this.monitoring_).mergeFrom(kyaVar).buildPartial();
        }
        this.bitField0_ |= 2048;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeQuota(hod hodVar) {
        hodVar.getClass();
        hod hodVar2 = this.quota_;
        if (hodVar2 == null || hodVar2 == hod.getDefaultInstance()) {
            this.quota_ = hodVar;
        } else {
            this.quota_ = hod.newBuilder(this.quota_).mergeFrom(hodVar).buildPartial();
        }
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSourceInfo(fwf fwfVar) {
        fwfVar.getClass();
        fwf fwfVar2 = this.sourceInfo_;
        if (fwfVar2 == null || fwfVar2 == fwf.getDefaultInstance()) {
            this.sourceInfo_ = fwfVar;
        } else {
            this.sourceInfo_ = fwf.newBuilder(this.sourceInfo_).mergeFrom(fwfVar).buildPartial();
        }
        this.bitField0_ |= 8192;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSystemParameters(wjg wjgVar) {
        wjgVar.getClass();
        wjg wjgVar2 = this.systemParameters_;
        if (wjgVar2 == null || wjgVar2 == wjg.getDefaultInstance()) {
            this.systemParameters_ = wjgVar;
        } else {
            this.systemParameters_ = wjg.newBuilder(this.systemParameters_).mergeFrom(wjgVar).buildPartial();
        }
        this.bitField0_ |= 4096;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeUsage(kyh kyhVar) {
        kyhVar.getClass();
        kyh kyhVar2 = this.usage_;
        if (kyhVar2 == null || kyhVar2 == kyh.getDefaultInstance()) {
            this.usage_ = kyhVar;
        } else {
            this.usage_ = kyh.newBuilder(this.usage_).mergeFrom(kyhVar).buildPartial();
        }
        this.bitField0_ |= 128;
    }

    public static C5595b newBuilder() {
        return DEFAULT_INSTANCE.m23738n();
    }

    public static f4f parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (f4f) v27.m23700S(DEFAULT_INSTANCE, inputStream);
    }

    public static f4f parseFrom(ByteBuffer byteBuffer) throws ce8 {
        return (f4f) v27.m23708a0(DEFAULT_INSTANCE, byteBuffer);
    }

    public static uhc<f4f> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeApis(int i) {
        ensureApisIsMutable();
        this.apis_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeEndpoints(int i) {
        ensureEndpointsIsMutable();
        this.endpoints_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeEnums(int i) {
        ensureEnumsIsMutable();
        this.enums_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeLogs(int i) {
        ensureLogsIsMutable();
        this.logs_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeMetrics(int i) {
        ensureMetricsIsMutable();
        this.metrics_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeMonitoredResources(int i) {
        ensureMonitoredResourcesIsMutable();
        this.monitoredResources_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeTypes(int i) {
        ensureTypesIsMutable();
        this.types_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setApis(int i, j00 j00Var) {
        j00Var.getClass();
        ensureApisIsMutable();
        this.apis_.set(i, j00Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAuthentication(ai0 ai0Var) {
        ai0Var.getClass();
        this.authentication_ = ai0Var;
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBackend(qn0 qn0Var) {
        qn0Var.getClass();
        this.backend_ = qn0Var;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBilling(x11 x11Var) {
        x11Var.getClass();
        this.billing_ = x11Var;
        this.bitField0_ |= 512;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConfigVersion(yoh yohVar) {
        yohVar.getClass();
        this.configVersion_ = yohVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setContext(gx2 gx2Var) {
        gx2Var.getClass();
        this.context_ = gx2Var;
        this.bitField0_ |= 64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setControl(oz2 oz2Var) {
        oz2Var.getClass();
        this.control_ = oz2Var;
        this.bitField0_ |= 256;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDocumentation(ej4 ej4Var) {
        ej4Var.getClass();
        this.documentation_ = ej4Var;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEndpoints(int i, c25 c25Var) {
        c25Var.getClass();
        ensureEndpointsIsMutable();
        this.endpoints_.set(i, c25Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEnums(int i, p35 p35Var) {
        p35Var.getClass();
        ensureEnumsIsMutable();
        this.enums_.set(i, p35Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHttp(tm7 tm7Var) {
        tm7Var.getClass();
        this.http_ = tm7Var;
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setId(String str) {
        str.getClass();
        this.id_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIdBytes(vj1 vj1Var) {
        AbstractC1714b3.m2857c(vj1Var);
        this.id_ = vj1Var.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLogging(sj9 sj9Var) {
        sj9Var.getClass();
        this.logging_ = sj9Var;
        this.bitField0_ |= 1024;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLogs(int i, ai9 ai9Var) {
        ai9Var.getClass();
        ensureLogsIsMutable();
        this.logs_.set(i, ai9Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMetrics(int i, dva dvaVar) {
        dvaVar.getClass();
        ensureMetricsIsMutable();
        this.metrics_.set(i, dvaVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMonitoredResources(int i, eya eyaVar) {
        eyaVar.getClass();
        ensureMonitoredResourcesIsMutable();
        this.monitoredResources_.set(i, eyaVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMonitoring(kya kyaVar) {
        kyaVar.getClass();
        this.monitoring_ = kyaVar;
        this.bitField0_ |= 2048;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setName(String str) {
        str.getClass();
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNameBytes(vj1 vj1Var) {
        AbstractC1714b3.m2857c(vj1Var);
        this.name_ = vj1Var.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProducerProjectId(String str) {
        str.getClass();
        this.producerProjectId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProducerProjectIdBytes(vj1 vj1Var) {
        AbstractC1714b3.m2857c(vj1Var);
        this.producerProjectId_ = vj1Var.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setQuota(hod hodVar) {
        hodVar.getClass();
        this.quota_ = hodVar;
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSourceInfo(fwf fwfVar) {
        fwfVar.getClass();
        this.sourceInfo_ = fwfVar;
        this.bitField0_ |= 8192;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSystemParameters(wjg wjgVar) {
        wjgVar.getClass();
        this.systemParameters_ = wjgVar;
        this.bitField0_ |= 4096;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTitle(String str) {
        str.getClass();
        this.title_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTitleBytes(vj1 vj1Var) {
        AbstractC1714b3.m2857c(vj1Var);
        this.title_ = vj1Var.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypes(int i, hlh hlhVar) {
        hlhVar.getClass();
        ensureTypesIsMutable();
        this.types_.set(i, hlhVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUsage(kyh kyhVar) {
        kyhVar.getClass();
        this.usage_ = kyhVar;
        this.bitField0_ |= 128;
    }

    @Override // p000.u4f
    public j00 getApis(int i) {
        return this.apis_.get(i);
    }

    @Override // p000.u4f
    public int getApisCount() {
        return this.apis_.size();
    }

    @Override // p000.u4f
    public List<j00> getApisList() {
        return this.apis_;
    }

    public f10 getApisOrBuilder(int i) {
        return this.apis_.get(i);
    }

    public List<? extends f10> getApisOrBuilderList() {
        return this.apis_;
    }

    @Override // p000.u4f
    public ai0 getAuthentication() {
        ai0 ai0Var = this.authentication_;
        return ai0Var == null ? ai0.getDefaultInstance() : ai0Var;
    }

    @Override // p000.u4f
    public qn0 getBackend() {
        qn0 qn0Var = this.backend_;
        return qn0Var == null ? qn0.getDefaultInstance() : qn0Var;
    }

    @Override // p000.u4f
    public x11 getBilling() {
        x11 x11Var = this.billing_;
        return x11Var == null ? x11.getDefaultInstance() : x11Var;
    }

    @Override // p000.u4f
    public yoh getConfigVersion() {
        yoh yohVar = this.configVersion_;
        return yohVar == null ? yoh.getDefaultInstance() : yohVar;
    }

    @Override // p000.u4f
    public gx2 getContext() {
        gx2 gx2Var = this.context_;
        return gx2Var == null ? gx2.getDefaultInstance() : gx2Var;
    }

    @Override // p000.u4f
    public oz2 getControl() {
        oz2 oz2Var = this.control_;
        return oz2Var == null ? oz2.getDefaultInstance() : oz2Var;
    }

    @Override // p000.u4f
    public ej4 getDocumentation() {
        ej4 ej4Var = this.documentation_;
        return ej4Var == null ? ej4.getDefaultInstance() : ej4Var;
    }

    @Override // p000.u4f
    public c25 getEndpoints(int i) {
        return this.endpoints_.get(i);
    }

    @Override // p000.u4f
    public int getEndpointsCount() {
        return this.endpoints_.size();
    }

    @Override // p000.u4f
    public List<c25> getEndpointsList() {
        return this.endpoints_;
    }

    public d25 getEndpointsOrBuilder(int i) {
        return this.endpoints_.get(i);
    }

    public List<? extends d25> getEndpointsOrBuilderList() {
        return this.endpoints_;
    }

    @Override // p000.u4f
    public p35 getEnums(int i) {
        return this.enums_.get(i);
    }

    @Override // p000.u4f
    public int getEnumsCount() {
        return this.enums_.size();
    }

    @Override // p000.u4f
    public List<p35> getEnumsList() {
        return this.enums_;
    }

    public c45 getEnumsOrBuilder(int i) {
        return this.enums_.get(i);
    }

    public List<? extends c45> getEnumsOrBuilderList() {
        return this.enums_;
    }

    @Override // p000.u4f
    public tm7 getHttp() {
        tm7 tm7Var = this.http_;
        return tm7Var == null ? tm7.getDefaultInstance() : tm7Var;
    }

    @Override // p000.u4f
    public String getId() {
        return this.id_;
    }

    @Override // p000.u4f
    public vj1 getIdBytes() {
        return vj1.copyFromUtf8(this.id_);
    }

    @Override // p000.u4f
    public sj9 getLogging() {
        sj9 sj9Var = this.logging_;
        return sj9Var == null ? sj9.getDefaultInstance() : sj9Var;
    }

    @Override // p000.u4f
    public ai9 getLogs(int i) {
        return this.logs_.get(i);
    }

    @Override // p000.u4f
    public int getLogsCount() {
        return this.logs_.size();
    }

    @Override // p000.u4f
    public List<ai9> getLogsList() {
        return this.logs_;
    }

    public bi9 getLogsOrBuilder(int i) {
        return this.logs_.get(i);
    }

    public List<? extends bi9> getLogsOrBuilderList() {
        return this.logs_;
    }

    @Override // p000.u4f
    public dva getMetrics(int i) {
        return this.metrics_.get(i);
    }

    @Override // p000.u4f
    public int getMetricsCount() {
        return this.metrics_.size();
    }

    @Override // p000.u4f
    public List<dva> getMetricsList() {
        return this.metrics_;
    }

    public eva getMetricsOrBuilder(int i) {
        return this.metrics_.get(i);
    }

    public List<? extends eva> getMetricsOrBuilderList() {
        return this.metrics_;
    }

    @Override // p000.u4f
    public eya getMonitoredResources(int i) {
        return this.monitoredResources_.get(i);
    }

    @Override // p000.u4f
    public int getMonitoredResourcesCount() {
        return this.monitoredResources_.size();
    }

    @Override // p000.u4f
    public List<eya> getMonitoredResourcesList() {
        return this.monitoredResources_;
    }

    public fya getMonitoredResourcesOrBuilder(int i) {
        return this.monitoredResources_.get(i);
    }

    public List<? extends fya> getMonitoredResourcesOrBuilderList() {
        return this.monitoredResources_;
    }

    @Override // p000.u4f
    public kya getMonitoring() {
        kya kyaVar = this.monitoring_;
        return kyaVar == null ? kya.getDefaultInstance() : kyaVar;
    }

    @Override // p000.u4f
    public String getName() {
        return this.name_;
    }

    @Override // p000.u4f
    public vj1 getNameBytes() {
        return vj1.copyFromUtf8(this.name_);
    }

    @Override // p000.u4f
    public String getProducerProjectId() {
        return this.producerProjectId_;
    }

    @Override // p000.u4f
    public vj1 getProducerProjectIdBytes() {
        return vj1.copyFromUtf8(this.producerProjectId_);
    }

    @Override // p000.u4f
    public hod getQuota() {
        hod hodVar = this.quota_;
        return hodVar == null ? hod.getDefaultInstance() : hodVar;
    }

    @Override // p000.u4f
    public fwf getSourceInfo() {
        fwf fwfVar = this.sourceInfo_;
        return fwfVar == null ? fwf.getDefaultInstance() : fwfVar;
    }

    @Override // p000.u4f
    public wjg getSystemParameters() {
        wjg wjgVar = this.systemParameters_;
        return wjgVar == null ? wjg.getDefaultInstance() : wjgVar;
    }

    @Override // p000.u4f
    public String getTitle() {
        return this.title_;
    }

    @Override // p000.u4f
    public vj1 getTitleBytes() {
        return vj1.copyFromUtf8(this.title_);
    }

    @Override // p000.u4f
    public hlh getTypes(int i) {
        return this.types_.get(i);
    }

    @Override // p000.u4f
    public int getTypesCount() {
        return this.types_.size();
    }

    @Override // p000.u4f
    public List<hlh> getTypesList() {
        return this.types_;
    }

    public tlh getTypesOrBuilder(int i) {
        return this.types_.get(i);
    }

    public List<? extends tlh> getTypesOrBuilderList() {
        return this.types_;
    }

    @Override // p000.u4f
    public kyh getUsage() {
        kyh kyhVar = this.usage_;
        return kyhVar == null ? kyh.getDefaultInstance() : kyhVar;
    }

    @Override // p000.u4f
    public boolean hasAuthentication() {
        return (this.bitField0_ & 32) != 0;
    }

    @Override // p000.u4f
    public boolean hasBackend() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // p000.u4f
    public boolean hasBilling() {
        return (this.bitField0_ & 512) != 0;
    }

    @Override // p000.u4f
    public boolean hasConfigVersion() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // p000.u4f
    public boolean hasContext() {
        return (this.bitField0_ & 64) != 0;
    }

    @Override // p000.u4f
    public boolean hasControl() {
        return (this.bitField0_ & 256) != 0;
    }

    @Override // p000.u4f
    public boolean hasDocumentation() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // p000.u4f
    public boolean hasHttp() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // p000.u4f
    public boolean hasLogging() {
        return (this.bitField0_ & 1024) != 0;
    }

    @Override // p000.u4f
    public boolean hasMonitoring() {
        return (this.bitField0_ & 2048) != 0;
    }

    @Override // p000.u4f
    public boolean hasQuota() {
        return (this.bitField0_ & 16) != 0;
    }

    @Override // p000.u4f
    public boolean hasSourceInfo() {
        return (this.bitField0_ & 8192) != 0;
    }

    @Override // p000.u4f
    public boolean hasSystemParameters() {
        return (this.bitField0_ & 4096) != 0;
    }

    @Override // p000.u4f
    public boolean hasUsage() {
        return (this.bitField0_ & 128) != 0;
    }

    @Override // p000.v27
    /* JADX INFO: renamed from: r */
    public final Object mo149r(v27.EnumC13830i enumC13830i, Object obj, Object obj2) {
        C5594a c5594a = null;
        switch (C5594a.f35330a[enumC13830i.ordinal()]) {
            case 1:
                return new f4f();
            case 2:
                return new C5595b(c5594a);
            case 3:
                return v27.m23699Q(DEFAULT_INSTANCE, "\u0000\u0019\u0000\u0001\u0001%\u0019\u0000\u0007\u0000\u0001Ȉ\u0002Ȉ\u0003\u001b\u0004\u001b\u0005\u001b\u0006ဉ\u0001\bဉ\u0002\tဉ\u0003\nဉ\u0004\u000bဉ\u0005\fဉ\u0006\u000fဉ\u0007\u0012\u001b\u0014ဉ\u0000\u0015ဉ\b\u0016Ȉ\u0017\u001b\u0018\u001b\u0019\u001b\u001aဉ\t\u001bဉ\n\u001cဉ\u000b\u001dဉ\f!Ȉ%ဉ\r", new Object[]{"bitField0_", "name_", "title_", "apis_", j00.class, "types_", hlh.class, "enums_", p35.class, "documentation_", "backend_", "http_", "quota_", "authentication_", "context_", "usage_", "endpoints_", c25.class, "configVersion_", "control_", "producerProjectId_", "logs_", ai9.class, "metrics_", dva.class, "monitoredResources_", eya.class, "billing_", "logging_", "monitoring_", "systemParameters_", "id_", "sourceInfo_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                uhc<f4f> c13824c = PARSER;
                if (c13824c == null) {
                    synchronized (f4f.class) {
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

    public static C5595b newBuilder(f4f f4fVar) {
        return DEFAULT_INSTANCE.m23739o(f4fVar);
    }

    public static f4f parseDelimitedFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (f4f) v27.m23701T(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static f4f parseFrom(ByteBuffer byteBuffer, zi5 zi5Var) throws ce8 {
        return (f4f) v27.m23709b0(DEFAULT_INSTANCE, byteBuffer, zi5Var);
    }

    public static f4f parseFrom(vj1 vj1Var) throws ce8 {
        return (f4f) v27.m23702U(DEFAULT_INSTANCE, vj1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addApis(int i, j00 j00Var) {
        j00Var.getClass();
        ensureApisIsMutable();
        this.apis_.add(i, j00Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addEndpoints(int i, c25 c25Var) {
        c25Var.getClass();
        ensureEndpointsIsMutable();
        this.endpoints_.add(i, c25Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addEnums(int i, p35 p35Var) {
        p35Var.getClass();
        ensureEnumsIsMutable();
        this.enums_.add(i, p35Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addLogs(int i, ai9 ai9Var) {
        ai9Var.getClass();
        ensureLogsIsMutable();
        this.logs_.add(i, ai9Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addMetrics(int i, dva dvaVar) {
        dvaVar.getClass();
        ensureMetricsIsMutable();
        this.metrics_.add(i, dvaVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addMonitoredResources(int i, eya eyaVar) {
        eyaVar.getClass();
        ensureMonitoredResourcesIsMutable();
        this.monitoredResources_.add(i, eyaVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addTypes(int i, hlh hlhVar) {
        hlhVar.getClass();
        ensureTypesIsMutable();
        this.types_.add(i, hlhVar);
    }

    public static f4f parseFrom(vj1 vj1Var, zi5 zi5Var) throws ce8 {
        return (f4f) v27.m23703V(DEFAULT_INSTANCE, vj1Var, zi5Var);
    }

    public static f4f parseFrom(byte[] bArr) throws ce8 {
        return (f4f) v27.m23710c0(DEFAULT_INSTANCE, bArr);
    }

    public static f4f parseFrom(byte[] bArr, zi5 zi5Var) throws ce8 {
        return (f4f) v27.m23711d0(DEFAULT_INSTANCE, bArr, zi5Var);
    }

    public static f4f parseFrom(InputStream inputStream) throws IOException {
        return (f4f) v27.m23706Y(DEFAULT_INSTANCE, inputStream);
    }

    public static f4f parseFrom(InputStream inputStream, zi5 zi5Var) throws IOException {
        return (f4f) v27.m23707Z(DEFAULT_INSTANCE, inputStream, zi5Var);
    }

    public static f4f parseFrom(f72 f72Var) throws IOException {
        return (f4f) v27.m23704W(DEFAULT_INSTANCE, f72Var);
    }

    public static f4f parseFrom(f72 f72Var, zi5 zi5Var) throws IOException {
        return (f4f) v27.m23705X(DEFAULT_INSTANCE, f72Var, zi5Var);
    }
}
