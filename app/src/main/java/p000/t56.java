package p000;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes4.dex */
public class t56 {

    /* JADX INFO: renamed from: f */
    public static t56 f83732f;

    /* JADX INFO: renamed from: a */
    public WindowManager f83733a;

    /* JADX INFO: renamed from: b */
    public View f83734b;

    /* JADX INFO: renamed from: c */
    public WeakReference<Context> f83735c;

    /* JADX INFO: renamed from: d */
    public WindowManager.LayoutParams f83736d;

    /* JADX INFO: renamed from: e */
    public s56 f83737e = s56.getInstance();

    /* JADX INFO: renamed from: t56$a */
    public class ViewOnTouchListenerC12913a implements View.OnTouchListener {

        /* JADX INFO: renamed from: a */
        public int f83738a;

        /* JADX INFO: renamed from: b */
        public int f83739b;

        /* JADX INFO: renamed from: c */
        public float f83740c;

        /* JADX INFO: renamed from: d */
        public float f83741d;

        public ViewOnTouchListenerC12913a() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View v, MotionEvent event) {
            int action = event.getAction();
            if (action == 0) {
                this.f83738a = t56.this.f83736d.x;
                this.f83739b = t56.this.f83736d.y;
                this.f83740c = event.getRawX();
                this.f83741d = event.getRawY();
                return true;
            }
            if (action != 2) {
                return false;
            }
            t56.this.f83736d.x = this.f83738a + ((int) (event.getRawX() - this.f83740c));
            t56.this.f83736d.y = this.f83739b + ((int) (event.getRawY() - this.f83741d));
            t56.this.f83733a.updateViewLayout(t56.this.f83734b, t56.this.f83736d);
            return true;
        }
    }

    private t56(Context context) {
        this.f83733a = (WindowManager) context.getSystemService("window");
        this.f83735c = new WeakReference<>(context);
    }

    public static synchronized t56 getInstance(Context context) {
        try {
            if (f83732f == null) {
                f83732f = new t56(context);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f83732f;
    }

    public void close() {
        removeFloatingView();
        f83732f = null;
    }

    public void createFloatingView() {
        if (this.f83734b != null) {
            removeFloatingView();
        }
        this.f83734b = ((LayoutInflater) this.f83735c.get().getSystemService("layout_inflater")).inflate(this.f83737e.getLayoutId(), (ViewGroup) null);
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-2, -2, 2038, 40, -3);
        this.f83736d = layoutParams;
        layoutParams.gravity = 51;
        layoutParams.x = this.f83737e.getxPosition();
        this.f83736d.y = this.f83737e.getyPosition();
        this.f83733a.addView(this.f83734b, this.f83736d);
        setFloatingViewVisibility();
        setDraggable();
    }

    public void removeFloatingView() {
        View view = this.f83734b;
        if (view != null) {
            this.f83733a.removeView(view);
            this.f83734b = null;
        }
    }

    public void setDraggable() {
        if (this.f83734b != null) {
            if (this.f83737e.getDrag().booleanValue()) {
                this.f83734b.setOnTouchListener(new ViewOnTouchListenerC12913a());
            } else {
                this.f83734b.setOnTouchListener(null);
            }
        }
    }

    public void setFloatingViewVisibility() {
        View view = this.f83734b;
        if (view != null) {
            view.setVisibility(this.f83737e.getVisible().booleanValue() ? 0 : 4);
        }
    }

    public void updateFloatingViewPosition() {
        if (this.f83734b != null) {
            this.f83736d.x = this.f83737e.getxPosition();
            this.f83736d.y = this.f83737e.getyPosition();
            this.f83733a.updateViewLayout(this.f83734b, this.f83736d);
        }
    }
}
