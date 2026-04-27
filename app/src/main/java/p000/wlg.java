package p000;

import java.util.ArrayList;
import java.util.List;
import p000.jl3;
import p000.lm2;

/* JADX INFO: loaded from: classes7.dex */
@nb8
@dwf({"SMAP\nTagged.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Tagged.kt\nkotlinx/serialization/internal/TaggedDecoder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Decoding.kt\nkotlinx/serialization/encoding/DecodingKt\n*L\n1#1,342:1\n1#2:343\n270#3,2:344\n*S KotlinDebug\n*F\n+ 1 Tagged.kt\nkotlinx/serialization/internal/TaggedDecoder\n*L\n287#1:344,2\n*E\n"})
public abstract class wlg<Tag> implements jl3, lm2 {

    /* JADX INFO: renamed from: d */
    @yfb
    public final ArrayList<Tag> f94665d = new ArrayList<>();

    /* JADX INFO: renamed from: e */
    public boolean f94666e;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object decodeNullableSerializableElement$lambda$3(wlg wlgVar, t74 t74Var, Object obj) {
        return (t74Var.getDescriptor().isNullable() || wlgVar.decodeNotNullMark()) ? wlgVar.m24657d(t74Var, obj) : wlgVar.decodeNull();
    }

    private final <E> E tagBlock(Tag tag, ny6<? extends E> ny6Var) {
        m24662i(tag);
        E eInvoke = ny6Var.invoke();
        if (!this.f94666e) {
            m24661h();
        }
        this.f94666e = false;
        return eInvoke;
    }

    @Override // p000.jl3
    @yfb
    public lm2 beginStructure(@yfb f0f f0fVar) {
        md8.checkNotNullParameter(f0fVar, "descriptor");
        return this;
    }

    /* JADX INFO: renamed from: c */
    public final void m24656c(@yfb wlg<Tag> wlgVar) {
        md8.checkNotNullParameter(wlgVar, "other");
        wlgVar.f94665d.addAll(this.f94665d);
    }

    /* JADX INFO: renamed from: d */
    public <T> T m24657d(@yfb t74<? extends T> t74Var, @gib T t) {
        md8.checkNotNullParameter(t74Var, "deserializer");
        return (T) decodeSerializableValue(t74Var);
    }

    @Override // p000.jl3
    public final boolean decodeBoolean() {
        return decodeTaggedBoolean(m24661h());
    }

    @Override // p000.lm2
    public final boolean decodeBooleanElement(@yfb f0f f0fVar, int i) {
        md8.checkNotNullParameter(f0fVar, "descriptor");
        return decodeTaggedBoolean(getTag(f0fVar, i));
    }

    @Override // p000.jl3
    public final byte decodeByte() {
        return decodeTaggedByte(m24661h());
    }

    @Override // p000.lm2
    public final byte decodeByteElement(@yfb f0f f0fVar, int i) {
        md8.checkNotNullParameter(f0fVar, "descriptor");
        return decodeTaggedByte(getTag(f0fVar, i));
    }

    @Override // p000.jl3
    public final char decodeChar() {
        return decodeTaggedChar(m24661h());
    }

    @Override // p000.lm2
    public final char decodeCharElement(@yfb f0f f0fVar, int i) {
        md8.checkNotNullParameter(f0fVar, "descriptor");
        return decodeTaggedChar(getTag(f0fVar, i));
    }

    @Override // p000.lm2
    public int decodeCollectionSize(@yfb f0f f0fVar) {
        return lm2.C8896b.decodeCollectionSize(this, f0fVar);
    }

    @Override // p000.jl3
    public final double decodeDouble() {
        return decodeTaggedDouble(m24661h());
    }

    @Override // p000.lm2
    public final double decodeDoubleElement(@yfb f0f f0fVar, int i) {
        md8.checkNotNullParameter(f0fVar, "descriptor");
        return decodeTaggedDouble(getTag(f0fVar, i));
    }

    @Override // p000.jl3
    public final int decodeEnum(@yfb f0f f0fVar) {
        md8.checkNotNullParameter(f0fVar, "enumDescriptor");
        return decodeTaggedEnum(m24661h(), f0fVar);
    }

    @Override // p000.jl3
    public final float decodeFloat() {
        return decodeTaggedFloat(m24661h());
    }

