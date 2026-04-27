package p000;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public interface u4f extends rsa {
    j00 getApis(int i);

    int getApisCount();

    List<j00> getApisList();

    ai0 getAuthentication();

    qn0 getBackend();

    x11 getBilling();

    yoh getConfigVersion();

    gx2 getContext();

    oz2 getControl();

    ej4 getDocumentation();

    c25 getEndpoints(int i);

    int getEndpointsCount();

    List<c25> getEndpointsList();

    p35 getEnums(int i);

    int getEnumsCount();

    List<p35> getEnumsList();

    tm7 getHttp();

    String getId();

    vj1 getIdBytes();

    sj9 getLogging();

    ai9 getLogs(int i);

    int getLogsCount();

    List<ai9> getLogsList();

    dva getMetrics(int i);

    int getMetricsCount();

    List<dva> getMetricsList();

    eya getMonitoredResources(int i);

    int getMonitoredResourcesCount();

    List<eya> getMonitoredResourcesList();

    kya getMonitoring();

    String getName();

    vj1 getNameBytes();

    String getProducerProjectId();

    vj1 getProducerProjectIdBytes();

    hod getQuota();

    fwf getSourceInfo();

    wjg getSystemParameters();

    String getTitle();

    vj1 getTitleBytes();

    hlh getTypes(int i);

    int getTypesCount();

    List<hlh> getTypesList();

    kyh getUsage();

    boolean hasAuthentication();

    boolean hasBackend();

    boolean hasBilling();

    boolean hasConfigVersion();

    boolean hasContext();

    boolean hasControl();

    boolean hasDocumentation();

    boolean hasHttp();

    boolean hasLogging();

    boolean hasMonitoring();

    boolean hasQuota();

    boolean hasSourceInfo();

    boolean hasSystemParameters();

    boolean hasUsage();
}
