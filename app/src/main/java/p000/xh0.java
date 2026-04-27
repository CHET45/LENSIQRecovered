package p000;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public interface xh0 extends rsa {
    String getAudiences();

    vj1 getAudiencesBytes();

    String getAuthorizationUrl();

    vj1 getAuthorizationUrlBytes();

    String getId();

    vj1 getIdBytes();

    String getIssuer();

    vj1 getIssuerBytes();

    String getJwksUri();

    vj1 getJwksUriBytes();

    jo8 getJwtLocations(int i);

    int getJwtLocationsCount();

    List<jo8> getJwtLocationsList();
}
