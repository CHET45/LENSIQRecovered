package p000;

/* JADX INFO: loaded from: classes7.dex */
@nb8
public abstract class g9b extends wlg<String> {
    @yfb
    /* JADX INFO: renamed from: j */
    public String mo9627j(@yfb String str, @yfb String str2) {
        md8.checkNotNullParameter(str, "parentName");
        md8.checkNotNullParameter(str2, "childName");
        if (str.length() == 0) {
            return str2;
        }
        return str + a18.f100c + str2;
    }

    @yfb
    /* JADX INFO: renamed from: k */
    public String mo11444k(@yfb f0f f0fVar, int i) {
        md8.checkNotNullParameter(f0fVar, "descriptor");
        return f0fVar.getElementName(i);
    }

    @Override // p000.wlg
    @yfb
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public final String getTag(@yfb f0f f0fVar, int i) {
        md8.checkNotNullParameter(f0fVar, "<this>");
        return m11446m(mo11444k(f0fVar, i));
    }

    @yfb
    /* JADX INFO: renamed from: m */
    public final String m11446m(@yfb String str) {
        md8.checkNotNullParameter(str, "nestedName");
        String strM24660g = m24660g();
        if (strM24660g == null) {
            strM24660g = "";
        }
        return mo9627j(strM24660g, str);
    }

    @yfb
    /* JADX INFO: renamed from: n */
    public final String m11447n() {
        return getTagStack$kotlinx_serialization_core().isEmpty() ? "$" : v82.joinToString$default(getTagStack$kotlinx_serialization_core(), ".", "$.", null, 0, null, null, 60, null);
    }
}
