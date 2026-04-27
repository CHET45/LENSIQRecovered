package p000;

/* JADX INFO: loaded from: classes7.dex */
public abstract class rgd extends xn1 implements hp8 {

    /* JADX INFO: renamed from: a */
    public final boolean f78244a;

    public rgd() {
        this.f78244a = false;
    }

    @Override // p000.xn1
    @jjf(version = "1.1")
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public hp8 getReflected() {
        if (this.f78244a) {
            throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
        }
        return (hp8) super.getReflected();
    }

    @Override // p000.xn1
    public no8 compute() {
        return this.f78244a ? this : super.compute();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof rgd) {
            rgd rgdVar = (rgd) obj;
            return getOwner().equals(rgdVar.getOwner()) && getName().equals(rgdVar.getName()) && getSignature().equals(rgdVar.getSignature()) && md8.areEqual(getBoundReceiver(), rgdVar.getBoundReceiver());
        }
        if (obj instanceof hp8) {
            return obj.equals(compute());
        }
        return false;
    }

    public int hashCode() {
        return (((getOwner().hashCode() * 31) + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    @Override // p000.hp8
    @jjf(version = "1.1")
    public boolean isConst() {
        return getReflected().isConst();
    }

    @Override // p000.hp8
    @jjf(version = "1.1")
    public boolean isLateinit() {
        return getReflected().isLateinit();
    }

    public String toString() {
        no8 no8VarCompute = compute();
        if (no8VarCompute != this) {
            return no8VarCompute.toString();
        }
        return "property " + getName() + vvd.f92391b;
    }

    @jjf(version = "1.1")
    public rgd(Object obj) {
        super(obj);
        this.f78244a = false;
    }

    @jjf(version = "1.4")
    public rgd(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, (i & 1) == 1);
        this.f78244a = (i & 2) == 2;
    }
}
