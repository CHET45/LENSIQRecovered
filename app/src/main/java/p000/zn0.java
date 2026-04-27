package p000;

import p000.yn0;

/* JADX INFO: loaded from: classes5.dex */
public interface zn0 extends rsa {
    String getAddress();

    vj1 getAddressBytes();

    yn0.EnumC15733b getAuthenticationCase();

    double getDeadline();

    boolean getDisableAuth();

    String getJwtAudience();

    vj1 getJwtAudienceBytes();

    double getMinDeadline();

    double getOperationDeadline();

    yn0.EnumC15735d getPathTranslation();

    int getPathTranslationValue();

    String getProtocol();

    vj1 getProtocolBytes();

    String getSelector();

    vj1 getSelectorBytes();

    boolean hasDisableAuth();

    boolean hasJwtAudience();
}
