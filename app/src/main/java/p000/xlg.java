package p000;

import java.util.ArrayList;
import java.util.List;
import p000.m15;
import p000.om2;

/* JADX INFO: loaded from: classes7.dex */
@nb8
@dwf({"SMAP\nTagged.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Tagged.kt\nkotlinx/serialization/internal/TaggedEncoder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,342:1\n1#2:343\n*E\n"})
public abstract class xlg<Tag> implements m15, om2 {

    /* JADX INFO: renamed from: a */
    @yfb
    public final ArrayList<Tag> f98444a = new ArrayList<>();

    private final boolean encodeElement(f0f f0fVar, int i) {
        m25290f(getTag(f0fVar, i));
        return true;
    }

    /* JADX INFO: renamed from: a */
    public void m25286a(Tag tag) {
    }

    /* JADX INFO: renamed from: b */
    public void mo11319b(@yfb f0f f0fVar) {
        md8.checkNotNullParameter(f0fVar, "descriptor");
    }

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

    /* JADX INFO: renamed from: c */
    public final Tag m25287c() {
        return (Tag) v82.last((List) this.f98444a);
    }

    @gib
    /* JADX INFO: renamed from: d */
    public final Tag m25288d() {
        return (Tag) v82.lastOrNull((List) this.f98444a);
    }

    /* JADX INFO: renamed from: e */
    public final Tag m25289e() {
        if (this.f98444a.isEmpty()) {
            throw new d1f("No tag in stack for requested element");
        }
        ArrayList<Tag> arrayList = this.f98444a;
        return arrayList.remove(l82.getLastIndex(arrayList));
    }

    @Override // p000.m15
    public final void encodeBoolean(boolean z) {
        encodeTaggedBoolean(m25289e(), z);
    }

    @Override // p000.om2
    public final void encodeBooleanElement(@yfb f0f f0fVar, int i, boolean z) {
        md8.checkNotNullParameter(f0fVar, "descriptor");
        encodeTaggedBoolean(getTag(f0fVar, i), z);
    }

    @Override // p000.m15
    public final void encodeByte(byte b) {
        encodeTaggedByte(m25289e(), b);
    }

    @Override // p000.om2
    public final void encodeByteElement(@yfb f0f f0fVar, int i, byte b) {
        md8.checkNotNullParameter(f0fVar, "descriptor");
        encodeTaggedByte(getTag(f0fVar, i), b);
    }

    @Override // p000.m15
    public final void encodeChar(char c) {
        encodeTaggedChar(m25289e(), c);
    }

    @Override // p000.om2
    public final void encodeCharElement(@yfb f0f f0fVar, int i, char c) {
        md8.checkNotNullParameter(f0fVar, "descriptor");
        encodeTaggedChar(getTag(f0fVar, i), c);
    }

    @Override // p000.m15
    public final void encodeDouble(double d) {
        encodeTaggedDouble(m25289e(), d);
    }

    @Override // p000.om2
    public final void encodeDoubleElement(@yfb f0f f0fVar, int i, double d) {
        md8.checkNotNullParameter(f0fVar, "descriptor");
        encodeTaggedDouble(getTag(f0fVar, i), d);
    }

    @Override // p000.m15
    public final void encodeEnum(@yfb f0f f0fVar, int i) {
        md8.checkNotNullParameter(f0fVar, "enumDescriptor");
        encodeTaggedEnum(m25289e(), f0fVar, i);
    }

    @Override // p000.m15
    public final void encodeFloat(float f) {
        encodeTaggedFloat(m25289e(), f);
    }

    @Override // p000.om2
    public final void encodeFloatElement(@yfb f0f f0fVar, int i, float f) {
        md8.checkNotNullParameter(f0fVar, "descriptor");
        encodeTaggedFloat(getTag(f0fVar, i), f);
    }

    @Override // p000.m15
    @yfb
    public m15 encodeInline(@yfb f0f f0fVar) {
        md8.checkNotNullParameter(f0fVar, "descriptor");
        return encodeTaggedInline(m25289e(), f0fVar);
    }

    @Override // p000.om2
    @yfb
    public final m15 encodeInlineElement(@yfb f0f f0fVar, int i) {
        md8.checkNotNullParameter(f0fVar, "descriptor");
        return encodeTaggedInline(getTag(f0fVar, i), f0fVar.getElementDescriptor(i));
    }

    @Override // p000.m15
    public final void encodeInt(int i) {
        encodeTaggedInt(m25289e(), i);
    }

