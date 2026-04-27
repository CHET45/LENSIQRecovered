package com.draggable.library.extension;

import android.view.ViewGroup;
import com.draggable.library.extension.view.DraggableImageGalleryViewer;
import p000.ny6;
import p000.tt8;
import p000.yfb;

/* JADX INFO: loaded from: classes4.dex */
public final class ImagesViewerActivity$galleryViewer$2 extends tt8 implements ny6<DraggableImageGalleryViewer> {
    final /* synthetic */ ImagesViewerActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImagesViewerActivity$galleryViewer$2(ImagesViewerActivity imagesViewerActivity) {
        super(0);
        this.this$0 = imagesViewerActivity;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // p000.ny6
    @yfb
    public final DraggableImageGalleryViewer invoke() {
        DraggableImageGalleryViewer draggableImageGalleryViewer = new DraggableImageGalleryViewer(this.this$0);
        draggableImageGalleryViewer.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        draggableImageGalleryViewer.setActionListener(new DraggableImageGalleryViewer.ActionListener() { // from class: com.draggable.library.extension.ImagesViewerActivity$galleryViewer$2$$special$$inlined$apply$lambda$1
            @Override // com.draggable.library.extension.view.DraggableImageGalleryViewer.ActionListener
            public void closeViewer() {
                this.this$0.this$0.finish();
                this.this$0.this$0.overridePendingTransition(0, 0);
            }
        });
        return draggableImageGalleryViewer;
    }
}
