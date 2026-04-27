package p000;

import java.io.IOException;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes3.dex */
public class k7g implements lkb, sjb {

    /* JADX INFO: renamed from: a */
    public static k7g f52747a = new k7g();

    private k7g() {
    }

    @Override // p000.sjb
    public <T> T deserialze(hw3 hw3Var, Type type, Object obj) {
        return (T) hw3Var.parseString();
    }

    @Override // p000.lkb
    public void write(ph8 ph8Var, Object obj, Object obj2, Type type) throws IOException {
        String str = (String) obj;
        i1f i1fVar = ph8Var.f70792b;
        if (str == null) {
            i1fVar.writeNull();
        } else {
            i1fVar.writeString(str);
        }
    }
}
