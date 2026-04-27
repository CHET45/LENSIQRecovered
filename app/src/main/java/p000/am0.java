package p000;

import im.zego.zegoexpress.ZegoExpressErrorCode;
import p000.xpg;

/* JADX INFO: loaded from: classes5.dex */
public final class am0 extends xpg.AbstractC15245a {

    /* JADX INFO: renamed from: a */
    public final q81 f2015a;

    /* JADX INFO: renamed from: b */
    public final boolean f2016b;

    /* JADX INFO: renamed from: c */
    public final int f2017c;

    /* JADX INFO: renamed from: d */
    public final int f2018d;

    /* JADX INFO: renamed from: e */
    public final int f2019e;

    public am0(@hib q81 q81Var, boolean z, int i, int i2, int i3) {
        this.f2015a = q81Var;
        this.f2016b = z;
        this.f2017c = i;
        this.f2018d = i2;
        this.f2019e = i3;
    }

    @Override // p000.xpg.AbstractC15245a
    /* JADX INFO: renamed from: a */
    public boolean mo887a() {
        return this.f2016b;
    }

    @Override // p000.xpg.AbstractC15245a
    /* JADX INFO: renamed from: b */
    public int mo888b() {
        return this.f2018d;
    }

    @Override // p000.xpg.AbstractC15245a
    @hib
    /* JADX INFO: renamed from: c */
    public q81 mo889c() {
        return this.f2015a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof xpg.AbstractC15245a)) {
            return false;
        }
        xpg.AbstractC15245a abstractC15245a = (xpg.AbstractC15245a) obj;
        q81 q81Var = this.f2015a;
        if (q81Var != null ? q81Var.equals(abstractC15245a.mo889c()) : abstractC15245a.mo889c() == null) {
            if (this.f2016b == abstractC15245a.mo887a() && this.f2017c == abstractC15245a.mo890f() && this.f2018d == abstractC15245a.mo888b() && this.f2019e == abstractC15245a.mo891g()) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.xpg.AbstractC15245a
    /* JADX INFO: renamed from: f */
    public int mo890f() {
        return this.f2017c;
    }

    @Override // p000.xpg.AbstractC15245a
    /* JADX INFO: renamed from: g */
    public int mo891g() {
        return this.f2019e;
    }

    public int hashCode() {
        q81 q81Var = this.f2015a;
        return (((((((((q81Var == null ? 0 : q81Var.hashCode()) ^ ZegoExpressErrorCode.CommonEngineNotStarted) * ZegoExpressErrorCode.CommonEngineNotStarted) ^ (this.f2016b ? 1231 : 1237)) * ZegoExpressErrorCode.CommonEngineNotStarted) ^ this.f2017c) * ZegoExpressErrorCode.CommonEngineNotStarted) ^ this.f2018d) * ZegoExpressErrorCode.CommonEngineNotStarted) ^ this.f2019e;
    }

    public String toString() {
        return "ExistenceFilterBloomFilterInfo{bloomFilter=" + this.f2015a + ", applied=" + this.f2016b + ", hashCount=" + this.f2017c + ", bitmapLength=" + this.f2018d + ", padding=" + this.f2019e + "}";
    }
}
