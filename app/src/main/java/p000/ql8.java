package p000;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nJsonElement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JsonElement.kt\nkotlinx/serialization/json/JsonLiteral\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,348:1\n1#2:349\n*E\n"})
public final class ql8 extends fm8 {

    /* JADX INFO: renamed from: a */
    public final boolean f74816a;

    /* JADX INFO: renamed from: b */
    @gib
    public final f0f f74817b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final String f74818c;

    public /* synthetic */ ql8(Object obj, boolean z, f0f f0fVar, int i, jt3 jt3Var) {
        this(obj, z, (i & 4) != 0 ? null : f0fVar);
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ql8.class != obj.getClass()) {
            return false;
        }
        ql8 ql8Var = (ql8) obj;
        return isString() == ql8Var.isString() && md8.areEqual(getContent(), ql8Var.getContent());
    }

    @gib
    public final f0f getCoerceToInlineType$kotlinx_serialization_json() {
        return this.f74817b;
    }

    @Override // p000.fm8
    @yfb
    public String getContent() {
        return this.f74818c;
    }

    @ggg
    public int hashCode() {
        return (Boolean.hashCode(isString()) * 31) + getContent().hashCode();
    }

    @Override // p000.fm8
    public boolean isString() {
        return this.f74816a;
    }

    @Override // p000.fm8
    @yfb
    public String toString() {
        if (!isString()) {
            return getContent();
        }
        StringBuilder sb = new StringBuilder();
        e8g.printQuoted(sb, getContent());
        String string = sb.toString();
        md8.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ql8(@yfb Object obj, boolean z, @gib f0f f0fVar) {
        super(null);
        md8.checkNotNullParameter(obj, "body");
        this.f74816a = z;
        this.f74817b = f0fVar;
        this.f74818c = obj.toString();
        if (f0fVar != null && !f0fVar.isInline()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }
}
