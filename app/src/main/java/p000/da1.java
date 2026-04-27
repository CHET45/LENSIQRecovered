package p000;

import android.R;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.viewpager.widget.ViewPager;
import com.mylhyl.circledialog.C3860a;
import com.mylhyl.circledialog.params.AdParams;
import java.util.ArrayList;
import java.util.List;
import p000.sf1;

/* JADX INFO: loaded from: classes6.dex */
public final class da1 extends RelativeLayout implements InterfaceC5800fh, ViewPager.InterfaceC1487j {

    /* JADX INFO: renamed from: a */
    public AdParams f28890a;

    /* JADX INFO: renamed from: b */
    public nv7 f28891b;

    /* JADX INFO: renamed from: c */
    public ViewPager f28892c;

    /* JADX INFO: renamed from: d */
    public LinearLayout f28893d;

    /* JADX INFO: renamed from: e */
    public List<View> f28894e;

    /* JADX INFO: renamed from: f */
    public List<String> f28895f;

    /* JADX INFO: renamed from: m */
    public s1c f28896m;

    /* JADX INFO: renamed from: da1$b */
    public class C4683b extends ebc {

        /* JADX INFO: renamed from: da1$b$a */
        public class a implements View.OnClickListener {
            public a() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (da1.this.f28896m != null) {
                    da1.this.f28896m.onItemClick(view, da1.this.f28892c.getCurrentItem() % da1.this.f28894e.size());
                }
            }
        }

        private C4683b() {
        }

        @Override // p000.ebc
        public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        }

        @Override // p000.ebc
        public int getCount() {
            if (da1.this.f28894e == null) {
                return 0;
            }
            return da1.this.f28894e.size();
        }

        @Override // p000.ebc
        public int getItemPosition(Object obj) {
            return -2;
        }

        @Override // p000.ebc
        public Object instantiateItem(ViewGroup viewGroup, int i) {
            if (da1.this.f28894e == null || da1.this.f28894e.get(i) == null) {
                return null;
            }
            int size = i % da1.this.f28894e.size();
            View view = (View) da1.this.f28894e.get(size);
            view.setOnClickListener(new a());
            if (da1.this.f28895f != null && !da1.this.f28895f.isEmpty() && da1.this.f28891b != null) {
                da1.this.f28891b.loadImage(da1.this.getContext(), (ImageView) view, (String) da1.this.f28895f.get(size));
            }
            ViewParent parent = view.getParent();
            if (parent != null) {
                ((ViewGroup) parent).removeView(view);
            }
            viewGroup.addView(view);
            return view;
        }

        @Override // p000.ebc
        public boolean isViewFromObject(View view, Object obj) {
            return view == obj;
        }
    }

    public da1(Context context, AdParams adParams, nv7 nv7Var) {
        super(context);
        this.f28890a = adParams;
        this.f28891b = nv7Var;
        init();
    }

    private void init() {
        initViewPager();
        initIndicator();
    }

    private void initIndicator() {
        if (this.f28890a.f24270c) {
            LinearLayout linearLayout = this.f28893d;
            if (linearLayout != null) {
                linearLayout.removeAllViews();
            }
            LinearLayout linearLayout2 = new LinearLayout(getContext());
            this.f28893d = linearLayout2;
            linearLayout2.setOrientation(0);
            this.f28893d.setGravity(16);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, 80);
            layoutParams.addRule(14);
            layoutParams.addRule(8, R.id.list);
            this.f28893d.setLayoutParams(layoutParams);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
            int iDp2px = C3860a.dp2px(getContext(), this.f28890a.f24272e);
            layoutParams2.setMargins(iDp2px, 0, iDp2px, 0);
            for (int i = 0; i < this.f28894e.size(); i++) {
                ImageView imageView = new ImageView(getContext());
                imageView.setSelected(true);
                imageView.setLayoutParams(layoutParams2);
                int i2 = this.f28890a.f24271d;
                if (i2 != 0) {
                    imageView.setImageResource(i2);
                } else {
                    imageView.setImageDrawable(new sf1.C12552a(-1, 20));
                }
                this.f28893d.addView(imageView);
            }
            addView(this.f28893d);
            pageSelectedToPoint(0);
        }
    }

    private void initViewPager() {
        ari ariVar = new ari(getContext());
        this.f28892c = ariVar;
        ariVar.setId(R.id.list);
        this.f28894e = new ArrayList();
        AdParams adParams = this.f28890a;
        int i = 0;
        if (adParams.f24269b != null) {
            this.f28895f = new ArrayList();
            String[] strArr = this.f28890a.f24269b;
            int length = strArr.length;
            while (i < length) {
                String str = strArr[i];
                ImageView imageView = new ImageView(getContext());
                imageView.setAdjustViewBounds(true);
                this.f28894e.add(imageView);
                this.f28895f.add(str);
                i++;
            }
        } else {
            int[] iArr = adParams.f24268a;
            if (iArr != null) {
                int length2 = iArr.length;
                while (i < length2) {
                    int i2 = iArr[i];
                    ImageView imageView2 = new ImageView(getContext());
                    imageView2.setAdjustViewBounds(true);
                    imageView2.setImageResource(i2);
                    this.f28894e.add(imageView2);
                    i++;
                }
            }
        }
        this.f28892c.setAdapter(new C4683b());
        this.f28892c.addOnPageChangeListener(this);
        this.f28892c.setOverScrollMode(2);
        addView(this.f28892c);
    }

    private void pageSelectedToPoint(int i) {
        LinearLayout linearLayout;
        if (!this.f28890a.f24270c || (linearLayout = this.f28893d) == null) {
            return;
        }
        int childCount = linearLayout.getChildCount();
        int i2 = 0;
        while (i2 < childCount) {
            View childAt = this.f28893d.getChildAt(i2);
            childAt.setSelected(i2 == i);
            childAt.requestLayout();
            i2++;
        }
    }

    @Override // p000.InterfaceC5800fh
    public View getView() {
        return this;
    }

    @Override // androidx.viewpager.widget.ViewPager.InterfaceC1487j
    public void onPageScrollStateChanged(int i) {
    }

    @Override // androidx.viewpager.widget.ViewPager.InterfaceC1487j
    public void onPageScrolled(int i, float f, int i2) {
    }

    @Override // androidx.viewpager.widget.ViewPager.InterfaceC1487j
    public void onPageSelected(int i) {
        pageSelectedToPoint(i % this.f28894e.size());
    }

    @Override // p000.InterfaceC5800fh
    public void regOnImageClickListener(s1c s1cVar) {
        this.f28896m = s1cVar;
    }
}
