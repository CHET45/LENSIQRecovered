package p000;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public interface sh0 extends rsa {
    ci0 getAuthenticationInfo();

    li0 getAuthorizationInfo(int i);

    int getAuthorizationInfoCount();

    List<li0> getAuthorizationInfoList();

    String getMethodName();

    vj1 getMethodNameBytes();

    long getNumResponseItems();

    pag getRequest();

    k4e getRequestMetadata();

    String getResourceName();

    vj1 getResourceNameBytes();

    pag getResponse();

    C15896yz getServiceData();

    String getServiceName();

    vj1 getServiceNameBytes();

    m4g getStatus();

    boolean hasAuthenticationInfo();

    boolean hasRequest();

    boolean hasRequestMetadata();

    boolean hasResponse();

    boolean hasServiceData();

    boolean hasStatus();
}
