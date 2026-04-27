package p000;

import java.io.IOException;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes3.dex */
public class g45 implements lkb {
    @Override // p000.lkb
    public void write(ph8 ph8Var, Object obj, Object obj2, Type type) throws IOException {
        i1f i1fVar = ph8Var.f70792b;
        if ((i1fVar.f45448c & a2f.WriteEnumUsingToString.f216a) == 0) {
            i1fVar.writeInt(((Enum) obj).ordinal());
            return;
        }
        String string = ((Enum) obj).toString();
        if ((i1fVar.f45448c & a2f.UseSingleQuotes.f216a) != 0) {
            i1fVar.m12718d(string);
        } else {
            i1fVar.m12717c(string, (char) 0, false);
        }
    }
}
