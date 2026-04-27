package com.eyevue.common.widget.bottomnav;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.viewpager.widget.ViewPager;
import com.eyevue.common.C2531R;
import java.util.ArrayList;
import java.util.List;
import p000.ebc;

/* JADX INFO: loaded from: classes4.dex */
public class BottomBarLayout extends LinearLayout implements ViewPager.InterfaceC1487j {

    /* JADX INFO: renamed from: a */
    public ViewPager f18097a;

    /* JADX INFO: renamed from: b */
    public final List<BottomBarItem> f18098b;

    /* JADX INFO: renamed from: c */
    public int f18099c;

    /* JADX INFO: renamed from: d */
    public boolean f18100d;

    /* JADX INFO: renamed from: e */
    public InterfaceC2545b f18101e;

    /* JADX INFO: renamed from: com.eyevue.common.widget.bottomnav.BottomBarLayout$a */
    public class ViewOnClickListenerC2544a implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final int f18102a;

        public ViewOnClickListenerC2544a(int i) {
            this.f18102a = i;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            if (BottomBarLayout.this.f18097a == null) {
                if (BottomBarLayout.this.f18101e != null) {
                    BottomBarLayout.this.f18101e.onItemSelected(BottomBarLayout.this.getBottomItem(this.f18102a), BottomBarLayout.this.f18099c, this.f18102a);
                }
                BottomBarLayout.this.updateTabState(this.f18102a);
            } else if (this.f18102a != BottomBarLayout.this.f18099c) {
                BottomBarLayout.this.f18097a.setCurrentItem(this.f18102a, BottomBarLayout.this.f18100d);
            } else if (BottomBarLayout.this.f18101e != null) {
                BottomBarLayout.this.f18101e.onItemSelected(BottomBarLayout.this.getBottomItem(this.f18102a), BottomBarLayout.this.f18099c, this.f18102a);
            }
        }
    }

    /* JADX INFO: renamed from: com.eyevue.common.widget.bottomnav.BottomBarLayout$b */
    public interface InterfaceC2545b {
        void onItemSelected(BottomBarItem bottomBarItem, int previousPosition, int currentPosition);
    }

    public BottomBarLayout(Context context) {
        this(context, null);
    }

    private void init() {
        this.f18098b.clear();
        int childCount = getChildCount();
        if (childCount == 0) {
            return;
        }
        for (int i = 0; i < childCount; i++) {
            if (!(getChildAt(i) instanceof BottomBarItem)) {
                throw new IllegalArgumentException("BottomBarLayout的子View必须是BottomBarItem");
            }
            BottomBarItem bottomBarItem = (BottomBarItem) getChildAt(i);
            this.f18098b.add(bottomBarItem);
            bottomBarItem.setOnClickListener(new ViewOnClickListenerC2544a(i));
        }
        if (this.f18099c < this.f18098b.size()) {
            this.f18098b.get(this.f18099c).refreshTab(true);
        }
    }

    private void resetState() {
        if (this.f18099c >= this.f18098b.size() || !this.f18098b.get(this.f18099c).isSelected()) {
            return;
        }
        this.f18098b.get(this.f18099c).refreshTab(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateTabState(int position) {
        resetState();
        this.f18099c = position;
        this.f18098b.get(position).refreshTab(true);
    }

    public void addItem(BottomBarItem item) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.weight = 1.0f;
        item.setLayoutParams(layoutParams);
        addView(item);
        init();
    }

    public BottomBarItem getBottomItem(int position) {
        return this.f18098b.get(position);
    }

    public int getCurrentItem() {
        return this.f18099c;
    }

    public void hideMsg(int position) {
        this.f18098b.get(position).hideMsg();
    }

    public void hideNotify(int position) {
        this.f18098b.get(position).hideNotify();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        init();
    }

    @Override // androidx.viewpager.widget.ViewPager.InterfaceC1487j
    public void onPageScrollStateChanged(int state) {
    }

    @Override // androidx.viewpager.widget.ViewPager.InterfaceC1487j
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
    }

    @Override // androidx.viewpager.widget.ViewPager.InterfaceC1487j
    public void onPageSelected(int position) {
        resetState();
        this.f18098b.get(position).refreshTab(true);
        InterfaceC2545b interfaceC2545b = this.f18101e;
        if (interfaceC2545b != null) {
            interfaceC2545b.onItemSelected(getBottomItem(position), this.f18099c, position);
        }
        this.f18099c = position;
    }

    public void removeItem(int position) {
        if (position < 0 || position >= this.f18098b.size()) {
            return;
        }
        if (this.f18098b.contains(this.f18098b.get(position))) {
            resetState();
            removeViewAt(position);
            init();
        }
    }

    public void setCurrentItem(int currentItem) {
        ViewPager viewPager = this.f18097a;
        if (viewPager != null) {
            viewPager.setCurrentItem(currentItem, this.f18100d);
            return;
        }
        InterfaceC2545b interfaceC2545b = this.f18101e;
        if (interfaceC2545b != null) {
            interfaceC2545b.onItemSelected(getBottomItem(currentItem), this.f18099c, currentItem);
        }
        updateTabState(currentItem);
    }

    public void setMsg(int position, String msg) {
        this.f18098b.get(position).setMsg(msg);
    }

    public void setOnItemSelectedListener(InterfaceC2545b onItemSelectedListener) {
        this.f18101e = onItemSelectedListener;
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int orientation) {
        super.setOrientation(orientation);
    }

    public void setSmoothScroll(boolean smoothScroll) {
        this.f18100d = smoothScroll;
    }

    public void setUnread(int position, int unreadNum) {
        this.f18098b.get(position).setUnreadNum(unreadNum);
    }

    public void setViewPager(ViewPager viewPager) {
        ebc adapter;
        this.f18097a = viewPager;
        if (viewPager != null && (adapter = viewPager.getAdapter()) != null && adapter.getCount() != getChildCount()) {
            throw new IllegalArgumentException("LinearLayout的子View数量必须和ViewPager条目数量一致");
        }
        ViewPager viewPager2 = this.f18097a;
        if (viewPager2 != null) {
            viewPager2.addOnPageChangeListener(this);
        }
    }

    public void showNotify(int position) {
        this.f18098b.get(position).showNotify();
    }

    public BottomBarLayout(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public BottomBarLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f18098b = new ArrayList();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, C2531R.styleable.BottomBarLayout);
        this.f18100d = typedArrayObtainStyledAttributes.getBoolean(C2531R.styleable.BottomBarLayout_smoothScroll, false);
        typedArrayObtainStyledAttributes.recycle();
    }
}
