package com.draggable.library.extension;

import android.content.Context;
import android.view.View;
import com.draggable.library.core.DraggableParamsInfo;
import com.draggable.library.extension.entities.DraggableImageInfo;
import java.util.ArrayList;
import java.util.List;
import p000.gib;
import p000.jt3;
import p000.k82;
import p000.l82;
import p000.md8;
import p000.yfb;

/* JADX INFO: loaded from: classes4.dex */
public final class ImageViewerHelper {
    public static final ImageViewerHelper INSTANCE = new ImageViewerHelper();
    private static final String TAG = ImageViewerHelper.class.getSimpleName();

    public static final class ImageInfo {
        private final long imgSize;

        @yfb
        private final String originUrl;

        @yfb
        private final String thumbnailUrl;

        public ImageInfo(@yfb String str, @yfb String str2, long j) {
            md8.checkParameterIsNotNull(str, "thumbnailUrl");
            md8.checkParameterIsNotNull(str2, "originUrl");
            this.thumbnailUrl = str;
            this.originUrl = str2;
            this.imgSize = j;
        }

        public final long getImgSize() {
            return this.imgSize;
        }

        @yfb
        public final String getOriginUrl() {
            return this.originUrl;
        }

        @yfb
        public final String getThumbnailUrl() {
            return this.thumbnailUrl;
        }

        public /* synthetic */ ImageInfo(String str, String str2, long j, int i, jt3 jt3Var) {
            this(str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? 0L : j);
        }
    }

    private ImageViewerHelper() {
    }

    private final DraggableImageInfo createImageDraggableParamsWithWHRadio(View view, String str, String str2, long j, boolean z) {
        DraggableImageInfo draggableImageInfo;
        if (view != null) {
            int[] iArr = new int[2];
            view.getLocationInWindow(iArr);
            draggableImageInfo = new DraggableImageInfo(str, str2, new DraggableParamsInfo(iArr[0], iArr[1], view.getWidth(), view.getHeight(), 0.0f, 16, null), j, z);
        } else {
            draggableImageInfo = new DraggableImageInfo(str, str2, null, j, z, 4, null);
        }
        draggableImageInfo.adjustImageUrl();
        return draggableImageInfo;
    }

    public static /* synthetic */ DraggableImageInfo createImageDraggableParamsWithWHRadio$default(ImageViewerHelper imageViewerHelper, View view, String str, String str2, long j, boolean z, int i, Object obj) {
        if ((i & 8) != 0) {
            j = 0;
        }
        long j2 = j;
        if ((i & 16) != 0) {
            z = true;
        }
        return imageViewerHelper.createImageDraggableParamsWithWHRadio(view, str, str2, j2, z);
    }

