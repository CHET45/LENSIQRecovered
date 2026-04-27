package p000;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nFilePathComponents.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FilePathComponents.kt\nkotlin/io/FilesKt__FilePathComponentsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,149:1\n1557#2:150\n1628#2,3:151\n*S KotlinDebug\n*F\n+ 1 FilePathComponents.kt\nkotlin/io/FilesKt__FilePathComponentsKt\n*L\n134#1:150\n134#1:151,3\n*E\n"})
public class hu5 {
    @yfb
    public static final File getRoot(@yfb File file) {
        md8.checkNotNullParameter(file, "<this>");
        return new File(getRootName(file));
    }

    private static final int getRootLength$FilesKt__FilePathComponentsKt(String str) {
        int iIndexOf$default;
        char c = File.separatorChar;
        int iIndexOf$default2 = m9g.indexOf$default((CharSequence) str, c, 0, false, 4, (Object) null);
        if (iIndexOf$default2 == 0) {
            if (str.length() <= 1 || str.charAt(1) != c || (iIndexOf$default = m9g.indexOf$default((CharSequence) str, c, 2, false, 4, (Object) null)) < 0) {
                return 1;
            }
            int iIndexOf$default3 = m9g.indexOf$default((CharSequence) str, c, iIndexOf$default + 1, false, 4, (Object) null);
            return iIndexOf$default3 >= 0 ? iIndexOf$default3 + 1 : str.length();
        }
        if (iIndexOf$default2 > 0 && str.charAt(iIndexOf$default2 - 1) == ':') {
            return iIndexOf$default2 + 1;
        }
        if (iIndexOf$default2 == -1 && m9g.endsWith$default((CharSequence) str, ':', false, 2, (Object) null)) {
            return str.length();
        }
        return 0;
    }

    @yfb
    public static final String getRootName(@yfb File file) {
        md8.checkNotNullParameter(file, "<this>");
        String path = file.getPath();
        md8.checkNotNullExpressionValue(path, "getPath(...)");
        String path2 = file.getPath();
        md8.checkNotNullExpressionValue(path2, "getPath(...)");
        String strSubstring = path.substring(0, getRootLength$FilesKt__FilePathComponentsKt(path2));
        md8.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final boolean isRooted(@yfb File file) {
        md8.checkNotNullParameter(file, "<this>");
        String path = file.getPath();
        md8.checkNotNullExpressionValue(path, "getPath(...)");
        return getRootLength$FilesKt__FilePathComponentsKt(path) > 0;
    }

    @yfb
    public static final File subPath(@yfb File file, int i, int i2) {
        md8.checkNotNullParameter(file, "<this>");
        return toComponents(file).subPath(i, i2);
    }

    @yfb
    public static final bt5 toComponents(@yfb File file) {
        List listEmptyList;
        md8.checkNotNullParameter(file, "<this>");
        String path = file.getPath();
        md8.checkNotNull(path);
        int rootLength$FilesKt__FilePathComponentsKt = getRootLength$FilesKt__FilePathComponentsKt(path);
        String strSubstring = path.substring(0, rootLength$FilesKt__FilePathComponentsKt);
        md8.checkNotNullExpressionValue(strSubstring, "substring(...)");
        String strSubstring2 = path.substring(rootLength$FilesKt__FilePathComponentsKt);
        md8.checkNotNullExpressionValue(strSubstring2, "substring(...)");
        if (strSubstring2.length() == 0) {
            listEmptyList = l82.emptyList();
        } else {
            List listSplit$default = m9g.split$default((CharSequence) strSubstring2, new char[]{File.separatorChar}, false, 0, 6, (Object) null);
            ArrayList arrayList = new ArrayList(m82.collectionSizeOrDefault(listSplit$default, 10));
            Iterator it = listSplit$default.iterator();
            while (it.hasNext()) {
                arrayList.add(new File((String) it.next()));
            }
            listEmptyList = arrayList;
        }
        return new bt5(new File(strSubstring), listEmptyList);
    }
}
