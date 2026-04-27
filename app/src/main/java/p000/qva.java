package p000;

import androidx.media3.common.C1213a;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class qva {
    private qva() {
    }

    public static String getContainerMimeType(C1213a c1213a) {
        String str = c1213a.f8291o;
        return rva.isVideo(str) ? "video/mp4" : rva.isAudio(str) ? "audio/mp4" : rva.isImage(str) ? Objects.equals(str, "image/heic") ? "image/heif" : Objects.equals(str, rva.f79809a1) ? rva.f79809a1 : "application/mp4" : "application/mp4";
    }

    public static String getContainerMimeType(List<t6h> list) {
        Iterator<t6h> it = list.iterator();
        boolean z = false;
        String str = null;
        while (it.hasNext()) {
            String str2 = it.next().f83873a.f100448g.f8291o;
            if (rva.isVideo(str2)) {
                return "video/mp4";
            }
            if (rva.isAudio(str2)) {
                z = true;
            } else if (rva.isImage(str2)) {
                if (Objects.equals(str2, "image/heic")) {
                    str = "image/heif";
                } else if (Objects.equals(str2, rva.f79809a1)) {
                    str = rva.f79809a1;
                }
            }
        }
        if (z) {
            return "audio/mp4";
        }
        return str != null ? str : "application/mp4";
    }
}