    @Override // p000.om2
    public final void encodeIntElement(@yfb f0f f0fVar, int i, int i2) {
        md8.checkNotNullParameter(f0fVar, "descriptor");
        encodeTaggedInt(getTag(f0fVar, i), i2);
    }

    @Override // p000.m15
    public final void encodeLong(long j) {
        encodeTaggedLong(m25289e(), j);
    }

    @Override // p000.om2
    public final void encodeLongElement(@yfb f0f f0fVar, int i, long j) {
        md8.checkNotNullParameter(f0fVar, "descriptor");
        encodeTaggedLong(getTag(f0fVar, i), j);
    }

    @Override // p000.m15
    public void encodeNotNullMark() {
        m25286a(m25287c());
    }

    @Override // p000.m15
    public void encodeNull() {
        encodeTaggedNull(m25289e());
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
    public final void encodeShort(short s) {
        encodeTaggedShort(m25289e(), s);
    }

    @Override // p000.om2
    public final void encodeShortElement(@yfb f0f f0fVar, int i, short s) {
        md8.checkNotNullParameter(f0fVar, "descriptor");
        encodeTaggedShort(getTag(f0fVar, i), s);
    }

    @Override // p000.m15
    public final void encodeString(@yfb String str) {
        md8.checkNotNullParameter(str, "value");
        encodeTaggedString(m25289e(), str);
    }

    @Override // p000.om2
    public final void encodeStringElement(@yfb f0f f0fVar, int i, @yfb String str) {
        md8.checkNotNullParameter(f0fVar, "descriptor");
        md8.checkNotNullParameter(str, "value");
        encodeTaggedString(getTag(f0fVar, i), str);
    }

    public void encodeTaggedBoolean(Tag tag, boolean z) {
        encodeTaggedValue(tag, Boolean.valueOf(z));
    }

    public void encodeTaggedByte(Tag tag, byte b) {
        encodeTaggedValue(tag, Byte.valueOf(b));
    }

    public void encodeTaggedChar(Tag tag, char c) {
        encodeTaggedValue(tag, Character.valueOf(c));
    }

    public void encodeTaggedDouble(Tag tag, double d) {
        encodeTaggedValue(tag, Double.valueOf(d));
    }

    public void encodeTaggedEnum(Tag tag, @yfb f0f f0fVar, int i) {
        md8.checkNotNullParameter(f0fVar, "enumDescriptor");
        encodeTaggedValue(tag, Integer.valueOf(i));
    }

    public void encodeTaggedFloat(Tag tag, float f) {
        encodeTaggedValue(tag, Float.valueOf(f));
    }

    @yfb
    public m15 encodeTaggedInline(Tag tag, @yfb f0f f0fVar) {
        md8.checkNotNullParameter(f0fVar, "inlineDescriptor");
        m25290f(tag);
        return this;
    }

    public void encodeTaggedInt(Tag tag, int i) {
        encodeTaggedValue(tag, Integer.valueOf(i));
    }

    public void encodeTaggedLong(Tag tag, long j) {
        encodeTaggedValue(tag, Long.valueOf(j));
    }

    public void encodeTaggedNull(Tag tag) {
        throw new d1f("null is not supported");
    }

    public void encodeTaggedShort(Tag tag, short s) {
        encodeTaggedValue(tag, Short.valueOf(s));
    }

    public void encodeTaggedString(Tag tag, @yfb String str) {
        md8.checkNotNullParameter(str, "value");
        encodeTaggedValue(tag, str);
    }

    public void encodeTaggedValue(Tag tag, @yfb Object obj) {
        md8.checkNotNullParameter(obj, "value");
        throw new d1f("Non-serializable " + vvd.getOrCreateKotlinClass(obj.getClass()) + " is not supported by " + vvd.getOrCreateKotlinClass(getClass()) + " encoder");
    }

    @Override // p000.om2
    public final void endStructure(@yfb f0f f0fVar) {
        md8.checkNotNullParameter(f0fVar, "descriptor");
        if (!this.f98444a.isEmpty()) {
            m25289e();
        }
        mo11319b(f0fVar);
    }

    /* JADX INFO: renamed from: f */
    public final void m25290f(Tag tag) {
        this.f98444a.add(tag);
    }

    @Override // p000.m15, p000.om2
    @yfb
    public n2f getSerializersModule() {
        return p2f.EmptySerializersModule();
    }

    public abstract Tag getTag(@yfb f0f f0fVar, int i);

    @ph5
    public boolean shouldEncodeElementDefault(@yfb f0f f0fVar, int i) {
        return om2.C10464a.shouldEncodeElementDefault(this, f0fVar, i);
    }
}