    @Override // p000.lm2
    public final float decodeFloatElement(@yfb f0f f0fVar, int i) {
        md8.checkNotNullParameter(f0fVar, "descriptor");
        return decodeTaggedFloat(getTag(f0fVar, i));
    }

    @Override // p000.jl3
    @yfb
    public jl3 decodeInline(@yfb f0f f0fVar) {
        md8.checkNotNullParameter(f0fVar, "descriptor");
        return decodeTaggedInline(m24661h(), f0fVar);
    }

    @Override // p000.lm2
    @yfb
    public final jl3 decodeInlineElement(@yfb f0f f0fVar, int i) {
        md8.checkNotNullParameter(f0fVar, "descriptor");
        return decodeTaggedInline(getTag(f0fVar, i), f0fVar.getElementDescriptor(i));
    }

    @Override // p000.jl3
    public final int decodeInt() {
        return decodeTaggedInt(m24661h());
    }

    @Override // p000.lm2
    public final int decodeIntElement(@yfb f0f f0fVar, int i) {
        md8.checkNotNullParameter(f0fVar, "descriptor");
        return decodeTaggedInt(getTag(f0fVar, i));
    }

    @Override // p000.jl3
    public final long decodeLong() {
        return decodeTaggedLong(m24661h());
    }

    @Override // p000.lm2
    public final long decodeLongElement(@yfb f0f f0fVar, int i) {
        md8.checkNotNullParameter(f0fVar, "descriptor");
        return decodeTaggedLong(getTag(f0fVar, i));
    }

    @Override // p000.jl3
    public boolean decodeNotNullMark() {
        Tag tagM24660g = m24660g();
        if (tagM24660g == null) {
            return false;
        }
        return decodeTaggedNotNullMark(tagM24660g);
    }

    @Override // p000.jl3
    @gib
    public final Void decodeNull() {
        return null;
    }

    @Override // p000.lm2
    @gib
    public final <T> T decodeNullableSerializableElement(@yfb f0f f0fVar, int i, @yfb final t74<? extends T> t74Var, @gib final T t) {
        md8.checkNotNullParameter(f0fVar, "descriptor");
        md8.checkNotNullParameter(t74Var, "deserializer");
        return (T) tagBlock(getTag(f0fVar, i), new ny6() { // from class: vlg
            @Override // p000.ny6
            public final Object invoke() {
                return wlg.decodeNullableSerializableElement$lambda$3(this.f91625a, t74Var, t);
            }
        });
    }

    @Override // p000.jl3
    @gib
    @ph5
    public <T> T decodeNullableSerializableValue(@yfb t74<? extends T> t74Var) {
        return (T) jl3.C7970a.decodeNullableSerializableValue(this, t74Var);
    }

    @Override // p000.lm2
    @ph5
    public boolean decodeSequentially() {
        return lm2.C8896b.decodeSequentially(this);
    }

    @Override // p000.lm2
    public final <T> T decodeSerializableElement(@yfb f0f f0fVar, int i, @yfb final t74<? extends T> t74Var, @gib final T t) {
        md8.checkNotNullParameter(f0fVar, "descriptor");
        md8.checkNotNullParameter(t74Var, "deserializer");
        return (T) tagBlock(getTag(f0fVar, i), new ny6() { // from class: ulg
            @Override // p000.ny6
            public final Object invoke() {
                return this.f88415a.m24657d(t74Var, t);
            }
        });
    }

    @Override // p000.jl3
    public <T> T decodeSerializableValue(@yfb t74<? extends T> t74Var) {
        return (T) jl3.C7970a.decodeSerializableValue(this, t74Var);
    }

    @Override // p000.jl3
    public final short decodeShort() {
        return decodeTaggedShort(m24661h());
    }

    @Override // p000.lm2
    public final short decodeShortElement(@yfb f0f f0fVar, int i) {
        md8.checkNotNullParameter(f0fVar, "descriptor");
        return decodeTaggedShort(getTag(f0fVar, i));
    }

    @Override // p000.jl3
    @yfb
    public final String decodeString() {
        return decodeTaggedString(m24661h());
    }

    @Override // p000.lm2
    @yfb
    public final String decodeStringElement(@yfb f0f f0fVar, int i) {
        md8.checkNotNullParameter(f0fVar, "descriptor");
        return decodeTaggedString(getTag(f0fVar, i));
    }

