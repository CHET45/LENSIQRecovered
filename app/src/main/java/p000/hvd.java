package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes4.dex */
public class hvd<T> extends RecyclerView {

    /* JADX INFO: renamed from: C */
    public h50 f44966C;

    /* JADX INFO: renamed from: F */
    public int f44967F;

    /* JADX INFO: renamed from: H */
    public int f44968H;

    /* JADX INFO: renamed from: L */
    public int f44969L;

    /* JADX INFO: renamed from: M */
    public ValueAnimator f44970M;

    /* JADX INFO: renamed from: a */
    public mki<T> f44971a;

    /* JADX INFO: renamed from: b */
    public LinearLayoutManager f44972b;

    /* JADX INFO: renamed from: c */
    public int f44973c;

    /* JADX INFO: renamed from: d */
    public int f44974d;

    /* JADX INFO: renamed from: e */
    public h50 f44975e;

    /* JADX INFO: renamed from: f */
    public h50 f44976f;

    /* JADX INFO: renamed from: m */
    public h50 f44977m;

    /* JADX INFO: renamed from: hvd$a */
    public class C7032a implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f44978a;

        public C7032a(final int val$index) {
            this.f44978a = val$index;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator animation) {
            hvd.this.f44972b.scrollToPositionWithOffset(this.f44978a, ((Integer) animation.getAnimatedValue()).intValue());
            hvd.this.refreshScrollTranslate();
        }
    }

    /* JADX INFO: renamed from: hvd$b */
    public class C7033b extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f44980a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ RecyclerView.ViewHolder f44981b;

        public C7033b(final int val$index, final RecyclerView.ViewHolder val$viewHolder) {
            this.f44980a = val$index;
            this.f44981b = val$viewHolder;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            hvd.this.f44969L = this.f44980a;
            int selectedIndex = hvd.this.getSelectedIndex();
            if (hvd.this.f44969L < 0 || selectedIndex < 0) {
                return;
            }
            hvd hvdVar = hvd.this;
            hvdVar.f44971a.mo9241i(this.f44981b, selectedIndex, hvdVar.getSelected());
        }
    }

    /* JADX INFO: renamed from: hvd$c */
    public class C7034c implements h50 {

        /* JADX INFO: renamed from: a */
        public Paint f44983a;

        public C7034c() {
        }

        @Override // p000.h50
        public void onDraw(Context context, Canvas canvas, Rect rect) {
            if (this.f44983a == null) {
                Paint paint = new Paint();
                this.f44983a = paint;
                paint.setAntiAlias(true);
                this.f44983a.setStrokeWidth(f64.dip2px(context, 1.0f));
                this.f44983a.setColor(Color.parseColor("#cdced3"));
            }
            int i = rect.top;
            canvas.drawLine(0.0f, i, rect.right, i, this.f44983a);
            int i2 = rect.bottom;
            canvas.drawLine(0.0f, i2, rect.right, i2, this.f44983a);
        }
    }

    /* JADX INFO: renamed from: hvd$d */
    public class C7035d extends LinearLayoutManager {
        public C7035d(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
        public int scrollVerticallyBy(int dy, RecyclerView.Recycler recycler, RecyclerView.State state) {
            hvd.this.refreshScrollTranslate();
            return super.scrollVerticallyBy(dy, recycler, state);
        }
    }

    /* JADX INFO: renamed from: hvd$e */
    public class C7036e implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a */
        public int f44986a;

        public C7036e() {
            this.f44986a = hvd.this.f44969L - hvd.this.f44971a.f61273b;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator animation) {
            hvd.this.f44972b.scrollToPositionWithOffset(this.f44986a, ((Integer) animation.getAnimatedValue()).intValue());
        }
    }

    public hvd(Context context) {
        super(context);
        this.f44973c = 120;
        this.f44974d = 5;
        C7034c c7034c = new C7034c();
        this.f44975e = c7034c;
        this.f44976f = c7034c;
        this.f44977m = null;
        this.f44966C = null;
        this.f44969L = 0;
        init();
    }

    private final void init() {
        C7035d c7035d = new C7035d(getContext());
        this.f44972b = c7035d;
        setLayoutManager(c7035d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void refreshScrollTranslate() {
        for (int i = 0; i < getChildCount(); i++) {
            m12632f(getChildAt(i));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        Rect rect = new Rect(0, 0, this.f44967F, (this.f44968H / 2) - (this.f44973c / 2));
        Rect rect2 = new Rect(0, new Rect(0, rect.bottom, this.f44967F, (this.f44968H / 2) + (this.f44973c / 2)).bottom, this.f44967F, this.f44968H);
        h50 h50Var = this.f44977m;
        if (h50Var != null) {
            h50Var.onDraw(getContext(), canvas, rect);
        }
        h50 h50Var2 = this.f44966C;
        if (h50Var2 != null) {
            h50Var2.onDraw(getContext(), canvas, rect2);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m12631e(final View v) {
        RecyclerView.ViewHolder childViewHolder = getChildViewHolder(v);
        if (childViewHolder != null) {
            int adapterPosition = childViewHolder.getAdapterPosition();
            int top = (this.f44973c * this.f44971a.f61273b) - v.getTop();
            ValueAnimator valueAnimator = this.f44970M;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.f44970M = ValueAnimator.ofInt(v.getTop(), this.f44971a.f61273b * this.f44973c);
            if (this.f44973c > Math.abs(top)) {
                this.f44970M.setDuration(120L);
            } else {
                this.f44970M.setDuration((long) (((Math.abs(top) / this.f44973c) * 90.0f) + 30.0f));
            }
            this.f44970M.addUpdateListener(new C7032a(adapterPosition));
            this.f44970M.addListener(new C7033b(adapterPosition, childViewHolder));
            this.f44970M.start();
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m12632f(View v) {
        v.getLayoutParams().width = this.f44967F;
        int top = v.getTop();
        int i = (this.f44974d * this.f44973c) / 2;
        float fAbs = Math.abs((i - (top + (r1 / 2))) / (i + (r1 / 2)));
        float f = fAbs > 0.0f ? 1.0f - fAbs : (fAbs + 1.0f) * (-1.0f);
        RecyclerView.ViewHolder childViewHolder = getChildViewHolder(v);
        if (childViewHolder == null || childViewHolder.getItemViewType() == -234234 || childViewHolder.getItemViewType() == -23674632) {
            return;
        }
        this.f44971a.mo17367h(childViewHolder, f);
    }

    public T getSelected() {
        return this.f44971a.mo9240e(getSelectedIndex());
    }

    public int getSelectedIndex() {
        return this.f44971a.m17363a(this.f44969L);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public boolean isAttachedToWindow() {
        boolean zIsAttachedToWindow = super.isAttachedToWindow();
        refreshScrollTranslate();
        return zIsAttachedToWindow;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public void onMeasure(int widthSpec, int heightSpec) {
        if (this.f44967F == 0) {
            this.f44967F = View.MeasureSpec.getSize(widthSpec);
        }
        int i = this.f44973c * this.f44974d;
        this.f44968H = i;
        super.onMeasure(widthSpec, View.MeasureSpec.makeMeasureSpec(i, View.MeasureSpec.getMode(heightSpec)));
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void onScrollStateChanged(int state) {
        View viewFindChildViewUnder;
        ValueAnimator valueAnimator = this.f44970M;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (state == 0 && (viewFindChildViewUnder = findChildViewUnder(getMeasuredWidth() / 2, getMeasuredHeight() / 2)) != null) {
            int adapterPosition = getChildViewHolder(viewFindChildViewUnder).getAdapterPosition();
            this.f44969L = adapterPosition;
            int iComputeVerticalScrollOffset = ((adapterPosition - this.f44971a.f61273b) * this.f44973c) - computeVerticalScrollOffset();
            if (iComputeVerticalScrollOffset != 0) {
                ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(iComputeVerticalScrollOffset, 0);
                this.f44970M = valueAnimatorOfInt;
                valueAnimatorOfInt.setDuration(100L);
                this.f44970M.addUpdateListener(new C7036e());
                this.f44970M.start();
            }
            if (this.f44971a != null) {
                int selectedIndex = getSelectedIndex();
                int i = this.f44969L;
                if (i >= 0 && selectedIndex >= 0) {
                    this.f44971a.mo9241i(getChildViewHolder(this.f44972b.findViewByPosition(i)), selectedIndex, getSelected());
                }
            }
        }
        super.onScrollStateChanged(state);
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View child) {
        super.onViewAdded(child);
        refreshScrollTranslate();
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void scrollToPosition(int position) {
        this.f44972b.scrollToPositionWithOffset(position, 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setAdapter(RecyclerView.Adapter adapter) {
        if (adapter instanceof mki) {
            setAdapter((mki) adapter);
        } else {
            super.setAdapter(adapter);
        }
    }

    public void setDefaultValue(T t) {
        int iMo9238c = this.f44971a.mo9238c(t);
        if (iMo9238c < 0) {
            return;
        }
        this.f44972b.scrollToPositionWithOffset(iMo9238c, 0);
        this.f44969L = iMo9238c + this.f44971a.f61273b;
        refreshScrollTranslate();
    }

    public void setMaxShowSize(int maxShowSize) {
        if (maxShowSize < 1) {
            maxShowSize = 1;
        }
        if (maxShowSize % 2 == 0) {
            maxShowSize++;
        }
        this.f44974d = maxShowSize;
        mki<T> mkiVar = this.f44971a;
        if (mkiVar != null) {
            mkiVar.m17368j(this, this.f44973c, maxShowSize);
            this.f44971a.notifyDataSetChanged();
        }
        if (getLayoutParams() == null) {
            setLayoutParams(new ViewGroup.LayoutParams(-1, maxShowSize * this.f44973c));
        } else {
            getLayoutParams().height = maxShowSize * this.f44973c;
        }
    }

    public void setSelectedAreaDrawer(h50 selectedAreaDrawer) {
        this.f44976f = selectedAreaDrawer;
    }

    public void setSelectedAreaHeight(int selectedAreaHeight) {
        this.f44973c = selectedAreaHeight;
        mki<T> mkiVar = this.f44971a;
        if (mkiVar != null) {
            mkiVar.m17368j(this, selectedAreaHeight, this.f44974d);
            this.f44971a.notifyDataSetChanged();
        }
        if (getLayoutParams() == null) {
            setLayoutParams(new ViewGroup.LayoutParams(-1, this.f44974d * selectedAreaHeight));
        } else {
            getLayoutParams().height = this.f44974d * selectedAreaHeight;
        }
    }

    public void setSelectedBottomAreaDrawer(h50 selectedBottomAreaDrawer) {
        this.f44966C = selectedBottomAreaDrawer;
    }

    public void setSelectedTopAreaDrawer(h50 selectedTopAreaDrawer) {
        this.f44977m = selectedTopAreaDrawer;
    }

    public void setAdapter(mki<T> adapter) {
        this.f44971a = adapter;
        if (adapter != null) {
            adapter.m17368j(this, this.f44973c, this.f44974d);
        }
        super.setAdapter((RecyclerView.Adapter) adapter);
        refreshScrollTranslate();
    }
}
