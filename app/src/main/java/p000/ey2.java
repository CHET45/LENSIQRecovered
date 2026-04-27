package p000;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public interface ey2 extends rsa {
    String getAllowedRequestExtensions(int i);

    vj1 getAllowedRequestExtensionsBytes(int i);

    int getAllowedRequestExtensionsCount();

    List<String> getAllowedRequestExtensionsList();

    String getAllowedResponseExtensions(int i);

    vj1 getAllowedResponseExtensionsBytes(int i);

    int getAllowedResponseExtensionsCount();

    List<String> getAllowedResponseExtensionsList();

    String getProvided(int i);

    vj1 getProvidedBytes(int i);

    int getProvidedCount();

    List<String> getProvidedList();

    String getRequested(int i);

    vj1 getRequestedBytes(int i);

    int getRequestedCount();

    List<String> getRequestedList();

    String getSelector();

    vj1 getSelectorBytes();
}
