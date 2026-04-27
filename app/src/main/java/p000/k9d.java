package p000;

import java.io.IOException;
import java.io.InputStream;
import p000.l9d;
import p000.p7e;

/* JADX INFO: loaded from: classes3.dex */
@p7e({p7e.EnumC10826a.f69935b})
public final class k9d {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final C8257a f53374a = new C8257a(null);

    /* JADX INFO: renamed from: k9d$a */
    public static final class C8257a {
        public /* synthetic */ C8257a(jt3 jt3Var) {
            this();
        }

        @yfb
        public final l9d.C8729b readFrom(@yfb InputStream inputStream) throws IOException {
            md8.checkNotNullParameter(inputStream, "input");
            try {
                l9d.C8729b from = l9d.C8729b.parseFrom(inputStream);
                md8.checkNotNullExpressionValue(from, "{\n                Prefer…From(input)\n            }");
                return from;
            } catch (be8 e) {
                throw new d23("Unable to parse preferences proto.", e);
            }
        }

        private C8257a() {
        }
    }
}
