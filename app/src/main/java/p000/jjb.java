package p000;

import com.google.firebase.Timestamp;

/* JADX INFO: loaded from: classes5.dex */
public class jjb implements xdh {

    /* JADX INFO: renamed from: a */
    public b2i f50718a;

    public jjb(b2i b2iVar) {
        r80.hardAssert(s2i.isNumber(b2iVar), "NumericIncrementTransformOperation expects a NumberValue operand", new Object[0]);
        this.f50718a = b2iVar;
    }

    private double operandAsDouble() {
        if (s2i.isDouble(this.f50718a)) {
            return this.f50718a.getDoubleValue();
        }
        if (s2i.isInteger(this.f50718a)) {
            return this.f50718a.getIntegerValue();
        }
        throw r80.fail("Expected 'operand' to be of Number type, but was " + this.f50718a.getClass().getCanonicalName(), new Object[0]);
    }

    private long operandAsLong() {
        if (s2i.isDouble(this.f50718a)) {
            return (long) this.f50718a.getDoubleValue();
        }
        if (s2i.isInteger(this.f50718a)) {
            return this.f50718a.getIntegerValue();
        }
        throw r80.fail("Expected 'operand' to be of Number type, but was " + this.f50718a.getClass().getCanonicalName(), new Object[0]);
    }

    private long safeIncrement(long j, long j2) {
        long j3 = j + j2;
        return ((j ^ j3) & (j2 ^ j3)) >= 0 ? j3 : j3 >= 0 ? Long.MIN_VALUE : Long.MAX_VALUE;
    }

    @Override // p000.xdh
    public b2i applyToLocalView(@hib b2i b2iVar, Timestamp timestamp) {
        b2i b2iVarComputeBaseValue = computeBaseValue(b2iVar);
        if (s2i.isInteger(b2iVarComputeBaseValue) && s2i.isInteger(this.f50718a)) {
            return b2i.newBuilder().setIntegerValue(safeIncrement(b2iVarComputeBaseValue.getIntegerValue(), operandAsLong())).build();
        }
        if (s2i.isInteger(b2iVarComputeBaseValue)) {
            return b2i.newBuilder().setDoubleValue(b2iVarComputeBaseValue.getIntegerValue() + operandAsDouble()).build();
        }
        r80.hardAssert(s2i.isDouble(b2iVarComputeBaseValue), "Expected NumberValue to be of type DoubleValue, but was ", b2iVar.getClass().getCanonicalName());
        return b2i.newBuilder().setDoubleValue(b2iVarComputeBaseValue.getDoubleValue() + operandAsDouble()).build();
    }

    @Override // p000.xdh
    public b2i applyToRemoteDocument(@hib b2i b2iVar, b2i b2iVar2) {
        return b2iVar2;
    }

    @Override // p000.xdh
    public b2i computeBaseValue(@hib b2i b2iVar) {
        return s2i.isNumber(b2iVar) ? b2iVar : b2i.newBuilder().setIntegerValue(0L).build();
    }

    public b2i getOperand() {
        return this.f50718a;
    }
}
