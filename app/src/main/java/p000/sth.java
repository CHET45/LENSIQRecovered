package p000;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
@ey1
public abstract class sth<T, B> {

    /* JADX INFO: renamed from: a */
    public static final int f82851a = 100;

    /* JADX INFO: renamed from: b */
    public static volatile int f82852b = 100;

    private final void mergeFrom(B unknownFields, ird reader, int currentDepth) throws IOException {
        while (reader.getFieldNumber() != Integer.MAX_VALUE && m22239l(unknownFields, reader, currentDepth)) {
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo22228a(B fields, int number, int value);

    /* JADX INFO: renamed from: b */
    public abstract void mo22229b(B fields, int number, long value);

    /* JADX INFO: renamed from: c */
    public abstract void mo22230c(B fields, int number, T subFieldSet);

    /* JADX INFO: renamed from: d */
    public abstract void mo22231d(B fields, int number, wj1 value);

    /* JADX INFO: renamed from: e */
    public abstract void mo22232e(B fields, int number, long value);

    /* JADX INFO: renamed from: f */
    public abstract B mo22233f(Object message);

    /* JADX INFO: renamed from: g */
    public abstract T mo22234g(Object message);

    /* JADX INFO: renamed from: h */
    public abstract int mo22235h(T unknowns);

    /* JADX INFO: renamed from: i */
    public abstract int mo22236i(T message);

    /* JADX INFO: renamed from: j */
    public abstract void mo22237j(Object message);

    /* JADX INFO: renamed from: k */
    public abstract T mo22238k(T destination, T source);

    /* JADX INFO: renamed from: l */
    public final boolean m22239l(B unknownFields, ird reader, int currentDepth) throws IOException {
        int tag = reader.getTag();
        int tagFieldNumber = gpi.getTagFieldNumber(tag);
        int tagWireType = gpi.getTagWireType(tag);
        if (tagWireType == 0) {
            mo22232e(unknownFields, tagFieldNumber, reader.readInt64());
            return true;
        }
        if (tagWireType == 1) {
            mo22229b(unknownFields, tagFieldNumber, reader.readFixed64());
            return true;
        }
        if (tagWireType == 2) {
            mo22231d(unknownFields, tagFieldNumber, reader.readBytes());
            return true;
        }
        if (tagWireType != 3) {
            if (tagWireType == 4) {
                return false;
            }
            if (tagWireType != 5) {
                throw be8.m3078e();
            }
            mo22228a(unknownFields, tagFieldNumber, reader.readFixed32());
            return true;
        }
        B bMo22240m = mo22240m();
        int iM11819a = gpi.m11819a(tagFieldNumber, 4);
        int i = currentDepth + 1;
        if (i >= f82852b) {
            throw be8.m3082i();
        }
        mergeFrom(bMo22240m, reader, i);
        if (iM11819a != reader.getTag()) {
            throw be8.m3075b();
        }
        mo22230c(unknownFields, tagFieldNumber, mo22244q(bMo22240m));
        return true;
    }

    /* JADX INFO: renamed from: m */
    public abstract B mo22240m();

    /* JADX INFO: renamed from: n */
    public abstract void mo22241n(Object message, B builder);

    /* JADX INFO: renamed from: o */
    public abstract void mo22242o(Object message, T fields);

    /* JADX INFO: renamed from: p */
    public abstract boolean mo22243p(ird reader);

    /* JADX INFO: renamed from: q */
    public abstract T mo22244q(B fields);

    /* JADX INFO: renamed from: r */
    public abstract void mo22245r(T unknownFields, qsi writer) throws IOException;

    /* JADX INFO: renamed from: s */
    public abstract void mo22246s(T unknownFields, qsi writer) throws IOException;

    public void setRecursionLimit(int limit) {
        f82852b = limit;
    }
}
