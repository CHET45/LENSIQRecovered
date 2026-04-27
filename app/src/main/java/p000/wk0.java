package p000;

import im.zego.zegoexpress.ZegoExpressErrorCode;
import java.util.List;
import p000.ir5;

/* JADX INFO: loaded from: classes5.dex */
public final class wk0 extends ir5 {

    /* JADX INFO: renamed from: f */
    public final int f94458f;

    /* JADX INFO: renamed from: g */
    public final String f94459g;

    /* JADX INFO: renamed from: h */
    public final List<ir5.AbstractC7573c> f94460h;

    /* JADX INFO: renamed from: i */
    public final ir5.AbstractC7572b f94461i;

    public wk0(int i, String str, List<ir5.AbstractC7573c> list, ir5.AbstractC7572b abstractC7572b) {
        this.f94458f = i;
        if (str == null) {
            throw new NullPointerException("Null collectionGroup");
        }
        this.f94459g = str;
        if (list == null) {
            throw new NullPointerException("Null segments");
        }
        this.f94460h = list;
        if (abstractC7572b == null) {
            throw new NullPointerException("Null indexState");
        }
        this.f94461i = abstractC7572b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ir5)) {
            return false;
        }
        ir5 ir5Var = (ir5) obj;
        return this.f94458f == ir5Var.getIndexId() && this.f94459g.equals(ir5Var.getCollectionGroup()) && this.f94460h.equals(ir5Var.getSegments()) && this.f94461i.equals(ir5Var.getIndexState());
    }

    @Override // p000.ir5
    public String getCollectionGroup() {
        return this.f94459g;
    }

    @Override // p000.ir5
    public int getIndexId() {
        return this.f94458f;
    }

    @Override // p000.ir5
    public ir5.AbstractC7572b getIndexState() {
        return this.f94461i;
    }

    @Override // p000.ir5
    public List<ir5.AbstractC7573c> getSegments() {
        return this.f94460h;
    }

    public int hashCode() {
        return ((((((this.f94458f ^ ZegoExpressErrorCode.CommonEngineNotStarted) * ZegoExpressErrorCode.CommonEngineNotStarted) ^ this.f94459g.hashCode()) * ZegoExpressErrorCode.CommonEngineNotStarted) ^ this.f94460h.hashCode()) * ZegoExpressErrorCode.CommonEngineNotStarted) ^ this.f94461i.hashCode();
    }

    public String toString() {
        return "FieldIndex{indexId=" + this.f94458f + ", collectionGroup=" + this.f94459g + ", segments=" + this.f94460h + ", indexState=" + this.f94461i + "}";
    }
}
