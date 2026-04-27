package p000;

import im.zego.zegoexpress.ZegoExpressErrorCode;
import p000.h58;

/* JADX INFO: loaded from: classes5.dex */
public final class cl0 extends h58.AbstractC6712a {

    /* JADX INFO: renamed from: a */
    public final String f16861a;

    /* JADX INFO: renamed from: b */
    public final String f16862b;

    /* JADX INFO: renamed from: c */
    public final String f16863c;

    public cl0(String str, @hib String str2, @hib String str3) {
        if (str == null) {
            throw new NullPointerException("Null crashlyticsInstallId");
        }
        this.f16861a = str;
        this.f16862b = str2;
        this.f16863c = str3;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h58.AbstractC6712a)) {
            return false;
        }
        h58.AbstractC6712a abstractC6712a = (h58.AbstractC6712a) obj;
        if (this.f16861a.equals(abstractC6712a.getCrashlyticsInstallId()) && ((str = this.f16862b) != null ? str.equals(abstractC6712a.getFirebaseInstallationId()) : abstractC6712a.getFirebaseInstallationId() == null)) {
            String str2 = this.f16863c;
            if (str2 == null) {
                if (abstractC6712a.getFirebaseAuthenticationToken() == null) {
                    return true;
                }
            } else if (str2.equals(abstractC6712a.getFirebaseAuthenticationToken())) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.h58.AbstractC6712a
    @efb
    public String getCrashlyticsInstallId() {
        return this.f16861a;
    }

    @Override // p000.h58.AbstractC6712a
    @hib
    public String getFirebaseAuthenticationToken() {
        return this.f16863c;
    }

    @Override // p000.h58.AbstractC6712a
    @hib
    public String getFirebaseInstallationId() {
        return this.f16862b;
    }

    public int hashCode() {
        int iHashCode = (this.f16861a.hashCode() ^ ZegoExpressErrorCode.CommonEngineNotStarted) * ZegoExpressErrorCode.CommonEngineNotStarted;
        String str = this.f16862b;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * ZegoExpressErrorCode.CommonEngineNotStarted;
        String str2 = this.f16863c;
        return iHashCode2 ^ (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "InstallIds{crashlyticsInstallId=" + this.f16861a + ", firebaseInstallationId=" + this.f16862b + ", firebaseAuthenticationToken=" + this.f16863c + "}";
    }
}
