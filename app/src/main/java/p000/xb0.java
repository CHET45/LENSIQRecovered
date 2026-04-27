package p000;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 1)
public final class xb0 extends AtomicInteger {

    /* JADX INFO: renamed from: a */
    public static final int f97407a = 0;

    public xb0(int i) {
        super(i);
    }

    public final int add(int i) {
        return addAndGet(i);
    }

    @Override // java.lang.Number
    public final /* bridge */ byte byteValue() {
        return toByte();
    }

    @Override // java.util.concurrent.atomic.AtomicInteger, java.lang.Number
    public final /* bridge */ double doubleValue() {
        return toDouble();
    }

    @Override // java.util.concurrent.atomic.AtomicInteger, java.lang.Number
    public final /* bridge */ float floatValue() {
        return toFloat();
    }

    @Override // java.util.concurrent.atomic.AtomicInteger, java.lang.Number
    public final /* bridge */ int intValue() {
        return toInt();
    }

    @Override // java.util.concurrent.atomic.AtomicInteger, java.lang.Number
    public final /* bridge */ long longValue() {
        return toLong();
    }

    @Override // java.lang.Number
    public final /* bridge */ short shortValue() {
        return toShort();
    }

    public byte toByte() {
        return (byte) intValue();
    }

    public char toChar() {
        return (char) intValue();
    }

    public /* bridge */ double toDouble() {
        return super.doubleValue();
    }

    public /* bridge */ float toFloat() {
        return super.floatValue();
    }

    public /* bridge */ int toInt() {
        return super.intValue();
    }

    public /* bridge */ long toLong() {
        return super.longValue();
    }

    public short toShort() {
        return (short) intValue();
    }
}
