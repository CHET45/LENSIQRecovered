package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class sdb extends AbstractC4578d1 {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final sdb f81471a = new sdb();

    /* JADX INFO: renamed from: b */
    @yfb
    public static final n2f f81472b = p2f.EmptySerializersModule();

    private sdb() {
    }

    @Override // p000.AbstractC4578d1, p000.m15
    public void encodeBoolean(boolean z) {
    }

    @Override // p000.AbstractC4578d1, p000.m15
    public void encodeByte(byte b) {
    }

    @Override // p000.AbstractC4578d1, p000.m15
    public void encodeChar(char c) {
    }

    @Override // p000.AbstractC4578d1, p000.m15
    public void encodeDouble(double d) {
    }

    @Override // p000.AbstractC4578d1, p000.m15
    public void encodeEnum(@yfb f0f f0fVar, int i) {
        md8.checkNotNullParameter(f0fVar, "enumDescriptor");
    }

    @Override // p000.AbstractC4578d1, p000.m15
    public void encodeFloat(float f) {
    }

    @Override // p000.AbstractC4578d1, p000.m15
    public void encodeInt(int i) {
    }

    @Override // p000.AbstractC4578d1, p000.m15
    public void encodeLong(long j) {
    }

    @Override // p000.AbstractC4578d1, p000.m15
    public void encodeNull() {
    }

    @Override // p000.AbstractC4578d1, p000.m15
    public void encodeShort(short s) {
    }

    @Override // p000.AbstractC4578d1, p000.m15
    public void encodeString(@yfb String str) {
        md8.checkNotNullParameter(str, "value");
    }

    @Override // p000.AbstractC4578d1
    public void encodeValue(@yfb Object obj) {
        md8.checkNotNullParameter(obj, "value");
    }

    @Override // p000.m15, p000.om2
    @yfb
    public n2f getSerializersModule() {
        return f81472b;
    }
}