    public boolean decodeTaggedBoolean(Tag tag) {
        Object objM24658e = m24658e(tag);
        md8.checkNotNull(objM24658e, "null cannot be cast to non-null type kotlin.Boolean");
        return ((Boolean) objM24658e).booleanValue();
    }

    public byte decodeTaggedByte(Tag tag) {
        Object objM24658e = m24658e(tag);
        md8.checkNotNull(objM24658e, "null cannot be cast to non-null type kotlin.Byte");
        return ((Byte) objM24658e).byteValue();
    }

    public char decodeTaggedChar(Tag tag) {
        Object objM24658e = m24658e(tag);
        md8.checkNotNull(objM24658e, "null cannot be cast to non-null type kotlin.Char");
        return ((Character) objM24658e).charValue();
    }

    public double decodeTaggedDouble(Tag tag) {
        Object objM24658e = m24658e(tag);
        md8.checkNotNull(objM24658e, "null cannot be cast to non-null type kotlin.Double");
        return ((Double) objM24658e).doubleValue();
    }

    public int decodeTaggedEnum(Tag tag, @yfb f0f f0fVar) {
        md8.checkNotNullParameter(f0fVar, "enumDescriptor");
        Object objM24658e = m24658e(tag);
        md8.checkNotNull(objM24658e, "null cannot be cast to non-null type kotlin.Int");
        return ((Integer) objM24658e).intValue();
    }

    public float decodeTaggedFloat(Tag tag) {
        Object objM24658e = m24658e(tag);
        md8.checkNotNull(objM24658e, "null cannot be cast to non-null type kotlin.Float");
        return ((Float) objM24658e).floatValue();
    }

    @yfb
    public jl3 decodeTaggedInline(Tag tag, @yfb f0f f0fVar) {
        md8.checkNotNullParameter(f0fVar, "inlineDescriptor");
        m24662i(tag);
        return this;
    }

    public int decodeTaggedInt(Tag tag) {
        Object objM24658e = m24658e(tag);
        md8.checkNotNull(objM24658e, "null cannot be cast to non-null type kotlin.Int");
        return ((Integer) objM24658e).intValue();
    }

    public long decodeTaggedLong(Tag tag) {
        Object objM24658e = m24658e(tag);
        md8.checkNotNull(objM24658e, "null cannot be cast to non-null type kotlin.Long");
        return ((Long) objM24658e).longValue();
    }

    public boolean decodeTaggedNotNullMark(Tag tag) {
        return true;
    }

    @gib
    public Void decodeTaggedNull(Tag tag) {
        return null;
    }

    public short decodeTaggedShort(Tag tag) {
        Object objM24658e = m24658e(tag);
        md8.checkNotNull(objM24658e, "null cannot be cast to non-null type kotlin.Short");
        return ((Short) objM24658e).shortValue();
    }

    @yfb
    public String decodeTaggedString(Tag tag) {
        Object objM24658e = m24658e(tag);
        md8.checkNotNull(objM24658e, "null cannot be cast to non-null type kotlin.String");
        return (String) objM24658e;
    }

    @yfb
    /* JADX INFO: renamed from: e */
    public Object m24658e(Tag tag) {
        throw new d1f(vvd.getOrCreateKotlinClass(getClass()) + " can't retrieve untyped values");
    }

    public void endStructure(@yfb f0f f0fVar) {
        md8.checkNotNullParameter(f0fVar, "descriptor");
    }

    /* JADX INFO: renamed from: f */
    public final Tag m24659f() {
        return (Tag) v82.last((List) this.f94665d);
    }

    @gib
    /* JADX INFO: renamed from: g */
    public final Tag m24660g() {
        return (Tag) v82.lastOrNull((List) this.f94665d);
    }

    @Override // p000.jl3, p000.lm2
    @yfb
    public n2f getSerializersModule() {
        return p2f.EmptySerializersModule();
    }

    public abstract Tag getTag(@yfb f0f f0fVar, int i);

    @yfb
    public final ArrayList<Tag> getTagStack$kotlinx_serialization_core() {
        return this.f94665d;
    }

    /* JADX INFO: renamed from: h */
    public final Tag m24661h() {
        ArrayList<Tag> arrayList = this.f94665d;
        Tag tagRemove = arrayList.remove(l82.getLastIndex(arrayList));
        this.f94666e = true;
        return tagRemove;
    }

    /* JADX INFO: renamed from: i */
    public final void m24662i(Tag tag) {
        this.f94665d.add(tag);
    }
}
