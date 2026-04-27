package p000;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public interface gi0 extends rsa {
    boolean getAllowWithoutCredential();

    kjb getOauth();

    yh0 getRequirements(int i);

    int getRequirementsCount();

    List<yh0> getRequirementsList();

    String getSelector();

    vj1 getSelectorBytes();

    boolean hasOauth();
}
