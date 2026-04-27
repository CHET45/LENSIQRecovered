package p000;

/* JADX INFO: loaded from: classes7.dex */
public class m07 extends xn1 implements h07, to8 {
    private final int arity;

    @jjf(version = "1.4")
    private final int flags;

    public m07(int i) {
        this(i, xn1.NO_RECEIVER, null, null, null, 0);
    }

    @Override // p000.xn1
    @jjf(version = "1.1")
    public no8 computeReflected() {
        return vvd.function(this);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof m07) {
            m07 m07Var = (m07) obj;
            return getName().equals(m07Var.getName()) && getSignature().equals(m07Var.getSignature()) && this.flags == m07Var.flags && this.arity == m07Var.arity && md8.areEqual(getBoundReceiver(), m07Var.getBoundReceiver()) && md8.areEqual(getOwner(), m07Var.getOwner());
        }
        if (obj instanceof to8) {
            return obj.equals(compute());
        }
        return false;
    }

    @Override // p000.h07
    public int getArity() {
        return this.arity;
    }

    public int hashCode() {
        return (((getOwner() == null ? 0 : getOwner().hashCode() * 31) + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    @Override // p000.to8
    @jjf(version = "1.1")
    public boolean isExternal() {
        return getReflected().isExternal();
    }

    @Override // p000.to8
    @jjf(version = "1.1")
    public boolean isInfix() {
        return getReflected().isInfix();
    }

    @Override // p000.to8
    @jjf(version = "1.1")
    public boolean isInline() {
        return getReflected().isInline();
    }

    @Override // p000.to8
    @jjf(version = "1.1")
    public boolean isOperator() {
        return getReflected().isOperator();
    }

    @Override // p000.xn1, p000.no8, p000.to8
    @jjf(version = "1.1")
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public String toString() {
        no8 no8VarCompute = compute();
        if (no8VarCompute != this) {
            return no8VarCompute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + vvd.f92391b;
    }

    @jjf(version = "1.1")
    public m07(int i, Object obj) {
        this(i, obj, null, null, null, 0);
    }

    @Override // p000.xn1
    @jjf(version = "1.1")
    public to8 getReflected() {
        return (to8) super.getReflected();
    }

    @jjf(version = "1.4")
    public m07(int i, Object obj, Class cls, String str, String str2, int i2) {
        super(obj, cls, str, str2, (i2 & 1) == 1);
        this.arity = i;
        this.flags = i2 >> 1;
    }
}
