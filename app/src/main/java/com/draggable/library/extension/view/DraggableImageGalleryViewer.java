package com.draggable.library.extension.view;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import com.draggable.library.core.DraggableImageView;
import com.draggable.library.extension.entities.DraggableImageInfo;
import com.draggable.library.extension.glide.GlideHelper;
import com.draggable.library.extension.view.DraggableImageGalleryViewer;
import com.drawable.library.C2530R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p000.ebc;
import p000.gib;
import p000.md8;
import p000.yfb;

/* JADX INFO: loaded from: classes4.dex */
public final class DraggableImageGalleryViewer extends FrameLayout {
    private final String TAG;
    private final String TAG_PREGIX;
    private HashMap _$_findViewCache;

    @gib
    private ActionListener actionListener;
    private final ArrayList<DraggableImageInfo> mImageList;
    private boolean showWithAnimator;
    private final ArrayList<DraggableImageView> vpContentViewList;

    public interface ActionListener {
        void closeViewer();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DraggableImageGalleryViewer(@yfb final Context context) {
        super(context);
        md8.checkParameterIsNotNull(context, "context");
        this.TAG = DraggableImageGalleryViewer.class.getSimpleName();
        this.TAG_PREGIX = "DraggableImageGalleryViewer_";
        this.mImageList = new ArrayList<>();
        this.showWithAnimator = true;
        LayoutInflater.from(context).inflate(C2530R.layout.view_image_viewr, this);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        setBackground(new ColorDrawable(0));
        initAdapter();
        ((ImageView) _$_findCachedViewById(C2530R.id.mImageGalleryViewOriginDownloadImg)).setOnClickListener(new View.OnClickListener() { // from class: com.draggable.library.extension.view.DraggableImageGalleryViewer.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ArrayList arrayList = DraggableImageGalleryViewer.this.mImageList;
                HackyViewPager hackyViewPager = (HackyViewPager) DraggableImageGalleryViewer.this._$_findCachedViewById(C2530R.id.mImageViewerViewPage);
                md8.checkExpressionValueIsNotNull(hackyViewPager, "mImageViewerViewPage");
                Object obj = arrayList.get(hackyViewPager.getCurrentItem());
                md8.checkExpressionValueIsNotNull(obj, "mImageList[mImageViewerViewPage.currentItem]");
                GlideHelper.INSTANCE.downloadPicture(context, ((DraggableImageInfo) obj).getOriginImg());
            }
        });
        this.vpContentViewList = new ArrayList<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DraggableImageView getImageViewFromCacheContainer() {
        DraggableImageView draggableImageView = null;
        if (!this.vpContentViewList.isEmpty()) {
            for (DraggableImageView draggableImageView2 : this.vpContentViewList) {
                if (draggableImageView2.getParent() == null) {
                    draggableImageView = draggableImageView2;
                }
            }
        }
        if (draggableImageView != null) {
            return draggableImageView;
        }
        Context context = getContext();
        md8.checkExpressionValueIsNotNull(context, "context");
        DraggableImageView draggableImageView3 = new DraggableImageView(context);
        draggableImageView3.setActionListener(new DraggableImageView.ActionListener() { // from class: com.draggable.library.extension.view.DraggableImageGalleryViewer$getImageViewFromCacheContainer$$inlined$apply$lambda$1
            @Override // com.draggable.library.core.DraggableImageView.ActionListener
            public void onExit() {
                DraggableImageGalleryViewer.ActionListener actionListener = this.this$0.getActionListener();
                if (actionListener != null) {
                    actionListener.closeViewer();
                }
            }
        });
        this.vpContentViewList.add(draggableImageView3);
        return draggableImageView3;
    }

