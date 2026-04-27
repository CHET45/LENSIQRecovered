package p000;

import androidx.lifecycle.C1171x;
import java.lang.Enum;
import java.util.Arrays;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nEnums.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Enums.kt\nkotlinx/serialization/internal/EnumSerializer\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,148:1\n13409#2,2:149\n*S KotlinDebug\n*F\n+ 1 Enums.kt\nkotlinx/serialization/internal/EnumSerializer\n*L\n120#1:149,2\n*E\n"})
@yjd
public final class f45<T extends Enum<T>> implements lp8<T> {

    /* JADX INFO: renamed from: a */
    @yfb
    public final T[] f35027a;

    /* JADX INFO: renamed from: b */
    @gib
    public f0f f35028b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final fx8 f35029c;

    public f45(@yfb final String str, @yfb T[] tArr) {
        md8.checkNotNullParameter(str, "serialName");
        md8.checkNotNullParameter(tArr, C1171x.f7958g);
        this.f35027a = tArr;
        this.f35029c = hz8.lazy(new ny6() { // from class: e45
            @Override // p000.ny6
            public final Object invoke() {
                return f45.descriptor_delegate$lambda$0(this.f31745a, str);
            }
        });
    }

    private final f0f createUnmarkedDescriptor(String str) {
        t35 t35Var = new t35(str, this.f35027a.length);
        for (T t : this.f35027a) {
            h1d.addElement$default(t35Var, t.name(), false, 2, null);
        }
        return t35Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f0f descriptor_delegate$lambda$0(f45 f45Var, String str) {
        f0f f0fVar = f45Var.f35028b;
        return f0fVar == null ? f45Var.createUnmarkedDescriptor(str) : f0fVar;
    }

    @Override // p000.lp8, p000.e1f, p000.t74
    @yfb
    public f0f getDescriptor() {
        return (f0f) this.f35029c.getValue();
    }

    @yfb
    public String toString() {
        return "kotlinx.serialization.internal.EnumSerializer<" + getDescriptor().getSerialName() + '>';
    }

    @Override // p000.t74
    @yfb
    public T deserialize(@yfb jl3 jl3Var) {
        md8.checkNotNullParameter(jl3Var, "decoder");
        int iDecodeEnum = jl3Var.decodeEnum(getDescriptor());
        if (iDecodeEnum >= 0) {
            T[] tArr = this.f35027a;
            if (iDecodeEnum < tArr.length) {
                return tArr[iDecodeEnum];
            }
        }
        throw new d1f(iDecodeEnum + " is not among valid " + getDescriptor().getSerialName() + " enum values, values size is " + this.f35027a.length);
    }

    @Override // p000.e1f
    public void serialize(@yfb m15 m15Var, @yfb T t) {
        md8.checkNotNullParameter(m15Var, "encoder");
        md8.checkNotNullParameter(t, "value");
        int iIndexOf = e80.indexOf(this.f35027a, t);
        if (iIndexOf != -1) {
            m15Var.encodeEnum(getDescriptor(), iIndexOf);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(t);
        sb.append(" is not a valid enum ");
        sb.append(getDescriptor().getSerialName());
        sb.append(", must be one of ");
        String string = Arrays.toString(this.f35027a);
        md8.checkNotNullExpressionValue(string, "toString(...)");
        sb.append(string);
        throw new d1f(sb.toString());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public f45(@yfb String str, @yfb T[] tArr, @yfb f0f f0fVar) {
        this(str, tArr);
        md8.checkNotNullParameter(str, "serialName");
        md8.checkNotNullParameter(tArr, C1171x.f7958g);
        md8.checkNotNullParameter(f0fVar, "descriptor");
        this.f35028b = f0fVar;
    }
}
