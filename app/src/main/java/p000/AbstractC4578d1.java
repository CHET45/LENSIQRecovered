package p000;

import p000.m15;
import p000.om2;

/* JADX INFO: renamed from: d1 */
/* JADX INFO: loaded from: classes7.dex */
@ph5
public abstract class AbstractC4578d1 implements m15, om2 {
    @Override // p000.m15
    @yfb
    public om2 beginCollection(@yfb f0f f0fVar, int i) {
        return m15.C9082a.beginCollection(this, f0fVar, i);
    }

    @Override // p000.m15
    @yfb
    public om2 beginStructure(@yfb f0f f0fVar) {
        md8.checkNotNullParameter(f0fVar, "descriptor");
        return this;
    }

    @Override // p000.m15
    public void encodeBoolean(boolean z) {
        encodeValue(Boolean.valueOf(z));
    }

    @Override // p000.om2
    public final void encodeBooleanElement(@yfb f0f f0fVar, int i, boolean z) {
        md8.checkNotNullParameter(f0fVar, "descriptor");
        if (encodeElement(f0fVar, i)) {
            encodeBoolean(z);
        }
    }

    @Override // p000.m15
    public void encodeByte(byte b) {
        encodeValue(Byte.valueOf(b));
    }

    @Override // p000.om2
    public final void encodeByteElement(@yfb f0f f0fVar, int i, byte b) {
        md8.checkNotNullParameter(f0fVar, "descriptor");
        if (encodeElement(f0fVar, i)) {
            encodeByte(b);
        }
    }

    @Override // p000.m15
    public void encodeChar(char c) {
        encodeValue(Character.valueOf(c));
    }

    @Override // p000.om2
    public final void encodeCharElement(@yfb f0f f0fVar, int i, char c) {
        md8.checkNotNullParameter(f0fVar, "descriptor");
        if (encodeElement(f0fVar, i)) {
            encodeChar(c);
        }
    }

    @Override // p000.m15
    public void encodeDouble(double d) {
        encodeValue(Double.valueOf(d));
    }

    @Override // p000.om2
    public final void encodeDoubleElement(@yfb f0f f0fVar, int i, double d) {
        md8.checkNotNullParameter(f0fVar, "descriptor");
        if (encodeElement(f0fVar, i)) {
            encodeDouble(d);
        }
    }

    public boolean encodeElement(@yfb f0f f0fVar, int i) {
        md8.checkNotNullParameter(f0fVar, "descriptor");
        return true;
    }

    @Override // p000.m15
    public void encodeEnum(@yfb f0f f0fVar, int i) {
        md8.checkNotNullParameter(f0fVar, "enumDescriptor");
        encodeValue(Integer.valueOf(i));
    }

    @Override // p000.m15
    public void encodeFloat(float f) {
        encodeValue(Float.valueOf(f));
    }

    @Override // p000.om2
    public final void encodeFloatElement(@yfb f0f f0fVar, int i, float f) {
        md8.checkNotNullParameter(f0fVar, "descriptor");
        if (encodeElement(f0fVar, i)) {
            encodeFloat(f);
        }
    }

    @Override // p000.m15
    @yfb
    public m15 encodeInline(@yfb f0f f0fVar) {
        md8.checkNotNullParameter(f0fVar, "descriptor");
        return this;
    }

    @Override // p000.om2
    @yfb
    public final m15 encodeInlineElement(@yfb f0f f0fVar, int i) {
        md8.checkNotNullParameter(f0fVar, "descriptor");
        return encodeElement(f0fVar, i) ? encodeInline(f0fVar.getElementDescriptor(i)) : sdb.f81471a;
    }

    @Override // p000.m15
    public void encodeInt(int i) {
        encodeValue(Integer.valueOf(i));
    }

    @Override // p000.om2
    public final void encodeIntElement(@yfb f0f f0fVar, int i, int i2) {
        md8.checkNotNullParameter(f0fVar, "descriptor");
        if (encodeElement(f0fVar, i)) {
            encodeInt(i2);
        }
    }

    @Override // p000.m15
    public void encodeLong(long j) {
        encodeValue(Long.valueOf(j));
    }

    @Override // p000.om2
    public final void encodeLongElement(@yfb f0f f0fVar, int i, long j) {
        md8.checkNotNullParameter(f0fVar, "descriptor");
        if (encodeElement(f0fVar, i)) {
            encodeLong(j);
        }
    }

    @Override // p000.m15
    @ph5
    public void encodeNotNullMark() {
        m15.C9082a.encodeNotNullMark(this);
    }

    @Override // p000.m15
    public void encodeNull() {
        throw new d1f("'null' is not supported by default");
    }

    public <T> void encodeNullableSerializableElement(@yfb f0f f0fVar, int i, @yfb e1f<? super T> e1fVar, @gib T t) {
        md8.checkNotNullParameter(f0fVar, "descriptor");
        md8.checkNotNullParameter(e1fVar, "serializer");
        if (encodeElement(f0fVar, i)) {
            encodeNullableSerializableValue(e1fVar, t);
        }
    }

    @Override // p000.m15
    @ph5
    public <T> void encodeNullableSerializableValue(@yfb e1f<? super T> e1fVar, @gib T t) {
        m15.C9082a.encodeNullableSerializableValue(this, e1fVar, t);
    }

    @Override // p000.om2
    public <T> void encodeSerializableElement(@yfb f0f f0fVar, int i, @yfb e1f<? super T> e1fVar, T t) {
        md8.checkNotNullParameter(f0fVar, "descriptor");
        md8.checkNotNullParameter(e1fVar, "serializer");
        if (encodeElement(f0fVar, i)) {
            encodeSerializableValue(e1fVar, t);
        }
    }

    @Override // p000.m15
    public <T> void encodeSerializableValue(@yfb e1f<? super T> e1fVar, T t) {
        m15.C9082a.encodeSerializableValue(this, e1fVar, t);
    }

    @Override // p000.m15
    public void encodeShort(short s) {
        encodeValue(Short.valueOf(s));
    }

    @Override // p000.om2
    public final void encodeShortElement(@yfb f0f f0fVar, int i, short s) {
        md8.checkNotNullParameter(f0fVar, "descriptor");
        if (encodeElement(f0fVar, i)) {
            encodeShort(s);
        }
    }

    @Override // p000.m15
    public void encodeString(@yfb String str) {
        md8.checkNotNullParameter(str, "value");
        encodeValue(str);
    }

    @Override // p000.om2
    public final void encodeStringElement(@yfb f0f f0fVar, int i, @yfb String str) {
        md8.checkNotNullParameter(f0fVar, "descriptor");
        md8.checkNotNullParameter(str, "value");
        if (encodeElement(f0fVar, i)) {
            encodeString(str);
        }
    }

    public void encodeValue(@yfb Object obj) {
        md8.checkNotNullParameter(obj, "value");
        throw new d1f("Non-serializable " + vvd.getOrCreateKotlinClass(obj.getClass()) + " is not supported by " + vvd.getOrCreateKotlinClass(getClass()) + " encoder");
    }

    public void endStructure(@yfb f0f f0fVar) {
        md8.checkNotNullParameter(f0fVar, "descriptor");
    }

    @ph5
    public boolean shouldEncodeElementDefault(@yfb f0f f0fVar, int i) {
        return om2.C10464a.shouldEncodeElementDefault(this, f0fVar, i);
    }
}
