package p000;

import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class b7g {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final Set<f0f> f12934a = w6f.setOf((Object[]) new f0f[]{hg1.serializer(woh.f94997b).getDescriptor(), hg1.serializer(oph.f68284b).getDescriptor(), hg1.serializer(goh.f40684b).getDescriptor(), hg1.serializer(iqh.f48005b).getDescriptor()});

    public static final boolean isUnquotedLiteral(@yfb f0f f0fVar) {
        md8.checkNotNullParameter(f0fVar, "<this>");
        return f0fVar.isInline() && md8.areEqual(f0fVar, uk8.getJsonUnquotedLiteralDescriptor());
    }

    public static final boolean isUnsignedNumber(@yfb f0f f0fVar) {
        md8.checkNotNullParameter(f0fVar, "<this>");
        return f0fVar.isInline() && f12934a.contains(f0fVar);
    }
}