    private final void initAdapter() {
        HackyViewPager hackyViewPager = (HackyViewPager) _$_findCachedViewById(C2530R.id.mImageViewerViewPage);
        md8.checkExpressionValueIsNotNull(hackyViewPager, "mImageViewerViewPage");
        hackyViewPager.setAdapter(new ebc() { // from class: com.draggable.library.extension.view.DraggableImageGalleryViewer.initAdapter.1
            @Override // p000.ebc
            public void destroyItem(@yfb ViewGroup viewGroup, int i, @yfb Object obj) {
                md8.checkParameterIsNotNull(viewGroup, "container");
                md8.checkParameterIsNotNull(obj, "any");
                viewGroup.removeView((View) obj);
            }

            @Override // p000.ebc
            public int getCount() {
                return DraggableImageGalleryViewer.this.mImageList.size();
            }

            @Override // p000.ebc
            public boolean isViewFromObject(@yfb View view, @yfb Object obj) {
                md8.checkParameterIsNotNull(view, "view");
                md8.checkParameterIsNotNull(obj, "any");
                return md8.areEqual(view, obj);
            }

            @Override // p000.ebc
            @yfb
            public DraggableImageView instantiateItem(@yfb ViewGroup viewGroup, int i) {
                md8.checkParameterIsNotNull(viewGroup, "container");
                Object obj = DraggableImageGalleryViewer.this.mImageList.get(i);
                md8.checkExpressionValueIsNotNull(obj, "mImageList[position]");
                DraggableImageInfo draggableImageInfo = (DraggableImageInfo) obj;
                DraggableImageView imageViewFromCacheContainer = DraggableImageGalleryViewer.this.getImageViewFromCacheContainer();
                viewGroup.addView(imageViewFromCacheContainer, new FrameLayout.LayoutParams(-1, -1));
                if (DraggableImageGalleryViewer.this.showWithAnimator) {
                    DraggableImageGalleryViewer.this.showWithAnimator = false;
                    imageViewFromCacheContainer.showImageWithAnimator(draggableImageInfo);
                } else {
                    imageViewFromCacheContainer.showImage(draggableImageInfo);
                }
                imageViewFromCacheContainer.setTag(DraggableImageGalleryViewer.this.TAG_PREGIX + i);
                ImageView imageView = (ImageView) DraggableImageGalleryViewer.this._$_findCachedViewById(C2530R.id.mImageGalleryViewOriginDownloadImg);
                md8.checkExpressionValueIsNotNull(imageView, "mImageGalleryViewOriginDownloadImg");
                imageView.setVisibility(draggableImageInfo.getImageCanDown() ? 0 : 8);
                return imageViewFromCacheContainer;
            }
        });
        ((HackyViewPager) _$_findCachedViewById(C2530R.id.mImageViewerViewPage)).addOnPageChangeListener(new ViewPager.InterfaceC1487j() { // from class: com.draggable.library.extension.view.DraggableImageGalleryViewer.initAdapter.2
            @Override // androidx.viewpager.widget.ViewPager.InterfaceC1487j
            public void onPageScrollStateChanged(int i) {
            }

            @Override // androidx.viewpager.widget.ViewPager.InterfaceC1487j
            public void onPageScrolled(int i, float f, int i2) {
            }

            @Override // androidx.viewpager.widget.ViewPager.InterfaceC1487j
            public void onPageSelected(int i) {
                DraggableImageGalleryViewer.this.setCurrentImgIndex(i);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setCurrentImgIndex(int i) {
        ((HackyViewPager) _$_findCachedViewById(C2530R.id.mImageViewerViewPage)).setCurrentItem(i, false);
        TextView textView = (TextView) _$_findCachedViewById(C2530R.id.mImageViewerTvIndicator);
        md8.checkExpressionValueIsNotNull(textView, "mImageViewerTvIndicator");
        StringBuilder sb = new StringBuilder();
        sb.append(i + 1);
        sb.append('/');
        sb.append(this.mImageList.size());
        textView.setText(sb.toString());
    }

    public static /* synthetic */ void showImagesWithAnimator$default(DraggableImageGalleryViewer draggableImageGalleryViewer, List list, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        draggableImageGalleryViewer.showImagesWithAnimator(list, i);
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

    public final boolean closeWithAnimator() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.TAG_PREGIX);
        HackyViewPager hackyViewPager = (HackyViewPager) _$_findCachedViewById(C2530R.id.mImageViewerViewPage);
        md8.checkExpressionValueIsNotNull(hackyViewPager, "mImageViewerViewPage");
        sb.append(hackyViewPager.getCurrentItem());
        DraggableImageView draggableImageView = (DraggableImageView) findViewWithTag(sb.toString());
        ArrayList<DraggableImageInfo> arrayList = this.mImageList;
        HackyViewPager hackyViewPager2 = (HackyViewPager) _$_findCachedViewById(C2530R.id.mImageViewerViewPage);
        md8.checkExpressionValueIsNotNull(hackyViewPager2, "mImageViewerViewPage");
        DraggableImageInfo draggableImageInfo = arrayList.get(hackyViewPager2.getCurrentItem());
        md8.checkExpressionValueIsNotNull(draggableImageInfo, "mImageList[mImageViewerViewPage.currentItem]");
        if (draggableImageInfo.getDraggableInfo().isValid()) {
            if (draggableImageView == null) {
                return true;
            }
            draggableImageView.closeWithAnimator();
            return true;
        }
        ActionListener actionListener = this.actionListener;
        if (actionListener == null) {
            return true;
        }
        actionListener.closeViewer();
        return true;
    }

    @gib
    public final ActionListener getActionListener() {
        return this.actionListener;
    }

    public final void setActionListener(@gib ActionListener actionListener) {
        this.actionListener = actionListener;
    }

    public final void showImagesWithAnimator(@yfb List<DraggableImageInfo> list, int i) {
        md8.checkParameterIsNotNull(list, "imageList");
        this.mImageList.clear();
        this.mImageList.addAll(list);
        HackyViewPager hackyViewPager = (HackyViewPager) _$_findCachedViewById(C2530R.id.mImageViewerViewPage);
        md8.checkExpressionValueIsNotNull(hackyViewPager, "mImageViewerViewPage");
        ebc adapter = hackyViewPager.getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
        setCurrentImgIndex(i);
    }
}
