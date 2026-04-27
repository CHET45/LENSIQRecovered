package p000;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
@ay1
public abstract class rth<T, B> {

    /* JADX INFO: renamed from: a */
    public static final int f79564a = 100;

    /* JADX INFO: renamed from: b */
    public static volatile int f79565b = 100;

    private final void mergeFrom(B unknownFields, hrd reader, int currentDepth) throws IOException {
        while (reader.getFieldNumber() != Integer.MAX_VALUE && m21533l(unknownFields, reader, currentDepth)) {
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo21522a(B fields, int number, int value);

    /* JADX INFO: renamed from: b */
    public abstract void mo21523b(B fields, int number, long value);

    /* JADX INFO: renamed from: c */
    public abstract void mo21524c(B fields, int number, T subFieldSet);

    /* JADX INFO: renamed from: d */
    public abstract void mo21525d(B fields, int number, vj1 value);

    /* JADX INFO: renamed from: e */
    public abstract void mo21526e(B fields, int number, long value);

    /* JADX INFO: renamed from: f */
    public abstract B mo21527f(Object message);

    /* JADX INFO: renamed from: g */
    public abstract T mo21528g(Object message);

    /* JADX INFO: renamed from: h */
    public abstract int mo21529h(T unknowns);

    /* JADX INFO: renamed from: i */
    public abstract int mo21530i(T message);

    /* JADX INFO: renamed from: j */
    public abstract void mo21531j(Object message);

    /* JADX INFO: renamed from: k */
    public abstract T mo21532k(T destination, T source);

    /* JADX INFO: renamed from: l */
    public final boolean m21533l(B unknownFields, hrd reader, int currentDepth) throws IOException {
        int tag = reader.getTag();
        int tagFieldNumber = hpi.getTagFieldNumber(tag);
        int tagWireType = hpi.getTagWireType(tag);
        if (tagWireType == 0) {
            mo21526e(unknownFields, tagFieldNumber, reader.readInt64());
            return true;
        }
        if (tagWireType == 1) {
            mo21523b(unknownFields, tagFieldNumber, reader.readFixed64());
            return true;
        }
        if (tagWireType == 2) {
            mo21525d(unknownFields, tagFieldNumber, reader.readBytes());
            return true;
        }
        if (tagWireType != 3) {
            if (tagWireType == 4) {
                return false;
            }
            if (tagWireType != 5) {
                throw ce8.m3922e();
            }
            mo21522a(unknownFields, tagFieldNumber, reader.readFixed32());
            return true;
        }
        B bMo21534m = mo21534m();
        int iM12536a = hpi.m12536a(tagFieldNumber, 4);
        int i = currentDepth + 1;
        if (i >= f79565b) {
            throw ce8.m3926i();
        }
        mergeFrom(bMo21534m, reader, i);
        if (iM12536a != reader.getTag()) {
            throw ce8.m3919b();
        }
        mo21524c(unknownFields, tagFieldNumber, mo21538q(bMo21534m));
        return true;
    }

    /* JADX INFO: renamed from: m */
    public abstract B mo21534m();

    /* JADX INFO: renamed from: n */
    public abstract void mo21535n(Object message, B builder);

    /* JADX INFO: renamed from: o */
    public abstract void mo21536o(Object message, T fields);

    /* JADX INFO: renamed from: p */
    public abstract boolean mo21537p(hrd reader);

    /* JADX INFO: renamed from: q */
    public abstract T mo21538q(B fields);

    /* JADX INFO: renamed from: r */
    public abstract void mo21539r(T unknownFields, rsi writer) throws IOException;

    /* JADX INFO: renamed from: s */
    public abstract void mo21540s(T unknownFields, rsi writer) throws IOException;

    public void setRecursionLimit(int limit) {
        f79565b = limit;
    }
}
