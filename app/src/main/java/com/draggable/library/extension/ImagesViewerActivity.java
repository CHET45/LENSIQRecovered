package com.draggable.library.extension;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.draggable.library.extension.entities.DraggableImageInfo;
import com.draggable.library.extension.view.DraggableImageGalleryViewer;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import p000.fx8;
import p000.gib;
import p000.hp8;
import p000.hz8;
import p000.jt3;
import p000.md8;
import p000.ogd;
import p000.vvd;
import p000.yfb;

/* JADX INFO: loaded from: classes4.dex */
public final class ImagesViewerActivity extends AppCompatActivity {
    static final /* synthetic */ hp8[] $$delegatedProperties = {vvd.property1(new ogd(vvd.getOrCreateKotlinClass(ImagesViewerActivity.class), "galleryViewer", "getGalleryViewer()Lcom/draggable/library/extension/view/DraggableImageGalleryViewer;"))};
    public static final Companion Companion = new Companion(null);
    private static final String INDEX = "index";
    private static final String PARAMS = "draggableImages";
    private HashMap _$_findViewCache;
    private final fx8 galleryViewer$delegate = hz8.lazy(new ImagesViewerActivity$galleryViewer$2(this));

    public static final class Companion {
        private Companion() {
        }

        public static /* synthetic */ void start$default(Companion companion, Context context, ArrayList arrayList, int i, int i2, Object obj) {
            if ((i2 & 4) != 0) {
                i = 0;
            }
            companion.start(context, arrayList, i);
        }

        public final void start(@yfb Context context, @yfb ArrayList<DraggableImageInfo> arrayList, int i) {
            md8.checkParameterIsNotNull(context, "context");
            md8.checkParameterIsNotNull(arrayList, ImagesViewerActivity.PARAMS);
            Intent intent = new Intent(context, (Class<?>) ImagesViewerActivity.class);
            intent.putExtra(ImagesViewerActivity.PARAMS, arrayList);
            intent.putExtra("index", i);
            context.startActivity(intent);
            if (context instanceof Activity) {
                ((Activity) context).overridePendingTransition(0, 0);
            }
        }

        public /* synthetic */ Companion(jt3 jt3Var) {
            this();
        }
    }

    private final DraggableImageGalleryViewer getGalleryViewer() {
        fx8 fx8Var = this.galleryViewer$delegate;
        hp8 hp8Var = $$delegatedProperties[0];
        return (DraggableImageGalleryViewer) fx8Var.getValue();
    }

    public void _$_clearFindViewByIdCache() {
        HashMap map = this._$_findViewCache;
        if (map != null) {
            map.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        if (this._$_findViewCache == null) {
            this._$_findViewCache = new HashMap();
        }
        View view = (View) this._$_findViewCache.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(i);
        this._$_findViewCache.put(Integer.valueOf(i), viewFindViewById);
        return viewFindViewById;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (getGalleryViewer().closeWithAnimator()) {
            return;
        }
        super.onBackPressed();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@gib Bundle bundle) {
        super.onCreate(bundle);
        Utils.INSTANCE.transparentStatusBar(this);
        setContentView(getGalleryViewer());
        Serializable serializableExtra = getIntent().getSerializableExtra(PARAMS);
        if (!(serializableExtra instanceof ArrayList)) {
            serializableExtra = null;
        }
        ArrayList arrayList = (ArrayList) serializableExtra;
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        int intExtra = getIntent().getIntExtra("index", 0);
        if (arrayList.isEmpty()) {
            return;
        }
        getGalleryViewer().showImagesWithAnimator(arrayList, intExtra);
    }
}
