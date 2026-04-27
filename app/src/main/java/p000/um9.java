package p000;

import com.blankj.utilcode.util.C2473f;
import java.util.List;
import p000.jvd;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 1)
public class um9 implements bbd<String> {

    /* JADX INFO: renamed from: b */
    public static final int f88525b = 0;

    /* JADX INFO: renamed from: a */
    public final int f88526a;

    /* JADX INFO: renamed from: um9$a */
    public static final class C13603a extends tt8 implements ny6<String> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ jvd.C8119f f88527a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f88528b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13603a(jvd.C8119f c8119f, int i) {
            super(0);
            this.f88527a = c8119f;
            this.f88528b = i;
        }

        @Override // p000.ny6
        @gib
        public final String invoke() {
            List list = vm9.f91737a;
            jvd.C8119f c8119f = this.f88527a;
            int i = c8119f.f52108a;
            c8119f.f52108a = i + 1;
            return (String) list.get(i % this.f88528b);
        }
    }

    public um9(int i) {
        this.f88526a = i;
    }

    private final String generateLoremIpsum(int i) {
        return vze.joinToString$default(vze.take(ize.generateSequence(new C13603a(new jvd.C8119f(), vm9.f91737a.size())), i), C2473f.f17566z, null, null, 0, null, null, 62, null);
    }

    @Override // p000.bbd
    @yfb
    public vye<String> getValues() {
        return ize.sequenceOf(generateLoremIpsum(this.f88526a));
    }

    public um9() {
        this(500);
    }
}
