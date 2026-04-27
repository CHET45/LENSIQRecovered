package p000;

import java.util.Iterator;

/* JADX INFO: loaded from: classes7.dex */
public final class nl8 {

    /* JADX INFO: renamed from: nl8$a */
    public /* synthetic */ class C9919a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f64861a;

        static {
            int[] iArr = new int[hl3.values().length];
            try {
                iArr[hl3.f44064a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[hl3.f44065b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[hl3.f44066c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f64861a = iArr;
        }
    }

    @yfb
    public static final <T> Iterator<T> JsonIterator(@yfb hl3 hl3Var, @yfb bk8 bk8Var, @yfb krd krdVar, @yfb t74<? extends T> t74Var) {
        md8.checkNotNullParameter(hl3Var, "mode");
        md8.checkNotNullParameter(bk8Var, "json");
        md8.checkNotNullParameter(krdVar, "lexer");
        md8.checkNotNullParameter(t74Var, "deserializer");
        int i = C9919a.f64861a[determineFormat(krdVar, hl3Var).ordinal()];
        if (i == 1) {
            return new ol8(bk8Var, krdVar, t74Var);
        }
        if (i == 2) {
            return new ml8(bk8Var, krdVar, t74Var);
        }
        if (i != 3) {
            throw new ceb();
        }
        throw new IllegalStateException("AbstractJsonLexer.determineFormat must be called beforehand.");
    }

    private static final hl3 determineFormat(AbstractC2163c2 abstractC2163c2, hl3 hl3Var) {
        int i = C9919a.f64861a[hl3Var.ordinal()];
        if (i == 1) {
            return hl3.f44064a;
        }
        if (i != 2) {
            if (i == 3) {
                return tryConsumeStartArray(abstractC2163c2) ? hl3.f44065b : hl3.f44064a;
            }
            throw new ceb();
        }
        if (tryConsumeStartArray(abstractC2163c2)) {
            return hl3.f44065b;
        }
        AbstractC2163c2.fail$kotlinx_serialization_json$default(abstractC2163c2, (byte) 8, false, 2, null);
        throw new us8();
    }

    private static final boolean tryConsumeStartArray(AbstractC2163c2 abstractC2163c2) {
        if (abstractC2163c2.peekNextToken() != 8) {
            return false;
        }
        abstractC2163c2.consumeNextToken((byte) 8);
        return true;
    }
}
