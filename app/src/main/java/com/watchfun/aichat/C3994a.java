package com.watchfun.aichat;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.watchfun.transcommon.bean.p012ai.AiModelBean;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p000.C14651wk;
import p000.yrf;

/* JADX INFO: renamed from: com.watchfun.aichat.a */
/* JADX INFO: loaded from: classes6.dex */
public class C3994a extends PopupWindow {

    /* JADX INFO: renamed from: a */
    public RecyclerView f25023a;

    /* JADX INFO: renamed from: b */
    public View f25024b;

    /* JADX INFO: renamed from: c */
    public C14651wk f25025c;

    /* JADX INFO: renamed from: d */
    public View f25026d;

    /* JADX INFO: renamed from: e */
    public int f25027e;

    /* JADX INFO: renamed from: f */
    public c f25028f;

    /* JADX INFO: renamed from: g */
    public List<AiModelBean> f25029g = new ArrayList();

    /* JADX INFO: renamed from: com.watchfun.aichat.a$a */
    public class a implements PopupWindow.OnDismissListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ViewGroup f25030a;

        public a(ViewGroup viewGroup) {
            this.f25030a = viewGroup;
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            C3994a.this.removeMaskView(this.f25030a);
        }
    }

    /* JADX INFO: renamed from: com.watchfun.aichat.a$b */
    public class b implements c {
        public b() {
        }

        @Override // com.watchfun.aichat.C3994a.c
        public void onItemClick(int i, AiModelBean aiModelBean) {
            Iterator it = C3994a.this.f25029g.iterator();
            while (it.hasNext()) {
                ((AiModelBean) it.next()).setSelected(false);
            }
            aiModelBean.setSelected(true);
            C3994a.this.dismiss();
            if (C3994a.this.f25028f != null) {
                C3994a.this.f25028f.onItemClick(i, aiModelBean);
            }
        }
    }

    /* JADX INFO: renamed from: com.watchfun.aichat.a$c */
    public interface c {
        void onItemClick(int i, AiModelBean aiModelBean);
    }

    public C3994a(Context context, ViewGroup viewGroup) {
        this.f25024b = ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(C3993R.layout.pop_window_ai_model, (ViewGroup) null);
        int width = ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getWidth() - (yrf.dp2px(110.0f) * 2);
        this.f25027e = width;
        setWidth(width);
        setHeight(-2);
        setContentView(this.f25024b);
        setBackgroundDrawable(new ColorDrawable(0));
        setOutsideTouchable(true);
        setFocusable(true);
        setOnDismissListener(new a(viewGroup));
        initView(context);
    }

    private void addMaskView(Context context, ViewGroup viewGroup) {
        this.f25026d = new View(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        layoutParams.topMargin = yrf.dp2px(150.0f);
        this.f25026d.setLayoutParams(layoutParams);
        this.f25026d.setBackgroundColor(Color.parseColor("#aa000000"));
        if (viewGroup != null) {
            viewGroup.addView(this.f25026d);
        }
    }

    private void initView(Context context) {
        RecyclerView recyclerView = (RecyclerView) this.f25024b.findViewById(C3993R.id.rv_ai_model);
        this.f25023a = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(context, 1, false));
        C14651wk c14651wk = new C14651wk(new b());
        this.f25025c = c14651wk;
        this.f25023a.setAdapter(c14651wk);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeMaskView(ViewGroup viewGroup) {
        View view = this.f25026d;
        if (view == null || viewGroup == null) {
            return;
        }
        viewGroup.removeView(view);
        this.f25026d = null;
    }

    public int getXOffset(Context context) {
        return (((WindowManager) context.getSystemService("window")).getDefaultDisplay().getWidth() - this.f25027e) / 2;
    }

    public void setData(List<AiModelBean> list) {
        this.f25029g.clear();
        if (list != null) {
            this.f25029g.addAll(list);
        }
        this.f25025c.setDatas(list);
    }

    public void setListener(c cVar) {
        this.f25028f = cVar;
    }
}
