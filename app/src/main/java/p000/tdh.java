package p000;

import android.content.ClipData;
import android.content.ClipDescription;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nTransferableContent.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransferableContent.android.kt\nandroidx/compose/foundation/content/TransferableContent_androidKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,139:1\n1#2:140\n*E\n"})
public final class tdh {
    @gib
    @ah5
    public static final sdh consume(@yfb sdh sdhVar, @yfb qy6<? super ClipData.Item, Boolean> qy6Var) {
        ClipData clipData = sdhVar.getClipEntry().getClipData();
        if (clipData.getItemCount() == 1) {
            if (qy6Var.invoke(clipData.getItemAt(0)).booleanValue()) {
                return null;
            }
            return sdhVar;
        }
        int itemCount = clipData.getItemCount();
        ArrayList arrayList = null;
        for (int i = 0; i < itemCount; i++) {
            ClipData.Item itemAt = clipData.getItemAt(i);
            if (!qy6Var.invoke(itemAt).booleanValue()) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(itemAt);
            }
        }
        if (arrayList == null || arrayList.isEmpty()) {
            return null;
        }
        if (arrayList.size() == clipData.getItemCount()) {
            return sdhVar;
        }
        ClipDescription clipDescription = new ClipDescription(sdhVar.getClipMetadata().getClipDescription());
        ClipData clipData2 = new ClipData(clipDescription, (ClipData.Item) v82.first((List) arrayList));
        int size = arrayList.size();
        for (int i2 = 1; i2 < size; i2++) {
            clipData2.addItem((ClipData.Item) arrayList.get(i2));
        }
        return new sdh(C7562iq.toClipEntry(clipData2), C7562iq.toClipMetadata(clipDescription), sdhVar.m32299getSourcekB6V9T0(), sdhVar.getPlatformTransferableContent(), null);
    }

    @ah5
    public static final boolean hasMediaType(@yfb sdh sdhVar, @yfb xpa xpaVar) {
        return sdhVar.getClipMetadata().getClipDescription().hasMimeType(xpaVar.getRepresentation());
    }

    @gib
    public static final String readPlainText(@yfb u42 u42Var) {
        int itemCount = u42Var.getClipData().getItemCount();
        boolean z = false;
        for (int i = 0; i < itemCount; i++) {
            z = z || u42Var.getClipData().getItemAt(i).getText() != null;
        }
        if (!z) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        int itemCount2 = u42Var.getClipData().getItemCount();
        boolean z2 = false;
        for (int i2 = 0; i2 < itemCount2; i2++) {
            CharSequence text = u42Var.getClipData().getItemAt(i2).getText();
            if (text != null) {
                if (z2) {
                    sb.append("\n");
                }
                sb.append(text);
                z2 = true;
            }
        }
        String string = sb.toString();
        md8.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
