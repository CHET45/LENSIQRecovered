package p000;

import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.util.Arrays;

/* JADX INFO: loaded from: classes7.dex */
@mh5
public final class mt3 implements c03 {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final mt3 f62065a = new mt3();

    private mt3() {
    }

    @Override // p000.c03
    @yfb
    public d03 copyToIgnoringExistingDirectory(@yfb Path path, @yfb Path path2, boolean z) {
        md8.checkNotNullParameter(path, "<this>");
        md8.checkNotNullParameter(path2, "target");
        LinkOption[] linkOptions = c79.f15902a.toLinkOptions(z);
        LinkOption[] linkOptionArr = (LinkOption[]) Arrays.copyOf(linkOptions, linkOptions.length);
        if (Files.isDirectory(path, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length)) && Files.isDirectory(path2, (LinkOption[]) Arrays.copyOf(new LinkOption[]{LinkOption.NOFOLLOW_LINKS}, 1))) {
            bth bthVar = bth.f14751a;
        } else {
            CopyOption[] copyOptionArr = (CopyOption[]) Arrays.copyOf(linkOptions, linkOptions.length);
            md8.checkNotNullExpressionValue(Files.copy(path, path2, (CopyOption[]) Arrays.copyOf(copyOptionArr, copyOptionArr.length)), "copy(...)");
        }
        return d03.f28127a;
    }
}
