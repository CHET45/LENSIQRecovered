package p000;

/* JADX INFO: loaded from: classes5.dex */
public interface mo7 extends rsa {
    long getCacheFillBytes();

    boolean getCacheHit();

    boolean getCacheLookup();

    boolean getCacheValidatedWithOriginServer();

    at4 getLatency();

    String getProtocol();

    vj1 getProtocolBytes();

    String getReferer();

    vj1 getRefererBytes();

    String getRemoteIp();

    vj1 getRemoteIpBytes();

    String getRequestMethod();

    vj1 getRequestMethodBytes();

    long getRequestSize();

    String getRequestUrl();

    vj1 getRequestUrlBytes();

    long getResponseSize();

    String getServerIp();

    vj1 getServerIpBytes();

    int getStatus();

    String getUserAgent();

    vj1 getUserAgentBytes();

    boolean hasLatency();
}
