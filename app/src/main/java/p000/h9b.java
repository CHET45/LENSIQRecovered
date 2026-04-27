package p000;

/* JADX INFO: loaded from: classes7.dex */
@nb8
public abstract class h9b extends xlg<String> {
    @yfb
    /* JADX INFO: renamed from: g */
    public String mo11320g(@yfb String str, @yfb String str2) {
        md8.checkNotNullParameter(str, "parentName");
        md8.checkNotNullParameter(str2, "childName");
        if (str.length() == 0) {
            return str2;
        }
        return str + a18.f100c + str2;
    }

    @yfb
    /* JADX INFO: renamed from: h */
    public String mo11321h(@yfb f0f f0fVar, int i) {
        md8.checkNotNullParameter(f0fVar, "descriptor");
        return f0fVar.getElementName(i);
    }

    @Override // p000.xlg
    @yfb
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public final String getTag(@yfb f0f f0fVar, int i) {
        md8.checkNotNullParameter(f0fVar, "<this>");
        return m12282j(mo11321h(f0fVar, i));
    }

    @yfb
    /* JADX INFO: renamed from: j */
    public final String m12282j(@yfb String str) {
        md8.checkNotNullParameter(str, "nestedName");
        String strM25288d = m25288d();
        if (strM25288d == null) {
            strM25288d = "";
        }
        return mo11320g(strM25288d, str);
    }
}
