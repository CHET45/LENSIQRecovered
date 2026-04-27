package com.eyevue.common.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.eyevue.common.C2531R;
import p000.efb;
import p000.hib;

/* JADX INFO: loaded from: classes4.dex */
public class CustomRecyclerView extends RecyclerView {

    /* JADX INFO: renamed from: a */
    public final Context f17939a;

    /* JADX INFO: renamed from: b */
    public RecyclerView.ItemDecoration f17940b;

    /* JADX INFO: renamed from: c */
    public boolean f17941c;

    /* JADX INFO: renamed from: d */
    public int f17942d;

    /* JADX INFO: renamed from: e */
    public int f17943e;

    /* JADX INFO: renamed from: f */
    public int f17944f;

    /* JADX INFO: renamed from: com.eyevue.common.widget.CustomRecyclerView$a */
    public class C2534a extends RecyclerView.ItemDecoration {
        public C2534a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void getItemOffsets(@efb Rect outRect, @efb View view, @efb RecyclerView parent, @efb RecyclerView.State state) {
            int childAdapterPosition = parent.getChildAdapterPosition(view);
            int itemCount = parent.getAdapter() != null ? parent.getAdapter().getItemCount() : 0;
            if (childAdapterPosition == 0) {
                outRect.left = CustomRecyclerView.this.f17942d;
                outRect.right = CustomRecyclerView.this.f17944f;
            } else if (childAdapterPosition == itemCount - 1) {
                outRect.right = CustomRecyclerView.this.f17943e;
            } else {
                outRect.right = CustomRecyclerView.this.f17944f;
            }
        }
    }

    public CustomRecyclerView(@efb Context context) {
        super(context);
        this.f17941c = false;
        this.f17939a = context;
    }

    private void addDecoration() {
        if (this.f17940b == null) {
            this.f17940b = new C2534a();
        }
        if (this.f17941c) {
            return;
        }
        addItemDecoration(this.f17940b);
        this.f17941c = true;
    }

    private void init() {
        Context context = this.f17939a;
        if (context != null) {
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context);
            linearLayoutManager.setOrientation(0);
            setLayoutManager(linearLayoutManager);
        }
    }

    private void initAttributeSet(AttributeSet attrs) {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attrs, C2531R.styleable.CustomRecyclerView);
        this.f17942d = (int) typedArrayObtainStyledAttributes.getDimension(C2531R.styleable.CustomRecyclerView_custom_first_margin_left, 0.0f);
        this.f17943e = (int) typedArrayObtainStyledAttributes.getDimension(C2531R.styleable.CustomRecyclerView_custom_last_margin_right, 0.0f);
        this.f17944f = (int) typedArrayObtainStyledAttributes.getDimension(C2531R.styleable.CustomRecyclerView_custom_item_margin, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
        init();
    }

    public int getFirstMarginLeft() {
        return this.f17942d;
    }

    public int getItemMargin() {
        return this.f17944f;
    }

    public int getLastMarginRight() {
        return this.f17943e;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setAdapter(@hib RecyclerView.Adapter adapter) {
        super.setAdapter(adapter);
        addDecoration();
    }

    public void setAdapter(@hib RecyclerView.Adapter adapter, RecyclerView.ItemDecoration itemDecoration) {
        super.setAdapter(adapter);
        this.f17940b = itemDecoration;
        addDecoration();
    }

    public CustomRecyclerView(@efb Context context, @hib AttributeSet attrs) {
        super(context, attrs);
        this.f17941c = false;
        this.f17939a = context;
        initAttributeSet(attrs);
    }

    public CustomRecyclerView(@efb Context context, @hib AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f17941c = false;
        this.f17939a = context;
        initAttributeSet(attrs);
    }
}
