package p000;

import im.zego.zegoexpress.ZegoExpressErrorCode;

/* JADX INFO: loaded from: classes4.dex */
public final class q15 {

    /* JADX INFO: renamed from: a */
    public final String f72885a;

    private q15(@efb String str) {
        if (str == null) {
            throw new NullPointerException("name is null");
        }
        this.f72885a = str;
    }

    /* JADX INFO: renamed from: of */
    public static q15 m19986of(@efb String str) {
        return new q15(str);
    }

    public boolean equals(@hib Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof q15) {
            return this.f72885a.equals(((q15) obj).f72885a);
        }
        return false;
    }

    public String getName() {
        return this.f72885a;
    }

    public int hashCode() {
        return this.f72885a.hashCode() ^ ZegoExpressErrorCode.CommonEngineNotStarted;
    }

    @efb
    public String toString() {
        return "Encoding{name=\"" + this.f72885a + "\"}";
    }
}