    public static /* synthetic */ void showImages$default(ImageViewerHelper imageViewerHelper, Context context, List list, int i, boolean z, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = 0;
        }
        if ((i2 & 8) != 0) {
            z = true;
        }
        imageViewerHelper.showImages(context, list, i, z);
    }

    public static /* synthetic */ void showImagesWithSingleView$default(ImageViewerHelper imageViewerHelper, Context context, View view, List list, int i, boolean z, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            i = 0;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            z = true;
        }
        imageViewerHelper.showImagesWithSingleView(context, view, list, i3, z);
    }

    public static /* synthetic */ void showSimpleImage$default(ImageViewerHelper imageViewerHelper, Context context, String str, String str2, View view, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            str2 = "";
        }
        String str3 = str2;
        if ((i & 8) != 0) {
            view = null;
        }
        View view2 = view;
        if ((i & 16) != 0) {
            z = true;
        }
        imageViewerHelper.showSimpleImage(context, str, str3, view2, z);
    }

    public final void showImages(@yfb Context context, @yfb List<String> list, int i, boolean z) {
        md8.checkParameterIsNotNull(context, "context");
        md8.checkParameterIsNotNull(list, "images");
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            arrayList.add(new ImageInfo(str, str, 0L, 4, null));
        }
        showImagesWithSingleView(context, null, arrayList, i, z);
    }

    public final void showImagesWithSingleView(@yfb Context context, @gib View view, @yfb List<ImageInfo> list, int i, boolean z) {
        md8.checkParameterIsNotNull(context, "context");
        md8.checkParameterIsNotNull(list, "imgInfos");
        if (list.isEmpty()) {
            return;
        }
        ArrayList<DraggableImageInfo> arrayList = new ArrayList<>();
        int i2 = 0;
        for (Object obj : list) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                l82.throwIndexOverflow();
            }
            ImageInfo imageInfo = (ImageInfo) obj;
            if (view == null || i2 != i) {
                arrayList.add(INSTANCE.createImageDraggableParamsWithWHRadio(null, imageInfo.getOriginUrl(), imageInfo.getThumbnailUrl(), imageInfo.getImgSize(), z));
            } else {
                arrayList.add(INSTANCE.createImageDraggableParamsWithWHRadio(view, imageInfo.getOriginUrl(), imageInfo.getThumbnailUrl(), imageInfo.getImgSize(), z));
            }
            i2 = i3;
        }
        ImagesViewerActivity.Companion.start(context, arrayList, i);
    }

    public final void showSimpleImage(@yfb Context context, @yfb String str, @yfb String str2, @gib View view, boolean z) {
        md8.checkParameterIsNotNull(context, "context");
        md8.checkParameterIsNotNull(str, "url");
        md8.checkParameterIsNotNull(str2, "thumbUrl");
        showImages$default(this, context, view == null ? null : k82.listOf(view), k82.listOf(new ImageInfo(str2, str, 0L, 4, null)), 0, z, 8, null);
    }

    public static /* synthetic */ void showImages$default(ImageViewerHelper imageViewerHelper, Context context, List list, List list2, int i, boolean z, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            i = 0;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            z = true;
        }
        imageViewerHelper.showImages(context, list, list2, i3, z);
    }

    public static /* synthetic */ void showSimpleImage$default(ImageViewerHelper imageViewerHelper, Context context, ImageInfo imageInfo, View view, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            view = null;
        }
        if ((i & 8) != 0) {
            z = true;
        }
        imageViewerHelper.showSimpleImage(context, imageInfo, view, z);
    }

    public final void showSimpleImage(@yfb Context context, @yfb ImageInfo imageInfo, @gib View view, boolean z) {
        md8.checkParameterIsNotNull(context, "context");
        md8.checkParameterIsNotNull(imageInfo, "imgInfo");
        showImages$default(this, context, view == null ? null : k82.listOf(view), k82.listOf(imageInfo), 0, z, 8, null);
    }

    public final void showImages(@yfb Context context, @gib List<? extends View> list, @yfb List<ImageInfo> list2, int i, boolean z) {
        md8.checkParameterIsNotNull(context, "context");
        md8.checkParameterIsNotNull(list2, "imgInfos");
        if (list2.isEmpty()) {
            return;
        }
        ArrayList<DraggableImageInfo> arrayList = new ArrayList<>();
        int i2 = 0;
        for (Object obj : list2) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                l82.throwIndexOverflow();
            }
            ImageInfo imageInfo = (ImageInfo) obj;
            if (list != null && i2 < list.size()) {
                arrayList.add(INSTANCE.createImageDraggableParamsWithWHRadio(list.get(i2), imageInfo.getOriginUrl(), imageInfo.getThumbnailUrl(), imageInfo.getImgSize(), z));
            } else {
                arrayList.add(INSTANCE.createImageDraggableParamsWithWHRadio(null, imageInfo.getOriginUrl(), imageInfo.getThumbnailUrl(), imageInfo.getImgSize(), z));
            }
            i2 = i3;
        }
        ImagesViewerActivity.Companion.start(context, arrayList, i);
    }
}
